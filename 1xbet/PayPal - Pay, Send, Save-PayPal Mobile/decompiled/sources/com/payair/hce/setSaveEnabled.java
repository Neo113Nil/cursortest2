package com.payair.hce;

/* loaded from: classes4.dex */
final class setSaveEnabled implements com.payair.hce.getApplicationInfo {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static boolean RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char[] getAid;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static long getPaymentFci;
    private static boolean getProfileVersion;
    private com.payair.hce.setVerticalScrollBarEnabled AlternateContactlessPaymentDataJson;
    private android.content.Intent DigitizedCardProfile;
    private android.content.Context valueOf;
    private com.payair.hce.setStatusCodeFromServer values = (com.payair.hce.setStatusCodeFromServer) com.payair.hce.checkSelfPermission.writeReplace(new java.lang.Object[0], -1211773049, 1211773049, (int) java.lang.System.currentTimeMillis());
    private com.payair.hce.setSelectedCard writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 4 - (b * 2);
        byte[] bArr = $$g;
        int i5 = s * 3;
        int i6 = (i * 19) + 99;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i4 += i6;
            i3 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i2 + 1;
            i7 = i3;
            i6 = bArr[i3];
            i8 = i9;
            i4 += i6;
            i3 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i4 = i6;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        byte b;
        ?? r7 = 119 - s3;
        int i2 = 79 - s2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[42 - s];
        ?? r5 = 41 - s;
        if (bArr == null) {
            byte b2 = r7;
            int i3 = 0;
            byte b3 = r5;
            i2++;
            ?? r72 = (b3 + b2) - 2;
            i = i3;
            b = r72;
            bArr2[i] = b == true ? (byte) 1 : (byte) 0;
            i3 = i + 1;
            if (i == r5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i2];
            b3 = b;
            i2++;
            ?? r722 = (b3 + b2) - 2;
            i = i3;
            b = r722;
            bArr2[i] = b == true ? (byte) 1 : (byte) 0;
            i3 = i + 1;
            if (i == r5) {
            }
        } else {
            i = 0;
            b = r7;
            bArr2[i] = b == true ? (byte) 1 : (byte) 0;
            i3 = i + 1;
            if (i == r5) {
            }
        }
    }

    private static void d(byte b, int i, int i2, java.lang.Object[] objArr) {
        byte[] bArr = $$d;
        int i3 = i2 + 65;
        int i4 = 754 - i;
        byte[] bArr2 = new byte[b + 6];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = i3 + (-i4) + 1;
            i4 = i4;
        }
        while (true) {
            int i6 = i4 + 1;
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == b + 5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i7;
            i3 = i3 + (-bArr[i6]) + 1;
            i4 = i6;
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i5 | i6;
        int i8 = i6 | i4;
        switch ((i * 193) + (i2 * 193) + ((i4 | (~(i5 | i2))) * (-192)) + (((~i8) | (~i7)) * (-384)) + (((~(i | i8)) | (~(i3 | i7)) | (~(i2 | i | i3))) * 192)) {
            case 1:
                return values(objArr);
            case 2:
                return writeReplace(objArr);
            case 3:
                return valueOf(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return AlternateContactlessPaymentDataJson(objArr);
            case 6:
                return IccPrivateKeyCrtComponentsJson(objArr);
            default:
                com.payair.hce.setSaveEnabled setsaveenabled = (com.payair.hce.setSaveEnabled) objArr[0];
                int i9 = getGpoResponse & 65;
                getCvrMaskAnd = (((((r8 ^ 65) | i9) << 1) - (~(-((r8 | 65) & (~i9))))) - 1) % 128;
                setsaveenabled.values.writeReplace("onTransactionStopped()", new java.lang.Object[0]);
                setsaveenabled.AlternateContactlessPaymentDataJson.DigitizedCardProfile();
                if (((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())) != null) {
                    getCvrMaskAnd = ((-2) - (~(getGpoResponse + 30))) % 128;
                    ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onTransactionStopped();
                    int i10 = getCvrMaskAnd;
                    int i11 = ((i10 ^ 104) + ((i10 & 104) << 1)) - 1;
                    getGpoResponse = i11 % 128;
                    int i12 = i11 % 2;
                }
                int i13 = getCvrMaskAnd;
                int i14 = i13 & 21;
                int i15 = i13 | 21;
                getGpoResponse = ((i14 & i15) + (i15 | i14)) % 128;
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0378  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(char c, int i, int i2, java.lang.Object[] objArr) {
        long j;
        java.lang.Throwable cause;
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        getcvmmodel.valueOf = 0;
        while (true) {
            j = 0;
            if (getcvmmodel.valueOf >= i) {
                break;
            }
            int i3 = $11 + 115;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getAid[getcvmmodel.valueOf * i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 381 - android.graphics.Color.red(0), (char) (62388 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(0, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getPaymentFci), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3967, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 40224))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, android.view.View.MeasureSpec.getMode(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(getAid[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 381 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(0, (short) 0, (byte) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getPaymentFci), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 35, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3966, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 34, 260 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 9) % 128;
        while (getcvmmodel.valueOf < i) {
            int i6 = $11 + 81;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 34, android.widget.ExpandableListView.getPackedPositionChild(j) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) android.widget.ExpandableListView.getPackedPositionGroup(j))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                throw null;
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr11 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj8 == null) {
                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj8);
            }
            ((java.lang.reflect.Method) obj8).invoke(null, objArr11);
            j = 0;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    setSaveEnabled(android.content.Context context, com.payair.hce.setVerticalScrollBarEnabled setverticalscrollbarenabled, android.content.Intent intent) {
        this.AlternateContactlessPaymentDataJson = setverticalscrollbarenabled;
        this.DigitizedCardProfile = intent;
        this.valueOf = context;
    }

    /* renamed from: com.payair.hce.setSaveEnabled$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        private static int AlternateContactlessPaymentDataJson = 1;
        private static int valueOf;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[com.payair.hce.getMDESCardsUniqueTokenReferences.values().length];
            values = iArr;
            try {
                iArr[com.payair.hce.getMDESCardsUniqueTokenReferences.valueOf.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                values[com.payair.hce.getMDESCardsUniqueTokenReferences.values.ordinal()] = 2;
                valueOf = (AlternateContactlessPaymentDataJson + 55) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                values[com.payair.hce.getMDESCardsUniqueTokenReferences.AlternateContactlessPaymentDataJson.ordinal()] = 3;
                int i = valueOf + 1;
                AlternateContactlessPaymentDataJson = i % 128;
                int i2 = i % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                values[com.payair.hce.getMDESCardsUniqueTokenReferences.DigitizedCardProfile.ordinal()] = 4;
                int i3 = AlternateContactlessPaymentDataJson;
                int i4 = i3 & 9;
                int i5 = ((i3 | 9) & (~i4)) + (i4 << 1);
                valueOf = i5 % 128;
                int i6 = i5 % 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                values[com.payair.hce.getMDESCardsUniqueTokenReferences.writeReplace.ordinal()] = 5;
                int i7 = AlternateContactlessPaymentDataJson + 12;
                valueOf = ((~i7) + (i7 << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private static void e(java.lang.String str, int[] iArr, int i, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 87) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = IccPrivateKeyCrtComponentsJson;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 46, 286 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.graphics.Color.blue(0) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 46, 286 - android.text.TextUtils.indexOf("", "", 0, 0), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        long j = 0;
        if (RecordsJson) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.getCapsMode("", 0, 0), 1629 - android.view.View.resolveSize(0, 0), (char) ((android.os.Process.getElapsedCpuTime() > j ? 1 : (android.os.Process.getElapsedCpuTime() == j ? 0 : -1)) - 1));
                    byte b = (byte) ($$h & 3);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(b, b2, b2, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!getProfileVersion) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            $10 = ($11 + 107) % 128;
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1629, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                byte b3 = (byte) ($$h & 3);
                byte b4 = (byte) (b3 - 1);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a(b3, b4, b4, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0353, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0355, code lost:
    
        r4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 33, 4718 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0399, code lost:
    
        r4 = (java.lang.Object[]) ((java.lang.reflect.Method) r4).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x03a1, code lost:
    
        com.payair.hce.setSaveEnabled.getGpoResponse = (com.payair.hce.setSaveEnabled.getCvrMaskAnd + 69) % 128;
        r12 = "";
        r5 = 1;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x25a7, code lost:
    
        if ((r12 + 2012) >= ((java.lang.Long) java.lang.Class.forName(r16).getDeclaredMethod(r11, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0dab, code lost:
    
        if (com.payair.hce.setAllowedHandwritingDelegatorPackage.getAid() != com.payair.hce.reInitialize.DigitizedCardProfile) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x02f2, code lost:
    
        if ((r4 + 1974) >= ((java.lang.Long) java.lang.Class.forName(r16).getDeclaredMethod(r13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x02d2, code lost:
    
        if ((r4 / 1974) >= ((java.lang.Long) java.lang.Class.forName(r16).getDeclaredMethod(r13, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x02f4, code lost:
    
        r4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.util.TypedValue.complexToFloat(r12) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(r12) == 0.0f ? 0 : -1)), (android.util.TypedValue.complexToFloat(r12) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(r12) == 0.0f ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
        r15 = new java.lang.Object[1];
        c((byte) (r11[67] - 1), 69, r11[3], r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0334, code lost:
    
        r5 = new java.lang.Object[]{r4.getField((java.lang.String) r15[0]).get(null), 1392908262, 0};
        r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x151b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x1721  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x18c7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x1c5b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x1f23  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x2358  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x2558  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x2768  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x290b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x2dee  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x2f6b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x2bef  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x2c9c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x27ea  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x2441  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x21ad  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x22a2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x2346  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x1d4b  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x1b01  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x178f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x163a A[Catch: all -> 0x30a2, TryCatch #3 {all -> 0x30a2, blocks: (B:9:0x0334, B:11:0x0355, B:12:0x0399, B:19:0x0514, B:21:0x0530, B:22:0x0572, B:31:0x087f, B:33:0x08a0, B:34:0x08e1, B:35:0x0994, B:83:0x0fac, B:85:0x0fcd, B:86:0x1029, B:87:0x1163, B:89:0x1172, B:90:0x11a3, B:92:0x11bf, B:93:0x11f0, B:97:0x1210, B:99:0x121f, B:100:0x1251, B:102:0x127d, B:103:0x12d3, B:109:0x158d, B:111:0x15ae, B:112:0x15e6, B:118:0x1728, B:120:0x1745, B:121:0x1787, B:129:0x195c, B:131:0x197d, B:132:0x19bb, B:139:0x1c74, B:141:0x1c90, B:142:0x1cd2, B:151:0x1f9d, B:153:0x1fbb, B:154:0x1ffc, B:155:0x20a0, B:163:0x236f, B:165:0x238b, B:166:0x23cd, B:176:0x25e5, B:178:0x2606, B:179:0x2642, B:184:0x2777, B:186:0x2794, B:187:0x27d5, B:194:0x296c, B:196:0x298d, B:197:0x29ce, B:204:0x2ea0, B:206:0x2ebd, B:207:0x2ef9, B:210:0x2f0a, B:212:0x2f27, B:213:0x2f64, B:218:0x2fdd, B:220:0x2ffa, B:221:0x3037, B:262:0x2869, B:264:0x2886, B:265:0x28c3, B:279:0x23de, B:281:0x23fb, B:282:0x2438, B:286:0x24b4, B:288:0x24d1, B:289:0x250c, B:292:0x2044, B:294:0x2062, B:295:0x2099, B:311:0x1ce2, B:313:0x1cff, B:314:0x1d42, B:316:0x1d50, B:318:0x1d63, B:319:0x1d98, B:321:0x1da2, B:323:0x1db5, B:324:0x1dea, B:328:0x1e66, B:330:0x1e83, B:331:0x1ec5, B:350:0x180d, B:352:0x182a, B:353:0x186a, B:355:0x161f, B:357:0x163a, B:358:0x166d, B:366:0x12db, B:368:0x12ea, B:369:0x1319, B:371:0x1345, B:372:0x139d, B:375:0x1409, B:377:0x1418, B:378:0x1449, B:380:0x1475, B:381:0x14d6, B:383:0x104e, B:385:0x1070, B:386:0x10c3, B:412:0x0929, B:414:0x094a, B:415:0x098d, B:439:0x0582, B:441:0x059f, B:442:0x05d9, B:447:0x06ab, B:449:0x06c8, B:450:0x0707, B:455:0x03cd, B:457:0x03f2, B:458:0x044d), top: B:2:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x13a5  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1070 A[Catch: all -> 0x30a2, TryCatch #3 {all -> 0x30a2, blocks: (B:9:0x0334, B:11:0x0355, B:12:0x0399, B:19:0x0514, B:21:0x0530, B:22:0x0572, B:31:0x087f, B:33:0x08a0, B:34:0x08e1, B:35:0x0994, B:83:0x0fac, B:85:0x0fcd, B:86:0x1029, B:87:0x1163, B:89:0x1172, B:90:0x11a3, B:92:0x11bf, B:93:0x11f0, B:97:0x1210, B:99:0x121f, B:100:0x1251, B:102:0x127d, B:103:0x12d3, B:109:0x158d, B:111:0x15ae, B:112:0x15e6, B:118:0x1728, B:120:0x1745, B:121:0x1787, B:129:0x195c, B:131:0x197d, B:132:0x19bb, B:139:0x1c74, B:141:0x1c90, B:142:0x1cd2, B:151:0x1f9d, B:153:0x1fbb, B:154:0x1ffc, B:155:0x20a0, B:163:0x236f, B:165:0x238b, B:166:0x23cd, B:176:0x25e5, B:178:0x2606, B:179:0x2642, B:184:0x2777, B:186:0x2794, B:187:0x27d5, B:194:0x296c, B:196:0x298d, B:197:0x29ce, B:204:0x2ea0, B:206:0x2ebd, B:207:0x2ef9, B:210:0x2f0a, B:212:0x2f27, B:213:0x2f64, B:218:0x2fdd, B:220:0x2ffa, B:221:0x3037, B:262:0x2869, B:264:0x2886, B:265:0x28c3, B:279:0x23de, B:281:0x23fb, B:282:0x2438, B:286:0x24b4, B:288:0x24d1, B:289:0x250c, B:292:0x2044, B:294:0x2062, B:295:0x2099, B:311:0x1ce2, B:313:0x1cff, B:314:0x1d42, B:316:0x1d50, B:318:0x1d63, B:319:0x1d98, B:321:0x1da2, B:323:0x1db5, B:324:0x1dea, B:328:0x1e66, B:330:0x1e83, B:331:0x1ec5, B:350:0x180d, B:352:0x182a, B:353:0x186a, B:355:0x161f, B:357:0x163a, B:358:0x166d, B:366:0x12db, B:368:0x12ea, B:369:0x1319, B:371:0x1345, B:372:0x139d, B:375:0x1409, B:377:0x1418, B:378:0x1449, B:380:0x1475, B:381:0x14d6, B:383:0x104e, B:385:0x1070, B:386:0x10c3, B:412:0x0929, B:414:0x094a, B:415:0x098d, B:439:0x0582, B:441:0x059f, B:442:0x05d9, B:447:0x06ab, B:449:0x06c8, B:450:0x0707, B:455:0x03cd, B:457:0x03f2, B:458:0x044d), top: B:2:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0ca6  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0dde  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0cee  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0cd3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0d3a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0df4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0e5c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0e6f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0ec3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0f40  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x1172 A[Catch: all -> 0x30a2, TryCatch #3 {all -> 0x30a2, blocks: (B:9:0x0334, B:11:0x0355, B:12:0x0399, B:19:0x0514, B:21:0x0530, B:22:0x0572, B:31:0x087f, B:33:0x08a0, B:34:0x08e1, B:35:0x0994, B:83:0x0fac, B:85:0x0fcd, B:86:0x1029, B:87:0x1163, B:89:0x1172, B:90:0x11a3, B:92:0x11bf, B:93:0x11f0, B:97:0x1210, B:99:0x121f, B:100:0x1251, B:102:0x127d, B:103:0x12d3, B:109:0x158d, B:111:0x15ae, B:112:0x15e6, B:118:0x1728, B:120:0x1745, B:121:0x1787, B:129:0x195c, B:131:0x197d, B:132:0x19bb, B:139:0x1c74, B:141:0x1c90, B:142:0x1cd2, B:151:0x1f9d, B:153:0x1fbb, B:154:0x1ffc, B:155:0x20a0, B:163:0x236f, B:165:0x238b, B:166:0x23cd, B:176:0x25e5, B:178:0x2606, B:179:0x2642, B:184:0x2777, B:186:0x2794, B:187:0x27d5, B:194:0x296c, B:196:0x298d, B:197:0x29ce, B:204:0x2ea0, B:206:0x2ebd, B:207:0x2ef9, B:210:0x2f0a, B:212:0x2f27, B:213:0x2f64, B:218:0x2fdd, B:220:0x2ffa, B:221:0x3037, B:262:0x2869, B:264:0x2886, B:265:0x28c3, B:279:0x23de, B:281:0x23fb, B:282:0x2438, B:286:0x24b4, B:288:0x24d1, B:289:0x250c, B:292:0x2044, B:294:0x2062, B:295:0x2099, B:311:0x1ce2, B:313:0x1cff, B:314:0x1d42, B:316:0x1d50, B:318:0x1d63, B:319:0x1d98, B:321:0x1da2, B:323:0x1db5, B:324:0x1dea, B:328:0x1e66, B:330:0x1e83, B:331:0x1ec5, B:350:0x180d, B:352:0x182a, B:353:0x186a, B:355:0x161f, B:357:0x163a, B:358:0x166d, B:366:0x12db, B:368:0x12ea, B:369:0x1319, B:371:0x1345, B:372:0x139d, B:375:0x1409, B:377:0x1418, B:378:0x1449, B:380:0x1475, B:381:0x14d6, B:383:0x104e, B:385:0x1070, B:386:0x10c3, B:412:0x0929, B:414:0x094a, B:415:0x098d, B:439:0x0582, B:441:0x059f, B:442:0x05d9, B:447:0x06ab, B:449:0x06c8, B:450:0x0707, B:455:0x03cd, B:457:0x03f2, B:458:0x044d), top: B:2:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x11bf A[Catch: all -> 0x30a2, TryCatch #3 {all -> 0x30a2, blocks: (B:9:0x0334, B:11:0x0355, B:12:0x0399, B:19:0x0514, B:21:0x0530, B:22:0x0572, B:31:0x087f, B:33:0x08a0, B:34:0x08e1, B:35:0x0994, B:83:0x0fac, B:85:0x0fcd, B:86:0x1029, B:87:0x1163, B:89:0x1172, B:90:0x11a3, B:92:0x11bf, B:93:0x11f0, B:97:0x1210, B:99:0x121f, B:100:0x1251, B:102:0x127d, B:103:0x12d3, B:109:0x158d, B:111:0x15ae, B:112:0x15e6, B:118:0x1728, B:120:0x1745, B:121:0x1787, B:129:0x195c, B:131:0x197d, B:132:0x19bb, B:139:0x1c74, B:141:0x1c90, B:142:0x1cd2, B:151:0x1f9d, B:153:0x1fbb, B:154:0x1ffc, B:155:0x20a0, B:163:0x236f, B:165:0x238b, B:166:0x23cd, B:176:0x25e5, B:178:0x2606, B:179:0x2642, B:184:0x2777, B:186:0x2794, B:187:0x27d5, B:194:0x296c, B:196:0x298d, B:197:0x29ce, B:204:0x2ea0, B:206:0x2ebd, B:207:0x2ef9, B:210:0x2f0a, B:212:0x2f27, B:213:0x2f64, B:218:0x2fdd, B:220:0x2ffa, B:221:0x3037, B:262:0x2869, B:264:0x2886, B:265:0x28c3, B:279:0x23de, B:281:0x23fb, B:282:0x2438, B:286:0x24b4, B:288:0x24d1, B:289:0x250c, B:292:0x2044, B:294:0x2062, B:295:0x2099, B:311:0x1ce2, B:313:0x1cff, B:314:0x1d42, B:316:0x1d50, B:318:0x1d63, B:319:0x1d98, B:321:0x1da2, B:323:0x1db5, B:324:0x1dea, B:328:0x1e66, B:330:0x1e83, B:331:0x1ec5, B:350:0x180d, B:352:0x182a, B:353:0x186a, B:355:0x161f, B:357:0x163a, B:358:0x166d, B:366:0x12db, B:368:0x12ea, B:369:0x1319, B:371:0x1345, B:372:0x139d, B:375:0x1409, B:377:0x1418, B:378:0x1449, B:380:0x1475, B:381:0x14d6, B:383:0x104e, B:385:0x1070, B:386:0x10c3, B:412:0x0929, B:414:0x094a, B:415:0x098d, B:439:0x0582, B:441:0x059f, B:442:0x05d9, B:447:0x06ab, B:449:0x06c8, B:450:0x0707, B:455:0x03cd, B:457:0x03f2, B:458:0x044d), top: B:2:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x11ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.String str;
        com.payair.hce.sendRequest sendrequest;
        int i;
        java.lang.String str2;
        com.payair.hce.setSelectedCard setselectedcard;
        java.lang.String str3;
        byte[] bArr;
        android.content.Context context;
        java.lang.Object[] objArr2;
        java.lang.String str4;
        boolean z;
        char c;
        java.lang.String str5;
        int i2;
        java.lang.String DigitizedCardProfile;
        java.util.Currency currency;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int intValue;
        java.lang.Object obj4;
        long j2;
        java.lang.Object obj5;
        java.lang.Object[] writeReplace$4956fc2a;
        int i4;
        long j3;
        byte b;
        java.lang.String str6;
        android.content.Context context2;
        java.lang.Object[] objArr3;
        int i5;
        char c2;
        int i6;
        long j4;
        byte b2;
        java.lang.String str7;
        android.content.Context context3;
        java.lang.Object[] objArr4;
        java.lang.Object[] objArr5;
        int i7;
        java.lang.String str8;
        long j5;
        java.lang.Object[] objArr6;
        char c3;
        char c4;
        int i8;
        long j6;
        java.lang.String str9;
        android.content.Context context4;
        java.lang.Object[] objArr7;
        java.lang.Long valueOf;
        java.lang.Class cls;
        java.lang.Object obj6;
        int i9;
        int i10;
        java.lang.String str10;
        java.lang.Object invoke;
        int i11;
        java.lang.Object invoke2;
        com.payair.hce.setSaveEnabled setsaveenabled = (com.payair.hce.setSaveEnabled) objArr[0];
        com.payair.hce.sendRequest sendrequest2 = (com.payair.hce.sendRequest) objArr[1];
        com.payair.hce.setSelectedCard setselectedcard2 = (com.payair.hce.setSelectedCard) objArr[2];
        char indexOf = (char) android.text.TextUtils.indexOf("", "", 0);
        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        b(indexOf, ((trimmedLength | 22) << 1) - (trimmedLength ^ 22), android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr8);
        java.lang.String str11 = (java.lang.String) objArr8[0];
        int green = android.graphics.Color.green(0);
        int identityHashCode = java.lang.System.identityHashCode(setsaveenabled);
        int i12 = green * (-958);
        int i13 = ((-28311774) ^ i12) + ((i12 & (-28311774)) << 1);
        int i14 = ~identityHashCode;
        int i15 = ~((i14 & (-29554)) | (i14 ^ (-29554)));
        int i16 = ~green;
        int i17 = ~((i16 ^ identityHashCode) | (i16 & identityHashCode));
        int i18 = ((i15 ^ i17) | (i15 & i17) | (~((i14 ^ green) | (i14 & green)))) * 959;
        int i19 = (i13 & i18) + (i13 | i18);
        int i20 = -(-((~((green ^ 29553) | (green & 29553))) * (-959)));
        int i21 = (i19 & i20) + (i20 | i19);
        int i22 = ~((i14 & i16) | (i16 ^ i14));
        int i23 = ~((identityHashCode & (-29554)) | (identityHashCode ^ (-29554)));
        int i24 = ((~((green ^ identityHashCode) | (green & identityHashCode))) | (i22 & i23) | (i22 ^ i23)) * 959;
        int i25 = -android.graphics.Color.blue(0);
        int i26 = -(-android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        b((char) (((i21 | i24) << 1) - (i24 ^ i21)), (i25 & 15) + (i25 | 15), ((i26 | 22) << 1) - (i26 ^ 22), objArr9);
        java.lang.String str12 = (java.lang.String) objArr9[0];
        int i27 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int identityHashCode2 = java.lang.System.identityHashCode(setsaveenabled);
        int i28 = i27 * (-1529);
        int i29 = ~i27;
        int i30 = ~identityHashCode2;
        int i31 = ~((i29 ^ i30) | (i29 & i30));
        int i32 = ~i29;
        int i33 = i32 | i29;
        int i34 = ~((i33 ^ identityHashCode2) | (i33 & identityHashCode2));
        int i35 = (i31 ^ i34) | (i34 & i31);
        int i36 = ~((i27 ^ identityHashCode2) | (i27 & identityHashCode2));
        int i37 = (((i28 | 764) << 1) - (i28 ^ 764)) + (((i35 ^ i36) | (i35 & i36)) * 765);
        int i38 = -(-(((i32 ^ i31) | (i32 & i31)) * 1530));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        int i40 = ~((i29 ^ identityHashCode2) | (identityHashCode2 & i29));
        int i41 = ~((i27 & i30) | (i27 ^ i30));
        int i42 = ((i40 ^ i41) | (i40 & i41)) * 765;
        char c5 = (char) ((i39 ^ i42) + ((i42 & i39) << 1));
        int i43 = -android.view.View.resolveSize(0, 0);
        int identityHashCode3 = java.lang.System.identityHashCode(setsaveenabled);
        int i44 = i43 * lib.android.paypal.com.magnessdk.g.e;
        int i45 = ~((identityHashCode3 ^ (-17)) | (identityHashCode3 & (-17)));
        int i46 = ~identityHashCode3;
        int i47 = ~(i46 | i43 | 16);
        int i48 = i46 | (-17);
        int i49 = (i44 & 6512) + (i44 | 6512) + (((i45 ^ i47) | (i45 & i47)) * (-406)) + ((~((i48 & i43) | (i48 ^ i43))) * (-406));
        int i50 = -(-(((~((~i43) | identityHashCode3)) | (~((i46 ^ 16) | (i46 & 16)))) * 406));
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b(c5, (i49 & i50) + (i50 | i49), android.view.View.getDefaultSize(0, 0) + 37, objArr10);
        java.lang.String str13 = (java.lang.String) objArr10[0];
        int rgb = android.graphics.Color.rgb(0, 0, 0);
        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
        int identityHashCode4 = java.lang.System.identityHashCode(setsaveenabled);
        int i51 = capsMode * 980;
        int i52 = (i51 ^ (-15648)) + ((i51 & (-15648)) << 1);
        int i53 = ~identityHashCode4;
        int i54 = (~((i53 ^ (-17)) | (i53 & (-17)))) * 979;
        int i55 = (((i52 | i54) << 1) - (i54 ^ i52)) + (((capsMode ^ identityHashCode4) | (capsMode & identityHashCode4)) * (-979));
        int i56 = ~((identityHashCode4 ^ (-17)) | (identityHashCode4 & (-17)));
        int i57 = ~((capsMode & i53) | (i53 ^ capsMode));
        int i58 = -(-(((i56 ^ i57) | (i56 & i57)) * 979));
        int i59 = -android.text.TextUtils.getOffsetBefore("", 0);
        int identityHashCode5 = java.lang.System.identityHashCode(setsaveenabled);
        int i60 = ~i59;
        int i61 = ~((i60 ^ identityHashCode5) | (i60 & identityHashCode5));
        int i62 = ~identityHashCode5;
        int i63 = ~((i62 ^ 53) | (i62 & 53));
        int i64 = (((i59 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - 47859) - (~(-(-(((i61 ^ i63) | (i61 & i63)) * (-1808)))))) - 1;
        int i65 = ~((i60 ^ (-54)) | (i60 & (-54)) | identityHashCode5);
        int i66 = (i59 & i62) | (i62 ^ i59);
        int i67 = ~(i66 | 53);
        int i68 = -(-(((i65 & i67) | (i65 ^ i67)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
        int i69 = ~((i60 ^ 53) | (i60 & 53));
        int i70 = ~((identityHashCode5 & (-54)) | (identityHashCode5 ^ (-54)));
        int i71 = (i70 ^ i69) | (i69 & i70);
        int i72 = ~i66;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        b((char) ((16777216 ^ rgb) + ((rgb & 16777216) << 1)), (i55 ^ i58) + ((i58 & i55) << 1), ((((i64 | i68) << 1) - (i68 ^ i64)) - (~(((i72 ^ i71) | (i71 & i72)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) - 1, objArr11);
        java.lang.String str14 = (java.lang.String) objArr11[0];
        setsaveenabled.values.writeReplace("onContactlessPaymentCompleted() for card %s, transaction ID %s", sendrequest2.AlternateContactlessPaymentDataJson(), com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setselectedcard2.DigitizedCardProfile()).writeReplace());
        setsaveenabled.AlternateContactlessPaymentDataJson.DigitizedCardProfile();
        setsaveenabled.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(setselectedcard2.valueOf());
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.Gravity.getAbsoluteGravity(0, 0), 707 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 34284));
        byte[] bArr2 = $$a;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        c((byte) (bArr2[34] - 1), (short) 75, bArr2[28], objArr12);
        long j7 = cls2.getField((java.lang.String) objArr12[0]).getLong(null);
        try {
            if (j7 != -1) {
                int i73 = getCvrMaskAnd;
                int i74 = (i73 & 45) + (i73 | 45);
                getGpoResponse = i74 % 128;
                int i75 = i74 % 2 == 0 ? 0 : 0;
            }
            java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 0, 1392908262};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
            if (obj7 == null) {
                str = "";
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.Gravity.getAbsoluteGravity(0, 0), 707 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.text.TextUtils.indexOf(str, str, 0, 0) + 34284));
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                c((byte) (bArr2[34] - 1), (short) 75, bArr2[28], objArr14);
                obj7 = cls3.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj7);
            } else {
                str = "";
            }
            java.lang.Object[] objArr15 = (java.lang.Object[]) ((java.lang.reflect.Method) obj7).invoke(null, objArr13);
            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 47, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.view.View.MeasureSpec.getSize(0) + 34284));
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            c((byte) (bArr2[67] - 1), (short) 69, bArr2[3], objArr16);
            cls4.getField((java.lang.String) objArr16[0]).set(null, objArr15);
            try {
                try {
                    long longValue = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str12, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 47, (-16776509) - android.graphics.Color.rgb(0, 0, 0), (char) (34284 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    c((byte) (bArr2[34] - 1), (short) 75, bArr2[28], objArr17);
                    char c6 = 0;
                    cls5.getField((java.lang.String) objArr17[0]).set(null, java.lang.Long.valueOf(longValue));
                    char c7 = 1;
                    int i76 = ((int[]) objArr15[c7])[c6];
                    int i77 = ((int[]) objArr15[c6])[c6];
                    if (i77 == i76) {
                        int i78 = getCvrMaskAnd;
                        int i79 = (i78 ^ 41) + ((i78 & 41) << 1);
                        getGpoResponse = i79 % 128;
                        if (i79 % 2 == 0) {
                            java.lang.Object[] objArr18 = {objArr15, java.lang.Integer.valueOf(((int[]) objArr15[51])[0]), 1};
                            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                            if (obj8 == null) {
                                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4718, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj8);
                            }
                            ((java.lang.reflect.Method) obj8).invoke(null, objArr18);
                        } else {
                            java.lang.Object[] objArr19 = {objArr15, java.lang.Integer.valueOf(((int[]) objArr15[9])[0]), 0};
                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                            if (obj9 == null) {
                                obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.graphics.ImageFormat.getBitsPerPixel(0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 4717, (char) android.text.TextUtils.getCapsMode(str, 0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj9);
                            }
                            ((java.lang.reflect.Method) obj9).invoke(null, objArr19);
                        }
                        sendrequest = sendrequest2;
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add((java.lang.String) objArr15[2]);
                        arrayList.add((java.lang.String) objArr15[3]);
                        arrayList.add((java.lang.String) objArr15[4]);
                        arrayList.add((java.lang.String) objArr15[5]);
                        arrayList.add((java.lang.String) objArr15[6]);
                        arrayList.add((java.lang.String) objArr15[7]);
                        arrayList.add((java.lang.String) objArr15[8]);
                        long j8 = (i76 & (~i77)) | ((~i76) & i77);
                        int i80 = getCvrMaskAnd;
                        int i81 = (((i80 | 61) << 1) - (i80 ^ 61)) % 128;
                        getGpoResponse = i81;
                        getCvrMaskAnd = ((i81 & 9) + (i81 | 9)) % 128;
                        try {
                            java.lang.Object[] objArr20 = {java.lang.Long.valueOf(j8 ^ 4909497173831319552L), 1143081386L};
                            byte b3 = $$d[24];
                            sendrequest = sendrequest2;
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            d(b3, (short) (b3 | 705), r5[63], objArr21);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            d(r5[140], 700, r5[5], objArr22);
                            cls6.getMethod((java.lang.String) objArr22[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr20);
                            java.lang.Object[] objArr23 = {objArr15, java.lang.Integer.valueOf(((int[]) objArr15[9])[0]), 0};
                            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                            if (obj10 == null) {
                                obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4717, (char) android.text.TextUtils.getTrimmedLength(str))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj10);
                            }
                            ((java.lang.reflect.Method) obj10).invoke(null, objArr23);
                            getCvrMaskAnd = (getGpoResponse + 51) % 128;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    setsaveenabled.writeReplace = setselectedcard2;
                    java.lang.String writeReplace = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setselectedcard2.AlternateContactlessPaymentDataJson().values()).writeReplace();
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 1581, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                    c((byte) (bArr2[34] - 1), (short) 75, bArr2[28], objArr24);
                    long j9 = cls7.getField((java.lang.String) objArr24[0]).getLong(null);
                    try {
                        try {
                            try {
                                try {
                                    if (j9 == -1) {
                                        i = 0;
                                    } else if (j9 + 2046 >= ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str12, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                        int identityHashCode6 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i82 = ~identityHashCode6;
                                        int i83 = ~(((-1174145289) & i82) | ((-1174145289) ^ i82));
                                        int i84 = (i83 ^ 82315520) | (82315520 & i83);
                                        int i85 = ~((-619368357) | i82);
                                        int i86 = (-1692953013) - (~(((i84 ^ i85) | (i84 & i85)) * (-1136)));
                                        int i87 = ~(((-1174145289) & identityHashCode6) | ((-1174145289) ^ identityHashCode6));
                                        int i88 = ~((-619368357) | identityHashCode6);
                                        int i89 = (i87 ^ i88) | (i87 & i88);
                                        int i90 = (1174145288 ^ i82) | (1174145288 & i82);
                                        int i91 = ~(619368356 | i90);
                                        int i92 = -(-(((i89 & i91) | (i89 ^ i91)) * (-568)));
                                        int i93 = ((i86 | i92) << 1) - (i92 ^ i86);
                                        int i94 = (~((i82 ^ 619368356) | (619368356 & i82))) | (~i90);
                                        int i95 = ~((identityHashCode6 ^ (-82315521)) | ((-82315521) & identityHashCode6));
                                        int i96 = ((i95 ^ i94) | (i95 & i94)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION;
                                        int identityHashCode7 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i97 = ~identityHashCode7;
                                        int i98 = ((((~((-600507968) | i97)) * 979) + 1956012826) - (~(-(-((((-1292013334) ^ identityHashCode7) | ((-1292013334) & identityHashCode7)) * (-979)))))) - 1;
                                        int i99 = ~(identityHashCode7 | (-600507968));
                                        int i100 = ~((i97 ^ (-1292013334)) | ((-1292013334) & i97));
                                        int i101 = -(-(((i99 ^ i100) | (i99 & i100)) * 979));
                                        if ((i93 ^ i96) + ((i96 & i93) << 1) <= ((i98 | i101) << 1) - (i101 ^ i98)) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.KeyEvent.normalizeMetaState(0), 1582 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.view.KeyEvent.normalizeMetaState(0));
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            c((byte) (-bArr2[116]), (short) 58, (byte) ($$b + 2), objArr25);
                                            java.lang.Object[] objArr26 = {cls8.getField((java.lang.String) objArr25[0]).get(null), 298612186, 0};
                                            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                            if (obj11 == null) {
                                                obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 4904 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf(str, str))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj11);
                                            }
                                            invoke2 = ((java.lang.reflect.Method) obj11).invoke(null, objArr26);
                                        } else {
                                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.KeyEvent.keyCodeFromString(str) + 1581, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                                            c((byte) (-bArr2[116]), (short) 58, (byte) ($$b + 2), objArr27);
                                            java.lang.Object[] objArr28 = {cls9.getField((java.lang.String) objArr27[0]).get(null), 298612186, 0};
                                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                            if (obj12 == null) {
                                                obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength(str) + 34, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4905, (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj12);
                                            }
                                            invoke2 = ((java.lang.reflect.Method) obj12).invoke(null, objArr28);
                                        }
                                        objArr2 = (java.lang.Object[]) invoke2;
                                        str3 = writeReplace;
                                        bArr = bArr2;
                                        str2 = str;
                                        str4 = str12;
                                        setselectedcard = setselectedcard2;
                                        c = 1;
                                        z = false;
                                        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[c])[0]) {
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            arrayList2.add((java.lang.String) objArr2[2]);
                                            arrayList2.add((java.lang.String) objArr2[3]);
                                        }
                                        if (str3.length() != 4) {
                                            i2 = 1;
                                            str5 = str3.substring(1);
                                        } else {
                                            str5 = str3;
                                            i2 = 1;
                                        }
                                        DigitizedCardProfile = com.payair.hce.startInstrumentation.DigitizedCardProfile(str5);
                                        if (DigitizedCardProfile == null) {
                                            int i102 = getGpoResponse;
                                            int i103 = ((i102 | 125) << i2) - (i102 ^ 125);
                                            getCvrMaskAnd = i103 % 128;
                                            if (i103 % 2 != 0) {
                                                java.util.Currency.getInstance(DigitizedCardProfile);
                                                throw null;
                                            }
                                            currency = java.util.Currency.getInstance(DigitizedCardProfile);
                                        } else {
                                            currency = null;
                                        }
                                        java.lang.Long valueOf2 = java.lang.Long.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setselectedcard.AlternateContactlessPaymentDataJson().AlternateContactlessPaymentDataJson()).writeReplace());
                                        setsaveenabled.DigitizedCardProfile.putExtra("amount", valueOf2);
                                        setsaveenabled.DigitizedCardProfile.putExtra("currency", currency);
                                        setsaveenabled.DigitizedCardProfile.putExtra(com.payair.model.PaymentIntentKeys.PARAM_CURRENT, sendrequest.AlternateContactlessPaymentDataJson());
                                        setsaveenabled.DigitizedCardProfile.putExtra(com.payair.model.PaymentIntentKeys.TRANSACTION_OUTCOME, setselectedcard.valueOf().toString());
                                        i3 = com.payair.hce.setSaveEnabled.AnonymousClass2.values[setselectedcard.valueOf().ordinal()];
                                        if (i3 == 1) {
                                            if (i3 == 2) {
                                                setsaveenabled.values.writeReplace("Wallet action is required", new java.lang.Object[0]);
                                                setsaveenabled.DigitizedCardProfile.setAction(com.payair.model.PaymentIntentKeys.ACTION_WALLET_ACTION_REQUIRED);
                                                z3 = false;
                                                z4 = true;
                                            } else if (i3 != 3) {
                                                if (i3 == 4) {
                                                    setsaveenabled.values.writeReplace("Declined by terminal", new java.lang.Object[0]);
                                                    setsaveenabled.DigitizedCardProfile.setAction(com.payair.model.PaymentIntentKeys.ACTION_CONTACTLESS_ERROR);
                                                    if (com.payair.hce.unRegisterDevice.writeReplace == setselectedcard.AlternateContactlessPaymentDataJson().writeReplace()) {
                                                        int i104 = getCvrMaskAnd + 35;
                                                        getGpoResponse = i104 % 128;
                                                        if (i104 % 2 == 0) {
                                                            com.payair.hce.setAllowedHandwritingDelegatorPackage.getAid();
                                                            com.payair.hce.reInitialize reinitialize = com.payair.hce.reInitialize.DigitizedCardProfile;
                                                            throw null;
                                                        }
                                                    }
                                                } else if (i3 != 5) {
                                                    setsaveenabled.values.writeReplace("Transaction outcome was %s", setselectedcard.valueOf());
                                                    setsaveenabled.DigitizedCardProfile.setAction(com.payair.model.PaymentIntentKeys.ACTION_CONTACTLESS_ERROR);
                                                } else {
                                                    setsaveenabled.values.writeReplace("Declined by card", new java.lang.Object[0]);
                                                    setsaveenabled.DigitizedCardProfile.setAction(com.payair.model.PaymentIntentKeys.ACTION_CONTACTLESS_ERROR);
                                                    int i105 = getCvrMaskAnd;
                                                    getGpoResponse = (((i105 | 115) << 1) - (i105 ^ 115)) % 128;
                                                }
                                                z2 = false;
                                                z3 = z2;
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                                setsaveenabled.values.writeReplace("Authenticate offline", new java.lang.Object[0]);
                                                setsaveenabled.DigitizedCardProfile.setAction(com.payair.model.PaymentIntentKeys.ACTION_WALLET_ACTION_REQUIRED);
                                                z3 = true;
                                            }
                                            if (!z4) {
                                                int i106 = getGpoResponse;
                                                int i107 = ((i106 | 23) << 1) - (i106 ^ 23);
                                                getCvrMaskAnd = i107 % 128;
                                                if (i107 % 2 != 0) {
                                                    throw null;
                                                }
                                            }
                                            values(new java.lang.Object[]{setsaveenabled, java.lang.Boolean.valueOf(z4), sendrequest, java.lang.Boolean.valueOf(z3), valueOf2, currency, setselectedcard}, 1907310274, -1907310271, java.lang.System.identityHashCode(setsaveenabled));
                                            com.payair.hce.removeCard AlternateContactlessPaymentDataJson = setselectedcard.AlternateContactlessPaymentDataJson();
                                            if (z3 && AlternateContactlessPaymentDataJson != null) {
                                                int i108 = getGpoResponse;
                                                i11 = ((i108 | 47) << 1) - (i108 ^ 47);
                                                getCvrMaskAnd = i11 % 128;
                                                if (i11 % 2 == 0) {
                                                    values(new java.lang.Object[]{setsaveenabled}, 398167854, -398167848, java.lang.System.identityHashCode(setsaveenabled));
                                                    throw new java.lang.ArithmeticException();
                                                }
                                                values(new java.lang.Object[]{setsaveenabled}, 398167854, -398167848, java.lang.System.identityHashCode(setsaveenabled));
                                                if (((java.lang.Boolean) values(new java.lang.Object[]{AlternateContactlessPaymentDataJson.writeReplace(), AlternateContactlessPaymentDataJson.DigitizedCardProfile()}, -192403123, 192403124, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                                                    getGpoResponse = (getCvrMaskAnd + 81) % 128;
                                                    com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) com.payair.hce.setImportantForAccessibility.DigitizedCardProfile();
                                                    com.payair.hce.setDefaultFocusHighlightEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setdefaultfocushighlightenabled}, -863748824, 863748830, java.lang.System.identityHashCode(setdefaultfocushighlightenabled));
                                                }
                                            }
                                            java.lang.String str15 = str2;
                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.graphics.Color.alpha(0), 753 - android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (45560 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                            byte b4 = (byte) (-bArr[11]);
                                            byte b5 = bArr[21];
                                            int i109 = $$b;
                                            byte b6 = (byte) (i109 + 5);
                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                            c(b4, b5, b6, objArr29);
                                            j = cls10.getField((java.lang.String) objArr29[0]).getLong(null);
                                            if (j != -1) {
                                                getGpoResponse = (getCvrMaskAnd + 65) % 128;
                                                if (j + 2030 >= ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                    getCvrMaskAnd = (getGpoResponse + 39) % 128;
                                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 754 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (45560 - android.graphics.Color.alpha(0)));
                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                    c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr30);
                                                    java.lang.Object[] objArr31 = {cls11.getField((java.lang.String) objArr30[0]).get(null), 1352357408, 0};
                                                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                    if (obj13 == null) {
                                                        obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4790, (char) (31152 - android.graphics.Color.green(0)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, 4750 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33653)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj13);
                                                    }
                                                    obj2 = ((java.lang.reflect.Method) obj13).invoke(null, objArr31);
                                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                    if (obj3 == null) {
                                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 40, 4749 - android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (33701 - android.text.TextUtils.indexOf(str15, str15, 0)))).getMethod("values", null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj3);
                                                    }
                                                    intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj2, null)).intValue();
                                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                    if (obj4 == null) {
                                                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777176) - android.graphics.Color.rgb(0, 0, 0), android.view.View.MeasureSpec.getSize(0) + 4750, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 33701))).getMethod("DigitizedCardProfile", null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj4);
                                                    }
                                                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(obj2, null)).intValue() != intValue) {
                                                        int i110 = getCvrMaskAnd;
                                                        int i111 = ((i110 | 81) << 1) - (i110 ^ 81);
                                                        getGpoResponse = i111 % 128;
                                                        if (i111 % 2 == 0) {
                                                            java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                            if (obj14 == null) {
                                                                obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4749, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 33701))).getMethod("valueOf", null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj14);
                                                            }
                                                            java.lang.Object[] objArr32 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(obj2, null)).intValue()), 0};
                                                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                            if (obj15 == null) {
                                                                obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.view.KeyEvent.keyCodeFromString(str15) + 4790, (char) (31152 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 41, android.view.View.MeasureSpec.getSize(0) + 4750, (char) (33701 - android.text.TextUtils.indexOf(str15, str15, 0, 0))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj15);
                                                            }
                                                            ((java.lang.reflect.Method) obj15).invoke(null, objArr32);
                                                        } else {
                                                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                            if (obj16 == null) {
                                                                obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4750, (char) (android.text.TextUtils.indexOf(str15, str15, 0) + 33701))).getMethod("valueOf", null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj16);
                                                            }
                                                            java.lang.Object[] objArr33 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(obj2, null)).intValue()), 0};
                                                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                            if (obj17 == null) {
                                                                obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 4790 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.View.MeasureSpec.getSize(0) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, android.view.KeyEvent.getDeadChar(0, 0) + 4750, (char) (33701 - android.widget.ExpandableListView.getPackedPositionType(0L))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj17);
                                                            }
                                                            ((java.lang.reflect.Method) obj17).invoke(null, objArr33);
                                                        }
                                                    } else {
                                                        java.lang.Object[] objArr34 = {java.lang.Long.valueOf((intValue ^ r7) ^ (-1370666304880508928L)), -319135166L};
                                                        byte[] bArr3 = $$d;
                                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                        d(bArr3[143], 660, bArr3[63], objArr35);
                                                        java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr35[0]);
                                                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                        d(bArr3[376], 620, bArr3[189], objArr36);
                                                        cls12.getMethod((java.lang.String) objArr36[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr34);
                                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                        if (obj18 == null) {
                                                            obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, 4750 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 33701))).getMethod("valueOf", null);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj18);
                                                        }
                                                        java.lang.Object[] objArr37 = {obj2, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(obj2, null)).intValue()), 0};
                                                        java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                        if (obj19 == null) {
                                                            obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 4789 - android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (31152 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39, android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4751, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33700)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj19);
                                                        }
                                                        ((java.lang.reflect.Method) obj19).invoke(null, objArr37);
                                                    }
                                                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 922, (char) android.view.View.MeasureSpec.getMode(0));
                                                    byte b7 = (byte) (i109 + 2);
                                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                    c((byte) (-bArr[116]), (short) 58, b7, objArr38);
                                                    j2 = cls13.getField((java.lang.String) objArr38[0]).getLong(null);
                                                    if (j2 != -1) {
                                                        getCvrMaskAnd = (getGpoResponse + 43) % 128;
                                                        if (j2 + 1881 >= ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                            getGpoResponse = (getCvrMaskAnd + 47) % 128;
                                                            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 44, 922 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                            c(bArr[34], bArr[37], bArr[28], objArr39);
                                                            java.lang.Object[] objArr40 = {cls14.getField((java.lang.String) objArr39[0]).get(null), 270769150, 0};
                                                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                            if (obj20 == null) {
                                                                obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 45, android.text.TextUtils.getCapsMode(str15, 0, 0) + 4860, (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj20);
                                                            }
                                                            writeReplace$4956fc2a = (java.lang.Object[]) ((java.lang.reflect.Method) obj20).invoke(null, objArr40);
                                                            int i112 = getCvrMaskAnd;
                                                            int i113 = (i112 ^ 25) + ((i112 & 25) << 1);
                                                            getGpoResponse = i113 % 128;
                                                            int i114 = i113 % 2;
                                                            i4 = ((int[]) writeReplace$4956fc2a[1])[0];
                                                            if (((int[]) writeReplace$4956fc2a[0])[0] == i4) {
                                                                java.lang.Object[] objArr41 = {writeReplace$4956fc2a, java.lang.Integer.valueOf(((int[]) writeReplace$4956fc2a[3])[0]), 0};
                                                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                if (obj21 == null) {
                                                                    obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 4860 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj21);
                                                                }
                                                                ((java.lang.reflect.Method) obj21).invoke(null, objArr41);
                                                            } else {
                                                                new java.util.ArrayList().add((java.lang.String) writeReplace$4956fc2a[2]);
                                                                java.lang.Object[] objArr42 = {java.lang.Long.valueOf((-4883436038128664576L) ^ ((i4 | r12) & (~(i4 & r12)))), -1137013554L};
                                                                byte[] bArr4 = $$d;
                                                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                                d((byte) (-bArr4[134]), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_INVALID_REQUEST_ERROR, bArr4[63], objArr43);
                                                                java.lang.Class<?> cls15 = java.lang.Class.forName((java.lang.String) objArr43[0]);
                                                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                                d(bArr4[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr4[43]), objArr44);
                                                                cls15.getMethod((java.lang.String) objArr44[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr42);
                                                                java.lang.Object[] objArr45 = {writeReplace$4956fc2a, java.lang.Integer.valueOf(((int[]) writeReplace$4956fc2a[3])[0]), 0};
                                                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                                if (obj22 == null) {
                                                                    obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 44, android.text.TextUtils.indexOf(str15, str15, 0) + 4860, (char) (android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj22);
                                                                }
                                                                ((java.lang.reflect.Method) obj22).invoke(null, objArr45);
                                                            }
                                                            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.FALSE}, -1511834785, 1511834800, (int) java.lang.System.currentTimeMillis());
                                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 667, (char) (android.graphics.Color.alpha(0) + 40024));
                                                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                                                            c((byte) (-bArr[11]), bArr[21], b6, objArr46);
                                                            j3 = cls16.getField((java.lang.String) objArr46[0]).getLong(null);
                                                            if (j3 != -1) {
                                                                int i115 = getGpoResponse;
                                                                int i116 = ((i115 | 27) << 1) - (i115 ^ 27);
                                                                getCvrMaskAnd = i116 % 128;
                                                                if (i116 % 2 == 0 ? j3 + 1892 >= ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j3 - 1892 >= ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39, 667 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40024));
                                                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                                    c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr47);
                                                                    java.lang.Object[] objArr48 = {cls17.getField((java.lang.String) objArr47[0]).get(null), 1961567294, 0};
                                                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                    if (obj23 == null) {
                                                                        obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 4684 - android.view.View.resolveSize(0, 0), (char) android.view.View.MeasureSpec.getSize(0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj23);
                                                                    }
                                                                    objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj23).invoke(null, objArr48);
                                                                    b = b7;
                                                                    str6 = "valueOf";
                                                                    c2 = 0;
                                                                    i5 = 1;
                                                                    i6 = ((int[]) objArr3[i5])[c2];
                                                                    if (((int[]) objArr3[c2])[c2] != i6) {
                                                                        int i117 = getGpoResponse;
                                                                        int i118 = ((i117 | 37) << i5) - (i117 ^ 37);
                                                                        getCvrMaskAnd = i118 % 128;
                                                                        if (i118 % 2 != 0) {
                                                                            java.lang.Object[] objArr49 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[0]), 0};
                                                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                            if (obj24 == null) {
                                                                                obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 34, 4684 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.os.Process.myPid() >> 22))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj24);
                                                                            }
                                                                            ((java.lang.reflect.Method) obj24).invoke(null, objArr49);
                                                                        } else {
                                                                            java.lang.Object[] objArr50 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[0]), 0};
                                                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                            if (obj25 == null) {
                                                                                obj25 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 4684, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj25);
                                                                            }
                                                                            ((java.lang.reflect.Method) obj25).invoke(null, objArr50);
                                                                        }
                                                                    } else {
                                                                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                        java.lang.Object[] objArr51 = {objArr3};
                                                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                                                        if (obj26 == null) {
                                                                            obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.graphics.Color.red(0) + 4684, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1))).getMethod("values", java.lang.Object[].class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj26);
                                                                        }
                                                                        arrayList3.add(((java.lang.reflect.Method) obj26).invoke(null, objArr51));
                                                                        java.lang.Object[] objArr52 = {objArr3};
                                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                                                        if (obj27 == null) {
                                                                            obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 33, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4684, (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("writeReplace", java.lang.Object[].class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj27);
                                                                        }
                                                                        arrayList3.add(((java.lang.reflect.Method) obj27).invoke(null, objArr52));
                                                                        java.lang.Object[] objArr53 = {java.lang.Long.valueOf((((~i6) & r7) | ((~r7) & i6)) ^ 1257205737210249216L), 292716029L};
                                                                        byte[] bArr5 = $$d;
                                                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                                        d(bArr5[143], my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DUKPT_KEY_INVALID, bArr5[63], objArr54);
                                                                        java.lang.Class<?> cls18 = java.lang.Class.forName((java.lang.String) objArr54[0]);
                                                                        byte b8 = bArr5[35];
                                                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                                        d(b8, (short) (b8 | 474), (byte) ($$e | 16), objArr55);
                                                                        cls18.getMethod((java.lang.String) objArr55[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr53);
                                                                        java.lang.Object[] objArr56 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[0]), 0};
                                                                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                        if (obj28 == null) {
                                                                            obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4683, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj28);
                                                                        }
                                                                        ((java.lang.reflect.Method) obj28).invoke(null, objArr56);
                                                                        int i119 = getGpoResponse;
                                                                        getCvrMaskAnd = (((i119 | 37) << 1) - (i119 ^ 37)) % 128;
                                                                    }
                                                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 584 - android.view.View.resolveSize(0, 0), (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                                    c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr57);
                                                                    j4 = cls19.getField((java.lang.String) objArr57[0]).getLong(null);
                                                                    if (j4 != -1) {
                                                                        int i120 = getGpoResponse;
                                                                        getCvrMaskAnd = ((i120 & 33) + (i120 | 33)) % 128;
                                                                        if (j4 + 1928 >= ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                            int i121 = getGpoResponse;
                                                                            int i122 = (i121 ^ 89) + ((i121 & 89) << 1);
                                                                            getCvrMaskAnd = i122 % 128;
                                                                            if (i122 % 2 != 0) {
                                                                                java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str15, str15, 0, 0) + 51, android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24290 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                                                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                                                c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr58);
                                                                                java.lang.Object[] objArr59 = {cls20.getField((java.lang.String) objArr58[0]).get(null), 1497262055, 0};
                                                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                if (obj29 == null) {
                                                                                    str10 = str6;
                                                                                    obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4829, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod(str10, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj29);
                                                                                } else {
                                                                                    str10 = str6;
                                                                                }
                                                                                invoke = ((java.lang.reflect.Method) obj29).invoke(null, objArr59);
                                                                            } else {
                                                                                str10 = str6;
                                                                                java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 51, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 584, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 24291));
                                                                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                                                c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr60);
                                                                                java.lang.Object[] objArr61 = {cls21.getField((java.lang.String) objArr60[0]).get(null), 1497262055, 0};
                                                                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                if (obj30 == null) {
                                                                                    obj30 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 30, 4829 - android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.blue(0))).getMethod(str10, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj30);
                                                                                }
                                                                                invoke = ((java.lang.reflect.Method) obj30).invoke(null, objArr61);
                                                                            }
                                                                            objArr5 = (java.lang.Object[]) invoke;
                                                                            str7 = str10;
                                                                            b2 = b6;
                                                                            objArr4 = objArr5;
                                                                            i7 = ((int[]) objArr4[1])[0];
                                                                            if (((int[]) objArr4[0])[0] == i7) {
                                                                                int i123 = getGpoResponse;
                                                                                int i124 = (i123 & 111) + (i123 | 111);
                                                                                getCvrMaskAnd = i124 % 128;
                                                                                if (i124 % 2 != 0) {
                                                                                    java.lang.Object[] objArr62 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[2])[1]), 1};
                                                                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj31 == null) {
                                                                                        str8 = str7;
                                                                                        obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str15, 0) + 30, android.graphics.Color.red(0) + 4830, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1))).getMethod(str8, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj31);
                                                                                    } else {
                                                                                        str8 = str7;
                                                                                    }
                                                                                    ((java.lang.reflect.Method) obj31).invoke(null, objArr62);
                                                                                } else {
                                                                                    str8 = str7;
                                                                                    java.lang.Object[] objArr63 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[3])[0]), 0};
                                                                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                    if (obj32 == null) {
                                                                                        obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str15, str15, 0, 0) + 30, (android.os.Process.myPid() >> 22) + 4830, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod(str8, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj32);
                                                                                    }
                                                                                    ((java.lang.reflect.Method) obj32).invoke(null, objArr63);
                                                                                }
                                                                            } else {
                                                                                str8 = str7;
                                                                                java.lang.Object[] objArr64 = {java.lang.Long.valueOf((((~i7) & r8) | (i7 & (~r8))) ^ 8942633114459439104L), 2082119028L};
                                                                                byte[] bArr6 = $$d;
                                                                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                                                d(bArr6[283], 430, bArr6[63], objArr65);
                                                                                java.lang.Class<?> cls22 = java.lang.Class.forName((java.lang.String) objArr65[0]);
                                                                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                                                d(bArr6[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr6[43]), objArr66);
                                                                                cls22.getMethod((java.lang.String) objArr66[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr64);
                                                                                java.lang.Object[] objArr67 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[3])[0]), 0};
                                                                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                if (obj33 == null) {
                                                                                    obj33 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.MotionEvent.axisFromString(str15), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 4830, (char) android.view.View.resolveSize(0, 0))).getMethod(str8, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj33);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj33).invoke(null, objArr67);
                                                                            }
                                                                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.resolveSizeAndState(0, 0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 583, (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                                                            java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                                            byte b9 = b2;
                                                                            c((byte) (-bArr[11]), bArr[21], b9, objArr68);
                                                                            j5 = cls23.getField((java.lang.String) objArr68[0]).getLong(null);
                                                                            try {
                                                                                if (j5 != -1) {
                                                                                    int i125 = getCvrMaskAnd;
                                                                                    int i126 = (i125 ^ 75) + ((i125 & 75) << 1);
                                                                                    getGpoResponse = i126 % 128;
                                                                                    if (i126 % 2 != 0) {
                                                                                        i10 = 0;
                                                                                    } else if (j5 * 2012 >= ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                                        i10 = 0;
                                                                                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.MeasureSpec.getSize(i10), android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i10) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24291 - android.text.TextUtils.indexOf(str15, str15)));
                                                                                        byte b10 = bArr[3];
                                                                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                                                        c(b10, b10, bArr[34], objArr69);
                                                                                        java.lang.Object[] objArr70 = {cls24.getField((java.lang.String) objArr69[0]).get(null), 1144029906, 0};
                                                                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                        if (obj34 == null) {
                                                                                            obj34 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 30, 4829 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod(str8, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj34);
                                                                                        }
                                                                                        objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) obj34).invoke(null, objArr70);
                                                                                        c4 = 0;
                                                                                        c3 = 1;
                                                                                        i8 = ((int[]) objArr6[c3])[c4];
                                                                                        if (((int[]) objArr6[c4])[c4] != i8) {
                                                                                            getGpoResponse = (getCvrMaskAnd + 45) % 128;
                                                                                            int i127 = ((int[]) objArr6[3])[c4];
                                                                                            java.lang.Object[] objArr71 = new java.lang.Object[3];
                                                                                            objArr71[2] = 0;
                                                                                            objArr71[1] = java.lang.Integer.valueOf(i127);
                                                                                            objArr71[c4] = objArr6;
                                                                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                            if (obj35 == null) {
                                                                                                obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('N' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 4830 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod(str8, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj35);
                                                                                            }
                                                                                            ((java.lang.reflect.Method) obj35).invoke(null, objArr71);
                                                                                            int i128 = getGpoResponse;
                                                                                            getCvrMaskAnd = (((i128 | 5) << 1) - (i128 ^ 5)) % 128;
                                                                                        } else {
                                                                                            new java.util.ArrayList().add((java.lang.String) objArr6[2]);
                                                                                            java.lang.Object[] objArr72 = {java.lang.Long.valueOf(((i8 & (~r8)) | ((~i8) & r8)) ^ 4112756375073849344L), 957575730L};
                                                                                            byte[] bArr7 = $$d;
                                                                                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                                                            d(bArr7[376], (short) ($$e | com.visa.cbp.getCertUsage.setAucAID), bArr7[63], objArr73);
                                                                                            java.lang.Class<?> cls25 = java.lang.Class.forName((java.lang.String) objArr73[0]);
                                                                                            java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                                                            d(bArr7[376], 620, bArr7[189], objArr74);
                                                                                            cls25.getMethod((java.lang.String) objArr74[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr72);
                                                                                            java.lang.Object[] objArr75 = {objArr6, java.lang.Integer.valueOf(((int[]) objArr6[3])[0]), 0};
                                                                                            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                            if (obj36 == null) {
                                                                                                obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 4830 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod(str8, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj36);
                                                                                            }
                                                                                            ((java.lang.reflect.Method) obj36).invoke(null, objArr75);
                                                                                        }
                                                                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf(str15, str15, 0, 0) + 584, (char) (24291 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)));
                                                                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                                                        byte b11 = b;
                                                                                        c((byte) (-bArr[116]), (short) 58, b11, objArr76);
                                                                                        j6 = cls26.getField((java.lang.String) objArr76[0]).getLong(null);
                                                                                        if (j6 != -1 || j6 + 1859 < ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                                            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                                            int identityHashCode8 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                            int i129 = mirror * 65327;
                                                                                            int i130 = (i129 ^ 10032) + ((i129 & 10032) << 1);
                                                                                            int i131 = ~mirror;
                                                                                            int i132 = (~((i131 ^ 47) | (i131 & 47))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                                                                            int i133 = ~identityHashCode8;
                                                                                            int i134 = (i130 ^ i132) + ((i130 & i132) << 1) + (((~((i133 ^ 47) | (i133 & 47))) | (~(i131 | identityHashCode8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                                                                                            int i135 = (i131 ^ i133) | (i131 & i133);
                                                                                            int i136 = ~((i135 ^ (-48)) | (i135 & (-48)));
                                                                                            int i137 = (mirror ^ kotlinx.io.files.FileSystemKt.UnixPathSeparator) | (mirror & kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                                                                                            int i138 = ~((identityHashCode8 ^ i137) | (i137 & identityHashCode8));
                                                                                            int i139 = -(-(((i138 ^ i136) | (i138 & i136)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                                                            char c8 = (char) ((i134 ^ i139) + ((i139 & i134) << 1));
                                                                                            int i140 = -(android.os.Process.myPid() >> 22);
                                                                                            int identityHashCode9 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                            int i141 = ~i140;
                                                                                            int i142 = ~identityHashCode9;
                                                                                            int i143 = ~((i142 & i141) | (i141 ^ i142));
                                                                                            int i144 = ~((i141 ^ 26) | (i141 & 26));
                                                                                            int i145 = (i143 ^ i144) | (i143 & i144);
                                                                                            int i146 = ~((i142 ^ 26) | (i142 & 26));
                                                                                            int i147 = -(-(((i146 ^ i145) | (i145 & i146)) * (-397)));
                                                                                            int i148 = (identityHashCode9 ^ i144) | (identityHashCode9 & i144);
                                                                                            int i149 = ~((i140 & (-27)) | (i140 ^ (-27)));
                                                                                            int capsMode2 = android.text.TextUtils.getCapsMode(str15, 0, 0);
                                                                                            int identityHashCode10 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                            str9 = str8;
                                                                                            int i150 = capsMode2 * (-1335);
                                                                                            int i151 = (i150 ^ (-46023)) + ((i150 & (-46023)) << 1);
                                                                                            int i152 = ~((capsMode2 ^ identityHashCode10) | (capsMode2 & identityHashCode10));
                                                                                            int i153 = ((i152 & (-70)) | (i152 ^ (-70))) * (-668);
                                                                                            int i154 = ((i151 | i153) << 1) - (i153 ^ i151);
                                                                                            int i155 = ~((identityHashCode10 ^ (-70)) | (identityHashCode10 & (-70)));
                                                                                            int i156 = -(-(((i155 & capsMode2) | (i155 ^ capsMode2)) * 1336));
                                                                                            int i157 = (i154 ^ i156) + ((i156 & i154) << 1);
                                                                                            int i158 = capsMode2 | identityHashCode10;
                                                                                            int i159 = ((i158 ^ (-70)) | (i158 & (-70))) * 668;
                                                                                            java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                                                            b(c8, ((((((i140 * 398) - 10296) - (~i147)) - 1) + ((~(i141 | 26)) * (-397))) - (~(((i148 ^ i149) | (i149 & i148)) * 397))) - 1, ((i157 | i159) << 1) - (i159 ^ i157), objArr77);
                                                                                            java.lang.Class<?> cls27 = java.lang.Class.forName((java.lang.String) objArr77[0]);
                                                                                            int i160 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                                            int identityHashCode11 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                            int i161 = i160 * (-813);
                                                                                            int i162 = (4971072 ^ i161) + ((i161 & 4971072) << 1);
                                                                                            int i163 = ~((i160 ^ (-12185)) | (i160 & (-12185)));
                                                                                            int i164 = ~((i160 ^ identityHashCode11) | (i160 & identityHashCode11));
                                                                                            int i165 = -(-(((i163 ^ i164) | (i163 & i164)) * (-814)));
                                                                                            int i166 = ~identityHashCode11;
                                                                                            int i167 = ~((i166 ^ (-12185)) | (i166 & (-12185)));
                                                                                            int i168 = ~i160;
                                                                                            int i169 = ~((i168 & 12184) | (i168 ^ 12184));
                                                                                            int i170 = (i167 ^ i169) | (i167 & i169);
                                                                                            int i171 = ~(i168 | identityHashCode11);
                                                                                            int i172 = (i171 ^ i169) | (i171 & i169);
                                                                                            int i173 = ~((identityHashCode11 ^ 12184) | (identityHashCode11 & 12184));
                                                                                            char c9 = (char) (((((i162 ^ i165) + ((i165 & i162) << 1)) + (((i170 & i164) | (i170 ^ i164)) * 407)) - (~(((i172 ^ i173) | (i172 & i173)) * 407))) - 1);
                                                                                            int lastIndexOf = android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                                            int identityHashCode12 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                            int i174 = (lastIndexOf * (-1965)) + 18696;
                                                                                            int i175 = -(-(((lastIndexOf ^ (-20)) | (lastIndexOf & (-20))) * 983));
                                                                                            int i176 = (i174 & i175) + (i174 | i175);
                                                                                            int i177 = ~lastIndexOf;
                                                                                            int i178 = ~identityHashCode12;
                                                                                            int i179 = ~(i178 | (-20));
                                                                                            int i180 = ((i179 ^ i177) | (i179 & i177)) * (-983);
                                                                                            int i181 = ((i176 | i180) << 1) - (i180 ^ i176);
                                                                                            int i182 = ~((i178 ^ i177) | (i178 & i177));
                                                                                            int i183 = ~((i177 ^ 19) | (i177 & 19));
                                                                                            int i184 = ((i182 ^ i183) | (i183 & i182)) * 983;
                                                                                            int i185 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                                            int identityHashCode13 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                            int i186 = i185 * (-520);
                                                                                            int i187 = (49590 & i186) + (i186 | 49590);
                                                                                            int i188 = ~i185;
                                                                                            int i189 = (i188 & 95) | (i188 ^ 95);
                                                                                            int i190 = (~((i189 ^ identityHashCode13) | (i189 & identityHashCode13))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                                            int i191 = (i187 ^ i190) + ((i187 & i190) << 1);
                                                                                            int i192 = (~(i185 | (-96))) * (-1042);
                                                                                            int i193 = (~identityHashCode13) | i188;
                                                                                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                                                            b(c9, ((i181 | i184) << 1) - (i184 ^ i181), (((i191 & i192) + (i191 | i192)) - (~(-(-(((~((i185 ^ (-96)) | (i185 & (-96)))) | (~((i193 ^ 95) | (i193 & 95)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))))) - 1, objArr78);
                                                                                            context4 = (android.content.Context) cls27.getMethod((java.lang.String) objArr78[0], new java.lang.Class[0]).invoke(null, null);
                                                                                            if (context4 != null) {
                                                                                                int i194 = getGpoResponse;
                                                                                                getCvrMaskAnd = ((i194 ^ 51) + ((i194 & 51) << 1)) % 128;
                                                                                                context4 = context4.getApplicationContext();
                                                                                            }
                                                                                            java.lang.Object[] objArr79 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 671573304};
                                                                                            byte[] bArr8 = $$d;
                                                                                            java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                                                            d((byte) 67, com.visa.cbp.getCertUsage.getODAData, bArr8[63], objArr80);
                                                                                            java.lang.Class<?> cls28 = java.lang.Class.forName((java.lang.String) objArr80[0]);
                                                                                            byte b12 = bArr8[189];
                                                                                            java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                                                            d(b12, (short) (b12 | 261), (byte) ($$e | 16), objArr81);
                                                                                            java.lang.String str16 = (java.lang.String) objArr81[0];
                                                                                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                                                            e(null, null, android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr82);
                                                                                            objArr7 = (java.lang.Object[]) cls28.getMethod(str16, java.lang.Class.forName((java.lang.String) objArr82[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr79);
                                                                                            if (context4 != null) {
                                                                                                int i195 = getGpoResponse;
                                                                                                int i196 = (i195 & 85) + (i195 | 85);
                                                                                                getCvrMaskAnd = i196 % 128;
                                                                                                try {
                                                                                                    if (i196 % 2 != 0) {
                                                                                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.graphics.Color.green(0), android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24291));
                                                                                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                                                                        c(bArr[34], bArr[37], bArr[28], objArr83);
                                                                                                        cls29.getField((java.lang.String) objArr83[0]).set(null, objArr7);
                                                                                                        valueOf = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue());
                                                                                                        cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 51, android.graphics.ImageFormat.getBitsPerPixel(0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) ((-16752925) - android.graphics.Color.rgb(0, 0, 0)));
                                                                                                        java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                                                                        c((byte) (-bArr[116]), (short) 58, b11, objArr84);
                                                                                                        obj6 = objArr84[0];
                                                                                                    } else {
                                                                                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf(str15, str15, 0) + 584, (char) (24291 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)));
                                                                                                        java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                                                                        c(bArr[34], bArr[37], bArr[28], objArr85);
                                                                                                        cls30.getField((java.lang.String) objArr85[0]).set(null, objArr7);
                                                                                                        valueOf = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                                                                                        cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.getCapsMode(str15, 0, 0), 584 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (24291 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                                                                                                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                                                        c((byte) (-bArr[116]), (short) 58, b11, objArr86);
                                                                                                        obj6 = objArr86[0];
                                                                                                    }
                                                                                                    cls.getField((java.lang.String) obj6).set(null, valueOf);
                                                                                                } catch (java.lang.Exception unused) {
                                                                                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 584 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (24291 - android.graphics.Color.blue(0)));
                                                                                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                                                            c(bArr[34], bArr[37], bArr[28], objArr87);
                                                                                            java.lang.Object[] objArr88 = {cls31.getField((java.lang.String) objArr87[0]).get(null), 671573304, 0};
                                                                                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                            if (obj37 == null) {
                                                                                                obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31, 4830 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod(str8, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj37);
                                                                                            }
                                                                                            objArr7 = (java.lang.Object[]) ((java.lang.reflect.Method) obj37).invoke(null, objArr88);
                                                                                            str9 = str8;
                                                                                        }
                                                                                        i9 = ((int[]) objArr7[1])[0];
                                                                                        if (((int[]) objArr7[0])[0] == i9) {
                                                                                            java.lang.String str17 = str9;
                                                                                            java.lang.Object[] objArr89 = {java.lang.Long.valueOf((i9 ^ r5) ^ 7492318187262836736L), 1744440754L};
                                                                                            byte[] bArr9 = $$d;
                                                                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                                            d(bArr9[376], (short) ($$e | com.visa.cbp.getCertUsage.setAucAID), bArr9[63], objArr90);
                                                                                            java.lang.Class<?> cls32 = java.lang.Class.forName((java.lang.String) objArr90[0]);
                                                                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                                            d(bArr9[376], 620, bArr9[189], objArr91);
                                                                                            cls32.getMethod((java.lang.String) objArr91[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr89);
                                                                                            java.lang.Object[] objArr92 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[0]), 0};
                                                                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                            if (obj38 == null) {
                                                                                                obj38 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 30, 4830 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod(str17, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj38);
                                                                                            }
                                                                                            ((java.lang.reflect.Method) obj38).invoke(null, objArr92);
                                                                                            return null;
                                                                                        }
                                                                                        int identityHashCode14 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                        int i197 = ~(((-1485541936) ^ identityHashCode14) | ((-1485541936) & identityHashCode14));
                                                                                        int i198 = (((i197 ^ 578030800) | (578030800 & i197)) * (-196)) - 1903451723;
                                                                                        int identityHashCode15 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                        int i199 = ~identityHashCode15;
                                                                                        int i200 = (((~((2107897927 ^ i199) | (2107897927 & i199))) | (~((687645999 & i199) | (687645999 ^ i199)))) * (-867)) + 124392736;
                                                                                        int i201 = ~((2107897927 & identityHashCode15) | (2107897927 ^ identityHashCode15));
                                                                                        int i202 = ((i201 ^ (-2113928560)) | ((-2113928560) & i201) | (~((687645999 & identityHashCode15) | (687645999 ^ identityHashCode15)))) * (-1734);
                                                                                        int i203 = (i200 ^ i202) + ((i200 & i202) << 1);
                                                                                        int i204 = ~((i199 ^ 2113928559) | (2113928559 & i199));
                                                                                        int i205 = ~(((-6030633) & identityHashCode15) | ((-6030633) ^ identityHashCode15));
                                                                                        int i206 = (i204 ^ i205) | (i204 & i205);
                                                                                        int i207 = ~((identityHashCode15 ^ (-1426282561)) | ((-1426282561) & identityHashCode15));
                                                                                        int i208 = -(-(((i207 ^ i206) | (i207 & i206)) * 867));
                                                                                        if ((((1929103976 | i198) << 1) - (i198 ^ 1929103976)) + (((~(identityHashCode14 | (-1485541936))) | (-2063572736)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE) <= (i203 & i208) + (i208 | i203)) {
                                                                                            java.lang.Object[] objArr93 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[1]), 1};
                                                                                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                            if (obj39 == null) {
                                                                                                obj39 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 4830 - android.text.TextUtils.getCapsMode(str15, 0, 0), (char) android.graphics.Color.blue(0))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj39);
                                                                                            }
                                                                                            ((java.lang.reflect.Method) obj39).invoke(null, objArr93);
                                                                                            return null;
                                                                                        }
                                                                                        java.lang.String str18 = str9;
                                                                                        java.lang.Object[] objArr94 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[0]), 0};
                                                                                        java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                                        if (obj40 == null) {
                                                                                            obj40 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 4829 - android.view.MotionEvent.axisFromString(str15), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod(str18, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj40);
                                                                                        }
                                                                                        ((java.lang.reflect.Method) obj40).invoke(null, objArr94);
                                                                                        return null;
                                                                                    }
                                                                                }
                                                                                long longValue2 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, android.text.TextUtils.indexOf(str15, str15, 0) + 584, (char) (24291 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                                                                                c3 = 1;
                                                                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                                c((byte) (-bArr[11]), bArr[21], b9, objArr95);
                                                                                c4 = 0;
                                                                                cls33.getField((java.lang.String) objArr95[0]).set(null, java.lang.Long.valueOf(longValue2));
                                                                                i8 = ((int[]) objArr6[c3])[c4];
                                                                                if (((int[]) objArr6[c4])[c4] != i8) {
                                                                                }
                                                                                java.lang.Class cls262 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf(str15, str15, 0, 0) + 584, (char) (24291 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)));
                                                                                java.lang.Object[] objArr762 = new java.lang.Object[1];
                                                                                byte b112 = b;
                                                                                c((byte) (-bArr[116]), (short) 58, b112, objArr762);
                                                                                j6 = cls262.getField((java.lang.String) objArr762[0]).getLong(null);
                                                                                if (j6 != -1) {
                                                                                }
                                                                                char mirror2 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                                int identityHashCode82 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                int i1292 = mirror2 * 65327;
                                                                                int i1302 = (i1292 ^ 10032) + ((i1292 & 10032) << 1);
                                                                                int i1312 = ~mirror2;
                                                                                int i1322 = (~((i1312 ^ 47) | (i1312 & 47))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                                                                int i1332 = ~identityHashCode82;
                                                                                int i1342 = (i1302 ^ i1322) + ((i1302 & i1322) << 1) + (((~((i1332 ^ 47) | (i1332 & 47))) | (~(i1312 | identityHashCode82))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                                                                                int i1352 = (i1312 ^ i1332) | (i1312 & i1332);
                                                                                int i1362 = ~((i1352 ^ (-48)) | (i1352 & (-48)));
                                                                                int i1372 = (mirror2 ^ kotlinx.io.files.FileSystemKt.UnixPathSeparator) | (mirror2 & kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                                                                                int i1382 = ~((identityHashCode82 ^ i1372) | (i1372 & identityHashCode82));
                                                                                int i1392 = -(-(((i1382 ^ i1362) | (i1382 & i1362)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                                                char c82 = (char) ((i1342 ^ i1392) + ((i1392 & i1342) << 1));
                                                                                int i1402 = -(android.os.Process.myPid() >> 22);
                                                                                int identityHashCode92 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                int i1412 = ~i1402;
                                                                                int i1422 = ~identityHashCode92;
                                                                                int i1432 = ~((i1422 & i1412) | (i1412 ^ i1422));
                                                                                int i1442 = ~((i1412 ^ 26) | (i1412 & 26));
                                                                                int i1452 = (i1432 ^ i1442) | (i1432 & i1442);
                                                                                int i1462 = ~((i1422 ^ 26) | (i1422 & 26));
                                                                                int i1472 = -(-(((i1462 ^ i1452) | (i1452 & i1462)) * (-397)));
                                                                                int i1482 = (identityHashCode92 ^ i1442) | (identityHashCode92 & i1442);
                                                                                int i1492 = ~((i1402 & (-27)) | (i1402 ^ (-27)));
                                                                                int capsMode22 = android.text.TextUtils.getCapsMode(str15, 0, 0);
                                                                                int identityHashCode102 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                str9 = str8;
                                                                                int i1502 = capsMode22 * (-1335);
                                                                                int i1512 = (i1502 ^ (-46023)) + ((i1502 & (-46023)) << 1);
                                                                                int i1522 = ~((capsMode22 ^ identityHashCode102) | (capsMode22 & identityHashCode102));
                                                                                int i1532 = ((i1522 & (-70)) | (i1522 ^ (-70))) * (-668);
                                                                                int i1542 = ((i1512 | i1532) << 1) - (i1532 ^ i1512);
                                                                                int i1552 = ~((identityHashCode102 ^ (-70)) | (identityHashCode102 & (-70)));
                                                                                int i1562 = -(-(((i1552 & capsMode22) | (i1552 ^ capsMode22)) * 1336));
                                                                                int i1572 = (i1542 ^ i1562) + ((i1562 & i1542) << 1);
                                                                                int i1582 = capsMode22 | identityHashCode102;
                                                                                int i1592 = ((i1582 ^ (-70)) | (i1582 & (-70))) * 668;
                                                                                java.lang.Object[] objArr772 = new java.lang.Object[1];
                                                                                b(c82, ((((((i1402 * 398) - 10296) - (~i1472)) - 1) + ((~(i1412 | 26)) * (-397))) - (~(((i1482 ^ i1492) | (i1492 & i1482)) * 397))) - 1, ((i1572 | i1592) << 1) - (i1592 ^ i1572), objArr772);
                                                                                java.lang.Class<?> cls272 = java.lang.Class.forName((java.lang.String) objArr772[0]);
                                                                                int i1602 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                                int identityHashCode112 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                int i1612 = i1602 * (-813);
                                                                                int i1622 = (4971072 ^ i1612) + ((i1612 & 4971072) << 1);
                                                                                int i1632 = ~((i1602 ^ (-12185)) | (i1602 & (-12185)));
                                                                                int i1642 = ~((i1602 ^ identityHashCode112) | (i1602 & identityHashCode112));
                                                                                int i1652 = -(-(((i1632 ^ i1642) | (i1632 & i1642)) * (-814)));
                                                                                int i1662 = ~identityHashCode112;
                                                                                int i1672 = ~((i1662 ^ (-12185)) | (i1662 & (-12185)));
                                                                                int i1682 = ~i1602;
                                                                                int i1692 = ~((i1682 & 12184) | (i1682 ^ 12184));
                                                                                int i1702 = (i1672 ^ i1692) | (i1672 & i1692);
                                                                                int i1712 = ~(i1682 | identityHashCode112);
                                                                                int i1722 = (i1712 ^ i1692) | (i1712 & i1692);
                                                                                int i1732 = ~((identityHashCode112 ^ 12184) | (identityHashCode112 & 12184));
                                                                                char c92 = (char) (((((i1622 ^ i1652) + ((i1652 & i1622) << 1)) + (((i1702 & i1642) | (i1702 ^ i1642)) * 407)) - (~(((i1722 ^ i1732) | (i1722 & i1732)) * 407))) - 1);
                                                                                int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                                int identityHashCode122 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                int i1742 = (lastIndexOf2 * (-1965)) + 18696;
                                                                                int i1752 = -(-(((lastIndexOf2 ^ (-20)) | (lastIndexOf2 & (-20))) * 983));
                                                                                int i1762 = (i1742 & i1752) + (i1742 | i1752);
                                                                                int i1772 = ~lastIndexOf2;
                                                                                int i1782 = ~identityHashCode122;
                                                                                int i1792 = ~(i1782 | (-20));
                                                                                int i1802 = ((i1792 ^ i1772) | (i1792 & i1772)) * (-983);
                                                                                int i1812 = ((i1762 | i1802) << 1) - (i1802 ^ i1762);
                                                                                int i1822 = ~((i1782 ^ i1772) | (i1782 & i1772));
                                                                                int i1832 = ~((i1772 ^ 19) | (i1772 & 19));
                                                                                int i1842 = ((i1822 ^ i1832) | (i1832 & i1822)) * 983;
                                                                                int i1852 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                                int identityHashCode132 = java.lang.System.identityHashCode(setsaveenabled);
                                                                                int i1862 = i1852 * (-520);
                                                                                int i1872 = (49590 & i1862) + (i1862 | 49590);
                                                                                int i1882 = ~i1852;
                                                                                int i1892 = (i1882 & 95) | (i1882 ^ 95);
                                                                                int i1902 = (~((i1892 ^ identityHashCode132) | (i1892 & identityHashCode132))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                                int i1912 = (i1872 ^ i1902) + ((i1872 & i1902) << 1);
                                                                                int i1922 = (~(i1852 | (-96))) * (-1042);
                                                                                int i1932 = (~identityHashCode132) | i1882;
                                                                                java.lang.Object[] objArr782 = new java.lang.Object[1];
                                                                                b(c92, ((i1812 | i1842) << 1) - (i1842 ^ i1812), (((i1912 & i1922) + (i1912 | i1922)) - (~(-(-(((~((i1852 ^ (-96)) | (i1852 & (-96)))) | (~((i1932 ^ 95) | (i1932 & 95)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))))) - 1, objArr782);
                                                                                context4 = (android.content.Context) cls272.getMethod((java.lang.String) objArr782[0], new java.lang.Class[0]).invoke(null, null);
                                                                                if (context4 != null) {
                                                                                }
                                                                                java.lang.Object[] objArr792 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 671573304};
                                                                                byte[] bArr82 = $$d;
                                                                                java.lang.Object[] objArr802 = new java.lang.Object[1];
                                                                                d((byte) 67, com.visa.cbp.getCertUsage.getODAData, bArr82[63], objArr802);
                                                                                java.lang.Class<?> cls282 = java.lang.Class.forName((java.lang.String) objArr802[0]);
                                                                                byte b122 = bArr82[189];
                                                                                java.lang.Object[] objArr812 = new java.lang.Object[1];
                                                                                d(b122, (short) (b122 | 261), (byte) ($$e | 16), objArr812);
                                                                                java.lang.String str162 = (java.lang.String) objArr812[0];
                                                                                java.lang.Object[] objArr822 = new java.lang.Object[1];
                                                                                e(null, null, android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr822);
                                                                                objArr7 = (java.lang.Object[]) cls282.getMethod(str162, java.lang.Class.forName((java.lang.String) objArr822[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr792);
                                                                                if (context4 != null) {
                                                                                }
                                                                                i9 = ((int[]) objArr7[1])[0];
                                                                                if (((int[]) objArr7[0])[0] == i9) {
                                                                                }
                                                                            } catch (java.lang.Exception unused2) {
                                                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                            }
                                                                            java.lang.Object[] objArr96 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1144029906};
                                                                            byte[] bArr10 = $$d;
                                                                            java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                            d(bArr10[154], 408, bArr10[63], objArr97);
                                                                            java.lang.Class<?> cls34 = java.lang.Class.forName((java.lang.String) objArr97[0]);
                                                                            java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                                            d(bArr10[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr10[43]), objArr98);
                                                                            objArr6 = (java.lang.Object[]) cls34.getMethod((java.lang.String) objArr98[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr96);
                                                                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 584, (char) (android.graphics.Color.blue(0) + 24291));
                                                                            byte b13 = bArr[3];
                                                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                            c(b13, b13, bArr[34], objArr99);
                                                                            cls35.getField((java.lang.String) objArr99[0]).set(null, objArr6);
                                                                        }
                                                                    }
                                                                    char keyRepeatDelay = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                    int i209 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                    int identityHashCode16 = java.lang.System.identityHashCode(setsaveenabled);
                                                                    int i210 = ~i209;
                                                                    int i211 = ~identityHashCode16;
                                                                    int i212 = (i210 & (-28)) | (i210 ^ (-28));
                                                                    int i213 = ~((i212 ^ identityHashCode16) | (i212 & identityHashCode16));
                                                                    int i214 = (i211 ^ i209) | (i211 & i209);
                                                                    int i215 = ~((i214 ^ 27) | (i214 & 27));
                                                                    b2 = b6;
                                                                    str7 = str6;
                                                                    int i216 = ((i209 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - 24381) + (((~((i211 ^ 27) | (i211 & 27))) | (~(i210 | identityHashCode16))) * (-1808)) + (((i213 ^ i215) | (i215 & i213)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                                                                    int i217 = (~(i210 | 27)) | (~((identityHashCode16 & (-28)) | (identityHashCode16 ^ (-28))));
                                                                    int i218 = ~(i209 | i211);
                                                                    int i219 = -(-(((i218 ^ i217) | (i217 & i218)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                                                                    int i220 = -android.text.TextUtils.indexOf(str15, str15);
                                                                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                    b(keyRepeatDelay, (i216 & i219) + (i216 | i219), ((i220 | 69) << 1) - (i220 ^ 69), objArr100);
                                                                    java.lang.Class<?> cls36 = java.lang.Class.forName((java.lang.String) objArr100[0]);
                                                                    int i221 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                    int identityHashCode17 = java.lang.System.identityHashCode(setsaveenabled);
                                                                    int i222 = i221 * 714;
                                                                    int i223 = ((-8675008) ^ i222) + ((i222 & (-8675008)) << 1);
                                                                    int i224 = ~i221;
                                                                    int i225 = ~identityHashCode17;
                                                                    int i226 = ~((i224 & i225) | (i224 ^ i225));
                                                                    int i227 = ~((i224 ^ 12184) | (i224 & 12184));
                                                                    int i228 = -(-(((i227 ^ i226) | (i226 & i227) | (~(i221 | (-12185) | identityHashCode17))) * (-713)));
                                                                    int i229 = (i223 ^ i228) + ((i228 & i223) << 1);
                                                                    int i230 = (~((i221 ^ (-12185)) | (i221 & (-12185)) | identityHashCode17)) * 1426;
                                                                    int i231 = ((i229 | i230) << 1) - (i230 ^ i229);
                                                                    int i232 = (~(i225 | (-12185))) * 713;
                                                                    char c10 = (char) ((i231 ^ i232) + ((i232 & i231) << 1));
                                                                    int i233 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                                    int indexOf2 = android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                                    b(c10, (i233 ^ 18) + ((i233 & 18) << 1), (indexOf2 ^ 96) + ((indexOf2 & 96) << 1), objArr101);
                                                                    context3 = (android.content.Context) cls36.getMethod((java.lang.String) objArr101[0], new java.lang.Class[0]).invoke(null, null);
                                                                    if (context3 != null) {
                                                                        getGpoResponse = (getCvrMaskAnd + 5) % 128;
                                                                        context3 = context3.getApplicationContext();
                                                                    }
                                                                    java.lang.Object[] objArr102 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1497262055};
                                                                    byte[] bArr11 = $$d;
                                                                    byte b14 = bArr11[63];
                                                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                    d(b14, 469, b14, objArr103);
                                                                    java.lang.Class<?> cls37 = java.lang.Class.forName((java.lang.String) objArr103[0]);
                                                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                    d(bArr11[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr11[43]), objArr104);
                                                                    java.lang.String str19 = (java.lang.String) objArr104[0];
                                                                    int i234 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                                    int i235 = (i234 * (-51)) + 6678;
                                                                    int i236 = ~java.lang.System.identityHashCode(setsaveenabled);
                                                                    int i237 = (i236 ^ i234) | (i236 & i234);
                                                                    int i238 = -(-((~((i237 & 126) | (i237 ^ 126))) * 52));
                                                                    int i239 = (i235 ^ i238) + ((i235 & i238) << 1);
                                                                    int i240 = (~(i236 | androidx.compose.runtime.ComposerKt.defaultsKey)) | (~((i234 ^ androidx.compose.runtime.ComposerKt.defaultsKey) | (i234 & androidx.compose.runtime.ComposerKt.defaultsKey)));
                                                                    int i241 = ~(i236 | i234);
                                                                    int i242 = ((i240 & i241) | (i240 ^ i241)) * (-52);
                                                                    int i243 = ((i239 | i242) << 1) - (i242 ^ i239);
                                                                    int i244 = ~i234;
                                                                    int i245 = ~((i236 & i244) | (i244 ^ i236));
                                                                    int i246 = ~((i244 ^ 126) | (i244 & 126));
                                                                    int i247 = -(-(((i246 ^ i245) | (i246 & i245)) * 52));
                                                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                    e(null, null, (i243 & i247) + (i247 | i243), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr105);
                                                                    objArr4 = (java.lang.Object[]) cls37.getMethod(str19, java.lang.Class.forName((java.lang.String) objArr105[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr102);
                                                                    if (context3 == null) {
                                                                        java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 583, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 24291));
                                                                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                        c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr106);
                                                                        cls38.getField((java.lang.String) objArr106[0]).set(null, objArr4);
                                                                        try {
                                                                            long longValue3 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                            java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf(str15, str15, 0, 0), 584 - android.text.TextUtils.getTrimmedLength(str15), (char) (24291 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                                                                            java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                            c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr107);
                                                                            cls39.getField((java.lang.String) objArr107[0]).set(null, java.lang.Long.valueOf(longValue3));
                                                                            i7 = ((int[]) objArr4[1])[0];
                                                                            if (((int[]) objArr4[0])[0] == i7) {
                                                                            }
                                                                            java.lang.Class cls232 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.resolveSizeAndState(0, 0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 583, (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                                                            java.lang.Object[] objArr682 = new java.lang.Object[1];
                                                                            byte b92 = b2;
                                                                            c((byte) (-bArr[11]), bArr[21], b92, objArr682);
                                                                            j5 = cls232.getField((java.lang.String) objArr682[0]).getLong(null);
                                                                            if (j5 != -1) {
                                                                            }
                                                                            java.lang.Object[] objArr962 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1144029906};
                                                                            byte[] bArr102 = $$d;
                                                                            java.lang.Object[] objArr972 = new java.lang.Object[1];
                                                                            d(bArr102[154], 408, bArr102[63], objArr972);
                                                                            java.lang.Class<?> cls342 = java.lang.Class.forName((java.lang.String) objArr972[0]);
                                                                            java.lang.Object[] objArr982 = new java.lang.Object[1];
                                                                            d(bArr102[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr102[43]), objArr982);
                                                                            objArr6 = (java.lang.Object[]) cls342.getMethod((java.lang.String) objArr982[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr962);
                                                                            java.lang.Class cls352 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 584, (char) (android.graphics.Color.blue(0) + 24291));
                                                                            byte b132 = bArr[3];
                                                                            java.lang.Object[] objArr992 = new java.lang.Object[1];
                                                                            c(b132, b132, bArr[34], objArr992);
                                                                            cls352.getField((java.lang.String) objArr992[0]).set(null, objArr6);
                                                                            long longValue22 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                            java.lang.Class cls332 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, android.text.TextUtils.indexOf(str15, str15, 0) + 584, (char) (24291 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                                                                            c3 = 1;
                                                                            java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                                            c((byte) (-bArr[11]), bArr[21], b92, objArr952);
                                                                            c4 = 0;
                                                                            cls332.getField((java.lang.String) objArr952[0]).set(null, java.lang.Long.valueOf(longValue22));
                                                                            i8 = ((int[]) objArr6[c3])[c4];
                                                                            if (((int[]) objArr6[c4])[c4] != i8) {
                                                                            }
                                                                            java.lang.Class cls2622 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf(str15, str15, 0, 0) + 584, (char) (24291 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)));
                                                                            java.lang.Object[] objArr7622 = new java.lang.Object[1];
                                                                            byte b1122 = b;
                                                                            c((byte) (-bArr[116]), (short) 58, b1122, objArr7622);
                                                                            j6 = cls2622.getField((java.lang.String) objArr7622[0]).getLong(null);
                                                                            if (j6 != -1) {
                                                                            }
                                                                            char mirror22 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                            int identityHashCode822 = java.lang.System.identityHashCode(setsaveenabled);
                                                                            int i12922 = mirror22 * 65327;
                                                                            int i13022 = (i12922 ^ 10032) + ((i12922 & 10032) << 1);
                                                                            int i13122 = ~mirror22;
                                                                            int i13222 = (~((i13122 ^ 47) | (i13122 & 47))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                                                            int i13322 = ~identityHashCode822;
                                                                            int i13422 = (i13022 ^ i13222) + ((i13022 & i13222) << 1) + (((~((i13322 ^ 47) | (i13322 & 47))) | (~(i13122 | identityHashCode822))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                                                                            int i13522 = (i13122 ^ i13322) | (i13122 & i13322);
                                                                            int i13622 = ~((i13522 ^ (-48)) | (i13522 & (-48)));
                                                                            int i13722 = (mirror22 ^ kotlinx.io.files.FileSystemKt.UnixPathSeparator) | (mirror22 & kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                                                                            int i13822 = ~((identityHashCode822 ^ i13722) | (i13722 & identityHashCode822));
                                                                            int i13922 = -(-(((i13822 ^ i13622) | (i13822 & i13622)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                                            char c822 = (char) ((i13422 ^ i13922) + ((i13922 & i13422) << 1));
                                                                            int i14022 = -(android.os.Process.myPid() >> 22);
                                                                            int identityHashCode922 = java.lang.System.identityHashCode(setsaveenabled);
                                                                            int i14122 = ~i14022;
                                                                            int i14222 = ~identityHashCode922;
                                                                            int i14322 = ~((i14222 & i14122) | (i14122 ^ i14222));
                                                                            int i14422 = ~((i14122 ^ 26) | (i14122 & 26));
                                                                            int i14522 = (i14322 ^ i14422) | (i14322 & i14422);
                                                                            int i14622 = ~((i14222 ^ 26) | (i14222 & 26));
                                                                            int i14722 = -(-(((i14622 ^ i14522) | (i14522 & i14622)) * (-397)));
                                                                            int i14822 = (identityHashCode922 ^ i14422) | (identityHashCode922 & i14422);
                                                                            int i14922 = ~((i14022 & (-27)) | (i14022 ^ (-27)));
                                                                            int capsMode222 = android.text.TextUtils.getCapsMode(str15, 0, 0);
                                                                            int identityHashCode1022 = java.lang.System.identityHashCode(setsaveenabled);
                                                                            str9 = str8;
                                                                            int i15022 = capsMode222 * (-1335);
                                                                            int i15122 = (i15022 ^ (-46023)) + ((i15022 & (-46023)) << 1);
                                                                            int i15222 = ~((capsMode222 ^ identityHashCode1022) | (capsMode222 & identityHashCode1022));
                                                                            int i15322 = ((i15222 & (-70)) | (i15222 ^ (-70))) * (-668);
                                                                            int i15422 = ((i15122 | i15322) << 1) - (i15322 ^ i15122);
                                                                            int i15522 = ~((identityHashCode1022 ^ (-70)) | (identityHashCode1022 & (-70)));
                                                                            int i15622 = -(-(((i15522 & capsMode222) | (i15522 ^ capsMode222)) * 1336));
                                                                            int i15722 = (i15422 ^ i15622) + ((i15622 & i15422) << 1);
                                                                            int i15822 = capsMode222 | identityHashCode1022;
                                                                            int i15922 = ((i15822 ^ (-70)) | (i15822 & (-70))) * 668;
                                                                            java.lang.Object[] objArr7722 = new java.lang.Object[1];
                                                                            b(c822, ((((((i14022 * 398) - 10296) - (~i14722)) - 1) + ((~(i14122 | 26)) * (-397))) - (~(((i14822 ^ i14922) | (i14922 & i14822)) * 397))) - 1, ((i15722 | i15922) << 1) - (i15922 ^ i15722), objArr7722);
                                                                            java.lang.Class<?> cls2722 = java.lang.Class.forName((java.lang.String) objArr7722[0]);
                                                                            int i16022 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                            int identityHashCode1122 = java.lang.System.identityHashCode(setsaveenabled);
                                                                            int i16122 = i16022 * (-813);
                                                                            int i16222 = (4971072 ^ i16122) + ((i16122 & 4971072) << 1);
                                                                            int i16322 = ~((i16022 ^ (-12185)) | (i16022 & (-12185)));
                                                                            int i16422 = ~((i16022 ^ identityHashCode1122) | (i16022 & identityHashCode1122));
                                                                            int i16522 = -(-(((i16322 ^ i16422) | (i16322 & i16422)) * (-814)));
                                                                            int i16622 = ~identityHashCode1122;
                                                                            int i16722 = ~((i16622 ^ (-12185)) | (i16622 & (-12185)));
                                                                            int i16822 = ~i16022;
                                                                            int i16922 = ~((i16822 & 12184) | (i16822 ^ 12184));
                                                                            int i17022 = (i16722 ^ i16922) | (i16722 & i16922);
                                                                            int i17122 = ~(i16822 | identityHashCode1122);
                                                                            int i17222 = (i17122 ^ i16922) | (i17122 & i16922);
                                                                            int i17322 = ~((identityHashCode1122 ^ 12184) | (identityHashCode1122 & 12184));
                                                                            char c922 = (char) (((((i16222 ^ i16522) + ((i16522 & i16222) << 1)) + (((i17022 & i16422) | (i17022 ^ i16422)) * 407)) - (~(((i17222 ^ i17322) | (i17222 & i17322)) * 407))) - 1);
                                                                            int lastIndexOf22 = android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                            int identityHashCode1222 = java.lang.System.identityHashCode(setsaveenabled);
                                                                            int i17422 = (lastIndexOf22 * (-1965)) + 18696;
                                                                            int i17522 = -(-(((lastIndexOf22 ^ (-20)) | (lastIndexOf22 & (-20))) * 983));
                                                                            int i17622 = (i17422 & i17522) + (i17422 | i17522);
                                                                            int i17722 = ~lastIndexOf22;
                                                                            int i17822 = ~identityHashCode1222;
                                                                            int i17922 = ~(i17822 | (-20));
                                                                            int i18022 = ((i17922 ^ i17722) | (i17922 & i17722)) * (-983);
                                                                            int i18122 = ((i17622 | i18022) << 1) - (i18022 ^ i17622);
                                                                            int i18222 = ~((i17822 ^ i17722) | (i17822 & i17722));
                                                                            int i18322 = ~((i17722 ^ 19) | (i17722 & 19));
                                                                            int i18422 = ((i18222 ^ i18322) | (i18322 & i18222)) * 983;
                                                                            int i18522 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                            int identityHashCode1322 = java.lang.System.identityHashCode(setsaveenabled);
                                                                            int i18622 = i18522 * (-520);
                                                                            int i18722 = (49590 & i18622) + (i18622 | 49590);
                                                                            int i18822 = ~i18522;
                                                                            int i18922 = (i18822 & 95) | (i18822 ^ 95);
                                                                            int i19022 = (~((i18922 ^ identityHashCode1322) | (i18922 & identityHashCode1322))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                            int i19122 = (i18722 ^ i19022) + ((i18722 & i19022) << 1);
                                                                            int i19222 = (~(i18522 | (-96))) * (-1042);
                                                                            int i19322 = (~identityHashCode1322) | i18822;
                                                                            java.lang.Object[] objArr7822 = new java.lang.Object[1];
                                                                            b(c922, ((i18122 | i18422) << 1) - (i18422 ^ i18122), (((i19122 & i19222) + (i19122 | i19222)) - (~(-(-(((~((i18522 ^ (-96)) | (i18522 & (-96)))) | (~((i19322 ^ 95) | (i19322 & 95)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))))) - 1, objArr7822);
                                                                            context4 = (android.content.Context) cls2722.getMethod((java.lang.String) objArr7822[0], new java.lang.Class[0]).invoke(null, null);
                                                                            if (context4 != null) {
                                                                            }
                                                                            java.lang.Object[] objArr7922 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 671573304};
                                                                            byte[] bArr822 = $$d;
                                                                            java.lang.Object[] objArr8022 = new java.lang.Object[1];
                                                                            d((byte) 67, com.visa.cbp.getCertUsage.getODAData, bArr822[63], objArr8022);
                                                                            java.lang.Class<?> cls2822 = java.lang.Class.forName((java.lang.String) objArr8022[0]);
                                                                            byte b1222 = bArr822[189];
                                                                            java.lang.Object[] objArr8122 = new java.lang.Object[1];
                                                                            d(b1222, (short) (b1222 | 261), (byte) ($$e | 16), objArr8122);
                                                                            java.lang.String str1622 = (java.lang.String) objArr8122[0];
                                                                            java.lang.Object[] objArr8222 = new java.lang.Object[1];
                                                                            e(null, null, android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr8222);
                                                                            objArr7 = (java.lang.Object[]) cls2822.getMethod(str1622, java.lang.Class.forName((java.lang.String) objArr8222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr7922);
                                                                            if (context4 != null) {
                                                                            }
                                                                            i9 = ((int[]) objArr7[1])[0];
                                                                            if (((int[]) objArr7[0])[0] == i9) {
                                                                            }
                                                                        } catch (java.lang.Exception unused3) {
                                                                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                        }
                                                                    } else {
                                                                        objArr5 = objArr4;
                                                                        objArr4 = objArr5;
                                                                        i7 = ((int[]) objArr4[1])[0];
                                                                        if (((int[]) objArr4[0])[0] == i7) {
                                                                        }
                                                                        java.lang.Class cls2322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.resolveSizeAndState(0, 0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 583, (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                                                        java.lang.Object[] objArr6822 = new java.lang.Object[1];
                                                                        byte b922 = b2;
                                                                        c((byte) (-bArr[11]), bArr[21], b922, objArr6822);
                                                                        j5 = cls2322.getField((java.lang.String) objArr6822[0]).getLong(null);
                                                                        if (j5 != -1) {
                                                                        }
                                                                        java.lang.Object[] objArr9622 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1144029906};
                                                                        byte[] bArr1022 = $$d;
                                                                        java.lang.Object[] objArr9722 = new java.lang.Object[1];
                                                                        d(bArr1022[154], 408, bArr1022[63], objArr9722);
                                                                        java.lang.Class<?> cls3422 = java.lang.Class.forName((java.lang.String) objArr9722[0]);
                                                                        java.lang.Object[] objArr9822 = new java.lang.Object[1];
                                                                        d(bArr1022[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr1022[43]), objArr9822);
                                                                        objArr6 = (java.lang.Object[]) cls3422.getMethod((java.lang.String) objArr9822[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr9622);
                                                                        java.lang.Class cls3522 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 584, (char) (android.graphics.Color.blue(0) + 24291));
                                                                        byte b1322 = bArr[3];
                                                                        java.lang.Object[] objArr9922 = new java.lang.Object[1];
                                                                        c(b1322, b1322, bArr[34], objArr9922);
                                                                        cls3522.getField((java.lang.String) objArr9922[0]).set(null, objArr6);
                                                                        long longValue222 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                        java.lang.Class cls3322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, android.text.TextUtils.indexOf(str15, str15, 0) + 584, (char) (24291 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                                                                        c3 = 1;
                                                                        java.lang.Object[] objArr9522 = new java.lang.Object[1];
                                                                        c((byte) (-bArr[11]), bArr[21], b922, objArr9522);
                                                                        c4 = 0;
                                                                        cls3322.getField((java.lang.String) objArr9522[0]).set(null, java.lang.Long.valueOf(longValue222));
                                                                        i8 = ((int[]) objArr6[c3])[c4];
                                                                        if (((int[]) objArr6[c4])[c4] != i8) {
                                                                        }
                                                                        java.lang.Class cls26222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf(str15, str15, 0, 0) + 584, (char) (24291 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)));
                                                                        java.lang.Object[] objArr76222 = new java.lang.Object[1];
                                                                        byte b11222 = b;
                                                                        c((byte) (-bArr[116]), (short) 58, b11222, objArr76222);
                                                                        j6 = cls26222.getField((java.lang.String) objArr76222[0]).getLong(null);
                                                                        if (j6 != -1) {
                                                                        }
                                                                        char mirror222 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                        int identityHashCode8222 = java.lang.System.identityHashCode(setsaveenabled);
                                                                        int i129222 = mirror222 * 65327;
                                                                        int i130222 = (i129222 ^ 10032) + ((i129222 & 10032) << 1);
                                                                        int i131222 = ~mirror222;
                                                                        int i132222 = (~((i131222 ^ 47) | (i131222 & 47))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                                                                        int i133222 = ~identityHashCode8222;
                                                                        int i134222 = (i130222 ^ i132222) + ((i130222 & i132222) << 1) + (((~((i133222 ^ 47) | (i133222 & 47))) | (~(i131222 | identityHashCode8222))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                                                                        int i135222 = (i131222 ^ i133222) | (i131222 & i133222);
                                                                        int i136222 = ~((i135222 ^ (-48)) | (i135222 & (-48)));
                                                                        int i137222 = (mirror222 ^ kotlinx.io.files.FileSystemKt.UnixPathSeparator) | (mirror222 & kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                                                                        int i138222 = ~((identityHashCode8222 ^ i137222) | (i137222 & identityHashCode8222));
                                                                        int i139222 = -(-(((i138222 ^ i136222) | (i138222 & i136222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                                                        char c8222 = (char) ((i134222 ^ i139222) + ((i139222 & i134222) << 1));
                                                                        int i140222 = -(android.os.Process.myPid() >> 22);
                                                                        int identityHashCode9222 = java.lang.System.identityHashCode(setsaveenabled);
                                                                        int i141222 = ~i140222;
                                                                        int i142222 = ~identityHashCode9222;
                                                                        int i143222 = ~((i142222 & i141222) | (i141222 ^ i142222));
                                                                        int i144222 = ~((i141222 ^ 26) | (i141222 & 26));
                                                                        int i145222 = (i143222 ^ i144222) | (i143222 & i144222);
                                                                        int i146222 = ~((i142222 ^ 26) | (i142222 & 26));
                                                                        int i147222 = -(-(((i146222 ^ i145222) | (i145222 & i146222)) * (-397)));
                                                                        int i148222 = (identityHashCode9222 ^ i144222) | (identityHashCode9222 & i144222);
                                                                        int i149222 = ~((i140222 & (-27)) | (i140222 ^ (-27)));
                                                                        int capsMode2222 = android.text.TextUtils.getCapsMode(str15, 0, 0);
                                                                        int identityHashCode10222 = java.lang.System.identityHashCode(setsaveenabled);
                                                                        str9 = str8;
                                                                        int i150222 = capsMode2222 * (-1335);
                                                                        int i151222 = (i150222 ^ (-46023)) + ((i150222 & (-46023)) << 1);
                                                                        int i152222 = ~((capsMode2222 ^ identityHashCode10222) | (capsMode2222 & identityHashCode10222));
                                                                        int i153222 = ((i152222 & (-70)) | (i152222 ^ (-70))) * (-668);
                                                                        int i154222 = ((i151222 | i153222) << 1) - (i153222 ^ i151222);
                                                                        int i155222 = ~((identityHashCode10222 ^ (-70)) | (identityHashCode10222 & (-70)));
                                                                        int i156222 = -(-(((i155222 & capsMode2222) | (i155222 ^ capsMode2222)) * 1336));
                                                                        int i157222 = (i154222 ^ i156222) + ((i156222 & i154222) << 1);
                                                                        int i158222 = capsMode2222 | identityHashCode10222;
                                                                        int i159222 = ((i158222 ^ (-70)) | (i158222 & (-70))) * 668;
                                                                        java.lang.Object[] objArr77222 = new java.lang.Object[1];
                                                                        b(c8222, ((((((i140222 * 398) - 10296) - (~i147222)) - 1) + ((~(i141222 | 26)) * (-397))) - (~(((i148222 ^ i149222) | (i149222 & i148222)) * 397))) - 1, ((i157222 | i159222) << 1) - (i159222 ^ i157222), objArr77222);
                                                                        java.lang.Class<?> cls27222 = java.lang.Class.forName((java.lang.String) objArr77222[0]);
                                                                        int i160222 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                        int identityHashCode11222 = java.lang.System.identityHashCode(setsaveenabled);
                                                                        int i161222 = i160222 * (-813);
                                                                        int i162222 = (4971072 ^ i161222) + ((i161222 & 4971072) << 1);
                                                                        int i163222 = ~((i160222 ^ (-12185)) | (i160222 & (-12185)));
                                                                        int i164222 = ~((i160222 ^ identityHashCode11222) | (i160222 & identityHashCode11222));
                                                                        int i165222 = -(-(((i163222 ^ i164222) | (i163222 & i164222)) * (-814)));
                                                                        int i166222 = ~identityHashCode11222;
                                                                        int i167222 = ~((i166222 ^ (-12185)) | (i166222 & (-12185)));
                                                                        int i168222 = ~i160222;
                                                                        int i169222 = ~((i168222 & 12184) | (i168222 ^ 12184));
                                                                        int i170222 = (i167222 ^ i169222) | (i167222 & i169222);
                                                                        int i171222 = ~(i168222 | identityHashCode11222);
                                                                        int i172222 = (i171222 ^ i169222) | (i171222 & i169222);
                                                                        int i173222 = ~((identityHashCode11222 ^ 12184) | (identityHashCode11222 & 12184));
                                                                        char c9222 = (char) (((((i162222 ^ i165222) + ((i165222 & i162222) << 1)) + (((i170222 & i164222) | (i170222 ^ i164222)) * 407)) - (~(((i172222 ^ i173222) | (i172222 & i173222)) * 407))) - 1);
                                                                        int lastIndexOf222 = android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                                        int identityHashCode12222 = java.lang.System.identityHashCode(setsaveenabled);
                                                                        int i174222 = (lastIndexOf222 * (-1965)) + 18696;
                                                                        int i175222 = -(-(((lastIndexOf222 ^ (-20)) | (lastIndexOf222 & (-20))) * 983));
                                                                        int i176222 = (i174222 & i175222) + (i174222 | i175222);
                                                                        int i177222 = ~lastIndexOf222;
                                                                        int i178222 = ~identityHashCode12222;
                                                                        int i179222 = ~(i178222 | (-20));
                                                                        int i180222 = ((i179222 ^ i177222) | (i179222 & i177222)) * (-983);
                                                                        int i181222 = ((i176222 | i180222) << 1) - (i180222 ^ i176222);
                                                                        int i182222 = ~((i178222 ^ i177222) | (i178222 & i177222));
                                                                        int i183222 = ~((i177222 ^ 19) | (i177222 & 19));
                                                                        int i184222 = ((i182222 ^ i183222) | (i183222 & i182222)) * 983;
                                                                        int i185222 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                        int identityHashCode13222 = java.lang.System.identityHashCode(setsaveenabled);
                                                                        int i186222 = i185222 * (-520);
                                                                        int i187222 = (49590 & i186222) + (i186222 | 49590);
                                                                        int i188222 = ~i185222;
                                                                        int i189222 = (i188222 & 95) | (i188222 ^ 95);
                                                                        int i190222 = (~((i189222 ^ identityHashCode13222) | (i189222 & identityHashCode13222))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                                                                        int i191222 = (i187222 ^ i190222) + ((i187222 & i190222) << 1);
                                                                        int i192222 = (~(i185222 | (-96))) * (-1042);
                                                                        int i193222 = (~identityHashCode13222) | i188222;
                                                                        java.lang.Object[] objArr78222 = new java.lang.Object[1];
                                                                        b(c9222, ((i181222 | i184222) << 1) - (i184222 ^ i181222), (((i191222 & i192222) + (i191222 | i192222)) - (~(-(-(((~((i185222 ^ (-96)) | (i185222 & (-96)))) | (~((i193222 ^ 95) | (i193222 & 95)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))))) - 1, objArr78222);
                                                                        context4 = (android.content.Context) cls27222.getMethod((java.lang.String) objArr78222[0], new java.lang.Class[0]).invoke(null, null);
                                                                        if (context4 != null) {
                                                                        }
                                                                        java.lang.Object[] objArr79222 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 671573304};
                                                                        byte[] bArr8222 = $$d;
                                                                        java.lang.Object[] objArr80222 = new java.lang.Object[1];
                                                                        d((byte) 67, com.visa.cbp.getCertUsage.getODAData, bArr8222[63], objArr80222);
                                                                        java.lang.Class<?> cls28222 = java.lang.Class.forName((java.lang.String) objArr80222[0]);
                                                                        byte b12222 = bArr8222[189];
                                                                        java.lang.Object[] objArr81222 = new java.lang.Object[1];
                                                                        d(b12222, (short) (b12222 | 261), (byte) ($$e | 16), objArr81222);
                                                                        java.lang.String str16222 = (java.lang.String) objArr81222[0];
                                                                        java.lang.Object[] objArr82222 = new java.lang.Object[1];
                                                                        e(null, null, android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr82222);
                                                                        objArr7 = (java.lang.Object[]) cls28222.getMethod(str16222, java.lang.Class.forName((java.lang.String) objArr82222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr79222);
                                                                        if (context4 != null) {
                                                                        }
                                                                        i9 = ((int[]) objArr7[1])[0];
                                                                        if (((int[]) objArr7[0])[0] == i9) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            char c11 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                            int i248 = -android.graphics.Color.red(0);
                                                            int identityHashCode18 = java.lang.System.identityHashCode(setsaveenabled);
                                                            int i249 = i248 * (-830);
                                                            int i250 = ((i249 | 21632) << 1) - (i249 ^ 21632);
                                                            int i251 = ~identityHashCode18;
                                                            int i252 = ~((i251 ^ (-27)) | (i251 & (-27)));
                                                            int i253 = ~(i248 | 26 | identityHashCode18);
                                                            int i254 = -(-(((i252 ^ i253) | (i252 & i253)) * (-831)));
                                                            int i255 = (i250 & i254) + (i250 | i254);
                                                            int i256 = (i248 ^ (-27)) | (i248 & (-27));
                                                            int i257 = -(-((~((i256 ^ identityHashCode18) | (i256 & identityHashCode18))) * (-1662)));
                                                            int i258 = ~(i251 | (~i248));
                                                            int i259 = ~((i248 ^ identityHashCode18) | (i248 & identityHashCode18));
                                                            int i260 = (i259 ^ i258) | (i259 & i258);
                                                            int i261 = ~((identityHashCode18 ^ 26) | (identityHashCode18 & 26));
                                                            b = b7;
                                                            java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                            b(c11, (i255 & i257) + (i257 | i255) + (((i260 ^ i261) | (i260 & i261)) * 831), 69 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr108);
                                                            java.lang.Class<?> cls40 = java.lang.Class.forName((java.lang.String) objArr108[0]);
                                                            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                            int identityHashCode19 = java.lang.System.identityHashCode(setsaveenabled);
                                                            int i262 = packedPositionGroup | 12184;
                                                            int i263 = ~packedPositionGroup;
                                                            int i264 = ~((i263 & (-12185)) | (i263 ^ (-12185)));
                                                            int i265 = ~identityHashCode19;
                                                            int i266 = ~(i263 | i265);
                                                            int i267 = (i264 ^ i266) | (i264 & i266);
                                                            int i268 = ~((i262 ^ identityHashCode19) | (i262 & identityHashCode19));
                                                            str6 = "valueOf";
                                                            int i269 = (packedPositionGroup * 503) + 6128552 + (i262 * (-502)) + (((i267 ^ i268) | (i267 & i268)) * (-502));
                                                            int i270 = (i263 ^ i265) | (i263 & i265);
                                                            int i271 = ~((i270 ^ 12184) | (i270 & 12184));
                                                            int i272 = (packedPositionGroup ^ 12184) | (packedPositionGroup & 12184);
                                                            int i273 = ~((i272 ^ identityHashCode19) | (i272 & identityHashCode19));
                                                            int i274 = ((i273 ^ i271) | (i273 & i271)) * 502;
                                                            char c12 = (char) ((i269 ^ i274) + ((i274 & i269) << 1));
                                                            int i275 = -(-android.text.TextUtils.indexOf(str15, str15, 0, 0));
                                                            int i276 = -android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                            int identityHashCode20 = java.lang.System.identityHashCode(setsaveenabled);
                                                            int i277 = (i276 * (-419)) + 39574;
                                                            int i278 = -(-((~((identityHashCode20 ^ 94) | (identityHashCode20 & 94))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                                            int i279 = ~i276;
                                                            int i280 = (i277 ^ i278) + ((i277 & i278) << 1) + (((i279 & 94) | (i279 ^ 94)) * (-420));
                                                            int i281 = ~(i279 | (-95));
                                                            int i282 = ~identityHashCode20;
                                                            int i283 = ~((i282 ^ 94) | (i282 & 94));
                                                            int i284 = -(-(((i281 ^ i283) | (i281 & i283)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                            b(c12, ((i275 | 18) << 1) - (i275 ^ 18), (i280 & i284) + (i284 | i280), objArr109);
                                                            context2 = (android.content.Context) cls40.getMethod((java.lang.String) objArr109[0], new java.lang.Class[0]).invoke(null, null);
                                                            if (context2 != null) {
                                                                context2 = context2.getApplicationContext();
                                                                getCvrMaskAnd = (getGpoResponse + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                                            }
                                                            java.lang.Object[] objArr110 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 0, 1961567294};
                                                            byte[] bArr12 = $$d;
                                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                            d(bArr12[165], 544, bArr12[63], objArr111);
                                                            java.lang.Class<?> cls41 = java.lang.Class.forName((java.lang.String) objArr111[0]);
                                                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                            d(bArr12[376], 620, bArr12[189], objArr112);
                                                            java.lang.String str20 = (java.lang.String) objArr112[0];
                                                            int i285 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                            e(null, null, (i285 ^ 127) + ((i285 & 127) << 1), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr113);
                                                            objArr3 = (java.lang.Object[]) cls41.getMethod(str20, java.lang.Class.forName((java.lang.String) objArr113[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr110);
                                                            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 668, (char) (40023 - android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                            c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr114);
                                                            cls42.getField((java.lang.String) objArr114[0]).set(null, objArr3);
                                                            long longValue4 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                            java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 667 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.MotionEvent.axisFromString(str15) + 40025));
                                                            i5 = 1;
                                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                            c((byte) (-bArr[11]), bArr[21], b6, objArr115);
                                                            c2 = 0;
                                                            cls43.getField((java.lang.String) objArr115[0]).set(null, java.lang.Long.valueOf(longValue4));
                                                            i6 = ((int[]) objArr3[i5])[c2];
                                                            if (((int[]) objArr3[c2])[c2] != i6) {
                                                            }
                                                            java.lang.Class cls192 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 584 - android.view.View.resolveSize(0, 0), (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                                            java.lang.Object[] objArr572 = new java.lang.Object[1];
                                                            c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr572);
                                                            j4 = cls192.getField((java.lang.String) objArr572[0]).getLong(null);
                                                            if (j4 != -1) {
                                                            }
                                                            char keyRepeatDelay2 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            int i2092 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            int identityHashCode162 = java.lang.System.identityHashCode(setsaveenabled);
                                                            int i2102 = ~i2092;
                                                            int i2112 = ~identityHashCode162;
                                                            int i2122 = (i2102 & (-28)) | (i2102 ^ (-28));
                                                            int i2132 = ~((i2122 ^ identityHashCode162) | (i2122 & identityHashCode162));
                                                            int i2142 = (i2112 ^ i2092) | (i2112 & i2092);
                                                            int i2152 = ~((i2142 ^ 27) | (i2142 & 27));
                                                            b2 = b6;
                                                            str7 = str6;
                                                            int i2162 = ((i2092 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - 24381) + (((~((i2112 ^ 27) | (i2112 & 27))) | (~(i2102 | identityHashCode162))) * (-1808)) + (((i2132 ^ i2152) | (i2152 & i2132)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                                                            int i2172 = (~(i2102 | 27)) | (~((identityHashCode162 & (-28)) | (identityHashCode162 ^ (-28))));
                                                            int i2182 = ~(i2092 | i2112);
                                                            int i2192 = -(-(((i2182 ^ i2172) | (i2172 & i2182)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                                                            int i2202 = -android.text.TextUtils.indexOf(str15, str15);
                                                            java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                                            b(keyRepeatDelay2, (i2162 & i2192) + (i2162 | i2192), ((i2202 | 69) << 1) - (i2202 ^ 69), objArr1002);
                                                            java.lang.Class<?> cls362 = java.lang.Class.forName((java.lang.String) objArr1002[0]);
                                                            int i2212 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            int identityHashCode172 = java.lang.System.identityHashCode(setsaveenabled);
                                                            int i2222 = i2212 * 714;
                                                            int i2232 = ((-8675008) ^ i2222) + ((i2222 & (-8675008)) << 1);
                                                            int i2242 = ~i2212;
                                                            int i2252 = ~identityHashCode172;
                                                            int i2262 = ~((i2242 & i2252) | (i2242 ^ i2252));
                                                            int i2272 = ~((i2242 ^ 12184) | (i2242 & 12184));
                                                            int i2282 = -(-(((i2272 ^ i2262) | (i2262 & i2272) | (~(i2212 | (-12185) | identityHashCode172))) * (-713)));
                                                            int i2292 = (i2232 ^ i2282) + ((i2282 & i2232) << 1);
                                                            int i2302 = (~((i2212 ^ (-12185)) | (i2212 & (-12185)) | identityHashCode172)) * 1426;
                                                            int i2312 = ((i2292 | i2302) << 1) - (i2302 ^ i2292);
                                                            int i2322 = (~(i2252 | (-12185))) * 713;
                                                            char c102 = (char) ((i2312 ^ i2322) + ((i2322 & i2312) << 1));
                                                            int i2332 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                            int indexOf22 = android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                            java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                                            b(c102, (i2332 ^ 18) + ((i2332 & 18) << 1), (indexOf22 ^ 96) + ((indexOf22 & 96) << 1), objArr1012);
                                                            context3 = (android.content.Context) cls362.getMethod((java.lang.String) objArr1012[0], new java.lang.Class[0]).invoke(null, null);
                                                            if (context3 != null) {
                                                            }
                                                            java.lang.Object[] objArr1022 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1497262055};
                                                            byte[] bArr112 = $$d;
                                                            byte b142 = bArr112[63];
                                                            java.lang.Object[] objArr1032 = new java.lang.Object[1];
                                                            d(b142, 469, b142, objArr1032);
                                                            java.lang.Class<?> cls372 = java.lang.Class.forName((java.lang.String) objArr1032[0]);
                                                            java.lang.Object[] objArr1042 = new java.lang.Object[1];
                                                            d(bArr112[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr112[43]), objArr1042);
                                                            java.lang.String str192 = (java.lang.String) objArr1042[0];
                                                            int i2342 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                            int i2352 = (i2342 * (-51)) + 6678;
                                                            int i2362 = ~java.lang.System.identityHashCode(setsaveenabled);
                                                            int i2372 = (i2362 ^ i2342) | (i2362 & i2342);
                                                            int i2382 = -(-((~((i2372 & 126) | (i2372 ^ 126))) * 52));
                                                            int i2392 = (i2352 ^ i2382) + ((i2352 & i2382) << 1);
                                                            int i2402 = (~(i2362 | androidx.compose.runtime.ComposerKt.defaultsKey)) | (~((i2342 ^ androidx.compose.runtime.ComposerKt.defaultsKey) | (i2342 & androidx.compose.runtime.ComposerKt.defaultsKey)));
                                                            int i2412 = ~(i2362 | i2342);
                                                            int i2422 = ((i2402 & i2412) | (i2402 ^ i2412)) * (-52);
                                                            int i2432 = ((i2392 | i2422) << 1) - (i2422 ^ i2392);
                                                            int i2442 = ~i2342;
                                                            int i2452 = ~((i2362 & i2442) | (i2442 ^ i2362));
                                                            int i2462 = ~((i2442 ^ 126) | (i2442 & 126));
                                                            int i2472 = -(-(((i2462 ^ i2452) | (i2462 & i2452)) * 52));
                                                            java.lang.Object[] objArr1052 = new java.lang.Object[1];
                                                            e(null, null, (i2432 & i2472) + (i2472 | i2432), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr1052);
                                                            objArr4 = (java.lang.Object[]) cls372.getMethod(str192, java.lang.Class.forName((java.lang.String) objArr1052[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1022);
                                                            if (context3 == null) {
                                                            }
                                                        }
                                                    }
                                                    int intValue2 = ((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue();
                                                    java.lang.Object[] objArr116 = {-242670264};
                                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                    if (obj5 == null) {
                                                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.getOffsetBefore(str15, 0), 873 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (15955 - android.graphics.Color.argb(0, 0, 0, 0)))).getDeclaredConstructor(java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj5);
                                                    }
                                                    writeReplace$4956fc2a = com.payair.hce.getAlternateContactlessPaymentData.writeReplace$4956fc2a(intValue2, ((java.lang.reflect.Constructor) obj5).newInstance(objArr116));
                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, 922 - android.view.View.resolveSize(0, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                    c(bArr[34], bArr[37], bArr[28], objArr117);
                                                    cls44.getField((java.lang.String) objArr117[0]).set(null, writeReplace$4956fc2a);
                                                    long longValue5 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                    java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 44, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 922, (char) android.text.TextUtils.indexOf(str15, str15, 0));
                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                    c((byte) (-bArr[116]), (short) 58, b7, objArr118);
                                                    cls45.getField((java.lang.String) objArr118[0]).set(null, java.lang.Long.valueOf(longValue5));
                                                    int i286 = getCvrMaskAnd;
                                                    getGpoResponse = ((i286 & 33) + (i286 | 33)) % 128;
                                                    i4 = ((int[]) writeReplace$4956fc2a[1])[0];
                                                    if (((int[]) writeReplace$4956fc2a[0])[0] == i4) {
                                                    }
                                                    com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.FALSE}, -1511834785, 1511834800, (int) java.lang.System.currentTimeMillis());
                                                    java.lang.Class cls162 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 667, (char) (android.graphics.Color.alpha(0) + 40024));
                                                    java.lang.Object[] objArr462 = new java.lang.Object[1];
                                                    c((byte) (-bArr[11]), bArr[21], b6, objArr462);
                                                    j3 = cls162.getField((java.lang.String) objArr462[0]).getLong(null);
                                                    if (j3 != -1) {
                                                    }
                                                    char c112 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    int i2482 = -android.graphics.Color.red(0);
                                                    int identityHashCode182 = java.lang.System.identityHashCode(setsaveenabled);
                                                    int i2492 = i2482 * (-830);
                                                    int i2502 = ((i2492 | 21632) << 1) - (i2492 ^ 21632);
                                                    int i2512 = ~identityHashCode182;
                                                    int i2522 = ~((i2512 ^ (-27)) | (i2512 & (-27)));
                                                    int i2532 = ~(i2482 | 26 | identityHashCode182);
                                                    int i2542 = -(-(((i2522 ^ i2532) | (i2522 & i2532)) * (-831)));
                                                    int i2552 = (i2502 & i2542) + (i2502 | i2542);
                                                    int i2562 = (i2482 ^ (-27)) | (i2482 & (-27));
                                                    int i2572 = -(-((~((i2562 ^ identityHashCode182) | (i2562 & identityHashCode182))) * (-1662)));
                                                    int i2582 = ~(i2512 | (~i2482));
                                                    int i2592 = ~((i2482 ^ identityHashCode182) | (i2482 & identityHashCode182));
                                                    int i2602 = (i2592 ^ i2582) | (i2592 & i2582);
                                                    int i2612 = ~((identityHashCode182 ^ 26) | (identityHashCode182 & 26));
                                                    b = b7;
                                                    java.lang.Object[] objArr1082 = new java.lang.Object[1];
                                                    b(c112, (i2552 & i2572) + (i2572 | i2552) + (((i2602 ^ i2612) | (i2602 & i2612)) * 831), 69 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr1082);
                                                    java.lang.Class<?> cls402 = java.lang.Class.forName((java.lang.String) objArr1082[0]);
                                                    int packedPositionGroup2 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                                    int identityHashCode192 = java.lang.System.identityHashCode(setsaveenabled);
                                                    int i2622 = packedPositionGroup2 | 12184;
                                                    int i2632 = ~packedPositionGroup2;
                                                    int i2642 = ~((i2632 & (-12185)) | (i2632 ^ (-12185)));
                                                    int i2652 = ~identityHashCode192;
                                                    int i2662 = ~(i2632 | i2652);
                                                    int i2672 = (i2642 ^ i2662) | (i2642 & i2662);
                                                    int i2682 = ~((i2622 ^ identityHashCode192) | (i2622 & identityHashCode192));
                                                    str6 = "valueOf";
                                                    int i2692 = (packedPositionGroup2 * 503) + 6128552 + (i2622 * (-502)) + (((i2672 ^ i2682) | (i2672 & i2682)) * (-502));
                                                    int i2702 = (i2632 ^ i2652) | (i2632 & i2652);
                                                    int i2712 = ~((i2702 ^ 12184) | (i2702 & 12184));
                                                    int i2722 = (packedPositionGroup2 ^ 12184) | (packedPositionGroup2 & 12184);
                                                    int i2732 = ~((i2722 ^ identityHashCode192) | (i2722 & identityHashCode192));
                                                    int i2742 = ((i2732 ^ i2712) | (i2732 & i2712)) * 502;
                                                    char c122 = (char) ((i2692 ^ i2742) + ((i2742 & i2692) << 1));
                                                    int i2752 = -(-android.text.TextUtils.indexOf(str15, str15, 0, 0));
                                                    int i2762 = -android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                    int identityHashCode202 = java.lang.System.identityHashCode(setsaveenabled);
                                                    int i2772 = (i2762 * (-419)) + 39574;
                                                    int i2782 = -(-((~((identityHashCode202 ^ 94) | (identityHashCode202 & 94))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                                    int i2792 = ~i2762;
                                                    int i2802 = (i2772 ^ i2782) + ((i2772 & i2782) << 1) + (((i2792 & 94) | (i2792 ^ 94)) * (-420));
                                                    int i2812 = ~(i2792 | (-95));
                                                    int i2822 = ~identityHashCode202;
                                                    int i2832 = ~((i2822 ^ 94) | (i2822 & 94));
                                                    int i2842 = -(-(((i2812 ^ i2832) | (i2812 & i2832)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                                    java.lang.Object[] objArr1092 = new java.lang.Object[1];
                                                    b(c122, ((i2752 | 18) << 1) - (i2752 ^ 18), (i2802 & i2842) + (i2842 | i2802), objArr1092);
                                                    context2 = (android.content.Context) cls402.getMethod((java.lang.String) objArr1092[0], new java.lang.Class[0]).invoke(null, null);
                                                    if (context2 != null) {
                                                    }
                                                    java.lang.Object[] objArr1102 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 0, 1961567294};
                                                    byte[] bArr122 = $$d;
                                                    java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                                    d(bArr122[165], 544, bArr122[63], objArr1112);
                                                    java.lang.Class<?> cls412 = java.lang.Class.forName((java.lang.String) objArr1112[0]);
                                                    java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                                    d(bArr122[376], 620, bArr122[189], objArr1122);
                                                    java.lang.String str202 = (java.lang.String) objArr1122[0];
                                                    int i2852 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                    java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                                    e(null, null, (i2852 ^ 127) + ((i2852 & 127) << 1), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr1132);
                                                    objArr3 = (java.lang.Object[]) cls412.getMethod(str202, java.lang.Class.forName((java.lang.String) objArr1132[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1102);
                                                    java.lang.Class cls422 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 668, (char) (40023 - android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                    java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                                    c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr1142);
                                                    cls422.getField((java.lang.String) objArr1142[0]).set(null, objArr3);
                                                    long longValue42 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                    java.lang.Class cls432 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 667 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.MotionEvent.axisFromString(str15) + 40025));
                                                    i5 = 1;
                                                    java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                    c((byte) (-bArr[11]), bArr[21], b6, objArr1152);
                                                    c2 = 0;
                                                    cls432.getField((java.lang.String) objArr1152[0]).set(null, java.lang.Long.valueOf(longValue42));
                                                    i6 = ((int[]) objArr3[i5])[c2];
                                                    if (((int[]) objArr3[c2])[c2] != i6) {
                                                    }
                                                    java.lang.Class cls1922 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 584 - android.view.View.resolveSize(0, 0), (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                                    java.lang.Object[] objArr5722 = new java.lang.Object[1];
                                                    c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr5722);
                                                    j4 = cls1922.getField((java.lang.String) objArr5722[0]).getLong(null);
                                                    if (j4 != -1) {
                                                    }
                                                    char keyRepeatDelay22 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int i20922 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    int identityHashCode1622 = java.lang.System.identityHashCode(setsaveenabled);
                                                    int i21022 = ~i20922;
                                                    int i21122 = ~identityHashCode1622;
                                                    int i21222 = (i21022 & (-28)) | (i21022 ^ (-28));
                                                    int i21322 = ~((i21222 ^ identityHashCode1622) | (i21222 & identityHashCode1622));
                                                    int i21422 = (i21122 ^ i20922) | (i21122 & i20922);
                                                    int i21522 = ~((i21422 ^ 27) | (i21422 & 27));
                                                    b2 = b6;
                                                    str7 = str6;
                                                    int i21622 = ((i20922 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - 24381) + (((~((i21122 ^ 27) | (i21122 & 27))) | (~(i21022 | identityHashCode1622))) * (-1808)) + (((i21322 ^ i21522) | (i21522 & i21322)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                                                    int i21722 = (~(i21022 | 27)) | (~((identityHashCode1622 & (-28)) | (identityHashCode1622 ^ (-28))));
                                                    int i21822 = ~(i20922 | i21122);
                                                    int i21922 = -(-(((i21822 ^ i21722) | (i21722 & i21822)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                                                    int i22022 = -android.text.TextUtils.indexOf(str15, str15);
                                                    java.lang.Object[] objArr10022 = new java.lang.Object[1];
                                                    b(keyRepeatDelay22, (i21622 & i21922) + (i21622 | i21922), ((i22022 | 69) << 1) - (i22022 ^ 69), objArr10022);
                                                    java.lang.Class<?> cls3622 = java.lang.Class.forName((java.lang.String) objArr10022[0]);
                                                    int i22122 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    int identityHashCode1722 = java.lang.System.identityHashCode(setsaveenabled);
                                                    int i22222 = i22122 * 714;
                                                    int i22322 = ((-8675008) ^ i22222) + ((i22222 & (-8675008)) << 1);
                                                    int i22422 = ~i22122;
                                                    int i22522 = ~identityHashCode1722;
                                                    int i22622 = ~((i22422 & i22522) | (i22422 ^ i22522));
                                                    int i22722 = ~((i22422 ^ 12184) | (i22422 & 12184));
                                                    int i22822 = -(-(((i22722 ^ i22622) | (i22622 & i22722) | (~(i22122 | (-12185) | identityHashCode1722))) * (-713)));
                                                    int i22922 = (i22322 ^ i22822) + ((i22822 & i22322) << 1);
                                                    int i23022 = (~((i22122 ^ (-12185)) | (i22122 & (-12185)) | identityHashCode1722)) * 1426;
                                                    int i23122 = ((i22922 | i23022) << 1) - (i23022 ^ i22922);
                                                    int i23222 = (~(i22522 | (-12185))) * 713;
                                                    char c1022 = (char) ((i23122 ^ i23222) + ((i23222 & i23122) << 1));
                                                    int i23322 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                    int indexOf222 = android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                    java.lang.Object[] objArr10122 = new java.lang.Object[1];
                                                    b(c1022, (i23322 ^ 18) + ((i23322 & 18) << 1), (indexOf222 ^ 96) + ((indexOf222 & 96) << 1), objArr10122);
                                                    context3 = (android.content.Context) cls3622.getMethod((java.lang.String) objArr10122[0], new java.lang.Class[0]).invoke(null, null);
                                                    if (context3 != null) {
                                                    }
                                                    java.lang.Object[] objArr10222 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1497262055};
                                                    byte[] bArr1122 = $$d;
                                                    byte b1422 = bArr1122[63];
                                                    java.lang.Object[] objArr10322 = new java.lang.Object[1];
                                                    d(b1422, 469, b1422, objArr10322);
                                                    java.lang.Class<?> cls3722 = java.lang.Class.forName((java.lang.String) objArr10322[0]);
                                                    java.lang.Object[] objArr10422 = new java.lang.Object[1];
                                                    d(bArr1122[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr1122[43]), objArr10422);
                                                    java.lang.String str1922 = (java.lang.String) objArr10422[0];
                                                    int i23422 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                    int i23522 = (i23422 * (-51)) + 6678;
                                                    int i23622 = ~java.lang.System.identityHashCode(setsaveenabled);
                                                    int i23722 = (i23622 ^ i23422) | (i23622 & i23422);
                                                    int i23822 = -(-((~((i23722 & 126) | (i23722 ^ 126))) * 52));
                                                    int i23922 = (i23522 ^ i23822) + ((i23522 & i23822) << 1);
                                                    int i24022 = (~(i23622 | androidx.compose.runtime.ComposerKt.defaultsKey)) | (~((i23422 ^ androidx.compose.runtime.ComposerKt.defaultsKey) | (i23422 & androidx.compose.runtime.ComposerKt.defaultsKey)));
                                                    int i24122 = ~(i23622 | i23422);
                                                    int i24222 = ((i24022 & i24122) | (i24022 ^ i24122)) * (-52);
                                                    int i24322 = ((i23922 | i24222) << 1) - (i24222 ^ i23922);
                                                    int i24422 = ~i23422;
                                                    int i24522 = ~((i23622 & i24422) | (i24422 ^ i23622));
                                                    int i24622 = ~((i24422 ^ 126) | (i24422 & 126));
                                                    int i24722 = -(-(((i24622 ^ i24522) | (i24622 & i24522)) * 52));
                                                    java.lang.Object[] objArr10522 = new java.lang.Object[1];
                                                    e(null, null, (i24322 & i24722) + (i24722 | i24322), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr10522);
                                                    objArr4 = (java.lang.Object[]) cls3722.getMethod(str1922, java.lang.Class.forName((java.lang.String) objArr10522[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr10222);
                                                    if (context3 == null) {
                                                    }
                                                }
                                            }
                                            java.lang.Object[] objArr119 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1352357408};
                                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                            if (obj == null) {
                                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 46, (android.os.Process.myPid() >> 22) + 754, (char) (45560 - android.graphics.Color.argb(0, 0, 0, 0)));
                                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr120);
                                                obj = cls46.getMethod((java.lang.String) objArr120[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj);
                                            }
                                            java.lang.Object invoke3 = ((java.lang.reflect.Method) obj).invoke(null, objArr119);
                                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 47, 754 - android.text.TextUtils.getTrimmedLength(str15), (char) (android.view.KeyEvent.normalizeMetaState(0) + 45560));
                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                            c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr121);
                                            cls47.getField((java.lang.String) objArr121[0]).set(null, invoke3);
                                            long longValue6 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                            java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 47, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 755, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 45560));
                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                            c((byte) (-bArr[11]), bArr[21], b6, objArr122);
                                            cls48.getField((java.lang.String) objArr122[0]).set(null, java.lang.Long.valueOf(longValue6));
                                            obj2 = invoke3;
                                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                            if (obj3 == null) {
                                            }
                                            intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj2, null)).intValue();
                                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                            if (obj4 == null) {
                                            }
                                            if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(obj2, null)).intValue() != intValue) {
                                            }
                                            java.lang.Class cls132 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 922, (char) android.view.View.MeasureSpec.getMode(0));
                                            byte b72 = (byte) (i109 + 2);
                                            java.lang.Object[] objArr382 = new java.lang.Object[1];
                                            c((byte) (-bArr[116]), (short) 58, b72, objArr382);
                                            j2 = cls132.getField((java.lang.String) objArr382[0]).getLong(null);
                                            if (j2 != -1) {
                                            }
                                            int intValue22 = ((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue();
                                            java.lang.Object[] objArr1162 = {-242670264};
                                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                            if (obj5 == null) {
                                            }
                                            writeReplace$4956fc2a = com.payair.hce.getAlternateContactlessPaymentData.writeReplace$4956fc2a(intValue22, ((java.lang.reflect.Constructor) obj5).newInstance(objArr1162));
                                            java.lang.Class cls442 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, 922 - android.view.View.resolveSize(0, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                            java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                            c(bArr[34], bArr[37], bArr[28], objArr1172);
                                            cls442.getField((java.lang.String) objArr1172[0]).set(null, writeReplace$4956fc2a);
                                            long longValue52 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                            java.lang.Class cls452 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 44, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 922, (char) android.text.TextUtils.indexOf(str15, str15, 0));
                                            java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                            c((byte) (-bArr[116]), (short) 58, b72, objArr1182);
                                            cls452.getField((java.lang.String) objArr1182[0]).set(null, java.lang.Long.valueOf(longValue52));
                                            int i2862 = getCvrMaskAnd;
                                            getGpoResponse = ((i2862 & 33) + (i2862 | 33)) % 128;
                                            i4 = ((int[]) writeReplace$4956fc2a[1])[0];
                                            if (((int[]) writeReplace$4956fc2a[0])[0] == i4) {
                                            }
                                            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.FALSE}, -1511834785, 1511834800, (int) java.lang.System.currentTimeMillis());
                                            java.lang.Class cls1622 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 667, (char) (android.graphics.Color.alpha(0) + 40024));
                                            java.lang.Object[] objArr4622 = new java.lang.Object[1];
                                            c((byte) (-bArr[11]), bArr[21], b6, objArr4622);
                                            j3 = cls1622.getField((java.lang.String) objArr4622[0]).getLong(null);
                                            if (j3 != -1) {
                                            }
                                            char c1122 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int i24822 = -android.graphics.Color.red(0);
                                            int identityHashCode1822 = java.lang.System.identityHashCode(setsaveenabled);
                                            int i24922 = i24822 * (-830);
                                            int i25022 = ((i24922 | 21632) << 1) - (i24922 ^ 21632);
                                            int i25122 = ~identityHashCode1822;
                                            int i25222 = ~((i25122 ^ (-27)) | (i25122 & (-27)));
                                            int i25322 = ~(i24822 | 26 | identityHashCode1822);
                                            int i25422 = -(-(((i25222 ^ i25322) | (i25222 & i25322)) * (-831)));
                                            int i25522 = (i25022 & i25422) + (i25022 | i25422);
                                            int i25622 = (i24822 ^ (-27)) | (i24822 & (-27));
                                            int i25722 = -(-((~((i25622 ^ identityHashCode1822) | (i25622 & identityHashCode1822))) * (-1662)));
                                            int i25822 = ~(i25122 | (~i24822));
                                            int i25922 = ~((i24822 ^ identityHashCode1822) | (i24822 & identityHashCode1822));
                                            int i26022 = (i25922 ^ i25822) | (i25922 & i25822);
                                            int i26122 = ~((identityHashCode1822 ^ 26) | (identityHashCode1822 & 26));
                                            b = b72;
                                            java.lang.Object[] objArr10822 = new java.lang.Object[1];
                                            b(c1122, (i25522 & i25722) + (i25722 | i25522) + (((i26022 ^ i26122) | (i26022 & i26122)) * 831), 69 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr10822);
                                            java.lang.Class<?> cls4022 = java.lang.Class.forName((java.lang.String) objArr10822[0]);
                                            int packedPositionGroup22 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                            int identityHashCode1922 = java.lang.System.identityHashCode(setsaveenabled);
                                            int i26222 = packedPositionGroup22 | 12184;
                                            int i26322 = ~packedPositionGroup22;
                                            int i26422 = ~((i26322 & (-12185)) | (i26322 ^ (-12185)));
                                            int i26522 = ~identityHashCode1922;
                                            int i26622 = ~(i26322 | i26522);
                                            int i26722 = (i26422 ^ i26622) | (i26422 & i26622);
                                            int i26822 = ~((i26222 ^ identityHashCode1922) | (i26222 & identityHashCode1922));
                                            str6 = "valueOf";
                                            int i26922 = (packedPositionGroup22 * 503) + 6128552 + (i26222 * (-502)) + (((i26722 ^ i26822) | (i26722 & i26822)) * (-502));
                                            int i27022 = (i26322 ^ i26522) | (i26322 & i26522);
                                            int i27122 = ~((i27022 ^ 12184) | (i27022 & 12184));
                                            int i27222 = (packedPositionGroup22 ^ 12184) | (packedPositionGroup22 & 12184);
                                            int i27322 = ~((i27222 ^ identityHashCode1922) | (i27222 & identityHashCode1922));
                                            int i27422 = ((i27322 ^ i27122) | (i27322 & i27122)) * 502;
                                            char c1222 = (char) ((i26922 ^ i27422) + ((i27422 & i26922) << 1));
                                            int i27522 = -(-android.text.TextUtils.indexOf(str15, str15, 0, 0));
                                            int i27622 = -android.text.TextUtils.lastIndexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            int identityHashCode2022 = java.lang.System.identityHashCode(setsaveenabled);
                                            int i27722 = (i27622 * (-419)) + 39574;
                                            int i27822 = -(-((~((identityHashCode2022 ^ 94) | (identityHashCode2022 & 94))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                            int i27922 = ~i27622;
                                            int i28022 = (i27722 ^ i27822) + ((i27722 & i27822) << 1) + (((i27922 & 94) | (i27922 ^ 94)) * (-420));
                                            int i28122 = ~(i27922 | (-95));
                                            int i28222 = ~identityHashCode2022;
                                            int i28322 = ~((i28222 ^ 94) | (i28222 & 94));
                                            int i28422 = -(-(((i28122 ^ i28322) | (i28122 & i28322)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                            java.lang.Object[] objArr10922 = new java.lang.Object[1];
                                            b(c1222, ((i27522 | 18) << 1) - (i27522 ^ 18), (i28022 & i28422) + (i28422 | i28022), objArr10922);
                                            context2 = (android.content.Context) cls4022.getMethod((java.lang.String) objArr10922[0], new java.lang.Class[0]).invoke(null, null);
                                            if (context2 != null) {
                                            }
                                            java.lang.Object[] objArr11022 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 0, 1961567294};
                                            byte[] bArr1222 = $$d;
                                            java.lang.Object[] objArr11122 = new java.lang.Object[1];
                                            d(bArr1222[165], 544, bArr1222[63], objArr11122);
                                            java.lang.Class<?> cls4122 = java.lang.Class.forName((java.lang.String) objArr11122[0]);
                                            java.lang.Object[] objArr11222 = new java.lang.Object[1];
                                            d(bArr1222[376], 620, bArr1222[189], objArr11222);
                                            java.lang.String str2022 = (java.lang.String) objArr11222[0];
                                            int i28522 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            java.lang.Object[] objArr11322 = new java.lang.Object[1];
                                            e(null, null, (i28522 ^ 127) + ((i28522 & 127) << 1), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr11322);
                                            objArr3 = (java.lang.Object[]) cls4122.getMethod(str2022, java.lang.Class.forName((java.lang.String) objArr11322[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr11022);
                                            java.lang.Class cls4222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 668, (char) (40023 - android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                            java.lang.Object[] objArr11422 = new java.lang.Object[1];
                                            c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr11422);
                                            cls4222.getField((java.lang.String) objArr11422[0]).set(null, objArr3);
                                            long longValue422 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                            java.lang.Class cls4322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 667 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.MotionEvent.axisFromString(str15) + 40025));
                                            i5 = 1;
                                            java.lang.Object[] objArr11522 = new java.lang.Object[1];
                                            c((byte) (-bArr[11]), bArr[21], b6, objArr11522);
                                            c2 = 0;
                                            cls4322.getField((java.lang.String) objArr11522[0]).set(null, java.lang.Long.valueOf(longValue422));
                                            i6 = ((int[]) objArr3[i5])[c2];
                                            if (((int[]) objArr3[c2])[c2] != i6) {
                                            }
                                            java.lang.Class cls19222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 584 - android.view.View.resolveSize(0, 0), (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                            java.lang.Object[] objArr57222 = new java.lang.Object[1];
                                            c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr57222);
                                            j4 = cls19222.getField((java.lang.String) objArr57222[0]).getLong(null);
                                            if (j4 != -1) {
                                            }
                                            char keyRepeatDelay222 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int i209222 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            int identityHashCode16222 = java.lang.System.identityHashCode(setsaveenabled);
                                            int i210222 = ~i209222;
                                            int i211222 = ~identityHashCode16222;
                                            int i212222 = (i210222 & (-28)) | (i210222 ^ (-28));
                                            int i213222 = ~((i212222 ^ identityHashCode16222) | (i212222 & identityHashCode16222));
                                            int i214222 = (i211222 ^ i209222) | (i211222 & i209222);
                                            int i215222 = ~((i214222 ^ 27) | (i214222 & 27));
                                            b2 = b6;
                                            str7 = str6;
                                            int i216222 = ((i209222 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - 24381) + (((~((i211222 ^ 27) | (i211222 & 27))) | (~(i210222 | identityHashCode16222))) * (-1808)) + (((i213222 ^ i215222) | (i215222 & i213222)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                                            int i217222 = (~(i210222 | 27)) | (~((identityHashCode16222 & (-28)) | (identityHashCode16222 ^ (-28))));
                                            int i218222 = ~(i209222 | i211222);
                                            int i219222 = -(-(((i218222 ^ i217222) | (i217222 & i218222)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                                            int i220222 = -android.text.TextUtils.indexOf(str15, str15);
                                            java.lang.Object[] objArr100222 = new java.lang.Object[1];
                                            b(keyRepeatDelay222, (i216222 & i219222) + (i216222 | i219222), ((i220222 | 69) << 1) - (i220222 ^ 69), objArr100222);
                                            java.lang.Class<?> cls36222 = java.lang.Class.forName((java.lang.String) objArr100222[0]);
                                            int i221222 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            int identityHashCode17222 = java.lang.System.identityHashCode(setsaveenabled);
                                            int i222222 = i221222 * 714;
                                            int i223222 = ((-8675008) ^ i222222) + ((i222222 & (-8675008)) << 1);
                                            int i224222 = ~i221222;
                                            int i225222 = ~identityHashCode17222;
                                            int i226222 = ~((i224222 & i225222) | (i224222 ^ i225222));
                                            int i227222 = ~((i224222 ^ 12184) | (i224222 & 12184));
                                            int i228222 = -(-(((i227222 ^ i226222) | (i226222 & i227222) | (~(i221222 | (-12185) | identityHashCode17222))) * (-713)));
                                            int i229222 = (i223222 ^ i228222) + ((i228222 & i223222) << 1);
                                            int i230222 = (~((i221222 ^ (-12185)) | (i221222 & (-12185)) | identityHashCode17222)) * 1426;
                                            int i231222 = ((i229222 | i230222) << 1) - (i230222 ^ i229222);
                                            int i232222 = (~(i225222 | (-12185))) * 713;
                                            char c10222 = (char) ((i231222 ^ i232222) + ((i232222 & i231222) << 1));
                                            int i233222 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                            int indexOf2222 = android.text.TextUtils.indexOf(str15, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                            java.lang.Object[] objArr101222 = new java.lang.Object[1];
                                            b(c10222, (i233222 ^ 18) + ((i233222 & 18) << 1), (indexOf2222 ^ 96) + ((indexOf2222 & 96) << 1), objArr101222);
                                            context3 = (android.content.Context) cls36222.getMethod((java.lang.String) objArr101222[0], new java.lang.Class[0]).invoke(null, null);
                                            if (context3 != null) {
                                            }
                                            java.lang.Object[] objArr102222 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1497262055};
                                            byte[] bArr11222 = $$d;
                                            byte b14222 = bArr11222[63];
                                            java.lang.Object[] objArr103222 = new java.lang.Object[1];
                                            d(b14222, 469, b14222, objArr103222);
                                            java.lang.Class<?> cls37222 = java.lang.Class.forName((java.lang.String) objArr103222[0]);
                                            java.lang.Object[] objArr104222 = new java.lang.Object[1];
                                            d(bArr11222[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr11222[43]), objArr104222);
                                            java.lang.String str19222 = (java.lang.String) objArr104222[0];
                                            int i234222 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                            int i235222 = (i234222 * (-51)) + 6678;
                                            int i236222 = ~java.lang.System.identityHashCode(setsaveenabled);
                                            int i237222 = (i236222 ^ i234222) | (i236222 & i234222);
                                            int i238222 = -(-((~((i237222 & 126) | (i237222 ^ 126))) * 52));
                                            int i239222 = (i235222 ^ i238222) + ((i235222 & i238222) << 1);
                                            int i240222 = (~(i236222 | androidx.compose.runtime.ComposerKt.defaultsKey)) | (~((i234222 ^ androidx.compose.runtime.ComposerKt.defaultsKey) | (i234222 & androidx.compose.runtime.ComposerKt.defaultsKey)));
                                            int i241222 = ~(i236222 | i234222);
                                            int i242222 = ((i240222 & i241222) | (i240222 ^ i241222)) * (-52);
                                            int i243222 = ((i239222 | i242222) << 1) - (i242222 ^ i239222);
                                            int i244222 = ~i234222;
                                            int i245222 = ~((i236222 & i244222) | (i244222 ^ i236222));
                                            int i246222 = ~((i244222 ^ 126) | (i244222 & 126));
                                            int i247222 = -(-(((i246222 ^ i245222) | (i246222 & i245222)) * 52));
                                            java.lang.Object[] objArr105222 = new java.lang.Object[1];
                                            e(null, null, (i243222 & i247222) + (i247222 | i243222), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr105222);
                                            objArr4 = (java.lang.Object[]) cls37222.getMethod(str19222, java.lang.Class.forName((java.lang.String) objArr105222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr102222);
                                            if (context3 == null) {
                                            }
                                        } else {
                                            setsaveenabled.values.writeReplace("Transaction was successful", new java.lang.Object[0]);
                                            setsaveenabled.DigitizedCardProfile.setAction(com.payair.model.PaymentIntentKeys.ACTION_CONTACTLESS_COMPLETE);
                                        }
                                        z2 = true;
                                        z3 = z2;
                                        z4 = false;
                                        if (!z4) {
                                        }
                                        values(new java.lang.Object[]{setsaveenabled, java.lang.Boolean.valueOf(z4), sendrequest, java.lang.Boolean.valueOf(z3), valueOf2, currency, setselectedcard}, 1907310274, -1907310271, java.lang.System.identityHashCode(setsaveenabled));
                                        com.payair.hce.removeCard AlternateContactlessPaymentDataJson2 = setselectedcard.AlternateContactlessPaymentDataJson();
                                        if (z3) {
                                            int i1082 = getGpoResponse;
                                            i11 = ((i1082 | 47) << 1) - (i1082 ^ 47);
                                            getCvrMaskAnd = i11 % 128;
                                            if (i11 % 2 == 0) {
                                            }
                                        }
                                        java.lang.String str152 = str2;
                                        java.lang.Class cls102 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.graphics.Color.alpha(0), 753 - android.text.TextUtils.indexOf(str152, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (45560 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                        byte b42 = (byte) (-bArr[11]);
                                        byte b52 = bArr[21];
                                        int i1092 = $$b;
                                        byte b62 = (byte) (i1092 + 5);
                                        java.lang.Object[] objArr292 = new java.lang.Object[1];
                                        c(b42, b52, b62, objArr292);
                                        j = cls102.getField((java.lang.String) objArr292[0]).getLong(null);
                                        if (j != -1) {
                                        }
                                        java.lang.Object[] objArr1192 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1352357408};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                        if (obj == null) {
                                        }
                                        java.lang.Object invoke32 = ((java.lang.reflect.Method) obj).invoke(null, objArr1192);
                                        java.lang.Class cls472 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 47, 754 - android.text.TextUtils.getTrimmedLength(str152), (char) (android.view.KeyEvent.normalizeMetaState(0) + 45560));
                                        java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                        c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr1212);
                                        cls472.getField((java.lang.String) objArr1212[0]).set(null, invoke32);
                                        long longValue62 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Class cls482 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 47, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 755, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 45560));
                                        java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                        c((byte) (-bArr[11]), bArr[21], b62, objArr1222);
                                        cls482.getField((java.lang.String) objArr1222[0]).set(null, java.lang.Long.valueOf(longValue62));
                                        obj2 = invoke32;
                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                        if (obj3 == null) {
                                        }
                                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj2, null)).intValue();
                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                        if (obj4 == null) {
                                        }
                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(obj2, null)).intValue() != intValue) {
                                        }
                                        java.lang.Class cls1322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 922, (char) android.view.View.MeasureSpec.getMode(0));
                                        byte b722 = (byte) (i1092 + 2);
                                        java.lang.Object[] objArr3822 = new java.lang.Object[1];
                                        c((byte) (-bArr[116]), (short) 58, b722, objArr3822);
                                        j2 = cls1322.getField((java.lang.String) objArr3822[0]).getLong(null);
                                        if (j2 != -1) {
                                        }
                                        int intValue222 = ((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue();
                                        java.lang.Object[] objArr11622 = {-242670264};
                                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                        if (obj5 == null) {
                                        }
                                        writeReplace$4956fc2a = com.payair.hce.getAlternateContactlessPaymentData.writeReplace$4956fc2a(intValue222, ((java.lang.reflect.Constructor) obj5).newInstance(objArr11622));
                                        java.lang.Class cls4422 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, 922 - android.view.View.resolveSize(0, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                        java.lang.Object[] objArr11722 = new java.lang.Object[1];
                                        c(bArr[34], bArr[37], bArr[28], objArr11722);
                                        cls4422.getField((java.lang.String) objArr11722[0]).set(null, writeReplace$4956fc2a);
                                        long longValue522 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Class cls4522 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 44, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 922, (char) android.text.TextUtils.indexOf(str152, str152, 0));
                                        java.lang.Object[] objArr11822 = new java.lang.Object[1];
                                        c((byte) (-bArr[116]), (short) 58, b722, objArr11822);
                                        cls4522.getField((java.lang.String) objArr11822[0]).set(null, java.lang.Long.valueOf(longValue522));
                                        int i28622 = getCvrMaskAnd;
                                        getGpoResponse = ((i28622 & 33) + (i28622 | 33)) % 128;
                                        i4 = ((int[]) writeReplace$4956fc2a[1])[0];
                                        if (((int[]) writeReplace$4956fc2a[0])[0] == i4) {
                                        }
                                        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.FALSE}, -1511834785, 1511834800, (int) java.lang.System.currentTimeMillis());
                                        java.lang.Class cls16222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 667, (char) (android.graphics.Color.alpha(0) + 40024));
                                        java.lang.Object[] objArr46222 = new java.lang.Object[1];
                                        c((byte) (-bArr[11]), bArr[21], b62, objArr46222);
                                        j3 = cls16222.getField((java.lang.String) objArr46222[0]).getLong(null);
                                        if (j3 != -1) {
                                        }
                                        char c11222 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int i248222 = -android.graphics.Color.red(0);
                                        int identityHashCode18222 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i249222 = i248222 * (-830);
                                        int i250222 = ((i249222 | 21632) << 1) - (i249222 ^ 21632);
                                        int i251222 = ~identityHashCode18222;
                                        int i252222 = ~((i251222 ^ (-27)) | (i251222 & (-27)));
                                        int i253222 = ~(i248222 | 26 | identityHashCode18222);
                                        int i254222 = -(-(((i252222 ^ i253222) | (i252222 & i253222)) * (-831)));
                                        int i255222 = (i250222 & i254222) + (i250222 | i254222);
                                        int i256222 = (i248222 ^ (-27)) | (i248222 & (-27));
                                        int i257222 = -(-((~((i256222 ^ identityHashCode18222) | (i256222 & identityHashCode18222))) * (-1662)));
                                        int i258222 = ~(i251222 | (~i248222));
                                        int i259222 = ~((i248222 ^ identityHashCode18222) | (i248222 & identityHashCode18222));
                                        int i260222 = (i259222 ^ i258222) | (i259222 & i258222);
                                        int i261222 = ~((identityHashCode18222 ^ 26) | (identityHashCode18222 & 26));
                                        b = b722;
                                        java.lang.Object[] objArr108222 = new java.lang.Object[1];
                                        b(c11222, (i255222 & i257222) + (i257222 | i255222) + (((i260222 ^ i261222) | (i260222 & i261222)) * 831), 69 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr108222);
                                        java.lang.Class<?> cls40222 = java.lang.Class.forName((java.lang.String) objArr108222[0]);
                                        int packedPositionGroup222 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                        int identityHashCode19222 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i262222 = packedPositionGroup222 | 12184;
                                        int i263222 = ~packedPositionGroup222;
                                        int i264222 = ~((i263222 & (-12185)) | (i263222 ^ (-12185)));
                                        int i265222 = ~identityHashCode19222;
                                        int i266222 = ~(i263222 | i265222);
                                        int i267222 = (i264222 ^ i266222) | (i264222 & i266222);
                                        int i268222 = ~((i262222 ^ identityHashCode19222) | (i262222 & identityHashCode19222));
                                        str6 = "valueOf";
                                        int i269222 = (packedPositionGroup222 * 503) + 6128552 + (i262222 * (-502)) + (((i267222 ^ i268222) | (i267222 & i268222)) * (-502));
                                        int i270222 = (i263222 ^ i265222) | (i263222 & i265222);
                                        int i271222 = ~((i270222 ^ 12184) | (i270222 & 12184));
                                        int i272222 = (packedPositionGroup222 ^ 12184) | (packedPositionGroup222 & 12184);
                                        int i273222 = ~((i272222 ^ identityHashCode19222) | (i272222 & identityHashCode19222));
                                        int i274222 = ((i273222 ^ i271222) | (i273222 & i271222)) * 502;
                                        char c12222 = (char) ((i269222 ^ i274222) + ((i274222 & i269222) << 1));
                                        int i275222 = -(-android.text.TextUtils.indexOf(str152, str152, 0, 0));
                                        int i276222 = -android.text.TextUtils.lastIndexOf(str152, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                        int identityHashCode20222 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i277222 = (i276222 * (-419)) + 39574;
                                        int i278222 = -(-((~((identityHashCode20222 ^ 94) | (identityHashCode20222 & 94))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                        int i279222 = ~i276222;
                                        int i280222 = (i277222 ^ i278222) + ((i277222 & i278222) << 1) + (((i279222 & 94) | (i279222 ^ 94)) * (-420));
                                        int i281222 = ~(i279222 | (-95));
                                        int i282222 = ~identityHashCode20222;
                                        int i283222 = ~((i282222 ^ 94) | (i282222 & 94));
                                        int i284222 = -(-(((i281222 ^ i283222) | (i281222 & i283222)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                        java.lang.Object[] objArr109222 = new java.lang.Object[1];
                                        b(c12222, ((i275222 | 18) << 1) - (i275222 ^ 18), (i280222 & i284222) + (i284222 | i280222), objArr109222);
                                        context2 = (android.content.Context) cls40222.getMethod((java.lang.String) objArr109222[0], new java.lang.Class[0]).invoke(null, null);
                                        if (context2 != null) {
                                        }
                                        java.lang.Object[] objArr110222 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 0, 1961567294};
                                        byte[] bArr12222 = $$d;
                                        java.lang.Object[] objArr111222 = new java.lang.Object[1];
                                        d(bArr12222[165], 544, bArr12222[63], objArr111222);
                                        java.lang.Class<?> cls41222 = java.lang.Class.forName((java.lang.String) objArr111222[0]);
                                        java.lang.Object[] objArr112222 = new java.lang.Object[1];
                                        d(bArr12222[376], 620, bArr12222[189], objArr112222);
                                        java.lang.String str20222 = (java.lang.String) objArr112222[0];
                                        int i285222 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        java.lang.Object[] objArr113222 = new java.lang.Object[1];
                                        e(null, null, (i285222 ^ 127) + ((i285222 & 127) << 1), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr113222);
                                        objArr3 = (java.lang.Object[]) cls41222.getMethod(str20222, java.lang.Class.forName((java.lang.String) objArr113222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr110222);
                                        java.lang.Class cls42222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, android.text.TextUtils.indexOf(str152, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 668, (char) (40023 - android.text.TextUtils.indexOf(str152, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                        java.lang.Object[] objArr114222 = new java.lang.Object[1];
                                        c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr114222);
                                        cls42222.getField((java.lang.String) objArr114222[0]).set(null, objArr3);
                                        long longValue4222 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Class cls43222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 667 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.MotionEvent.axisFromString(str152) + 40025));
                                        i5 = 1;
                                        java.lang.Object[] objArr115222 = new java.lang.Object[1];
                                        c((byte) (-bArr[11]), bArr[21], b62, objArr115222);
                                        c2 = 0;
                                        cls43222.getField((java.lang.String) objArr115222[0]).set(null, java.lang.Long.valueOf(longValue4222));
                                        i6 = ((int[]) objArr3[i5])[c2];
                                        if (((int[]) objArr3[c2])[c2] != i6) {
                                        }
                                        java.lang.Class cls192222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 584 - android.view.View.resolveSize(0, 0), (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                        java.lang.Object[] objArr572222 = new java.lang.Object[1];
                                        c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr572222);
                                        j4 = cls192222.getField((java.lang.String) objArr572222[0]).getLong(null);
                                        if (j4 != -1) {
                                        }
                                        char keyRepeatDelay2222 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i2092222 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        int identityHashCode162222 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i2102222 = ~i2092222;
                                        int i2112222 = ~identityHashCode162222;
                                        int i2122222 = (i2102222 & (-28)) | (i2102222 ^ (-28));
                                        int i2132222 = ~((i2122222 ^ identityHashCode162222) | (i2122222 & identityHashCode162222));
                                        int i2142222 = (i2112222 ^ i2092222) | (i2112222 & i2092222);
                                        int i2152222 = ~((i2142222 ^ 27) | (i2142222 & 27));
                                        b2 = b62;
                                        str7 = str6;
                                        int i2162222 = ((i2092222 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - 24381) + (((~((i2112222 ^ 27) | (i2112222 & 27))) | (~(i2102222 | identityHashCode162222))) * (-1808)) + (((i2132222 ^ i2152222) | (i2152222 & i2132222)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                                        int i2172222 = (~(i2102222 | 27)) | (~((identityHashCode162222 & (-28)) | (identityHashCode162222 ^ (-28))));
                                        int i2182222 = ~(i2092222 | i2112222);
                                        int i2192222 = -(-(((i2182222 ^ i2172222) | (i2172222 & i2182222)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                                        int i2202222 = -android.text.TextUtils.indexOf(str152, str152);
                                        java.lang.Object[] objArr1002222 = new java.lang.Object[1];
                                        b(keyRepeatDelay2222, (i2162222 & i2192222) + (i2162222 | i2192222), ((i2202222 | 69) << 1) - (i2202222 ^ 69), objArr1002222);
                                        java.lang.Class<?> cls362222 = java.lang.Class.forName((java.lang.String) objArr1002222[0]);
                                        int i2212222 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int identityHashCode172222 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i2222222 = i2212222 * 714;
                                        int i2232222 = ((-8675008) ^ i2222222) + ((i2222222 & (-8675008)) << 1);
                                        int i2242222 = ~i2212222;
                                        int i2252222 = ~identityHashCode172222;
                                        int i2262222 = ~((i2242222 & i2252222) | (i2242222 ^ i2252222));
                                        int i2272222 = ~((i2242222 ^ 12184) | (i2242222 & 12184));
                                        int i2282222 = -(-(((i2272222 ^ i2262222) | (i2262222 & i2272222) | (~(i2212222 | (-12185) | identityHashCode172222))) * (-713)));
                                        int i2292222 = (i2232222 ^ i2282222) + ((i2282222 & i2232222) << 1);
                                        int i2302222 = (~((i2212222 ^ (-12185)) | (i2212222 & (-12185)) | identityHashCode172222)) * 1426;
                                        int i2312222 = ((i2292222 | i2302222) << 1) - (i2302222 ^ i2292222);
                                        int i2322222 = (~(i2252222 | (-12185))) * 713;
                                        char c102222 = (char) ((i2312222 ^ i2322222) + ((i2322222 & i2312222) << 1));
                                        int i2332222 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                        int indexOf22222 = android.text.TextUtils.indexOf(str152, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                        java.lang.Object[] objArr1012222 = new java.lang.Object[1];
                                        b(c102222, (i2332222 ^ 18) + ((i2332222 & 18) << 1), (indexOf22222 ^ 96) + ((indexOf22222 & 96) << 1), objArr1012222);
                                        context3 = (android.content.Context) cls362222.getMethod((java.lang.String) objArr1012222[0], new java.lang.Class[0]).invoke(null, null);
                                        if (context3 != null) {
                                        }
                                        java.lang.Object[] objArr1022222 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1497262055};
                                        byte[] bArr112222 = $$d;
                                        byte b142222 = bArr112222[63];
                                        java.lang.Object[] objArr1032222 = new java.lang.Object[1];
                                        d(b142222, 469, b142222, objArr1032222);
                                        java.lang.Class<?> cls372222 = java.lang.Class.forName((java.lang.String) objArr1032222[0]);
                                        java.lang.Object[] objArr1042222 = new java.lang.Object[1];
                                        d(bArr112222[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr112222[43]), objArr1042222);
                                        java.lang.String str192222 = (java.lang.String) objArr1042222[0];
                                        int i2342222 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                        int i2352222 = (i2342222 * (-51)) + 6678;
                                        int i2362222 = ~java.lang.System.identityHashCode(setsaveenabled);
                                        int i2372222 = (i2362222 ^ i2342222) | (i2362222 & i2342222);
                                        int i2382222 = -(-((~((i2372222 & 126) | (i2372222 ^ 126))) * 52));
                                        int i2392222 = (i2352222 ^ i2382222) + ((i2352222 & i2382222) << 1);
                                        int i2402222 = (~(i2362222 | androidx.compose.runtime.ComposerKt.defaultsKey)) | (~((i2342222 ^ androidx.compose.runtime.ComposerKt.defaultsKey) | (i2342222 & androidx.compose.runtime.ComposerKt.defaultsKey)));
                                        int i2412222 = ~(i2362222 | i2342222);
                                        int i2422222 = ((i2402222 & i2412222) | (i2402222 ^ i2412222)) * (-52);
                                        int i2432222 = ((i2392222 | i2422222) << 1) - (i2422222 ^ i2392222);
                                        int i2442222 = ~i2342222;
                                        int i2452222 = ~((i2362222 & i2442222) | (i2442222 ^ i2362222));
                                        int i2462222 = ~((i2442222 ^ 126) | (i2442222 & 126));
                                        int i2472222 = -(-(((i2462222 ^ i2452222) | (i2462222 & i2452222)) * 52));
                                        java.lang.Object[] objArr1052222 = new java.lang.Object[1];
                                        e(null, null, (i2432222 & i2472222) + (i2472222 | i2432222), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr1052222);
                                        objArr4 = (java.lang.Object[]) cls372222.getMethod(str192222, java.lang.Class.forName((java.lang.String) objArr1052222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1022222);
                                        if (context3 == null) {
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    long longValue42222 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Class cls432222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 667 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.MotionEvent.axisFromString(str152) + 40025));
                                    i5 = 1;
                                    java.lang.Object[] objArr1152222 = new java.lang.Object[1];
                                    c((byte) (-bArr[11]), bArr[21], b62, objArr1152222);
                                    c2 = 0;
                                    cls432222.getField((java.lang.String) objArr1152222[0]).set(null, java.lang.Long.valueOf(longValue42222));
                                    i6 = ((int[]) objArr3[i5])[c2];
                                    if (((int[]) objArr3[c2])[c2] != i6) {
                                    }
                                    java.lang.Class cls1922222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 584 - android.view.View.resolveSize(0, 0), (char) (24291 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                    java.lang.Object[] objArr5722222 = new java.lang.Object[1];
                                    c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr5722222);
                                    j4 = cls1922222.getField((java.lang.String) objArr5722222[0]).getLong(null);
                                    if (j4 != -1) {
                                    }
                                    char keyRepeatDelay22222 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    int i20922222 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    int identityHashCode1622222 = java.lang.System.identityHashCode(setsaveenabled);
                                    int i21022222 = ~i20922222;
                                    int i21122222 = ~identityHashCode1622222;
                                    int i21222222 = (i21022222 & (-28)) | (i21022222 ^ (-28));
                                    int i21322222 = ~((i21222222 ^ identityHashCode1622222) | (i21222222 & identityHashCode1622222));
                                    int i21422222 = (i21122222 ^ i20922222) | (i21122222 & i20922222);
                                    int i21522222 = ~((i21422222 ^ 27) | (i21422222 & 27));
                                    b2 = b62;
                                    str7 = str6;
                                    int i21622222 = ((i20922222 * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - 24381) + (((~((i21122222 ^ 27) | (i21122222 & 27))) | (~(i21022222 | identityHashCode1622222))) * (-1808)) + (((i21322222 ^ i21522222) | (i21522222 & i21322222)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                                    int i21722222 = (~(i21022222 | 27)) | (~((identityHashCode1622222 & (-28)) | (identityHashCode1622222 ^ (-28))));
                                    int i21822222 = ~(i20922222 | i21122222);
                                    int i21922222 = -(-(((i21822222 ^ i21722222) | (i21722222 & i21822222)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN));
                                    int i22022222 = -android.text.TextUtils.indexOf(str152, str152);
                                    java.lang.Object[] objArr10022222 = new java.lang.Object[1];
                                    b(keyRepeatDelay22222, (i21622222 & i21922222) + (i21622222 | i21922222), ((i22022222 | 69) << 1) - (i22022222 ^ 69), objArr10022222);
                                    java.lang.Class<?> cls3622222 = java.lang.Class.forName((java.lang.String) objArr10022222[0]);
                                    int i22122222 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    int identityHashCode1722222 = java.lang.System.identityHashCode(setsaveenabled);
                                    int i22222222 = i22122222 * 714;
                                    int i22322222 = ((-8675008) ^ i22222222) + ((i22222222 & (-8675008)) << 1);
                                    int i22422222 = ~i22122222;
                                    int i22522222 = ~identityHashCode1722222;
                                    int i22622222 = ~((i22422222 & i22522222) | (i22422222 ^ i22522222));
                                    int i22722222 = ~((i22422222 ^ 12184) | (i22422222 & 12184));
                                    int i22822222 = -(-(((i22722222 ^ i22622222) | (i22622222 & i22722222) | (~(i22122222 | (-12185) | identityHashCode1722222))) * (-713)));
                                    int i22922222 = (i22322222 ^ i22822222) + ((i22822222 & i22322222) << 1);
                                    int i23022222 = (~((i22122222 ^ (-12185)) | (i22122222 & (-12185)) | identityHashCode1722222)) * 1426;
                                    int i23122222 = ((i22922222 | i23022222) << 1) - (i23022222 ^ i22922222);
                                    int i23222222 = (~(i22522222 | (-12185))) * 713;
                                    char c1022222 = (char) ((i23122222 ^ i23222222) + ((i23222222 & i23122222) << 1));
                                    int i23322222 = -(-(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    int indexOf222222 = android.text.TextUtils.indexOf(str152, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    java.lang.Object[] objArr10122222 = new java.lang.Object[1];
                                    b(c1022222, (i23322222 ^ 18) + ((i23322222 & 18) << 1), (indexOf222222 ^ 96) + ((indexOf222222 & 96) << 1), objArr10122222);
                                    context3 = (android.content.Context) cls3622222.getMethod((java.lang.String) objArr10122222[0], new java.lang.Class[0]).invoke(null, null);
                                    if (context3 != null) {
                                    }
                                    java.lang.Object[] objArr10222222 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1497262055};
                                    byte[] bArr1122222 = $$d;
                                    byte b1422222 = bArr1122222[63];
                                    java.lang.Object[] objArr10322222 = new java.lang.Object[1];
                                    d(b1422222, 469, b1422222, objArr10322222);
                                    java.lang.Class<?> cls3722222 = java.lang.Class.forName((java.lang.String) objArr10322222[0]);
                                    java.lang.Object[] objArr10422222 = new java.lang.Object[1];
                                    d(bArr1122222[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr1122222[43]), objArr10422222);
                                    java.lang.String str1922222 = (java.lang.String) objArr10422222[0];
                                    int i23422222 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                    int i23522222 = (i23422222 * (-51)) + 6678;
                                    int i23622222 = ~java.lang.System.identityHashCode(setsaveenabled);
                                    int i23722222 = (i23622222 ^ i23422222) | (i23622222 & i23422222);
                                    int i23822222 = -(-((~((i23722222 & 126) | (i23722222 ^ 126))) * 52));
                                    int i23922222 = (i23522222 ^ i23822222) + ((i23522222 & i23822222) << 1);
                                    int i24022222 = (~(i23622222 | androidx.compose.runtime.ComposerKt.defaultsKey)) | (~((i23422222 ^ androidx.compose.runtime.ComposerKt.defaultsKey) | (i23422222 & androidx.compose.runtime.ComposerKt.defaultsKey)));
                                    int i24122222 = ~(i23622222 | i23422222);
                                    int i24222222 = ((i24022222 & i24122222) | (i24022222 ^ i24122222)) * (-52);
                                    int i24322222 = ((i23922222 | i24222222) << 1) - (i24222222 ^ i23922222);
                                    int i24422222 = ~i23422222;
                                    int i24522222 = ~((i23622222 & i24422222) | (i24422222 ^ i23622222));
                                    int i24622222 = ~((i24422222 ^ 126) | (i24422222 & 126));
                                    int i24722222 = -(-(((i24622222 ^ i24522222) | (i24622222 & i24522222)) * 52));
                                    java.lang.Object[] objArr10522222 = new java.lang.Object[1];
                                    e(null, null, (i24322222 & i24722222) + (i24722222 | i24322222), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr10522222);
                                    objArr4 = (java.lang.Object[]) cls3722222.getMethod(str1922222, java.lang.Class.forName((java.lang.String) objArr10522222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr10222222);
                                    if (context3 == null) {
                                    }
                                } catch (java.lang.Exception unused4) {
                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                }
                                long longValue5222 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls45222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 44, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 922, (char) android.text.TextUtils.indexOf(str152, str152, 0));
                                java.lang.Object[] objArr118222 = new java.lang.Object[1];
                                c((byte) (-bArr[116]), (short) 58, b722, objArr118222);
                                cls45222.getField((java.lang.String) objArr118222[0]).set(null, java.lang.Long.valueOf(longValue5222));
                                int i286222 = getCvrMaskAnd;
                                getGpoResponse = ((i286222 & 33) + (i286222 | 33)) % 128;
                                i4 = ((int[]) writeReplace$4956fc2a[1])[0];
                                if (((int[]) writeReplace$4956fc2a[0])[0] == i4) {
                                }
                                com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{java.lang.Boolean.FALSE}, -1511834785, 1511834800, (int) java.lang.System.currentTimeMillis());
                                java.lang.Class cls162222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 667, (char) (android.graphics.Color.alpha(0) + 40024));
                                java.lang.Object[] objArr462222 = new java.lang.Object[1];
                                c((byte) (-bArr[11]), bArr[21], b62, objArr462222);
                                j3 = cls162222.getField((java.lang.String) objArr462222[0]).getLong(null);
                                if (j3 != -1) {
                                }
                                char c112222 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i2482222 = -android.graphics.Color.red(0);
                                int identityHashCode182222 = java.lang.System.identityHashCode(setsaveenabled);
                                int i2492222 = i2482222 * (-830);
                                int i2502222 = ((i2492222 | 21632) << 1) - (i2492222 ^ 21632);
                                int i2512222 = ~identityHashCode182222;
                                int i2522222 = ~((i2512222 ^ (-27)) | (i2512222 & (-27)));
                                int i2532222 = ~(i2482222 | 26 | identityHashCode182222);
                                int i2542222 = -(-(((i2522222 ^ i2532222) | (i2522222 & i2532222)) * (-831)));
                                int i2552222 = (i2502222 & i2542222) + (i2502222 | i2542222);
                                int i2562222 = (i2482222 ^ (-27)) | (i2482222 & (-27));
                                int i2572222 = -(-((~((i2562222 ^ identityHashCode182222) | (i2562222 & identityHashCode182222))) * (-1662)));
                                int i2582222 = ~(i2512222 | (~i2482222));
                                int i2592222 = ~((i2482222 ^ identityHashCode182222) | (i2482222 & identityHashCode182222));
                                int i2602222 = (i2592222 ^ i2582222) | (i2592222 & i2582222);
                                int i2612222 = ~((identityHashCode182222 ^ 26) | (identityHashCode182222 & 26));
                                b = b722;
                                java.lang.Object[] objArr1082222 = new java.lang.Object[1];
                                b(c112222, (i2552222 & i2572222) + (i2572222 | i2552222) + (((i2602222 ^ i2612222) | (i2602222 & i2612222)) * 831), 69 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr1082222);
                                java.lang.Class<?> cls402222 = java.lang.Class.forName((java.lang.String) objArr1082222[0]);
                                int packedPositionGroup2222 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                int identityHashCode192222 = java.lang.System.identityHashCode(setsaveenabled);
                                int i2622222 = packedPositionGroup2222 | 12184;
                                int i2632222 = ~packedPositionGroup2222;
                                int i2642222 = ~((i2632222 & (-12185)) | (i2632222 ^ (-12185)));
                                int i2652222 = ~identityHashCode192222;
                                int i2662222 = ~(i2632222 | i2652222);
                                int i2672222 = (i2642222 ^ i2662222) | (i2642222 & i2662222);
                                int i2682222 = ~((i2622222 ^ identityHashCode192222) | (i2622222 & identityHashCode192222));
                                str6 = "valueOf";
                                int i2692222 = (packedPositionGroup2222 * 503) + 6128552 + (i2622222 * (-502)) + (((i2672222 ^ i2682222) | (i2672222 & i2682222)) * (-502));
                                int i2702222 = (i2632222 ^ i2652222) | (i2632222 & i2652222);
                                int i2712222 = ~((i2702222 ^ 12184) | (i2702222 & 12184));
                                int i2722222 = (packedPositionGroup2222 ^ 12184) | (packedPositionGroup2222 & 12184);
                                int i2732222 = ~((i2722222 ^ identityHashCode192222) | (i2722222 & identityHashCode192222));
                                int i2742222 = ((i2732222 ^ i2712222) | (i2732222 & i2712222)) * 502;
                                char c122222 = (char) ((i2692222 ^ i2742222) + ((i2742222 & i2692222) << 1));
                                int i2752222 = -(-android.text.TextUtils.indexOf(str152, str152, 0, 0));
                                int i2762222 = -android.text.TextUtils.lastIndexOf(str152, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                int identityHashCode202222 = java.lang.System.identityHashCode(setsaveenabled);
                                int i2772222 = (i2762222 * (-419)) + 39574;
                                int i2782222 = -(-((~((identityHashCode202222 ^ 94) | (identityHashCode202222 & 94))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                int i2792222 = ~i2762222;
                                int i2802222 = (i2772222 ^ i2782222) + ((i2772222 & i2782222) << 1) + (((i2792222 & 94) | (i2792222 ^ 94)) * (-420));
                                int i2812222 = ~(i2792222 | (-95));
                                int i2822222 = ~identityHashCode202222;
                                int i2832222 = ~((i2822222 ^ 94) | (i2822222 & 94));
                                int i2842222 = -(-(((i2812222 ^ i2832222) | (i2812222 & i2832222)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                                java.lang.Object[] objArr1092222 = new java.lang.Object[1];
                                b(c122222, ((i2752222 | 18) << 1) - (i2752222 ^ 18), (i2802222 & i2842222) + (i2842222 | i2802222), objArr1092222);
                                context2 = (android.content.Context) cls402222.getMethod((java.lang.String) objArr1092222[0], new java.lang.Class[0]).invoke(null, null);
                                if (context2 != null) {
                                }
                                java.lang.Object[] objArr1102222 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 0, 1961567294};
                                byte[] bArr122222 = $$d;
                                java.lang.Object[] objArr1112222 = new java.lang.Object[1];
                                d(bArr122222[165], 544, bArr122222[63], objArr1112222);
                                java.lang.Class<?> cls412222 = java.lang.Class.forName((java.lang.String) objArr1112222[0]);
                                java.lang.Object[] objArr1122222 = new java.lang.Object[1];
                                d(bArr122222[376], 620, bArr122222[189], objArr1122222);
                                java.lang.String str202222 = (java.lang.String) objArr1122222[0];
                                int i2852222 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                java.lang.Object[] objArr1132222 = new java.lang.Object[1];
                                e(null, null, (i2852222 ^ 127) + ((i2852222 & 127) << 1), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr1132222);
                                objArr3 = (java.lang.Object[]) cls412222.getMethod(str202222, java.lang.Class.forName((java.lang.String) objArr1132222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1102222);
                                java.lang.Class cls422222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, android.text.TextUtils.indexOf(str152, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 668, (char) (40023 - android.text.TextUtils.indexOf(str152, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                java.lang.Object[] objArr1142222 = new java.lang.Object[1];
                                c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr1142222);
                                cls422222.getField((java.lang.String) objArr1142222[0]).set(null, objArr3);
                            } catch (java.lang.Exception unused5) {
                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                            }
                            long longValue622 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls4822 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 47, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 755, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 45560));
                            java.lang.Object[] objArr12222 = new java.lang.Object[1];
                            c((byte) (-bArr[11]), bArr[21], b62, objArr12222);
                            cls4822.getField((java.lang.String) objArr12222[0]).set(null, java.lang.Long.valueOf(longValue622));
                            obj2 = invoke32;
                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                            if (obj3 == null) {
                            }
                            intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj2, null)).intValue();
                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                            if (obj4 == null) {
                            }
                            if (((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(obj2, null)).intValue() != intValue) {
                            }
                            java.lang.Class cls13222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 922, (char) android.view.View.MeasureSpec.getMode(0));
                            byte b7222 = (byte) (i1092 + 2);
                            java.lang.Object[] objArr38222 = new java.lang.Object[1];
                            c((byte) (-bArr[116]), (short) 58, b7222, objArr38222);
                            j2 = cls13222.getField((java.lang.String) objArr38222[0]).getLong(null);
                            if (j2 != -1) {
                            }
                            int intValue2222 = ((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue();
                            java.lang.Object[] objArr116222 = {-242670264};
                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                            if (obj5 == null) {
                            }
                            writeReplace$4956fc2a = com.payair.hce.getAlternateContactlessPaymentData.writeReplace$4956fc2a(intValue2222, ((java.lang.reflect.Constructor) obj5).newInstance(objArr116222));
                            java.lang.Class cls44222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, 922 - android.view.View.resolveSize(0, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                            java.lang.Object[] objArr117222 = new java.lang.Object[1];
                            c(bArr[34], bArr[37], bArr[28], objArr117222);
                            cls44222.getField((java.lang.String) objArr117222[0]).set(null, writeReplace$4956fc2a);
                        } catch (java.lang.Exception unused6) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                        java.lang.Object[] objArr123 = {context, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 0, 298612186};
                        byte[] bArr13 = $$d;
                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                        d(bArr13[8], 681, bArr13[63], objArr124);
                        java.lang.Class<?> cls49 = java.lang.Class.forName((java.lang.String) objArr124[0]);
                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                        d(bArr13[140], 700, bArr13[5], objArr125);
                        java.lang.String str21 = (java.lang.String) objArr125[0];
                        int i287 = -(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int identityHashCode21 = java.lang.System.identityHashCode(setsaveenabled);
                        int i288 = i287 * (-375);
                        int i289 = ((-47625) & i288) + (i288 | (-47625));
                        int i290 = ~i287;
                        int i291 = ~((i290 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i290 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                        int i292 = (i291 & identityHashCode21) | (identityHashCode21 ^ i291);
                        int i293 = ~((i287 ^ 127) | (i287 & 127));
                        int i294 = -(-(((i292 & i293) | (i292 ^ i293)) * 376));
                        int i295 = (i289 ^ i294) + ((i289 & i294) << 1);
                        int i296 = ~identityHashCode21;
                        int i297 = ~((i287 & i296) | (i296 ^ i287));
                        int i298 = ((i297 & i293) | (i297 ^ i293)) * (-376);
                        int i299 = ~(identityHashCode21 | i290);
                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                        e(null, null, (i295 & i298) + (i298 | i295) + (((i299 & 127) | (i299 ^ 127)) * 376), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr126);
                        objArr2 = (java.lang.Object[]) cls49.getMethod(str21, java.lang.Class.forName((java.lang.String) objArr126[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr123);
                        if (context != null) {
                            int i300 = getGpoResponse;
                            getCvrMaskAnd = ((i300 ^ 7) + ((i300 & 7) << 1)) % 128;
                            z = false;
                            java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1580, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                            java.lang.Object[] objArr127 = new java.lang.Object[1];
                            c((byte) (-bArr[116]), (short) 58, (byte) ($$b + 2), objArr127);
                            cls50.getField((java.lang.String) objArr127[0]).set(null, objArr2);
                            try {
                                str4 = str12;
                                long longValue7 = ((java.lang.Long) java.lang.Class.forName(str11).getDeclaredMethod(str4, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.green(0), 1581 - android.graphics.Color.red(0), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr128);
                                cls51.getField((java.lang.String) objArr128[0]).set(null, java.lang.Long.valueOf(longValue7));
                            } catch (java.lang.Exception unused7) {
                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                            }
                        } else {
                            str4 = str12;
                            z = false;
                        }
                        c = 1;
                        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[c])[0]) {
                        }
                        if (str3.length() != 4) {
                        }
                        DigitizedCardProfile = com.payair.hce.startInstrumentation.DigitizedCardProfile(str5);
                        if (DigitizedCardProfile == null) {
                        }
                        java.lang.Long valueOf22 = java.lang.Long.valueOf(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(setselectedcard.AlternateContactlessPaymentDataJson().AlternateContactlessPaymentDataJson()).writeReplace());
                        setsaveenabled.DigitizedCardProfile.putExtra("amount", valueOf22);
                        setsaveenabled.DigitizedCardProfile.putExtra("currency", currency);
                        setsaveenabled.DigitizedCardProfile.putExtra(com.payair.model.PaymentIntentKeys.PARAM_CURRENT, sendrequest.AlternateContactlessPaymentDataJson());
                        setsaveenabled.DigitizedCardProfile.putExtra(com.payair.model.PaymentIntentKeys.TRANSACTION_OUTCOME, setselectedcard.valueOf().toString());
                        i3 = com.payair.hce.setSaveEnabled.AnonymousClass2.values[setselectedcard.valueOf().ordinal()];
                        if (i3 == 1) {
                        }
                        z2 = true;
                        z3 = z2;
                        z4 = false;
                        if (!z4) {
                        }
                        values(new java.lang.Object[]{setsaveenabled, java.lang.Boolean.valueOf(z4), sendrequest, java.lang.Boolean.valueOf(z3), valueOf22, currency, setselectedcard}, 1907310274, -1907310271, java.lang.System.identityHashCode(setsaveenabled));
                        com.payair.hce.removeCard AlternateContactlessPaymentDataJson22 = setselectedcard.AlternateContactlessPaymentDataJson();
                        if (z3) {
                        }
                        java.lang.String str1522 = str2;
                        java.lang.Class cls1022 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.graphics.Color.alpha(0), 753 - android.text.TextUtils.indexOf(str1522, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (45560 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                        byte b422 = (byte) (-bArr[11]);
                        byte b522 = bArr[21];
                        int i10922 = $$b;
                        byte b622 = (byte) (i10922 + 5);
                        java.lang.Object[] objArr2922 = new java.lang.Object[1];
                        c(b422, b522, b622, objArr2922);
                        j = cls1022.getField((java.lang.String) objArr2922[0]).getLong(null);
                        if (j != -1) {
                        }
                        java.lang.Object[] objArr11922 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str13).getMethod(str14, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 1352357408};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                        if (obj == null) {
                        }
                        java.lang.Object invoke322 = ((java.lang.reflect.Method) obj).invoke(null, objArr11922);
                        java.lang.Class cls4722 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 47, 754 - android.text.TextUtils.getTrimmedLength(str1522), (char) (android.view.KeyEvent.normalizeMetaState(0) + 45560));
                        java.lang.Object[] objArr12122 = new java.lang.Object[1];
                        c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr12122);
                        cls4722.getField((java.lang.String) objArr12122[0]).set(null, invoke322);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                    char capsMode3 = (char) android.text.TextUtils.getCapsMode(str, i, i);
                    int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(i, i);
                    int i301 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
                    int identityHashCode22 = java.lang.System.identityHashCode(setsaveenabled);
                    int i302 = (~i301) | 68;
                    int i303 = ~i302;
                    str2 = str;
                    int i304 = ~identityHashCode22;
                    setselectedcard = setselectedcard2;
                    int i305 = ~((i304 ^ 68) | (i304 & 68));
                    str3 = writeReplace;
                    int i306 = ~((i301 ^ (-69)) | (i301 & (-69)));
                    int i307 = ~(i304 | i301);
                    bArr = bArr2;
                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                    b(capsMode3, resolveOpacity + 26, ((((((i301 * 141) - 18972) - (~(-(-(((identityHashCode22 ^ 68) | (identityHashCode22 & 68)) * 140))))) - 1) + (((i303 ^ i305) | (i303 & i305)) * (-280))) - (~((((i306 & i307) | (i306 ^ i307)) | (~(identityHashCode22 | i302))) * 140))) - 1, objArr129);
                    java.lang.Class<?> cls52 = java.lang.Class.forName((java.lang.String) objArr129[0]);
                    int i308 = -android.view.View.MeasureSpec.getSize(0);
                    int identityHashCode23 = java.lang.System.identityHashCode(setsaveenabled);
                    int i309 = i308 * 495;
                    int i310 = (((((-6006712) | i309) << 1) - (i309 ^ (-6006712))) - (~(((i308 ^ (-12185)) | (i308 & (-12185))) * (-988)))) - 1;
                    int i311 = ~i308;
                    int i312 = (i311 & 12184) | (i311 ^ 12184);
                    int i313 = ~identityHashCode23;
                    int i314 = -(-(((i312 & i313) | (i312 ^ i313)) * 494));
                    int i315 = (i310 ^ i314) + ((i310 & i314) << 1);
                    int i316 = ~((i311 ^ (-12185)) | (i311 & (-12185)));
                    int i317 = ~((i313 ^ 12184) | (i313 & 12184));
                    int i318 = (i317 ^ i316) | (i317 & i316);
                    int i319 = ~((i308 ^ 12184) | (i308 & 12184));
                    int i320 = ((i319 ^ i318) | (i319 & i318)) * 494;
                    char c13 = (char) ((i315 ^ i320) + ((i320 & i315) << 1));
                    int i321 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int identityHashCode24 = java.lang.System.identityHashCode(setsaveenabled);
                    int i322 = i321 * 866;
                    int i323 = ((i322 | (-14688)) << 1) - (i322 ^ (-14688));
                    int i324 = ~i321;
                    int i325 = ~identityHashCode24;
                    int i326 = ~((i324 & i325) | (i324 ^ i325));
                    int i327 = -(-(((i326 & (-18)) | (i326 ^ (-18))) * (-865)));
                    int i328 = ((i323 | i327) << 1) - (i327 ^ i323);
                    int i329 = -(-((~((i321 & identityHashCode24) | (identityHashCode24 ^ i321))) * 865));
                    int i330 = (i328 ^ i329) + ((i329 & i328) << 1);
                    int i331 = ~((i325 & (-18)) | (i325 ^ (-18)));
                    int i332 = ~((i321 ^ i325) | (i325 & i321));
                    int i333 = ((i332 ^ i331) | (i332 & i331)) * 865;
                    java.lang.Object[] objArr130 = new java.lang.Object[1];
                    b(c13, (i330 & i333) + (i333 | i330), android.view.View.MeasureSpec.getSize(0) + 95, objArr130);
                    context = (android.content.Context) cls52.getMethod((java.lang.String) objArr130[0], new java.lang.Class[0]).invoke(null, null);
                    if (context != null) {
                        int i334 = getCvrMaskAnd;
                        int i335 = (i334 ^ 117) + ((i334 & 117) << 1);
                        getGpoResponse = i335 % 128;
                        if (i335 % 2 == 0) {
                            context.getApplicationContext();
                            throw new java.lang.ArithmeticException();
                        }
                        context = context.getApplicationContext();
                    }
                } catch (java.lang.Exception unused8) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
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
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.unRegisterDevice unregisterdevice = (com.payair.hce.unRegisterDevice) objArr[0];
        com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments = (com.payair.hce.setNewDefaultCardForContactlessPayments) objArr[1];
        int i = getCvrMaskAnd;
        int i2 = i & 65;
        int i3 = (~i2) & (i | 65);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getGpoResponse = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (unregisterdevice != null) {
            int i6 = i & 55;
            int i7 = -(-((i ^ 55) | i6));
            int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
            getGpoResponse = i8 % 128;
            com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments2 = com.payair.hce.setNewDefaultCardForContactlessPayments.values;
            if (i8 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (setnewdefaultcardforcontactlesspayments == setnewdefaultcardforcontactlesspayments2 && unregisterdevice != com.payair.hce.unRegisterDevice.valueOf && unregisterdevice != com.payair.hce.unRegisterDevice.writeReplace) {
                int i9 = getCvrMaskAnd;
                int i10 = (((i9 & (-90)) | ((~i9) & 89)) + ((i9 & 89) << 1)) % 128;
                getGpoResponse = i10;
                getCvrMaskAnd = (((i10 | 65) << 1) - (i10 ^ 65)) % 128;
                return java.lang.Boolean.TRUE;
            }
        }
        int i11 = getGpoResponse;
        getCvrMaskAnd = ((i11 & 5) + (i11 | 5)) % 128;
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f1, code lost:
    
        new com.payair.hce.setIsCredential().DigitizedCardProfile();
        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 2112431470, -2112431463, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1891116219, 1891116251, (int) java.lang.System.currentTimeMillis());
        r2 = com.payair.hce.setSaveEnabled.getGpoResponse;
        r3 = r2 & 39;
        r2 = (r2 ^ 39) | r3;
        com.payair.hce.setSaveEnabled.getCvrMaskAnd = ((r3 ^ r2) + ((r2 & r3) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ef, code lost:
    
        if ((java.lang.System.currentTimeMillis() - ((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1878792450, -1878792396, (int) java.lang.System.currentTimeMillis())).longValue()) > 14000) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d0, code lost:
    
        if ((java.lang.System.currentTimeMillis() & ((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1878792450, -1878792396, (int) java.lang.System.currentTimeMillis())).longValue()) > 14000) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        boolean z;
        byte[] bArr;
        java.lang.String str;
        com.payair.hce.setSaveEnabled setsaveenabled = (com.payair.hce.setSaveEnabled) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        com.payair.hce.sendRequest sendrequest = (com.payair.hce.sendRequest) objArr[2];
        boolean booleanValue2 = ((java.lang.Boolean) objArr[3]).booleanValue();
        java.lang.Long l = (java.lang.Long) objArr[4];
        java.util.Currency currency = (java.util.Currency) objArr[5];
        com.payair.hce.setSelectedCard setselectedcard = (com.payair.hce.setSelectedCard) objArr[6];
        int i = getGpoResponse;
        getCvrMaskAnd = ((i ^ 3) + ((3 & i) << 1)) % 128;
        byte[] bytes = sendrequest.AlternateContactlessPaymentDataJson().getBytes();
        if (booleanValue) {
            z = booleanValue;
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bytes}, -503494143, 503494150, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.HCEPayment.setAuthenticationAquirer();
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.payair.hce.setSaveEnabled.4
                public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2, int i2, int i3, int i4) {
                    com.payair.hce.HCEPayment.setUserValidationRequestListener();
                    return null;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -577266740, 577266740, java.lang.System.identityHashCode(this));
                }
            });
            int i2 = getCvrMaskAnd;
            int i3 = i2 & 59;
            getGpoResponse = ((((i2 ^ 59) | i3) << 1) - ((i2 | 59) & (~i3))) % 128;
        } else {
            int i4 = getGpoResponse;
            int i5 = i4 & 51;
            int i6 = ((i4 ^ 51) | i5) << 1;
            int i7 = -((i4 | 51) & (~i5));
            getCvrMaskAnd = ((i6 & i7) + (i7 | i6)) % 128;
            com.payair.hce.HCEPayment.valueOf(new java.lang.Object[]{-1L}, -960893514, 960893514, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 526228066, -526228032, (int) java.lang.System.currentTimeMillis());
            if (((java.lang.Integer) com.payair.hce.setLongClickable.DigitizedCardProfile(new java.lang.Object[0], -455230668, 455230668, (int) java.lang.System.currentTimeMillis())).intValue() != com.payair.hce.setLongClickable.writeReplace()) {
                int i8 = (-2) - (~(getGpoResponse + 72));
                getCvrMaskAnd = i8 % 128;
                if (i8 % 2 != 0) {
                    bArr = bytes;
                    z = booleanValue;
                } else {
                    bArr = bytes;
                    z = booleanValue;
                }
            } else {
                z = booleanValue;
                bArr = bytes;
            }
            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{null}, -503494143, 503494150, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.HCEEventListener hCEEventListener = (com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis());
            if (setselectedcard.valueOf() != null) {
                getCvrMaskAnd = (getGpoResponse + 93) % 128;
                str = setselectedcard.valueOf().toString();
                int i9 = getGpoResponse;
                int i10 = i9 | 33;
                getCvrMaskAnd = ((i10 << 1) - ((~(i9 & 33)) & i10)) % 128;
            } else {
                int i11 = getCvrMaskAnd;
                getGpoResponse = (((i11 | 47) << 1) - (i11 ^ 47)) % 128;
                str = "";
            }
            hCEEventListener.onContactlessPaymentCompleted(bArr, booleanValue2, l, currency, str.getBytes());
            int i12 = getGpoResponse;
            int i13 = i12 ^ 29;
            int i14 = -(-((i12 & 29) << 1));
            getCvrMaskAnd = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
        }
        if (z) {
            int i15 = getCvrMaskAnd;
            int i16 = i15 & 55;
            int i17 = ((i15 ^ 55) | i16) << 1;
            int i18 = -((i15 | 55) & (~i16));
            getGpoResponse = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
            ((com.payair.hce.HCEEventListener) com.payair.hce.setAccessibilityHeading.valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).onShowAuthenticateScreen(false);
            int i19 = getCvrMaskAnd + 110;
            getGpoResponse = ((~i19) + (i19 << 1)) % 128;
        }
        com.payair.hce.setTranslationX.valueOf(new java.lang.Object[]{setsaveenabled.valueOf, setsaveenabled.DigitizedCardProfile}, 101450197, -101450197, (int) java.lang.System.currentTimeMillis());
        int i20 = getGpoResponse;
        int i21 = ((i20 | 11) << 1) - ((i20 & (-12)) | ((~i20) & 11));
        getCvrMaskAnd = i21 % 128;
        if (i21 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x1e9c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x2040  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x2308  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x252e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x2903  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x2ba8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x2e8f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x300b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x2d7e A[Catch: all -> 0x31a2, TryCatch #2 {all -> 0x31a2, blocks: (B:9:0x02e7, B:11:0x0308, B:12:0x0365, B:14:0x057a, B:16:0x0589, B:17:0x05bc, B:19:0x05d8, B:20:0x060f, B:24:0x06ac, B:26:0x06bb, B:27:0x06ed, B:29:0x0719, B:30:0x077b, B:37:0x0a4d, B:39:0x0a6e, B:40:0x0aaa, B:53:0x0e62, B:55:0x0e83, B:56:0x0ec5, B:62:0x10b6, B:64:0x10d3, B:65:0x110d, B:76:0x12e7, B:78:0x1308, B:79:0x1349, B:84:0x16c1, B:86:0x16de, B:87:0x171e, B:99:0x1aa2, B:101:0x1ac0, B:102:0x1afb, B:103:0x1bad, B:109:0x1eb1, B:111:0x1ece, B:112:0x1f11, B:123:0x20d5, B:125:0x20f6, B:126:0x2132, B:127:0x21df, B:132:0x2317, B:134:0x2334, B:135:0x236c, B:141:0x25a6, B:143:0x25c7, B:144:0x2607, B:152:0x29a7, B:154:0x29c4, B:155:0x2a03, B:163:0x2c26, B:165:0x2c47, B:166:0x2c84, B:167:0x2d33, B:174:0x2eaa, B:176:0x2ec6, B:177:0x2f08, B:185:0x2f19, B:187:0x2f36, B:188:0x2f73, B:192:0x30bb, B:194:0x30d8, B:195:0x311f, B:208:0x2ccf, B:210:0x2cf0, B:211:0x2d2c, B:213:0x2d59, B:215:0x2d7e, B:216:0x2dd7, B:230:0x2a15, B:232:0x2a32, B:233:0x2a77, B:237:0x2af0, B:239:0x2b0d, B:240:0x2b4c, B:271:0x23f1, B:273:0x240e, B:274:0x244d, B:277:0x217a, B:279:0x219b, B:280:0x21d8, B:296:0x1f8b, B:298:0x1fa8, B:299:0x1fe9, B:303:0x1b46, B:305:0x1b64, B:306:0x1ba6, B:324:0x172e, B:326:0x1741, B:327:0x177e, B:329:0x1788, B:331:0x179b, B:332:0x17d2, B:336:0x184b, B:338:0x1868, B:339:0x18a7, B:342:0x139c, B:344:0x13bd, B:345:0x13fe, B:367:0x119d, B:369:0x11ba, B:370:0x11f8, B:373:0x0f11, B:375:0x0f32, B:376:0x0f72, B:378:0x0fa2, B:380:0x0fbd, B:381:0x0ff3, B:404:0x0783, B:406:0x0792, B:407:0x07c5, B:409:0x07f1, B:410:0x084e, B:414:0x08cb, B:416:0x08da, B:417:0x090b, B:419:0x0937, B:420:0x0997, B:422:0x03aa, B:424:0x03cb, B:425:0x042a, B:427:0x045a, B:429:0x047c, B:430:0x04d0), top: B:2:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x2a7f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x26ba  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x27be  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x28f1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x2374  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x1f1a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x1cc7  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x1dd0  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x1e88  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x1729  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x1505  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x1122  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0fbd A[Catch: all -> 0x31a2, TryCatch #2 {all -> 0x31a2, blocks: (B:9:0x02e7, B:11:0x0308, B:12:0x0365, B:14:0x057a, B:16:0x0589, B:17:0x05bc, B:19:0x05d8, B:20:0x060f, B:24:0x06ac, B:26:0x06bb, B:27:0x06ed, B:29:0x0719, B:30:0x077b, B:37:0x0a4d, B:39:0x0a6e, B:40:0x0aaa, B:53:0x0e62, B:55:0x0e83, B:56:0x0ec5, B:62:0x10b6, B:64:0x10d3, B:65:0x110d, B:76:0x12e7, B:78:0x1308, B:79:0x1349, B:84:0x16c1, B:86:0x16de, B:87:0x171e, B:99:0x1aa2, B:101:0x1ac0, B:102:0x1afb, B:103:0x1bad, B:109:0x1eb1, B:111:0x1ece, B:112:0x1f11, B:123:0x20d5, B:125:0x20f6, B:126:0x2132, B:127:0x21df, B:132:0x2317, B:134:0x2334, B:135:0x236c, B:141:0x25a6, B:143:0x25c7, B:144:0x2607, B:152:0x29a7, B:154:0x29c4, B:155:0x2a03, B:163:0x2c26, B:165:0x2c47, B:166:0x2c84, B:167:0x2d33, B:174:0x2eaa, B:176:0x2ec6, B:177:0x2f08, B:185:0x2f19, B:187:0x2f36, B:188:0x2f73, B:192:0x30bb, B:194:0x30d8, B:195:0x311f, B:208:0x2ccf, B:210:0x2cf0, B:211:0x2d2c, B:213:0x2d59, B:215:0x2d7e, B:216:0x2dd7, B:230:0x2a15, B:232:0x2a32, B:233:0x2a77, B:237:0x2af0, B:239:0x2b0d, B:240:0x2b4c, B:271:0x23f1, B:273:0x240e, B:274:0x244d, B:277:0x217a, B:279:0x219b, B:280:0x21d8, B:296:0x1f8b, B:298:0x1fa8, B:299:0x1fe9, B:303:0x1b46, B:305:0x1b64, B:306:0x1ba6, B:324:0x172e, B:326:0x1741, B:327:0x177e, B:329:0x1788, B:331:0x179b, B:332:0x17d2, B:336:0x184b, B:338:0x1868, B:339:0x18a7, B:342:0x139c, B:344:0x13bd, B:345:0x13fe, B:367:0x119d, B:369:0x11ba, B:370:0x11f8, B:373:0x0f11, B:375:0x0f32, B:376:0x0f72, B:378:0x0fa2, B:380:0x0fbd, B:381:0x0ff3, B:404:0x0783, B:406:0x0792, B:407:0x07c5, B:409:0x07f1, B:410:0x084e, B:414:0x08cb, B:416:0x08da, B:417:0x090b, B:419:0x0937, B:420:0x0997, B:422:0x03aa, B:424:0x03cb, B:425:0x042a, B:427:0x045a, B:429:0x047c, B:430:0x04d0), top: B:2:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0d99  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0df7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x10a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x1247  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x16ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x18f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        int i;
        java.lang.String str;
        byte b;
        java.lang.Object obj;
        byte b2;
        java.lang.String str2;
        android.content.Context context;
        java.lang.String str3;
        int intValue;
        com.payair.hce.setSaveEnabled setsaveenabled;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object[] objArr2;
        java.lang.String str6;
        java.lang.Object[] objArr3;
        byte b3;
        long j;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Object obj2;
        java.lang.Object[] values$4956fc2a;
        int i2;
        byte b4;
        long j2;
        byte b5;
        java.lang.String str9;
        android.content.Context context2;
        java.lang.Object[] objArr4;
        java.lang.String str10;
        char c;
        byte b6;
        char c2;
        int i3;
        byte b7;
        long j3;
        java.lang.String str11;
        java.lang.Integer num;
        android.content.Context context3;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.Object[] objArr5;
        java.lang.String str14;
        java.lang.Object[] objArr6;
        int i4;
        java.lang.String str15;
        long j4;
        java.lang.String str16;
        java.lang.Object[] objArr7;
        char c3;
        int i5;
        int i6;
        long j5;
        android.content.Context context4;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.Object[] objArr8;
        java.lang.Object[] objArr9;
        java.lang.Long valueOf;
        java.lang.Class cls;
        java.lang.Object obj3;
        int i7;
        long j6;
        java.lang.Object obj4;
        java.lang.Object[] objArr10;
        char c4;
        char c5;
        int i8;
        java.lang.Object invoke;
        java.lang.Object invoke2;
        java.lang.String str19;
        java.lang.Object invoke3;
        java.lang.Object invoke4;
        com.payair.hce.setSaveEnabled setsaveenabled2 = (com.payair.hce.setSaveEnabled) objArr[0];
        getGpoResponse = (getCvrMaskAnd + 61) % 128;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        b((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 22 - android.graphics.Color.alpha(0), android.view.View.resolveSizeAndState(0, 0, 0), objArr11);
        java.lang.String str20 = (java.lang.String) objArr11[0];
        int i9 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
        int identityHashCode = java.lang.System.identityHashCode(setsaveenabled2);
        int i10 = ~identityHashCode;
        int i11 = ~((i10 & (-29554)) | (i10 ^ (-29554)));
        int i12 = ~((~i9) | identityHashCode);
        int i13 = ((i9 * (-949)) - 28045797) + (((i11 ^ i12) | (i11 & i12)) * 1900);
        int i14 = ~((i10 & i9) | (i10 ^ i9));
        int i15 = ~((identityHashCode ^ 29553) | (identityHashCode & 29553));
        int i16 = -(-(((i14 ^ i15) | (i14 & i15)) * (-950)));
        int i17 = ~((i10 & 29553) | (i10 ^ 29553));
        int i18 = ~((i9 ^ identityHashCode) | (i9 & identityHashCode));
        char c6 = (char) ((((i13 ^ i16) + ((i16 & i13) << 1)) - (~(-(-(((i18 ^ i17) | (i18 & i17)) * 950))))) - 1);
        int i19 = -android.view.Gravity.getAbsoluteGravity(0, 0);
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b(c6, ((i19 | 15) << 1) - (i19 ^ 15), 21 - (~(-(android.view.KeyEvent.getMaxKeyCode() >> 16))), objArr12);
        java.lang.String str21 = (java.lang.String) objArr12[0];
        char packedPositionType = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
        int identityHashCode2 = java.lang.System.identityHashCode(setsaveenabled2);
        int i20 = doubleTapTimeout * (-391);
        int i21 = ~((doubleTapTimeout ^ (-38)) | (doubleTapTimeout & (-38)));
        int i22 = ~((identityHashCode2 ^ 37) | (identityHashCode2 & 37));
        int i23 = (i20 & (-7215)) + (i20 | (-7215)) + (((i21 ^ i22) | (i21 & i22)) * (-196));
        int i24 = ((doubleTapTimeout ^ 37) | (doubleTapTimeout & 37)) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY;
        int i25 = ~doubleTapTimeout;
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b(packedPositionType, ((lastIndexOf | 17) << 1) - (lastIndexOf ^ 17), (i23 & i24) + (i24 | i23) + (((~((i25 & (-38)) | (i25 ^ (-38)))) | i22) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), objArr13);
        java.lang.String str22 = (java.lang.String) objArr13[0];
        char size = (char) android.view.View.MeasureSpec.getSize(0);
        int i26 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int i27 = -android.widget.ExpandableListView.getPackedPositionType(0L);
        int identityHashCode3 = java.lang.System.identityHashCode(setsaveenabled2);
        int i28 = i27 * 50;
        int i29 = ~identityHashCode3;
        int i30 = ~((i29 ^ (-54)) | (i29 & (-54)));
        int i31 = ~(i27 | (-54));
        int i32 = ((((i28 | (-5141)) << 1) - (i28 ^ (-5141))) - (~(-(-(((i30 & i31) | (i30 ^ i31)) * 98))))) - 1;
        int i33 = (~((~i27) | i29)) | (-54);
        int i34 = ~(i27 | identityHashCode3);
        int i35 = ((i33 & i34) | (i33 ^ i34)) * (-49);
        int i36 = ~((identityHashCode3 ^ (-54)) | (identityHashCode3 & (-54)));
        int i37 = ~((i27 ^ 53) | (i27 & 53));
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        b(size, 14 - (~i26), (((i32 | i35) << 1) - (i35 ^ i32)) + (((i37 & i36) | (i36 ^ i37)) * 49), objArr14);
        java.lang.String str23 = (java.lang.String) objArr14[0];
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 754 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (45560 - android.view.View.resolveSize(0, 0)));
        byte[] bArr = $$a;
        byte b8 = (byte) (-bArr[11]);
        byte b9 = bArr[21];
        int i38 = $$b;
        byte b10 = (byte) (i38 + 5);
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        c(b8, b9, b10, objArr15);
        long j7 = cls2.getField((java.lang.String) objArr15[0]).getLong(null);
        try {
            if (j7 == -1 || j7 + 1867 < ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str21, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                i = i38;
                java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str22).getMethod(str23, java.lang.Object.class).invoke(null, setsaveenabled2)).intValue()), -6854174};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 47, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 753, (char) (45561 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr17);
                    obj5 = cls3.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj5);
                }
                java.lang.Object invoke5 = ((java.lang.reflect.Method) obj5).invoke(null, objArr16);
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 755 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (45560 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr18);
                cls4.getField((java.lang.String) objArr18[0]).set(null, invoke5);
                try {
                    try {
                        long longValue = ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str21, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 754 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (45608 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        str = str23;
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        b = b10;
                        c((byte) (-bArr[11]), bArr[21], b, objArr19);
                        cls5.getField((java.lang.String) objArr19[0]).set(null, java.lang.Long.valueOf(longValue));
                        obj = invoke5;
                    } catch (java.lang.Exception unused) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                int identityHashCode4 = java.lang.System.identityHashCode(setsaveenabled2);
                int i39 = ~(((-1988080955) ^ identityHashCode4) | ((-1988080955) & identityHashCode4));
                int i40 = ~identityHashCode4;
                int i41 = (i40 ^ 225632788) | (i40 & 225632788);
                int i42 = ~((i41 ^ 1988080954) | (i41 & 1988080954));
                int i43 = ((i39 ^ i42) | (i42 & i39)) * (-406);
                int i44 = (508130706 ^ i43) + ((i43 & 508130706) << 1);
                int i45 = ((-1988080955) ^ i40) | (i40 & (-1988080955));
                int i46 = -(-((~((i45 & 225632788) | (i45 ^ 225632788))) * (-406)));
                int i47 = ~(identityHashCode4 | (-225632789));
                int i48 = ~(i40 | 1988080954);
                i = i38;
                int i49 = ~java.lang.System.identityHashCode(setsaveenabled2);
                int i50 = ~((i49 & 274271918) | (i49 ^ 274271918));
                int i51 = ((i50 ^ 269487114) | (i50 & 269487114)) * (-970);
                int i52 = (i51 & 424185054) + (i51 | 424185054);
                int i53 = (i52 ^ 1686319680) + ((i52 & 1686319680) << 1);
                int i54 = ((i50 & 4784804) | (i50 ^ 4784804)) * 970;
                if ((((i44 | i46) << 1) - (i46 ^ i44)) + (((i47 ^ i48) | (i48 & i47)) * 406) > ((i53 | i54) << 1) - (i54 ^ i53)) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", "", 0, 0), 754 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45512));
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr20);
                    java.lang.Object[] objArr21 = {cls6.getField((java.lang.String) objArr20[0]).get(null), -6854174, 0};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                    if (obj6 == null) {
                        obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetAfter("", 0), 4790 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, android.text.TextUtils.getOffsetBefore("", 0) + 4750, (char) (33700 - android.widget.ExpandableListView.getPackedPositionChild(0L))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj6);
                    }
                    invoke4 = ((java.lang.reflect.Method) obj6).invoke(null, objArr21);
                } else {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 47, 754 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16822776));
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr22);
                    java.lang.Object[] objArr23 = {cls7.getField((java.lang.String) objArr22[0]).get(null), -6854174, 0};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                    if (obj7 == null) {
                        obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 40, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 4790, (char) (android.view.KeyEvent.keyCodeFromString("") + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4750 - android.view.KeyEvent.getDeadChar(0, 0), (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj7);
                    }
                    invoke4 = ((java.lang.reflect.Method) obj7).invoke(null, objArr23);
                }
                str = str23;
                obj = invoke4;
                b = b10;
            }
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
            if (obj8 == null) {
                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 40, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4750, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 33702))).getMethod("values", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj8);
            }
            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(obj, null)).intValue();
            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
            if (obj9 == null) {
                obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 4749 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (33701 - (android.os.Process.myTid() >> 22)))).getMethod("DigitizedCardProfile", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj9);
            }
            int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(obj, null)).intValue();
            if (intValue3 == intValue2) {
                int identityHashCode5 = java.lang.System.identityHashCode(setsaveenabled2);
                int i55 = ~(((-1776895246) & identityHashCode5) | ((-1776895246) ^ identityHashCode5));
                int i56 = -(-(((i55 ^ 1761608716) | (1761608716 & i55)) * (-283)));
                int i57 = (904992414 & i56) + (i56 | 904992414);
                int i58 = (((-906495754) | i57) << 1) - (i57 ^ (-906495754));
                int i59 = (~(identityHashCode5 | (-15286530))) * 283;
                int identityHashCode6 = java.lang.System.identityHashCode(setsaveenabled2);
                int i60 = ~identityHashCode6;
                b2 = b;
                int i61 = 1879458235 - (~(((~((identityHashCode6 & 1593222295) | (identityHashCode6 ^ 1593222295))) | ((~(i60 | (-1593222296))) | (-275775838))) * (-564)));
                int i62 = -(-((~((identityHashCode6 & (-329)) | (identityHashCode6 ^ (-329)))) * 1128));
                int i63 = ~(((-275775838) & i60) | (i60 ^ (-275775838)));
                if (((i58 | i59) << 1) - (i59 ^ i58) > (i61 ^ i62) + ((i62 & i61) << 1) + ((((-1593222624) & i63) | ((-1593222624) ^ i63)) * 564)) {
                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                    if (obj10 == null) {
                        obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 4750 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (33700 - android.os.Process.getGidForName("")))).getMethod("valueOf", null);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj10);
                    }
                    java.lang.Object[] objArr24 = {obj, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(obj, null)).intValue()), 1};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                    if (obj11 == null) {
                        obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4790, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31153))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 40, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4749, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33700)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj11);
                    }
                    ((java.lang.reflect.Method) obj11).invoke(null, objArr24);
                } else {
                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                    if (obj12 == null) {
                        obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 4751 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (33701 - android.view.KeyEvent.normalizeMetaState(0)))).getMethod("valueOf", null);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj12);
                    }
                    java.lang.Object[] objArr25 = {obj, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(obj, null)).intValue()), 0};
                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                    if (obj13 == null) {
                        obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 40, 4790 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.View.getDefaultSize(0, 0) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 41, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4749, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj13);
                    }
                    ((java.lang.reflect.Method) obj13).invoke(null, objArr25);
                }
            } else {
                b2 = b;
                long j8 = intValue2 ^ intValue3;
                int i64 = getCvrMaskAnd;
                getGpoResponse = (((i64 | 37) << 1) - (i64 ^ 37)) % 128;
                try {
                    java.lang.Object[] objArr26 = {java.lang.Long.valueOf(j8 ^ (-6458261208242847744L)), -1503679066L};
                    byte[] bArr2 = $$d;
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    d(bArr2[283], 256, bArr2[63], objArr27);
                    java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    d(bArr2[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr2[43]), objArr28);
                    cls8.getMethod((java.lang.String) objArr28[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr26);
                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                    if (obj14 == null) {
                        obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 40, 4749 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33653))).getMethod("valueOf", null);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj14);
                    }
                    java.lang.Object[] objArr29 = {obj, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(obj, null)).intValue()), 0};
                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                    if (obj15 == null) {
                        obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 4791, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 31153))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4751, (char) ((android.os.Process.myPid() >> 22) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj15);
                    }
                    ((java.lang.reflect.Method) obj15).invoke(null, objArr29);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 48, android.text.TextUtils.getOffsetBefore("", 0) + 1581, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr30);
            long j9 = cls9.getField((java.lang.String) objArr30[0]).getLong(null);
            try {
                if (j9 != -1) {
                    int i65 = getGpoResponse;
                    getCvrMaskAnd = (((i65 | 103) << 1) - (i65 ^ 103)) % 128;
                    if (j9 + 1954 >= ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str21, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1581 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        c((byte) (-bArr[116]), (short) 58, (byte) (i + 2), objArr31);
                        java.lang.Object[] objArr32 = {cls10.getField((java.lang.String) objArr31[0]).get(null), 132885219, 0};
                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                        if (obj16 == null) {
                            obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.KeyEvent.keyCodeFromString("") + 4905, (char) android.graphics.Color.alpha(0))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj16);
                        }
                        objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj16).invoke(null, objArr32);
                        str6 = str21;
                        str5 = str22;
                        str2 = "valueOf";
                        str4 = str;
                        setsaveenabled = setsaveenabled2;
                        objArr2 = objArr3;
                        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add((java.lang.String) objArr2[2]);
                            arrayList.add((java.lang.String) objArr2[3]);
                        }
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 923 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                        b3 = (byte) (i + 2);
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        c((byte) (-bArr[116]), (short) 58, b3, objArr33);
                        j = cls11.getField((java.lang.String) objArr33[0]).getLong(null);
                        if (j != -1 || j + 2005 < ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str6, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                            str7 = str2;
                            str8 = str4;
                            int intValue4 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setsaveenabled)).intValue();
                            java.lang.Object[] objArr34 = {-2140315454};
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 49, android.view.View.resolveSize(0, 0) + 873, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 15956))).getDeclaredConstructor(java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj2);
                            }
                            values$4956fc2a = com.payair.hce.setNavigationOnClickListener.values$4956fc2a(intValue4, ((java.lang.reflect.Constructor) obj2).newInstance(objArr34));
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 44, 923 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            c(bArr[34], bArr[37], bArr[28], objArr35);
                            cls12.getField((java.lang.String) objArr35[0]).set(null, values$4956fc2a);
                            try {
                                long longValue2 = ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str6, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.widget.ExpandableListView.getPackedPositionType(0L), 922 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                c((byte) (-bArr[116]), (short) 58, b3, objArr36);
                                cls13.getField((java.lang.String) objArr36[0]).set(null, java.lang.Long.valueOf(longValue2));
                                getGpoResponse = (getCvrMaskAnd + 25) % 128;
                            } catch (java.lang.Exception unused2) {
                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                            }
                        } else {
                            int i66 = getCvrMaskAnd + 65;
                            getGpoResponse = i66 % 128;
                            if (i66 % 2 == 0) {
                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 45, android.graphics.ImageFormat.getBitsPerPixel(0) + 923, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                c(bArr[34], bArr[37], bArr[28], objArr37);
                                java.lang.Object[] objArr38 = {cls14.getField((java.lang.String) objArr37[0]).get(null), 783712867, 0};
                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                if (obj17 == null) {
                                    str7 = str2;
                                    obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.widget.ExpandableListView.getPackedPositionType(0L), 4860 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod(str7, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj17);
                                } else {
                                    str7 = str2;
                                }
                                values$4956fc2a = (java.lang.Object[]) ((java.lang.reflect.Method) obj17).invoke(null, objArr38);
                            } else {
                                str7 = str2;
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 922, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                c(bArr[34], bArr[37], bArr[28], objArr39);
                                java.lang.Object[] objArr40 = {cls15.getField((java.lang.String) objArr39[0]).get(null), 783712867, 0};
                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                if (obj18 == null) {
                                    obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.getOffsetAfter("", 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4860, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod(str7, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj18);
                                }
                                values$4956fc2a = (java.lang.Object[]) ((java.lang.reflect.Method) obj18).invoke(null, objArr40);
                            }
                            str8 = str4;
                        }
                        i2 = ((int[]) values$4956fc2a[1])[0];
                        if (((int[]) values$4956fc2a[0])[0] == i2) {
                            getGpoResponse = (getCvrMaskAnd + 27) % 128;
                            java.lang.Object[] objArr41 = {values$4956fc2a, java.lang.Integer.valueOf(((int[]) values$4956fc2a[3])[0]), 0};
                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                            if (obj19 == null) {
                                obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.getOffsetBefore("", 0), 4860 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod(str7, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj19);
                            }
                            ((java.lang.reflect.Method) obj19).invoke(null, objArr41);
                            int i67 = getCvrMaskAnd;
                            getGpoResponse = ((i67 ^ 103) + ((i67 & 103) << 1)) % 128;
                        } else {
                            new java.util.ArrayList().add((java.lang.String) values$4956fc2a[2]);
                            java.lang.Object[] objArr42 = {java.lang.Long.valueOf(4260475878229671936L ^ ((i2 | r12) & (~(i2 & r12)))), 991969343L};
                            byte[] bArr3 = $$d;
                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                            d(bArr3[538], 204, bArr3[63], objArr43);
                            java.lang.Class<?> cls16 = java.lang.Class.forName((java.lang.String) objArr43[0]);
                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                            d(bArr3[140], 700, bArr3[5], objArr44);
                            cls16.getMethod((java.lang.String) objArr44[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr42);
                            java.lang.Object[] objArr45 = {values$4956fc2a, java.lang.Integer.valueOf(((int[]) values$4956fc2a[3])[0]), 0};
                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                            if (obj20 == null) {
                                obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 45, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4861, (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod(str7, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj20);
                            }
                            ((java.lang.reflect.Method) obj20).invoke(null, objArr45);
                        }
                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myTid() >> 22), 668 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (40024 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        b4 = b2;
                        c((byte) (-bArr[11]), bArr[21], b4, objArr46);
                        j2 = cls17.getField((java.lang.String) objArr46[0]).getLong(null);
                        try {
                            if (j2 != -1) {
                                int i68 = getCvrMaskAnd;
                                int i69 = (i68 & 43) + (i68 | 43);
                                getGpoResponse = i69 % 128;
                                if (i69 % 2 != 0 ? j2 + 1954 >= ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str6, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : (j2 ^ 1954) >= ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str6, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue()) {
                                    int i70 = getCvrMaskAnd + 35;
                                    getGpoResponse = i70 % 128;
                                    if (i70 % 2 == 0) {
                                        java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.indexOf("", "", 0, 0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 667, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 40024));
                                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                                        c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr47);
                                        java.lang.Object[] objArr48 = {cls18.getField((java.lang.String) objArr47[0]).get(null), -1906651737, 1};
                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                        if (obj21 == null) {
                                            obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4684, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj21);
                                        }
                                        objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) obj21).invoke(null, objArr48);
                                    } else {
                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 667, (char) (40023 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                        java.lang.Object[] objArr49 = new java.lang.Object[1];
                                        c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr49);
                                        java.lang.Object[] objArr50 = {cls19.getField((java.lang.String) objArr49[0]).get(null), -1906651737, 0};
                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                        if (obj22 == null) {
                                            obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 4684 - android.graphics.Color.blue(0), (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj22);
                                        }
                                        objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) obj22).invoke(null, objArr50);
                                    }
                                    str9 = str7;
                                    b5 = b3;
                                    str10 = str6;
                                    b6 = b4;
                                    c2 = 0;
                                    c = 1;
                                    i3 = ((int[]) objArr4[c])[c2];
                                    if (((int[]) objArr4[c2])[c2] != i3) {
                                        int i71 = getCvrMaskAnd;
                                        getGpoResponse = ((i71 ^ 79) + ((i71 & 79) << 1)) % 128;
                                        java.lang.Object[] objArr51 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[4])[0]), 0};
                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                        if (obj23 == null) {
                                            obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 33, 4732 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.red(0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj23);
                                        }
                                        ((java.lang.reflect.Method) obj23).invoke(null, objArr51);
                                        b7 = b6;
                                    } else {
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        java.lang.Object[] objArr52 = {objArr4};
                                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                        if (obj24 == null) {
                                            b7 = b6;
                                            obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 4684 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("values", java.lang.Object[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj24);
                                        } else {
                                            b7 = b6;
                                        }
                                        arrayList2.add(((java.lang.reflect.Method) obj24).invoke(null, objArr52));
                                        java.lang.Object[] objArr53 = {objArr4};
                                        java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                        if (obj25 == null) {
                                            obj25 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4684, (char) android.view.View.MeasureSpec.getMode(0))).getMethod("writeReplace", java.lang.Object[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj25);
                                        }
                                        arrayList2.add(((java.lang.reflect.Method) obj25).invoke(null, objArr53));
                                        java.lang.Object[] objArr54 = {java.lang.Long.valueOf((i3 ^ r5) ^ (-9034448721995104256L)), -2103496503L};
                                        byte[] bArr4 = $$d;
                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                        d((byte) (-bArr4[162]), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, bArr4[63], objArr55);
                                        java.lang.Class<?> cls20 = java.lang.Class.forName((java.lang.String) objArr55[0]);
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        d(bArr4[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr4[43]), objArr56);
                                        cls20.getMethod((java.lang.String) objArr56[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr54);
                                        java.lang.Object[] objArr57 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[4])[0]), 0};
                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                        if (obj26 == null) {
                                            obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 33, 4684 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj26);
                                        }
                                        ((java.lang.reflect.Method) obj26).invoke(null, objArr57);
                                    }
                                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.graphics.Color.blue(0), 584 - android.view.KeyEvent.getDeadChar(0, 0), (char) (24339 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr58);
                                    j3 = cls21.getField((java.lang.String) objArr58[0]).getLong(null);
                                    if (j3 != -1) {
                                        int identityHashCode7 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i72 = ~identityHashCode7;
                                        int i73 = (-679475886) - (~(-(-(((~(((-962915161) & i72) | ((-962915161) ^ i72))) | (-1658174328)) * (-328)))));
                                        int i74 = (((-1658174328) ^ identityHashCode7) | ((-1658174328) & identityHashCode7)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
                                        int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                                        int i76 = ~(identityHashCode7 | 962915160);
                                        int i77 = (i76 & (-2079718272)) | ((-2079718272) ^ i76);
                                        int i78 = (i72 ^ (-1658174328)) | ((-1658174328) & i72);
                                        int i79 = ~((i78 ^ (-962915161)) | ((-962915161) & i78));
                                        int i80 = -(-(((i77 ^ i79) | (i79 & i77)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                                        int identityHashCode8 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i81 = -(-(((~((1567967867 & identityHashCode8) | (1567967867 ^ identityHashCode8))) | 537559428) * 1504));
                                        int i82 = (1456347321 ^ i81) + ((i81 & 1456347321) << 1);
                                        int i83 = -(-((~((identityHashCode8 ^ 2105527295) | (2105527295 & identityHashCode8))) * (-1504)));
                                        if (((i75 | i80) << 1) - (i80 ^ i75) > (i82 & i83) + (i83 | i82) + 1932689648 ? j3 + 2025 >= ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str10, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : (j3 & 2025) >= ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str10, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) {
                                            int identityHashCode9 = java.lang.System.identityHashCode(setsaveenabled);
                                            int i84 = ~identityHashCode9;
                                            int i85 = ~(((-324019713) & i84) | ((-324019713) ^ i84));
                                            int i86 = ~((326135312 & identityHashCode9) | (326135312 ^ identityHashCode9));
                                            int i87 = -(-(((i85 ^ i86) | (i85 & i86)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
                                            int i88 = (1572481421 & i87) + (i87 | 1572481421);
                                            int i89 = ~((-326135313) | i84);
                                            int i90 = ~((identityHashCode9 ^ 332637733) | (332637733 & identityHashCode9));
                                            int i91 = ((i89 ^ i90) | (i89 & i90)) * (-1040);
                                            int i92 = ~((i84 ^ (-332637734)) | ((-332637734) & i84));
                                            int i93 = (i92 ^ 2115600) | (2115600 & i92);
                                            int identityHashCode10 = java.lang.System.identityHashCode(setsaveenabled);
                                            int i94 = ~(((-541743337) & identityHashCode10) | ((-541743337) ^ identityHashCode10));
                                            int i95 = ((i94 ^ (-2043599866)) | ((-2043599866) & i94)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                            int i96 = ~identityHashCode10;
                                            if ((i88 ^ i91) + ((i91 & i88) << 1) + (((i90 ^ i93) | (i90 & i93)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) <= (((((-120568024) | i95) << 1) - ((-120568024) ^ i95)) - 520045056) + ((~(((-566942697) & i96) | ((-566942697) ^ i96) | (-2018400506))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
                                                java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 51, 584 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (24291 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                                                java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr59);
                                                java.lang.Object[] objArr60 = {cls22.getField((java.lang.String) objArr59[0]).get(null), -1958191123, 1};
                                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                if (obj27 == null) {
                                                    str19 = str9;
                                                    obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 30, 4830 - android.text.TextUtils.indexOf("", "", 0, 0), (char) android.text.TextUtils.getTrimmedLength(""))).getMethod(str19, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj27);
                                                } else {
                                                    str19 = str9;
                                                }
                                                invoke3 = ((java.lang.reflect.Method) obj27).invoke(null, objArr60);
                                            } else {
                                                str19 = str9;
                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 52, 584 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (24291 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr61);
                                                java.lang.Object[] objArr62 = {cls23.getField((java.lang.String) objArr61[0]).get(null), -1958191123, 0};
                                                java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                if (obj28 == null) {
                                                    obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 30, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4830, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1))).getMethod(str19, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj28);
                                                }
                                                invoke3 = ((java.lang.reflect.Method) obj28).invoke(null, objArr62);
                                            }
                                            objArr6 = (java.lang.Object[]) invoke3;
                                            int i97 = getGpoResponse + 7;
                                            getCvrMaskAnd = i97 % 128;
                                            int i98 = i97 % 2;
                                            num = 0;
                                            str13 = str20;
                                            str11 = str19;
                                            str12 = str8;
                                            str14 = str10;
                                            objArr5 = objArr6;
                                            i4 = ((int[]) objArr5[1])[0];
                                            if (((int[]) objArr5[0])[0] == i4) {
                                                int i99 = getGpoResponse;
                                                getCvrMaskAnd = ((i99 ^ 109) + ((i99 & 109) << 1)) % 128;
                                                java.lang.Object[] objArr63 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[3])[0]), num};
                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                if (obj29 == null) {
                                                    str15 = str11;
                                                    obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4830 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod(str15, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj29);
                                                } else {
                                                    str15 = str11;
                                                }
                                                ((java.lang.reflect.Method) obj29).invoke(null, objArr63);
                                            } else {
                                                str15 = str11;
                                                java.lang.Object[] objArr64 = {java.lang.Long.valueOf((((~i4) & r4) | (i4 & (~r4))) ^ 3667693279538839552L), 853951391L};
                                                byte[] bArr5 = $$d;
                                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                d(bArr5[143], my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DUKPT_KEY_INVALID, bArr5[63], objArr65);
                                                java.lang.Class<?> cls24 = java.lang.Class.forName((java.lang.String) objArr65[0]);
                                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                d(bArr5[140], 700, bArr5[5], objArr66);
                                                cls24.getMethod((java.lang.String) objArr66[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr64);
                                                java.lang.Object[] objArr67 = {objArr5, java.lang.Integer.valueOf(((int[]) objArr5[3])[0]), num};
                                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                if (obj30 == null) {
                                                    obj30 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4829, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod(str15, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj30);
                                                }
                                                ((java.lang.reflect.Method) obj30).invoke(null, objArr67);
                                                int i100 = getCvrMaskAnd;
                                                getGpoResponse = ((i100 & 37) + (i100 | 37)) % 128;
                                            }
                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 51, android.graphics.Color.argb(0, 0, 0, 0) + 584, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24290));
                                            java.lang.Object[] objArr68 = new java.lang.Object[1];
                                            byte b11 = b7;
                                            c((byte) (-bArr[11]), bArr[21], b11, objArr68);
                                            j4 = cls25.getField((java.lang.String) objArr68[0]).getLong(null);
                                            try {
                                                if (j4 != -1) {
                                                    int i101 = getCvrMaskAnd + 111;
                                                    getGpoResponse = i101 % 128;
                                                    if (i101 % 2 != 0 ? j4 + 1920 >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : (j4 ^ 1920) >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                        int i102 = getCvrMaskAnd;
                                                        int i103 = (i102 & 87) + (i102 | 87);
                                                        getGpoResponse = i103 % 128;
                                                        if (i103 % 2 == 0) {
                                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 52, android.graphics.Color.argb(0, 0, 0, 0) + 584, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 24292));
                                                            byte b12 = bArr[3];
                                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                            c(b12, b12, bArr[34], objArr69);
                                                            java.lang.Object[] objArr70 = {cls26.getField((java.lang.String) objArr69[0]).get(null), 966711889, num};
                                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                            if (obj31 == null) {
                                                                obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 30, 4829 - android.view.MotionEvent.axisFromString(""), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)))).getMethod(str15, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj31);
                                                            }
                                                            invoke2 = ((java.lang.reflect.Method) obj31).invoke(null, objArr70);
                                                        } else {
                                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 584, (char) (24291 - android.graphics.Color.blue(0)));
                                                            byte b13 = bArr[3];
                                                            java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                            c(b13, b13, bArr[34], objArr71);
                                                            java.lang.Object[] objArr72 = {cls27.getField((java.lang.String) objArr71[0]).get(null), 966711889, num};
                                                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                            if (obj32 == null) {
                                                                obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 30, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 4831, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod(str15, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj32);
                                                            }
                                                            invoke2 = ((java.lang.reflect.Method) obj32).invoke(null, objArr72);
                                                        }
                                                        objArr7 = (java.lang.Object[]) invoke2;
                                                        str16 = str12;
                                                        i5 = 0;
                                                        c3 = 1;
                                                        i6 = ((int[]) objArr7[c3])[i5];
                                                        if (((int[]) objArr7[i5])[i5] != i6) {
                                                            getCvrMaskAnd = (getGpoResponse + 39) % 128;
                                                            int i104 = ((int[]) objArr7[3])[i5];
                                                            java.lang.Object[] objArr73 = new java.lang.Object[3];
                                                            objArr73[2] = num;
                                                            objArr73[1] = java.lang.Integer.valueOf(i104);
                                                            objArr73[i5] = objArr7;
                                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                            if (obj33 == null) {
                                                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(i5, i5) + 30, android.text.TextUtils.getTrimmedLength("") + 4830, (char) android.view.View.resolveSize(i5, i5));
                                                                java.lang.Class<?>[] clsArr = new java.lang.Class[3];
                                                                clsArr[i5] = java.lang.Object[].class;
                                                                clsArr[1] = java.lang.Integer.TYPE;
                                                                clsArr[2] = java.lang.Integer.TYPE;
                                                                obj33 = cls28.getMethod(str15, clsArr);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj33);
                                                            }
                                                            ((java.lang.reflect.Method) obj33).invoke(null, objArr73);
                                                        } else {
                                                            new java.util.ArrayList().add((java.lang.String) objArr7[2]);
                                                            java.lang.Object[] objArr74 = {java.lang.Long.valueOf(((i6 & (~r5)) | ((~i6) & r5)) ^ 6105365009913610240L), 1421516081L};
                                                            byte[] bArr6 = $$d;
                                                            java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                            d(bArr6[283], 430, bArr6[63], objArr75);
                                                            java.lang.Class<?> cls29 = java.lang.Class.forName((java.lang.String) objArr75[0]);
                                                            java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                            d(bArr6[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr6[43]), objArr76);
                                                            cls29.getMethod((java.lang.String) objArr76[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr74);
                                                            java.lang.Object[] objArr77 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[0]), num};
                                                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                            if (obj34 == null) {
                                                                obj34 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 30, 4830 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod(str15, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj34);
                                                            }
                                                            ((java.lang.reflect.Method) obj34).invoke(null, objArr77);
                                                            int identityHashCode11 = java.lang.System.identityHashCode(setsaveenabled);
                                                            int i105 = -(-((~(((-814746180) & identityHashCode11) | ((-814746180) ^ identityHashCode11))) * (-301)));
                                                            int i106 = ~((817696587 & identityHashCode11) | (817696587 ^ identityHashCode11));
                                                            int i107 = ~identityHashCode11;
                                                            int i108 = ~((i107 ^ 124585260) | (124585260 & i107));
                                                            int identityHashCode12 = java.lang.System.identityHashCode(setsaveenabled);
                                                            int i109 = ~((-882219590) | (~identityHashCode12));
                                                            int i110 = -(-(((i109 ^ (-2001346880)) | ((-2001346880) & i109)) * (-235)));
                                                            int i111 = ~(((-882219590) & identityHashCode12) | ((-882219590) ^ identityHashCode12));
                                                            int i112 = ~((identityHashCode12 ^ (-872415238)) | ((-872415238) & identityHashCode12));
                                                            int i113 = (((((-852106040) & i105) + (i105 | (-852106040))) - (~(((i106 & i108) | (i106 ^ i108)) * (-301)))) - 1) + (((~((identityHashCode11 ^ (-124585261)) | ((-124585261) & identityHashCode11))) | 817696587) * 301);
                                                            int i114 = (8850140 & i110) + (8850140 | i110) + ((((-2001346880) & i111) | ((-2001346880) ^ i111)) * (-470)) + ((((-2011151232) & i112) | ((-2011151232) ^ i112)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
                                                        }
                                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 51, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24292 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                        byte b14 = b5;
                                                        c((byte) (-bArr[116]), (short) 58, b14, objArr78);
                                                        j5 = cls30.getField((java.lang.String) objArr78[0]).getLong(null);
                                                        if (j5 != -1) {
                                                            int i115 = getCvrMaskAnd;
                                                            getGpoResponse = ((i115 & 13) + (i115 | 13)) % 128;
                                                            if (j5 + 1966 >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                int i116 = getCvrMaskAnd;
                                                                getGpoResponse = (((i116 | 107) << 1) - (i116 ^ 107)) % 128;
                                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 584 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24291));
                                                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                                c(bArr[34], bArr[37], bArr[28], objArr79);
                                                                java.lang.Object[] objArr80 = {cls31.getField((java.lang.String) objArr79[0]).get(null), -873429401, num};
                                                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                if (obj35 == null) {
                                                                    obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 31, 4829 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod(str15, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj35);
                                                                }
                                                                objArr9 = (java.lang.Object[]) ((java.lang.reflect.Method) obj35).invoke(null, objArr80);
                                                                str17 = str16;
                                                                str18 = str15;
                                                                objArr8 = objArr9;
                                                                i7 = ((int[]) objArr8[1])[0];
                                                                if (((int[]) objArr8[0])[0] == i7) {
                                                                    int i117 = ~java.lang.System.identityHashCode(setsaveenabled);
                                                                    int i118 = ((-80093191) | i117) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
                                                                    int i119 = ~((i117 ^ (-80128111)) | ((-80128111) & i117));
                                                                    int i120 = (i119 ^ 305727105) | (305727105 & i119);
                                                                    int i121 = -(-(((i120 ^ 34920) | (34920 & i120)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                                                                    int identityHashCode13 = java.lang.System.identityHashCode(setsaveenabled);
                                                                    int i122 = ~identityHashCode13;
                                                                    int i123 = ~(((-1472116927) & i122) | ((-1472116927) ^ i122));
                                                                    int i124 = (i123 ^ 1377341576) | (1377341576 & i123);
                                                                    int i125 = ~(((-1381618058) ^ i122) | ((-1381618058) & i122));
                                                                    int i126 = i124 | i125;
                                                                    int i127 = ~((identityHashCode13 ^ 1476393407) | (1476393407 & identityHashCode13));
                                                                    int i128 = (166959395 - (~(-(-(((i127 ^ i126) | (i127 & i126)) * 590))))) + (((i124 & i125) | (i124 ^ i125)) * (-1180));
                                                                    int i129 = ~((1381618057 & i122) | (1381618057 ^ i122));
                                                                    int i130 = ~((i122 ^ 1472116926) | (1472116926 & i122));
                                                                    int i131 = -(-(((i129 ^ i130) | (i129 & i130)) * 590));
                                                                    if (((((-119945384) & i118) + (i118 | (-119945384))) - (~i121)) - 1 <= (i128 ^ i131) + ((i131 & i128) << 1)) {
                                                                        java.lang.Object[] objArr81 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[1]), 1};
                                                                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                        if (obj36 == null) {
                                                                            obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.KeyEvent.keyCodeFromString(""), 4830 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod(str18, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj36);
                                                                        }
                                                                        ((java.lang.reflect.Method) obj36).invoke(null, objArr81);
                                                                    } else {
                                                                        java.lang.String str24 = str18;
                                                                        java.lang.Object[] objArr82 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), num};
                                                                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                        if (obj37 == null) {
                                                                            obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29, 4829 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1))).getMethod(str24, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj37);
                                                                        }
                                                                        ((java.lang.reflect.Method) obj37).invoke(null, objArr82);
                                                                    }
                                                                } else {
                                                                    java.lang.String str25 = str18;
                                                                    java.lang.Object[] objArr83 = {java.lang.Long.valueOf((((~i7) & r4) | (i7 & (~r4))) ^ 6914607698260525056L), 1609932049L};
                                                                    byte[] bArr7 = $$d;
                                                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                                    d(bArr7[143], my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DUKPT_KEY_INVALID, bArr7[63], objArr84);
                                                                    java.lang.Class<?> cls32 = java.lang.Class.forName((java.lang.String) objArr84[0]);
                                                                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                                    d(bArr7[140], 700, bArr7[5], objArr85);
                                                                    cls32.getMethod((java.lang.String) objArr85[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr83);
                                                                    java.lang.Object[] objArr86 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[3])[0]), num};
                                                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                                                                    if (obj38 == null) {
                                                                        obj38 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4830, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod(str25, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj38);
                                                                    }
                                                                    ((java.lang.reflect.Method) obj38).invoke(null, objArr86);
                                                                    int i132 = getGpoResponse;
                                                                    getCvrMaskAnd = (((i132 | 41) << 1) - (i132 ^ 41)) % 128;
                                                                }
                                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.widget.ExpandableListView.getPackedPositionType(0L), android.graphics.Color.rgb(0, 0, 0) + 16777923, (char) (34284 - (android.os.Process.myTid() >> 22)));
                                                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                                c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr87);
                                                                j6 = cls33.getField((java.lang.String) objArr87[0]).getLong(null);
                                                                try {
                                                                    if (j6 != -1) {
                                                                        int i133 = getCvrMaskAnd;
                                                                        getGpoResponse = ((i133 ^ 99) + ((i133 & 99) << 1)) % 128;
                                                                        if (j6 + 2039 >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                            int i134 = getCvrMaskAnd;
                                                                            int i135 = (i134 ^ 111) + ((i134 & 111) << 1);
                                                                            getGpoResponse = i135 % 128;
                                                                            if (i135 % 2 == 0) {
                                                                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 47, 706 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (34284 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                                                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                                c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr88);
                                                                                java.lang.Object[] objArr89 = {cls34.getField((java.lang.String) objArr88[0]).get(null), 2077718106, num};
                                                                                java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                                if (obj39 == null) {
                                                                                    obj39 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 33, android.text.TextUtils.getTrimmedLength("") + 4717, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj39);
                                                                                }
                                                                                invoke = ((java.lang.reflect.Method) obj39).invoke(null, objArr89);
                                                                            } else {
                                                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47, android.view.Gravity.getAbsoluteGravity(0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 34284));
                                                                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                                c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr90);
                                                                                java.lang.Object[] objArr91 = {cls35.getField((java.lang.String) objArr90[0]).get(null), 2077718106, num};
                                                                                java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                                if (obj40 == null) {
                                                                                    obj40 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.View.resolveSize(0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 4717, (char) android.view.View.MeasureSpec.getSize(0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj40);
                                                                                }
                                                                                invoke = ((java.lang.reflect.Method) obj40).invoke(null, objArr91);
                                                                            }
                                                                            objArr10 = (java.lang.Object[]) invoke;
                                                                            c4 = 1;
                                                                            c5 = 0;
                                                                            i8 = ((int[]) objArr10[c4])[c5];
                                                                            if (((int[]) objArr10[c5])[c5] == i8) {
                                                                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                                arrayList3.add((java.lang.String) objArr10[2]);
                                                                                arrayList3.add((java.lang.String) objArr10[3]);
                                                                                arrayList3.add((java.lang.String) objArr10[4]);
                                                                                arrayList3.add((java.lang.String) objArr10[5]);
                                                                                arrayList3.add((java.lang.String) objArr10[6]);
                                                                                arrayList3.add((java.lang.String) objArr10[7]);
                                                                                arrayList3.add((java.lang.String) objArr10[8]);
                                                                                java.lang.Object[] objArr92 = {java.lang.Long.valueOf((i8 ^ r3) ^ (-6583680919075291136L)), -1532882665L};
                                                                                byte[] bArr8 = $$d;
                                                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                                                d(bArr8[127], bArr8[189], bArr8[63], objArr93);
                                                                                java.lang.Class<?> cls36 = java.lang.Class.forName((java.lang.String) objArr93[0]);
                                                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                                                d(bArr8[15], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED, (byte) (-bArr8[43]), objArr94);
                                                                                cls36.getMethod((java.lang.String) objArr94[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr92);
                                                                                java.lang.Object[] objArr95 = {objArr10, java.lang.Integer.valueOf(((int[]) objArr10[9])[0]), num};
                                                                                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                                if (obj41 == null) {
                                                                                    obj41 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 4717 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj41);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj41).invoke(null, objArr95);
                                                                                int i136 = getCvrMaskAnd;
                                                                                int i137 = (i136 ^ 17) + ((i136 & 17) << 1);
                                                                                getGpoResponse = i137 % 128;
                                                                                if (i137 % 2 != 0) {
                                                                                    return null;
                                                                                }
                                                                                throw new java.lang.ArithmeticException();
                                                                            }
                                                                            int i138 = getCvrMaskAnd;
                                                                            int i139 = (i138 ^ 57) + ((i138 & 57) << 1);
                                                                            getGpoResponse = i139 % 128;
                                                                            if (i139 % 2 == 0) {
                                                                                java.lang.Object[] objArr96 = {objArr10, java.lang.Integer.valueOf(((int[]) objArr10[86])[0]), 1};
                                                                                java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                                if (obj42 == null) {
                                                                                    obj42 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.Color.blue(0), android.view.KeyEvent.getDeadChar(0, 0) + 4717, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj42);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj42).invoke(null, objArr96);
                                                                            } else {
                                                                                java.lang.Object[] objArr97 = {objArr10, java.lang.Integer.valueOf(((int[]) objArr10[9])[0]), num};
                                                                                java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                                if (obj43 == null) {
                                                                                    obj43 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 33, android.view.View.MeasureSpec.getSize(0) + 4717, (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj43);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj43).invoke(null, objArr97);
                                                                            }
                                                                            int identityHashCode14 = java.lang.System.identityHashCode(setsaveenabled);
                                                                            int i140 = -(-(((~(((-107479868) & identityHashCode14) | ((-107479868) ^ identityHashCode14))) | 2621698) * 1504));
                                                                            int i141 = ((((-1768846003) | i140) << 1) - (i140 ^ (-1768846003))) + ((~((identityHashCode14 ^ (-104858170)) | ((-104858170) & identityHashCode14))) * (-1504));
                                                                            int identityHashCode15 = java.lang.System.identityHashCode(setsaveenabled);
                                                                            int i142 = ((((-2124414592) & identityHashCode15) | ((-2124414592) ^ identityHashCode15)) * 988) + 1013918636;
                                                                            int i143 = ~identityHashCode15;
                                                                            int i144 = ~(((-2124395136) & i143) | ((-2124395136) ^ i143));
                                                                            int i145 = -(-(((i144 ^ 1812435484) | (1812435484 & i144)) * (-1976)));
                                                                            int i146 = (~((identityHashCode15 ^ (-1812454941)) | ((-1812454941) & identityHashCode15))) | (-2124414592);
                                                                            int i147 = ~((i143 ^ 1812454940) | (1812454940 & i143));
                                                                            if ((1568392048 ^ i141) + ((i141 & 1568392048) << 1) <= (((i142 | i145) << 1) - (i142 ^ i145)) + (((i146 ^ i147) | (i146 & i147)) * 988)) {
                                                                                return null;
                                                                            }
                                                                            throw new java.lang.ArithmeticException();
                                                                        }
                                                                    }
                                                                    long longValue3 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 48, 708 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (34285 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                                    c4 = 1;
                                                                    byte b15 = (byte) (bArr[34] - 1);
                                                                    byte b16 = bArr[28];
                                                                    java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                                    c(b15, (short) 75, b16, objArr98);
                                                                    c5 = 0;
                                                                    cls37.getField((java.lang.String) objArr98[0]).set(null, java.lang.Long.valueOf(longValue3));
                                                                    i8 = ((int[]) objArr10[c4])[c5];
                                                                    if (((int[]) objArr10[c5])[c5] == i8) {
                                                                    }
                                                                } catch (java.lang.Exception unused3) {
                                                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                }
                                                                java.lang.Object[] objArr99 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str17, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), num, 2077718106};
                                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                                if (obj4 == null) {
                                                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 48, android.text.TextUtils.getTrimmedLength("") + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.os.Process.getGidForName("") + 34285));
                                                                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                    c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr100);
                                                                    obj4 = cls38.getMethod((java.lang.String) objArr100[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj4);
                                                                }
                                                                objArr10 = (java.lang.Object[]) ((java.lang.reflect.Method) obj4).invoke(null, objArr99);
                                                                java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46, 706 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (34284 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                                                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                                c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr101);
                                                                cls39.getField((java.lang.String) objArr101[0]).set(null, objArr10);
                                                            }
                                                        }
                                                        char doubleTapTimeout2 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                        int i148 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                        int identityHashCode16 = java.lang.System.identityHashCode(setsaveenabled);
                                                        int i149 = (i148 * (-751)) - 19526;
                                                        int i150 = ~i148;
                                                        int i151 = ~(i150 | (-27));
                                                        int i152 = ~(i150 | identityHashCode16);
                                                        int i153 = -(-(((i151 ^ i152) | (i151 & i152)) * 1504));
                                                        int i154 = (i149 ^ i153) + ((i149 & i153) << 1);
                                                        int i155 = (i150 ^ 26) | (i150 & 26);
                                                        int i156 = -(-((~((identityHashCode16 ^ i155) | (identityHashCode16 & i155))) * (-1504)));
                                                        int i157 = (i154 & i156) + (i156 | i154);
                                                        int i158 = ~i155;
                                                        int i159 = ~((i148 ^ (-27)) | (i148 & (-27)));
                                                        int i160 = ((i159 ^ i158) | (i159 & i158)) * 752;
                                                        int i161 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                        java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                        b(doubleTapTimeout2, (i157 ^ i160) + ((i160 & i157) << 1), ((i161 | 69) << 1) - (i161 ^ 69), objArr102);
                                                        java.lang.Class<?> cls40 = java.lang.Class.forName((java.lang.String) objArr102[0]);
                                                        int touchSlop = android.view.ViewConfiguration.getTouchSlop() >> 8;
                                                        java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                        b((char) (((touchSlop | 12184) << 1) - (touchSlop ^ 12184)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, android.text.TextUtils.indexOf("", "", 0, 0) + 95, objArr103);
                                                        context4 = (android.content.Context) cls40.getMethod((java.lang.String) objArr103[0], new java.lang.Class[0]).invoke(null, null);
                                                        if (context4 != null) {
                                                            int i162 = getGpoResponse;
                                                            getCvrMaskAnd = (((i162 | 13) << 1) - (i162 ^ 13)) % 128;
                                                            context4 = context4.getApplicationContext();
                                                        }
                                                        java.lang.Object[] objArr104 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str16, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), -873429401};
                                                        byte[] bArr9 = $$d;
                                                        byte b17 = (byte) (-bArr9[134]);
                                                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                        d(b17, (short) (b17 + 5), bArr9[63], objArr105);
                                                        java.lang.Class<?> cls41 = java.lang.Class.forName((java.lang.String) objArr105[0]);
                                                        byte b18 = bArr9[189];
                                                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                        d(b18, (short) (b18 | 261), (byte) ($$e | 16), objArr106);
                                                        java.lang.String str26 = (java.lang.String) objArr106[0];
                                                        int i163 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                        int identityHashCode17 = java.lang.System.identityHashCode(setsaveenabled);
                                                        int i164 = ~identityHashCode17;
                                                        int i165 = i164 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                        int i166 = i163 | 127;
                                                        str17 = str16;
                                                        str18 = str15;
                                                        int i167 = ((((i163 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) - 125349) - (~(((~((i166 ^ identityHashCode17) | (i166 & identityHashCode17))) | (~((i165 ^ i163) | (i165 & i163)))) * 988))) - 1) + (((i163 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i163 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * (-988));
                                                        int i168 = ~i163;
                                                        int i169 = ~((i168 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i168 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                        int i170 = ~((identityHashCode17 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (identityHashCode17 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                        int i171 = (i163 ^ i164) | (i164 & i163);
                                                        int i172 = ((~((i171 ^ 127) | (i171 & 127))) | (i169 & i170) | (i169 ^ i170)) * 988;
                                                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                        e(null, null, ((i167 | i172) << 1) - (i172 ^ i167), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr107);
                                                        objArr8 = (java.lang.Object[]) cls41.getMethod(str26, java.lang.Class.forName((java.lang.String) objArr107[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr104);
                                                        if (context4 == null) {
                                                            int i173 = getGpoResponse + 15;
                                                            getCvrMaskAnd = i173 % 128;
                                                            try {
                                                                if (i173 % 2 != 0) {
                                                                    java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.View.MeasureSpec.getMode(0) + 584, (char) (24290 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                    c(bArr[34], bArr[37], bArr[28], objArr108);
                                                                    cls42.getField((java.lang.String) objArr108[0]).set(null, objArr8);
                                                                    valueOf = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                                                    cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 51, android.text.TextUtils.indexOf("", "", 0, 0) + 584, (char) (24291 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                                                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                    c((byte) (-bArr[116]), (short) 58, b14, objArr109);
                                                                    obj3 = objArr109[0];
                                                                } else {
                                                                    java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 51, 584 - android.graphics.Color.red(0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 24292));
                                                                    java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                    c(bArr[34], bArr[37], bArr[28], objArr110);
                                                                    cls43.getField((java.lang.String) objArr110[0]).set(null, objArr8);
                                                                    valueOf = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                                                    cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24291 - android.text.TextUtils.indexOf("", "", 0)));
                                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                    c((byte) (-bArr[116]), (short) 58, b14, objArr111);
                                                                    obj3 = objArr111[0];
                                                                }
                                                                cls.getField((java.lang.String) obj3).set(null, valueOf);
                                                                i7 = ((int[]) objArr8[1])[0];
                                                                if (((int[]) objArr8[0])[0] == i7) {
                                                                }
                                                                java.lang.Class cls332 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.widget.ExpandableListView.getPackedPositionType(0L), android.graphics.Color.rgb(0, 0, 0) + 16777923, (char) (34284 - (android.os.Process.myTid() >> 22)));
                                                                java.lang.Object[] objArr872 = new java.lang.Object[1];
                                                                c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr872);
                                                                j6 = cls332.getField((java.lang.String) objArr872[0]).getLong(null);
                                                                if (j6 != -1) {
                                                                }
                                                                java.lang.Object[] objArr992 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str17, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), num, 2077718106};
                                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                                if (obj4 == null) {
                                                                }
                                                                objArr10 = (java.lang.Object[]) ((java.lang.reflect.Method) obj4).invoke(null, objArr992);
                                                                java.lang.Class cls392 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46, 706 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (34284 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                                                                java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                                                c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr1012);
                                                                cls392.getField((java.lang.String) objArr1012[0]).set(null, objArr10);
                                                                long longValue32 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                java.lang.Class cls372 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 48, 708 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (34285 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                                c4 = 1;
                                                                byte b152 = (byte) (bArr[34] - 1);
                                                                byte b162 = bArr[28];
                                                                java.lang.Object[] objArr982 = new java.lang.Object[1];
                                                                c(b152, (short) 75, b162, objArr982);
                                                                c5 = 0;
                                                                cls372.getField((java.lang.String) objArr982[0]).set(null, java.lang.Long.valueOf(longValue32));
                                                                i8 = ((int[]) objArr10[c4])[c5];
                                                                if (((int[]) objArr10[c5])[c5] == i8) {
                                                                }
                                                            } catch (java.lang.Exception unused4) {
                                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                            }
                                                        } else {
                                                            objArr9 = objArr8;
                                                            objArr8 = objArr9;
                                                            i7 = ((int[]) objArr8[1])[0];
                                                            if (((int[]) objArr8[0])[0] == i7) {
                                                            }
                                                            java.lang.Class cls3322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.widget.ExpandableListView.getPackedPositionType(0L), android.graphics.Color.rgb(0, 0, 0) + 16777923, (char) (34284 - (android.os.Process.myTid() >> 22)));
                                                            java.lang.Object[] objArr8722 = new java.lang.Object[1];
                                                            c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr8722);
                                                            j6 = cls3322.getField((java.lang.String) objArr8722[0]).getLong(null);
                                                            if (j6 != -1) {
                                                            }
                                                            java.lang.Object[] objArr9922 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str17, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), num, 2077718106};
                                                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                            if (obj4 == null) {
                                                            }
                                                            objArr10 = (java.lang.Object[]) ((java.lang.reflect.Method) obj4).invoke(null, objArr9922);
                                                            java.lang.Class cls3922 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46, 706 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (34284 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                                                            java.lang.Object[] objArr10122 = new java.lang.Object[1];
                                                            c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr10122);
                                                            cls3922.getField((java.lang.String) objArr10122[0]).set(null, objArr10);
                                                            long longValue322 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                            java.lang.Class cls3722 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 48, 708 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (34285 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                            c4 = 1;
                                                            byte b1522 = (byte) (bArr[34] - 1);
                                                            byte b1622 = bArr[28];
                                                            java.lang.Object[] objArr9822 = new java.lang.Object[1];
                                                            c(b1522, (short) 75, b1622, objArr9822);
                                                            c5 = 0;
                                                            cls3722.getField((java.lang.String) objArr9822[0]).set(null, java.lang.Long.valueOf(longValue322));
                                                            i8 = ((int[]) objArr10[c4])[c5];
                                                            if (((int[]) objArr10[c5])[c5] == i8) {
                                                            }
                                                        }
                                                    }
                                                }
                                                long longValue4 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 584 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (24291 - android.view.View.resolveSizeAndState(0, 0, 0)));
                                                c3 = 1;
                                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                c((byte) (-bArr[11]), bArr[21], b11, objArr112);
                                                i5 = 0;
                                                cls44.getField((java.lang.String) objArr112[0]).set(null, java.lang.Long.valueOf(longValue4));
                                                i6 = ((int[]) objArr7[c3])[i5];
                                                if (((int[]) objArr7[i5])[i5] != i6) {
                                                }
                                                java.lang.Class cls302 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 51, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24292 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                java.lang.Object[] objArr782 = new java.lang.Object[1];
                                                byte b142 = b5;
                                                c((byte) (-bArr[116]), (short) 58, b142, objArr782);
                                                j5 = cls302.getField((java.lang.String) objArr782[0]).getLong(null);
                                                if (j5 != -1) {
                                                }
                                                char doubleTapTimeout22 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                int i1482 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                int identityHashCode162 = java.lang.System.identityHashCode(setsaveenabled);
                                                int i1492 = (i1482 * (-751)) - 19526;
                                                int i1502 = ~i1482;
                                                int i1512 = ~(i1502 | (-27));
                                                int i1522 = ~(i1502 | identityHashCode162);
                                                int i1532 = -(-(((i1512 ^ i1522) | (i1512 & i1522)) * 1504));
                                                int i1542 = (i1492 ^ i1532) + ((i1492 & i1532) << 1);
                                                int i1552 = (i1502 ^ 26) | (i1502 & 26);
                                                int i1562 = -(-((~((identityHashCode162 ^ i1552) | (identityHashCode162 & i1552))) * (-1504)));
                                                int i1572 = (i1542 & i1562) + (i1562 | i1542);
                                                int i1582 = ~i1552;
                                                int i1592 = ~((i1482 ^ (-27)) | (i1482 & (-27)));
                                                int i1602 = ((i1592 ^ i1582) | (i1592 & i1582)) * 752;
                                                int i1612 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                java.lang.Object[] objArr1022 = new java.lang.Object[1];
                                                b(doubleTapTimeout22, (i1572 ^ i1602) + ((i1602 & i1572) << 1), ((i1612 | 69) << 1) - (i1612 ^ 69), objArr1022);
                                                java.lang.Class<?> cls402 = java.lang.Class.forName((java.lang.String) objArr1022[0]);
                                                int touchSlop2 = android.view.ViewConfiguration.getTouchSlop() >> 8;
                                                java.lang.Object[] objArr1032 = new java.lang.Object[1];
                                                b((char) (((touchSlop2 | 12184) << 1) - (touchSlop2 ^ 12184)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, android.text.TextUtils.indexOf("", "", 0, 0) + 95, objArr1032);
                                                context4 = (android.content.Context) cls402.getMethod((java.lang.String) objArr1032[0], new java.lang.Class[0]).invoke(null, null);
                                                if (context4 != null) {
                                                }
                                                java.lang.Object[] objArr1042 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str16, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), -873429401};
                                                byte[] bArr92 = $$d;
                                                byte b172 = (byte) (-bArr92[134]);
                                                java.lang.Object[] objArr1052 = new java.lang.Object[1];
                                                d(b172, (short) (b172 + 5), bArr92[63], objArr1052);
                                                java.lang.Class<?> cls412 = java.lang.Class.forName((java.lang.String) objArr1052[0]);
                                                byte b182 = bArr92[189];
                                                java.lang.Object[] objArr1062 = new java.lang.Object[1];
                                                d(b182, (short) (b182 | 261), (byte) ($$e | 16), objArr1062);
                                                java.lang.String str262 = (java.lang.String) objArr1062[0];
                                                int i1632 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int identityHashCode172 = java.lang.System.identityHashCode(setsaveenabled);
                                                int i1642 = ~identityHashCode172;
                                                int i1652 = i1642 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                int i1662 = i1632 | 127;
                                                str17 = str16;
                                                str18 = str15;
                                                int i1672 = ((((i1632 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) - 125349) - (~(((~((i1662 ^ identityHashCode172) | (i1662 & identityHashCode172))) | (~((i1652 ^ i1632) | (i1652 & i1632)))) * 988))) - 1) + (((i1632 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i1632 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * (-988));
                                                int i1682 = ~i1632;
                                                int i1692 = ~((i1682 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i1682 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                int i1702 = ~((identityHashCode172 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (identityHashCode172 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                int i1712 = (i1632 ^ i1642) | (i1642 & i1632);
                                                int i1722 = ((~((i1712 ^ 127) | (i1712 & 127))) | (i1692 & i1702) | (i1692 ^ i1702)) * 988;
                                                java.lang.Object[] objArr1072 = new java.lang.Object[1];
                                                e(null, null, ((i1672 | i1722) << 1) - (i1722 ^ i1672), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr1072);
                                                objArr8 = (java.lang.Object[]) cls412.getMethod(str262, java.lang.Class.forName((java.lang.String) objArr1072[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1042);
                                                if (context4 == null) {
                                                }
                                            } catch (java.lang.Exception unused5) {
                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                            }
                                            str16 = str12;
                                            java.lang.Object[] objArr113 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str16, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 966711889};
                                            byte[] bArr10 = $$d;
                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                            d(bArr10[37], (short) (bArr10[458] + 1), bArr10[63], objArr114);
                                            java.lang.Class<?> cls45 = java.lang.Class.forName((java.lang.String) objArr114[0]);
                                            byte b19 = bArr10[35];
                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                            d(b19, (short) (b19 | 474), (byte) ($$e | 16), objArr115);
                                            objArr7 = (java.lang.Object[]) cls45.getMethod((java.lang.String) objArr115[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr113);
                                            java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf("", "", 0, 0), 584 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (24292 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                            byte b20 = bArr[3];
                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                            c(b20, b20, bArr[34], objArr116);
                                            cls46.getField((java.lang.String) objArr116[0]).set(null, objArr7);
                                        }
                                    }
                                    int i174 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int identityHashCode18 = java.lang.System.identityHashCode(setsaveenabled);
                                    int i175 = i174 * 491;
                                    int i176 = ~i174;
                                    int i177 = (i176 ^ (-2)) | (i176 & (-2));
                                    int i178 = ~identityHashCode18;
                                    int i179 = (i175 ^ (-489)) + ((i175 & (-489)) << 1) + (((i177 & i178) | (i177 ^ i178)) * (-490));
                                    int i180 = ~((i174 ^ (-2)) | (i174 & (-2)));
                                    int i181 = ~((identityHashCode18 ^ (-2)) | (identityHashCode18 & (-2)));
                                    int i182 = ((i180 ^ i181) | (i180 & i181)) * 490;
                                    int i183 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                    b((char) ((i179 & i182) + (i182 | i179) + (i176 * 490)), ((i183 | 25) << 1) - (i183 ^ 25), 69 - android.view.View.getDefaultSize(0, 0), objArr117);
                                    java.lang.Class<?> cls47 = java.lang.Class.forName((java.lang.String) objArr117[0]);
                                    int i184 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int i185 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                                    int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
                                    int identityHashCode19 = java.lang.System.identityHashCode(setsaveenabled);
                                    int i186 = indexOf * (-209);
                                    int i187 = ((i186 | (-19855)) << 1) - (i186 ^ (-19855));
                                    int i188 = ~indexOf;
                                    int i189 = -(-((~((i188 ^ (-96)) | (i188 & (-96)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                    str11 = str9;
                                    int i190 = ~identityHashCode19;
                                    num = 0;
                                    int i191 = ~((i190 ^ (-96)) | (i190 & (-96)));
                                    java.lang.String str27 = str10;
                                    int i192 = ~((i188 ^ identityHashCode19) | (i188 & identityHashCode19));
                                    int i193 = (((i187 ^ i189) + ((i189 & i187) << 1)) - (~(((i191 & i192) | (i191 ^ i192)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) - 1;
                                    int i194 = ~((i190 & i188) | (i188 ^ i190) | 95);
                                    int i195 = (indexOf & (-96)) | (indexOf ^ (-96));
                                    int i196 = ~((i195 ^ identityHashCode19) | (identityHashCode19 & i195));
                                    int i197 = -(-(((i194 ^ i196) | (i196 & i194)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                    b((char) ((i184 ^ 12183) + ((i184 & 12183) << 1)), (i185 ^ 18) + ((i185 & 18) << 1), (i193 & i197) + (i193 | i197), objArr118);
                                    context3 = (android.content.Context) cls47.getMethod((java.lang.String) objArr118[0], new java.lang.Class[0]).invoke(null, null);
                                    if (context3 != null) {
                                        int i198 = getCvrMaskAnd;
                                        getGpoResponse = ((i198 ^ 97) + ((i198 & 97) << 1)) % 128;
                                        context3 = context3.getApplicationContext();
                                        getCvrMaskAnd = (getGpoResponse + 105) % 128;
                                    }
                                    java.lang.Object[] objArr119 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), -1958191123};
                                    byte[] bArr11 = $$d;
                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                    d(bArr11[10], 106, bArr11[63], objArr120);
                                    java.lang.Class<?> cls48 = java.lang.Class.forName((java.lang.String) objArr120[0]);
                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                    d(bArr11[376], 620, bArr11[189], objArr121);
                                    java.lang.String str28 = (java.lang.String) objArr121[0];
                                    int indexOf2 = android.text.TextUtils.indexOf("", "");
                                    int identityHashCode20 = java.lang.System.identityHashCode(setsaveenabled);
                                    int i199 = (indexOf2 * (-716)) + 182245;
                                    int i200 = ~indexOf2;
                                    int i201 = ((i200 ^ 127) | (i200 & 127)) * (-1434);
                                    int i202 = ~identityHashCode20;
                                    str12 = str8;
                                    str13 = str20;
                                    int i203 = (~(indexOf2 | 127)) | (~((i202 & 127) | (i202 ^ 127)));
                                    int i204 = i200 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                    int i205 = ~((i204 ^ identityHashCode20) | (i204 & identityHashCode20));
                                    int i206 = (i199 & i201) + (i199 | i201) + (((i203 & i205) | (i203 ^ i205)) * 717);
                                    int i207 = (i200 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i200 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                    int i208 = -(-(((~((indexOf2 ^ 127) | (indexOf2 & 127))) | (~((i207 & i202) | (i207 ^ i202))) | (~(identityHashCode20 | 127))) * 717));
                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                    e(null, null, (i206 ^ i208) + ((i206 & i208) << 1), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr122);
                                    objArr5 = (java.lang.Object[]) cls48.getMethod(str28, java.lang.Class.forName((java.lang.String) objArr122[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr119);
                                    if (context3 == null) {
                                        java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 52, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 583, (char) (24290 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                        c((byte) (bArr[67] - 1), (short) 69, bArr[3], objArr123);
                                        cls49.getField((java.lang.String) objArr123[0]).set(null, objArr5);
                                        try {
                                            str14 = str27;
                                            long longValue5 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                            java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 583, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24290));
                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                            c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr124);
                                            cls50.getField((java.lang.String) objArr124[0]).set(null, java.lang.Long.valueOf(longValue5));
                                            int i209 = getCvrMaskAnd;
                                            getGpoResponse = ((i209 ^ 99) + ((i209 & 99) << 1)) % 128;
                                            i4 = ((int[]) objArr5[1])[0];
                                            if (((int[]) objArr5[0])[0] == i4) {
                                            }
                                            java.lang.Class cls252 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 51, android.graphics.Color.argb(0, 0, 0, 0) + 584, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24290));
                                            java.lang.Object[] objArr682 = new java.lang.Object[1];
                                            byte b112 = b7;
                                            c((byte) (-bArr[11]), bArr[21], b112, objArr682);
                                            j4 = cls252.getField((java.lang.String) objArr682[0]).getLong(null);
                                            if (j4 != -1) {
                                            }
                                            str16 = str12;
                                            java.lang.Object[] objArr1132 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str16, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 966711889};
                                            byte[] bArr102 = $$d;
                                            java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                            d(bArr102[37], (short) (bArr102[458] + 1), bArr102[63], objArr1142);
                                            java.lang.Class<?> cls452 = java.lang.Class.forName((java.lang.String) objArr1142[0]);
                                            byte b192 = bArr102[35];
                                            java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                            d(b192, (short) (b192 | 474), (byte) ($$e | 16), objArr1152);
                                            objArr7 = (java.lang.Object[]) cls452.getMethod((java.lang.String) objArr1152[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1132);
                                            java.lang.Class cls462 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf("", "", 0, 0), 584 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (24292 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                            byte b202 = bArr[3];
                                            java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                            c(b202, b202, bArr[34], objArr1162);
                                            cls462.getField((java.lang.String) objArr1162[0]).set(null, objArr7);
                                            long longValue42 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                            java.lang.Class cls442 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 584 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (24291 - android.view.View.resolveSizeAndState(0, 0, 0)));
                                            c3 = 1;
                                            java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                            c((byte) (-bArr[11]), bArr[21], b112, objArr1122);
                                            i5 = 0;
                                            cls442.getField((java.lang.String) objArr1122[0]).set(null, java.lang.Long.valueOf(longValue42));
                                            i6 = ((int[]) objArr7[c3])[i5];
                                            if (((int[]) objArr7[i5])[i5] != i6) {
                                            }
                                            java.lang.Class cls3022 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 51, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24292 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                            java.lang.Object[] objArr7822 = new java.lang.Object[1];
                                            byte b1422 = b5;
                                            c((byte) (-bArr[116]), (short) 58, b1422, objArr7822);
                                            j5 = cls3022.getField((java.lang.String) objArr7822[0]).getLong(null);
                                            if (j5 != -1) {
                                            }
                                            char doubleTapTimeout222 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            int i14822 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            int identityHashCode1622 = java.lang.System.identityHashCode(setsaveenabled);
                                            int i14922 = (i14822 * (-751)) - 19526;
                                            int i15022 = ~i14822;
                                            int i15122 = ~(i15022 | (-27));
                                            int i15222 = ~(i15022 | identityHashCode1622);
                                            int i15322 = -(-(((i15122 ^ i15222) | (i15122 & i15222)) * 1504));
                                            int i15422 = (i14922 ^ i15322) + ((i14922 & i15322) << 1);
                                            int i15522 = (i15022 ^ 26) | (i15022 & 26);
                                            int i15622 = -(-((~((identityHashCode1622 ^ i15522) | (identityHashCode1622 & i15522))) * (-1504)));
                                            int i15722 = (i15422 & i15622) + (i15622 | i15422);
                                            int i15822 = ~i15522;
                                            int i15922 = ~((i14822 ^ (-27)) | (i14822 & (-27)));
                                            int i16022 = ((i15922 ^ i15822) | (i15922 & i15822)) * 752;
                                            int i16122 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                            java.lang.Object[] objArr10222 = new java.lang.Object[1];
                                            b(doubleTapTimeout222, (i15722 ^ i16022) + ((i16022 & i15722) << 1), ((i16122 | 69) << 1) - (i16122 ^ 69), objArr10222);
                                            java.lang.Class<?> cls4022 = java.lang.Class.forName((java.lang.String) objArr10222[0]);
                                            int touchSlop22 = android.view.ViewConfiguration.getTouchSlop() >> 8;
                                            java.lang.Object[] objArr10322 = new java.lang.Object[1];
                                            b((char) (((touchSlop22 | 12184) << 1) - (touchSlop22 ^ 12184)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, android.text.TextUtils.indexOf("", "", 0, 0) + 95, objArr10322);
                                            context4 = (android.content.Context) cls4022.getMethod((java.lang.String) objArr10322[0], new java.lang.Class[0]).invoke(null, null);
                                            if (context4 != null) {
                                            }
                                            java.lang.Object[] objArr10422 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str16, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), -873429401};
                                            byte[] bArr922 = $$d;
                                            byte b1722 = (byte) (-bArr922[134]);
                                            java.lang.Object[] objArr10522 = new java.lang.Object[1];
                                            d(b1722, (short) (b1722 + 5), bArr922[63], objArr10522);
                                            java.lang.Class<?> cls4122 = java.lang.Class.forName((java.lang.String) objArr10522[0]);
                                            byte b1822 = bArr922[189];
                                            java.lang.Object[] objArr10622 = new java.lang.Object[1];
                                            d(b1822, (short) (b1822 | 261), (byte) ($$e | 16), objArr10622);
                                            java.lang.String str2622 = (java.lang.String) objArr10622[0];
                                            int i16322 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int identityHashCode1722 = java.lang.System.identityHashCode(setsaveenabled);
                                            int i16422 = ~identityHashCode1722;
                                            int i16522 = i16422 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                            int i16622 = i16322 | 127;
                                            str17 = str16;
                                            str18 = str15;
                                            int i16722 = ((((i16322 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) - 125349) - (~(((~((i16622 ^ identityHashCode1722) | (i16622 & identityHashCode1722))) | (~((i16522 ^ i16322) | (i16522 & i16322)))) * 988))) - 1) + (((i16322 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i16322 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * (-988));
                                            int i16822 = ~i16322;
                                            int i16922 = ~((i16822 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i16822 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                            int i17022 = ~((identityHashCode1722 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (identityHashCode1722 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                            int i17122 = (i16322 ^ i16422) | (i16422 & i16322);
                                            int i17222 = ((~((i17122 ^ 127) | (i17122 & 127))) | (i16922 & i17022) | (i16922 ^ i17022)) * 988;
                                            java.lang.Object[] objArr10722 = new java.lang.Object[1];
                                            e(null, null, ((i16722 | i17222) << 1) - (i17222 ^ i16722), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr10722);
                                            objArr8 = (java.lang.Object[]) cls4122.getMethod(str2622, java.lang.Class.forName((java.lang.String) objArr10722[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr10422);
                                            if (context4 == null) {
                                            }
                                        } catch (java.lang.Exception unused6) {
                                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                        }
                                    } else {
                                        str14 = str27;
                                        objArr6 = objArr5;
                                        objArr5 = objArr6;
                                        i4 = ((int[]) objArr5[1])[0];
                                        if (((int[]) objArr5[0])[0] == i4) {
                                        }
                                        java.lang.Class cls2522 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 51, android.graphics.Color.argb(0, 0, 0, 0) + 584, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24290));
                                        java.lang.Object[] objArr6822 = new java.lang.Object[1];
                                        byte b1122 = b7;
                                        c((byte) (-bArr[11]), bArr[21], b1122, objArr6822);
                                        j4 = cls2522.getField((java.lang.String) objArr6822[0]).getLong(null);
                                        if (j4 != -1) {
                                        }
                                        str16 = str12;
                                        java.lang.Object[] objArr11322 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str16, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 966711889};
                                        byte[] bArr1022 = $$d;
                                        java.lang.Object[] objArr11422 = new java.lang.Object[1];
                                        d(bArr1022[37], (short) (bArr1022[458] + 1), bArr1022[63], objArr11422);
                                        java.lang.Class<?> cls4522 = java.lang.Class.forName((java.lang.String) objArr11422[0]);
                                        byte b1922 = bArr1022[35];
                                        java.lang.Object[] objArr11522 = new java.lang.Object[1];
                                        d(b1922, (short) (b1922 | 474), (byte) ($$e | 16), objArr11522);
                                        objArr7 = (java.lang.Object[]) cls4522.getMethod((java.lang.String) objArr11522[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr11322);
                                        java.lang.Class cls4622 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf("", "", 0, 0), 584 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (24292 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                        byte b2022 = bArr[3];
                                        java.lang.Object[] objArr11622 = new java.lang.Object[1];
                                        c(b2022, b2022, bArr[34], objArr11622);
                                        cls4622.getField((java.lang.String) objArr11622[0]).set(null, objArr7);
                                        long longValue422 = ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Class cls4422 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 584 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (24291 - android.view.View.resolveSizeAndState(0, 0, 0)));
                                        c3 = 1;
                                        java.lang.Object[] objArr11222 = new java.lang.Object[1];
                                        c((byte) (-bArr[11]), bArr[21], b1122, objArr11222);
                                        i5 = 0;
                                        cls4422.getField((java.lang.String) objArr11222[0]).set(null, java.lang.Long.valueOf(longValue422));
                                        i6 = ((int[]) objArr7[c3])[i5];
                                        if (((int[]) objArr7[i5])[i5] != i6) {
                                        }
                                        java.lang.Class cls30222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 51, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24292 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                        java.lang.Object[] objArr78222 = new java.lang.Object[1];
                                        byte b14222 = b5;
                                        c((byte) (-bArr[116]), (short) 58, b14222, objArr78222);
                                        j5 = cls30222.getField((java.lang.String) objArr78222[0]).getLong(null);
                                        if (j5 != -1) {
                                        }
                                        char doubleTapTimeout2222 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        int i148222 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int identityHashCode16222 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i149222 = (i148222 * (-751)) - 19526;
                                        int i150222 = ~i148222;
                                        int i151222 = ~(i150222 | (-27));
                                        int i152222 = ~(i150222 | identityHashCode16222);
                                        int i153222 = -(-(((i151222 ^ i152222) | (i151222 & i152222)) * 1504));
                                        int i154222 = (i149222 ^ i153222) + ((i149222 & i153222) << 1);
                                        int i155222 = (i150222 ^ 26) | (i150222 & 26);
                                        int i156222 = -(-((~((identityHashCode16222 ^ i155222) | (identityHashCode16222 & i155222))) * (-1504)));
                                        int i157222 = (i154222 & i156222) + (i156222 | i154222);
                                        int i158222 = ~i155222;
                                        int i159222 = ~((i148222 ^ (-27)) | (i148222 & (-27)));
                                        int i160222 = ((i159222 ^ i158222) | (i159222 & i158222)) * 752;
                                        int i161222 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                        java.lang.Object[] objArr102222 = new java.lang.Object[1];
                                        b(doubleTapTimeout2222, (i157222 ^ i160222) + ((i160222 & i157222) << 1), ((i161222 | 69) << 1) - (i161222 ^ 69), objArr102222);
                                        java.lang.Class<?> cls40222 = java.lang.Class.forName((java.lang.String) objArr102222[0]);
                                        int touchSlop222 = android.view.ViewConfiguration.getTouchSlop() >> 8;
                                        java.lang.Object[] objArr103222 = new java.lang.Object[1];
                                        b((char) (((touchSlop222 | 12184) << 1) - (touchSlop222 ^ 12184)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, android.text.TextUtils.indexOf("", "", 0, 0) + 95, objArr103222);
                                        context4 = (android.content.Context) cls40222.getMethod((java.lang.String) objArr103222[0], new java.lang.Class[0]).invoke(null, null);
                                        if (context4 != null) {
                                        }
                                        java.lang.Object[] objArr104222 = {context4, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str16, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), -873429401};
                                        byte[] bArr9222 = $$d;
                                        byte b17222 = (byte) (-bArr9222[134]);
                                        java.lang.Object[] objArr105222 = new java.lang.Object[1];
                                        d(b17222, (short) (b17222 + 5), bArr9222[63], objArr105222);
                                        java.lang.Class<?> cls41222 = java.lang.Class.forName((java.lang.String) objArr105222[0]);
                                        byte b18222 = bArr9222[189];
                                        java.lang.Object[] objArr106222 = new java.lang.Object[1];
                                        d(b18222, (short) (b18222 | 261), (byte) ($$e | 16), objArr106222);
                                        java.lang.String str26222 = (java.lang.String) objArr106222[0];
                                        int i163222 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        int identityHashCode17222 = java.lang.System.identityHashCode(setsaveenabled);
                                        int i164222 = ~identityHashCode17222;
                                        int i165222 = i164222 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                        int i166222 = i163222 | 127;
                                        str17 = str16;
                                        str18 = str15;
                                        int i167222 = ((((i163222 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) - 125349) - (~(((~((i166222 ^ identityHashCode17222) | (i166222 & identityHashCode17222))) | (~((i165222 ^ i163222) | (i165222 & i163222)))) * 988))) - 1) + (((i163222 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i163222 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * (-988));
                                        int i168222 = ~i163222;
                                        int i169222 = ~((i168222 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i168222 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                        int i170222 = ~((identityHashCode17222 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (identityHashCode17222 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                        int i171222 = (i163222 ^ i164222) | (i164222 & i163222);
                                        int i172222 = ((~((i171222 ^ 127) | (i171222 & 127))) | (i169222 & i170222) | (i169222 ^ i170222)) * 988;
                                        java.lang.Object[] objArr107222 = new java.lang.Object[1];
                                        e(null, null, ((i167222 | i172222) << 1) - (i172222 ^ i167222), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr107222);
                                        objArr8 = (java.lang.Object[]) cls41222.getMethod(str26222, java.lang.Class.forName((java.lang.String) objArr107222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr104222);
                                        if (context4 == null) {
                                        }
                                    }
                                }
                            }
                            str10 = r34;
                            long longValue6 = ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str10, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myTid() >> 22), 667 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40024));
                            c = 1;
                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                            b6 = b4;
                            c((byte) (-bArr[11]), bArr[21], b6, objArr125);
                            c2 = 0;
                            cls51.getField((java.lang.String) objArr125[0]).set(null, java.lang.Long.valueOf(longValue6));
                            i3 = ((int[]) objArr4[c])[c2];
                            if (((int[]) objArr4[c2])[c2] != i3) {
                            }
                            java.lang.Class cls212 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.graphics.Color.blue(0), 584 - android.view.KeyEvent.getDeadChar(0, 0), (char) (24339 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                            java.lang.Object[] objArr582 = new java.lang.Object[1];
                            c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr582);
                            j3 = cls212.getField((java.lang.String) objArr582[0]).getLong(null);
                            if (j3 != -1) {
                            }
                            int i1742 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int identityHashCode182 = java.lang.System.identityHashCode(setsaveenabled);
                            int i1752 = i1742 * 491;
                            int i1762 = ~i1742;
                            int i1772 = (i1762 ^ (-2)) | (i1762 & (-2));
                            int i1782 = ~identityHashCode182;
                            int i1792 = (i1752 ^ (-489)) + ((i1752 & (-489)) << 1) + (((i1772 & i1782) | (i1772 ^ i1782)) * (-490));
                            int i1802 = ~((i1742 ^ (-2)) | (i1742 & (-2)));
                            int i1812 = ~((identityHashCode182 ^ (-2)) | (identityHashCode182 & (-2)));
                            int i1822 = ((i1802 ^ i1812) | (i1802 & i1812)) * 490;
                            int i1832 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            java.lang.Object[] objArr1172 = new java.lang.Object[1];
                            b((char) ((i1792 & i1822) + (i1822 | i1792) + (i1762 * 490)), ((i1832 | 25) << 1) - (i1832 ^ 25), 69 - android.view.View.getDefaultSize(0, 0), objArr1172);
                            java.lang.Class<?> cls472 = java.lang.Class.forName((java.lang.String) objArr1172[0]);
                            int i1842 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            int i1852 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                            int indexOf3 = android.text.TextUtils.indexOf("", "", 0, 0);
                            int identityHashCode192 = java.lang.System.identityHashCode(setsaveenabled);
                            int i1862 = indexOf3 * (-209);
                            int i1872 = ((i1862 | (-19855)) << 1) - (i1862 ^ (-19855));
                            int i1882 = ~indexOf3;
                            int i1892 = -(-((~((i1882 ^ (-96)) | (i1882 & (-96)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                            str11 = str9;
                            int i1902 = ~identityHashCode192;
                            num = 0;
                            int i1912 = ~((i1902 ^ (-96)) | (i1902 & (-96)));
                            java.lang.String str272 = str10;
                            int i1922 = ~((i1882 ^ identityHashCode192) | (i1882 & identityHashCode192));
                            int i1932 = (((i1872 ^ i1892) + ((i1892 & i1872) << 1)) - (~(((i1912 & i1922) | (i1912 ^ i1922)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) - 1;
                            int i1942 = ~((i1902 & i1882) | (i1882 ^ i1902) | 95);
                            int i1952 = (indexOf3 & (-96)) | (indexOf3 ^ (-96));
                            int i1962 = ~((i1952 ^ identityHashCode192) | (identityHashCode192 & i1952));
                            int i1972 = -(-(((i1942 ^ i1962) | (i1962 & i1942)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                            java.lang.Object[] objArr1182 = new java.lang.Object[1];
                            b((char) ((i1842 ^ 12183) + ((i1842 & 12183) << 1)), (i1852 ^ 18) + ((i1852 & 18) << 1), (i1932 & i1972) + (i1932 | i1972), objArr1182);
                            context3 = (android.content.Context) cls472.getMethod((java.lang.String) objArr1182[0], new java.lang.Class[0]).invoke(null, null);
                            if (context3 != null) {
                            }
                            java.lang.Object[] objArr1192 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), -1958191123};
                            byte[] bArr112 = $$d;
                            java.lang.Object[] objArr1202 = new java.lang.Object[1];
                            d(bArr112[10], 106, bArr112[63], objArr1202);
                            java.lang.Class<?> cls482 = java.lang.Class.forName((java.lang.String) objArr1202[0]);
                            java.lang.Object[] objArr1212 = new java.lang.Object[1];
                            d(bArr112[376], 620, bArr112[189], objArr1212);
                            java.lang.String str282 = (java.lang.String) objArr1212[0];
                            int indexOf22 = android.text.TextUtils.indexOf("", "");
                            int identityHashCode202 = java.lang.System.identityHashCode(setsaveenabled);
                            int i1992 = (indexOf22 * (-716)) + 182245;
                            int i2002 = ~indexOf22;
                            int i2012 = ((i2002 ^ 127) | (i2002 & 127)) * (-1434);
                            int i2022 = ~identityHashCode202;
                            str12 = str8;
                            str13 = str20;
                            int i2032 = (~(indexOf22 | 127)) | (~((i2022 & 127) | (i2022 ^ 127)));
                            int i2042 = i2002 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                            int i2052 = ~((i2042 ^ identityHashCode202) | (i2042 & identityHashCode202));
                            int i2062 = (i1992 & i2012) + (i1992 | i2012) + (((i2032 & i2052) | (i2032 ^ i2052)) * 717);
                            int i2072 = (i2002 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i2002 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                            int i2082 = -(-(((~((indexOf22 ^ 127) | (indexOf22 & 127))) | (~((i2072 & i2022) | (i2072 ^ i2022))) | (~(identityHashCode202 | 127))) * 717));
                            java.lang.Object[] objArr1222 = new java.lang.Object[1];
                            e(null, null, (i2062 ^ i2082) + ((i2062 & i2082) << 1), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr1222);
                            objArr5 = (java.lang.Object[]) cls482.getMethod(str282, java.lang.Class.forName((java.lang.String) objArr1222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1192);
                            if (context3 == null) {
                            }
                        } catch (java.lang.Exception unused7) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                        char scrollDefaultDelay = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                        int identityHashCode21 = java.lang.System.identityHashCode(setsaveenabled);
                        int i210 = keyCodeFromString * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                        int i211 = ~keyCodeFromString;
                        b5 = b3;
                        int i212 = ~((~identityHashCode21) | i211 | (-27));
                        int i213 = (keyCodeFromString ^ 26) | (keyCodeFromString & 26);
                        int i214 = ~((i213 & identityHashCode21) | (i213 ^ identityHashCode21));
                        str9 = str7;
                        int i215 = ~((i211 ^ 26) | (i211 & 26));
                        int i216 = ~((i211 & identityHashCode21) | (i211 ^ identityHashCode21));
                        int i217 = -(-(((i216 & i215) | (i215 ^ i216)) * (-272)));
                        int i218 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        java.lang.String str29 = str6;
                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                        b(scrollDefaultDelay, ((((((i210 ^ (-7046)) + ((i210 & (-7046)) << 1)) + (((i212 ^ i214) | (i212 & i214)) * (-272))) - (~i217)) - 1) - (~(((~(keyCodeFromString | identityHashCode21)) | 26) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) - 1, (i218 ^ 69) + ((i218 & 69) << 1), objArr126);
                        java.lang.Class<?> cls52 = java.lang.Class.forName((java.lang.String) objArr126[0]);
                        char lastIndexOf2 = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12185);
                        int red = android.graphics.Color.red(0);
                        int identityHashCode22 = java.lang.System.identityHashCode(setsaveenabled);
                        int i219 = red * (-391);
                        int i220 = ~(red | (-19));
                        int i221 = ~((identityHashCode22 ^ 18) | (identityHashCode22 & 18));
                        int i222 = ((((i219 | (-3510)) << 1) - (i219 ^ (-3510))) - (~(((i220 & i221) | (i220 ^ i221)) * (-196)))) - 1;
                        int i223 = -(-(((red ^ 18) | (red & 18)) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
                        int i224 = ~red;
                        int i225 = ~((i224 ^ (-19)) | (i224 & (-19)));
                        int i226 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                        b(lastIndexOf2, ((((i222 | i223) << 1) - (i223 ^ i222)) - (~(((i221 ^ i225) | (i225 & i221)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) - 1, (i226 ^ 96) + ((i226 & 96) << 1), objArr127);
                        context2 = (android.content.Context) cls52.getMethod((java.lang.String) objArr127[0], new java.lang.Class[0]).invoke(null, null);
                        if (context2 != null) {
                            int i227 = getGpoResponse;
                            int i228 = (i227 & 75) + (i227 | 75);
                            getCvrMaskAnd = i228 % 128;
                            if (i228 % 2 != 0) {
                                context2.getApplicationContext();
                                throw null;
                            }
                            context2 = context2.getApplicationContext();
                            getGpoResponse = (getCvrMaskAnd + 71) % 128;
                        }
                        java.lang.Object[] objArr128 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 0, -1906651737};
                        byte[] bArr12 = $$d;
                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                        d(bArr12[61], 166, bArr12[63], objArr129);
                        java.lang.Class<?> cls53 = java.lang.Class.forName((java.lang.String) objArr129[0]);
                        byte b21 = bArr12[189];
                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                        d(b21, (short) (b21 | 261), (byte) ($$e | 16), objArr130);
                        java.lang.String str30 = (java.lang.String) objArr130[0];
                        int indexOf4 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        int identityHashCode23 = java.lang.System.identityHashCode(setsaveenabled);
                        int i229 = indexOf4 * (-244);
                        int i230 = ((i229 | 31488) << 1) - (i229 ^ 31488);
                        int i231 = ~identityHashCode23;
                        int i232 = -(-(((~((i231 & (-129)) | (i231 ^ (-129)))) | (~((indexOf4 ^ (-129)) | (indexOf4 & (-129))))) * (-245)));
                        int i233 = ~((identityHashCode23 & (-129)) | (identityHashCode23 ^ (-129)));
                        java.lang.Object[] objArr131 = new java.lang.Object[1];
                        e(null, null, (((((i230 | i232) << 1) - (i232 ^ i230)) - (~(i233 * (-245)))) - 1) + (((i233 ^ indexOf4) | (i233 & indexOf4)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr131);
                        objArr4 = (java.lang.Object[]) cls53.getMethod(str30, java.lang.Class.forName((java.lang.String) objArr131[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr128);
                        java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.alpha(0), android.view.KeyEvent.keyCodeFromString("") + 667, (char) (40024 - android.graphics.Color.argb(0, 0, 0, 0)));
                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                        c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr132);
                        cls54.getField((java.lang.String) objArr132[0]).set(null, objArr4);
                    }
                }
                java.lang.Object[] objArr133 = {context, java.lang.Integer.valueOf(intValue), 0, 132885219};
                byte[] bArr13 = $$d;
                java.lang.Object[] objArr134 = new java.lang.Object[1];
                d(bArr13[10], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, bArr13[63], objArr134);
                java.lang.Class<?> cls55 = java.lang.Class.forName((java.lang.String) objArr134[0]);
                java.lang.Object[] objArr135 = new java.lang.Object[1];
                d(bArr13[376], 620, bArr13[189], objArr135);
                java.lang.String str31 = (java.lang.String) objArr135[0];
                int i234 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int identityHashCode24 = java.lang.System.identityHashCode(setsaveenabled2);
                int i235 = (i234 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + 31878;
                setsaveenabled = setsaveenabled2;
                int i236 = ~i234;
                int i237 = ~((i236 ^ androidx.compose.runtime.ComposerKt.defaultsKey) | (i236 & androidx.compose.runtime.ComposerKt.defaultsKey));
                str4 = str3;
                int i238 = ~identityHashCode24;
                int i239 = (i238 ^ androidx.compose.runtime.ComposerKt.defaultsKey) | (i238 & androidx.compose.runtime.ComposerKt.defaultsKey);
                str5 = str22;
                int i240 = ~i239;
                int i241 = (i237 ^ i240) | (i237 & i240);
                int i242 = i234 | 126;
                int i243 = ~((i242 ^ identityHashCode24) | (i242 & identityHashCode24));
                int i244 = -(-(((i241 ^ i243) | (i241 & i243)) * (-252)));
                int i245 = ((i235 | i244) << 1) - (i244 ^ i235);
                int i246 = (i234 ^ 126) | (i234 & 126);
                int i247 = i246 * (-252);
                int i248 = (i245 ^ i247) + ((i245 & i247) << 1);
                int i249 = ~(i234 | i239);
                int i250 = ~((i246 ^ identityHashCode24) | (i246 & identityHashCode24));
                int i251 = ((i250 ^ i249) | (i250 & i249)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                java.lang.Object[] objArr136 = new java.lang.Object[1];
                e(null, null, ((i248 | i251) << 1) - (i248 ^ i251), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr136);
                objArr2 = (java.lang.Object[]) cls55.getMethod(str31, java.lang.Class.forName((java.lang.String) objArr136[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr133);
                if (context != null) {
                    int i252 = getCvrMaskAnd;
                    getGpoResponse = ((i252 & 97) + (i252 | 97)) % 128;
                    java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1581 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr137 = new java.lang.Object[1];
                    c((byte) (-bArr[116]), (short) 58, (byte) (i + 2), objArr137);
                    cls56.getField((java.lang.String) objArr137[0]).set(null, objArr2);
                    try {
                        str6 = str21;
                        long longValue7 = ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str6, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1581, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                        java.lang.Object[] objArr138 = new java.lang.Object[1];
                        c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr138);
                        cls57.getField((java.lang.String) objArr138[0]).set(null, java.lang.Long.valueOf(longValue7));
                        if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
                        }
                        java.lang.Class cls112 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 923 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                        b3 = (byte) (i + 2);
                        java.lang.Object[] objArr332 = new java.lang.Object[1];
                        c((byte) (-bArr[116]), (short) 58, b3, objArr332);
                        j = cls112.getField((java.lang.String) objArr332[0]).getLong(null);
                        if (j != -1) {
                        }
                        str7 = str2;
                        str8 = str4;
                        int intValue42 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setsaveenabled)).intValue();
                        java.lang.Object[] objArr342 = {-2140315454};
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                        if (obj2 == null) {
                        }
                        values$4956fc2a = com.payair.hce.setNavigationOnClickListener.values$4956fc2a(intValue42, ((java.lang.reflect.Constructor) obj2).newInstance(objArr342));
                        java.lang.Class cls122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 44, 923 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        java.lang.Object[] objArr352 = new java.lang.Object[1];
                        c(bArr[34], bArr[37], bArr[28], objArr352);
                        cls122.getField((java.lang.String) objArr352[0]).set(null, values$4956fc2a);
                        long longValue22 = ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str6, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls132 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.widget.ExpandableListView.getPackedPositionType(0L), 922 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        java.lang.Object[] objArr362 = new java.lang.Object[1];
                        c((byte) (-bArr[116]), (short) 58, b3, objArr362);
                        cls132.getField((java.lang.String) objArr362[0]).set(null, java.lang.Long.valueOf(longValue22));
                        getGpoResponse = (getCvrMaskAnd + 25) % 128;
                        i2 = ((int[]) values$4956fc2a[1])[0];
                        if (((int[]) values$4956fc2a[0])[0] == i2) {
                        }
                        java.lang.Class cls172 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myTid() >> 22), 668 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (40024 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                        java.lang.Object[] objArr462 = new java.lang.Object[1];
                        b4 = b2;
                        c((byte) (-bArr[11]), bArr[21], b4, objArr462);
                        j2 = cls172.getField((java.lang.String) objArr462[0]).getLong(null);
                        if (j2 != -1) {
                        }
                        char scrollDefaultDelay2 = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int keyCodeFromString2 = android.view.KeyEvent.keyCodeFromString("");
                        int identityHashCode212 = java.lang.System.identityHashCode(setsaveenabled);
                        int i2102 = keyCodeFromString2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                        int i2112 = ~keyCodeFromString2;
                        b5 = b3;
                        int i2122 = ~((~identityHashCode212) | i2112 | (-27));
                        int i2132 = (keyCodeFromString2 ^ 26) | (keyCodeFromString2 & 26);
                        int i2142 = ~((i2132 & identityHashCode212) | (i2132 ^ identityHashCode212));
                        str9 = str7;
                        int i2152 = ~((i2112 ^ 26) | (i2112 & 26));
                        int i2162 = ~((i2112 & identityHashCode212) | (i2112 ^ identityHashCode212));
                        int i2172 = -(-(((i2162 & i2152) | (i2152 ^ i2162)) * (-272)));
                        int i2182 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        java.lang.String str292 = str6;
                        java.lang.Object[] objArr1262 = new java.lang.Object[1];
                        b(scrollDefaultDelay2, ((((((i2102 ^ (-7046)) + ((i2102 & (-7046)) << 1)) + (((i2122 ^ i2142) | (i2122 & i2142)) * (-272))) - (~i2172)) - 1) - (~(((~(keyCodeFromString2 | identityHashCode212)) | 26) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) - 1, (i2182 ^ 69) + ((i2182 & 69) << 1), objArr1262);
                        java.lang.Class<?> cls522 = java.lang.Class.forName((java.lang.String) objArr1262[0]);
                        char lastIndexOf22 = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12185);
                        int red2 = android.graphics.Color.red(0);
                        int identityHashCode222 = java.lang.System.identityHashCode(setsaveenabled);
                        int i2192 = red2 * (-391);
                        int i2202 = ~(red2 | (-19));
                        int i2212 = ~((identityHashCode222 ^ 18) | (identityHashCode222 & 18));
                        int i2222 = ((((i2192 | (-3510)) << 1) - (i2192 ^ (-3510))) - (~(((i2202 & i2212) | (i2202 ^ i2212)) * (-196)))) - 1;
                        int i2232 = -(-(((red2 ^ 18) | (red2 & 18)) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
                        int i2242 = ~red2;
                        int i2252 = ~((i2242 ^ (-19)) | (i2242 & (-19)));
                        int i2262 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                        java.lang.Object[] objArr1272 = new java.lang.Object[1];
                        b(lastIndexOf22, ((((i2222 | i2232) << 1) - (i2232 ^ i2222)) - (~(((i2212 ^ i2252) | (i2252 & i2212)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) - 1, (i2262 ^ 96) + ((i2262 & 96) << 1), objArr1272);
                        context2 = (android.content.Context) cls522.getMethod((java.lang.String) objArr1272[0], new java.lang.Class[0]).invoke(null, null);
                        if (context2 != null) {
                        }
                        java.lang.Object[] objArr1282 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 0, -1906651737};
                        byte[] bArr122 = $$d;
                        java.lang.Object[] objArr1292 = new java.lang.Object[1];
                        d(bArr122[61], 166, bArr122[63], objArr1292);
                        java.lang.Class<?> cls532 = java.lang.Class.forName((java.lang.String) objArr1292[0]);
                        byte b212 = bArr122[189];
                        java.lang.Object[] objArr1302 = new java.lang.Object[1];
                        d(b212, (short) (b212 | 261), (byte) ($$e | 16), objArr1302);
                        java.lang.String str302 = (java.lang.String) objArr1302[0];
                        int indexOf42 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        int identityHashCode232 = java.lang.System.identityHashCode(setsaveenabled);
                        int i2292 = indexOf42 * (-244);
                        int i2302 = ((i2292 | 31488) << 1) - (i2292 ^ 31488);
                        int i2312 = ~identityHashCode232;
                        int i2322 = -(-(((~((i2312 & (-129)) | (i2312 ^ (-129)))) | (~((indexOf42 ^ (-129)) | (indexOf42 & (-129))))) * (-245)));
                        int i2332 = ~((identityHashCode232 & (-129)) | (identityHashCode232 ^ (-129)));
                        java.lang.Object[] objArr1312 = new java.lang.Object[1];
                        e(null, null, (((((i2302 | i2322) << 1) - (i2322 ^ i2302)) - (~(i2332 * (-245)))) - 1) + (((i2332 ^ indexOf42) | (i2332 & indexOf42)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr1312);
                        objArr4 = (java.lang.Object[]) cls532.getMethod(str302, java.lang.Class.forName((java.lang.String) objArr1312[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1282);
                        java.lang.Class cls542 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.alpha(0), android.view.KeyEvent.keyCodeFromString("") + 667, (char) (40024 - android.graphics.Color.argb(0, 0, 0, 0)));
                        java.lang.Object[] objArr1322 = new java.lang.Object[1];
                        c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr1322);
                        cls542.getField((java.lang.String) objArr1322[0]).set(null, objArr4);
                        str10 = str292;
                        long longValue62 = ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str10, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls512 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myTid() >> 22), 667 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40024));
                        c = 1;
                        java.lang.Object[] objArr1252 = new java.lang.Object[1];
                        b6 = b4;
                        c((byte) (-bArr[11]), bArr[21], b6, objArr1252);
                        c2 = 0;
                        cls512.getField((java.lang.String) objArr1252[0]).set(null, java.lang.Long.valueOf(longValue62));
                        i3 = ((int[]) objArr4[c])[c2];
                        if (((int[]) objArr4[c2])[c2] != i3) {
                        }
                        java.lang.Class cls2122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.graphics.Color.blue(0), 584 - android.view.KeyEvent.getDeadChar(0, 0), (char) (24339 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        java.lang.Object[] objArr5822 = new java.lang.Object[1];
                        c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr5822);
                        j3 = cls2122.getField((java.lang.String) objArr5822[0]).getLong(null);
                        if (j3 != -1) {
                        }
                        int i17422 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int identityHashCode1822 = java.lang.System.identityHashCode(setsaveenabled);
                        int i17522 = i17422 * 491;
                        int i17622 = ~i17422;
                        int i17722 = (i17622 ^ (-2)) | (i17622 & (-2));
                        int i17822 = ~identityHashCode1822;
                        int i17922 = (i17522 ^ (-489)) + ((i17522 & (-489)) << 1) + (((i17722 & i17822) | (i17722 ^ i17822)) * (-490));
                        int i18022 = ~((i17422 ^ (-2)) | (i17422 & (-2)));
                        int i18122 = ~((identityHashCode1822 ^ (-2)) | (identityHashCode1822 & (-2)));
                        int i18222 = ((i18022 ^ i18122) | (i18022 & i18122)) * 490;
                        int i18322 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        java.lang.Object[] objArr11722 = new java.lang.Object[1];
                        b((char) ((i17922 & i18222) + (i18222 | i17922) + (i17622 * 490)), ((i18322 | 25) << 1) - (i18322 ^ 25), 69 - android.view.View.getDefaultSize(0, 0), objArr11722);
                        java.lang.Class<?> cls4722 = java.lang.Class.forName((java.lang.String) objArr11722[0]);
                        int i18422 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int i18522 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                        int indexOf32 = android.text.TextUtils.indexOf("", "", 0, 0);
                        int identityHashCode1922 = java.lang.System.identityHashCode(setsaveenabled);
                        int i18622 = indexOf32 * (-209);
                        int i18722 = ((i18622 | (-19855)) << 1) - (i18622 ^ (-19855));
                        int i18822 = ~indexOf32;
                        int i18922 = -(-((~((i18822 ^ (-96)) | (i18822 & (-96)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                        str11 = str9;
                        int i19022 = ~identityHashCode1922;
                        num = 0;
                        int i19122 = ~((i19022 ^ (-96)) | (i19022 & (-96)));
                        java.lang.String str2722 = str10;
                        int i19222 = ~((i18822 ^ identityHashCode1922) | (i18822 & identityHashCode1922));
                        int i19322 = (((i18722 ^ i18922) + ((i18922 & i18722) << 1)) - (~(((i19122 & i19222) | (i19122 ^ i19222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) - 1;
                        int i19422 = ~((i19022 & i18822) | (i18822 ^ i19022) | 95);
                        int i19522 = (indexOf32 & (-96)) | (indexOf32 ^ (-96));
                        int i19622 = ~((i19522 ^ identityHashCode1922) | (identityHashCode1922 & i19522));
                        int i19722 = -(-(((i19422 ^ i19622) | (i19622 & i19422)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                        java.lang.Object[] objArr11822 = new java.lang.Object[1];
                        b((char) ((i18422 ^ 12183) + ((i18422 & 12183) << 1)), (i18522 ^ 18) + ((i18522 & 18) << 1), (i19322 & i19722) + (i19322 | i19722), objArr11822);
                        context3 = (android.content.Context) cls4722.getMethod((java.lang.String) objArr11822[0], new java.lang.Class[0]).invoke(null, null);
                        if (context3 != null) {
                        }
                        java.lang.Object[] objArr11922 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), -1958191123};
                        byte[] bArr1122 = $$d;
                        java.lang.Object[] objArr12022 = new java.lang.Object[1];
                        d(bArr1122[10], 106, bArr1122[63], objArr12022);
                        java.lang.Class<?> cls4822 = java.lang.Class.forName((java.lang.String) objArr12022[0]);
                        java.lang.Object[] objArr12122 = new java.lang.Object[1];
                        d(bArr1122[376], 620, bArr1122[189], objArr12122);
                        java.lang.String str2822 = (java.lang.String) objArr12122[0];
                        int indexOf222 = android.text.TextUtils.indexOf("", "");
                        int identityHashCode2022 = java.lang.System.identityHashCode(setsaveenabled);
                        int i19922 = (indexOf222 * (-716)) + 182245;
                        int i20022 = ~indexOf222;
                        int i20122 = ((i20022 ^ 127) | (i20022 & 127)) * (-1434);
                        int i20222 = ~identityHashCode2022;
                        str12 = str8;
                        str13 = str20;
                        int i20322 = (~(indexOf222 | 127)) | (~((i20222 & 127) | (i20222 ^ 127)));
                        int i20422 = i20022 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                        int i20522 = ~((i20422 ^ identityHashCode2022) | (i20422 & identityHashCode2022));
                        int i20622 = (i19922 & i20122) + (i19922 | i20122) + (((i20322 & i20522) | (i20322 ^ i20522)) * 717);
                        int i20722 = (i20022 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i20022 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                        int i20822 = -(-(((~((indexOf222 ^ 127) | (indexOf222 & 127))) | (~((i20722 & i20222) | (i20722 ^ i20222))) | (~(identityHashCode2022 | 127))) * 717));
                        java.lang.Object[] objArr12222 = new java.lang.Object[1];
                        e(null, null, (i20622 ^ i20822) + ((i20622 & i20822) << 1), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr12222);
                        objArr5 = (java.lang.Object[]) cls4822.getMethod(str2822, java.lang.Class.forName((java.lang.String) objArr12222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr11922);
                        if (context3 == null) {
                        }
                    } catch (java.lang.Exception unused8) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                } else {
                    str6 = str21;
                    objArr3 = objArr2;
                    objArr2 = objArr3;
                    if (((int[]) objArr2[0])[0] != ((int[]) objArr2[1])[0]) {
                    }
                    java.lang.Class cls1122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 923 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                    b3 = (byte) (i + 2);
                    java.lang.Object[] objArr3322 = new java.lang.Object[1];
                    c((byte) (-bArr[116]), (short) 58, b3, objArr3322);
                    j = cls1122.getField((java.lang.String) objArr3322[0]).getLong(null);
                    if (j != -1) {
                    }
                    str7 = str2;
                    str8 = str4;
                    int intValue422 = ((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setsaveenabled)).intValue();
                    java.lang.Object[] objArr3422 = {-2140315454};
                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                    if (obj2 == null) {
                    }
                    values$4956fc2a = com.payair.hce.setNavigationOnClickListener.values$4956fc2a(intValue422, ((java.lang.reflect.Constructor) obj2).newInstance(objArr3422));
                    java.lang.Class cls1222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 44, 923 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    java.lang.Object[] objArr3522 = new java.lang.Object[1];
                    c(bArr[34], bArr[37], bArr[28], objArr3522);
                    cls1222.getField((java.lang.String) objArr3522[0]).set(null, values$4956fc2a);
                    long longValue222 = ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str6, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls1322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.widget.ExpandableListView.getPackedPositionType(0L), 922 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                    java.lang.Object[] objArr3622 = new java.lang.Object[1];
                    c((byte) (-bArr[116]), (short) 58, b3, objArr3622);
                    cls1322.getField((java.lang.String) objArr3622[0]).set(null, java.lang.Long.valueOf(longValue222));
                    getGpoResponse = (getCvrMaskAnd + 25) % 128;
                    i2 = ((int[]) values$4956fc2a[1])[0];
                    if (((int[]) values$4956fc2a[0])[0] == i2) {
                    }
                    java.lang.Class cls1722 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myTid() >> 22), 668 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (40024 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                    java.lang.Object[] objArr4622 = new java.lang.Object[1];
                    b4 = b2;
                    c((byte) (-bArr[11]), bArr[21], b4, objArr4622);
                    j2 = cls1722.getField((java.lang.String) objArr4622[0]).getLong(null);
                    if (j2 != -1) {
                    }
                    char scrollDefaultDelay22 = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int keyCodeFromString22 = android.view.KeyEvent.keyCodeFromString("");
                    int identityHashCode2122 = java.lang.System.identityHashCode(setsaveenabled);
                    int i21022 = keyCodeFromString22 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE;
                    int i21122 = ~keyCodeFromString22;
                    b5 = b3;
                    int i21222 = ~((~identityHashCode2122) | i21122 | (-27));
                    int i21322 = (keyCodeFromString22 ^ 26) | (keyCodeFromString22 & 26);
                    int i21422 = ~((i21322 & identityHashCode2122) | (i21322 ^ identityHashCode2122));
                    str9 = str7;
                    int i21522 = ~((i21122 ^ 26) | (i21122 & 26));
                    int i21622 = ~((i21122 & identityHashCode2122) | (i21122 ^ identityHashCode2122));
                    int i21722 = -(-(((i21622 & i21522) | (i21522 ^ i21622)) * (-272)));
                    int i21822 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    java.lang.String str2922 = str6;
                    java.lang.Object[] objArr12622 = new java.lang.Object[1];
                    b(scrollDefaultDelay22, ((((((i21022 ^ (-7046)) + ((i21022 & (-7046)) << 1)) + (((i21222 ^ i21422) | (i21222 & i21422)) * (-272))) - (~i21722)) - 1) - (~(((~(keyCodeFromString22 | identityHashCode2122)) | 26) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) - 1, (i21822 ^ 69) + ((i21822 & 69) << 1), objArr12622);
                    java.lang.Class<?> cls5222 = java.lang.Class.forName((java.lang.String) objArr12622[0]);
                    char lastIndexOf222 = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12185);
                    int red22 = android.graphics.Color.red(0);
                    int identityHashCode2222 = java.lang.System.identityHashCode(setsaveenabled);
                    int i21922 = red22 * (-391);
                    int i22022 = ~(red22 | (-19));
                    int i22122 = ~((identityHashCode2222 ^ 18) | (identityHashCode2222 & 18));
                    int i22222 = ((((i21922 | (-3510)) << 1) - (i21922 ^ (-3510))) - (~(((i22022 & i22122) | (i22022 ^ i22122)) * (-196)))) - 1;
                    int i22322 = -(-(((red22 ^ 18) | (red22 & 18)) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY));
                    int i22422 = ~red22;
                    int i22522 = ~((i22422 ^ (-19)) | (i22422 & (-19)));
                    int i22622 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                    java.lang.Object[] objArr12722 = new java.lang.Object[1];
                    b(lastIndexOf222, ((((i22222 | i22322) << 1) - (i22322 ^ i22222)) - (~(((i22122 ^ i22522) | (i22522 & i22122)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) - 1, (i22622 ^ 96) + ((i22622 & 96) << 1), objArr12722);
                    context2 = (android.content.Context) cls5222.getMethod((java.lang.String) objArr12722[0], new java.lang.Class[0]).invoke(null, null);
                    if (context2 != null) {
                    }
                    java.lang.Object[] objArr12822 = {context2, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), 0, -1906651737};
                    byte[] bArr1222 = $$d;
                    java.lang.Object[] objArr12922 = new java.lang.Object[1];
                    d(bArr1222[61], 166, bArr1222[63], objArr12922);
                    java.lang.Class<?> cls5322 = java.lang.Class.forName((java.lang.String) objArr12922[0]);
                    byte b2122 = bArr1222[189];
                    java.lang.Object[] objArr13022 = new java.lang.Object[1];
                    d(b2122, (short) (b2122 | 261), (byte) ($$e | 16), objArr13022);
                    java.lang.String str3022 = (java.lang.String) objArr13022[0];
                    int indexOf422 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    int identityHashCode2322 = java.lang.System.identityHashCode(setsaveenabled);
                    int i22922 = indexOf422 * (-244);
                    int i23022 = ((i22922 | 31488) << 1) - (i22922 ^ 31488);
                    int i23122 = ~identityHashCode2322;
                    int i23222 = -(-(((~((i23122 & (-129)) | (i23122 ^ (-129)))) | (~((indexOf422 ^ (-129)) | (indexOf422 & (-129))))) * (-245)));
                    int i23322 = ~((identityHashCode2322 & (-129)) | (identityHashCode2322 ^ (-129)));
                    java.lang.Object[] objArr13122 = new java.lang.Object[1];
                    e(null, null, (((((i23022 | i23222) << 1) - (i23222 ^ i23022)) - (~(i23322 * (-245)))) - 1) + (((i23322 ^ indexOf422) | (i23322 & indexOf422)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr13122);
                    objArr4 = (java.lang.Object[]) cls5322.getMethod(str3022, java.lang.Class.forName((java.lang.String) objArr13122[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr12822);
                    java.lang.Class cls5422 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.alpha(0), android.view.KeyEvent.keyCodeFromString("") + 667, (char) (40024 - android.graphics.Color.argb(0, 0, 0, 0)));
                    java.lang.Object[] objArr13222 = new java.lang.Object[1];
                    c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr13222);
                    cls5422.getField((java.lang.String) objArr13222[0]).set(null, objArr4);
                    str10 = str2922;
                    long longValue622 = ((java.lang.Long) java.lang.Class.forName(str20).getDeclaredMethod(str10, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls5122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myTid() >> 22), 667 - android.text.TextUtils.indexOf("", "", 0), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40024));
                    c = 1;
                    java.lang.Object[] objArr12522 = new java.lang.Object[1];
                    b6 = b4;
                    c((byte) (-bArr[11]), bArr[21], b6, objArr12522);
                    c2 = 0;
                    cls5122.getField((java.lang.String) objArr12522[0]).set(null, java.lang.Long.valueOf(longValue622));
                    i3 = ((int[]) objArr4[c])[c2];
                    if (((int[]) objArr4[c2])[c2] != i3) {
                    }
                    java.lang.Class cls21222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.graphics.Color.blue(0), 584 - android.view.KeyEvent.getDeadChar(0, 0), (char) (24339 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr58222 = new java.lang.Object[1];
                    c((byte) (bArr[34] - 1), (short) 75, bArr[28], objArr58222);
                    j3 = cls21222.getField((java.lang.String) objArr58222[0]).getLong(null);
                    if (j3 != -1) {
                    }
                    int i174222 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int identityHashCode18222 = java.lang.System.identityHashCode(setsaveenabled);
                    int i175222 = i174222 * 491;
                    int i176222 = ~i174222;
                    int i177222 = (i176222 ^ (-2)) | (i176222 & (-2));
                    int i178222 = ~identityHashCode18222;
                    int i179222 = (i175222 ^ (-489)) + ((i175222 & (-489)) << 1) + (((i177222 & i178222) | (i177222 ^ i178222)) * (-490));
                    int i180222 = ~((i174222 ^ (-2)) | (i174222 & (-2)));
                    int i181222 = ~((identityHashCode18222 ^ (-2)) | (identityHashCode18222 & (-2)));
                    int i182222 = ((i180222 ^ i181222) | (i180222 & i181222)) * 490;
                    int i183222 = (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    java.lang.Object[] objArr117222 = new java.lang.Object[1];
                    b((char) ((i179222 & i182222) + (i182222 | i179222) + (i176222 * 490)), ((i183222 | 25) << 1) - (i183222 ^ 25), 69 - android.view.View.getDefaultSize(0, 0), objArr117222);
                    java.lang.Class<?> cls47222 = java.lang.Class.forName((java.lang.String) objArr117222[0]);
                    int i184222 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    int i185222 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
                    int indexOf322 = android.text.TextUtils.indexOf("", "", 0, 0);
                    int identityHashCode19222 = java.lang.System.identityHashCode(setsaveenabled);
                    int i186222 = indexOf322 * (-209);
                    int i187222 = ((i186222 | (-19855)) << 1) - (i186222 ^ (-19855));
                    int i188222 = ~indexOf322;
                    int i189222 = -(-((~((i188222 ^ (-96)) | (i188222 & (-96)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                    str11 = str9;
                    int i190222 = ~identityHashCode19222;
                    num = 0;
                    int i191222 = ~((i190222 ^ (-96)) | (i190222 & (-96)));
                    java.lang.String str27222 = str10;
                    int i192222 = ~((i188222 ^ identityHashCode19222) | (i188222 & identityHashCode19222));
                    int i193222 = (((i187222 ^ i189222) + ((i189222 & i187222) << 1)) - (~(((i191222 & i192222) | (i191222 ^ i192222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) - 1;
                    int i194222 = ~((i190222 & i188222) | (i188222 ^ i190222) | 95);
                    int i195222 = (indexOf322 & (-96)) | (indexOf322 ^ (-96));
                    int i196222 = ~((i195222 ^ identityHashCode19222) | (identityHashCode19222 & i195222));
                    int i197222 = -(-(((i194222 ^ i196222) | (i196222 & i194222)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                    java.lang.Object[] objArr118222 = new java.lang.Object[1];
                    b((char) ((i184222 ^ 12183) + ((i184222 & 12183) << 1)), (i185222 ^ 18) + ((i185222 & 18) << 1), (i193222 & i197222) + (i193222 | i197222), objArr118222);
                    context3 = (android.content.Context) cls47222.getMethod((java.lang.String) objArr118222[0], new java.lang.Class[0]).invoke(null, null);
                    if (context3 != null) {
                    }
                    java.lang.Object[] objArr119222 = {context3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str5).getMethod(str8, java.lang.Object.class).invoke(null, setsaveenabled)).intValue()), -1958191123};
                    byte[] bArr11222 = $$d;
                    java.lang.Object[] objArr120222 = new java.lang.Object[1];
                    d(bArr11222[10], 106, bArr11222[63], objArr120222);
                    java.lang.Class<?> cls48222 = java.lang.Class.forName((java.lang.String) objArr120222[0]);
                    java.lang.Object[] objArr121222 = new java.lang.Object[1];
                    d(bArr11222[376], 620, bArr11222[189], objArr121222);
                    java.lang.String str28222 = (java.lang.String) objArr121222[0];
                    int indexOf2222 = android.text.TextUtils.indexOf("", "");
                    int identityHashCode20222 = java.lang.System.identityHashCode(setsaveenabled);
                    int i199222 = (indexOf2222 * (-716)) + 182245;
                    int i200222 = ~indexOf2222;
                    int i201222 = ((i200222 ^ 127) | (i200222 & 127)) * (-1434);
                    int i202222 = ~identityHashCode20222;
                    str12 = str8;
                    str13 = str20;
                    int i203222 = (~(indexOf2222 | 127)) | (~((i202222 & 127) | (i202222 ^ 127)));
                    int i204222 = i200222 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    int i205222 = ~((i204222 ^ identityHashCode20222) | (i204222 & identityHashCode20222));
                    int i206222 = (i199222 & i201222) + (i199222 | i201222) + (((i203222 & i205222) | (i203222 ^ i205222)) * 717);
                    int i207222 = (i200222 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i200222 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                    int i208222 = -(-(((~((indexOf2222 ^ 127) | (indexOf2222 & 127))) | (~((i207222 & i202222) | (i207222 ^ i202222))) | (~(identityHashCode20222 | 127))) * 717));
                    java.lang.Object[] objArr122222 = new java.lang.Object[1];
                    e(null, null, (i206222 ^ i208222) + ((i206222 & i208222) << 1), "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr122222);
                    objArr5 = (java.lang.Object[]) cls48222.getMethod(str28222, java.lang.Class.forName((java.lang.String) objArr122222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr119222);
                    if (context3 == null) {
                    }
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
            java.lang.Object[] objArr139 = new java.lang.Object[1];
            b((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 26 - android.text.TextUtils.getOffsetAfter("", 0), 69 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr139);
            java.lang.Class<?> cls58 = java.lang.Class.forName((java.lang.String) objArr139[0]);
            int i253 = -android.view.View.resolveSize(0, 0);
            int identityHashCode25 = java.lang.System.identityHashCode(setsaveenabled2);
            int i254 = i253 * 46;
            int i255 = (560464 & i254) + (i254 | 560464);
            int i256 = ~identityHashCode25;
            int i257 = ((~(i256 | (-12185))) | i253) * (-90);
            str2 = "valueOf";
            int i258 = ~((identityHashCode25 ^ (-12185)) | (identityHashCode25 & (-12185)));
            int i259 = ~((i253 & 12184) | (i253 ^ 12184));
            int i260 = (i255 ^ i257) + ((i255 & i257) << 1) + (((i259 ^ i258) | (i259 & i258)) * (-45));
            int i261 = ~((~i253) | identityHashCode25);
            int i262 = (i261 ^ (-12185)) | (i261 & (-12185));
            int i263 = ~((i253 ^ i256) | (i253 & i256));
            int i264 = ((i262 ^ i263) | (i263 & i262)) * 45;
            char c7 = (char) (((i260 | i264) << 1) - (i264 ^ i260));
            int i265 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int identityHashCode26 = java.lang.System.identityHashCode(setsaveenabled2);
            int i266 = ~i265;
            int i267 = ~((i266 ^ (-18)) | (i266 & (-18)));
            int i268 = ~identityHashCode26;
            int i269 = ~(i268 | i265 | 17);
            int i270 = -(-(((i267 & i269) | (i267 ^ i269)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
            int i271 = ~((i268 ^ 17) | (i268 & 17));
            int i272 = (((((i265 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) - 3723) - (~i270)) - 1) - (~(-(-(((i271 ^ i265) | (i271 & i265)) * (-440)))))) - 1;
            int i273 = (i265 ^ 17) | (i265 & 17);
            int i274 = ((i273 ^ identityHashCode26) | (i273 & identityHashCode26)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
            int i275 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
            java.lang.Object[] objArr140 = new java.lang.Object[1];
            b(c7, (i272 & i274) + (i274 | i272), ((i275 | 96) << 1) - (i275 ^ 96), objArr140);
            context = (android.content.Context) cls58.getMethod((java.lang.String) objArr140[0], new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
                context = context.getApplicationContext();
                int i276 = getCvrMaskAnd;
                getGpoResponse = ((i276 & 25) + (i276 | 25)) % 128;
            }
            str3 = str;
            intValue = ((java.lang.Integer) java.lang.Class.forName(str22).getMethod(str3, java.lang.Object.class).invoke(null, setsaveenabled2)).intValue();
            int i277 = (getGpoResponse + 15) % 128;
            getCvrMaskAnd = i277;
            getGpoResponse = (i277 + 51) % 128;
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setSaveEnabled setsaveenabled = (com.payair.hce.setSaveEnabled) objArr[0];
        com.payair.hce.sendRequest sendrequest = (com.payair.hce.sendRequest) objArr[1];
        java.lang.Exception exc = (java.lang.Exception) objArr[2];
        int i = getCvrMaskAnd;
        int i2 = i & 71;
        int i3 = -(-(i | 71));
        int i4 = (i2 & i3) + (i3 | i2);
        getGpoResponse = i4 % 128;
        int i5 = i4 % 2;
        setsaveenabled.values.writeReplace("onContactlessPaymentIncident", new java.lang.Object[0]);
        ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onContactlessPaymentIncident(sendrequest.AlternateContactlessPaymentDataJson().getBytes(), exc);
        int i6 = getGpoResponse;
        int i7 = i6 & 49;
        int i8 = i7 + ((i6 ^ 49) | i7);
        getCvrMaskAnd = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.ContactlessAbortResaon contactlessAbortResaon;
        com.payair.hce.setSaveEnabled setsaveenabled = (com.payair.hce.setSaveEnabled) objArr[0];
        com.payair.hce.sendRequest sendrequest = (com.payair.hce.sendRequest) objArr[1];
        com.payair.hce.replenishToken replenishtoken = (com.payair.hce.replenishToken) objArr[2];
        java.lang.Exception exc = (java.lang.Exception) objArr[3];
        com.payair.hce.setStatusCodeFromServer setstatuscodefromserver = setsaveenabled.values;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(replenishtoken.toString());
        sb.append(exc.toString());
        setstatuscodefromserver.writeReplace("onContactlessPaymentAborted() %s", sb.toString());
        setsaveenabled.DigitizedCardProfile.setAction(com.payair.model.PaymentIntentKeys.ACTION_CONTACTLESS_ABORTED);
        if (!replenishtoken.toString().equals(com.payair.hce.ContactlessAbortResaon.CARD_ERROR.toString())) {
            if (!replenishtoken.toString().equals(com.payair.hce.ContactlessAbortResaon.TERMINAL_ERROR.toString())) {
                if (replenishtoken.toString().equals(com.payair.hce.ContactlessAbortResaon.WALLET_CANCEL_REQUEST.toString())) {
                    int i = getGpoResponse + 52;
                    int i2 = (~i) + (i << 1);
                    getCvrMaskAnd = i2 % 128;
                    if (i2 % 2 == 0) {
                        contactlessAbortResaon = com.payair.hce.ContactlessAbortResaon.WALLET_CANCEL_REQUEST;
                    } else {
                        com.payair.hce.ContactlessAbortResaon contactlessAbortResaon2 = com.payair.hce.ContactlessAbortResaon.WALLET_CANCEL_REQUEST;
                        throw new java.lang.ArithmeticException();
                    }
                } else {
                    contactlessAbortResaon = null;
                }
            } else {
                int i3 = getGpoResponse;
                int i4 = i3 & 119;
                int i5 = (i3 ^ 119) | i4;
                getCvrMaskAnd = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
                contactlessAbortResaon = com.payair.hce.ContactlessAbortResaon.TERMINAL_ERROR;
                getGpoResponse = (getCvrMaskAnd + 11) % 128;
            }
        } else {
            int i6 = getGpoResponse;
            int i7 = i6 & 29;
            int i8 = i7 + ((i6 ^ 29) | i7);
            getCvrMaskAnd = i8 % 128;
            if (i8 % 2 != 0) {
                com.payair.hce.ContactlessAbortResaon contactlessAbortResaon3 = com.payair.hce.ContactlessAbortResaon.CARD_ERROR;
                throw new java.lang.ArithmeticException();
            }
            contactlessAbortResaon = com.payair.hce.ContactlessAbortResaon.CARD_ERROR;
        }
        ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).onContactlessPaymentAborted(sendrequest.AlternateContactlessPaymentDataJson().getBytes(), contactlessAbortResaon, exc);
        setsaveenabled.DigitizedCardProfile.putExtra(com.payair.model.PaymentIntentKeys.PARAM_CURRENT, sendrequest.AlternateContactlessPaymentDataJson());
        setsaveenabled.DigitizedCardProfile.putExtra(com.payair.model.PaymentIntentKeys.CONTACTLESS_ABORT_REASON, contactlessAbortResaon);
        setsaveenabled.DigitizedCardProfile.putExtra(com.payair.model.PaymentIntentKeys.CONTACTLESS_ABORT_EXCEPTION, exc);
        com.payair.hce.setTranslationX.valueOf(new java.lang.Object[]{setsaveenabled.valueOf, setsaveenabled.DigitizedCardProfile}, 101450197, -101450197, (int) java.lang.System.currentTimeMillis());
        int i9 = getGpoResponse + 87;
        getCvrMaskAnd = i9 % 128;
        if (i9 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static void values() {
        getAid = new char[]{24270, 10702, 45269, 15344, 33532, 3469, 38033, 8168, 59064, 29019, 63511, 17241, 51810, 21791, 56329, 42795, 11826, 47379, 461, 35037, 5088, 39679, 11707, 23229, 50081, 18563, 61841, 32496, 59360, 27877, 38339, 568, 35620, 12303, 47363, 9840, 44905, 24261, 10689, 45255, 15331, 33469, 3464, 38036, 8104, 59056, 28934, 63594, 17267, 51816, 21784, 56344, 42787, 24262, 10692, 45268, 15340, 33511, 3469, 38017, 8127, 59039, 29001, 63562, 17250, 51800, 21763, 56345, 42795, 24270, 10702, 45269, 15344, 33532, 3469, 38033, 8168, 59062, 29016, 63561, 17188, 51802, 21775, 56329, 42791, 11817, 47417, 469, 35019, 5079, 39676, 26007, 60563, 30630, 65212, 29012, 1613, 40795, 5224, 44398, 8722, 47897, 12319, 51519, 24256, 55245, 27899, 58848, 31381, 62353, 35007, 424, 38566};
        getPaymentFci = 1900095673459550624L;
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getCvrMaskAnd = 0;
        getGpoResponse = 1;
        values();
        IccPrivateKeyCrtComponentsJson = new char[]{11038, 11245, 11027, 11233, 11244, 11030, 11053, 11024, 11235, 11026, 11056, 11239};
        SdkCoreAlternateContactlessPaymentDataImpl = -143185025;
        getProfileVersion = true;
        RecordsJson = true;
        int i = getGpoResponse + 77;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void DigitizedCardProfile() {
        values(new java.lang.Object[]{this}, 201485113, -201485113, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void writeReplace(com.payair.hce.sendRequest sendrequest, com.payair.hce.replenishToken replenishtoken, java.lang.Exception exc) {
        values(new java.lang.Object[]{this, sendrequest, replenishtoken, exc}, 2006079907, -2006079903, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void AlternateContactlessPaymentDataJson(com.payair.hce.sendRequest sendrequest, java.lang.Exception exc) {
        values(new java.lang.Object[]{this, sendrequest, exc}, 1170818467, -1170818465, java.lang.System.identityHashCode(this));
    }

    private void AlternateContactlessPaymentDataJson() {
        values(new java.lang.Object[]{this}, 398167854, -398167848, java.lang.System.identityHashCode(this));
    }

    static void init$2() {
        $$g = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -112, 93};
        $$h = 101;
    }

    private void values(boolean z, com.payair.hce.sendRequest sendrequest, boolean z2, java.lang.Long l, java.util.Currency currency, com.payair.hce.setSelectedCard setselectedcard) {
        values(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z), sendrequest, java.lang.Boolean.valueOf(z2), l, currency, setselectedcard}, 1907310274, -1907310271, java.lang.System.identityHashCode(this));
    }

    static void init$1() {
        byte[] bArr = new byte[779];
        java.lang.System.arraycopy("XÅ),õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò%èü.Í\u0002\u0006\u0003\rî\f\u0007\u0003ö\u0001ô(îó\u000fò3Ê9Ò\u0001\u0005\u0004\u0007\u0003î\fû\u0002Ü\u0003ÿö\fð\u0016\u0002\"ãð\u000f\u0015ß\u0004\nþþ\bõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò-àüûõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8È\u0003ò\"ß\u0003\u0004\fø\u000büü\b\u0014ã\u0012ôü\u0013ÿð\fû\u0002&æÖù\u0010ô\u0005\u000eî\u0010#Õ\u0002û\u0014ÿð\t\bó\u0001$ðé\r\tøû1äî\u0014\u0018Ø\u0005\u0002õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8È\u0003ò2Õ\f\u0000#ãÿü\u0004\"ÜøOñ\u0006\nö\u0010\u0014îö\u0005\fÿÿõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8È\u0003ò(íùü#Þ\u0001\u0000\fôOñõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Ìò\u000e\u0005î\u0010#Õ\u0002\tþ\u0003ó\u0004\u0012î\fû\u0002,Õ\u0002û\u0010î\u0005\u0016öø\u0011\u0017êõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò&â*âüö\u0006þ2ßð\fû\u0002#ä÷\u0000\u0010ø\nôõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Æ\u0006\u0000øû\f\u0004îõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò#îÿÿ÷\u0000\u0003\u0012î\fû\u0002\u001dîó\u0004\u0002\u0002ü\u000f\"äî\u0014õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8À\u0000\fø Þ0Ò\u000e\u0005î\u0010\"äî\u0014\u0000\u0002ï\u000fõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Ìü\u0004\u0003ù)ãö\u0001\u0004ü\b\u0018ìô\u0006\u0005÷\u0001\u000bû\u0002KäÖù\u0010ô\u0005\u000eî\u0010#Õ\u0002û\u0014ÿð\t\bó\u0001$ðé\r\tøû1äî\u0014\u0018Ø\u0005\u0002\u0016öø\u0011óõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò)äü\nóõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8È\u0003ò!Ü\n\f#Õ\u0002ù\u0012ôÿ\u0010ôõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8ßðé\u0019ùø\u001eã\u000fô/äî\u0014\u001eäó\u0011\u0017Ýþ\u0005Iðõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8È\u0003ò2ãÿü\u0004\"ÜøOôõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Ìò\u000e\u0005î\u0010\"àð\u000e\u0007ÿ#Õ\u0002û\u0010î\u0005õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Ìõ\u0003þ\bþ\b\u0013à\u0014î\u0010ù\tøûõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò4ß\u0001ÿó\u0001\u000b\búþ\u0004öü&ã\u0012ì\u0012ô\u0000\u0013ö+Þ\u0000øþ\u000eõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8È\u0003ò#î\u0003õþ\u000fòP¯\u0016öø\u0011óõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò%ß\u000eó\u0001\u000f\u0002".getBytes("ISO-8859-1"), 0, bArr, 0, 779);
        $$d = bArr;
        $$e = 37;
    }

    private static boolean valueOf(com.payair.hce.unRegisterDevice unregisterdevice, com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments) {
        return ((java.lang.Boolean) values(new java.lang.Object[]{unregisterdevice, setnewdefaultcardforcontactlesspayments}, -192403123, 192403124, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static void init$0() {
        $$a = new byte[]{125, 17, -56, 0, -19, 13, com.google.common.base.Ascii.VT, -14, -20, com.google.common.base.Ascii.EM, -3, -7, 13, -13, -17, com.google.common.base.Ascii.NAK, 13, -2, -9, 4, 4, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, 16, 19, 9, -38, 46, 5, -11, -34, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -22, 38, 5, -2};
        $$b = 49;
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void valueOf(com.payair.hce.sendRequest sendrequest, com.payair.hce.setSelectedCard setselectedcard) {
        values(new java.lang.Object[]{this, sendrequest, setselectedcard}, -1216152034, 1216152039, java.lang.System.identityHashCode(this));
    }
}
