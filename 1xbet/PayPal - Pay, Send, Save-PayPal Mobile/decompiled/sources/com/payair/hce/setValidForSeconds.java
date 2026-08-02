package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'values' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
final class setValidForSeconds implements com.payair.hce.setPendingAction {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char SdkCoreBusinessLogicModuleImpl;
    private static long getAid;
    private static int getCvrMaskAnd;
    private static int getPaymentFci;
    private static long getProfileVersion;
    private static int valueOf;
    public static final com.payair.hce.setValidForSeconds values;
    private static final /* synthetic */ com.payair.hce.setValidForSeconds[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 4 - (i * 4);
        int i5 = i2 * 4;
        int i6 = 106 - b;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i4++;
            i6 += -i8;
            i3 = i9;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i4];
            i4++;
            i6 += -i8;
            i3 = i9;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    private setValidForSeconds(java.lang.String str) {
    }

    public static com.payair.hce.setValidForSeconds valueOf(java.lang.String str) {
        int i = getCvrMaskAnd + 111;
        getPaymentFci = i % 128;
        com.payair.hce.setValidForSeconds setvalidforseconds = (com.payair.hce.setValidForSeconds) java.lang.Enum.valueOf(com.payair.hce.setValidForSeconds.class, str);
        if (i % 2 == 0) {
            return setvalidforseconds;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.setValidForSeconds[] values() {
        int i = getPaymentFci + 101;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.setValidForSeconds[] setvalidforsecondsArr = (com.payair.hce.setValidForSeconds[]) writeReplace.clone();
        getPaymentFci = (getCvrMaskAnd + 71) % 128;
        return setvalidforsecondsArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        getCvrMaskAnd = 1;
        valueOf();
        writeReplace();
        int defaultSize = android.view.View.getDefaultSize(0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(71 - defaultSize, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, (char) (20485 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr);
        com.payair.hce.setValidForSeconds setvalidforseconds = new com.payair.hce.setValidForSeconds(((java.lang.String) objArr[0]).intern());
        values = setvalidforseconds;
        writeReplace = new com.payair.hce.setValidForSeconds[]{setvalidforseconds};
        AlternateContactlessPaymentDataJson = 16;
        int i = getCvrMaskAnd + 63;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void c(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $10 + 41;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i << getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 381 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (62388 - android.view.View.MeasureSpec.getSize(0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, (byte) 7, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getProfileVersion), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 35, 3967 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.indexOf("", ""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 48, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 381, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d(0, (byte) 7, 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getProfileVersion), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 35, android.view.View.resolveSizeAndState(0, 0, 0) + 3966, (char) (40223 - android.view.View.MeasureSpec.getMode(0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.TextUtils.getTrimmedLength("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.normalizeMetaState(0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        java.lang.String str = new java.lang.String(cArr);
        int i6 = $11 + 9;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, char c, int i, java.lang.Object[] objArr) {
        char c2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 1178 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                    byte length4 = (byte) $$a.length;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, length4, (byte) (length4 - 4), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 30, 3444 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (3831 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr2[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.TextUtils.getTrimmedLength("") + 1864, (char) (41775 - android.text.TextUtils.indexOf("", "", 0, 0)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d(0, (byte) 1, 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr[intValue2] * 32718), java.lang.Integer.valueOf(cArr2[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 28, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 3133, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(0, (byte) 0, 0, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr2[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr[intValue2] = getwalletdata.values;
                cArr3[getwalletdata.writeReplace] = (char) ((((cArr[intValue2] ^ charArray3[getwalletdata.writeReplace]) ^ (getAid ^ 1263759066225628708L)) ^ ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L))) ^ ((char) (SdkCoreBusinessLogicModuleImpl ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        $11 = ($10 + 87) % 128;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != 0) {
            $10 = ($11 + 43) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            $10 = ($11 + 43) % 128;
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
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1179 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                    byte length4 = (byte) $$a.length;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, length4, (byte) (length4 - 4), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 30, 3444 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (3879 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1863, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 41775));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d(0, (byte) 1, 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.Process.myTid() >> 22), 3133 - android.text.TextUtils.indexOf("", "", 0), (char) android.graphics.Color.blue(0));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(0, (byte) 0, 0, objArr8);
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ cArr3[getwalletdata.writeReplace]) ^ (DigitizedCardProfile ^ 1263759066225628708L)) ^ ((int) (valueOf ^ 1263759066225628708L))) ^ ((char) (RecordsJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr7);
        int i2 = $10 + 15;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    @Override // com.payair.hce.setPendingAction
    public final byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2) throws com.payair.hce.setVersion {
        getCvrMaskAnd = (getPaymentFci + 91) % 128;
        int ceil = ((int) java.lang.Math.ceil((bArr.length + 1.0d) / 8.0d)) << 3;
        byte[] bArr3 = new byte[ceil];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        bArr3[bArr.length] = Byte.MIN_VALUE;
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr2, 0, bArr2.length / 2);
        byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr2, bArr2.length / 2, bArr2.length);
        byte[] bArr4 = new byte[8];
        java.lang.System.arraycopy(values(bArr3, copyOfRange), ceil - 8, bArr4, 0, 8);
        byte[] writeReplace2 = writeReplace(writeReplace(bArr4, copyOfRange2, false), copyOfRange, true);
        int i = getCvrMaskAnd + 41;
        getPaymentFci = i % 128;
        if (i % 2 == 0) {
            return writeReplace2;
        }
        throw null;
    }

    private static byte[] values(byte[] bArr, byte[] bArr2) throws com.payair.hce.setVersion {
        java.lang.Object obj;
        int i = getPaymentFci + 117;
        getCvrMaskAnd = i % 128;
        try {
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a((char) (android.graphics.Color.argb(1, 0, 0, 1) + 29473), "\u0000\u0000\u0000\u0000", "䵷Ⳛ垇", "鲦ֈ付\ud85c", android.graphics.ImageFormat.getBitsPerPixel(1) - 670725987, objArr);
                obj = objArr[0];
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((char) (android.graphics.Color.argb(0, 0, 0, 0) + 23630), "\u0000\u0000\u0000\u0000", "䵷Ⳛ垇", "鲦ֈ付\ud85c", android.graphics.ImageFormat.getBitsPerPixel(0) - 670725987, objArr2);
                obj = objArr2[0];
            }
            try {
                java.lang.Object[] objArr3 = {((java.lang.String) obj).intern()};
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b("톙퓬픰㴲䭈㨋扬䳉圸読䟟郚\uf637ꪯ\ue8d6糙뉩㤥랂鋮竁⸴⫝\ued8a\ud8b2ꃅ\uf847黃\u31e4", "\u0000\u0000\u0000\u0000", "絩ゴ䎟麏", (char) (36674 - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 1624198019, objArr4);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("蘄쀕펁篕饈\ude0d\udb90ꏌㆢ\ue9e5䐔", "\u0000\u0000\u0000\u0000", "魔䊿替놔", (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (-12402789) - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr5);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                try {
                    java.lang.Object[] objArr6 = {new javax.crypto.spec.DESKeySpec(bArr2)};
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b("톙퓬픰㴲䭈㨋扬䳉圸読䟟郚\uf637ꪯ\ue8d6糙뉩㤥랂鋮竁⸴⫝\ued8a\ud8b2ꃅ\uf847黃\u31e4", "\u0000\u0000\u0000\u0000", "絩ゴ䎟麏", (char) (36675 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (-1624198019) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b("犣톑쳆额헥惝\uddf9靥吏㾛艊㦄嘁祗", "\u0000\u0000\u0000\u0000", "栅\ue000\uddbb拐", (char) (53469 - android.view.View.combineMeasuredStates(0, 0)), android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr8);
                    java.lang.Object invoke2 = cls2.getMethod((java.lang.String) objArr8[0], java.security.spec.KeySpec.class).invoke(invoke, objArr6);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((char) (64707 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "쓸漠聯졨锓\ueb83흮䑽ᦠ삾\u05cd낝☦؋睴\ue2f3押", "ꃳ尅슎짼", (-1906571871) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr9);
                    try {
                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (39693 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 74991026 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr11);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        b("蘄쀕펁篕饈\ude0d\udb90ꏌㆢ\ue9e5䐔", "\u0000\u0000\u0000\u0000", "魔䊿替놔", (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-12402789) - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr12);
                        java.lang.Object invoke3 = cls3.getMethod((java.lang.String) objArr12[0], java.lang.String.class).invoke(null, objArr10);
                        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(new byte[8]);
                        getPaymentFci = (getCvrMaskAnd + 101) % 128;
                        try {
                            java.lang.Object[] objArr13 = {1, invoke2, ivParameterSpec};
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (39693 - android.view.View.MeasureSpec.getMode(0)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 74991025, objArr14);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            b("ⱚ좬妹\u2cf7", "\u0000\u0000\u0000\u0000", "함楠᪡냋", (char) (51994 - android.text.TextUtils.getOffsetAfter("", 0)), (android.os.Process.getThreadPriority(0) + 20) >> 6, objArr15);
                            cls4.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, java.security.Key.class, java.security.spec.AlgorithmParameterSpec.class).invoke(invoke3, objArr13);
                            getPaymentFci = (getCvrMaskAnd + 97) % 128;
                            try {
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (39693 - android.graphics.Color.alpha(0)), 74991025 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr16);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                b("ᗧꈮ葒뷉굝ⵤ\udd2c", "\u0000\u0000\u0000\u0000", "\ue7e8軼\uef2b焑", (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 730791144 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr17);
                                return (byte[]) cls5.getMethod((java.lang.String) objArr17[0], byte[].class).invoke(invoke3, bArr);
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
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            } catch (java.lang.Throwable th5) {
                java.lang.Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            throw new com.payair.hce.setVersion(e.toString());
        }
    }

    private static byte[] writeReplace(byte[] bArr, byte[] bArr2, boolean z) throws com.payair.hce.setVersion {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((char) (android.view.View.MeasureSpec.getSize(0) + 23630), "\u0000\u0000\u0000\u0000", "䵷Ⳛ垇", "鲦ֈ付\ud85c", (-670725988) - (android.os.Process.myTid() >> 22), objArr);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr2, ((java.lang.String) objArr[0]).intern());
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            c(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 18 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr2);
            java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
            getCvrMaskAnd = (getPaymentFci + 47) % 128;
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (android.os.Process.getGidForName("") + 39694), 74991025 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr3);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b("蘄쀕펁篕饈\ude0d\udb90ꏌㆢ\ue9e5䐔", "\u0000\u0000\u0000\u0000", "魔䊿替놔", (char) ((-1) - android.view.MotionEvent.axisFromString("")), (-12402788) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, intern);
                if (z) {
                    int i = (getPaymentFci + 47) % 128;
                    getCvrMaskAnd = i;
                    getPaymentFci = (i + 17) % 128;
                    try {
                        java.lang.Object[] objArr5 = {1, secretKeySpec};
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (39693 - android.text.TextUtils.indexOf("", "", 0, 0)), 74991024 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr6);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b("ⱚ좬妹\u2cf7", "\u0000\u0000\u0000\u0000", "함楠᪡냋", (char) (51994 - (android.os.Process.myTid() >> 22)), android.graphics.Color.red(0), objArr7);
                        cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.security.Key.class).invoke(invoke, objArr5);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    try {
                        java.lang.Object[] objArr8 = {2, secretKeySpec};
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (39693 - android.view.View.getDefaultSize(0, 0)), 74991025 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr9);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        b("ⱚ좬妹\u2cf7", "\u0000\u0000\u0000\u0000", "함楠᪡냋", (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 51993), android.view.View.combineMeasuredStates(0, 0), objArr10);
                        cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.security.Key.class).invoke(invoke, objArr8);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                int i2 = getPaymentFci + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                getCvrMaskAnd = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 / 3;
                }
                try {
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 39693), 74991025 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    b("ᗧꈮ葒뷉굝ⵤ\udd2c", "\u0000\u0000\u0000\u0000", "\ue7e8軼\uef2b焑", (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 730791143, objArr12);
                    return (byte[]) cls4.getMethod((java.lang.String) objArr12[0], byte[].class).invoke(invoke, bArr);
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
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            throw new com.payair.hce.setVersion(e.toString());
        }
    }

    @Override // com.payair.hce.setPendingAction
    public final java.lang.String DigitizedCardProfile(java.lang.String str, java.lang.String str2) throws com.payair.hce.setVersion {
        int i = getCvrMaskAnd + 41;
        getPaymentFci = i % 128;
        try {
            if (i % 2 != 0) {
                org.apache.commons.codec.binary.Hex.decodeHex(str.toCharArray());
                org.apache.commons.codec.binary.Hex.decodeHex(str2.toCharArray());
                throw new java.lang.ArithmeticException();
            }
            java.lang.String upperCase = new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(DigitizedCardProfile(org.apache.commons.codec.binary.Hex.decodeHex(str.toCharArray()), org.apache.commons.codec.binary.Hex.decodeHex(str2.toCharArray()), true))).toUpperCase();
            int i2 = getPaymentFci + 1;
            getCvrMaskAnd = i2 % 128;
            if (i2 % 2 != 0) {
                return upperCase;
            }
            throw new java.lang.ArithmeticException();
        } catch (org.apache.commons.codec.DecoderException e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.getMessage()));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    @Override // com.payair.hce.setPendingAction
    public final byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2, boolean z) throws com.payair.hce.setVersion {
        if (bArr2.length != 24) {
            getPaymentFci = (getCvrMaskAnd + 27) % 128;
            if (bArr2.length != 16) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a((char) android.view.KeyEvent.keyCodeFromString(""), "\u0000\u0000\u0000\u0000", "\ueb94ꌲꏐᡝ\uda57櫿翑ﵘ랩旧玫\udfc0憠ⶪꚵﺰ儕쫶㠋䧶隉꺲僠뼍ゔ", "苸쇰ᛠ걆", (-524160894) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(bArr2.length);
                throw new com.payair.hce.setVersion(sb.toString());
            }
        }
        byte[] bArr3 = new byte[24];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        if (bArr2.length == 16) {
            java.lang.System.arraycopy(bArr2, 0, bArr3, 16, 8);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((char) (17028 - android.view.KeyEvent.normalizeMetaState(0)), "\u0000\u0000\u0000\u0000", "䘪Ḭ䴃灨\uf65aऔ", "홺\uea49萫求", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr2);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr3, ((java.lang.String) objArr2[0]).intern());
        try {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                c((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 21, (char) (android.os.Process.myTid() >> 22), objArr3);
                try {
                    java.lang.Object[] objArr4 = {((java.lang.String) objArr3[0]).intern()};
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 39693), 74991025 - android.graphics.Color.red(0), objArr5);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[0]);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b("蘄쀕펁篕饈\ude0d\udb90ꏌㆢ\ue9e5䐔", "\u0000\u0000\u0000\u0000", "魔䊿替놔", (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (-12402789) - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr6);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr6[0], java.lang.String.class).invoke(null, objArr4);
                    try {
                        java.lang.Object[] objArr7 = {1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(new byte[8])};
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (39693 - android.text.TextUtils.getOffsetAfter("", 0)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 74991026, objArr8);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b("ⱚ좬妹\u2cf7", "\u0000\u0000\u0000\u0000", "함楠᪡냋", (char) (51995 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr9);
                        cls2.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.security.Key.class, java.security.spec.AlgorithmParameterSpec.class).invoke(invoke, objArr7);
                        try {
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 39693), 74991025 - android.view.KeyEvent.normalizeMetaState(0), objArr10);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            b("ᗧꈮ葒뷉굝ⵤ\udd2c", "\u0000\u0000\u0000\u0000", "\ue7e8軼\uef2b焑", (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 730791143 - android.view.KeyEvent.normalizeMetaState(0), objArr11);
                            byte[] bArr4 = (byte[]) cls3.getMethod((java.lang.String) objArr11[0], byte[].class).invoke(invoke, bArr);
                            for (int i = 0; i < 24; i++) {
                                bArr3[i] = 0;
                            }
                            return bArr4;
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
            } catch (java.lang.Throwable th4) {
                int i2 = 0;
                while (i2 < 24) {
                    int i3 = getPaymentFci + 109;
                    getCvrMaskAnd = i3 % 128;
                    if (i3 % 2 == 0) {
                        bArr3[i2] = 0;
                        i2 += 105;
                    } else {
                        bArr3[i2] = 0;
                        i2++;
                    }
                }
                throw th4;
            }
        } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            throw new com.payair.hce.setVersion(e.toString());
        }
    }

    @Override // com.payair.hce.setPendingAction
    public final java.lang.String values(java.lang.String str, java.lang.String str2) throws com.payair.hce.setVersion {
        getCvrMaskAnd = (getPaymentFci + 51) % 128;
        try {
            byte[] decodeHex = org.apache.commons.codec.binary.Hex.decodeHex(str.toCharArray());
            byte[] decodeHex2 = org.apache.commons.codec.binary.Hex.decodeHex(str2.toCharArray());
            getPaymentFci = (getCvrMaskAnd + 87) % 128;
            java.lang.String upperCase = new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(AlternateContactlessPaymentDataJson(decodeHex, decodeHex2, true))).toUpperCase();
            int i = getPaymentFci + 81;
            getCvrMaskAnd = i % 128;
            if (i % 2 != 0) {
                return upperCase;
            }
            throw null;
        } catch (org.apache.commons.codec.DecoderException e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.getMessage()));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private static byte[] AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2, boolean z) throws com.payair.hce.setVersion {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((char) (25139 - android.view.View.MeasureSpec.getSize(0)), "\u0000\u0000\u0000\u0000", "ᘑ뮔仩", "\ueaa3㓈㏶Ѣ", android.widget.ExpandableListView.getPackedPositionChild(0L) - 164312853, objArr);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr2, ((java.lang.String) objArr[0]).intern());
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            c(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 38, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8513), objArr2);
            try {
                java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39692), android.text.TextUtils.getOffsetAfter("", 0) + 74991025, objArr4);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("蘄쀕펁篕饈\ude0d\udb90ꏌㆢ\ue9e5䐔", "\u0000\u0000\u0000\u0000", "魔䊿替놔", (char) android.graphics.Color.blue(0), android.view.KeyEvent.normalizeMetaState(0) - 12402789, objArr5);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                if (z) {
                    int i = getCvrMaskAnd + 15;
                    int i2 = i % 128;
                    getPaymentFci = i2;
                    int i3 = i % 2 != 0 ? 0 : 1;
                    getCvrMaskAnd = (i2 + 77) % 128;
                    getCvrMaskAnd = (i2 + 81) % 128;
                    try {
                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i3), secretKeySpec};
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (39692 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.view.KeyEvent.normalizeMetaState(0) + 74991025, objArr7);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b("ⱚ좬妹\u2cf7", "\u0000\u0000\u0000\u0000", "함楠᪡냋", (char) (51994 - android.view.View.resolveSizeAndState(0, 0, 0)), (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr8);
                        cls2.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.security.Key.class).invoke(invoke, objArr6);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    getPaymentFci = (getCvrMaskAnd + 87) % 128;
                    try {
                        java.lang.Object[] objArr9 = {2, secretKeySpec};
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (39692 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 74991026 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr10);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b("ⱚ좬妹\u2cf7", "\u0000\u0000\u0000\u0000", "함楠᪡냋", (char) (android.text.TextUtils.indexOf("", "", 0) + 51994), android.view.KeyEvent.keyCodeFromString(""), objArr11);
                        cls3.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.security.Key.class).invoke(invoke, objArr9);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                getCvrMaskAnd = (getPaymentFci + 45) % 128;
                try {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    b("ꬕ幱ꁡ鍕꥓ﺤ땫㉇岮峪晝\uee29ℤ헠ᮩ蠨빓艍\uf447", "\u0000\u0000\u0000\u0000", "넴硅ഄ悛", (char) (39693 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), 74991024 + (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr12);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    b("ᗧꈮ葒뷉굝ⵤ\udd2c", "\u0000\u0000\u0000\u0000", "\ue7e8軼\uef2b焑", (char) android.view.View.resolveSizeAndState(0, 0, 0), 730791143 + android.graphics.Color.argb(0, 0, 0, 0), objArr13);
                    return (byte[]) cls4.getMethod((java.lang.String) objArr13[0], byte[].class).invoke(invoke, bArr);
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
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            throw new com.payair.hce.setVersion(e.toString());
        }
    }

    @Override // com.payair.hce.setPendingAction
    public final java.lang.String AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2) {
        int i = getPaymentFci + 109;
        getCvrMaskAnd = i % 128;
        try {
            java.lang.String upperCase = new java.lang.String(org.apache.commons.codec.binary.Hex.encodeHex(i % 2 == 0 ? values(org.apache.commons.codec.binary.Hex.decodeHex(str.toCharArray()), org.apache.commons.codec.binary.Hex.decodeHex(str2.toCharArray()), false) : values(org.apache.commons.codec.binary.Hex.decodeHex(str.toCharArray()), org.apache.commons.codec.binary.Hex.decodeHex(str2.toCharArray()), true))).toUpperCase();
            getPaymentFci = (getCvrMaskAnd + 41) % 128;
            return upperCase;
        } catch (com.payair.hce.setVersion | org.apache.commons.codec.DecoderException e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.getMessage()));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private byte[] values(byte[] bArr, byte[] bArr2, boolean z) throws com.payair.hce.setVersion {
        int i = getPaymentFci + 5;
        getCvrMaskAnd = i % 128;
        return i % 2 == 0 ? AlternateContactlessPaymentDataJson(valueOf(bArr), bArr2, false) : AlternateContactlessPaymentDataJson(valueOf(bArr), bArr2, true);
    }

    private static byte[] valueOf(byte[] bArr) {
        int i = getPaymentFci + 121;
        getCvrMaskAnd = i % 128;
        byte[] writeReplace2 = writeReplace(bArr);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getPaymentFci + 77;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            return writeReplace2;
        }
        throw null;
    }

    private static byte[] writeReplace(byte[] bArr) {
        byte[] bArr2;
        int i = getPaymentFci + 31;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            bArr2 = new byte[(bArr.length - 63) % (bArr.length << 22)];
            java.lang.System.arraycopy(bArr, 1, bArr2, 0, bArr.length);
            bArr2[bArr.length] = 5;
        } else {
            bArr2 = new byte[(bArr.length + 16) - (bArr.length % 16)];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr2[bArr.length] = Byte.MIN_VALUE;
        }
        int i2 = getCvrMaskAnd + 85;
        getPaymentFci = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    static void valueOf() {
        getAid = 1263759066225628708L;
        SdkCoreAlternateContactlessPaymentDataImpl = -804334044;
        SdkCoreBusinessLogicModuleImpl = (char) 59128;
    }

    static void init$0() {
        $$a = new byte[]{70, -35, 111, 66};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE;
    }

    static void writeReplace() {
        DigitizedCardProfile = 1263759066225628708L;
        valueOf = -665083764;
        RecordsJson = (char) 54820;
        IccPrivateKeyCrtComponentsJson = new char[]{24299, 61245, 15698, 19205, 39350, 10207, 30183, 33377, 53369, 7759, 44185, 64243, 2271, 22816, 59140, 13656, 17336, 24299, 61245, 15698, 19279, 39319, 10233, 30090, 33293, 53333, 7779, 44262, 64252, 2260, 22804, 59148, 13650, 17339, 37249, 57311, 27709, 32687, 52860, 7187, 27204, 47351, 1694, 21670, 41760, 61720, 16142, 36312, 56242, 10654, 30817, 50757, 5145, 25337, 7461, 44227, 32447, 2196, 55872, 25640, 13848, 49588, 37795, 23957, 61287, 47464, 19207, 6897, 42178, 30338, 'a', 3811, 48947, 27991, 7035, 51639, 30679, 9699, 53774};
        getProfileVersion = -1319157944626647176L;
    }
}
