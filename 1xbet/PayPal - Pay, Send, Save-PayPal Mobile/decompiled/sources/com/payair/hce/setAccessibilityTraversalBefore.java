package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAccessibilityTraversalBefore {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static boolean getProfileVersion;
    private static char[] valueOf;
    private static char[] values;
    private final com.payair.hce.ResponseCompleteTokenizeDto DigitizedCardProfile;
    private final com.payair.hce.checkPermission writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = b * 34;
        byte[] bArr = $$a;
        int i3 = (s2 * 653) + 65;
        int i4 = 37 - (s * 34);
        char[] cArr = new char[35 - i2];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            int i7 = i4;
            int i8 = (i5 + (-i4)) - 2;
            i = i6;
            int i9 = i7;
            i3 = i8;
            i4 = i9;
            int i10 = i4 + 1;
            cArr[i] = (char) i3;
            i6 = i + 1;
            if (i == 34 - i2) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i11 = i3;
            i7 = i10;
            i4 = bArr[i10];
            i5 = i11;
            int i82 = (i5 + (-i4)) - 2;
            i = i6;
            int i92 = i7;
            i3 = i82;
            i4 = i92;
            int i102 = i4 + 1;
            cArr[i] = (char) i3;
            i6 = i + 1;
            if (i == 34 - i2) {
            }
        } else {
            i = 0;
            int i1022 = i4 + 1;
            cArr[i] = (char) i3;
            i6 = i + 1;
            if (i == 34 - i2) {
            }
        }
    }

    private static void d(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3 = 3 - (s * 2);
        byte[] bArr = $$d;
        int i4 = 118 - (i * 19);
        int i5 = i2 * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = -1;
        if (bArr == null) {
            i4 += i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i3;
            int i8 = i4;
            int i9 = i6 + 1;
            bArr2[i9] = (byte) i8;
            if (i9 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i7 + 1;
            i3 = i10;
            i4 = bArr[i10] + i8;
            i6 = i9;
        }
    }

    setAccessibilityTraversalBefore(com.payair.hce.ResponseCompleteTokenizeDto responseCompleteTokenizeDto) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (56772 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.text.TextUtils.getCapsMode("", 0, 0) + 16, objArr);
        this.writeReplace = com.payair.hce.checkPermission.DigitizedCardProfile(((java.lang.String) objArr[0]).intern());
        this.DigitizedCardProfile = responseCompleteTokenizeDto;
    }

    /* renamed from: com.payair.hce.setAccessibilityTraversalBefore$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {
        private static int DigitizedCardProfile = 1;
        static final /* synthetic */ int[] values;
        private static int writeReplace;

        static {
            int[] iArr = new int[com.payair.hce.getBaseContext.values().length];
            values = iArr;
            try {
                iArr[com.payair.hce.getBaseContext.valueOf.ordinal()] = 1;
                int i = writeReplace;
                DigitizedCardProfile = (((i & 87) - (~(-(-(i | 87))))) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                values[com.payair.hce.getBaseContext.writeReplace.ordinal()] = 2;
                int i2 = writeReplace;
                DigitizedCardProfile = ((i2 ^ 117) + ((i2 & 117) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                values[com.payair.hce.getBaseContext.values.ordinal()] = 3;
                int i3 = DigitizedCardProfile + 83;
                writeReplace = i3 % 128;
                int i4 = i3 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                values[com.payair.hce.getBaseContext.DigitizedCardProfile.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                values[com.payair.hce.getBaseContext.AlternateContactlessPaymentDataJson.ordinal()] = 5;
                int i5 = writeReplace;
                int i6 = i5 & 73;
                DigitizedCardProfile = (i6 + ((i5 ^ 73) | i6)) % 128;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                values[com.payair.hce.getBaseContext.getAid.ordinal()] = 6;
                int i7 = DigitizedCardProfile;
                int i8 = i7 ^ 103;
                int i9 = (((i7 & 103) | i8) << 1) - i8;
                writeReplace = i9 % 128;
                int i10 = i9 % 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                values[com.payair.hce.getBaseContext.RecordsJson.ordinal()] = 7;
                DigitizedCardProfile = (writeReplace + 75) % 128;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    final com.payair.hce.checkUriPermissions AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext getbasecontext) {
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 91) % 128;
        android.os.Process.getElapsedCpuTime();
        android.view.ViewConfiguration.getKeyRepeatDelay();
        android.view.View.getDefaultSize(0, 0);
        switch (com.payair.hce.setAccessibilityTraversalBefore.AnonymousClass5.values[getbasecontext.ordinal()]) {
            case 1:
                return new com.payair.hce.setContentDescription(this.DigitizedCardProfile);
            case 2:
                return new com.payair.hce.setAccessibilityTraversalAfter();
            case 3:
                com.payair.hce.setKeepScreenOn setkeepscreenon = new com.payair.hce.setKeepScreenOn(com.payair.hce.setFadingEdgeLength.writeReplace, this.DigitizedCardProfile);
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 37) % 128;
                return setkeepscreenon;
            case 4:
                return new com.payair.hce.setKeepScreenOn(com.payair.hce.setFadingEdgeLength.valueOf, this.DigitizedCardProfile);
            case 5:
                return new com.payair.hce.setScrollContainer(this.DigitizedCardProfile);
            case 6:
                return new com.payair.hce.setNextFocusRightId(this.DigitizedCardProfile);
            case 7:
                return new com.payair.hce.setNextFocusUpId();
            default:
                java.lang.Object[] objArr = new java.lang.Object[1];
                b(null, null, android.view.Gravity.getAbsoluteGravity(0, 0) + 127, "\u0087\u0082\u0089\u0094\u008e\u008c\u0086\u0093\u0087\u0082\u0092\u0089\u0082\u0091\u0082\u0081\u0087\u0090\u0089\u008c\u008f\u0087\u0086\u008e\u0083\u0084\u0083\u0088\u0083\u008d\u0087\u0086\u008d\u0083\u008c\u008b\u008a\u0081\u0087\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                throw new java.lang.UnsupportedOperationException(((java.lang.String) objArr[0]).intern().concat(java.lang.String.valueOf(getbasecontext)));
        }
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 67;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(valueOf[i + getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 49, android.view.View.resolveSizeAndState(0, 0, 0) + 381, (char) (android.view.View.combineMeasuredStates(0, 0) + 62388));
                        byte b = (byte) ($$e & 5);
                        byte b2 = (byte) (b - 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3965 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(valueOf[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.getTrimmedLength(""), 381 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 62388));
                    byte b3 = (byte) ($$e & 5);
                    byte b4 = (byte) (b3 - 1);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d(b3, b4, b4, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3966, (char) (40223 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 34, 212 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.os.Process.getGidForName("") + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 67) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.View.getDefaultSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
            $11 = ($10 + 81) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void b(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            int i2 = $10 + 75;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = values;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                $10 = ($11 + 87) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46, android.graphics.Color.blue(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getAid)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        long j = 0;
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 46, (android.view.ViewConfiguration.getTouchSlop() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46336))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getProfileVersion) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 44, 1629 - android.widget.ExpandableListView.getPackedPositionGroup(j), (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d(0, (short) 0, 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!IccPrivateKeyCrtComponentsJson) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $10 = ($11 + 57) % 128;
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 1677 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d(0, (short) 0, 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        valueOf = new char[]{33582, 45259, 58622, 6283, 19624, 32843, 46201, 59407, 7242, 20959, 34298, 47501, 60856, 8523, 21870, 35087, 63749, 51904, 40695, 25218, 14001, 64084, 52853, 37456, 26131, 11217, 65507, 50069, 38896, 23306, 12080, 24262, 27964, 14635, 50538, 37197, 23994, 27016, 13800, 49610, 35901, 22572, 25696, 12353, 64673, 34954, 21740, 24795, 12074, 64267, 24280, 27950, 14598, 50555, 37190, 23969, 27016, 13769, 49600, 35901, 22571, 25706, 12365, 64698, 34952, 21736, 24778, 12093, 24270, 27937, 14603, 50557, 37184, 23974, 27019, 13729, 49600, 35900, 22593, 25675, 12362, 64685, 34970, 21736, 37733, 41092, 62651, 42161, 38670, 49964, 16209, 27517, 42961, 37805, 53191, 15341, 30289, 41525, 40539, 51820, 1680, 29371, 44754, 39601, 54552, 298, 32076, 43391, 58781, 53691, 3553, 31227, 46096, 57407, 56412, 2162, 17563, 45242, 19872, 32284, 10806, 54876, 33312, 20100, 31402, 9949, 53985, 40714, 19235, 30464, 9067, 61322, 39853, 18394, 29672, 15424, 59451, 37981, 16494, 3212, 14502, 58561, 37096, 23872, 2363, 13661, 57710, 44428, 22950, 1473, 12776, 57904, 44576, 23105};
        AlternateContactlessPaymentDataJson = 7142992427771784527L;
        values = new char[]{11130, 11109, 10902, 11113, 11107, 11114, 10967, 11131, 11108, 11111, 11116, 11129, 11115, 11128, 11117, 11106, 11104, 11132, 11133, 11118, 10916, 11134, 11112, 10900, 10918};
        getAid = -143185161;
        IccPrivateKeyCrtComponentsJson = true;
        getProfileVersion = true;
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.SI, -9, -99, 67};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -112, 93, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 160;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:38|39|(1:41)(4:89|90|91|(10:93|43|44|(1:46)(6:54|55|56|57|58|(2:60|(1:62)(5:63|64|65|66|(2:68|(1:(6:71|72|(1:74)|75|76|77))(2:78|79)))))|47|48|(1:50)|51|52|53)(1:94))|42|43|44|(0)(0)|47|48|(0)|51|52|53) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02d1 A[Catch: all -> 0x0817, TRY_ENTER, TryCatch #5 {all -> 0x0817, blocks: (B:23:0x02d1, B:25:0x02e1, B:26:0x031e, B:30:0x03c6, B:32:0x0412, B:33:0x0463, B:72:0x06a8, B:74:0x06ec, B:75:0x073c, B:48:0x0779, B:50:0x07b2, B:51:0x0804, B:101:0x0490, B:103:0x04d0, B:104:0x051f, B:128:0x0230, B:130:0x026b, B:131:0x02b6, B:3:0x0010, B:7:0x0062, B:11:0x0099, B:18:0x0146, B:108:0x014f, B:110:0x0155, B:111:0x0156, B:9:0x0157, B:113:0x015d, B:120:0x0209, B:123:0x0212, B:125:0x0218, B:126:0x0219, B:116:0x0177, B:118:0x01ae, B:119:0x01fd, B:14:0x00b9, B:16:0x00ef, B:17:0x013a), top: B:2:0x0010, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x07b2 A[Catch: all -> 0x0817, TryCatch #5 {all -> 0x0817, blocks: (B:23:0x02d1, B:25:0x02e1, B:26:0x031e, B:30:0x03c6, B:32:0x0412, B:33:0x0463, B:72:0x06a8, B:74:0x06ec, B:75:0x073c, B:48:0x0779, B:50:0x07b2, B:51:0x0804, B:101:0x0490, B:103:0x04d0, B:104:0x051f, B:128:0x0230, B:130:0x026b, B:131:0x02b6, B:3:0x0010, B:7:0x0062, B:11:0x0099, B:18:0x0146, B:108:0x014f, B:110:0x0155, B:111:0x0156, B:9:0x0157, B:113:0x015d, B:120:0x0209, B:123:0x0212, B:125:0x0218, B:126:0x0219, B:116:0x0177, B:118:0x01ae, B:119:0x01fd, B:14:0x00b9, B:16:0x00ef, B:17:0x013a), top: B:2:0x0010, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05e5 A[Catch: Exception -> 0x0765, TRY_LEAVE, TryCatch #6 {Exception -> 0x0765, blocks: (B:44:0x05b0, B:54:0x05e5, B:57:0x060f, B:60:0x061f, B:63:0x0650, B:66:0x0677, B:82:0x0756, B:83:0x075c, B:86:0x075e, B:87:0x0764, B:65:0x065a, B:56:0x05ef), top: B:43:0x05b0, inners: #2, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] valueOf(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i3;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        try {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 31, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 20, objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(android.text.TextUtils.getOffsetAfter("", 0) + 50, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 18 - android.view.KeyEvent.getDeadChar(0, 0), objArr4);
                strArr = new java.lang.String[]{((java.lang.String) objArr3[0]).intern(), ((java.lang.String) objArr4[0]).intern()};
                i3 = 0;
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~((-417260269) | i)) | 393452) * 1504) + 1212577112) + ((~((-416866817) | i)) * (-1504))) - 799399936)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, android.graphics.Color.blue(0) + 2713, (char) android.text.TextUtils.getOffsetBefore("", 0));
                    byte b = $$a[14];
                    byte b2 = (byte) (b + 1);
                    byte b3 = (byte) (-b);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c(b2, b3, (byte) (b3 - 1), objArr6);
                    obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
            }
            try {
                while (i3 < 2) {
                    RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 27) % 128;
                    java.lang.String str2 = strArr[i3];
                    int indexOf = android.text.TextUtils.indexOf("", c, 0, 0);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(indexOf + 69, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 16 - android.graphics.Color.argb(0, 0, 0, 0), objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                        int i4 = ~((-973687959) | i);
                        try {
                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((17871616 | i4) * (-476)) + 1302883568 + (i4 * 952) + ((~((~i) | (-973687959))) * 476))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, 2713 - android.text.TextUtils.getTrimmedLength(""), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                byte b4 = $$a[14];
                                byte b5 = (byte) (b4 + 1);
                                byte b6 = (byte) (-b4);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                c(b5, b6, (byte) (b6 - 1), objArr9);
                                obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                            if (i == ((int[]) objArr[1])[0]) {
                                return objArr;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27, android.text.TextUtils.indexOf("", "") + 2391, (char) (29420 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                                byte b7 = (byte) (-$$a[14]);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                c(b7, (byte) (b7 - 1), b7, objArr10);
                                obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j = ~longValue;
                            long j2 = i;
                            long j3 = (503 * longValue) + 552801583374L + (((~(j | j2)) | (~(longValue | (-1103396374)))) * (-502)) + ((~((~j2) | j | (-1103396374))) * (-502)) + (((~(1103396373 | j2)) | j) * 502) + 1385480470;
                            int i5 = (int) (j3 >> 32);
                            int i6 = ~(1165085429 | i);
                            int i7 = ~((-1952983909) | i);
                            int i8 = ~i;
                            if (((i5 & ((((((-272140982) | i6) * (-220)) + 876867882) + ((i6 | (-1434045174)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 1518756992)) | (((int) j3) & ((((1073742084 | i7) * (-280)) - 714344135) + ((i7 | (~((-904756978) | i))) * 140) + (((~((-879241825) | i)) | (~((-1073742085) | i8)) | (~((-25515154) | i8))) * 140)))) == 1) {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-468320259) | i)) | (~(536608726 | i))) * 69) + 598608052 + (((~((-468397187) | i)) | 76928 | (~(536531798 | i))) * (-69)) + 411628964)};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), 2713 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    byte b8 = $$a[14];
                                    byte b9 = (byte) (b8 + 1);
                                    byte b10 = (byte) (-b8);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    c(b9, b10, (byte) (b10 - 1), objArr12);
                                    obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((649220953 | r4) * 764) - 1984213084) + (((~(649220953 | i8)) | 285322278) * (-1528)) + (((~(355708031 | i8)) | 864157478) * 764))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.normalizeMetaState(0), android.view.KeyEvent.keyCodeFromString("") + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    byte b11 = $$a[14];
                                    byte b12 = (byte) (b11 + 1);
                                    byte b13 = (byte) (-b11);
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    c(b12, b13, (byte) (b13 - 1), objArr14);
                                    obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                            }
                            if (i != ((int[]) objArr2[1])[0]) {
                                return objArr2;
                            }
                            try {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                b(null, null, 127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\u008c\u0086\u0097\u0083\u008c\u0088\u0098\u0088\u0082\u0086\u008c\u008c\u0081\u0097\u0095\u008b\u0082\u0094\u0097\u0083\u008c\u0088\u0095\u008b\u0081\u0084\u0086\u008d\u0095\u0085\u0086\u0082\u008c\u0086\u0091\u0095\u008e\u0096\u008e\u0095", objArr15);
                                file2 = new java.io.File(((java.lang.String) objArr15[0]).intern());
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file2.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file2);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    a(android.view.View.getDefaultSize(0, 0) + 84, (char) (52644 - android.graphics.Color.alpha(0)), 3 - android.view.View.resolveSize(0, 0), objArr16);
                                    if (!str.equals(((java.lang.String) objArr16[0]).intern())) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 87, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 64049), android.text.TextUtils.indexOf("", "", 0, 0) + 31, objArr17);
                                        file = new java.io.File(((java.lang.String) objArr17[0]).intern());
                                        if (!file.canRead()) {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                b(null, null, 128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0099", objArr18);
                                                boolean equals = readLine.equals(((java.lang.String) objArr18[0]).intern());
                                                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 107) % 128;
                                                if (equals) {
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    a(android.view.View.resolveSizeAndState(0, 0, 0) + 118, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 4896), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36, objArr19);
                                                    java.io.File file3 = new java.io.File(((java.lang.String) objArr19[0]).intern());
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                            b(null, null, 126 - android.os.Process.getGidForName(""), "\u0099", objArr20);
                                                            if (readLine2.equals(((java.lang.String) objArr20[0]).intern())) {
                                                                int i9 = RecordsJson + 33;
                                                                int i10 = i9 % 128;
                                                                SdkCoreAlternateContactlessPaymentDataImpl = i10;
                                                                if (i9 % 2 != 0) {
                                                                    throw new java.lang.ArithmeticException();
                                                                }
                                                                if (str != null) {
                                                                    RecordsJson = (i10 + 11) % 128;
                                                                    java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i ^ 20}, str, new int[1]};
                                                                    java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-254448286) | i8)) | (~(750480699 | i))) * 959) - 41354887) + (((~(i | (-254448286))) | (~(i8 | 750480699))) * 959))};
                                                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj7 == null) {
                                                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.KeyEvent.keyCodeFromString("") + 2713, (char) (android.os.Process.myTid() >> 22));
                                                                        byte b14 = $$a[14];
                                                                        byte b15 = (byte) (b14 + 1);
                                                                        byte b16 = (byte) (-b14);
                                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                        c(b15, b16, (byte) (b16 - 1), objArr23);
                                                                        obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                    }
                                                                    ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                                    return objArr21;
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~r4) | 2621473) * (-828)) - 137527688) + ((1002307511 | i8) * (-828))) - 981931808)};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 50, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                            byte b17 = $$a[14];
                                            byte b18 = (byte) (b17 + 1);
                                            byte b19 = (byte) (-b17);
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            c(b18, b19, (byte) (b19 - 1), objArr26);
                                            obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                        }
                                        ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr25)).intValue();
                                        return objArr24;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                } finally {
                                }
                            } else {
                                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 11) % 128;
                            }
                            str = null;
                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 87, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 64049), android.text.TextUtils.indexOf("", "", 0, 0) + 31, objArr172);
                            file = new java.io.File(((java.lang.String) objArr172[0]).intern());
                            if (!file.canRead()) {
                            }
                            java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~r4) | 2621473) * (-828)) - 137527688) + ((1002307511 | i8) * (-828))) - 981931808)};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                            }
                            ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr252)).intValue();
                            return objArr242;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    i3++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                }
                java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-989888513) | r3)) * (-783)) - 1301363698) + (((~((~i) | 15040367)) | (-989888618)) * 783))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 2713 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    byte b20 = $$a[14];
                    byte b21 = (byte) (b20 + 1);
                    byte b22 = (byte) (-b20);
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    c(b21, b22, (byte) (b22 - 1), objArr28);
                    obj8 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
                if (i == ((int[]) objArr[1])[0]) {
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }
}
