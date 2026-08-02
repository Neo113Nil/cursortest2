package com.payair.hce;

/* loaded from: classes4.dex */
final class setLabelFor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static char[] RecordsJson;
    private static long SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static long getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static long getProfileVersion;
    private static final byte[] valueOf;
    private final com.payair.hce.getDetailedMessage AlternateContactlessPaymentDataJson;
    private final com.payair.hce.checkPermission DigitizedCardProfile;
    private android.content.Context values;
    private final com.payair.hce.ResponseCompleteTokenizeDto writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 119 - (b * 2);
        int i4 = i + 4;
        byte[] bArr = $$a;
        int i5 = b2 * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            i2 = 0;
            int i9 = i4 + i8;
            i4 = i7;
            i3 = i9;
            int i10 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i8 = bArr[i10];
            i4 = i3;
            i7 = i10;
            int i92 = i4 + i8;
            i4 = i7;
            i3 = i92;
            int i102 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = i4 | i;
        if ((i * (-129)) + (i2 * 131) + ((~(i4 | (~i3) | i)) * 130) + ((~i5) * (-260)) + (((~((~i) | i2)) | (~(i5 | i3))) * 130) == 1) {
            return writeReplace(objArr);
        }
        com.payair.hce.setLabelFor setlabelfor = (com.payair.hce.setLabelFor) objArr[0];
        getCvrMaskAnd = (getGpoResponse + 35) % 128;
        android.content.ContentResolver contentResolver = setlabelfor.values.getContentResolver();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(30 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 10, objArr2);
        byte[] DigitizedCardProfile = setlabelfor.DigitizedCardProfile(android.provider.Settings.Secure.getString(contentResolver, ((java.lang.String) objArr2[0]).intern()));
        getGpoResponse = (getCvrMaskAnd + 9) % 128;
        return DigitizedCardProfile;
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getCiacDecline ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getCiacDecline)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 40, 1921 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b = (byte) ($$b & 5);
                    byte b2 = (byte) (-b);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    e(b, b2, (byte) (b2 + 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myPid() >> 22), android.text.TextUtils.getCapsMode("", 0, 0) + 429, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    e((byte) 0, -1, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
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

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvrMaskAnd = 0;
        getGpoResponse = 1;
        valueOf();
        writeReplace();
        valueOf = new byte[]{13, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -21, 46, com.google.common.base.Ascii.FF, -71, -73, -58, 107, -36, -44, 48, 86, 58, 67, -4};
        getCvrMaskAnd = (getGpoResponse + 107) % 128;
    }

    private static void b(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 53;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(RecordsJson[i >> getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.KeyEvent.keyCodeFromString(""), 380 - android.os.Process.getGidForName(""), (char) (62387 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e((byte) 10, -1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(SdkCoreAlternateContactlessPaymentDataImpl), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 35, 3966 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 14, 212 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.graphics.Color.red(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(RecordsJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 381, (char) (62388 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    e((byte) 10, -1, (byte) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(SdkCoreAlternateContactlessPaymentDataImpl), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 3966 - android.view.View.resolveSize(0, 0), (char) (40222 - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, 213 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.view.View.resolveSize(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 87) % 128;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 31) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 34, 213 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void d(char c, int i, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 381 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 62387));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    e((byte) 10, -1, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getProfileVersion), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 36, 3966 - android.graphics.Color.red(0), (char) (40224 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 212 - android.view.View.combineMeasuredStates(0, 0), (char) android.graphics.Color.red(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
        }
        char[] cArr = new char[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 34, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.graphics.Color.red(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    setLabelFor(android.content.Context context, com.payair.hce.ResponseCompleteTokenizeDto responseCompleteTokenizeDto, com.payair.hce.getDetailedMessage getdetailedmessage) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, "�￼\u000e\u0000ￛ\u0010\u000b\u0002\r￼\uffff\u0000\uffff￼\u000f￼", 156 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.os.Process.myPid() >> 22) + 12, 16 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
        this.DigitizedCardProfile = com.payair.hce.checkPermission.DigitizedCardProfile(((java.lang.String) objArr[0]).intern());
        this.values = context;
        this.writeReplace = responseCompleteTokenizeDto;
        this.AlternateContactlessPaymentDataJson = getdetailedmessage;
    }

    protected final byte[] values() {
        getCvrMaskAnd = (getGpoResponse + 53) % 128;
        android.content.Context context = this.values;
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, objArr);
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4, (char) (android.os.Process.myPid() >> 22), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7, objArr2);
        byte[] DigitizedCardProfile = DigitizedCardProfile(sharedPreferences.getString(((java.lang.String) objArr2[0]).intern(), null));
        int i = getCvrMaskAnd + 57;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            return DigitizedCardProfile;
        }
        throw null;
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = $11 + 21;
        $10 = i4 % 128;
        int i5 = 2;
        if (i4 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        $10 = ($11 + 27) % 128;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $10 = ($11 + 79) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i6 = digitizedCardJson11.DigitizedCardProfile;
            char c = cArr[i6];
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[i5];
                objArr2[1] = java.lang.Integer.valueOf(getAid);
                objArr2[0] = java.lang.Integer.valueOf(c);
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2073, (char) (60036 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    byte b = (byte) ($$b & 14);
                    byte b2 = (byte) (b - 3);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    e(b, b2, (byte) (b2 + 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 3544 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.graphics.Color.red(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i5 = 2;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            int i7 = $10 + 83;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 53, 3542 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private byte[] DigitizedCardProfile(java.lang.String str) {
        byte[] bArr;
        getGpoResponse = (getCvrMaskAnd + 121) % 128;
        android.content.Context context = this.values;
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.View.MeasureSpec.getSize(0) + 4, objArr);
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(android.widget.ExpandableListView.getPackedPositionChild(0L) + 13, (char) (28646 - android.text.TextUtils.getOffsetAfter("", 0)), 11 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        if (!sharedPreferences.getBoolean(((java.lang.String) objArr2[0]).intern(), false)) {
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(false, "\u0007\b\u0003\u0006\ufff5\ufffb\ufff9", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 7 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 6 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr3);
            edit.putString(((java.lang.String) objArr3[0]).intern(), com.payair.hce.setVerticalScrollbarThumbDrawable.DigitizedCardProfile((byte[]) writeReplace(new java.lang.Object[0], 1757730538, -1757730537, (int) java.lang.System.currentTimeMillis())).toUpperCase(java.util.Locale.ENGLISH));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28647), android.graphics.Color.red(0) + 11, objArr4);
            edit.putBoolean(((java.lang.String) objArr4[0]).intern(), true);
            edit.apply();
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b(android.os.Process.getGidForName("") + 5, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7, objArr5);
        if (sharedPreferences.getString(((java.lang.String) objArr5[0]).intern(), null) == null) {
            android.content.SharedPreferences.Editor edit2 = sharedPreferences.edit();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, objArr6);
            edit2.putString(((java.lang.String) objArr6[0]).intern(), str);
            edit2.apply();
        }
        try {
            try {
                try {
                    if (this.writeReplace.writeReplace() != null) {
                        getGpoResponse = (getCvrMaskAnd + 43) % 128;
                        if (this.writeReplace.writeReplace().length > 0) {
                            int i = getGpoResponse + 87;
                            getCvrMaskAnd = i % 128;
                            if (i % 2 != 0) {
                                this.writeReplace.writeReplace();
                                throw null;
                            }
                            bArr = this.writeReplace.writeReplace();
                            byte[] DigitizedCardProfile = DigitizedCardProfile(str.getBytes());
                            getGpoResponse = (getCvrMaskAnd + 15) % 128;
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            a(false, "\u0007\b\u0003\u0006\ufff5\ufffb\ufff9", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, 7 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr7);
                            byte[] bytes = sharedPreferences.getString(((java.lang.String) objArr7[0]).intern(), "").getBytes();
                            byte[] bArr2 = new byte[DigitizedCardProfile.length + bArr.length + bytes.length];
                            java.lang.System.arraycopy(DigitizedCardProfile, 0, bArr2, 0, DigitizedCardProfile.length);
                            java.lang.System.arraycopy(bArr, 0, bArr2, DigitizedCardProfile.length, bArr.length);
                            java.lang.System.arraycopy(bytes, 0, bArr2, DigitizedCardProfile.length + bArr.length, bytes.length);
                            com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{DigitizedCardProfile}, -1763061903, 1763061911, (int) java.lang.System.currentTimeMillis());
                            com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{bytes}, -1763061903, 1763061911, (int) java.lang.System.currentTimeMillis());
                            byte[] DigitizedCardProfile2 = DigitizedCardProfile(bArr2);
                            getCvrMaskAnd = (getGpoResponse + 21) % 128;
                            com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{bArr2}, -1763061903, 1763061911, (int) java.lang.System.currentTimeMillis());
                            return DigitizedCardProfile2;
                        }
                    }
                    byte[] DigitizedCardProfile22 = DigitizedCardProfile(bArr2);
                    getCvrMaskAnd = (getGpoResponse + 21) % 128;
                    com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{bArr2}, -1763061903, 1763061911, (int) java.lang.System.currentTimeMillis());
                    return DigitizedCardProfile22;
                } catch (java.lang.RuntimeException e) {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(true, "\u001d\uffc9\u000e\u001d\n\u001b\u000e\u0017\u000e\u0010\uffc9\u0018\u001d\uffc9\u000e\u0015\u000b\n\u0017\ufffe\uffc9￣\"\u000e\u0014\uffc9￫￭\uffc9\u000e\u0011", 175 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 20 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 31, objArr8);
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(((java.lang.String) objArr8[0]).intern().concat(java.lang.String.valueOf(e))));
                }
                byte[] DigitizedCardProfile3 = DigitizedCardProfile(str.getBytes());
                getGpoResponse = (getCvrMaskAnd + 15) % 128;
                java.lang.Object[] objArr72 = new java.lang.Object[1];
                a(false, "\u0007\b\u0003\u0006\ufff5\ufffb\ufff9", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, 7 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr72);
                byte[] bytes2 = sharedPreferences.getString(((java.lang.String) objArr72[0]).intern(), "").getBytes();
                byte[] bArr22 = new byte[DigitizedCardProfile3.length + bArr.length + bytes2.length];
                java.lang.System.arraycopy(DigitizedCardProfile3, 0, bArr22, 0, DigitizedCardProfile3.length);
                java.lang.System.arraycopy(bArr, 0, bArr22, DigitizedCardProfile3.length, bArr.length);
                java.lang.System.arraycopy(bytes2, 0, bArr22, DigitizedCardProfile3.length + bArr.length, bytes2.length);
                com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{DigitizedCardProfile3}, -1763061903, 1763061911, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{bytes2}, -1763061903, 1763061911, (int) java.lang.System.currentTimeMillis());
            } catch (java.lang.RuntimeException e2) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(true, "\u001d\uffc9\u000e\u001d\n\u001b\u000e\u0017\u000e\u0010\uffc9\u0018\u001d\uffc9\u000e\u0015\u000b\n\u0017\ufffe\uffc9￣\"\u000e\u0014\uffc9￫￭\uffc9\u000e\u0011", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 174, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19, 31 - android.text.TextUtils.getOffsetBefore("", 0), objArr9);
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(((java.lang.String) objArr9[0]).intern().concat(java.lang.String.valueOf(e2))));
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        bArr = valueOf;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        getGpoResponse = (getCvrMaskAnd + 33) % 128;
        byte[] bArr = new byte[16];
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(false, "\n\u0006\uffff\u000b\u0000\ufff9￩\b", android.view.KeyEvent.keyCodeFromString("") + 160, 3 - (android.os.Process.myTid() >> 22), 8 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
            try {
                java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                d((char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 26 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.getCapsMode("", 0, 0), objArr4);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                c("ゼ킼淆ᬡホ㌆ꨌ냵뾮ꎔ㪈⁙⸪툈謕", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr5);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                try {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c("㈿闍괵淛㉑癷櫳옲봁\ue6ef嗢嚧Ⲵ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr6);
                    java.util.Random.class.getMethod((java.lang.String) objArr6[0], byte[].class).invoke(invoke, new byte[1]);
                    getGpoResponse = (getCvrMaskAnd + 117) % 128;
                    try {
                        try {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            c("㈿闍괵淛㉑癷櫳옲봁\ue6ef嗢嚧Ⲵ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr7);
                            java.util.Random.class.getMethod((java.lang.String) objArr7[0], byte[].class).invoke(invoke, bArr);
                            return bArr;
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
        } catch (java.security.NoSuchAlgorithmException unused) {
            java.lang.Object newInstance = java.util.Random.class.getDeclaredConstructor(null).newInstance(null);
            getCvrMaskAnd = (getGpoResponse + 125) % 128;
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            c("㈿闍괵淛㉑癷櫳옲봁\ue6ef嗢嚧Ⲵ", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr8);
            java.util.Random.class.getMethod((java.lang.String) objArr8[0], byte[].class).invoke(newInstance, bArr);
            return bArr;
        }
    }

    private static byte[] DigitizedCardProfile(byte[] bArr) {
        getGpoResponse = (getCvrMaskAnd + 53) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(23 - android.graphics.Color.green(0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 6 - android.view.MotionEvent.axisFromString(""), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            getGpoResponse = (getCvrMaskAnd + 59) % 128;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                c("뽓卨籷뀿뼹냖뮿ᯃ、⁀⬨譅ꇞ凍骨竞ᅞ섕ਈ\uea4b苐狔禸姕牚\ue267\ue934쥑\ue3deᏜ墥", 1 - android.graphics.Color.alpha(0), objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                c("ゼ킼淆ᬡホ㌆ꨌ냵뾮ꎔ㪈⁙⸪툈謕", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr3);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, intern);
                int i = getCvrMaskAnd + 51;
                getGpoResponse = i % 128;
                int i2 = i % 2;
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    c("뽓卨籷뀿뼹냖뮿ᯃ、⁀⬨譅ꇞ凍骨竞ᅞ섕ਈ\uea4b苐狔禸姕牚\ue267\ue934쥑\ue3deᏜ墥", 1 - android.graphics.Color.green(0), objArr4);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((char) (56195 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), android.text.TextUtils.getTrimmedLength("") + 6, 26 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr5);
                    return (byte[]) cls2.getMethod((java.lang.String) objArr5[0], byte[].class).invoke(invoke, bArr);
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
        } catch (java.security.NoSuchAlgorithmException e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.toString()));
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
    }

    private static byte[] writeReplace(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
        int i2 = getGpoResponse + 105;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = com.payair.hce.setLabelFor.valueOf.DigitizedCardProfile;
            throw null;
        }
        if (i != com.payair.hce.setLabelFor.valueOf.DigitizedCardProfile) {
            int i4 = com.payair.hce.setLabelFor.valueOf.valueOf;
            byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(DigitizedCardProfile(bArr, bArr2, 2));
            getGpoResponse = (getCvrMaskAnd + 43) % 128;
            return AlternateContactlessPaymentDataJson;
        }
        byte[] bArr3 = new byte[(bArr.length + 16) - (bArr.length % 16)];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        bArr3[bArr.length] = Byte.MIN_VALUE;
        int i5 = com.payair.hce.setLabelFor.valueOf.DigitizedCardProfile;
        return DigitizedCardProfile(bArr3, bArr2, 1);
    }

    private static byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        b((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 40, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 39402), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3, objArr);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr2, ((java.lang.String) objArr[0]).intern());
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b((android.view.KeyEvent.getMaxKeyCode() >> 16) + 43, (char) (android.os.Process.getGidForName("") + 1), android.widget.ExpandableListView.getPackedPositionType(0L) + 3, objArr2);
            java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(true, "￭\u0011\u0003\uffff", 153 - android.os.Process.getGidForName(""), 4 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 3 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr3);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr3[0]).intern());
            sb.append(intern);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(false, "\ufff1\u0012\ufff3\u0004\u0007\u0007\f\u0011\nￒ", android.text.TextUtils.indexOf("", "") + 181, android.view.View.resolveSize(0, 0) + 9, android.graphics.Color.blue(0) + 10, objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            try {
                java.lang.Object[] objArr5 = {sb.toString()};
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                d((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 19 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.os.Process.myPid() >> 22) + 32, objArr6);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr6[0]);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c("ゼ킼淆ᬡホ㌆ꨌ냵뾮ꎔ㪈⁙⸪툈謕", android.text.TextUtils.getOffsetBefore("", 0) + 1, objArr7);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr7[0], java.lang.String.class).invoke(null, objArr5);
                if (i == com.payair.hce.setLabelFor.valueOf.DigitizedCardProfile) {
                    getCvrMaskAnd = (getGpoResponse + 25) % 128;
                    try {
                        java.lang.Object[] objArr8 = {1, secretKeySpec};
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        d((char) android.view.View.resolveSize(0, 0), 19 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31, objArr9);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        c("⓲▍㝎㱉⒛옼\uf099鞠", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr10);
                        cls2.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.security.Key.class).invoke(invoke, objArr8);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    getGpoResponse = (getCvrMaskAnd + 85) % 128;
                    try {
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        d((char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 19 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 32 - android.text.TextUtils.getOffsetBefore("", 0), objArr11);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        c("⓲▍㝎㱉⒛옼\uf099鞠", android.view.View.resolveSize(0, 0) + 1, objArr12);
                        cls3.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.security.Key.class).invoke(invoke, 2, secretKeySpec);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                try {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    d((char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 19 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 32, objArr13);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    c("꼉ᚍꚆ럶꽭\uf53d慾ᰂ‛斷\uf1d0", -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr14);
                    return (byte[]) cls4.getMethod((java.lang.String) objArr14[0], byte[].class).invoke(invoke, bArr);
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
        } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            try {
                java.lang.Object[] objArr15 = {e.toString()};
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                d((char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 51, objArr16);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr16[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr15));
            } catch (java.lang.Throwable th5) {
                java.lang.Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        }
    }

    private static byte[] AlternateContactlessPaymentDataJson(byte[] bArr) throws java.security.GeneralSecurityException {
        boolean z;
        if (bArr != null) {
            int i = getGpoResponse + 33;
            getCvrMaskAnd = i % 128;
            if (i % 2 == 0 ? bArr.length >= 16 : bArr.length >= 12) {
                int length = bArr.length - 1;
                int i2 = 0;
                while (true) {
                    if (length < bArr.length - 16) {
                        z = false;
                        break;
                    }
                    i2++;
                    byte b = bArr[length];
                    if (b != 0) {
                        getCvrMaskAnd = (getGpoResponse + 81) % 128;
                        if (b == Byte.MIN_VALUE) {
                            z = true;
                            break;
                        }
                    }
                    length--;
                }
                if (!z) {
                    return bArr;
                }
                int i3 = getCvrMaskAnd + 107;
                getGpoResponse = i3 % 128;
                if (i3 % 2 == 0) {
                    int length2 = bArr.length / i2;
                    byte[] bArr2 = new byte[length2];
                    java.lang.System.arraycopy(bArr, 1, bArr2, 0, length2);
                    return bArr2;
                }
                int length3 = bArr.length - i2;
                byte[] bArr3 = new byte[length3];
                java.lang.System.arraycopy(bArr, 0, bArr3, 0, length3);
                return bArr3;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(46 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.os.Process.getGidForName("") + 19, objArr);
        try {
            java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            d((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 38 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 50 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr3);
            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    protected static byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2) throws com.payair.hce.getTokenInfo, java.security.GeneralSecurityException {
        int i = getCvrMaskAnd + 21;
        getGpoResponse = i % 128;
        byte[] writeReplace = writeReplace(bArr, bArr2, com.payair.hce.setLabelFor.valueOf.valueOf);
        if (i % 2 != 0) {
            return writeReplace;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.Initializer writeReplace(byte[] bArr) {
        try {
            com.payair.hce.Initializer AlternateContactlessPaymentDataJson = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(bArr);
            byte[] bArr2 = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1877837077, 1877837077, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson));
            byte[] valueOf2 = this.AlternateContactlessPaymentDataJson.valueOf((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1877837077, 1877837077, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson)));
            byte[] bArr3 = new byte[bArr2.length + valueOf2.length];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            java.lang.System.arraycopy(valueOf2, 0, bArr3, bArr2.length, valueOf2.length);
            com.payair.hce.Initializer initializer = new com.payair.hce.Initializer(bArr3);
            getCvrMaskAnd = (getGpoResponse + 49) % 128;
            return initializer;
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    protected final byte[] values(com.payair.hce.Initializer initializer) {
        getGpoResponse = (getCvrMaskAnd + 93) % 128;
        try {
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializer}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializer)));
            AlternateContactlessPaymentDataJson.writeReplace();
            AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
            byte[] DigitizedCardProfile = AlternateContactlessPaymentDataJson.DigitizedCardProfile(0, AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson() - 64).DigitizedCardProfile();
            if (this.AlternateContactlessPaymentDataJson.valueOf(DigitizedCardProfile, AlternateContactlessPaymentDataJson.DigitizedCardProfile(AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson() - 64, AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson()).DigitizedCardProfile())) {
                return this.AlternateContactlessPaymentDataJson.DigitizedCardProfile(new com.payair.hce.Initializer(DigitizedCardProfile));
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, "\u0010\b\u0017\u0017￤\u0007\f\u000f\u0004\u0019\u0011\fￃ\u0016\u0004\u001aￃ￦￤\ufff0ￃ\b\u000b\u0017ￃ\u000b\u0006\f\u000b\u001aￃ\u0015\u0012\tￃ\u0004\u0017\u0004\u0007ￃ\u0017\u0013\u001c\u0015\u0006\u0011\b\u0011\u0018ￃ\u0012\u0017ￃ\u0007\b\u0017\u0013", 181 - android.text.TextUtils.getTrimmedLength(""), android.graphics.Color.green(0) + 5, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 57, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            getCvrMaskAnd = (getGpoResponse + 71) % 128;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                d((char) android.graphics.Color.red(0), 38 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 52, objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(intern));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    public final com.payair.hce.Initializer valueOf(byte[] bArr) {
        try {
            com.payair.hce.Initializer AlternateContactlessPaymentDataJson = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(bArr);
            com.payair.hce.Initializer initializer = new com.payair.hce.Initializer((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1877837077, 1877837077, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson)));
            getCvrMaskAnd = (getGpoResponse + 17) % 128;
            return initializer;
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class valueOf {
        private static int AlternateContactlessPaymentDataJson = 106;
        public static final int DigitizedCardProfile = 1;
        public static final int valueOf = 2;
        private static int values = 1;

        static {
            int i = 106 % 2;
        }
    }

    public final byte[] values(byte[] bArr) throws java.security.GeneralSecurityException, com.payair.hce.getTokenInfo {
        android.content.ContentResolver contentResolver = this.values.getContentResolver();
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(android.view.View.resolveSize(0, 0) + 30, (char) (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 11, objArr);
        byte[] DigitizedCardProfile = DigitizedCardProfile(android.provider.Settings.Secure.getString(contentResolver, ((java.lang.String) objArr[0]).intern()));
        try {
            byte[] writeReplace = writeReplace(bArr, DigitizedCardProfile, com.payair.hce.setLabelFor.valueOf.DigitizedCardProfile);
            if (DigitizedCardProfile != null) {
                getGpoResponse = (getCvrMaskAnd + 115) % 128;
                int length = DigitizedCardProfile.length;
                for (int i = 0; i < length; i++) {
                    DigitizedCardProfile[i] = 0;
                }
            }
            return writeReplace;
        } catch (java.lang.Throwable th) {
            if (DigitizedCardProfile != null) {
                int length2 = DigitizedCardProfile.length;
                int i2 = 0;
                while (i2 < length2) {
                    int i3 = getGpoResponse;
                    getCvrMaskAnd = (i3 + 119) % 128;
                    DigitizedCardProfile[i2] = 0;
                    i2++;
                    getCvrMaskAnd = (i3 + 7) % 128;
                }
            }
            throw th;
        }
    }

    static void valueOf() {
        IccPrivateKeyCrtComponentsJson = new char[]{24261, 2250, 62161, 23746, 1681, 61640, 23250, 1232, 61178, 22777, 750, 60663, 22246, 181, 60100, 21750, 16012, 59550, 21141, 15494, 59053, 20634, 15001, 58519, 20128, 14502, 34120, 54081, 10563, 34629, 56655, 11084, 24261, 2250, 62161, 23746, 1735, 61589, 23252, 1217, 61174, 22779, 755, 60652, 22193, 216, 60158, 21731, 16007, 59534, 21141, 24261, 2250, 62161, 23746, 1681, 61640, 23250, 1232, 61178, 22777, 750, 60663, 22246, 181, 60112, 21750, 16001, 59534, 21141, 15490, 59027, 20648, 14994, 58512, 20154, 14521, 58030, 19639, 13990, 57502, 19119, 13488, 40522, 18523, 12883, 40010, 18000, 12373};
        getProfileVersion = -3026414955859343189L;
        getCiacDecline = -170200882265286884L;
    }

    static void writeReplace() {
        getAid = 1889207097;
        RecordsJson = new char[]{24290, 15344, 38101, 29099, 24267, 15318, 38113, 29074, 51900, 42822, 'N', 40239, 12578, 21552, 64264, 7746, 42330, 51383, 28548, 62188, 6621, 48336, 49717, 24316, 15355, 38102, 29142, 51949, 42774, '1', 24270, 15325, 38131, 29065, 51888, 42826, 'c', 40244, 30246, 54071, 50948, 41500, 3374, 24298, 15344, 38101, 24294, 15325, 38113, 29082, 51891, 42826, 'c', 40267, 30246, 54077, 44487, 1774, 58251, 31971, 55636, 45666, 3861, 59414};
        SdkCoreAlternateContactlessPaymentDataImpl = 312103757594966963L;
    }

    protected final byte[] DigitizedCardProfile() throws java.security.GeneralSecurityException {
        return (byte[]) writeReplace(new java.lang.Object[]{this}, -812843981, 812843981, java.lang.System.identityHashCode(this));
    }

    private static byte[] AlternateContactlessPaymentDataJson() {
        return (byte[]) writeReplace(new java.lang.Object[0], 1757730538, -1757730537, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{107, -45, -30, com.google.common.base.Ascii.FS};
        $$b = 67;
    }
}
