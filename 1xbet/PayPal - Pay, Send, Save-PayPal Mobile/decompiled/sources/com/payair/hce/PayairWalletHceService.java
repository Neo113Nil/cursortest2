package com.payair.hce;

/* loaded from: classes4.dex */
public class PayairWalletHceService extends android.nfc.cardemulation.HostApduService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static long IccPrivateKeyCrtComponentsJson;
    private static char[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static char getAid;
    private static int getCiacDecline;
    private static boolean getCvrMaskAnd;
    private static int getGpoResponse;
    private static boolean getPaymentFci;
    private static char[] getProfileVersion;
    private static android.content.Context valueOf;
    private static com.payair.hce.getText values;
    private com.payair.hce.setForceDarkAllowed DigitizedCardProfile;
    private byte[] writeReplace = {105, -122};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2 = s + 4;
        int i3 = 119 - b;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b2 + 6];
        int i4 = b2 + 5;
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i3 = (i3 + (-i5)) - 2;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i2];
            i3 = (i3 + (-i5)) - 2;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 62 - s;
        byte[] bArr = $$d;
        int i5 = 119 - b;
        int i6 = 803 - i;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i5 = i4;
            i3 = 0;
            i5 = i5 + (-i7) + 1;
            i6++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i5 = i5 + (-i7) + 1;
            i6++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$g;
        int i4 = i2 + 99;
        int i5 = i * 4;
        int i6 = s + 4;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i6;
            int i10 = 0;
            int i11 = (-i6) + i8;
            i3 = i10;
            int i12 = i9;
            i4 = i11;
            i6 = i12;
            int i13 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i14 = i4;
            i9 = i13;
            i6 = bArr[i13];
            i10 = i3 + 1;
            i8 = i14;
            int i112 = (-i6) + i8;
            i3 = i10;
            int i122 = i9;
            i4 = i112;
            i6 = i122;
            int i132 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1322 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (i * 592) + (i2 * (-590)) + ((~(i4 | i2)) * (-1182)) + (((~(i | i2)) | (~(i4 | i5 | (~i3)))) * (-591)) + ((i3 | i4 | i5) * 591);
        if (i6 != 1) {
            return i6 != 2 ? values(objArr) : AlternateContactlessPaymentDataJson(objArr);
        }
        boolean booleanValue = ((java.lang.Boolean) objArr[0]).booleanValue();
        byte[] bArr = (byte[]) objArr[1];
        int i7 = getGpoResponse;
        int i8 = i7 & 113;
        int i9 = (i8 + ((i7 ^ 113) | i8)) % 128;
        getCiacDecline = i9;
        if (booleanValue) {
            int i10 = ((i9 | 69) << 1) - (((~i9) & 69) | (i9 & (-70)));
            getGpoResponse = i10 % 128;
            if (i10 % 2 != 0) {
                ((com.payair.hce.HCEEventListener) com.payair.hce.setAccessibilityHeading.valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).onContactlessPaymentCompleted(bArr, true, 1L, null, "ACCEPTED".getBytes());
            } else {
                ((com.payair.hce.HCEEventListener) com.payair.hce.setAccessibilityHeading.valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).onContactlessPaymentCompleted(bArr, true, 0L, null, "ACCEPTED".getBytes());
            }
        }
        int i11 = getGpoResponse;
        getCiacDecline = ((i11 ^ 47) + ((i11 & 47) << 1)) % 128;
        return null;
    }

    private static void a(char c, int i, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        int i3 = 0;
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            int i4 = $10 + 37;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i3] = java.lang.Integer.valueOf(getProfileVersion[i2 << getcvmmodel.valueOf]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.resolveSize(i3, i3), android.text.TextUtils.getOffsetAfter("", i3) + 381, (char) (62389 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        f(i3, (short) -1, i3, objArr3);
                        java.lang.String str = (java.lang.String) objArr3[i3];
                        java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                        clsArr[i3] = java.lang.Integer.TYPE;
                        obj = cls.getMethod(str, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(IccPrivateKeyCrtComponentsJson), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 35, 3966 - android.text.TextUtils.getTrimmedLength(""), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34, android.text.TextUtils.indexOf("", "", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                int i6 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(getProfileVersion[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 48, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 382, (char) (62388 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    f(0, (short) -1, 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(IccPrivateKeyCrtComponentsJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('S' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.getOffsetBefore("", 0) + 3966, (char) (40223 - (android.os.Process.myPid() >> 22)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i6] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 34, 212 - android.view.View.MeasureSpec.getMode(0), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
            i3 = 0;
        }
        char[] cArr = new char[i];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 111) % 128;
        while (getcvmmodel.valueOf < i) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33, 212 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void c(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str3 != null) {
            int i2 = $11 + 75;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        int i3 = 3;
        if (str2 != 0) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr2 = str2.toCharArray();
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
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr3, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        $11 = ($10 + 57) % 128;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 71, 1179 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.graphics.Color.blue(0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f(0, (short) -1, i3, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30, 3443 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3831))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                char c2 = cArr5[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[i3];
                objArr5[2] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c2 * 32718);
                objArr5[0] = getwalletdata;
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 1865 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (41776 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    f(0, (short) -1, 6, objArr6);
                    java.lang.String str4 = (java.lang.String) objArr6[0];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[i3];
                    clsArr[0] = java.lang.Object.class;
                    clsArr[1] = java.lang.Integer.TYPE;
                    clsArr[2] = java.lang.Integer.TYPE;
                    obj3 = cls2.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 28, 3134 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    f(0, (short) -1, 7, objArr8);
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L)) ^ ((cArr5[intValue2] ^ cArr4[getwalletdata.writeReplace]) ^ (AlternateContactlessPaymentDataJson ^ 1263759066225628708L))) ^ ((char) (getAid ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                cArr4 = cArr4;
                i3 = 3;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str5 = new java.lang.String(cArr7);
        int i5 = $10 + 21;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        objArr[0] = str5;
    }

    private static void b(int i, java.lang.String str, int[] iArr, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = RecordsJson;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - android.view.View.resolveSize(0, 0)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(SdkCoreBusinessLogicModuleImpl)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 286 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getCvrMaskAnd) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 21) % 128;
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.graphics.ImageFormat.getBitsPerPixel(0), 1629 - android.view.KeyEvent.normalizeMetaState(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f(0, (short) -1, 19, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!getPaymentFci) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            $10 = ($11 + 67) % 128;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 17) % 128;
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            java.lang.String str4 = new java.lang.String(cArr4);
            int i3 = $11 + 1;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            objArr[0] = str4;
            return;
        }
        $10 = ($11 + 33) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            $11 = ($10 + 13) % 128;
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1629 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                f(0, (short) -1, 19, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:451:0x09f6, code lost:
    
        if ((r5 + 4611686018427387922L) >= ((java.lang.Long) java.lang.Class.forName(r3).getDeclaredMethod(r11, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0584, code lost:
    
        r5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.getTrimmedLength(""), (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 583, (char) ((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 24290));
        r10 = new java.lang.Object[1];
        d(r8[18], r8[5], r8[10], r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x05c3, code lost:
    
        r10 = new java.lang.Object[]{r5.getField((java.lang.String) r10[0]).get(null), 582360145, 0};
        r5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x05db, code lost:
    
        if (r5 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x05dd, code lost:
    
        r5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (-16772386) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0619, code lost:
    
        r5 = (java.lang.Object[]) ((java.lang.reflect.Method) r5).invoke(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0622, code lost:
    
        r6 = com.payair.hce.PayairWalletHceService.getCiacDecline;
        com.payair.hce.PayairWalletHceService.getGpoResponse = (((r6 | 85) << 1) - (r6 ^ 85)) % 128;
        r32 = r3;
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0636, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x32fb, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x32ff, code lost:
    
        if (r2 != null) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x3301, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x3302, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x09d3, code lost:
    
        if ((r5 ^ 4611686018427387922L) >= ((java.lang.Long) java.lang.Class.forName(r3).getDeclaredMethod(r11, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0582, code lost:
    
        if ((r27 + 1870) >= ((java.lang.Long) java.lang.Class.forName(r3).getDeclaredMethod(r11, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x09f8, code lost:
    
        r3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(r7) + 44, 922 - android.widget.ExpandableListView.getPackedPositionType(0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
        r10 = new java.lang.Object[1];
        d(r8[18], r8[5], r8[10], r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0a36, code lost:
    
        r5 = new java.lang.Object[]{r3.getField((java.lang.String) r10[0]).get(null), -688606955, 0};
        r3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0a55, code lost:
    
        if (r3 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0a57, code lost:
    
        r3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 44, android.graphics.ImageFormat.getBitsPerPixel(0) + 4861, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0a97, code lost:
    
        r3 = (java.lang.Object[]) ((java.lang.reflect.Method) r3).invoke(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0aa0, code lost:
    
        r7 = 0;
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x055f, code lost:
    
        if ((r27 + 1870) >= ((java.lang.Long) java.lang.Class.forName(r3).getDeclaredMethod(r11, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x155e A[Catch: all -> 0x0636, TryCatch #10 {all -> 0x0636, blocks: (B:38:0x080b, B:40:0x0821, B:41:0x085a, B:50:0x0a36, B:52:0x0a57, B:53:0x0a97, B:60:0x0bdc, B:62:0x0bf8, B:63:0x0c39, B:69:0x0e36, B:71:0x0e50, B:72:0x0e8b, B:80:0x10c5, B:82:0x10df, B:83:0x1117, B:92:0x133d, B:94:0x135e, B:95:0x13bd, B:97:0x14fd, B:99:0x150c, B:100:0x1542, B:102:0x155e, B:103:0x1592, B:107:0x15b6, B:109:0x15c5, B:110:0x15ff, B:112:0x162b, B:113:0x1687, B:119:0x1968, B:121:0x1989, B:122:0x19ce, B:127:0x1c54, B:129:0x1c71, B:130:0x1cb3, B:139:0x1f35, B:141:0x1f56, B:142:0x1f95, B:148:0x24f9, B:150:0x2515, B:151:0x2551, B:159:0x26eb, B:161:0x270c, B:162:0x274a, B:175:0x29b1, B:178:0x2a0b, B:179:0x2ab0, B:184:0x2bf1, B:187:0x2c41, B:196:0x2def, B:198:0x2e10, B:199:0x2e53, B:206:0x30b3, B:208:0x30d0, B:209:0x3114, B:213:0x3125, B:215:0x3142, B:216:0x317f, B:220:0x324a, B:222:0x3267, B:223:0x32a6, B:234:0x2e7d, B:236:0x2ea2, B:237:0x2ef6, B:245:0x2c08, B:249:0x2cd0, B:252:0x2d20, B:253:0x2ce7, B:254:0x29d0, B:256:0x2a58, B:259:0x2aa9, B:260:0x2a73, B:294:0x25e2, B:296:0x25fe, B:297:0x2641, B:332:0x1cc2, B:334:0x1cd5, B:335:0x1d14, B:337:0x1d1e, B:339:0x1d31, B:340:0x1d6e, B:344:0x1def, B:346:0x1e0c, B:347:0x1e4c, B:372:0x168f, B:374:0x169e, B:375:0x16d1, B:377:0x16fd, B:378:0x175f, B:381:0x17d0, B:383:0x17df, B:384:0x1815, B:386:0x1841, B:387:0x189f, B:391:0x13f3, B:393:0x1415, B:394:0x1468, B:403:0x1126, B:405:0x113c, B:406:0x1176, B:410:0x11f4, B:412:0x120a, B:413:0x1245, B:439:0x0c49, B:441:0x0c66, B:442:0x0ca9, B:446:0x0d2d, B:448:0x0d4a, B:449:0x0d88, B:453:0x0ac2, B:455:0x0add, B:456:0x0b15, B:468:0x08fc, B:470:0x0912, B:471:0x094f, B:479:0x05c3, B:481:0x05dd, B:482:0x0619), top: B:478:0x05c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x15a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x18e7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x1c4c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x1e94  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x24e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x267f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x28e5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x2942  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x2bd7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x2d60  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x2fab  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x3197  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x2ea2 A[Catch: all -> 0x0636, TryCatch #10 {all -> 0x0636, blocks: (B:38:0x080b, B:40:0x0821, B:41:0x085a, B:50:0x0a36, B:52:0x0a57, B:53:0x0a97, B:60:0x0bdc, B:62:0x0bf8, B:63:0x0c39, B:69:0x0e36, B:71:0x0e50, B:72:0x0e8b, B:80:0x10c5, B:82:0x10df, B:83:0x1117, B:92:0x133d, B:94:0x135e, B:95:0x13bd, B:97:0x14fd, B:99:0x150c, B:100:0x1542, B:102:0x155e, B:103:0x1592, B:107:0x15b6, B:109:0x15c5, B:110:0x15ff, B:112:0x162b, B:113:0x1687, B:119:0x1968, B:121:0x1989, B:122:0x19ce, B:127:0x1c54, B:129:0x1c71, B:130:0x1cb3, B:139:0x1f35, B:141:0x1f56, B:142:0x1f95, B:148:0x24f9, B:150:0x2515, B:151:0x2551, B:159:0x26eb, B:161:0x270c, B:162:0x274a, B:175:0x29b1, B:178:0x2a0b, B:179:0x2ab0, B:184:0x2bf1, B:187:0x2c41, B:196:0x2def, B:198:0x2e10, B:199:0x2e53, B:206:0x30b3, B:208:0x30d0, B:209:0x3114, B:213:0x3125, B:215:0x3142, B:216:0x317f, B:220:0x324a, B:222:0x3267, B:223:0x32a6, B:234:0x2e7d, B:236:0x2ea2, B:237:0x2ef6, B:245:0x2c08, B:249:0x2cd0, B:252:0x2d20, B:253:0x2ce7, B:254:0x29d0, B:256:0x2a58, B:259:0x2aa9, B:260:0x2a73, B:294:0x25e2, B:296:0x25fe, B:297:0x2641, B:332:0x1cc2, B:334:0x1cd5, B:335:0x1d14, B:337:0x1d1e, B:339:0x1d31, B:340:0x1d6e, B:344:0x1def, B:346:0x1e0c, B:347:0x1e4c, B:372:0x168f, B:374:0x169e, B:375:0x16d1, B:377:0x16fd, B:378:0x175f, B:381:0x17d0, B:383:0x17df, B:384:0x1815, B:386:0x1841, B:387:0x189f, B:391:0x13f3, B:393:0x1415, B:394:0x1468, B:403:0x1126, B:405:0x113c, B:406:0x1176, B:410:0x11f4, B:412:0x120a, B:413:0x1245, B:439:0x0c49, B:441:0x0c66, B:442:0x0ca9, B:446:0x0d2d, B:448:0x0d4a, B:449:0x0d88, B:453:0x0ac2, B:455:0x0add, B:456:0x0b15, B:468:0x08fc, B:470:0x0912, B:471:0x094f, B:479:0x05c3, B:481:0x05dd, B:482:0x0619), top: B:478:0x05c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x2c54  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x275d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x2791  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x2827  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x28d3  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x256d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x1fc2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x1ffc  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x2389  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x24cc  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x1cbd  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x19e3  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x1b02  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x1afe  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x1767  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x150c A[Catch: all -> 0x0636, TryCatch #10 {all -> 0x0636, blocks: (B:38:0x080b, B:40:0x0821, B:41:0x085a, B:50:0x0a36, B:52:0x0a57, B:53:0x0a97, B:60:0x0bdc, B:62:0x0bf8, B:63:0x0c39, B:69:0x0e36, B:71:0x0e50, B:72:0x0e8b, B:80:0x10c5, B:82:0x10df, B:83:0x1117, B:92:0x133d, B:94:0x135e, B:95:0x13bd, B:97:0x14fd, B:99:0x150c, B:100:0x1542, B:102:0x155e, B:103:0x1592, B:107:0x15b6, B:109:0x15c5, B:110:0x15ff, B:112:0x162b, B:113:0x1687, B:119:0x1968, B:121:0x1989, B:122:0x19ce, B:127:0x1c54, B:129:0x1c71, B:130:0x1cb3, B:139:0x1f35, B:141:0x1f56, B:142:0x1f95, B:148:0x24f9, B:150:0x2515, B:151:0x2551, B:159:0x26eb, B:161:0x270c, B:162:0x274a, B:175:0x29b1, B:178:0x2a0b, B:179:0x2ab0, B:184:0x2bf1, B:187:0x2c41, B:196:0x2def, B:198:0x2e10, B:199:0x2e53, B:206:0x30b3, B:208:0x30d0, B:209:0x3114, B:213:0x3125, B:215:0x3142, B:216:0x317f, B:220:0x324a, B:222:0x3267, B:223:0x32a6, B:234:0x2e7d, B:236:0x2ea2, B:237:0x2ef6, B:245:0x2c08, B:249:0x2cd0, B:252:0x2d20, B:253:0x2ce7, B:254:0x29d0, B:256:0x2a58, B:259:0x2aa9, B:260:0x2a73, B:294:0x25e2, B:296:0x25fe, B:297:0x2641, B:332:0x1cc2, B:334:0x1cd5, B:335:0x1d14, B:337:0x1d1e, B:339:0x1d31, B:340:0x1d6e, B:344:0x1def, B:346:0x1e0c, B:347:0x1e4c, B:372:0x168f, B:374:0x169e, B:375:0x16d1, B:377:0x16fd, B:378:0x175f, B:381:0x17d0, B:383:0x17df, B:384:0x1815, B:386:0x1841, B:387:0x189f, B:391:0x13f3, B:393:0x1415, B:394:0x1468, B:403:0x1126, B:405:0x113c, B:406:0x1176, B:410:0x11f4, B:412:0x120a, B:413:0x1245, B:439:0x0c49, B:441:0x0c66, B:442:0x0ca9, B:446:0x0d2d, B:448:0x0d4a, B:449:0x0d88, B:453:0x0ac2, B:455:0x0add, B:456:0x0b15, B:468:0x08fc, B:470:0x0912, B:471:0x094f, B:479:0x05c3, B:481:0x05dd, B:482:0x0619), top: B:478:0x05c3 }] */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object[] objArr;
        java.lang.Long valueOf2;
        java.lang.Object obj;
        java.lang.Class cls;
        java.lang.String str4;
        java.lang.Object invoke;
        java.lang.Object obj2;
        int intValue;
        java.lang.Object obj3;
        int intValue2;
        long j;
        android.content.Context baseContext;
        java.lang.String str5;
        java.lang.Object[] objArr2;
        int i;
        char c;
        java.lang.reflect.Method method;
        int i2;
        int i3;
        java.lang.String str6;
        long j2;
        android.content.Context baseContext2;
        java.lang.Integer num;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Object[] objArr3;
        java.lang.String str9;
        java.lang.Object[] objArr4;
        java.lang.Long valueOf3;
        java.lang.Class cls2;
        java.lang.Object obj4;
        int i4;
        long j3;
        android.content.Context baseContext3;
        java.lang.String str10;
        java.lang.Object[] objArr5;
        java.lang.Object[] objArr6;
        long j4;
        java.lang.String str11;
        java.lang.Integer num2;
        char c2;
        java.lang.Object[] objArr7;
        int i5;
        int i6;
        long j5;
        java.lang.Object obj5;
        java.lang.Object[] objArr8;
        char c3;
        int i7;
        int i8;
        java.lang.Object invoke2;
        getCiacDecline = (getGpoResponse + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        int threadPriority = android.os.Process.getThreadPriority(0);
        int i9 = threadPriority & 20;
        int i10 = -((((((threadPriority ^ 20) | i9) << 1) - (~(-((threadPriority | 20) & (~i9))))) - 1) >> 6);
        int i11 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i12 = -(-(i11 * (-963)));
        int i13 = i12 | (-964);
        int i14 = ((i13 << 1) - (~(-((~(i12 & (-964))) & i13)))) + 21229;
        int i15 = ~i11;
        int i16 = ~identityHashCode;
        int i17 = i16 & (-23);
        int i18 = (identityHashCode & 22) | i17;
        int i19 = identityHashCode & (-23);
        int i20 = ~((i19 ^ i18) | (i19 & i18));
        int i21 = i15 ^ i20;
        int i22 = i20 & i15;
        int i23 = -(-(((i22 ^ i21) | (i22 & i21)) * (-964)));
        int i24 = i14 & i23;
        int i25 = -(-((i23 ^ i14) | i24));
        int i26 = (i16 & 22) | ((~i16) & (-23));
        int i27 = (i26 ^ i17) | (i26 & i17);
        int i28 = i11 ^ (-23);
        int i29 = i11 & (-23);
        int i30 = (i29 ^ i28) | (i29 & i28);
        int indexOf = android.text.TextUtils.indexOf("", "", 0);
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        int i31 = (i24 - (~i25)) - 1;
        int i32 = ~i30;
        int i33 = (i30 | i32) & i32;
        int i34 = ~i27;
        a((char) ((i10 ^ 6462) + ((i10 & 6462) << 1)), i31 + ((i33 | (i34 & (i27 | i34))) * (-964)), indexOf, objArr9);
        java.lang.String str12 = (java.lang.String) objArr9[0];
        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i35 = maximumDrawingCacheSize * (-432);
        int i36 = (55118 & i35) + (i35 | 55118);
        int i37 = ~maximumDrawingCacheSize;
        int i38 = ~identityHashCode2;
        int i39 = i38 & (i38 | identityHashCode2);
        int i40 = (i39 ^ i37) | (i39 & i37);
        int i41 = (~((i40 ^ 127) | (i40 & 127))) * 433;
        int i42 = i36 & i41;
        int i43 = (i42 - (~(-(-((i36 ^ i41) | i42))))) - 1;
        int i44 = (i37 | maximumDrawingCacheSize) & i37;
        int i45 = identityHashCode2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        int i46 = identityHashCode2 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        int i47 = ~((i45 ^ i46) | (i46 & i45));
        int i48 = ((i44 ^ i47) | (i44 & i47)) * (-433);
        int i49 = i43 & i48;
        int i50 = i49 + ((i48 ^ i43) | i49);
        int i51 = i37 & identityHashCode2;
        int i52 = (identityHashCode2 | i37) & (~i51);
        int i53 = (i52 ^ i51) | (i52 & i51);
        int i54 = ~i53;
        int i55 = (i53 | i54) & i54;
        int i56 = maximumDrawingCacheSize & 127;
        int i57 = (maximumDrawingCacheSize | 127) & (~i56);
        int i58 = (i57 ^ i56) | (i57 & i56);
        int i59 = ~i58;
        int i60 = (i58 | i59) & i59;
        int i61 = i55 & i60;
        int i62 = (((i60 | i55) & (~i61)) | i61) * 433;
        int i63 = i50 ^ i62;
        int i64 = -(-((i62 & i50) << 1));
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b((i63 & i64) + (i64 | i63), null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr10);
        java.lang.String str13 = (java.lang.String) objArr10[0];
        char longPressTimeout = (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
        int i65 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
        int i66 = (i65 | 17) << 1;
        int i67 = -(((~i65) & 17) | (i65 & (-18)));
        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
        int identityHashCode3 = java.lang.System.identityHashCode(this);
        int i68 = (doubleTapTimeout * 399) + 15960;
        int i69 = ~doubleTapTimeout;
        int i70 = (i69 | doubleTapTimeout) & i69;
        int i71 = i70 & 40;
        int i72 = (~i71) & (i70 | 40);
        int i73 = ~((i72 ^ i71) | (i72 & i71));
        int i74 = doubleTapTimeout & (-41);
        int i75 = (~i74) & (doubleTapTimeout | (-41));
        int i76 = (i75 ^ i74) | (i74 & i75);
        int i77 = ~i76;
        int i78 = (i76 | i77) & i77;
        int i79 = i73 ^ i78;
        int i80 = i73 & i78;
        int i81 = (i79 ^ i80) | (i80 & i79);
        int i82 = ~identityHashCode3;
        int i83 = i82 & (-41);
        int i84 = i83 | (identityHashCode3 & 40);
        int i85 = identityHashCode3 & (-41);
        int i86 = ~((i84 ^ i85) | (i84 & i85));
        int i87 = i81 & i86;
        int i88 = (i81 | i86) & (~i87);
        int i89 = ((i88 ^ i87) | (i88 & i87)) * 398;
        int i90 = i68 ^ i89;
        int i91 = ((i89 & i68) | i90) << 1;
        int i92 = -i90;
        int i93 = (i91 & i92) + (i91 | i92);
        int i94 = -(~(-(-(((doubleTapTimeout ^ 40) | (doubleTapTimeout & 40)) * (-1194)))));
        int i95 = ((i93 & i94) + (i94 | i93)) - 1;
        int i96 = (i82 | (-41)) & (~i83);
        int i97 = (i96 ^ i83) | (i96 & i83);
        int i98 = ~i97;
        int i99 = (i97 | i98) & i98;
        int i100 = (i69 & (-41)) | ((~i69) & 40);
        int i101 = i69 & 40;
        int i102 = (i100 ^ i101) | (i101 & i100);
        int i103 = ~i102;
        int i104 = (i102 | i103) & i103;
        int i105 = ((~i104) & i99) | ((~i99) & i104);
        int i106 = i99 & i104;
        int i107 = (i106 ^ i105) | (i106 & i105);
        int i108 = ((~i77) & i107) | ((~i107) & i77);
        int i109 = i107 & i77;
        int i110 = -(-(((i109 ^ i108) | (i109 & i108)) * 398));
        int i111 = i95 & i110;
        int i112 = ((i95 ^ i110) | i111) << 1;
        int i113 = -((i110 | i95) & (~i111));
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(longPressTimeout, ((i66 | i67) << 1) - (i67 ^ i66), (i112 & i113) + (i113 | i112), objArr11);
        java.lang.String str14 = (java.lang.String) objArr11[0];
        int i114 = -((byte) android.view.KeyEvent.getModifierMetaStateMask());
        int identityHashCode4 = java.lang.System.identityHashCode(this);
        int i115 = i114 * 55;
        int i116 = (i115 & 107) + (i115 | 107);
        int i117 = ~i114;
        int i118 = ~i117;
        int i119 = ~((i118 ^ i117) | (i118 & i117));
        int i120 = ~identityHashCode4;
        int i121 = ~i120;
        int i122 = ~((i121 ^ i120) | (i121 & i120));
        int i123 = ((~i119) & i122) | ((~i122) & i119);
        int i124 = i119 & i122;
        int i125 = ((i124 ^ i123) | (i123 & i124)) * (-108);
        int i126 = ((((i116 ^ i125) | (i116 & i125)) << 1) - (~(-((i116 & (~i125)) | ((~i116) & i125))))) - 1;
        int i127 = i117 & identityHashCode4;
        int i128 = (~i127) & (i117 | identityHashCode4);
        int i129 = ~((i128 ^ i127) | (i127 & i128));
        int i130 = i129 & i117;
        int i131 = (i129 | i117) & (~i130);
        int i132 = (i131 ^ i130) | (i131 & i130);
        int i133 = i120 & (i120 | identityHashCode4);
        int i134 = (i114 & i133) | (i117 & i133) | ((~i133) & i114);
        int i135 = ~i134;
        int i136 = (i134 | i135) & i135;
        int i137 = ((~i136) & i132) | ((~i132) & i136);
        int i138 = i136 & i132;
        int i139 = -(~(-(-(((i138 ^ i137) | (i138 & i137)) * 54))));
        int i140 = (i126 & i139) + (i139 | i126);
        int i141 = (~i140) + (i140 << 1);
        int i142 = ((identityHashCode4 ^ i117) | i127) * 54;
        int i143 = i141 | i142;
        char c4 = (char) ((i143 << 1) - ((~(i141 & i142)) & i143));
        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
        int identityHashCode5 = java.lang.System.identityHashCode(this);
        int i144 = deadChar * 677;
        int i145 = (i144 | (-10800)) << 1;
        int i146 = -(i144 ^ (-10800));
        int i147 = (deadChar ^ identityHashCode5) | (deadChar & identityHashCode5);
        int i148 = ~deadChar;
        int i149 = i148 & (-17);
        int i150 = deadChar & 16;
        int i151 = ~((deadChar & (-17)) | i149 | i150);
        int i152 = ~identityHashCode5;
        int i153 = ~((i152 & (i152 | identityHashCode5)) | deadChar);
        int i154 = i151 & i153;
        int i155 = (i153 | i151) & (~i154);
        int i156 = (((((i145 | i146) << 1) - (i146 ^ i145)) + (((i147 & (-17)) | (i147 ^ (-17))) * (-676))) - (~(((i155 ^ i154) | (i155 & i154)) * 676))) - 1;
        int i157 = ~((i148 ^ (-17)) | i149);
        int i158 = i152 | (-17);
        int i159 = ~i158;
        int i160 = (i158 | i159) & i159;
        int i161 = ((~i160) & i157) | ((~i157) & i160);
        int i162 = i157 & i160;
        int i163 = (i162 ^ i161) | (i162 & i161);
        int i164 = (deadChar ^ 16) | i150;
        int i165 = ~((i164 ^ identityHashCode5) | (i164 & identityHashCode5));
        int i166 = -(-(((i163 ^ i165) | (i163 & i165)) * 676));
        int i167 = i156 & i166;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(c4, (i167 - (~(-(-((i166 ^ i156) | i167))))) - 1, 56 - (~(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))), objArr12);
        java.lang.String str15 = (java.lang.String) objArr12[0];
        int i168 = -android.view.MotionEvent.axisFromString("");
        int identityHashCode6 = java.lang.System.identityHashCode(this);
        int i169 = (i168 * (-494)) - 62244;
        int i170 = ~i168;
        int i171 = (i168 & androidx.compose.runtime.ComposerKt.defaultsKey) | (i170 & 126);
        int i172 = i168 & 126;
        int i173 = -(~((~((i171 ^ i172) | (i171 & i172))) * (-495)));
        int i174 = (-2) - (~((i169 & i173) + (i169 | i173)));
        int i175 = ~identityHashCode6;
        int i176 = ((~i175) & i168) | (i175 & i170);
        int i177 = i168 & i175;
        int i178 = (i177 ^ i176) | (i176 & i177);
        int i179 = i178 * 495;
        int i180 = i174 & i179;
        int i181 = (i179 | i174) & (~i180);
        int i182 = i180 << 1;
        int i183 = ((i181 | i182) << 1) - (i181 ^ i182);
        int i184 = i170 & androidx.compose.runtime.ComposerKt.defaultsKey;
        int i185 = (i170 | androidx.compose.runtime.ComposerKt.defaultsKey) & (~i184);
        int i186 = (i184 ^ i185) | (i185 & i184);
        int i187 = ~i186;
        int i188 = (i186 | i187) & i187;
        int i189 = ~i178;
        int i190 = ((i189 ^ i188) | (i189 & i188)) * 495;
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b((i183 & i190) + (i190 | i183), null, null, "\u0086\u0083\u0081\u008c\u0094\u0093\u0092\u0088\u0089\u0091\u0089\u0088\u0090\u008f\u008e\u0084\u0084\u0083\u008e\u0086\u0089\u008d\u008c\u0086\u008b\u0083", objArr13);
        java.lang.String str16 = (java.lang.String) objArr13[0];
        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
        int identityHashCode7 = java.lang.System.identityHashCode(this);
        int i191 = bitsPerPixel * 755;
        int i192 = i191 & (-753);
        int i193 = ((i191 | (-753)) & (~i192)) + (i192 << 1);
        int i194 = ~bitsPerPixel;
        int i195 = i194 & 1;
        int i196 = (i194 | 1) & (~i195);
        int i197 = (i196 ^ i195) | (i196 & i195);
        int i198 = ~i197;
        int i199 = (i197 | i198) & i198;
        int i200 = i194 ^ identityHashCode7;
        int i201 = i194 & identityHashCode7;
        int i202 = ~((i200 & i201) | (i200 ^ i201));
        int i203 = (i199 & i202) | (i199 ^ i202);
        int i204 = identityHashCode7 & 1;
        int i205 = ~(i204 | ((~i204) & (identityHashCode7 | 1)));
        int i206 = i203 & i205;
        int i207 = (((i203 | i205) & (~i206)) | i206) * (-754);
        int i208 = i193 ^ i207;
        int i209 = (i193 & i207) << 1;
        int i210 = (i208 & i209) + (i209 | i208);
        int i211 = i194 ^ 1;
        int i212 = (i211 ^ i195) | (i211 & i195);
        int i213 = i212 ^ identityHashCode7;
        int i214 = i212 & identityHashCode7;
        int i215 = ~((i214 ^ i213) | (i214 & i213));
        int i216 = ~identityHashCode7;
        int i217 = i216 & bitsPerPixel;
        int i218 = (bitsPerPixel | i216) & (~i217);
        int i219 = (i218 ^ i217) | (i218 & i217);
        int i220 = i219 & 1;
        int i221 = (i219 | 1) & (~i220);
        int i222 = ~((i221 ^ i220) | (i221 & i220));
        int i223 = ((~i222) & i215) | ((~i215) & i222);
        int i224 = i222 & i215;
        int i225 = -(~(((i224 ^ i223) | (i224 & i223)) * (-754)));
        char c5 = (char) ((((i210 & i225) + (i225 | i210)) - 1) + (((i216 & i194) | ((~i216) & i194) | ((~i194) & i216)) * 754));
        int i226 = -(~(-(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
        int i227 = -(~android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a(c5, ((i226 & 18) + (i226 | 18)) - 1, ((i227 ^ 23) + ((i227 & 23) << 1)) - 1, objArr14);
        java.lang.String str17 = (java.lang.String) objArr14[0];
        char blue = (char) android.graphics.Color.blue(0);
        int i228 = -android.text.TextUtils.indexOf("", "");
        int identityHashCode8 = java.lang.System.identityHashCode(this);
        int i229 = i228 * (-1939);
        int i230 = ((746194283 & i229) + (i229 | 746194283)) - 1;
        int i231 = 198277377 & i228;
        int i232 = (~i231) & (198277377 | i228);
        int i233 = (i231 ^ i232) | (i232 & i231);
        int i234 = ~i233;
        int i235 = (i233 | i234) & i234;
        int i236 = ~identityHashCode8;
        int i237 = ((-198277378) ^ i236) | ((-198277378) & i236);
        int i238 = ~i237;
        int i239 = (i237 | i238) & i238;
        int i240 = i235 & i239;
        int i241 = (i235 | i239) & (~i240);
        int i242 = ((i241 ^ i240) | (i241 & i240)) * (-970);
        int i243 = i230 & i242;
        int i244 = (((i230 ^ i242) | i243) << 1) - ((i242 | i230) & (~i243));
        int i245 = ~i228;
        int i246 = (i228 | i245) & i245;
        int i247 = (198277377 & i246) | ((~i246) & (-198277378));
        int i248 = i246 & (-198277378);
        int i249 = (i248 ^ i247) | (i248 & i247);
        int i250 = ~i249;
        int i251 = -(-(((i249 | i250) & i250) * 1940));
        int i252 = i244 & i251;
        int i253 = ((((i244 ^ i251) | i252) << 1) - (~(-((i251 | i244) & (~i252))))) - 1;
        int i254 = ((-198277378) & i245) | ((~i245) & 198277377);
        int i255 = i245 & 198277377;
        int i256 = (i254 ^ i255) | (i254 & i255);
        int i257 = ~i256;
        int i258 = (i256 | i257) & i257;
        int i259 = ~(((identityHashCode8 | i236) & i236) | (-198277378));
        int i260 = i258 ^ i259;
        int i261 = i258 & i259;
        int i262 = -(-(((i261 ^ i260) | (i261 & i260)) * 970));
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        c("︰⺆⫴ⷮ", blue, "ꒈ폾\uf4b8⥱똱Ș曜쟏揈磦\uf726ꐷ㽐둁脽㯣㻕嫄踻廥蠏本ጣ", "\u0000\u0000\u0000\u0000", (i253 ^ i262) + ((i262 & i253) << 1), objArr15);
        java.lang.String str18 = (java.lang.String) objArr15[0];
        super.onCreate();
        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.resolveSize(0, 0), 584 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (24291 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
        byte[] bArr = $$a;
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr16);
        long j6 = cls3.getField((java.lang.String) objArr16[0]).getLong(null);
        try {
            if (j6 != -1) {
                int i263 = getCiacDecline;
                int i264 = i263 ^ 107;
                int i265 = ((i263 & 107) | i264) << 1;
                int i266 = -i264;
                int i267 = (i265 ^ i266) + ((i265 & i266) << 1);
                getGpoResponse = i267 % 128;
                if (i267 % 2 != 0) {
                    str = str13;
                } else {
                    str = str13;
                }
            } else {
                str = str13;
            }
            android.content.Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                int i268 = getGpoResponse;
                int i269 = i268 & 33;
                int i270 = (i268 ^ 33) | i269;
                int i271 = (i269 & i270) + (i270 | i269);
                getCiacDecline = i271 % 128;
                baseContext4 = (android.content.Context) (i271 % 2 == 0 ? java.lang.Class.forName(str16).getMethod(str17, new java.lang.Class[1]) : java.lang.Class.forName(str16).getMethod(str17, new java.lang.Class[0])).invoke(null, null);
            }
            if (baseContext4 != null) {
                int i272 = getCiacDecline;
                int i273 = (i272 & 119) + (i272 | 119);
                getGpoResponse = i273 % 128;
                if (i273 % 2 != 0) {
                    baseContext4.getApplicationContext();
                    throw null;
                }
                baseContext4 = baseContext4.getApplicationContext();
            }
            int intValue3 = ((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue();
            int i274 = getGpoResponse;
            int i275 = i274 & 55;
            int i276 = (i274 | 55) & (~i275);
            int i277 = i275 << 1;
            getCiacDecline = ((i276 & i277) + (i276 | i277)) % 128;
            try {
                java.lang.Object[] objArr17 = {baseContext4, java.lang.Integer.valueOf(intValue3), 582360145};
                byte[] bArr2 = $$d;
                byte b = bArr2[49];
                java.lang.String str19 = str16;
                java.lang.String str20 = str17;
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                e(b, (short) (b | com.google.common.base.Ascii.VT), (byte) (-bArr2[64]), objArr18);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                byte b2 = (byte) ($$e | 54);
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                e(b2, (short) (b2 | 712), bArr2[607], objArr19);
                java.lang.Object[] objArr20 = (java.lang.Object[]) cls4.getMethod((java.lang.String) objArr19[0], java.lang.Class.forName(str18), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr17);
                if (baseContext4 != null) {
                    getGpoResponse = (getCiacDecline + 31) % 128;
                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 51, 584 - android.graphics.Color.alpha(0), (char) (24291 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    d(bArr[18], bArr[5], bArr[10], objArr21);
                    cls5.getField((java.lang.String) objArr21[0]).set(null, objArr20);
                    try {
                        long longValue = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.view.KeyEvent.getDeadChar(0, 0) + 584, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 24292));
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr22);
                        cls6.getField((java.lang.String) objArr22[0]).set(null, java.lang.Long.valueOf(longValue));
                        int i278 = getGpoResponse;
                        int i279 = (i278 | 117) << 1;
                        int i280 = -(i278 ^ 117);
                        getCiacDecline = ((i279 & i280) + (i280 | i279)) % 128;
                    } catch (java.lang.Exception unused) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                }
                java.lang.Object[] objArr23 = objArr20;
                int i281 = ((int[]) objArr23[1])[0];
                int i282 = ((int[]) objArr23[0])[0];
                if (i282 == i281) {
                    java.lang.Object[] objArr24 = {objArr23, java.lang.Integer.valueOf(((int[]) objArr23[3])[0]), 0};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                    if (obj6 == null) {
                        obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.graphics.Color.red(0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4830, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj6);
                    }
                    ((java.lang.reflect.Method) obj6).invoke(null, objArr24);
                    int i283 = getGpoResponse;
                    getCiacDecline = ((i283 ^ 57) + ((i283 & 57) << 1)) % 128;
                    str2 = str18;
                } else {
                    long j7 = ((~i281) & i282) | (i281 & (~i282));
                    int i284 = getGpoResponse;
                    getCiacDecline = ((i284 & 25) + (i284 | 25)) % 128;
                    int i285 = i284 & 39;
                    int i286 = (i284 | 39) & (~i285);
                    int i287 = i285 << 1;
                    getCiacDecline = ((i286 & i287) + (i286 | i287)) % 128;
                    try {
                        java.lang.Object[] objArr25 = {java.lang.Long.valueOf(j7 ^ (-4791764509565911040L)), -1115670127L};
                        byte b3 = $$d[49];
                        int i288 = $$e;
                        str2 = str18;
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        e(b3, (short) (b3 | 712), (byte) (i288 | 39), objArr26);
                        java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                        byte b4 = (byte) i288;
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        e(b4, (short) (b4 | 710), r3[121], objArr27);
                        cls7.getMethod((java.lang.String) objArr27[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr25);
                        java.lang.Object[] objArr28 = {objArr23, java.lang.Integer.valueOf(((int[]) objArr23[3])[0]), 0};
                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj7 == null) {
                            obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4829, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj7);
                        }
                        ((java.lang.reflect.Method) obj7).invoke(null, objArr28);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, 921 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.getOffsetBefore("", 0));
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr29);
                long j8 = cls8.getField((java.lang.String) objArr29[0]).getLong(null);
                if (j8 != -1) {
                    int i289 = getGpoResponse;
                    int i290 = ((i289 ^ 107) | (i289 & 107)) << 1;
                    int i291 = -((i289 & (-108)) | ((~i289) & 107));
                    int i292 = (i290 & i291) + (i291 | i290);
                    getCiacDecline = i292 % 128;
                    int i293 = i292 % 2 == 0 ? 0 : 0;
                }
                int intValue4 = ((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue();
                java.lang.Object[] objArr30 = {507892579};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                if (obj8 == null) {
                    obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 49, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 874, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 15955))).getDeclaredConstructor(java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj8);
                }
                java.lang.Object[] values$4956fc2a = com.payair.hce.readJsonFromLocalStorage.values$4956fc2a(intValue4, ((java.lang.reflect.Constructor) obj8).newInstance(objArr30));
                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, 922 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.os.Process.myTid() >> 22));
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                d(bArr[18], bArr[5], bArr[10], objArr31);
                cls9.getField((java.lang.String) objArr31[0]).set(null, values$4956fc2a);
                try {
                    long longValue2 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    char c6 = 1;
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 921 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr32);
                    char c7 = 0;
                    cls10.getField((java.lang.String) objArr32[0]).set(null, java.lang.Long.valueOf(longValue2));
                    int i294 = ((int[]) values$4956fc2a[c6])[c7];
                    if (((int[]) values$4956fc2a[c7])[c7] == i294) {
                        int i295 = getGpoResponse;
                        int i296 = i295 | 81;
                        int i297 = (i296 << 1) - ((~(i295 & 81)) & i296);
                        getCiacDecline = i297 % 128;
                        if (i297 % 2 == 0) {
                            java.lang.Object[] objArr33 = {values$4956fc2a, java.lang.Integer.valueOf(((int[]) values$4956fc2a[4])[1]), 0};
                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                            if (obj9 == null) {
                                obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 4860 - android.view.View.MeasureSpec.getSize(0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj9);
                            }
                            ((java.lang.reflect.Method) obj9).invoke(null, objArr33);
                        } else {
                            java.lang.Object[] objArr34 = {values$4956fc2a, java.lang.Integer.valueOf(((int[]) values$4956fc2a[3])[0]), 0};
                            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                            if (obj10 == null) {
                                obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 44, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4860, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj10);
                            }
                            ((java.lang.reflect.Method) obj10).invoke(null, objArr34);
                        }
                    } else {
                        new java.util.ArrayList().add((java.lang.String) values$4956fc2a[2]);
                        java.lang.Object[] objArr35 = {java.lang.Long.valueOf(((i294 & (~r5)) | ((~i294) & r5)) ^ 6309072078947483648L), 1468945315L};
                        byte b5 = $$d[49];
                        int i298 = $$e;
                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                        e(b5, (short) (i298 | 699), r4[524], objArr36);
                        java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr36[0]);
                        byte b6 = (byte) i298;
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        e(b6, (short) (b6 | 710), r4[121], objArr37);
                        cls11.getMethod((java.lang.String) objArr37[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr35);
                        java.lang.Object[] objArr38 = {values$4956fc2a, java.lang.Integer.valueOf(((int[]) values$4956fc2a[3])[0]), 0};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                        if (obj11 == null) {
                            obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 4860 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj11);
                        }
                        ((java.lang.reflect.Method) obj11).invoke(null, objArr38);
                    }
                    valueOf = getApplicationContext();
                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 52, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 536, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 24291));
                    byte b7 = bArr[18];
                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                    d(b7, b7, (short) 24, objArr39);
                    long j9 = cls12.getField((java.lang.String) objArr39[0]).getLong(null);
                    if (j9 == -1 || j9 + 1990 < ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                        android.content.Context baseContext5 = getBaseContext();
                        if (baseContext5 == null) {
                            int i299 = getCiacDecline;
                            getGpoResponse = ((i299 & 97) + (i299 | 97)) % 128;
                            str3 = str20;
                            baseContext5 = (android.content.Context) java.lang.Class.forName(str19).getMethod(str3, new java.lang.Class[0]).invoke(null, null);
                        } else {
                            str3 = str20;
                        }
                        if (baseContext5 != null) {
                            baseContext5 = baseContext5.getApplicationContext();
                        }
                        java.lang.Object[] objArr40 = {baseContext5, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue()), 1801888059};
                        byte[] bArr3 = $$d;
                        byte b8 = bArr3[49];
                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                        e(b8, (short) (b8 | 648), bArr3[8], objArr41);
                        java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr41[0]);
                        byte b9 = bArr3[30];
                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                        e(b9, (short) (b9 | 622), bArr3[17], objArr42);
                        java.lang.Object[] objArr43 = (java.lang.Object[]) cls13.getMethod((java.lang.String) objArr42[0], java.lang.Class.forName(str2), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr40);
                        if (baseContext5 != null) {
                            int i300 = getCiacDecline;
                            int i301 = (i300 & (-80)) | ((~i300) & 79);
                            int i302 = -(-((i300 & 79) << 1));
                            int i303 = (i301 ^ i302) + ((i302 & i301) << 1);
                            getGpoResponse = i303 % 128;
                            try {
                                if (i303 % 2 != 0) {
                                    java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 51, 584 - android.view.View.resolveSize(0, 0), (char) (24290 - android.os.Process.getGidForName("")));
                                    byte b10 = bArr[5];
                                    byte b11 = bArr[60];
                                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                                    d(b10, b11, (byte) (b11 | com.google.common.base.Ascii.CAN), objArr44);
                                    cls14.getField((java.lang.String) objArr44[0]).set(null, objArr43);
                                    valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue());
                                    cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 51, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 583, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24290));
                                    byte b12 = bArr[18];
                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                    d(b12, b12, (short) 24, objArr45);
                                    obj = objArr45[0];
                                } else {
                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 51, 583 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 24291));
                                    byte b13 = bArr[5];
                                    byte b14 = bArr[60];
                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                    d(b13, b14, (byte) (b14 | com.google.common.base.Ascii.CAN), objArr46);
                                    cls15.getField((java.lang.String) objArr46[0]).set(null, objArr43);
                                    valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 584 - android.graphics.Color.green(0), (char) (24291 - android.view.KeyEvent.getDeadChar(0, 0)));
                                    byte b15 = bArr[18];
                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                    d(b15, b15, (short) 24, objArr47);
                                    obj = objArr47[0];
                                    cls = cls16;
                                }
                                cls.getField((java.lang.String) obj).set(null, valueOf2);
                                int i304 = getGpoResponse;
                                getCiacDecline = ((i304 & 77) + (i304 | 77)) % 128;
                            } catch (java.lang.Exception unused2) {
                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                            }
                        }
                        objArr = objArr43;
                    } else {
                        getCiacDecline = (getGpoResponse + 9) % 128;
                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.widget.ExpandableListView.getPackedPositionChild(0L) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) (24292 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        byte b16 = bArr[5];
                        byte b17 = bArr[60];
                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                        d(b16, b17, (byte) (b17 | com.google.common.base.Ascii.CAN), objArr48);
                        java.lang.Object[] objArr49 = {cls17.getField((java.lang.String) objArr48[0]).get(null), 1801888059, 0};
                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj12 == null) {
                            obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4830, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj12);
                        }
                        objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj12).invoke(null, objArr49);
                        str3 = str20;
                    }
                    int i305 = ((int[]) objArr[1])[0];
                    if (((int[]) objArr[0])[0] == i305) {
                        int i306 = getGpoResponse + 101;
                        getCiacDecline = i306 % 128;
                        if (i306 % 2 == 0) {
                            java.lang.Object[] objArr50 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[3])[0]), 1};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                            if (obj13 == null) {
                                obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4831, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj13);
                            }
                            ((java.lang.reflect.Method) obj13).invoke(null, objArr50);
                        } else {
                            java.lang.Object[] objArr51 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[3])[0]), 0};
                            java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                            if (obj14 == null) {
                                obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 4830, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj14);
                            }
                            ((java.lang.reflect.Method) obj14).invoke(null, objArr51);
                        }
                        str4 = str3;
                    } else {
                        java.lang.Object[] objArr52 = {java.lang.Long.valueOf((i305 ^ r7) ^ (-6241680623279276032L)), -1453254513L};
                        byte[] bArr4 = $$d;
                        byte b18 = bArr4[49];
                        int i307 = $$e;
                        str4 = str3;
                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                        e(b18, (short) (i307 | 618), bArr4[237], objArr53);
                        java.lang.Class<?> cls18 = java.lang.Class.forName((java.lang.String) objArr53[0]);
                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                        e((byte) (-bArr4[156]), (short) (i307 | 578), bArr4[843], objArr54);
                        cls18.getMethod((java.lang.String) objArr54[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr52);
                        java.lang.Object[] objArr55 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[3])[0]), 0};
                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj15 == null) {
                            obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30, android.widget.ExpandableListView.getPackedPositionChild(0L) + 4831, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj15);
                        }
                        ((java.lang.reflect.Method) obj15).invoke(null, objArr55);
                        int i308 = getGpoResponse;
                        int i309 = (i308 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i308) & 109);
                        int i310 = (i308 & 109) << 1;
                        getCiacDecline = ((i309 & i310) + (i310 | i309)) % 128;
                    }
                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 755, (char) (45560 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)));
                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr56);
                    long j10 = cls19.getField((java.lang.String) objArr56[0]).getLong(null);
                    try {
                        try {
                            if (j10 != -1) {
                                int i311 = getCiacDecline;
                                int i312 = (((i311 ^ 7) | (i311 & 7)) << 1) - ((i311 & (-8)) | ((~i311) & 7));
                                getGpoResponse = i312 % 128;
                                if (i312 % 2 == 0 ? j10 + 4611686018427387847L >= ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j10 / 4611686018427387847L >= ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue()) {
                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46, 754 - android.view.KeyEvent.keyCodeFromString(""), (char) (45560 - android.view.KeyEvent.normalizeMetaState(0)));
                                    byte b19 = bArr[5];
                                    byte b20 = bArr[60];
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    d(b19, b20, (byte) (b20 | com.google.common.base.Ascii.CAN), objArr57);
                                    java.lang.Object[] objArr58 = {cls20.getField((java.lang.String) objArr57[0]).get(null), -716062618, 0};
                                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                    if (obj16 == null) {
                                        obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 40, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 4791, (char) (31152 - android.text.TextUtils.indexOf("", "")))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 4750 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (33701 - (android.os.Process.myTid() >> 22))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj16);
                                    }
                                    invoke = ((java.lang.reflect.Method) obj16).invoke(null, objArr58);
                                    int i313 = getCiacDecline;
                                    int i314 = i313 & 29;
                                    getGpoResponse = ((i314 - (~((i313 ^ 29) | i314))) - 1) % 128;
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                    if (obj2 == null) {
                                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4749, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 33701))).getMethod("values", null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj2);
                                    }
                                    intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(invoke, null)).intValue();
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.indexOf("", "", 0, 0), 4749 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33701))).getMethod("DigitizedCardProfile", null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj3);
                                    }
                                    intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(invoke, null)).intValue();
                                    if (intValue2 != intValue) {
                                        int i315 = getGpoResponse;
                                        int i316 = i315 & 9;
                                        int i317 = (i316 - (~(-(-((i315 ^ 9) | i316))))) - 1;
                                        getCiacDecline = i317 % 128;
                                        if (i317 % 2 == 0) {
                                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                            if (obj17 == null) {
                                                obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 40, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4749, (char) (33701 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))).getMethod("valueOf", null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj17);
                                            }
                                            java.lang.Object[] objArr59 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(invoke, null)).intValue()), 0};
                                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                            if (obj18 == null) {
                                                obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 40, 4790 - android.graphics.Color.red(0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 31153))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 40, android.view.MotionEvent.axisFromString("") + 4751, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj18);
                                            }
                                            ((java.lang.reflect.Method) obj18).invoke(null, objArr59);
                                        } else {
                                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                            if (obj19 == null) {
                                                obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 40, 4750 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33702))).getMethod("valueOf", null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj19);
                                            }
                                            java.lang.Object[] objArr60 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(invoke, null)).intValue()), 0};
                                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                            if (obj20 == null) {
                                                obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, android.view.View.MeasureSpec.getMode(0) + 4790, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31151))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40, 4750 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33700)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj20);
                                            }
                                            ((java.lang.reflect.Method) obj20).invoke(null, objArr60);
                                        }
                                    } else {
                                        int i318 = (~intValue2) & intValue;
                                        int i319 = (~intValue) & intValue2;
                                        java.lang.Object[] objArr61 = {java.lang.Long.valueOf(((i319 ^ i318) | (i319 & i318)) ^ (-242632185838829568L)), -56494256L};
                                        byte b21 = $$d[49];
                                        int i320 = $$e;
                                        short s = (short) (i320 | 559);
                                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                                        e(b21, s, (byte) (s & 247), objArr62);
                                        java.lang.Class<?> cls21 = java.lang.Class.forName((java.lang.String) objArr62[0]);
                                        byte b22 = (byte) i320;
                                        java.lang.Object[] objArr63 = new java.lang.Object[1];
                                        e(b22, (short) (b22 | 710), r4[121], objArr63);
                                        cls21.getMethod((java.lang.String) objArr63[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr61);
                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                        if (obj21 == null) {
                                            obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4750, (char) (33701 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))).getMethod("valueOf", null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj21);
                                        }
                                        java.lang.Object[] objArr64 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(invoke, null)).intValue()), 0};
                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                        if (obj22 == null) {
                                            obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 40, android.graphics.Color.alpha(0) + 4790, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 31151))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.green(0), android.text.TextUtils.indexOf("", "", 0, 0) + 4750, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj22);
                                        }
                                        ((java.lang.reflect.Method) obj22).invoke(null, objArr64);
                                    }
                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 667 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (40025 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr65);
                                    j = cls22.getField((java.lang.String) objArr65[0]).getLong(null);
                                    if (j != -1) {
                                        int i321 = getCiacDecline;
                                        int i322 = i321 ^ 89;
                                        int i323 = -(-((i321 & 89) << 1));
                                        getGpoResponse = ((i322 ^ i323) + ((i323 & i322) << 1)) % 128;
                                        if (j + 4611686018427387811L >= ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                            int i324 = getGpoResponse;
                                            int i325 = i324 & 97;
                                            int i326 = (i324 | 97) & (~i325);
                                            int i327 = -(-(i325 << 1));
                                            getCiacDecline = ((i326 & i327) + (i326 | i327)) % 128;
                                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.View.getDefaultSize(0, 0) + 667, (char) (40023 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                            byte b23 = bArr[18];
                                            java.lang.Object[] objArr66 = new java.lang.Object[1];
                                            d(b23, b23, (short) 24, objArr66);
                                            java.lang.Object[] objArr67 = {cls23.getField((java.lang.String) objArr66[0]).get(null), -97545953, 0};
                                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                            if (obj23 == null) {
                                                obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4684, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj23);
                                            }
                                            objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj23).invoke(null, objArr67);
                                            str5 = str4;
                                            c = 1;
                                            i = 0;
                                            i2 = ((int[]) objArr2[c])[i];
                                            i3 = ((int[]) objArr2[i])[i];
                                            if (i3 == i2) {
                                                int i328 = ((int[]) objArr2[4])[i];
                                                java.lang.Object[] objArr68 = new java.lang.Object[3];
                                                objArr68[2] = 0;
                                                objArr68[1] = java.lang.Integer.valueOf(i328);
                                                objArr68[i] = objArr2;
                                                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                if (obj24 == null) {
                                                    obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i, i) + 34, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 4684, (char) ((-16777216) - android.graphics.Color.rgb(i, i, i)))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj24);
                                                }
                                                ((java.lang.reflect.Method) obj24).invoke(null, objArr68);
                                                str6 = "valueOf";
                                            } else {
                                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                                java.lang.Object[] objArr69 = {objArr2};
                                                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                                if (obj25 == null) {
                                                    str6 = "valueOf";
                                                    obj25 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 4684, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("values", java.lang.Object[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj25);
                                                } else {
                                                    str6 = "valueOf";
                                                }
                                                arrayList.add(((java.lang.reflect.Method) obj25).invoke(null, objArr69));
                                                java.lang.Object[] objArr70 = {objArr2};
                                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                                if (obj26 == null) {
                                                    obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4684 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod("writeReplace", java.lang.Object[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj26);
                                                }
                                                arrayList.add(((java.lang.reflect.Method) obj26).invoke(null, objArr70));
                                                int i329 = i2 & i3;
                                                java.lang.Object[] objArr71 = {java.lang.Long.valueOf((((i2 ^ i3) | i329) & (~i329)) ^ (-337592053032550400L)), -78601767L};
                                                byte[] bArr5 = $$d;
                                                byte b24 = bArr5[49];
                                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                e(b24, (short) (b24 | 456), bArr5[25], objArr72);
                                                java.lang.Class<?> cls24 = java.lang.Class.forName((java.lang.String) objArr72[0]);
                                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                e((byte) (-bArr5[156]), (short) ($$e | 578), bArr5[843], objArr73);
                                                cls24.getMethod((java.lang.String) objArr73[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr71);
                                                java.lang.Object[] objArr74 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[4])[0]), 0};
                                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                if (obj27 == null) {
                                                    obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 4684 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj27);
                                                }
                                                ((java.lang.reflect.Method) obj27).invoke(null, objArr74);
                                            }
                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 429, (char) (31610 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                            java.lang.Object[] objArr75 = new java.lang.Object[1];
                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr75);
                                            j2 = cls25.getField((java.lang.String) objArr75[0]).getLong(null);
                                            if (j2 != -1) {
                                                int i330 = getCiacDecline;
                                                int i331 = ((i330 & 92) + (i330 | 92)) - 1;
                                                getGpoResponse = i331 % 128;
                                                if (i331 % 2 == 0 ? j2 + 4611686018427387815L >= ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : (j2 ^ 4611686018427387815L) >= ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                    int i332 = getCiacDecline;
                                                    getGpoResponse = (((i332 & 62) + (i332 | 62)) - 1) % 128;
                                                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 28, android.text.TextUtils.indexOf("", "") + 429, (char) (31610 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)));
                                                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                    d(bArr[18], bArr[5], bArr[10], objArr76);
                                                    java.lang.Object[] objArr77 = {cls26.getField((java.lang.String) objArr76[0]).get(null), 1395076823, 0};
                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                                    if (obj28 == null) {
                                                        obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 33, 4617 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj28);
                                                    }
                                                    objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) obj28).invoke(null, objArr77);
                                                    int i333 = getGpoResponse;
                                                    int i334 = (i333 & (-60)) | ((~i333) & 59);
                                                    int i335 = (i333 & 59) << 1;
                                                    getCiacDecline = ((i334 ^ i335) + ((i335 & i334) << 1)) % 128;
                                                    num = 994792440;
                                                    str7 = str15;
                                                    str8 = str5;
                                                    str9 = str;
                                                    objArr3 = objArr4;
                                                    i4 = ((int[]) objArr3[1])[0];
                                                    if (((int[]) objArr3[0])[0] == i4) {
                                                        int i336 = getGpoResponse;
                                                        getCiacDecline = ((-2) - (~((i336 ^ 48) + ((i336 & 48) << 1)))) % 128;
                                                        java.lang.Object[] objArr78 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[2])[0]), 0};
                                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                                        if (obj29 == null) {
                                                            obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 33, 4619 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.graphics.Color.alpha(0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj29);
                                                        }
                                                        ((java.lang.reflect.Method) obj29).invoke(null, objArr78);
                                                        int i337 = getGpoResponse;
                                                        int i338 = i337 & 39;
                                                        int i339 = -(-((i337 ^ 39) | i338));
                                                        getCiacDecline = (((i338 | i339) << 1) - (i339 ^ i338)) % 128;
                                                    } else {
                                                        java.lang.Object[] objArr79 = {java.lang.Long.valueOf(((i4 | r5) & (~(i4 & r5))) ^ 4830048215954882560L), 1124583171L};
                                                        byte b25 = $$d[49];
                                                        int i340 = $$e;
                                                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                        e(b25, (short) (i340 | 394), r2[91], objArr80);
                                                        java.lang.Class<?> cls27 = java.lang.Class.forName((java.lang.String) objArr80[0]);
                                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                        e(r2[30], (short) (i340 | 400), r2[279], objArr81);
                                                        cls27.getMethod((java.lang.String) objArr81[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr79);
                                                        java.lang.Object[] objArr82 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[2])[0]), 0};
                                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                                                        if (obj30 == null) {
                                                            obj30 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32, 4618 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj30);
                                                        }
                                                        ((java.lang.reflect.Method) obj30).invoke(null, objArr82);
                                                    }
                                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 48, 1581 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.getDefaultSize(0, 0));
                                                    byte b26 = bArr[18];
                                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                    d(b26, b26, (short) 24, objArr83);
                                                    j3 = cls28.getField((java.lang.String) objArr83[0]).getLong(null);
                                                    if (j3 != -1) {
                                                        int i341 = getGpoResponse;
                                                        int i342 = i341 & 45;
                                                        int i343 = (i341 ^ 45) | i342;
                                                        getCiacDecline = (((i342 | i343) << 1) - (i343 ^ i342)) % 128;
                                                        if (j3 + 4611686018427387837L >= ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                            java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 48, 1581 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0));
                                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr84);
                                                            java.lang.Object[] objArr85 = {cls29.getField((java.lang.String) objArr84[0]).get(null), 288072051, 0};
                                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                                            if (obj31 == null) {
                                                                obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4905, (char) android.graphics.Color.alpha(0))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj31);
                                                            }
                                                            objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) obj31).invoke(null, objArr85);
                                                            str10 = str7;
                                                            objArr5 = objArr6;
                                                            if (((int[]) objArr5[0])[0] != ((int[]) objArr5[1])[0]) {
                                                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                                arrayList2.add((java.lang.String) objArr5[2]);
                                                                arrayList2.add((java.lang.String) objArr5[3]);
                                                            }
                                                            this.DigitizedCardProfile = new com.payair.hce.setRight(valueOf);
                                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 51, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 584, (char) (24291 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                                            java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr86);
                                                            j4 = cls30.getField((java.lang.String) objArr86[0]).getLong(null);
                                                            if (j4 != -1 || j4 + 1999 < ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                str11 = str6;
                                                                num2 = num;
                                                                java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str10, java.lang.Object.class).invoke(null, this)).intValue()), -1129287178};
                                                                byte[] bArr6 = $$d;
                                                                byte b27 = bArr6[49];
                                                                int i344 = $$e;
                                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                e(b27, (short) (i344 | 303), (byte) (-bArr6[64]), objArr88);
                                                                java.lang.Class<?> cls31 = java.lang.Class.forName((java.lang.String) objArr88[0]);
                                                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                                e((byte) (-bArr6[156]), (short) (i344 | 578), bArr6[843], objArr89);
                                                                java.lang.Object[] objArr90 = (java.lang.Object[]) cls31.getMethod((java.lang.String) objArr89[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr87);
                                                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 584 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (24291 - android.text.TextUtils.getTrimmedLength("")));
                                                                byte b28 = (byte) (-bArr[17]);
                                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                d(b28, b28, (short) 75, objArr91);
                                                                cls32.getField((java.lang.String) objArr91[0]).set(null, objArr90);
                                                                try {
                                                                    long longValue3 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                    c2 = 0;
                                                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 52, 584 - android.view.View.resolveSize(0, 0), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24291));
                                                                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr92);
                                                                    cls33.getField((java.lang.String) objArr92[0]).set(null, java.lang.Long.valueOf(longValue3));
                                                                    objArr7 = objArr90;
                                                                    i5 = 1;
                                                                } catch (java.lang.Exception unused3) {
                                                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                }
                                                            } else {
                                                                int i345 = getCiacDecline;
                                                                int i346 = i345 | 25;
                                                                int i347 = i346 << 1;
                                                                int i348 = -((~(i345 & 25)) & i346);
                                                                int i349 = (i347 ^ i348) + ((i348 & i347) << 1);
                                                                getGpoResponse = i349 % 128;
                                                                if (i349 % 2 != 0) {
                                                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.combineMeasuredStates(0, 0), android.view.View.MeasureSpec.getMode(0) + 584, (char) (24291 - android.text.TextUtils.getCapsMode("", 0, 0)));
                                                                    byte b29 = (byte) (-bArr[17]);
                                                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                                    d(b29, b29, (short) 75, objArr93);
                                                                    java.lang.Object[] objArr94 = {cls34.getField((java.lang.String) objArr93[0]).get(null), -1129287178, 0};
                                                                    num2 = num;
                                                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                                    if (obj32 != null) {
                                                                        str11 = str6;
                                                                    } else {
                                                                        str11 = str6;
                                                                        obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 4830, (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj32);
                                                                    }
                                                                    invoke2 = ((java.lang.reflect.Method) obj32).invoke(null, objArr94);
                                                                } else {
                                                                    str11 = str6;
                                                                    num2 = num;
                                                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 51, 585 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (24291 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                                                                    byte b30 = (byte) (-bArr[17]);
                                                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                    d(b30, b30, (short) 75, objArr95);
                                                                    java.lang.Object[] objArr96 = {cls35.getField((java.lang.String) objArr95[0]).get(null), -1129287178, 0};
                                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                                    if (obj33 == null) {
                                                                        obj33 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 30, android.text.TextUtils.indexOf("", "", 0, 0) + 4830, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj33);
                                                                    }
                                                                    invoke2 = ((java.lang.reflect.Method) obj33).invoke(null, objArr96);
                                                                }
                                                                objArr7 = (java.lang.Object[]) invoke2;
                                                                i5 = 1;
                                                                c2 = 0;
                                                            }
                                                            i6 = ((int[]) objArr7[i5])[c2];
                                                            if (((int[]) objArr7[c2])[c2] == i6) {
                                                                int i350 = getCiacDecline;
                                                                int i351 = (i350 | 55) << i5;
                                                                int i352 = -(i350 ^ 55);
                                                                getGpoResponse = (((i351 | i352) << i5) - (i352 ^ i351)) % 128;
                                                                java.lang.Object[] objArr97 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[0]), 0};
                                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                                if (obj34 == null) {
                                                                    obj34 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) + 4830, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj34);
                                                                }
                                                                ((java.lang.reflect.Method) obj34).invoke(null, objArr97);
                                                                int i353 = getCiacDecline;
                                                                getGpoResponse = ((i353 & 25) + (i353 | 25)) % 128;
                                                            } else {
                                                                new java.util.ArrayList().add((java.lang.String) objArr7[2]);
                                                                java.lang.Object[] objArr98 = {java.lang.Long.valueOf((i6 ^ r11) ^ 4743665445695913984L), 1104470663L};
                                                                byte b31 = $$d[49];
                                                                int i354 = $$e;
                                                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                e(b31, (short) (i354 | 270), r10[607], objArr99);
                                                                java.lang.Class<?> cls36 = java.lang.Class.forName((java.lang.String) objArr99[0]);
                                                                byte b32 = (byte) (54 | i354);
                                                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                e(b32, (short) (b32 | 712), r10[607], objArr100);
                                                                cls36.getMethod((java.lang.String) objArr100[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr98);
                                                                java.lang.Object[] objArr101 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[3])[0]), 0};
                                                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                                                if (obj35 == null) {
                                                                    obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 4830, (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod(str11, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj35);
                                                                }
                                                                ((java.lang.reflect.Method) obj35).invoke(null, objArr101);
                                                            }
                                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), 707 - android.view.KeyEvent.keyCodeFromString(""), (char) (34283 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                            byte b33 = bArr[18];
                                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                            d(b33, b33, (short) 24, objArr102);
                                                            j5 = cls37.getField((java.lang.String) objArr102[0]).getLong(null);
                                                            try {
                                                                if (j5 != -1) {
                                                                    int i355 = getCiacDecline;
                                                                    int i356 = ((i355 & 103) - (~(-(-(i355 | 103))))) - 1;
                                                                    getGpoResponse = i356 % 128;
                                                                    if (i356 % 2 == 0 ? j5 + 1947 >= ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : (j5 & 1947) >= ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                        java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.getTrimmedLength(""), android.graphics.Color.blue(0) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - android.text.TextUtils.getTrimmedLength("")));
                                                                        byte b34 = bArr[5];
                                                                        byte b35 = bArr[60];
                                                                        java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                        d(b34, b35, (byte) (b35 | com.google.common.base.Ascii.CAN), objArr103);
                                                                        java.lang.Object[] objArr104 = {cls38.getField((java.lang.String) objArr103[0]).get(null), 443976614, 0};
                                                                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                        if (obj36 == null) {
                                                                            obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 4717, (char) (android.os.Process.myPid() >> 22))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj36);
                                                                        }
                                                                        objArr8 = (java.lang.Object[]) ((java.lang.reflect.Method) obj36).invoke(null, objArr104);
                                                                        c3 = 1;
                                                                        i7 = ((int[]) objArr8[c3])[0];
                                                                        i8 = ((int[]) objArr8[0])[0];
                                                                        if (i8 == i7) {
                                                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                            arrayList3.add((java.lang.String) objArr8[2]);
                                                                            arrayList3.add((java.lang.String) objArr8[3]);
                                                                            arrayList3.add((java.lang.String) objArr8[4]);
                                                                            arrayList3.add((java.lang.String) objArr8[5]);
                                                                            arrayList3.add((java.lang.String) objArr8[6]);
                                                                            arrayList3.add((java.lang.String) objArr8[7]);
                                                                            arrayList3.add((java.lang.String) objArr8[8]);
                                                                            int i357 = (~i8) & i7;
                                                                            int i358 = (~i7) & i8;
                                                                            java.lang.Object[] objArr105 = {java.lang.Long.valueOf(((i358 ^ i357) | (i358 & i357)) ^ 8993634618443825152L), 2093993736L};
                                                                            byte b36 = $$d[49];
                                                                            int i359 = $$e;
                                                                            java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                            e(b36, (short) (i359 | 236), r2[155], objArr106);
                                                                            java.lang.Class<?> cls39 = java.lang.Class.forName((java.lang.String) objArr106[0]);
                                                                            byte b37 = (byte) i359;
                                                                            java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                            e(b37, (short) (b37 | 710), r2[121], objArr107);
                                                                            cls39.getMethod((java.lang.String) objArr107[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr105);
                                                                            java.lang.Object[] objArr108 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[9])[0]), 0};
                                                                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                            if (obj37 == null) {
                                                                                obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.widget.ExpandableListView.getPackedPositionChild(0L) + 4718, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj37);
                                                                            }
                                                                            ((java.lang.reflect.Method) obj37).invoke(null, objArr108);
                                                                            return;
                                                                        }
                                                                        int identityHashCode9 = java.lang.System.identityHashCode(this);
                                                                        int i360 = ~identityHashCode9;
                                                                        int i361 = 1665131468 & identityHashCode9;
                                                                        int i362 = ((-1665131469) & i360) | i361;
                                                                        int i363 = (-1665131469) & identityHashCode9;
                                                                        int i364 = ~((i362 ^ i363) | (i363 & i362));
                                                                        int i365 = 1126449160 ^ i364;
                                                                        int i366 = i364 & 1126449160;
                                                                        int i367 = (i366 ^ i365) | (i366 & i365);
                                                                        int i368 = ~(((-1264868393) & identityHashCode9) | ((-1264868393) ^ identityHashCode9));
                                                                        int i369 = ((~i368) & i367) | ((~i367) & i368);
                                                                        int i370 = i367 & i368;
                                                                        int i371 = 54531763 - (~(((i370 ^ i369) | (i370 & i369)) * (-880)));
                                                                        int i372 = (i360 | identityHashCode9) & i360;
                                                                        int i373 = (-1665131469) & i372;
                                                                        int i374 = (i372 | (-1665131469)) & (~i373);
                                                                        int i375 = ~((i374 ^ i373) | (i374 & i373));
                                                                        int i376 = ((~i375) & 1264868392) | ((-1264868393) & i375);
                                                                        int i377 = i375 & 1264868392;
                                                                        int i378 = (i377 ^ i376) | (i377 & i376);
                                                                        int i379 = (i360 & 1665131468) | i363 | i361;
                                                                        int i380 = ~i379;
                                                                        int i381 = (i379 | i380) & i380;
                                                                        int i382 = i378 & i381;
                                                                        int i383 = -(-((((i381 | i378) & (~i382)) | i382) * (-880)));
                                                                        int i384 = ((((i371 ^ i383) | (i371 & i383)) << 1) - (~(-(((~i383) & i371) | ((~i371) & i383))))) - 1;
                                                                        int i385 = -(-((~((identityHashCode9 ^ 1665131468) | i361)) * 880));
                                                                        int i386 = i384 & i385;
                                                                        int identityHashCode10 = java.lang.System.identityHashCode(this);
                                                                        int i387 = ~identityHashCode10;
                                                                        int i388 = (-1407619980) & i387;
                                                                        int i389 = ((-1407619980) | i387) & (~i388);
                                                                        int i390 = ~((i388 ^ i389) | (i389 & i388) | (-554714066));
                                                                        int i391 = ~(((-537935953) & identityHashCode10) | ((-537935953) ^ identityHashCode10));
                                                                        int i392 = ((i390 ^ i391) | (i390 & i391)) * (-302);
                                                                        int i393 = -(-((~((i387 & (-16778114)) | (16778113 & identityHashCode10) | ((-16778114) & identityHashCode10))) * (-604)));
                                                                        int i394 = (-554714066) ^ identityHashCode10;
                                                                        int i395 = identityHashCode10 & (-554714066);
                                                                        int i396 = (i395 ^ i394) | (i395 & i394);
                                                                        int i397 = ~i396;
                                                                        int i398 = (i396 | i397) & i397;
                                                                        if (i386 + ((i385 ^ i384) | i386) > (((((772300655 & i392) + (772300655 | i392)) - (~i393)) - 1) - (~(-(-((((-1945555932) & i398) | (i398 ^ (-1945555932))) * 302))))) - 1) {
                                                                            java.lang.Object[] objArr109 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[121])[0]), 0};
                                                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                            if (obj38 == null) {
                                                                                obj38 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 33, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4718, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj38);
                                                                            }
                                                                            ((java.lang.reflect.Method) obj38).invoke(null, objArr109);
                                                                        } else {
                                                                            java.lang.Object[] objArr110 = {objArr8, java.lang.Integer.valueOf(((int[]) objArr8[9])[0]), 0};
                                                                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                            if (obj39 == null) {
                                                                                obj39 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('Q' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 4716 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.getDefaultSize(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj39);
                                                                            }
                                                                            ((java.lang.reflect.Method) obj39).invoke(null, objArr110);
                                                                        }
                                                                        int i399 = getGpoResponse;
                                                                        int i400 = i399 ^ 93;
                                                                        getCiacDecline = (((((i399 & 93) | i400) << 1) - (~(-i400))) - 1) % 128;
                                                                        return;
                                                                    }
                                                                }
                                                                long longValue4 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 47, 707 - android.graphics.Color.red(0), (char) (android.view.View.getDefaultSize(0, 0) + 34284));
                                                                byte b38 = bArr[18];
                                                                c3 = 1;
                                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                d(b38, b38, (short) 24, objArr111);
                                                                cls40.getField((java.lang.String) objArr111[0]).set(null, java.lang.Long.valueOf(longValue4));
                                                                int i401 = getGpoResponse + 24;
                                                                getCiacDecline = ((~i401) + (i401 << 1)) % 128;
                                                                i7 = ((int[]) objArr8[c3])[0];
                                                                i8 = ((int[]) objArr8[0])[0];
                                                                if (i8 == i7) {
                                                                }
                                                            } catch (java.lang.Exception unused4) {
                                                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                            }
                                                            java.lang.Object[] objArr112 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str10, java.lang.Object.class).invoke(null, this)).intValue()), 0, 443976614};
                                                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                            if (obj5 == null) {
                                                                java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 707 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (34283 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                byte b39 = bArr[18];
                                                                java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                d(b39, b39, (short) 24, objArr113);
                                                                obj5 = cls41.getMethod((java.lang.String) objArr113[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj5);
                                                            }
                                                            objArr8 = (java.lang.Object[]) ((java.lang.reflect.Method) obj5).invoke(null, objArr112);
                                                            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46, 707 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 34284));
                                                            byte b40 = bArr[5];
                                                            byte b41 = bArr[60];
                                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                            d(b40, b41, (byte) (b41 | com.google.common.base.Ascii.CAN), objArr114);
                                                            cls42.getField((java.lang.String) objArr114[0]).set(null, objArr8);
                                                        }
                                                    }
                                                    baseContext3 = getBaseContext();
                                                    if (baseContext3 == null) {
                                                        int i402 = getGpoResponse;
                                                        int i403 = ((i402 | 107) << 1) - (i402 ^ 107);
                                                        getCiacDecline = i403 % 128;
                                                        baseContext3 = (android.content.Context) (i403 % 2 == 0 ? java.lang.Class.forName(str19).getMethod(str8, new java.lang.Class[1]) : java.lang.Class.forName(str19).getMethod(str8, new java.lang.Class[0])).invoke(null, null);
                                                    }
                                                    if (baseContext3 != null) {
                                                        baseContext3 = baseContext3.getApplicationContext();
                                                    }
                                                    str10 = str7;
                                                    java.lang.Object[] objArr115 = {baseContext3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str10, java.lang.Object.class).invoke(null, this)).intValue()), 0, 288072051};
                                                    byte b42 = $$d[49];
                                                    int i404 = $$e;
                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                    e(b42, (short) (i404 | 337), r2[607], objArr116);
                                                    java.lang.Class<?> cls43 = java.lang.Class.forName((java.lang.String) objArr116[0]);
                                                    byte b43 = (byte) i404;
                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                    e(b43, (short) (b43 | 710), r2[121], objArr117);
                                                    objArr5 = (java.lang.Object[]) cls43.getMethod((java.lang.String) objArr117[0], java.lang.Class.forName(str2), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr115);
                                                    if (baseContext3 != null) {
                                                        int i405 = getGpoResponse;
                                                        int i406 = i405 ^ 1;
                                                        int i407 = (i405 & 1) << 1;
                                                        getCiacDecline = ((i406 ^ i407) + ((i407 & i406) << 1)) % 128;
                                                        java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 48, 1581 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore("", 0));
                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr118);
                                                        cls44.getField((java.lang.String) objArr118[0]).set(null, objArr5);
                                                        try {
                                                            long longValue5 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                            java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.resolveSizeAndState(0, 0, 0), android.graphics.Color.red(0) + 1581, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                            byte b44 = bArr[18];
                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                            d(b44, b44, (short) 24, objArr119);
                                                            cls45.getField((java.lang.String) objArr119[0]).set(null, java.lang.Long.valueOf(longValue5));
                                                            if (((int[]) objArr5[0])[0] != ((int[]) objArr5[1])[0]) {
                                                            }
                                                            this.DigitizedCardProfile = new com.payair.hce.setRight(valueOf);
                                                            java.lang.Class cls302 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 51, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 584, (char) (24291 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                                            java.lang.Object[] objArr862 = new java.lang.Object[1];
                                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr862);
                                                            j4 = cls302.getField((java.lang.String) objArr862[0]).getLong(null);
                                                            if (j4 != -1) {
                                                            }
                                                            str11 = str6;
                                                            num2 = num;
                                                            java.lang.Object[] objArr872 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str10, java.lang.Object.class).invoke(null, this)).intValue()), -1129287178};
                                                            byte[] bArr62 = $$d;
                                                            byte b272 = bArr62[49];
                                                            int i3442 = $$e;
                                                            java.lang.Object[] objArr882 = new java.lang.Object[1];
                                                            e(b272, (short) (i3442 | 303), (byte) (-bArr62[64]), objArr882);
                                                            java.lang.Class<?> cls312 = java.lang.Class.forName((java.lang.String) objArr882[0]);
                                                            java.lang.Object[] objArr892 = new java.lang.Object[1];
                                                            e((byte) (-bArr62[156]), (short) (i3442 | 578), bArr62[843], objArr892);
                                                            java.lang.Object[] objArr902 = (java.lang.Object[]) cls312.getMethod((java.lang.String) objArr892[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr872);
                                                            java.lang.Class cls322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 584 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (24291 - android.text.TextUtils.getTrimmedLength("")));
                                                            byte b282 = (byte) (-bArr[17]);
                                                            java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                            d(b282, b282, (short) 75, objArr912);
                                                            cls322.getField((java.lang.String) objArr912[0]).set(null, objArr902);
                                                            long longValue32 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                            c2 = 0;
                                                            java.lang.Class cls332 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 52, 584 - android.view.View.resolveSize(0, 0), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24291));
                                                            java.lang.Object[] objArr922 = new java.lang.Object[1];
                                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr922);
                                                            cls332.getField((java.lang.String) objArr922[0]).set(null, java.lang.Long.valueOf(longValue32));
                                                            objArr7 = objArr902;
                                                            i5 = 1;
                                                            i6 = ((int[]) objArr7[i5])[c2];
                                                            if (((int[]) objArr7[c2])[c2] == i6) {
                                                            }
                                                            java.lang.Class cls372 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), 707 - android.view.KeyEvent.keyCodeFromString(""), (char) (34283 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                            byte b332 = bArr[18];
                                                            java.lang.Object[] objArr1022 = new java.lang.Object[1];
                                                            d(b332, b332, (short) 24, objArr1022);
                                                            j5 = cls372.getField((java.lang.String) objArr1022[0]).getLong(null);
                                                            if (j5 != -1) {
                                                            }
                                                            java.lang.Object[] objArr1122 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str10, java.lang.Object.class).invoke(null, this)).intValue()), 0, 443976614};
                                                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                            if (obj5 == null) {
                                                            }
                                                            objArr8 = (java.lang.Object[]) ((java.lang.reflect.Method) obj5).invoke(null, objArr1122);
                                                            java.lang.Class cls422 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46, 707 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 34284));
                                                            byte b402 = bArr[5];
                                                            byte b412 = bArr[60];
                                                            java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                                            d(b402, b412, (byte) (b412 | com.google.common.base.Ascii.CAN), objArr1142);
                                                            cls422.getField((java.lang.String) objArr1142[0]).set(null, objArr8);
                                                            long longValue42 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                            java.lang.Class cls402 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 47, 707 - android.graphics.Color.red(0), (char) (android.view.View.getDefaultSize(0, 0) + 34284));
                                                            byte b382 = bArr[18];
                                                            c3 = 1;
                                                            java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                                            d(b382, b382, (short) 24, objArr1112);
                                                            cls402.getField((java.lang.String) objArr1112[0]).set(null, java.lang.Long.valueOf(longValue42));
                                                            int i4012 = getGpoResponse + 24;
                                                            getCiacDecline = ((~i4012) + (i4012 << 1)) % 128;
                                                            i7 = ((int[]) objArr8[c3])[0];
                                                            i8 = ((int[]) objArr8[0])[0];
                                                            if (i8 == i7) {
                                                            }
                                                        } catch (java.lang.Exception unused5) {
                                                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                        }
                                                    } else {
                                                        objArr6 = objArr5;
                                                        objArr5 = objArr6;
                                                        if (((int[]) objArr5[0])[0] != ((int[]) objArr5[1])[0]) {
                                                        }
                                                        this.DigitizedCardProfile = new com.payair.hce.setRight(valueOf);
                                                        java.lang.Class cls3022 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 51, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 584, (char) (24291 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                                        java.lang.Object[] objArr8622 = new java.lang.Object[1];
                                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr8622);
                                                        j4 = cls3022.getField((java.lang.String) objArr8622[0]).getLong(null);
                                                        if (j4 != -1) {
                                                        }
                                                        str11 = str6;
                                                        num2 = num;
                                                        java.lang.Object[] objArr8722 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str10, java.lang.Object.class).invoke(null, this)).intValue()), -1129287178};
                                                        byte[] bArr622 = $$d;
                                                        byte b2722 = bArr622[49];
                                                        int i34422 = $$e;
                                                        java.lang.Object[] objArr8822 = new java.lang.Object[1];
                                                        e(b2722, (short) (i34422 | 303), (byte) (-bArr622[64]), objArr8822);
                                                        java.lang.Class<?> cls3122 = java.lang.Class.forName((java.lang.String) objArr8822[0]);
                                                        java.lang.Object[] objArr8922 = new java.lang.Object[1];
                                                        e((byte) (-bArr622[156]), (short) (i34422 | 578), bArr622[843], objArr8922);
                                                        java.lang.Object[] objArr9022 = (java.lang.Object[]) cls3122.getMethod((java.lang.String) objArr8922[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr8722);
                                                        java.lang.Class cls3222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 584 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (24291 - android.text.TextUtils.getTrimmedLength("")));
                                                        byte b2822 = (byte) (-bArr[17]);
                                                        java.lang.Object[] objArr9122 = new java.lang.Object[1];
                                                        d(b2822, b2822, (short) 75, objArr9122);
                                                        cls3222.getField((java.lang.String) objArr9122[0]).set(null, objArr9022);
                                                        long longValue322 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                        c2 = 0;
                                                        java.lang.Class cls3322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 52, 584 - android.view.View.resolveSize(0, 0), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24291));
                                                        java.lang.Object[] objArr9222 = new java.lang.Object[1];
                                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr9222);
                                                        cls3322.getField((java.lang.String) objArr9222[0]).set(null, java.lang.Long.valueOf(longValue322));
                                                        objArr7 = objArr9022;
                                                        i5 = 1;
                                                        i6 = ((int[]) objArr7[i5])[c2];
                                                        if (((int[]) objArr7[c2])[c2] == i6) {
                                                        }
                                                        java.lang.Class cls3722 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), 707 - android.view.KeyEvent.keyCodeFromString(""), (char) (34283 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                        byte b3322 = bArr[18];
                                                        java.lang.Object[] objArr10222 = new java.lang.Object[1];
                                                        d(b3322, b3322, (short) 24, objArr10222);
                                                        j5 = cls3722.getField((java.lang.String) objArr10222[0]).getLong(null);
                                                        if (j5 != -1) {
                                                        }
                                                        java.lang.Object[] objArr11222 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str10, java.lang.Object.class).invoke(null, this)).intValue()), 0, 443976614};
                                                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                        if (obj5 == null) {
                                                        }
                                                        objArr8 = (java.lang.Object[]) ((java.lang.reflect.Method) obj5).invoke(null, objArr11222);
                                                        java.lang.Class cls4222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46, 707 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 34284));
                                                        byte b4022 = bArr[5];
                                                        byte b4122 = bArr[60];
                                                        java.lang.Object[] objArr11422 = new java.lang.Object[1];
                                                        d(b4022, b4122, (byte) (b4122 | com.google.common.base.Ascii.CAN), objArr11422);
                                                        cls4222.getField((java.lang.String) objArr11422[0]).set(null, objArr8);
                                                        long longValue422 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                        java.lang.Class cls4022 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 47, 707 - android.graphics.Color.red(0), (char) (android.view.View.getDefaultSize(0, 0) + 34284));
                                                        byte b3822 = bArr[18];
                                                        c3 = 1;
                                                        java.lang.Object[] objArr11122 = new java.lang.Object[1];
                                                        d(b3822, b3822, (short) 24, objArr11122);
                                                        cls4022.getField((java.lang.String) objArr11122[0]).set(null, java.lang.Long.valueOf(longValue422));
                                                        int i40122 = getGpoResponse + 24;
                                                        getCiacDecline = ((~i40122) + (i40122 << 1)) % 128;
                                                        i7 = ((int[]) objArr8[c3])[0];
                                                        i8 = ((int[]) objArr8[0])[0];
                                                        if (i8 == i7) {
                                                        }
                                                    }
                                                }
                                            }
                                            baseContext2 = getBaseContext();
                                            if (baseContext2 == null) {
                                                int i408 = getCiacDecline;
                                                int i409 = ((((i408 ^ 61) | (i408 & 61)) << 1) - (~(-((i408 & (-62)) | ((~i408) & 61))))) - 1;
                                                getGpoResponse = i409 % 128;
                                                baseContext2 = (android.content.Context) (i409 % 2 != 0 ? java.lang.Class.forName(str19).getMethod(str5, new java.lang.Class[1]) : java.lang.Class.forName(str19).getMethod(str5, new java.lang.Class[0])).invoke(null, null);
                                            }
                                            if (baseContext2 != null) {
                                                int i410 = getCiacDecline;
                                                int i411 = i410 & 21;
                                                int i412 = (i410 | 21) & (~i411);
                                                int i413 = -(-(i411 << 1));
                                                int i414 = ((i412 | i413) << 1) - (i412 ^ i413);
                                                getGpoResponse = i414 % 128;
                                                if (i414 % 2 != 0) {
                                                    baseContext2.getApplicationContext();
                                                    throw null;
                                                }
                                                baseContext2 = baseContext2.getApplicationContext();
                                            }
                                            int intValue5 = ((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue();
                                            int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                                            int i415 = offsetBefore & 24535;
                                            char c8 = (char) ((i415 - (~(-(-((offsetBefore ^ 24535) | i415))))) - 1);
                                            int axisFromString = android.view.MotionEvent.axisFromString("");
                                            int identityHashCode11 = java.lang.System.identityHashCode(this);
                                            int i416 = (axisFromString * 367) + 23855;
                                            int i417 = axisFromString ^ 65;
                                            int i418 = axisFromString & 65;
                                            int i419 = ((i417 & i418) | (i417 ^ i418)) * (-366);
                                            int i420 = i416 & i419;
                                            num = 994792440;
                                            int i421 = (((~i420) & (i416 | i419)) - (~(i420 << 1))) - 1;
                                            int i422 = identityHashCode11 ^ (-66);
                                            int i423 = identityHashCode11 & (-66);
                                            int i424 = -(-(((~((i422 & i423) | (i422 ^ i423))) | axisFromString) * (-366)));
                                            int i425 = (i421 | i424) << 1;
                                            int i426 = -((i421 & (~i424)) | ((~i421) & i424));
                                            int i427 = ((i425 | i426) << 1) - (i426 ^ i425);
                                            int i428 = ~axisFromString;
                                            int i429 = i428 & (-66);
                                            int i430 = ((~i428) & 65) | i429;
                                            int i431 = i428 & 65;
                                            int i432 = ~((i430 ^ i431) | (i431 & i430));
                                            int i433 = (axisFromString & (-66)) | i429 | i418;
                                            int i434 = i433 ^ identityHashCode11;
                                            int i435 = i433 & identityHashCode11;
                                            int i436 = (i435 ^ i434) | (i435 & i434);
                                            int i437 = ~i436;
                                            int i438 = (i436 | i437) & i437;
                                            int i439 = -(~(((i432 ^ i438) | (i438 & i432)) * 366));
                                            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                            int identityHashCode12 = java.lang.System.identityHashCode(this);
                                            int i440 = keyRepeatDelay * (-103);
                                            int i441 = i440 & (-7416);
                                            int i442 = -(-((i440 ^ (-7416)) | i441));
                                            int i443 = ((i441 | i442) << 1) - (i442 ^ i441);
                                            int i444 = ~keyRepeatDelay;
                                            int i445 = i444 ^ (-73);
                                            int i446 = i444 & (-73);
                                            int i447 = ~((i445 ^ i446) | (i446 & i445));
                                            int i448 = ~(identityHashCode12 | (-73));
                                            str7 = str15;
                                            int i449 = i447 & i448;
                                            str8 = str5;
                                            int i450 = (~i449) & (i447 | i448);
                                            int i451 = -(-(((i449 & i450) | (i450 ^ i449)) * 104));
                                            int i452 = ((~i443) & i451) | ((~i451) & i443);
                                            int i453 = (i451 & i443) << 1;
                                            int i454 = ~identityHashCode12;
                                            int i455 = i454 & keyRepeatDelay;
                                            int i456 = (i454 | keyRepeatDelay) & (~i455);
                                            int i457 = (i456 & i455) | (i456 ^ i455);
                                            int i458 = i457 & 72;
                                            int i459 = keyRepeatDelay & identityHashCode12;
                                            int i460 = (keyRepeatDelay | identityHashCode12) & (~i459);
                                            int i461 = -(-(((i460 ^ i459) | (i459 & i460)) * 104));
                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                            a(c8, (((i427 | i439) << 1) - (i439 ^ i427)) - 1, ((((i452 & i453) + (i453 | i452)) + ((~(((~i458) & (i457 | 72)) | i458)) * (-104))) - (~i461)) - 1, objArr120);
                                            java.lang.String str21 = (java.lang.String) objArr120[0];
                                            int indexOf2 = android.text.TextUtils.indexOf("", "");
                                            int identityHashCode13 = java.lang.System.identityHashCode(this);
                                            int i462 = indexOf2 * 592;
                                            int i463 = ((74929 & i462) | ((~i462) & (-74930))) + ((i462 & (-74930)) << 1);
                                            int i464 = ~indexOf2;
                                            int i465 = (i464 | indexOf2) & i464;
                                            int i466 = i465 ^ 127;
                                            int i467 = i465 & 127;
                                            int i468 = (i466 & i467) | (i466 ^ i467);
                                            int i469 = ~i468;
                                            int i470 = ((i468 | i469) & i469) * (-1182);
                                            int i471 = ((~i463) & i470) | ((~i470) & i463);
                                            int i472 = -(-((i463 & i470) << 1));
                                            int i473 = ((i471 | i472) << 1) - (i472 ^ i471);
                                            int i474 = (i465 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i465 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                            int i475 = ~identityHashCode13;
                                            int i476 = i475 & (i475 | identityHashCode13);
                                            int i477 = i474 & i476;
                                            int i478 = (i474 | i476) & (~i477);
                                            int i479 = (i478 ^ i477) | (i478 & i477);
                                            int i480 = ~i479;
                                            int i481 = (i479 | i480) & i480;
                                            int i482 = (indexOf2 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i464 & 127);
                                            int i483 = indexOf2 & 127;
                                            int i484 = (i483 ^ i482) | (i482 & i483);
                                            int i485 = ~i484;
                                            int i486 = (i484 | i485) & i485;
                                            int i487 = i481 & i486;
                                            int i488 = (i486 | i481) & (~i487);
                                            int i489 = ((i488 ^ i487) | (i488 & i487)) * (-591);
                                            int i490 = i473 ^ i489;
                                            int i491 = -(-((i489 & i473) << 1));
                                            int i492 = identityHashCode13 & i464;
                                            int i493 = (identityHashCode13 | i464) & (~i492);
                                            int i494 = (i493 ^ i492) | (i493 & i492);
                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                            b((-2) - (~(((i490 ^ i491) + ((i491 & i490) << 1)) - (~(((i494 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i494 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 591)))), null, null, "\u009f\u0086\u009d\u009d\u0081\u009d\u0083\u0090\u009a\u0086\u009b\u009a\u009f\u0099\u009e\u0083\u0098\u0086\u009d\u0099\u0096\u009d\u0097\u0099\u009e \u0098\u0083\u009f\u0096\u009d\u0096\u009a\u0095\u009e\u009b\u0081\u0081\u0096 \u009d\u009f\u009e\u0081\u009a\u0083\u009b\u009a\u0099\u009d\u009c\u0097\u009a\u009b\u009a\u0099\u0090\u0099\u0098\u0086\u0098\u0097\u0096\u0095", objArr121);
                                            java.lang.String str22 = (java.lang.String) objArr121[0];
                                            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                            int i495 = mirror & 65488;
                                            char c9 = (char) (i495 + ((mirror ^ 65488) | i495));
                                            int i496 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            int i497 = i496 & 65;
                                            int i498 = i496 | 65;
                                            int i499 = -(-android.graphics.Color.green(0));
                                            int i500 = i499 & 136;
                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                            a(c9, (i497 & i498) + (i498 | i497), (((i499 | 136) & (~i500)) - (~(-(-(i500 << 1))))) - 1, objArr122);
                                            java.lang.String str23 = (java.lang.String) objArr122[0];
                                            int i501 = -android.view.View.MeasureSpec.getMode(0);
                                            int identityHashCode14 = java.lang.System.identityHashCode(this);
                                            int i502 = (i501 * 471) + 22398877;
                                            int i503 = (((~i502) + (i502 << 1)) - (~(-(-(((47556 ^ i501) | (47556 & i501)) * (-470)))))) - 1;
                                            int i504 = ~i501;
                                            int i505 = (i504 | i501) & i504;
                                            int i506 = ~identityHashCode14;
                                            int i507 = ((-47557) & i506) | (identityHashCode14 & 47556);
                                            int i508 = identityHashCode14 & (-47557);
                                            java.lang.String str24 = str;
                                            int i509 = (~((i505 & 47556) | ((~i505) & (-47557)) | (i505 & (-47557)))) | (~((i507 ^ i508) | (i507 & i508)));
                                            int i510 = (i506 | identityHashCode14) & i506;
                                            int i511 = (i504 & i510) | ((~i510) & i501);
                                            int i512 = i510 & i501;
                                            int i513 = (i511 ^ i512) | (i511 & i512);
                                            int i514 = ~((i513 ^ 47556) | (47556 & i513));
                                            int i515 = i509 & i514;
                                            int i516 = -(-((((i514 | i509) & (~i515)) | i515) * (-470)));
                                            int i517 = i503 & i516;
                                            int i518 = i516 | i503;
                                            int i519 = ((i517 | i518) << 1) - (i518 ^ i517);
                                            int i520 = (-47557) & i501;
                                            int i521 = (~i520) & ((-47557) | i501);
                                            int i522 = (i520 ^ i521) | (i520 & i521);
                                            int i523 = (i522 & i506) | ((~i522) & identityHashCode14);
                                            int i524 = identityHashCode14 & i522;
                                            int i525 = (i524 ^ i523) | (i524 & i523);
                                            int i526 = ~i525;
                                            int i527 = (i525 | i526) & i526;
                                            int i528 = i506 & i501;
                                            int i529 = ((i501 | i506) & (~i528)) | i528;
                                            int i530 = ((-47557) & i529) | ((~i529) & 47556);
                                            int i531 = i529 & 47556;
                                            int i532 = ~((i531 ^ i530) | (i531 & i530));
                                            int i533 = i527 & i532;
                                            int i534 = -(-((((i532 | i527) & (~i533)) | i533) * 470));
                                            char c10 = (char) ((((i519 | i534) << 1) - (~(-(((~i534) & i519) | ((~i519) & i534))))) - 1);
                                            int i535 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                            int i536 = i535 & 64;
                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                            a(c10, i536 + ((i535 ^ 64) | i536), (-2) - (~(199 - (~(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))))), objArr123);
                                            java.lang.Object[] objArr124 = {baseContext2, new java.lang.String[]{str21, str22, str23, (java.lang.String) objArr123[0]}, java.lang.Integer.valueOf(intValue5), 0, 1395076823};
                                            byte b45 = $$d[49];
                                            int i537 = $$e;
                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                            e(b45, (short) (i537 | 451), r1[94], objArr125);
                                            java.lang.Class<?> cls46 = java.lang.Class.forName((java.lang.String) objArr125[0]);
                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                            e(r1[30], (short) (i537 | 400), r1[279], objArr126);
                                            objArr3 = (java.lang.Object[]) cls46.getMethod((java.lang.String) objArr126[0], java.lang.Class.forName(str2), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr124);
                                            int i538 = ((int[]) objArr3[1])[0];
                                            int i539 = ((int[]) objArr3[0])[0];
                                            if (baseContext2 != null) {
                                                int i540 = getGpoResponse + 87;
                                                getCiacDecline = i540 % 128;
                                                try {
                                                    if (i540 % 2 == 0) {
                                                        java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 27, android.text.TextUtils.getTrimmedLength("") + 429, (char) (android.view.View.resolveSize(0, 0) + 31610));
                                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                        d(bArr[18], bArr[5], bArr[10], objArr127);
                                                        cls47.getField((java.lang.String) objArr127[0]).set(null, objArr3);
                                                        str9 = str24;
                                                        valueOf3 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue());
                                                        cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27, 430 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.graphics.Color.red(0) + 31610));
                                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr128);
                                                        obj4 = objArr128[0];
                                                    } else {
                                                        str9 = str24;
                                                        java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 429, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 31610));
                                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                        d(bArr[18], bArr[5], bArr[10], objArr129);
                                                        cls48.getField((java.lang.String) objArr129[0]).set(null, objArr3);
                                                        valueOf3 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                                        cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 27, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 428, (char) (31610 - android.view.View.MeasureSpec.getSize(0)));
                                                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr130);
                                                        obj4 = objArr130[0];
                                                    }
                                                    cls2.getField((java.lang.String) obj4).set(null, valueOf3);
                                                    i4 = ((int[]) objArr3[1])[0];
                                                    if (((int[]) objArr3[0])[0] == i4) {
                                                    }
                                                    java.lang.Class cls282 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 48, 1581 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.getDefaultSize(0, 0));
                                                    byte b262 = bArr[18];
                                                    java.lang.Object[] objArr832 = new java.lang.Object[1];
                                                    d(b262, b262, (short) 24, objArr832);
                                                    j3 = cls282.getField((java.lang.String) objArr832[0]).getLong(null);
                                                    if (j3 != -1) {
                                                    }
                                                    baseContext3 = getBaseContext();
                                                    if (baseContext3 == null) {
                                                    }
                                                    if (baseContext3 != null) {
                                                    }
                                                    str10 = str7;
                                                    java.lang.Object[] objArr1152 = {baseContext3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str10, java.lang.Object.class).invoke(null, this)).intValue()), 0, 288072051};
                                                    byte b422 = $$d[49];
                                                    int i4042 = $$e;
                                                    java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                                    e(b422, (short) (i4042 | 337), r2[607], objArr1162);
                                                    java.lang.Class<?> cls432 = java.lang.Class.forName((java.lang.String) objArr1162[0]);
                                                    byte b432 = (byte) i4042;
                                                    java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                                    e(b432, (short) (b432 | 710), r2[121], objArr1172);
                                                    objArr5 = (java.lang.Object[]) cls432.getMethod((java.lang.String) objArr1172[0], java.lang.Class.forName(str2), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1152);
                                                    if (baseContext3 != null) {
                                                    }
                                                } catch (java.lang.Exception unused6) {
                                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                }
                                            } else {
                                                str9 = str24;
                                                objArr4 = objArr3;
                                                objArr3 = objArr4;
                                                i4 = ((int[]) objArr3[1])[0];
                                                if (((int[]) objArr3[0])[0] == i4) {
                                                }
                                                java.lang.Class cls2822 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 48, 1581 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.getDefaultSize(0, 0));
                                                byte b2622 = bArr[18];
                                                java.lang.Object[] objArr8322 = new java.lang.Object[1];
                                                d(b2622, b2622, (short) 24, objArr8322);
                                                j3 = cls2822.getField((java.lang.String) objArr8322[0]).getLong(null);
                                                if (j3 != -1) {
                                                }
                                                baseContext3 = getBaseContext();
                                                if (baseContext3 == null) {
                                                }
                                                if (baseContext3 != null) {
                                                }
                                                str10 = str7;
                                                java.lang.Object[] objArr11522 = {baseContext3, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str10, java.lang.Object.class).invoke(null, this)).intValue()), 0, 288072051};
                                                byte b4222 = $$d[49];
                                                int i40422 = $$e;
                                                java.lang.Object[] objArr11622 = new java.lang.Object[1];
                                                e(b4222, (short) (i40422 | 337), r2[607], objArr11622);
                                                java.lang.Class<?> cls4322 = java.lang.Class.forName((java.lang.String) objArr11622[0]);
                                                byte b4322 = (byte) i40422;
                                                java.lang.Object[] objArr11722 = new java.lang.Object[1];
                                                e(b4322, (short) (b4322 | 710), r2[121], objArr11722);
                                                objArr5 = (java.lang.Object[]) cls4322.getMethod((java.lang.String) objArr11722[0], java.lang.Class.forName(str2), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr11522);
                                                if (baseContext3 != null) {
                                                }
                                            }
                                        }
                                    }
                                    baseContext = getBaseContext();
                                    if (baseContext != null) {
                                        int identityHashCode15 = java.lang.System.identityHashCode(this);
                                        int i541 = ~identityHashCode15;
                                        int i542 = 558286865 & identityHashCode15;
                                        int i543 = ((-558286866) & i541) | i542;
                                        int i544 = (-558286866) & identityHashCode15;
                                        int i545 = ~((i543 ^ i544) | (i543 & i544));
                                        int i546 = ((i545 & (-16828434)) | ((~i545) & 16828433) | (16828433 & i545)) * (-814);
                                        int i547 = (-1073453502) & i546;
                                        int i548 = (i546 | (-1073453502)) & (~i547);
                                        int i549 = -(-(i547 << 1));
                                        int i550 = (i548 & i549) + (i548 | i549);
                                        int i551 = (-1569254866) & i541;
                                        int i552 = ((-1569254866) | i541) & (~i551);
                                        int i553 = ~((i551 ^ i552) | (i552 & i551));
                                        int i554 = (-2110713298) & i553;
                                        int i555 = (i553 | (-2110713298)) & (~i554);
                                        int i556 = (i555 ^ i554) | (i555 & i554);
                                        int i557 = ~(i543 | i544);
                                        int i558 = -(-(((i557 & (~i556)) | ((~i557) & i556) | (i557 & i556)) * 407));
                                        int i559 = (i550 ^ i558) + ((i558 & i550) << 1);
                                        int i560 = 558286865 ^ identityHashCode15;
                                        int i561 = ~((i560 ^ i542) | (i542 & i560));
                                        int i562 = (-2110713298) ^ i561;
                                        int i563 = i561 & (-2110713298);
                                        int i564 = (i563 ^ i562) | (i563 & i562);
                                        int i565 = (i541 & 1569254865) | ((-1569254866) & identityHashCode15);
                                        int i566 = identityHashCode15 & 1569254865;
                                        int i567 = ~((i566 ^ i565) | (i566 & i565));
                                        int i568 = -(~(((i567 ^ i564) | (i567 & i564)) * 407));
                                        int i569 = ~java.lang.System.identityHashCode(this);
                                        int i570 = ((-2144540589) & i569) | ((-2144540589) ^ i569);
                                        int i571 = (-457536300) & i570;
                                        int i572 = (i570 | (-457536300)) & (~i571);
                                        int i573 = (i572 ^ i571) | (i572 & i571);
                                        int i574 = ~i573;
                                        int i575 = -(~(((i573 | i574) & i574) * (-783)));
                                        int i576 = ((1530072739 ^ i575) + ((i575 & 1530072739) << 1)) - 1;
                                        int i577 = ~((i569 ^ (-457536300)) | ((-457536300) & i569));
                                        int i578 = (-2144540589) ^ i577;
                                        int i579 = i577 & (-2144540589);
                                        int i580 = -(~(-(-(((i579 ^ i578) | (i579 & i578)) * 783))));
                                        int i581 = (i576 ^ i580) + ((i580 & i576) << 1);
                                        if ((-2) - (~((i559 ^ i568) + ((i568 & i559) << 1))) > (~i581) + (i581 << 1)) {
                                            str5 = str4;
                                            method = java.lang.Class.forName(str19).getMethod(str5, new java.lang.Class[1]);
                                        } else {
                                            str5 = str4;
                                            method = java.lang.Class.forName(str19).getMethod(str5, new java.lang.Class[0]);
                                        }
                                        baseContext = (android.content.Context) method.invoke(null, null);
                                    } else {
                                        str5 = str4;
                                    }
                                    if (baseContext != null) {
                                        int i582 = getCiacDecline;
                                        int i583 = i582 & 45;
                                        int i584 = (i582 ^ 45) | i583;
                                        int i585 = ((i583 | i584) << 1) - (i584 ^ i583);
                                        getGpoResponse = i585 % 128;
                                        if (i585 % 2 != 0) {
                                            baseContext.getApplicationContext();
                                            throw new java.lang.ArithmeticException();
                                        }
                                        baseContext = baseContext.getApplicationContext();
                                    }
                                    java.lang.Object[] objArr131 = {baseContext, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue()), 0, -97545953};
                                    byte[] bArr7 = $$d;
                                    byte b46 = bArr7[49];
                                    int i586 = $$e;
                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                    e(b46, (short) (i586 | 537), (byte) i586, objArr132);
                                    java.lang.Class<?> cls49 = java.lang.Class.forName((java.lang.String) objArr132[0]);
                                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                                    e((byte) (-bArr7[156]), (short) (i586 | 578), bArr7[843], objArr133);
                                    objArr2 = (java.lang.Object[]) cls49.getMethod((java.lang.String) objArr133[0], java.lang.Class.forName(str2), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr131);
                                    java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 41, 666 - android.os.Process.getGidForName(""), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 40024));
                                    byte b47 = bArr[18];
                                    java.lang.Object[] objArr134 = new java.lang.Object[1];
                                    d(b47, b47, (short) 24, objArr134);
                                    cls50.getField((java.lang.String) objArr134[0]).set(null, objArr2);
                                    long longValue6 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.os.Process.myPid() >> 22) + 667, (char) (40024 - (android.os.Process.myPid() >> 22)));
                                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr135);
                                    i = 0;
                                    cls51.getField((java.lang.String) objArr135[0]).set(null, java.lang.Long.valueOf(longValue6));
                                    c = 1;
                                    i2 = ((int[]) objArr2[c])[i];
                                    i3 = ((int[]) objArr2[i])[i];
                                    if (i3 == i2) {
                                    }
                                    java.lang.Class cls252 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 429, (char) (31610 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                    java.lang.Object[] objArr752 = new java.lang.Object[1];
                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr752);
                                    j2 = cls252.getField((java.lang.String) objArr752[0]).getLong(null);
                                    if (j2 != -1) {
                                    }
                                    baseContext2 = getBaseContext();
                                    if (baseContext2 == null) {
                                    }
                                    if (baseContext2 != null) {
                                    }
                                    int intValue52 = ((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue();
                                    int offsetBefore2 = android.text.TextUtils.getOffsetBefore("", 0);
                                    int i4152 = offsetBefore2 & 24535;
                                    char c82 = (char) ((i4152 - (~(-(-((offsetBefore2 ^ 24535) | i4152))))) - 1);
                                    int axisFromString2 = android.view.MotionEvent.axisFromString("");
                                    int identityHashCode112 = java.lang.System.identityHashCode(this);
                                    int i4162 = (axisFromString2 * 367) + 23855;
                                    int i4172 = axisFromString2 ^ 65;
                                    int i4182 = axisFromString2 & 65;
                                    int i4192 = ((i4172 & i4182) | (i4172 ^ i4182)) * (-366);
                                    int i4202 = i4162 & i4192;
                                    num = 994792440;
                                    int i4212 = (((~i4202) & (i4162 | i4192)) - (~(i4202 << 1))) - 1;
                                    int i4222 = identityHashCode112 ^ (-66);
                                    int i4232 = identityHashCode112 & (-66);
                                    int i4242 = -(-(((~((i4222 & i4232) | (i4222 ^ i4232))) | axisFromString2) * (-366)));
                                    int i4252 = (i4212 | i4242) << 1;
                                    int i4262 = -((i4212 & (~i4242)) | ((~i4212) & i4242));
                                    int i4272 = ((i4252 | i4262) << 1) - (i4262 ^ i4252);
                                    int i4282 = ~axisFromString2;
                                    int i4292 = i4282 & (-66);
                                    int i4302 = ((~i4282) & 65) | i4292;
                                    int i4312 = i4282 & 65;
                                    int i4322 = ~((i4302 ^ i4312) | (i4312 & i4302));
                                    int i4332 = (axisFromString2 & (-66)) | i4292 | i4182;
                                    int i4342 = i4332 ^ identityHashCode112;
                                    int i4352 = i4332 & identityHashCode112;
                                    int i4362 = (i4352 ^ i4342) | (i4352 & i4342);
                                    int i4372 = ~i4362;
                                    int i4382 = (i4362 | i4372) & i4372;
                                    int i4392 = -(~(((i4322 ^ i4382) | (i4382 & i4322)) * 366));
                                    int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                                    int identityHashCode122 = java.lang.System.identityHashCode(this);
                                    int i4402 = keyRepeatDelay2 * (-103);
                                    int i4412 = i4402 & (-7416);
                                    int i4422 = -(-((i4402 ^ (-7416)) | i4412));
                                    int i4432 = ((i4412 | i4422) << 1) - (i4422 ^ i4412);
                                    int i4442 = ~keyRepeatDelay2;
                                    int i4452 = i4442 ^ (-73);
                                    int i4462 = i4442 & (-73);
                                    int i4472 = ~((i4452 ^ i4462) | (i4462 & i4452));
                                    int i4482 = ~(identityHashCode122 | (-73));
                                    str7 = str15;
                                    int i4492 = i4472 & i4482;
                                    str8 = str5;
                                    int i4502 = (~i4492) & (i4472 | i4482);
                                    int i4512 = -(-(((i4492 & i4502) | (i4502 ^ i4492)) * 104));
                                    int i4522 = ((~i4432) & i4512) | ((~i4512) & i4432);
                                    int i4532 = (i4512 & i4432) << 1;
                                    int i4542 = ~identityHashCode122;
                                    int i4552 = i4542 & keyRepeatDelay2;
                                    int i4562 = (i4542 | keyRepeatDelay2) & (~i4552);
                                    int i4572 = (i4562 & i4552) | (i4562 ^ i4552);
                                    int i4582 = i4572 & 72;
                                    int i4592 = keyRepeatDelay2 & identityHashCode122;
                                    int i4602 = (keyRepeatDelay2 | identityHashCode122) & (~i4592);
                                    int i4612 = -(-(((i4602 ^ i4592) | (i4592 & i4602)) * 104));
                                    java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                    a(c82, (((i4272 | i4392) << 1) - (i4392 ^ i4272)) - 1, ((((i4522 & i4532) + (i4532 | i4522)) + ((~(((~i4582) & (i4572 | 72)) | i4582)) * (-104))) - (~i4612)) - 1, objArr1202);
                                    java.lang.String str212 = (java.lang.String) objArr1202[0];
                                    int indexOf22 = android.text.TextUtils.indexOf("", "");
                                    int identityHashCode132 = java.lang.System.identityHashCode(this);
                                    int i4622 = indexOf22 * 592;
                                    int i4632 = ((74929 & i4622) | ((~i4622) & (-74930))) + ((i4622 & (-74930)) << 1);
                                    int i4642 = ~indexOf22;
                                    int i4652 = (i4642 | indexOf22) & i4642;
                                    int i4662 = i4652 ^ 127;
                                    int i4672 = i4652 & 127;
                                    int i4682 = (i4662 & i4672) | (i4662 ^ i4672);
                                    int i4692 = ~i4682;
                                    int i4702 = ((i4682 | i4692) & i4692) * (-1182);
                                    int i4712 = ((~i4632) & i4702) | ((~i4702) & i4632);
                                    int i4722 = -(-((i4632 & i4702) << 1));
                                    int i4732 = ((i4712 | i4722) << 1) - (i4722 ^ i4712);
                                    int i4742 = (i4652 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i4652 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                    int i4752 = ~identityHashCode132;
                                    int i4762 = i4752 & (i4752 | identityHashCode132);
                                    int i4772 = i4742 & i4762;
                                    int i4782 = (i4742 | i4762) & (~i4772);
                                    int i4792 = (i4782 ^ i4772) | (i4782 & i4772);
                                    int i4802 = ~i4792;
                                    int i4812 = (i4792 | i4802) & i4802;
                                    int i4822 = (indexOf22 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i4642 & 127);
                                    int i4832 = indexOf22 & 127;
                                    int i4842 = (i4832 ^ i4822) | (i4822 & i4832);
                                    int i4852 = ~i4842;
                                    int i4862 = (i4842 | i4852) & i4852;
                                    int i4872 = i4812 & i4862;
                                    int i4882 = (i4862 | i4812) & (~i4872);
                                    int i4892 = ((i4882 ^ i4872) | (i4882 & i4872)) * (-591);
                                    int i4902 = i4732 ^ i4892;
                                    int i4912 = -(-((i4892 & i4732) << 1));
                                    int i4922 = identityHashCode132 & i4642;
                                    int i4932 = (identityHashCode132 | i4642) & (~i4922);
                                    int i4942 = (i4932 ^ i4922) | (i4932 & i4922);
                                    java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                    b((-2) - (~(((i4902 ^ i4912) + ((i4912 & i4902) << 1)) - (~(((i4942 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i4942 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 591)))), null, null, "\u009f\u0086\u009d\u009d\u0081\u009d\u0083\u0090\u009a\u0086\u009b\u009a\u009f\u0099\u009e\u0083\u0098\u0086\u009d\u0099\u0096\u009d\u0097\u0099\u009e \u0098\u0083\u009f\u0096\u009d\u0096\u009a\u0095\u009e\u009b\u0081\u0081\u0096 \u009d\u009f\u009e\u0081\u009a\u0083\u009b\u009a\u0099\u009d\u009c\u0097\u009a\u009b\u009a\u0099\u0090\u0099\u0098\u0086\u0098\u0097\u0096\u0095", objArr1212);
                                    java.lang.String str222 = (java.lang.String) objArr1212[0];
                                    char mirror2 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    int i4952 = mirror2 & 65488;
                                    char c92 = (char) (i4952 + ((mirror2 ^ 65488) | i4952));
                                    int i4962 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i4972 = i4962 & 65;
                                    int i4982 = i4962 | 65;
                                    int i4992 = -(-android.graphics.Color.green(0));
                                    int i5002 = i4992 & 136;
                                    java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                    a(c92, (i4972 & i4982) + (i4982 | i4972), (((i4992 | 136) & (~i5002)) - (~(-(-(i5002 << 1))))) - 1, objArr1222);
                                    java.lang.String str232 = (java.lang.String) objArr1222[0];
                                    int i5012 = -android.view.View.MeasureSpec.getMode(0);
                                    int identityHashCode142 = java.lang.System.identityHashCode(this);
                                    int i5022 = (i5012 * 471) + 22398877;
                                    int i5032 = (((~i5022) + (i5022 << 1)) - (~(-(-(((47556 ^ i5012) | (47556 & i5012)) * (-470)))))) - 1;
                                    int i5042 = ~i5012;
                                    int i5052 = (i5042 | i5012) & i5042;
                                    int i5062 = ~identityHashCode142;
                                    int i5072 = ((-47557) & i5062) | (identityHashCode142 & 47556);
                                    int i5082 = identityHashCode142 & (-47557);
                                    java.lang.String str242 = str;
                                    int i5092 = (~((i5052 & 47556) | ((~i5052) & (-47557)) | (i5052 & (-47557)))) | (~((i5072 ^ i5082) | (i5072 & i5082)));
                                    int i5102 = (i5062 | identityHashCode142) & i5062;
                                    int i5112 = (i5042 & i5102) | ((~i5102) & i5012);
                                    int i5122 = i5102 & i5012;
                                    int i5132 = (i5112 ^ i5122) | (i5112 & i5122);
                                    int i5142 = ~((i5132 ^ 47556) | (47556 & i5132));
                                    int i5152 = i5092 & i5142;
                                    int i5162 = -(-((((i5142 | i5092) & (~i5152)) | i5152) * (-470)));
                                    int i5172 = i5032 & i5162;
                                    int i5182 = i5162 | i5032;
                                    int i5192 = ((i5172 | i5182) << 1) - (i5182 ^ i5172);
                                    int i5202 = (-47557) & i5012;
                                    int i5212 = (~i5202) & ((-47557) | i5012);
                                    int i5222 = (i5202 ^ i5212) | (i5202 & i5212);
                                    int i5232 = (i5222 & i5062) | ((~i5222) & identityHashCode142);
                                    int i5242 = identityHashCode142 & i5222;
                                    int i5252 = (i5242 ^ i5232) | (i5242 & i5232);
                                    int i5262 = ~i5252;
                                    int i5272 = (i5252 | i5262) & i5262;
                                    int i5282 = i5062 & i5012;
                                    int i5292 = ((i5012 | i5062) & (~i5282)) | i5282;
                                    int i5302 = ((-47557) & i5292) | ((~i5292) & 47556);
                                    int i5312 = i5292 & 47556;
                                    int i5322 = ~((i5312 ^ i5302) | (i5312 & i5302));
                                    int i5332 = i5272 & i5322;
                                    int i5342 = -(-((((i5322 | i5272) & (~i5332)) | i5332) * 470));
                                    char c102 = (char) ((((i5192 | i5342) << 1) - (~(-(((~i5342) & i5192) | ((~i5192) & i5342))))) - 1);
                                    int i5352 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                    int i5362 = i5352 & 64;
                                    java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                    a(c102, i5362 + ((i5352 ^ 64) | i5362), (-2) - (~(199 - (~(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))))), objArr1232);
                                    java.lang.Object[] objArr1242 = {baseContext2, new java.lang.String[]{str212, str222, str232, (java.lang.String) objArr1232[0]}, java.lang.Integer.valueOf(intValue52), 0, 1395076823};
                                    byte b452 = $$d[49];
                                    int i5372 = $$e;
                                    java.lang.Object[] objArr1252 = new java.lang.Object[1];
                                    e(b452, (short) (i5372 | 451), r1[94], objArr1252);
                                    java.lang.Class<?> cls462 = java.lang.Class.forName((java.lang.String) objArr1252[0]);
                                    java.lang.Object[] objArr1262 = new java.lang.Object[1];
                                    e(r1[30], (short) (i5372 | 400), r1[279], objArr1262);
                                    objArr3 = (java.lang.Object[]) cls462.getMethod((java.lang.String) objArr1262[0], java.lang.Class.forName(str2), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1242);
                                    int i5382 = ((int[]) objArr3[1])[0];
                                    int i5392 = ((int[]) objArr3[0])[0];
                                    if (baseContext2 != null) {
                                    }
                                }
                            }
                            long longValue62 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls512 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.os.Process.myPid() >> 22) + 667, (char) (40024 - (android.os.Process.myPid() >> 22)));
                            java.lang.Object[] objArr1352 = new java.lang.Object[1];
                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr1352);
                            i = 0;
                            cls512.getField((java.lang.String) objArr1352[0]).set(null, java.lang.Long.valueOf(longValue62));
                            c = 1;
                            i2 = ((int[]) objArr2[c])[i];
                            i3 = ((int[]) objArr2[i])[i];
                            if (i3 == i2) {
                            }
                            java.lang.Class cls2522 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 429, (char) (31610 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                            java.lang.Object[] objArr7522 = new java.lang.Object[1];
                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr7522);
                            j2 = cls2522.getField((java.lang.String) objArr7522[0]).getLong(null);
                            if (j2 != -1) {
                            }
                            baseContext2 = getBaseContext();
                            if (baseContext2 == null) {
                            }
                            if (baseContext2 != null) {
                            }
                            int intValue522 = ((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue();
                            int offsetBefore22 = android.text.TextUtils.getOffsetBefore("", 0);
                            int i41522 = offsetBefore22 & 24535;
                            char c822 = (char) ((i41522 - (~(-(-((offsetBefore22 ^ 24535) | i41522))))) - 1);
                            int axisFromString22 = android.view.MotionEvent.axisFromString("");
                            int identityHashCode1122 = java.lang.System.identityHashCode(this);
                            int i41622 = (axisFromString22 * 367) + 23855;
                            int i41722 = axisFromString22 ^ 65;
                            int i41822 = axisFromString22 & 65;
                            int i41922 = ((i41722 & i41822) | (i41722 ^ i41822)) * (-366);
                            int i42022 = i41622 & i41922;
                            num = 994792440;
                            int i42122 = (((~i42022) & (i41622 | i41922)) - (~(i42022 << 1))) - 1;
                            int i42222 = identityHashCode1122 ^ (-66);
                            int i42322 = identityHashCode1122 & (-66);
                            int i42422 = -(-(((~((i42222 & i42322) | (i42222 ^ i42322))) | axisFromString22) * (-366)));
                            int i42522 = (i42122 | i42422) << 1;
                            int i42622 = -((i42122 & (~i42422)) | ((~i42122) & i42422));
                            int i42722 = ((i42522 | i42622) << 1) - (i42622 ^ i42522);
                            int i42822 = ~axisFromString22;
                            int i42922 = i42822 & (-66);
                            int i43022 = ((~i42822) & 65) | i42922;
                            int i43122 = i42822 & 65;
                            int i43222 = ~((i43022 ^ i43122) | (i43122 & i43022));
                            int i43322 = (axisFromString22 & (-66)) | i42922 | i41822;
                            int i43422 = i43322 ^ identityHashCode1122;
                            int i43522 = i43322 & identityHashCode1122;
                            int i43622 = (i43522 ^ i43422) | (i43522 & i43422);
                            int i43722 = ~i43622;
                            int i43822 = (i43622 | i43722) & i43722;
                            int i43922 = -(~(((i43222 ^ i43822) | (i43822 & i43222)) * 366));
                            int keyRepeatDelay22 = android.view.ViewConfiguration.getKeyRepeatDelay() >> 16;
                            int identityHashCode1222 = java.lang.System.identityHashCode(this);
                            int i44022 = keyRepeatDelay22 * (-103);
                            int i44122 = i44022 & (-7416);
                            int i44222 = -(-((i44022 ^ (-7416)) | i44122));
                            int i44322 = ((i44122 | i44222) << 1) - (i44222 ^ i44122);
                            int i44422 = ~keyRepeatDelay22;
                            int i44522 = i44422 ^ (-73);
                            int i44622 = i44422 & (-73);
                            int i44722 = ~((i44522 ^ i44622) | (i44622 & i44522));
                            int i44822 = ~(identityHashCode1222 | (-73));
                            str7 = str15;
                            int i44922 = i44722 & i44822;
                            str8 = str5;
                            int i45022 = (~i44922) & (i44722 | i44822);
                            int i45122 = -(-(((i44922 & i45022) | (i45022 ^ i44922)) * 104));
                            int i45222 = ((~i44322) & i45122) | ((~i45122) & i44322);
                            int i45322 = (i45122 & i44322) << 1;
                            int i45422 = ~identityHashCode1222;
                            int i45522 = i45422 & keyRepeatDelay22;
                            int i45622 = (i45422 | keyRepeatDelay22) & (~i45522);
                            int i45722 = (i45622 & i45522) | (i45622 ^ i45522);
                            int i45822 = i45722 & 72;
                            int i45922 = keyRepeatDelay22 & identityHashCode1222;
                            int i46022 = (keyRepeatDelay22 | identityHashCode1222) & (~i45922);
                            int i46122 = -(-(((i46022 ^ i45922) | (i45922 & i46022)) * 104));
                            java.lang.Object[] objArr12022 = new java.lang.Object[1];
                            a(c822, (((i42722 | i43922) << 1) - (i43922 ^ i42722)) - 1, ((((i45222 & i45322) + (i45322 | i45222)) + ((~(((~i45822) & (i45722 | 72)) | i45822)) * (-104))) - (~i46122)) - 1, objArr12022);
                            java.lang.String str2122 = (java.lang.String) objArr12022[0];
                            int indexOf222 = android.text.TextUtils.indexOf("", "");
                            int identityHashCode1322 = java.lang.System.identityHashCode(this);
                            int i46222 = indexOf222 * 592;
                            int i46322 = ((74929 & i46222) | ((~i46222) & (-74930))) + ((i46222 & (-74930)) << 1);
                            int i46422 = ~indexOf222;
                            int i46522 = (i46422 | indexOf222) & i46422;
                            int i46622 = i46522 ^ 127;
                            int i46722 = i46522 & 127;
                            int i46822 = (i46622 & i46722) | (i46622 ^ i46722);
                            int i46922 = ~i46822;
                            int i47022 = ((i46822 | i46922) & i46922) * (-1182);
                            int i47122 = ((~i46322) & i47022) | ((~i47022) & i46322);
                            int i47222 = -(-((i46322 & i47022) << 1));
                            int i47322 = ((i47122 | i47222) << 1) - (i47222 ^ i47122);
                            int i47422 = (i46522 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i46522 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                            int i47522 = ~identityHashCode1322;
                            int i47622 = i47522 & (i47522 | identityHashCode1322);
                            int i47722 = i47422 & i47622;
                            int i47822 = (i47422 | i47622) & (~i47722);
                            int i47922 = (i47822 ^ i47722) | (i47822 & i47722);
                            int i48022 = ~i47922;
                            int i48122 = (i47922 | i48022) & i48022;
                            int i48222 = (indexOf222 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i46422 & 127);
                            int i48322 = indexOf222 & 127;
                            int i48422 = (i48322 ^ i48222) | (i48222 & i48322);
                            int i48522 = ~i48422;
                            int i48622 = (i48422 | i48522) & i48522;
                            int i48722 = i48122 & i48622;
                            int i48822 = (i48622 | i48122) & (~i48722);
                            int i48922 = ((i48822 ^ i48722) | (i48822 & i48722)) * (-591);
                            int i49022 = i47322 ^ i48922;
                            int i49122 = -(-((i48922 & i47322) << 1));
                            int i49222 = identityHashCode1322 & i46422;
                            int i49322 = (identityHashCode1322 | i46422) & (~i49222);
                            int i49422 = (i49322 ^ i49222) | (i49322 & i49222);
                            java.lang.Object[] objArr12122 = new java.lang.Object[1];
                            b((-2) - (~(((i49022 ^ i49122) + ((i49122 & i49022) << 1)) - (~(((i49422 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i49422 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 591)))), null, null, "\u009f\u0086\u009d\u009d\u0081\u009d\u0083\u0090\u009a\u0086\u009b\u009a\u009f\u0099\u009e\u0083\u0098\u0086\u009d\u0099\u0096\u009d\u0097\u0099\u009e \u0098\u0083\u009f\u0096\u009d\u0096\u009a\u0095\u009e\u009b\u0081\u0081\u0096 \u009d\u009f\u009e\u0081\u009a\u0083\u009b\u009a\u0099\u009d\u009c\u0097\u009a\u009b\u009a\u0099\u0090\u0099\u0098\u0086\u0098\u0097\u0096\u0095", objArr12122);
                            java.lang.String str2222 = (java.lang.String) objArr12122[0];
                            char mirror22 = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            int i49522 = mirror22 & 65488;
                            char c922 = (char) (i49522 + ((mirror22 ^ 65488) | i49522));
                            int i49622 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int i49722 = i49622 & 65;
                            int i49822 = i49622 | 65;
                            int i49922 = -(-android.graphics.Color.green(0));
                            int i50022 = i49922 & 136;
                            java.lang.Object[] objArr12222 = new java.lang.Object[1];
                            a(c922, (i49722 & i49822) + (i49822 | i49722), (((i49922 | 136) & (~i50022)) - (~(-(-(i50022 << 1))))) - 1, objArr12222);
                            java.lang.String str2322 = (java.lang.String) objArr12222[0];
                            int i50122 = -android.view.View.MeasureSpec.getMode(0);
                            int identityHashCode1422 = java.lang.System.identityHashCode(this);
                            int i50222 = (i50122 * 471) + 22398877;
                            int i50322 = (((~i50222) + (i50222 << 1)) - (~(-(-(((47556 ^ i50122) | (47556 & i50122)) * (-470)))))) - 1;
                            int i50422 = ~i50122;
                            int i50522 = (i50422 | i50122) & i50422;
                            int i50622 = ~identityHashCode1422;
                            int i50722 = ((-47557) & i50622) | (identityHashCode1422 & 47556);
                            int i50822 = identityHashCode1422 & (-47557);
                            java.lang.String str2422 = str;
                            int i50922 = (~((i50522 & 47556) | ((~i50522) & (-47557)) | (i50522 & (-47557)))) | (~((i50722 ^ i50822) | (i50722 & i50822)));
                            int i51022 = (i50622 | identityHashCode1422) & i50622;
                            int i51122 = (i50422 & i51022) | ((~i51022) & i50122);
                            int i51222 = i51022 & i50122;
                            int i51322 = (i51122 ^ i51222) | (i51122 & i51222);
                            int i51422 = ~((i51322 ^ 47556) | (47556 & i51322));
                            int i51522 = i50922 & i51422;
                            int i51622 = -(-((((i51422 | i50922) & (~i51522)) | i51522) * (-470)));
                            int i51722 = i50322 & i51622;
                            int i51822 = i51622 | i50322;
                            int i51922 = ((i51722 | i51822) << 1) - (i51822 ^ i51722);
                            int i52022 = (-47557) & i50122;
                            int i52122 = (~i52022) & ((-47557) | i50122);
                            int i52222 = (i52022 ^ i52122) | (i52022 & i52122);
                            int i52322 = (i52222 & i50622) | ((~i52222) & identityHashCode1422);
                            int i52422 = identityHashCode1422 & i52222;
                            int i52522 = (i52422 ^ i52322) | (i52422 & i52322);
                            int i52622 = ~i52522;
                            int i52722 = (i52522 | i52622) & i52622;
                            int i52822 = i50622 & i50122;
                            int i52922 = ((i50122 | i50622) & (~i52822)) | i52822;
                            int i53022 = ((-47557) & i52922) | ((~i52922) & 47556);
                            int i53122 = i52922 & 47556;
                            int i53222 = ~((i53122 ^ i53022) | (i53122 & i53022));
                            int i53322 = i52722 & i53222;
                            int i53422 = -(-((((i53222 | i52722) & (~i53322)) | i53322) * 470));
                            char c1022 = (char) ((((i51922 | i53422) << 1) - (~(-(((~i53422) & i51922) | ((~i51922) & i53422))))) - 1);
                            int i53522 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                            int i53622 = i53522 & 64;
                            java.lang.Object[] objArr12322 = new java.lang.Object[1];
                            a(c1022, i53622 + ((i53522 ^ 64) | i53622), (-2) - (~(199 - (~(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))))), objArr12322);
                            java.lang.Object[] objArr12422 = {baseContext2, new java.lang.String[]{str2122, str2222, str2322, (java.lang.String) objArr12322[0]}, java.lang.Integer.valueOf(intValue522), 0, 1395076823};
                            byte b4522 = $$d[49];
                            int i53722 = $$e;
                            java.lang.Object[] objArr12522 = new java.lang.Object[1];
                            e(b4522, (short) (i53722 | 451), r1[94], objArr12522);
                            java.lang.Class<?> cls4622 = java.lang.Class.forName((java.lang.String) objArr12522[0]);
                            java.lang.Object[] objArr12622 = new java.lang.Object[1];
                            e(r1[30], (short) (i53722 | 400), r1[279], objArr12622);
                            objArr3 = (java.lang.Object[]) cls4622.getMethod((java.lang.String) objArr12622[0], java.lang.Class.forName(str2), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr12422);
                            int i53822 = ((int[]) objArr3[1])[0];
                            int i53922 = ((int[]) objArr3[0])[0];
                            if (baseContext2 != null) {
                            }
                        } catch (java.lang.Exception unused7) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                        long longValue7 = ((java.lang.Long) java.lang.Class.forName(str12).getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.getOffsetBefore("", 0) + 754, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 45561));
                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr136);
                        cls52.getField((java.lang.String) objArr136[0]).set(null, java.lang.Long.valueOf(longValue7));
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                        if (obj2 == null) {
                        }
                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(invoke, null)).intValue();
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                        if (obj3 == null) {
                        }
                        intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(invoke, null)).intValue();
                        if (intValue2 != intValue) {
                        }
                        java.lang.Class cls222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 667 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (40025 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr652 = new java.lang.Object[1];
                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr652);
                        j = cls222.getField((java.lang.String) objArr652[0]).getLong(null);
                        if (j != -1) {
                        }
                        baseContext = getBaseContext();
                        if (baseContext != null) {
                        }
                        if (baseContext != null) {
                        }
                        java.lang.Object[] objArr1312 = {baseContext, java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue()), 0, -97545953};
                        byte[] bArr72 = $$d;
                        byte b462 = bArr72[49];
                        int i5862 = $$e;
                        java.lang.Object[] objArr1322 = new java.lang.Object[1];
                        e(b462, (short) (i5862 | 537), (byte) i5862, objArr1322);
                        java.lang.Class<?> cls492 = java.lang.Class.forName((java.lang.String) objArr1322[0]);
                        java.lang.Object[] objArr1332 = new java.lang.Object[1];
                        e((byte) (-bArr72[156]), (short) (i5862 | 578), bArr72[843], objArr1332);
                        objArr2 = (java.lang.Object[]) cls492.getMethod((java.lang.String) objArr1332[0], java.lang.Class.forName(str2), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1312);
                        java.lang.Class cls502 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 41, 666 - android.os.Process.getGidForName(""), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 40024));
                        byte b472 = bArr[18];
                        java.lang.Object[] objArr1342 = new java.lang.Object[1];
                        d(b472, b472, (short) 24, objArr1342);
                        cls502.getField((java.lang.String) objArr1342[0]).set(null, objArr2);
                    } catch (java.lang.Exception unused8) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    java.lang.Object[] objArr137 = {java.lang.Integer.valueOf(((java.lang.Integer) java.lang.Class.forName(str14).getMethod(str15, java.lang.Object.class).invoke(null, this)).intValue()), -716062618};
                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                    if (obj40 == null) {
                        java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.View.resolveSize(0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 754, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45560));
                        byte b48 = bArr[5];
                        byte b49 = bArr[60];
                        java.lang.Object[] objArr138 = new java.lang.Object[1];
                        d(b48, b49, (byte) (b49 | com.google.common.base.Ascii.CAN), objArr138);
                        obj40 = cls53.getMethod((java.lang.String) objArr138[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj40);
                    }
                    invoke = ((java.lang.reflect.Method) obj40).invoke(null, objArr137);
                    java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 48, 753 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.os.Process.getGidForName("") + 45561));
                    byte b50 = bArr[5];
                    byte b51 = bArr[60];
                    java.lang.Object[] objArr139 = new java.lang.Object[1];
                    d(b50, b51, (byte) (b51 | com.google.common.base.Ascii.CAN), objArr139);
                    cls54.getField((java.lang.String) objArr139[0]).set(null, invoke);
                } catch (java.lang.Exception unused9) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    @Override // android.nfc.cardemulation.HostApduService
    public byte[] processCommandApdu(byte[] bArr, android.os.Bundle bundle) {
        boolean z;
        byte[] bArr2;
        int i = getCiacDecline;
        int i2 = i & 105;
        int i3 = -(-(i | 105));
        getGpoResponse = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        com.payair.hce.setHandwritingDelegatorCallback sethandwritingdelegatorcallback = (com.payair.hce.setHandwritingDelegatorCallback) writeReplace(new java.lang.Object[]{this}, -1759117460, 1759117460, java.lang.System.identityHashCode(this));
        try {
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(202340572);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 37, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 5051, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("AlternateContactlessPaymentDataJson", null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(202340572, obj);
            }
            android.content.Context context = valueOf;
            if (sethandwritingdelegatorcallback == com.payair.hce.setHandwritingDelegatorCallback.writeReplace) {
                int i4 = getGpoResponse;
                int i5 = i4 & 21;
                int i6 = (i4 ^ 21) | i5;
                int i7 = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
                getCiacDecline = i7;
                int i8 = i7 & 55;
                getGpoResponse = (((((i7 ^ 55) | i8) << 1) - (~(-((~i8) & (i7 | 55))))) - 1) % 128;
                z = true;
            } else {
                int i9 = getCiacDecline + 102;
                getGpoResponse = ((~i9) + (i9 << 1)) % 128;
                z = false;
            }
            if (((java.lang.Boolean) com.payair.hce.setScreenReaderFocusable.writeReplace(new java.lang.Object[]{context, java.lang.Boolean.valueOf(z)}, -1619977357, 1619977357, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i10 = getCiacDecline;
                int i11 = i10 & 105;
                getGpoResponse = (((~i11) & (i10 | 105)) + (i11 << 1)) % 128;
                getGpoResponse = (i10 + 31) % 128;
                return null;
            }
            java.lang.String str = "";
            if (sethandwritingdelegatorcallback == com.payair.hce.setHandwritingDelegatorCallback.values) {
                int i12 = getGpoResponse;
                getCiacDecline = (((i12 & (-24)) | ((~i12) & 23)) + ((i12 & 23) << 1)) % 128;
                if (!((java.lang.Boolean) com.payair.hce.setAccessibilityHeading.valueOf(new java.lang.Object[0], -1034948216, 1034948228, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                    int i13 = getGpoResponse;
                    int i14 = i13 | 71;
                    getCiacDecline = (((i14 << 1) - (~(-((~(i13 & 71)) & i14)))) - 1) % 128;
                    android.content.Intent intent = (android.content.Intent) com.payair.hce.setTranslationX.valueOf(new java.lang.Object[0], 964113186, -964113184, (int) java.lang.System.currentTimeMillis());
                    intent.setAction(com.payair.model.PaymentIntentKeys.OFFLINE_PAYMENTS_NOT_SUPPORTED);
                    com.payair.hce.setTranslationX.valueOf(new java.lang.Object[]{valueOf, intent}, 101450197, -101450197, (int) java.lang.System.currentTimeMillis());
                    int i15 = getGpoResponse;
                    int i16 = i15 & 99;
                    int i17 = ((i15 ^ 99) | i16) << 1;
                    int i18 = -((i15 | 99) & (~i16));
                    getCiacDecline = ((i17 & i18) + (i18 | i17)) % 128;
                    return null;
                }
                com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{valueOf}, 1729473102, -1729473077, (int) java.lang.System.currentTimeMillis());
                if (((java.lang.String) com.payair.hce.setWebChromeClient.values(new java.lang.Object[0], -650477225, 650477228, (int) java.lang.System.currentTimeMillis())) != null) {
                    int i19 = getCiacDecline;
                    int i20 = i19 & 35;
                    int i21 = (i19 | 35) & (~i20);
                    int i22 = i20 << 1;
                    int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                    getGpoResponse = i23 % 128;
                    if (i23 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    str = (java.lang.String) com.payair.hce.setWebChromeClient.values(new java.lang.Object[0], -650477225, 650477228, (int) java.lang.System.currentTimeMillis());
                } else {
                    int i24 = getGpoResponse;
                    int i25 = i24 & 103;
                    int i26 = i24 | 103;
                    getCiacDecline = ((i25 ^ i26) + ((i26 & i25) << 1)) % 128;
                }
                getCiacDecline = ((-2) - (~(getGpoResponse + 6))) % 128;
            } else if (sethandwritingdelegatorcallback == com.payair.hce.setHandwritingDelegatorCallback.writeReplace) {
                int i27 = getGpoResponse;
                int i28 = i27 & 73;
                int i29 = -(-(i27 | 73));
                getCiacDecline = (((i28 | i29) << 1) - (i29 ^ i28)) % 128;
                com.payair.hce.setSystemGestureExclusionRects setsystemgestureexclusionrects = (com.payair.hce.setSystemGestureExclusionRects) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 685917425, -685917415, (int) java.lang.System.currentTimeMillis());
                if (setsystemgestureexclusionrects != null) {
                    int i30 = getGpoResponse;
                    int i31 = i30 ^ 17;
                    int i32 = -(-((i30 & 17) << 1));
                    int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                    getCiacDecline = i33 % 128;
                    if (i33 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    com.payair.hce.sendRequest sendrequest = (com.payair.hce.sendRequest) com.payair.hce.setSystemGestureExclusionRects.valueOf(new java.lang.Object[]{setsystemgestureexclusionrects}, -667563269, 667563273, java.lang.System.identityHashCode(setsystemgestureexclusionrects));
                    if (sendrequest != null) {
                        getGpoResponse = (getCiacDecline + 55) % 128;
                        java.lang.String AlternateContactlessPaymentDataJson2 = sendrequest.AlternateContactlessPaymentDataJson();
                        int i34 = getGpoResponse;
                        int i35 = i34 ^ 107;
                        int i36 = (i34 & 107) << 1;
                        getCiacDecline = ((i35 & i36) + (i36 | i35)) % 128;
                        str = AlternateContactlessPaymentDataJson2;
                    }
                    writeReplace(new java.lang.Object[0], -1898845982, 1898845984, (int) java.lang.System.currentTimeMillis());
                    getGpoResponse = (getCiacDecline + 117) % 128;
                }
            }
            if (!androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m(str)) {
                int i37 = getGpoResponse;
                int i38 = i37 ^ 53;
                int i39 = (((i37 & 53) | i38) << 1) - i38;
                getCiacDecline = i39 % 128;
                if (i39 % 2 == 0) {
                    android.content.Intent intent2 = (android.content.Intent) com.payair.hce.setTranslationX.valueOf(new java.lang.Object[0], 964113186, -964113184, (int) java.lang.System.currentTimeMillis());
                    intent2.setAction(com.payair.model.PaymentIntentKeys.ACTION_CONTACTLESS_IN_PROGRESS);
                    intent2.putExtra(com.payair.model.PaymentIntentKeys.PARAM_CURRENT, str);
                    com.payair.hce.setTranslationX.valueOf(new java.lang.Object[]{valueOf, intent2}, 101450197, -101450197, (int) java.lang.System.currentTimeMillis());
                    throw null;
                }
                android.content.Intent intent3 = (android.content.Intent) com.payair.hce.setTranslationX.valueOf(new java.lang.Object[0], 964113186, -964113184, (int) java.lang.System.currentTimeMillis());
                intent3.setAction(com.payair.model.PaymentIntentKeys.ACTION_CONTACTLESS_IN_PROGRESS);
                intent3.putExtra(com.payair.model.PaymentIntentKeys.PARAM_CURRENT, str);
                com.payair.hce.setTranslationX.valueOf(new java.lang.Object[]{valueOf, intent3}, 101450197, -101450197, (int) java.lang.System.currentTimeMillis());
                int i40 = getCiacDecline;
                int i41 = (i40 ^ 29) + ((i40 & 29) << 1);
                getGpoResponse = i41 % 128;
                if (i41 % 2 != 0) {
                    int i42 = 5 / 3;
                }
            }
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[]{com.payair.hce.setStatusCode.writeReplace}, 1827369302, -1827369284, (int) java.lang.System.currentTimeMillis());
            if (sethandwritingdelegatorcallback == com.payair.hce.setHandwritingDelegatorCallback.writeReplace) {
                int i43 = getGpoResponse;
                getCiacDecline = ((i43 & 121) + (i43 | 121)) % 128;
                if (values == null) {
                    int i44 = i43 & 9;
                    int i45 = ((((i43 ^ 9) | i44) << 1) - (~(-((~i44) & (i43 | 9))))) - 1;
                    getCiacDecline = i45 % 128;
                    if (i45 % 2 == 0) {
                        notifyUnhandled();
                        throw null;
                    }
                    notifyUnhandled();
                    int i46 = getCiacDecline;
                    int i47 = i46 & 121;
                    int i48 = (i46 ^ 121) | i47;
                    int i49 = (i47 & i48) + (i48 | i47);
                    getGpoResponse = i49 % 128;
                    if (i49 % 2 == 0) {
                        return null;
                    }
                    throw new java.lang.ArithmeticException();
                }
            }
            if (sethandwritingdelegatorcallback == com.payair.hce.setHandwritingDelegatorCallback.values) {
                int i50 = getGpoResponse;
                int i51 = i50 & 35;
                int i52 = i51 + ((i50 ^ 35) | i51);
                getCiacDecline = i52 % 128;
                if (i52 % 2 == 0) {
                    throw null;
                }
                com.payair.hce.setSelector setselector = (com.payair.hce.setSelector) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], 1953461450, -1953461436, (int) java.lang.System.currentTimeMillis());
                if (setselector == null) {
                    int i53 = getCiacDecline;
                    int i54 = i53 & 53;
                    int i55 = ((i53 ^ 53) | i54) << 1;
                    int i56 = -((i53 | 53) & (~i54));
                    int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                    getGpoResponse = i57 % 128;
                    if (i57 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                int i58 = getGpoResponse;
                getCiacDecline = ((i58 ^ 105) + ((i58 & 105) << 1)) % 128;
                bArr2 = (byte[]) com.payair.hce.setSelector.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselector, bArr, valueOf, bundle}, 1185545263, -1185545258, java.lang.System.identityHashCode(setselector));
                int i59 = (-2) - (~(getCiacDecline + 104));
                getGpoResponse = i59 % 128;
                int i60 = i59 % 2;
            } else if (sethandwritingdelegatorcallback == com.payair.hce.setHandwritingDelegatorCallback.writeReplace) {
                int i61 = getCiacDecline + 88;
                int i62 = (~i61) + (i61 << 1);
                getGpoResponse = i62 % 128;
                if (i62 % 2 != 0) {
                    values.values(bArr);
                    throw null;
                }
                bArr2 = values.values(bArr);
            } else {
                bArr2 = this.writeReplace;
                getGpoResponse = (getCiacDecline + 113) % 128;
            }
            int i63 = getCiacDecline;
            int i64 = ((i63 | 115) << 1) - (i63 ^ 115);
            getGpoResponse = i64 % 128;
            if (i64 % 2 == 0) {
                return bArr2;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.PayairWalletHceService payairWalletHceService = (com.payair.hce.PayairWalletHceService) objArr[0];
        int i = getCiacDecline;
        int i2 = i & 9;
        int i3 = -(-(i | 9));
        int i4 = (i2 & i3) + (i3 | i2);
        getGpoResponse = i4 % 128;
        if (i4 % 2 == 0) {
            com.payair.hce.setHandwritingDelegatorCallback valueOf2 = payairWalletHceService.DigitizedCardProfile.valueOf();
            com.payair.hce.setHandwritingDelegatorCallback values2 = payairWalletHceService.DigitizedCardProfile.values();
            if (valueOf2 == null) {
                int i5 = getCiacDecline;
                int i6 = i5 & 91;
                int i7 = i6 + ((i5 ^ 91) | i6);
                getGpoResponse = i7 % 128;
                if (i7 % 2 == 0) {
                    return values2;
                }
                throw null;
            }
            int i8 = getCiacDecline & 57;
            getGpoResponse = ((i8 - (~((r3 ^ 57) | i8))) - 1) % 128;
            return valueOf2;
        }
        payairWalletHceService.DigitizedCardProfile.valueOf();
        payairWalletHceService.DigitizedCardProfile.values();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x29b0, code lost:
    
        if ((r3 + 1862) >= ((java.lang.Long) java.lang.Class.forName(r39).getDeclaredMethod(r12, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) goto L408;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x18f7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x1b7c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x1d24  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x2271  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x2780  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x295f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x2c48  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x2cc1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x2ea3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x2ea4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x2a63  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x2ac6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x2805  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x2682 A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:9:0x0124, B:11:0x013e, B:12:0x0172, B:13:0x0216, B:21:0x05b4, B:23:0x05cb, B:24:0x0604, B:35:0x0816, B:37:0x0837, B:38:0x0878, B:39:0x0929, B:51:0x0deb, B:53:0x0e07, B:54:0x0e42, B:64:0x0f7a, B:66:0x0f8f, B:67:0x0fcb, B:78:0x11fb, B:80:0x121c, B:81:0x127a, B:82:0x1460, B:84:0x146f, B:85:0x14a0, B:87:0x14bc, B:88:0x14f0, B:90:0x14ff, B:92:0x150e, B:93:0x153b, B:95:0x1567, B:96:0x15c9, B:116:0x1965, B:118:0x1986, B:119:0x19c7, B:124:0x1b90, B:126:0x1bad, B:127:0x1bed, B:136:0x1d9e, B:138:0x1db8, B:139:0x1def, B:140:0x1e92, B:148:0x23b5, B:150:0x23cd, B:151:0x2404, B:158:0x25f1, B:160:0x2612, B:161:0x264f, B:165:0x279b, B:167:0x27b8, B:168:0x27fd, B:177:0x29ef, B:179:0x2a10, B:180:0x2a51, B:185:0x2c50, B:187:0x2c6d, B:188:0x2ca9, B:192:0x2cc6, B:194:0x2cd9, B:195:0x2d0d, B:197:0x2d17, B:199:0x2d2a, B:200:0x2d63, B:204:0x2de4, B:206:0x2e01, B:207:0x2e3e, B:242:0x28b6, B:244:0x28d3, B:245:0x2918, B:246:0x265c, B:248:0x2682, B:249:0x26d5, B:258:0x2417, B:260:0x242d, B:261:0x2466, B:265:0x24e9, B:267:0x24ff, B:268:0x2539, B:271:0x1e38, B:273:0x1e52, B:274:0x1e8b, B:305:0x1c84, B:307:0x1ca1, B:308:0x1cdf, B:310:0x1a14, B:312:0x1a35, B:313:0x1a72, B:314:0x1a7f, B:316:0x1a9b, B:317:0x1ad1, B:348:0x1636, B:350:0x1645, B:351:0x1676, B:353:0x16a2, B:354:0x1704, B:356:0x12c3, B:358:0x12e4, B:359:0x133e, B:362:0x1347, B:364:0x136a, B:365:0x13bb, B:374:0x0fda, B:376:0x0ff0, B:377:0x1026, B:381:0x10c2, B:383:0x10d8, B:384:0x1112, B:399:0x08c1, B:401:0x08e2, B:402:0x0922, B:429:0x0617, B:431:0x062d, B:432:0x0666, B:437:0x06ea, B:439:0x0700, B:440:0x073e, B:442:0x01bf, B:444:0x01d9, B:445:0x020f), top: B:2:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x246f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x1eaa  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x1fc6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x2112  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x225b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x1fc2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x1c03  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x1a9b A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:9:0x0124, B:11:0x013e, B:12:0x0172, B:13:0x0216, B:21:0x05b4, B:23:0x05cb, B:24:0x0604, B:35:0x0816, B:37:0x0837, B:38:0x0878, B:39:0x0929, B:51:0x0deb, B:53:0x0e07, B:54:0x0e42, B:64:0x0f7a, B:66:0x0f8f, B:67:0x0fcb, B:78:0x11fb, B:80:0x121c, B:81:0x127a, B:82:0x1460, B:84:0x146f, B:85:0x14a0, B:87:0x14bc, B:88:0x14f0, B:90:0x14ff, B:92:0x150e, B:93:0x153b, B:95:0x1567, B:96:0x15c9, B:116:0x1965, B:118:0x1986, B:119:0x19c7, B:124:0x1b90, B:126:0x1bad, B:127:0x1bed, B:136:0x1d9e, B:138:0x1db8, B:139:0x1def, B:140:0x1e92, B:148:0x23b5, B:150:0x23cd, B:151:0x2404, B:158:0x25f1, B:160:0x2612, B:161:0x264f, B:165:0x279b, B:167:0x27b8, B:168:0x27fd, B:177:0x29ef, B:179:0x2a10, B:180:0x2a51, B:185:0x2c50, B:187:0x2c6d, B:188:0x2ca9, B:192:0x2cc6, B:194:0x2cd9, B:195:0x2d0d, B:197:0x2d17, B:199:0x2d2a, B:200:0x2d63, B:204:0x2de4, B:206:0x2e01, B:207:0x2e3e, B:242:0x28b6, B:244:0x28d3, B:245:0x2918, B:246:0x265c, B:248:0x2682, B:249:0x26d5, B:258:0x2417, B:260:0x242d, B:261:0x2466, B:265:0x24e9, B:267:0x24ff, B:268:0x2539, B:271:0x1e38, B:273:0x1e52, B:274:0x1e8b, B:305:0x1c84, B:307:0x1ca1, B:308:0x1cdf, B:310:0x1a14, B:312:0x1a35, B:313:0x1a72, B:314:0x1a7f, B:316:0x1a9b, B:317:0x1ad1, B:348:0x1636, B:350:0x1645, B:351:0x1676, B:353:0x16a2, B:354:0x1704, B:356:0x12c3, B:358:0x12e4, B:359:0x133e, B:362:0x1347, B:364:0x136a, B:365:0x13bb, B:374:0x0fda, B:376:0x0ff0, B:377:0x1026, B:381:0x10c2, B:383:0x10d8, B:384:0x1112, B:399:0x08c1, B:401:0x08e2, B:402:0x0922, B:429:0x0617, B:431:0x062d, B:432:0x0666, B:437:0x06ea, B:439:0x0700, B:440:0x073e, B:442:0x01bf, B:444:0x01d9, B:445:0x020f), top: B:2:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x1746  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x15d1  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x136a A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:9:0x0124, B:11:0x013e, B:12:0x0172, B:13:0x0216, B:21:0x05b4, B:23:0x05cb, B:24:0x0604, B:35:0x0816, B:37:0x0837, B:38:0x0878, B:39:0x0929, B:51:0x0deb, B:53:0x0e07, B:54:0x0e42, B:64:0x0f7a, B:66:0x0f8f, B:67:0x0fcb, B:78:0x11fb, B:80:0x121c, B:81:0x127a, B:82:0x1460, B:84:0x146f, B:85:0x14a0, B:87:0x14bc, B:88:0x14f0, B:90:0x14ff, B:92:0x150e, B:93:0x153b, B:95:0x1567, B:96:0x15c9, B:116:0x1965, B:118:0x1986, B:119:0x19c7, B:124:0x1b90, B:126:0x1bad, B:127:0x1bed, B:136:0x1d9e, B:138:0x1db8, B:139:0x1def, B:140:0x1e92, B:148:0x23b5, B:150:0x23cd, B:151:0x2404, B:158:0x25f1, B:160:0x2612, B:161:0x264f, B:165:0x279b, B:167:0x27b8, B:168:0x27fd, B:177:0x29ef, B:179:0x2a10, B:180:0x2a51, B:185:0x2c50, B:187:0x2c6d, B:188:0x2ca9, B:192:0x2cc6, B:194:0x2cd9, B:195:0x2d0d, B:197:0x2d17, B:199:0x2d2a, B:200:0x2d63, B:204:0x2de4, B:206:0x2e01, B:207:0x2e3e, B:242:0x28b6, B:244:0x28d3, B:245:0x2918, B:246:0x265c, B:248:0x2682, B:249:0x26d5, B:258:0x2417, B:260:0x242d, B:261:0x2466, B:265:0x24e9, B:267:0x24ff, B:268:0x2539, B:271:0x1e38, B:273:0x1e52, B:274:0x1e8b, B:305:0x1c84, B:307:0x1ca1, B:308:0x1cdf, B:310:0x1a14, B:312:0x1a35, B:313:0x1a72, B:314:0x1a7f, B:316:0x1a9b, B:317:0x1ad1, B:348:0x1636, B:350:0x1645, B:351:0x1676, B:353:0x16a2, B:354:0x1704, B:356:0x12c3, B:358:0x12e4, B:359:0x133e, B:362:0x1347, B:364:0x136a, B:365:0x13bb, B:374:0x0fda, B:376:0x0ff0, B:377:0x1026, B:381:0x10c2, B:383:0x10d8, B:384:0x1112, B:399:0x08c1, B:401:0x08e2, B:402:0x0922, B:429:0x0617, B:431:0x062d, B:432:0x0666, B:437:0x06ea, B:439:0x0700, B:440:0x073e, B:442:0x01bf, B:444:0x01d9, B:445:0x020f), top: B:2:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0cd9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0d52  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0f65  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x1156  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x146f A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:9:0x0124, B:11:0x013e, B:12:0x0172, B:13:0x0216, B:21:0x05b4, B:23:0x05cb, B:24:0x0604, B:35:0x0816, B:37:0x0837, B:38:0x0878, B:39:0x0929, B:51:0x0deb, B:53:0x0e07, B:54:0x0e42, B:64:0x0f7a, B:66:0x0f8f, B:67:0x0fcb, B:78:0x11fb, B:80:0x121c, B:81:0x127a, B:82:0x1460, B:84:0x146f, B:85:0x14a0, B:87:0x14bc, B:88:0x14f0, B:90:0x14ff, B:92:0x150e, B:93:0x153b, B:95:0x1567, B:96:0x15c9, B:116:0x1965, B:118:0x1986, B:119:0x19c7, B:124:0x1b90, B:126:0x1bad, B:127:0x1bed, B:136:0x1d9e, B:138:0x1db8, B:139:0x1def, B:140:0x1e92, B:148:0x23b5, B:150:0x23cd, B:151:0x2404, B:158:0x25f1, B:160:0x2612, B:161:0x264f, B:165:0x279b, B:167:0x27b8, B:168:0x27fd, B:177:0x29ef, B:179:0x2a10, B:180:0x2a51, B:185:0x2c50, B:187:0x2c6d, B:188:0x2ca9, B:192:0x2cc6, B:194:0x2cd9, B:195:0x2d0d, B:197:0x2d17, B:199:0x2d2a, B:200:0x2d63, B:204:0x2de4, B:206:0x2e01, B:207:0x2e3e, B:242:0x28b6, B:244:0x28d3, B:245:0x2918, B:246:0x265c, B:248:0x2682, B:249:0x26d5, B:258:0x2417, B:260:0x242d, B:261:0x2466, B:265:0x24e9, B:267:0x24ff, B:268:0x2539, B:271:0x1e38, B:273:0x1e52, B:274:0x1e8b, B:305:0x1c84, B:307:0x1ca1, B:308:0x1cdf, B:310:0x1a14, B:312:0x1a35, B:313:0x1a72, B:314:0x1a7f, B:316:0x1a9b, B:317:0x1ad1, B:348:0x1636, B:350:0x1645, B:351:0x1676, B:353:0x16a2, B:354:0x1704, B:356:0x12c3, B:358:0x12e4, B:359:0x133e, B:362:0x1347, B:364:0x136a, B:365:0x13bb, B:374:0x0fda, B:376:0x0ff0, B:377:0x1026, B:381:0x10c2, B:383:0x10d8, B:384:0x1112, B:399:0x08c1, B:401:0x08e2, B:402:0x0922, B:429:0x0617, B:431:0x062d, B:432:0x0666, B:437:0x06ea, B:439:0x0700, B:440:0x073e, B:442:0x01bf, B:444:0x01d9, B:445:0x020f), top: B:2:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x14bc A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:9:0x0124, B:11:0x013e, B:12:0x0172, B:13:0x0216, B:21:0x05b4, B:23:0x05cb, B:24:0x0604, B:35:0x0816, B:37:0x0837, B:38:0x0878, B:39:0x0929, B:51:0x0deb, B:53:0x0e07, B:54:0x0e42, B:64:0x0f7a, B:66:0x0f8f, B:67:0x0fcb, B:78:0x11fb, B:80:0x121c, B:81:0x127a, B:82:0x1460, B:84:0x146f, B:85:0x14a0, B:87:0x14bc, B:88:0x14f0, B:90:0x14ff, B:92:0x150e, B:93:0x153b, B:95:0x1567, B:96:0x15c9, B:116:0x1965, B:118:0x1986, B:119:0x19c7, B:124:0x1b90, B:126:0x1bad, B:127:0x1bed, B:136:0x1d9e, B:138:0x1db8, B:139:0x1def, B:140:0x1e92, B:148:0x23b5, B:150:0x23cd, B:151:0x2404, B:158:0x25f1, B:160:0x2612, B:161:0x264f, B:165:0x279b, B:167:0x27b8, B:168:0x27fd, B:177:0x29ef, B:179:0x2a10, B:180:0x2a51, B:185:0x2c50, B:187:0x2c6d, B:188:0x2ca9, B:192:0x2cc6, B:194:0x2cd9, B:195:0x2d0d, B:197:0x2d17, B:199:0x2d2a, B:200:0x2d63, B:204:0x2de4, B:206:0x2e01, B:207:0x2e3e, B:242:0x28b6, B:244:0x28d3, B:245:0x2918, B:246:0x265c, B:248:0x2682, B:249:0x26d5, B:258:0x2417, B:260:0x242d, B:261:0x2466, B:265:0x24e9, B:267:0x24ff, B:268:0x2539, B:271:0x1e38, B:273:0x1e52, B:274:0x1e8b, B:305:0x1c84, B:307:0x1ca1, B:308:0x1cdf, B:310:0x1a14, B:312:0x1a35, B:313:0x1a72, B:314:0x1a7f, B:316:0x1a9b, B:317:0x1ad1, B:348:0x1636, B:350:0x1645, B:351:0x1676, B:353:0x16a2, B:354:0x1704, B:356:0x12c3, B:358:0x12e4, B:359:0x133e, B:362:0x1347, B:364:0x136a, B:365:0x13bb, B:374:0x0fda, B:376:0x0ff0, B:377:0x1026, B:381:0x10c2, B:383:0x10d8, B:384:0x1112, B:399:0x08c1, B:401:0x08e2, B:402:0x0922, B:429:0x0617, B:431:0x062d, B:432:0x0666, B:437:0x06ea, B:439:0x0700, B:440:0x073e, B:442:0x01bf, B:444:0x01d9, B:445:0x020f), top: B:2:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x14ff A[Catch: all -> 0x0221, TryCatch #1 {all -> 0x0221, blocks: (B:9:0x0124, B:11:0x013e, B:12:0x0172, B:13:0x0216, B:21:0x05b4, B:23:0x05cb, B:24:0x0604, B:35:0x0816, B:37:0x0837, B:38:0x0878, B:39:0x0929, B:51:0x0deb, B:53:0x0e07, B:54:0x0e42, B:64:0x0f7a, B:66:0x0f8f, B:67:0x0fcb, B:78:0x11fb, B:80:0x121c, B:81:0x127a, B:82:0x1460, B:84:0x146f, B:85:0x14a0, B:87:0x14bc, B:88:0x14f0, B:90:0x14ff, B:92:0x150e, B:93:0x153b, B:95:0x1567, B:96:0x15c9, B:116:0x1965, B:118:0x1986, B:119:0x19c7, B:124:0x1b90, B:126:0x1bad, B:127:0x1bed, B:136:0x1d9e, B:138:0x1db8, B:139:0x1def, B:140:0x1e92, B:148:0x23b5, B:150:0x23cd, B:151:0x2404, B:158:0x25f1, B:160:0x2612, B:161:0x264f, B:165:0x279b, B:167:0x27b8, B:168:0x27fd, B:177:0x29ef, B:179:0x2a10, B:180:0x2a51, B:185:0x2c50, B:187:0x2c6d, B:188:0x2ca9, B:192:0x2cc6, B:194:0x2cd9, B:195:0x2d0d, B:197:0x2d17, B:199:0x2d2a, B:200:0x2d63, B:204:0x2de4, B:206:0x2e01, B:207:0x2e3e, B:242:0x28b6, B:244:0x28d3, B:245:0x2918, B:246:0x265c, B:248:0x2682, B:249:0x26d5, B:258:0x2417, B:260:0x242d, B:261:0x2466, B:265:0x24e9, B:267:0x24ff, B:268:0x2539, B:271:0x1e38, B:273:0x1e52, B:274:0x1e8b, B:305:0x1c84, B:307:0x1ca1, B:308:0x1cdf, B:310:0x1a14, B:312:0x1a35, B:313:0x1a72, B:314:0x1a7f, B:316:0x1a9b, B:317:0x1ad1, B:348:0x1636, B:350:0x1645, B:351:0x1676, B:353:0x16a2, B:354:0x1704, B:356:0x12c3, B:358:0x12e4, B:359:0x133e, B:362:0x1347, B:364:0x136a, B:365:0x13bb, B:374:0x0fda, B:376:0x0ff0, B:377:0x1026, B:381:0x10c2, B:383:0x10d8, B:384:0x1112, B:399:0x08c1, B:401:0x08e2, B:402:0x0922, B:429:0x0617, B:431:0x062d, B:432:0x0666, B:437:0x06ea, B:439:0x0700, B:440:0x073e, B:442:0x01bf, B:444:0x01d9, B:445:0x020f), top: B:2:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x170e  */
    @Override // android.nfc.cardemulation.HostApduService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeactivated(int i) {
        java.lang.Boolean bool;
        java.lang.Integer num;
        java.lang.String str;
        java.lang.Integer num2;
        java.lang.Object[] objArr;
        java.lang.Long valueOf2;
        java.lang.reflect.Field field;
        java.lang.String str2;
        java.lang.Integer num3;
        java.lang.String str3;
        java.lang.Throwable cause;
        java.lang.String str4;
        java.lang.Integer num4;
        java.lang.String str5;
        java.lang.String str6;
        int i2;
        java.lang.Integer num5;
        java.lang.String str7;
        byte[] bArr;
        java.lang.Object[] objArr2;
        java.lang.String str8;
        char c;
        com.payair.hce.setHandwritingDelegatorCallback sethandwritingdelegatorcallback;
        long j;
        java.lang.Integer num6;
        java.lang.String str9;
        java.lang.Object[] objArr3;
        char c2;
        char c3;
        int i3;
        long j2;
        java.lang.Object obj;
        java.lang.Object invoke;
        java.lang.Object obj2;
        int intValue;
        java.lang.Object obj3;
        int intValue2;
        com.payair.hce.setSelector setselector;
        byte[] bArr2;
        long j3;
        java.lang.Object obj4;
        java.lang.Object[] AlternateContactlessPaymentDataJson$5f5b6fcf;
        char c4;
        char c5;
        int i4;
        int i5;
        long j4;
        android.content.Context baseContext;
        java.lang.String str10;
        java.lang.Integer num7;
        java.lang.Object[] objArr4;
        java.lang.String str11;
        java.lang.Object[] objArr5;
        java.lang.Long valueOf3;
        java.lang.Class cls;
        java.lang.Object obj5;
        int i6;
        int i7;
        long j5;
        java.lang.Object obj6;
        java.lang.Object[] objArr6;
        char c6;
        char c7;
        int i8;
        int i9;
        long j6;
        android.content.Context baseContext2;
        java.lang.Object[] objArr7;
        char c8;
        int i10;
        int i11;
        int i12;
        java.lang.Object invoke2;
        java.lang.String str12;
        java.lang.Object invoke3;
        java.lang.Object invoke4;
        int i13 = getGpoResponse;
        int i14 = (i13 | 27) << 1;
        int i15 = -(i13 ^ 27);
        getCiacDecline = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
        int i16 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        int i17 = i16 ^ 6462;
        int i18 = ((i16 & 6462) | i17) << 1;
        int i19 = -i17;
        char c9 = (char) (((i18 | i19) << 1) - (i18 ^ i19));
        int i20 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(c9, ((i20 | 21) << 1) - (i20 ^ 21), android.graphics.Color.blue(0), objArr8);
        java.lang.String str13 = (java.lang.String) objArr8[0];
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        b(125 - (~(-(~(-android.text.TextUtils.getOffsetBefore("", 0))))), null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr9);
        java.lang.String str14 = (java.lang.String) objArr9[0];
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 51, 583 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.text.TextUtils.getTrimmedLength("") + 24291));
        byte[] bArr3 = $$a;
        byte b = bArr3[18];
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        d(b, b, (short) 24, objArr10);
        long j7 = cls2.getField((java.lang.String) objArr10[0]).getLong(null);
        try {
            try {
                if (j7 == -1 || j7 + 1934 < ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                    bool = bool2;
                    android.content.Context baseContext3 = getBaseContext();
                    if (baseContext3 == null) {
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b(127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), null, null, "\u0086\u0083\u0081\u008c\u0094\u0093\u0092\u0088\u0089\u0091\u0089\u0088\u0090\u008f\u008e\u0084\u0084\u0083\u008e\u0086\u0089\u008d\u008c\u0086\u008b\u0083", objArr11);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                        char packedPositionType = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int i21 = (lastIndexOf | 19) << 1;
                        int i22 = -(lastIndexOf ^ 19);
                        num = 1;
                        int i23 = -android.text.TextUtils.getOffsetBefore("", 0);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(packedPositionType, (i21 & i22) + (i21 | i22), (((~i23) & 22) | (i23 & (-23))) + ((i23 & 22) << 1), objArr12);
                        baseContext3 = (android.content.Context) cls3.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(null, null);
                    } else {
                        num = 1;
                    }
                    if (baseContext3 != null) {
                        int i24 = ~i;
                        int i25 = (i24 | i) & i24;
                        int i26 = ~((648618245 & i25) | (648618245 ^ i25));
                        int i27 = (-1046966925) ^ i;
                        int i28 = (-1046966925) & i;
                        int i29 = ~((i27 & i28) | (i27 ^ i28));
                        int i30 = i26 ^ i29;
                        int i31 = i26 & i29;
                        int i32 = -(-(((i31 ^ i30) | (i30 & i31)) * com.visa.cbp.getCertUsage.getODAData));
                        int i33 = ((-1201708769) & i32) + (i32 | (-1201708769));
                        int i34 = ~((648618245 & i) | (648618245 ^ i));
                        int i35 = (-1046966925) & i25;
                        int i36 = (~i35) & (i25 | (-1046966925));
                        int i37 = ~((i36 ^ i35) | (i35 & i36));
                        int i38 = -(-(((i34 ^ i37) | (i34 & i37)) * com.visa.cbp.getCertUsage.getODAData));
                        int i39 = (-1181694150) ^ i24;
                        int i40 = i24 & (-1181694150);
                        int i41 = (i39 & i40) | (i39 ^ i40);
                        int i42 = ~i41;
                        int i43 = (i41 | i42) & i42;
                        int i44 = 161612201 & i;
                        str = "valueOf";
                        int i45 = (~i44) & (i | 161612201);
                        int i46 = ~((i45 ^ i44) | (i45 & i44));
                        num2 = 994792440;
                        int i47 = ((~i46) & i43) | ((~i43) & i46);
                        int i48 = i46 & i43;
                        int i49 = ((i48 ^ i47) | (i48 & i47)) * (-370);
                        int i50 = 493280289 & i49;
                        int i51 = ((493280289 ^ i49) | i50) << 1;
                        int i52 = -((i49 | 493280289) & (~i50));
                        int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                        int i54 = ~((161612201 & i25) | (i25 ^ 161612201));
                        int i55 = i40 | (1181694149 & i);
                        int i56 = (-1181694150) & i;
                        int i57 = ~((i55 ^ i56) | (i55 & i56));
                        int i58 = (i57 ^ i54) | (i54 & i57);
                        int i59 = -(-(((i58 ^ 159383848) | (159383848 & i58)) * (-370)));
                        int i60 = ((~i59) & i53) | ((~i53) & i59);
                        int i61 = (i59 & i53) << 1;
                        int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                        if (((i33 ^ i38) - (~((i33 & i38) << 1))) - 1 > (((-1157518384) | i62) << 1) - ((-1157518384) ^ i62)) {
                            baseContext3.getApplicationContext();
                            throw null;
                        }
                        baseContext3 = baseContext3.getApplicationContext();
                        int i63 = getGpoResponse + 79;
                        getCiacDecline = i63 % 128;
                        if (i63 % 2 == 0) {
                            int i64 = 2 / 2;
                        }
                    } else {
                        str = "valueOf";
                        num2 = 994792440;
                    }
                    int i65 = getCiacDecline;
                    int i66 = i65 & 117;
                    int i67 = (i65 ^ 117) | i66;
                    int i68 = (((i66 | i67) << 1) - (i67 ^ i66)) % 128;
                    getGpoResponse = i68;
                    getCiacDecline = (((i68 | 73) << 1) - (i68 ^ 73)) % 128;
                    try {
                        java.lang.Object[] objArr13 = {baseContext3, java.lang.Integer.valueOf(i), -135973018};
                        byte b2 = $$d[49];
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        e(b2, (short) (b2 | com.visa.cbp.getEncExpo.startTransaction), r4[130], objArr14);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        e(r4[30], (short) ($$e | 400), r4[279], objArr15);
                        java.lang.String str15 = (java.lang.String) objArr15[0];
                        char keyRepeatDelay = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i69 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int i70 = (-198277379) & i69;
                        int i71 = i69 | (-198277379);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        c("︰⺆⫴ⷮ", keyRepeatDelay, "ꒈ폾\uf4b8⥱똱Ș曜쟏揈磦\uf726ꐷ㽐둁脽㯣㻕嫄踻廥蠏本ጣ", "\u0000\u0000\u0000\u0000", (i70 & i71) + (i71 | i70), objArr16);
                        java.lang.Object[] objArr17 = (java.lang.Object[]) cls4.getMethod(str15, java.lang.Class.forName((java.lang.String) objArr16[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr13);
                        if (baseContext3 != null) {
                            int i72 = getGpoResponse + 20;
                            int i73 = (~i72) + (i72 << 1);
                            getCiacDecline = i73 % 128;
                            try {
                                if (i73 % 2 == 0) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 52, 585 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 24292));
                                    byte b3 = bArr3[5];
                                    byte b4 = bArr3[60];
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    d(b3, b4, (byte) (b4 | com.google.common.base.Ascii.CAN), objArr18);
                                    cls5.getField((java.lang.String) objArr18[0]).set(null, objArr17);
                                    valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[1]).invoke(null, new java.lang.Object[0])).longValue());
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 584, (char) (24291 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                                    byte b5 = bArr3[18];
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    d(b5, b5, (short) 24, objArr19);
                                    field = cls6.getField((java.lang.String) objArr19[0]);
                                } else {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 583, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 24291));
                                    byte b6 = bArr3[5];
                                    byte b7 = bArr3[60];
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    d(b6, b7, (byte) (b7 | com.google.common.base.Ascii.CAN), objArr20);
                                    cls7.getField((java.lang.String) objArr20[0]).set(null, objArr17);
                                    valueOf2 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 52, 584 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (24291 - android.text.TextUtils.getCapsMode("", 0, 0)));
                                    byte b8 = bArr3[18];
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    d(b8, b8, (short) 24, objArr21);
                                    field = cls8.getField((java.lang.String) objArr21[0]);
                                }
                                field.set(null, valueOf2);
                            } catch (java.lang.Exception unused) {
                                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                            }
                        }
                        objArr = objArr17;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause2 = th.getCause();
                        if (cause2 == null) {
                            throw th;
                        }
                        throw cause2;
                    }
                } else {
                    int i74 = getCiacDecline;
                    int i75 = i74 & 75;
                    int i76 = (i74 ^ 75) | i75;
                    int i77 = (i75 & i76) + (i76 | i75);
                    getGpoResponse = i77 % 128;
                    if (i77 % 2 != 0) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 584, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 24292));
                        byte b9 = bArr3[5];
                        byte b10 = bArr3[60];
                        bool = bool2;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        d(b9, b10, (byte) (b10 | com.google.common.base.Ascii.CAN), objArr22);
                        java.lang.Object[] objArr23 = {cls9.getField((java.lang.String) objArr22[0]).get(null), -135973018, 0};
                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj7 == null) {
                            obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 30, android.view.View.combineMeasuredStates(0, 0) + 4830, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj7);
                        }
                        invoke4 = ((java.lang.reflect.Method) obj7).invoke(null, objArr23);
                    } else {
                        bool = bool2;
                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 584, (char) (24291 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                        byte b11 = bArr3[5];
                        byte b12 = bArr3[60];
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        d(b11, b12, (byte) (b12 | com.google.common.base.Ascii.CAN), objArr24);
                        java.lang.Object[] objArr25 = {cls10.getField((java.lang.String) objArr24[0]).get(null), -135973018, 0};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                        if (obj8 == null) {
                            obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 31, 4830 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj8);
                        }
                        invoke4 = ((java.lang.reflect.Method) obj8).invoke(null, objArr25);
                    }
                    objArr = (java.lang.Object[]) invoke4;
                    num = 1;
                    str = "valueOf";
                    num2 = 994792440;
                }
                int i78 = ((int[]) objArr[1])[0];
                int i79 = ((int[]) objArr[0])[0];
                if (i79 == i78) {
                    int i80 = getGpoResponse;
                    int i81 = (i80 ^ 103) + ((i80 & 103) << 1);
                    getCiacDecline = i81 % 128;
                    if (i81 % 2 == 0) {
                        java.lang.Object[] objArr26 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[2])[1]), 0};
                        num3 = num2;
                        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                        if (obj9 == null) {
                            str2 = str;
                            obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 30, 4830 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod(str2, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj9);
                        } else {
                            str2 = str;
                        }
                        ((java.lang.reflect.Method) obj9).invoke(null, objArr26);
                    } else {
                        str2 = str;
                        num3 = num2;
                        java.lang.Object[] objArr27 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[3])[0]), 0};
                        java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                        if (obj10 == null) {
                            obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, 4830 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod(str2, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj10);
                        }
                        ((java.lang.reflect.Method) obj10).invoke(null, objArr27);
                    }
                    str3 = "";
                } else {
                    str2 = str;
                    num3 = num2;
                    int i82 = i78 & i79;
                    try {
                        java.lang.Object[] objArr28 = {java.lang.Long.valueOf(((~i82) & ((i78 ^ i79) | i82)) ^ 8598560574252515328L), 2002008397L};
                        byte[] bArr4 = $$d;
                        byte b13 = bArr4[49];
                        int i83 = $$e;
                        str3 = "";
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        e(b13, (short) (i83 | 618), bArr4[237], objArr29);
                        java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        e((byte) (-bArr4[156]), (short) (i83 | 578), bArr4[843], objArr30);
                        cls11.getMethod((java.lang.String) objArr30[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr28);
                        java.lang.Object[] objArr31 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[3])[0]), 0};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                        if (obj11 == null) {
                            obj11 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4830, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getMethod(str2, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj11);
                        }
                        ((java.lang.reflect.Method) obj11).invoke(null, objArr31);
                    } catch (java.lang.Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                        }
                    }
                }
                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-16775635) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                byte b14 = bArr3[18];
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                d(b14, b14, (short) 24, objArr32);
                long j8 = cls12.getField((java.lang.String) objArr32[0]).getLong(null);
                try {
                    try {
                        try {
                            if (j8 != -1) {
                                int i84 = getCiacDecline + 37;
                                getGpoResponse = i84 % 128;
                                if (i84 % 2 == 0 ? j8 + 1856 >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : (j8 | 1856) >= ((java.lang.Long) java.lang.Class.forName(str13).getDeclaredMethod(str14, new java.lang.Class[1]).invoke(null, new java.lang.Object[1])).longValue()) {
                                    int i85 = getCiacDecline + 111;
                                    getGpoResponse = i85 % 128;
                                    if (i85 % 2 != 0) {
                                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str3) + 48, android.view.View.MeasureSpec.getMode(0) + 1581, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr3[26], bArr3[5], objArr33);
                                        java.lang.Object[] objArr34 = {cls13.getField((java.lang.String) objArr33[0]).get(null), 868393350, num};
                                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                        if (obj12 == null) {
                                            str12 = str3;
                                            obj12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 35, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4857, (char) android.text.TextUtils.indexOf(str12, str12, 0, 0))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj12);
                                        } else {
                                            str12 = str3;
                                        }
                                        invoke3 = ((java.lang.reflect.Method) obj12).invoke(null, objArr34);
                                    } else {
                                        str12 = str3;
                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.red(0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1582, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr3[26], bArr3[5], objArr35);
                                        java.lang.Object[] objArr36 = {cls14.getField((java.lang.String) objArr35[0]).get(null), 868393350, 0};
                                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                                        if (obj13 == null) {
                                            obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 4905 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.os.Process.myTid() >> 22))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj13);
                                        }
                                        invoke3 = ((java.lang.reflect.Method) obj13).invoke(null, objArr36);
                                    }
                                    objArr2 = (java.lang.Object[]) invoke3;
                                    str7 = str13;
                                    str8 = str12;
                                    num4 = num3;
                                    str5 = str2;
                                    num5 = 0;
                                    bArr = bArr3;
                                    c = 1;
                                    i2 = i;
                                    if (((int[]) objArr2[0])[0] != ((int[]) objArr2[c])[0]) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add((java.lang.String) objArr2[2]);
                                        arrayList.add((java.lang.String) objArr2[3]);
                                        int i86 = getGpoResponse;
                                        int i87 = i86 & 71;
                                        getCiacDecline = ((((i86 | 71) & (~i87)) - (~(i87 << 1))) - 1) % 128;
                                    }
                                    sethandwritingdelegatorcallback = (com.payair.hce.setHandwritingDelegatorCallback) writeReplace(new java.lang.Object[]{this}, -1759117460, 1759117460, java.lang.System.identityHashCode(this));
                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 583 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (24291 - android.text.TextUtils.getTrimmedLength(str8)));
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr37);
                                    j = cls15.getField((java.lang.String) objArr37[0]).getLong(null);
                                    if (j != -1) {
                                        int i88 = getGpoResponse;
                                        int i89 = ((i88 ^ 121) | (i88 & 121)) << 1;
                                        int i90 = -((i88 & (-122)) | ((~i88) & 121));
                                        int i91 = (i89 & i90) + (i90 | i89);
                                        getCiacDecline = i91 % 128;
                                        if (i91 % 2 != 0 ? j + 2006 >= ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j + 2006 >= ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) {
                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 50, 584 - android.graphics.Color.red(0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24290));
                                            byte b15 = (byte) (-bArr[17]);
                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                            d(b15, b15, (short) 75, objArr38);
                                            java.lang.Object[] objArr39 = {cls16.getField((java.lang.String) objArr38[0]).get(null), -23138150, num5};
                                            num6 = num4;
                                            java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                            if (obj14 == null) {
                                                str9 = str5;
                                                obj14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.View.getDefaultSize(0, 0), (-16772386) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, obj14);
                                            } else {
                                                str9 = str5;
                                            }
                                            objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) obj14).invoke(null, objArr39);
                                            int i92 = getGpoResponse;
                                            int i93 = ((i92 ^ 44) + ((i92 & 44) << 1)) - 1;
                                            getCiacDecline = i93 % 128;
                                            if (i93 % 2 == 0) {
                                                int i94 = 3 / 5;
                                            }
                                            c2 = 1;
                                            c3 = 0;
                                            i3 = ((int[]) objArr3[c2])[c3];
                                            if (((int[]) objArr3[c3])[c3] == i3) {
                                                int i95 = getCiacDecline + 119;
                                                getGpoResponse = i95 % 128;
                                                if (i95 % 2 != 0) {
                                                    java.lang.Object[] objArr40 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[4])[1]), num};
                                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                                    if (obj15 == null) {
                                                        obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29, (android.os.Process.myPid() >> 22) + 4830, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, obj15);
                                                    }
                                                    ((java.lang.reflect.Method) obj15).invoke(null, objArr40);
                                                } else {
                                                    java.lang.Object[] objArr41 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[3])[0]), num5};
                                                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                                    if (obj16 == null) {
                                                        obj16 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 4830 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, obj16);
                                                    }
                                                    ((java.lang.reflect.Method) obj16).invoke(null, objArr41);
                                                }
                                                int i96 = getGpoResponse;
                                                int i97 = i96 & 69;
                                                int i98 = (i96 | 69) & (~i97);
                                                int i99 = -(-(i97 << 1));
                                                getCiacDecline = ((i98 ^ i99) + ((i98 & i99) << 1)) % 128;
                                            } else {
                                                new java.util.ArrayList().add((java.lang.String) objArr3[2]);
                                                java.lang.Object[] objArr42 = {java.lang.Long.valueOf(7294267946640080896L ^ ((i3 & (~r6)) | ((~i3) & r6))), 1698329117L};
                                                byte[] bArr5 = $$d;
                                                byte b16 = bArr5[49];
                                                int i100 = $$e;
                                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                e(b16, (short) (i100 | 618), bArr5[237], objArr43);
                                                java.lang.Class<?> cls17 = java.lang.Class.forName((java.lang.String) objArr43[0]);
                                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                e((byte) (-bArr5[156]), (short) (i100 | 578), bArr5[843], objArr44);
                                                cls17.getMethod((java.lang.String) objArr44[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr42);
                                                java.lang.Object[] objArr45 = {objArr3, java.lang.Integer.valueOf(((int[]) objArr3[3])[0]), num5};
                                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                                if (obj17 == null) {
                                                    obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4830, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, obj17);
                                                }
                                                ((java.lang.reflect.Method) obj17).invoke(null, objArr45);
                                            }
                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.os.Process.getGidForName(str8), 754 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (45559 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr46);
                                            j2 = cls18.getField((java.lang.String) objArr46[0]).getLong(null);
                                            if (j2 != -1) {
                                                int i101 = getGpoResponse;
                                                int i102 = i101 & 87;
                                                int i103 = i102 + ((i101 ^ 87) | i102);
                                                getCiacDecline = i103 % 128;
                                                if (i103 % 2 != 0 ? j2 + 1932 >= ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue() : j2 * 1932 >= ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                    int i104 = getGpoResponse;
                                                    int i105 = (((i104 ^ 39) | (i104 & 39)) << 1) - ((i104 & (-40)) | ((~i104) & 39));
                                                    getCiacDecline = i105 % 128;
                                                    if (i105 % 2 == 0) {
                                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.MotionEvent.axisFromString(str8), android.view.View.getDefaultSize(0, 0) + 754, (char) (45560 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                                                        byte b17 = bArr[5];
                                                        byte b18 = bArr[60];
                                                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                        d(b17, b18, (byte) (b18 | com.google.common.base.Ascii.CAN), objArr47);
                                                        java.lang.Object[] objArr48 = {cls19.getField((java.lang.String) objArr47[0]).get(null), -795427739, num5};
                                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                        if (obj18 == null) {
                                                            obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.green(0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4790, (char) (31152 - android.graphics.Color.red(0)))).getMethod(str9, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4750, (char) (33701 - android.view.View.resolveSizeAndState(0, 0, 0))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj18);
                                                        }
                                                        invoke = ((java.lang.reflect.Method) obj18).invoke(null, objArr48);
                                                    } else {
                                                        java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str8, 0, 0) + 47, 754 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 45561));
                                                        byte b19 = bArr[5];
                                                        byte b20 = bArr[60];
                                                        java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                        d(b19, b20, (byte) (b20 | com.google.common.base.Ascii.CAN), objArr49);
                                                        java.lang.Object[] objArr50 = {cls20.getField((java.lang.String) objArr49[0]).get(null), -795427739, num5};
                                                        java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                        if (obj19 == null) {
                                                            obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 4790, (char) (android.text.TextUtils.getCapsMode(str8, 0, 0) + 31152))).getMethod(str9, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str8, str8) + 40, 4750 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (33701 - android.widget.ExpandableListView.getPackedPositionType(0L))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj19);
                                                        }
                                                        invoke = ((java.lang.reflect.Method) obj19).invoke(null, objArr50);
                                                    }
                                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                                    if (obj2 == null) {
                                                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 41, android.view.View.getDefaultSize(0, 0) + 4750, (char) (android.text.TextUtils.indexOf(str8, str8) + 33701))).getMethod("values", null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj2);
                                                    }
                                                    intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(invoke, null)).intValue();
                                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                                    if (obj3 == null) {
                                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4750, (char) ((android.os.Process.myTid() >> 22) + 33701))).getMethod("DigitizedCardProfile", null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj3);
                                                    }
                                                    intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(invoke, null)).intValue();
                                                    if (intValue2 != intValue) {
                                                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                        if (obj20 == null) {
                                                            obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.blue(0), 4750 - android.text.TextUtils.indexOf(str8, str8), (char) (33701 - android.text.TextUtils.indexOf(str8, str8, 0, 0)))).getMethod(str9, null);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj20);
                                                        }
                                                        java.lang.Object[] objArr51 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(invoke, null)).intValue()), num5};
                                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                        if (obj21 == null) {
                                                            obj21 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 41, 4790 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31152))).getMethod(str9, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.combineMeasuredStates(0, 0), 4751 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj21);
                                                        }
                                                        ((java.lang.reflect.Method) obj21).invoke(null, objArr51);
                                                    } else {
                                                        int i106 = intValue & intValue2;
                                                        java.lang.Object[] objArr52 = {java.lang.Long.valueOf((((intValue ^ intValue2) | i106) & (~i106)) ^ 1624996276531625984L), 378350977L};
                                                        byte b21 = $$d[49];
                                                        int i107 = $$e;
                                                        short s = (short) (i107 | 559);
                                                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                        e(b21, s, (byte) (s & 247), objArr53);
                                                        java.lang.Class<?> cls21 = java.lang.Class.forName((java.lang.String) objArr53[0]);
                                                        byte b22 = (byte) i107;
                                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                        e(b22, (short) (b22 | 710), r4[121], objArr54);
                                                        cls21.getMethod((java.lang.String) objArr54[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr52);
                                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                                        if (obj22 == null) {
                                                            obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 4750 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (33700 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod(str9, null);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj22);
                                                        }
                                                        java.lang.Object[] objArr55 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(invoke, null)).intValue()), num5};
                                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                                        if (obj23 == null) {
                                                            obj23 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 4790 - android.text.TextUtils.indexOf(str8, str8, 0), (char) (31153 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod(str9, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4749, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33700)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj23);
                                                        }
                                                        ((java.lang.reflect.Method) obj23).invoke(null, objArr55);
                                                    }
                                                    if (sethandwritingdelegatorcallback != com.payair.hce.setHandwritingDelegatorCallback.writeReplace) {
                                                        com.payair.hce.getText gettext = values;
                                                        if (gettext != null) {
                                                            int i108 = getCiacDecline;
                                                            int i109 = (((i108 | 121) << 1) - (i108 ^ 121)) % 128;
                                                            getGpoResponse = i109;
                                                            if (i2 == 0) {
                                                                int i110 = (i109 & 105) + (i109 | 105);
                                                                getCiacDecline = i110 % 128;
                                                                if (i110 % 2 == 0) {
                                                                    gettext.values();
                                                                    throw null;
                                                                }
                                                                gettext.values();
                                                                int i111 = getCiacDecline;
                                                                getGpoResponse = ((((i111 | 22) << 1) - (i111 ^ 22)) - 1) % 128;
                                                            }
                                                        }
                                                    } else if (sethandwritingdelegatorcallback == com.payair.hce.setHandwritingDelegatorCallback.values && (setselector = (com.payair.hce.setSelector) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], 1953461450, -1953461436, (int) java.lang.System.currentTimeMillis())) != null) {
                                                        int i112 = getCiacDecline;
                                                        int i113 = i112 & 61;
                                                        int i114 = -(-(i112 | 61));
                                                        int i115 = (i113 & i114) + (i114 | i113);
                                                        getGpoResponse = i115 % 128;
                                                        if (i115 % 2 != 0) {
                                                            ((com.payair.hce.HCEEventListener) com.payair.hce.setAccessibilityHeading.valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).ignoreFailedTransaction();
                                                            throw new java.lang.ArithmeticException();
                                                        }
                                                        if (((com.payair.hce.HCEEventListener) com.payair.hce.setAccessibilityHeading.valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).ignoreFailedTransaction()) {
                                                            ((com.payair.hce.HCEEventListener) com.payair.hce.setAccessibilityHeading.valueOf(new java.lang.Object[0], 656433788, -656433763, (int) java.lang.System.currentTimeMillis())).transactionCanBeResumed();
                                                        } else {
                                                            int i116 = getCiacDecline;
                                                            int i117 = ((i116 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) + (i116 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) - 1;
                                                            getGpoResponse = i117 % 128;
                                                            if (i117 % 2 != 0) {
                                                                throw null;
                                                            }
                                                            boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setSelector.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselector, valueOf}, 2065105571, -2065105571, java.lang.System.identityHashCode(setselector))).booleanValue();
                                                            java.lang.String str16 = (java.lang.String) com.payair.hce.setWebChromeClient.values(new java.lang.Object[0], -650477225, 650477228, (int) java.lang.System.currentTimeMillis());
                                                            if (str16 != null) {
                                                                bArr2 = str16.getBytes();
                                                            } else {
                                                                bArr2 = new byte[0];
                                                                int i118 = getGpoResponse;
                                                                int i119 = (i118 ^ 21) + ((i118 & 21) << 1);
                                                                getCiacDecline = i119 % 128;
                                                                int i120 = i119 % 2;
                                                            }
                                                            writeReplace(new java.lang.Object[]{java.lang.Boolean.valueOf(booleanValue), bArr2}, -1626000362, 1626000363, (int) java.lang.System.currentTimeMillis());
                                                            java.lang.Boolean bool3 = bool;
                                                            com.payair.hce.setSelector.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselector, valueOf, bool3}, -1928806931, 1928806932, java.lang.System.identityHashCode(setselector));
                                                            com.payair.hce.setSelector.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselector, valueOf, null}, -27651894, 27651898, java.lang.System.identityHashCode(setselector));
                                                            com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[]{bool3}, -1511834785, 1511834800, (int) java.lang.System.currentTimeMillis());
                                                            int i121 = getGpoResponse;
                                                            getCiacDecline = ((-2) - (~(((i121 | 2) << 1) - (i121 ^ 2)))) % 128;
                                                        }
                                                        com.payair.hce.setSelector.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setselector}, -168121427, 168121430, java.lang.System.identityHashCode(setselector));
                                                    }
                                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, 922 - android.graphics.Color.blue(0), (char) android.text.TextUtils.getTrimmedLength(str8));
                                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr56);
                                                    j3 = cls22.getField((java.lang.String) objArr56[0]).getLong(null);
                                                    if (j3 != -1 || j3 + 1981 < ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                        java.lang.Object[] objArr57 = {-1269401958};
                                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                                        if (obj4 == null) {
                                                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.KeyEvent.keyCodeFromString(str8), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 873, (char) (15956 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getDeclaredConstructor(java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj4);
                                                        }
                                                        AlternateContactlessPaymentDataJson$5f5b6fcf = com.payair.hce.setOverScrollMode.AlternateContactlessPaymentDataJson$5f5b6fcf(i2, ((java.lang.reflect.Constructor) obj4).newInstance(objArr57), 535522761);
                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str8, 0) + 44, android.text.TextUtils.getCapsMode(str8, 0, 0) + 922, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                        d(bArr[18], bArr[5], bArr[10], objArr58);
                                                        cls23.getField((java.lang.String) objArr58[0]).set(null, AlternateContactlessPaymentDataJson$5f5b6fcf);
                                                        long longValue = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.Process.myTid() >> 22), 922 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                                        c4 = 1;
                                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr59);
                                                        c5 = 0;
                                                        cls24.getField((java.lang.String) objArr59[0]).set(null, java.lang.Long.valueOf(longValue));
                                                    } else {
                                                        int i122 = getCiacDecline;
                                                        int i123 = (i122 ^ 95) + ((i122 & 95) << 1);
                                                        getGpoResponse = i123 % 128;
                                                        if (i123 % 2 != 0) {
                                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str8, 0, 0) + 44, 922 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                            d(bArr[18], bArr[5], bArr[10], objArr60);
                                                            java.lang.Object[] objArr61 = {cls25.getField((java.lang.String) objArr60[0]).get(null), 535522761, num};
                                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                            if (obj24 == null) {
                                                                obj24 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 4861 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj24);
                                                            }
                                                            AlternateContactlessPaymentDataJson$5f5b6fcf = (java.lang.Object[]) ((java.lang.reflect.Method) obj24).invoke(null, objArr61);
                                                        } else {
                                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 922 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                            d(bArr[18], bArr[5], bArr[10], objArr62);
                                                            java.lang.Object[] objArr63 = {cls26.getField((java.lang.String) objArr62[0]).get(null), 535522761, num5};
                                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                            if (obj25 == null) {
                                                                obj25 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4860, (char) android.graphics.Color.red(0))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj25);
                                                            }
                                                            AlternateContactlessPaymentDataJson$5f5b6fcf = (java.lang.Object[]) ((java.lang.reflect.Method) obj25).invoke(null, objArr63);
                                                        }
                                                        c5 = 0;
                                                        c4 = 1;
                                                    }
                                                    i4 = ((int[]) AlternateContactlessPaymentDataJson$5f5b6fcf[c4])[c5];
                                                    i5 = ((int[]) AlternateContactlessPaymentDataJson$5f5b6fcf[c5])[c5];
                                                    if (i5 != i4) {
                                                        int i124 = getCiacDecline;
                                                        int i125 = i124 & 83;
                                                        getGpoResponse = (i125 + ((i124 ^ 83) | i125)) % 128;
                                                        java.lang.Object[] objArr64 = {AlternateContactlessPaymentDataJson$5f5b6fcf, java.lang.Integer.valueOf(((int[]) AlternateContactlessPaymentDataJson$5f5b6fcf[3])[0]), num5};
                                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                        if (obj26 == null) {
                                                            obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 3, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4860, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj26);
                                                        }
                                                        ((java.lang.reflect.Method) obj26).invoke(null, objArr64);
                                                        int i126 = getCiacDecline;
                                                        getGpoResponse = ((((i126 | 90) << 1) - (i126 ^ 90)) - 1) % 128;
                                                    } else {
                                                        new java.util.ArrayList().add((java.lang.String) AlternateContactlessPaymentDataJson$5f5b6fcf[2]);
                                                        int i127 = i4 & i5;
                                                        java.lang.Object[] objArr65 = {java.lang.Long.valueOf((((i4 ^ i5) | i127) & (~i127)) ^ (-6740661479822852096L)), -1569432549L};
                                                        byte[] bArr6 = $$d;
                                                        byte b23 = bArr6[49];
                                                        int i128 = $$e;
                                                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                        e(b23, (short) (i128 | 105), bArr6[315], objArr66);
                                                        java.lang.Class<?> cls27 = java.lang.Class.forName((java.lang.String) objArr66[0]);
                                                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                        e((byte) (-bArr6[156]), (short) (i128 | 578), bArr6[843], objArr67);
                                                        cls27.getMethod((java.lang.String) objArr67[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr65);
                                                        java.lang.Object[] objArr68 = {AlternateContactlessPaymentDataJson$5f5b6fcf, java.lang.Integer.valueOf(((int[]) AlternateContactlessPaymentDataJson$5f5b6fcf[3])[0]), num5};
                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                                        if (obj27 == null) {
                                                            obj27 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.graphics.Color.blue(0), android.view.View.MeasureSpec.getMode(0) + 4860, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj27);
                                                        }
                                                        ((java.lang.reflect.Method) obj27).invoke(null, objArr68);
                                                    }
                                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str8) + 51, android.graphics.Color.red(0) + 584, (char) (24291 - android.view.KeyEvent.keyCodeFromString(str8)));
                                                    java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr69);
                                                    j4 = cls28.getField((java.lang.String) objArr69[0]).getLong(null);
                                                    try {
                                                        try {
                                                            if (j4 != -1 || j4 + 1981 < ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                baseContext = getBaseContext();
                                                                if (baseContext != null) {
                                                                    getGpoResponse = (getCiacDecline + 33) % 128;
                                                                    int i129 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                                    int i130 = i129 * (-1529);
                                                                    int i131 = ~i129;
                                                                    int i132 = i131 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                                    int i133 = i131 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                                    int i134 = (i132 ^ i133) | (i132 & i133);
                                                                    int i135 = ~i2;
                                                                    int i136 = (i134 ^ i135) | (i134 & i135);
                                                                    int i137 = ~i136;
                                                                    int i138 = (i136 | i137) & i137;
                                                                    int i139 = (i131 | i129) & i131;
                                                                    int i140 = (i139 & 127) | ((~i139) & 127) | (i139 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                                                    int i141 = i140 & i2;
                                                                    int i142 = ~(((i140 | i2) & (~i141)) | i141);
                                                                    int i143 = ((~i138) & i142) | ((~i142) & i138) | (i142 & i138);
                                                                    int i144 = (i129 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i129 & 127) | i133;
                                                                    int i145 = i144 & i2;
                                                                    int i146 = (i144 | i2) & (~i145);
                                                                    int i147 = (i146 ^ i145) | (i146 & i145);
                                                                    int i148 = ~i147;
                                                                    int i149 = (i147 | i148) & i148;
                                                                    int i150 = -(~(((i143 ^ i149) | (i143 & i149)) * 765));
                                                                    int i151 = ~i131;
                                                                    int i152 = (i131 & 127) | (i151 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                                                    int i153 = (i133 ^ i152) | (i152 & i133);
                                                                    int i154 = ~i153;
                                                                    int i155 = (i153 | i154) & i154;
                                                                    int i156 = i131 ^ i135;
                                                                    int i157 = i135 & i131;
                                                                    int i158 = (i156 ^ i157) | (i157 & i156);
                                                                    int i159 = ~i158;
                                                                    int i160 = (i158 | i159) & i159;
                                                                    str10 = str9;
                                                                    int i161 = ((~i155) & i160) | ((~i160) & i155);
                                                                    int i162 = i155 & i160;
                                                                    int i163 = (-2) - (~(((((((-97028) ^ i130) + ((i130 & (-97028)) << 1)) - (~i150)) - 2) - (~(-(~(((i162 & i161) | (i161 ^ i162)) * 1530))))) - 1));
                                                                    int i164 = (i151 & i2) | i157;
                                                                    int i165 = i131 & i2;
                                                                    int i166 = ~((i164 ^ i165) | (i165 & i164));
                                                                    int i167 = i135 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                                    int i168 = i135 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                                    int i169 = (i167 ^ i168) | (i168 & i167);
                                                                    int i170 = i169 ^ i129;
                                                                    int i171 = i129 & i169;
                                                                    int i172 = ~((i171 ^ i170) | (i171 & i170));
                                                                    int i173 = i166 & i172;
                                                                    int i174 = (i172 | i166) & (~i173);
                                                                    int i175 = ((i174 ^ i173) | (i174 & i173)) * 765;
                                                                    int i176 = ((i163 ^ i175) | (i163 & i175)) << 1;
                                                                    int i177 = -(((~i175) & i163) | ((~i163) & i175));
                                                                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                                    b(((i176 | i177) << 1) - (i177 ^ i176), null, null, "\u0086\u0083\u0081\u008c\u0094\u0093\u0092\u0088\u0089\u0091\u0089\u0088\u0090\u008f\u008e\u0084\u0084\u0083\u008e\u0086\u0089\u008d\u008c\u0086\u008b\u0083", objArr70);
                                                                    java.lang.Class<?> cls29 = java.lang.Class.forName((java.lang.String) objArr70[0]);
                                                                    char red = (char) android.graphics.Color.red(0);
                                                                    int i178 = -(android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                    int i179 = i178 & 18;
                                                                    int i180 = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                                    java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                                    a(red, i179 + ((i178 ^ 18) | i179), ((i180 | 22) << 1) - (i180 ^ 22), objArr71);
                                                                    baseContext = (android.content.Context) cls29.getMethod((java.lang.String) objArr71[0], new java.lang.Class[0]).invoke(null, null);
                                                                } else {
                                                                    str10 = str9;
                                                                }
                                                                if (baseContext != null) {
                                                                    int i181 = getCiacDecline + 99;
                                                                    getGpoResponse = i181 % 128;
                                                                    if (i181 % 2 != 0) {
                                                                        baseContext.getApplicationContext();
                                                                        throw null;
                                                                    }
                                                                    baseContext = baseContext.getApplicationContext();
                                                                }
                                                                java.lang.Object[] objArr72 = {baseContext, java.lang.Integer.valueOf(i), 957814656};
                                                                byte[] bArr7 = $$d;
                                                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                                e(bArr7[49], (short) (-bArr7[514]), bArr7[180], objArr73);
                                                                java.lang.Class<?> cls30 = java.lang.Class.forName((java.lang.String) objArr73[0]);
                                                                byte b24 = bArr7[30];
                                                                java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                                e(b24, (short) (b24 | 622), bArr7[17], objArr74);
                                                                java.lang.String str17 = (java.lang.String) objArr74[0];
                                                                char offsetAfter = (char) android.text.TextUtils.getOffsetAfter(str8, 0);
                                                                int lastIndexOf2 = android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                int i182 = lastIndexOf2 * (-813);
                                                                int i183 = 707208808 & i182;
                                                                int i184 = i183 + ((i182 ^ 707208808) | i183);
                                                                int i185 = 198277376 & lastIndexOf2;
                                                                int i186 = i185 | ((~i185) & (198277376 | lastIndexOf2));
                                                                int i187 = ~i186;
                                                                int i188 = (i186 | i187) & i187;
                                                                int i189 = (lastIndexOf2 ^ i2) | (lastIndexOf2 & i2);
                                                                int i190 = ~i189;
                                                                num7 = num6;
                                                                java.lang.String str18 = str8;
                                                                int i191 = ((~i190) & i188) | ((~i188) & i190);
                                                                int i192 = i188 & i190;
                                                                int i193 = -(~(((i192 & i191) | (i191 ^ i192)) * (-814)));
                                                                int i194 = (-2) - (~((i184 ^ i193) + ((i193 & i184) << 1)));
                                                                int i195 = ~i2;
                                                                int i196 = (i195 & 198277376) | (198277376 ^ i195);
                                                                int i197 = ~lastIndexOf2;
                                                                int i198 = (198277376 & i197) | ((~i197) & (-198277377));
                                                                int i199 = (-198277377) & i197;
                                                                java.lang.String str19 = str14;
                                                                int i200 = ~i196;
                                                                int i201 = ((i196 | i200) & i200) | (~((i198 & i199) | (i198 ^ i199)));
                                                                int i202 = (i190 | i189) & i190;
                                                                int i203 = ((~i201) & i202) | ((~i202) & i201);
                                                                int i204 = i201 & i202;
                                                                int i205 = -(-(((i204 ^ i203) | (i204 & i203)) * 407));
                                                                int i206 = ~(((-198277377) ^ i197) | i199);
                                                                int i207 = i197 | i2;
                                                                int i208 = ~i207;
                                                                int i209 = (i207 | i208) & i208;
                                                                int i210 = i206 & i209;
                                                                int i211 = (i209 | i206) & (~i210);
                                                                int i212 = (i211 ^ i210) | (i211 & i210);
                                                                int i213 = (-198277377) & i2;
                                                                int i214 = (~i213) & ((-198277377) | i2);
                                                                int i215 = (i213 ^ i214) | (i213 & i214);
                                                                int i216 = ~i215;
                                                                int i217 = (i215 | i216) & i216;
                                                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                                c("︰⺆⫴ⷮ", offsetAfter, "ꒈ폾\uf4b8⥱똱Ș曜쟏揈磦\uf726ꐷ㽐둁脽㯣㻕嫄踻廥蠏本ጣ", "\u0000\u0000\u0000\u0000", (((((i194 ^ i205) | (i194 & i205)) << 1) - ((i194 & (~i205)) | ((~i194) & i205))) - (~(-(-(((i212 ^ i217) | (i212 & i217)) * 407))))) - 1, objArr75);
                                                                objArr4 = (java.lang.Object[]) cls30.getMethod(str17, java.lang.Class.forName((java.lang.String) objArr75[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr72);
                                                                if (baseContext == null) {
                                                                    int i218 = getGpoResponse;
                                                                    int i219 = i218 ^ 39;
                                                                    int i220 = (((i218 & 39) | i219) << 1) - i219;
                                                                    getCiacDecline = i220 % 128;
                                                                    try {
                                                                        if (i220 % 2 == 0) {
                                                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50, 584 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 24292));
                                                                            java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                                            d(bArr[18], bArr[5], bArr[10], objArr76);
                                                                            cls31.getField((java.lang.String) objArr76[0]).set(null, objArr4);
                                                                            str14 = str19;
                                                                            valueOf3 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue());
                                                                            str11 = str18;
                                                                            cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 51, android.view.KeyEvent.keyCodeFromString(str18) + 584, (char) (24290 - android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                                            java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr77);
                                                                            obj5 = objArr77[0];
                                                                        } else {
                                                                            str11 = str18;
                                                                            str14 = str19;
                                                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.graphics.Color.green(0) + 584, (char) (24291 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                                                                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                                            d(bArr[18], bArr[5], bArr[10], objArr78);
                                                                            cls32.getField((java.lang.String) objArr78[0]).set(null, objArr4);
                                                                            valueOf3 = java.lang.Long.valueOf(((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue());
                                                                            cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.graphics.Color.red(0), 584 - android.view.KeyEvent.normalizeMetaState(0), (char) (24291 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                                                                            java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr79);
                                                                            obj5 = objArr79[0];
                                                                        }
                                                                        cls.getField((java.lang.String) obj5).set(null, valueOf3);
                                                                        i6 = ((int[]) objArr4[1])[0];
                                                                        i7 = ((int[]) objArr4[0])[0];
                                                                        if (i7 != i6) {
                                                                            int i221 = 236789122 ^ i2;
                                                                            int i222 = ~i2;
                                                                            int i223 = 236789122 & i2;
                                                                            int i224 = ~((i221 ^ i223) | (i223 & i221));
                                                                            int i225 = -(-(((i224 ^ (-1340080060)) | ((-1340080060) & i224)) * (-280)));
                                                                            int i226 = (980218982 & i225) + (i225 | 980218982);
                                                                            int i227 = (236789122 | i2) & (~i223);
                                                                            int i228 = (i227 ^ i223) | (i227 & i223);
                                                                            int i229 = ~i228;
                                                                            int i230 = (i228 | i229) & i229;
                                                                            int i231 = (-1205007034) & i222;
                                                                            int i232 = (1205007033 & i2) | i231;
                                                                            int i233 = (-1205007034) & i2;
                                                                            int i234 = ~((i232 ^ i233) | (i233 & i232));
                                                                            int i235 = ((~i234) & i230) | ((~i230) & i234);
                                                                            int i236 = i230 & i234;
                                                                            int i237 = ((i236 ^ i235) | (i236 & i235)) * 140;
                                                                            int i238 = i226 | i237;
                                                                            int i239 = i238 << 1;
                                                                            int i240 = -((~(i237 & i226)) & i238);
                                                                            int i241 = ((-1103290938) & i2) | ((-1103290938) ^ i2);
                                                                            int i242 = ~i241;
                                                                            int i243 = (i241 | i242) & i242;
                                                                            int i244 = 236789122 ^ i222;
                                                                            int i245 = 236789122 & i222;
                                                                            int i246 = (i244 ^ i245) | (i245 & i244);
                                                                            int i247 = ~(((~i246) & 1205007033) | ((-1205007034) & i246) | (1205007033 & i246));
                                                                            int i248 = (i243 ^ i247) | (i243 & i247);
                                                                            int i249 = i231 | ((-1205007034) ^ i222);
                                                                            int i250 = (-236789123) & i249;
                                                                            int i251 = (i249 | (-236789123)) & (~i250);
                                                                            int i252 = ~((i251 ^ i250) | (i251 & i250));
                                                                            int i253 = i248 ^ i252;
                                                                            int i254 = i252 & i248;
                                                                            int i255 = ~((1874764747 & i2) | (1874764747 ^ i2));
                                                                            int i256 = 1790345866 & i222;
                                                                            int i257 = i256 | ((1790345866 | i222) & (~i256));
                                                                            int i258 = (i257 ^ (-1728979268)) | ((-1728979268) & i257);
                                                                            int i259 = ~i258;
                                                                            int i260 = (i258 | i259) & i259;
                                                                            int i261 = i255 & i260;
                                                                            int i262 = (i255 | i260) & (~i261);
                                                                            int i263 = -(-(((i262 ^ i261) | (i262 & i261)) * 920));
                                                                            int i264 = (149425177 ^ i263) + ((i263 & 149425177) << 1);
                                                                            int i265 = 1728979267 | i222;
                                                                            int i266 = ~i265;
                                                                            int i267 = (i265 | i266) & i266;
                                                                            int i268 = ((~i267) & (-1874764748)) | (1874764747 & i267);
                                                                            int i269 = i267 & (-1874764748);
                                                                            int i270 = -(-(((i269 ^ i268) | (i269 & i268)) * 920));
                                                                            int i271 = ((((i264 ^ i270) | (i264 & i270)) << 1) - (~(-(((~i270) & i264) | ((~i264) & i270))))) - 1;
                                                                            int i272 = ~(i222 | 1874764747);
                                                                            int i273 = ((-145785481) & i2) | ((-145785481) ^ i2);
                                                                            int i274 = ~i273;
                                                                            int i275 = (i273 | i274) & i274;
                                                                            int i276 = ((~i275) & i272) | ((~i272) & i275);
                                                                            int i277 = i272 & i275;
                                                                            int i278 = (i277 ^ i276) | (i277 & i276);
                                                                            int i279 = (-84418882) | i2;
                                                                            int i280 = ~i279;
                                                                            int i281 = (i279 | i280) & i280;
                                                                            int i282 = ((i278 ^ i281) | (i278 & i281)) * 920;
                                                                            if ((i239 ^ i240) + ((i240 & i239) << 1) + (((i254 & i253) | (i254 ^ i253)) * 140) <= (i271 ^ i282) + ((i282 & i271) << 1)) {
                                                                                java.lang.Object[] objArr80 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[3])[0]), num5};
                                                                                java.lang.Integer num8 = num7;
                                                                                java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num8);
                                                                                if (obj28 == null) {
                                                                                    obj28 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 4830 - android.text.TextUtils.getCapsMode(str11, 0, 0), (char) android.text.TextUtils.getTrimmedLength(str11))).getMethod(str10, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num8, obj28);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj28).invoke(null, objArr80);
                                                                            } else {
                                                                                java.lang.String str20 = str10;
                                                                                java.lang.Integer num9 = num7;
                                                                                java.lang.Object[] objArr81 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[3])[0]), num5};
                                                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num9);
                                                                                if (obj29 == null) {
                                                                                    obj29 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4831, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod(str20, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num9, obj29);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj29).invoke(null, objArr81);
                                                                            }
                                                                        } else {
                                                                            java.lang.String str21 = str10;
                                                                            java.lang.Integer num10 = num7;
                                                                            int i283 = (~i7) & i6;
                                                                            int i284 = (~i6) & i7;
                                                                            java.lang.Object[] objArr82 = {java.lang.Long.valueOf(((i283 ^ i284) | (i284 & i283)) ^ (-4343933084270329856L)), -1011401248L};
                                                                            byte[] bArr8 = $$d;
                                                                            byte b25 = bArr8[49];
                                                                            int i285 = $$e;
                                                                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                                            e(b25, (short) (i285 | 618), bArr8[237], objArr83);
                                                                            java.lang.Class<?> cls33 = java.lang.Class.forName((java.lang.String) objArr83[0]);
                                                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                                            e((byte) (-bArr8[156]), (short) (i285 | 578), bArr8[843], objArr84);
                                                                            cls33.getMethod((java.lang.String) objArr84[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr82);
                                                                            java.lang.Object[] objArr85 = {objArr4, java.lang.Integer.valueOf(((int[]) objArr4[3])[0]), num5};
                                                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num10);
                                                                            if (obj30 == null) {
                                                                                obj30 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4829, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod(str21, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num10, obj30);
                                                                            }
                                                                            ((java.lang.reflect.Method) obj30).invoke(null, objArr85);
                                                                            int i286 = getGpoResponse;
                                                                            getCiacDecline = ((i286 ^ 49) + ((i286 & 49) << 1)) % 128;
                                                                        }
                                                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34284));
                                                                        byte b26 = bArr[18];
                                                                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                        d(b26, b26, (short) 24, objArr86);
                                                                        j5 = cls34.getField((java.lang.String) objArr86[0]).getLong(null);
                                                                        if (j5 != -1 || j5 + 1877 < ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                                                            java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(i), num5, 1149287479};
                                                                            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                                            if (obj6 == null) {
                                                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.View.resolveSize(0, 0), 707 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 34284));
                                                                                byte b27 = bArr[18];
                                                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                                d(b27, b27, (short) 24, objArr88);
                                                                                obj6 = cls35.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj6);
                                                                            }
                                                                            objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) obj6).invoke(null, objArr87);
                                                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.MotionEvent.axisFromString(str11), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34283));
                                                                            byte b28 = bArr[5];
                                                                            byte b29 = bArr[60];
                                                                            java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                                            d(b28, b29, (byte) (b29 | com.google.common.base.Ascii.CAN), objArr89);
                                                                            cls36.getField((java.lang.String) objArr89[0]).set(null, objArr6);
                                                                            long longValue2 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                            c6 = 0;
                                                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46, 707 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-16742932) - android.graphics.Color.rgb(0, 0, 0)));
                                                                            byte b30 = bArr[18];
                                                                            c7 = 1;
                                                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                            d(b30, b30, (short) 24, objArr90);
                                                                            cls37.getField((java.lang.String) objArr90[0]).set(null, java.lang.Long.valueOf(longValue2));
                                                                        } else {
                                                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 46, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED, (char) (34284 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                                                                            byte b31 = bArr[5];
                                                                            byte b32 = bArr[60];
                                                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                            d(b31, b32, (byte) (b32 | com.google.common.base.Ascii.CAN), objArr91);
                                                                            java.lang.Object[] objArr92 = {cls38.getField((java.lang.String) objArr91[0]).get(null), 1149287479, num5};
                                                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                            if (obj31 == null) {
                                                                                obj31 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str11) + 33, 4717 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj31);
                                                                            }
                                                                            objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) obj31).invoke(null, objArr92);
                                                                            c7 = 1;
                                                                            c6 = 0;
                                                                        }
                                                                        i8 = ((int[]) objArr6[c7])[c6];
                                                                        i9 = ((int[]) objArr6[c6])[c6];
                                                                        if (i9 != i8) {
                                                                            int i287 = getCiacDecline;
                                                                            int i288 = i287 & 77;
                                                                            int i289 = (i287 ^ 77) | i288;
                                                                            getGpoResponse = (((i288 | i289) << 1) - (i289 ^ i288)) % 128;
                                                                            java.lang.Object[] objArr93 = {objArr6, java.lang.Integer.valueOf(((int[]) objArr6[9])[0]), num5};
                                                                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                            if (obj32 == null) {
                                                                                obj32 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32, android.os.Process.getGidForName(str11) + 4718, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj32);
                                                                            }
                                                                            ((java.lang.reflect.Method) obj32).invoke(null, objArr93);
                                                                        } else {
                                                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                                            arrayList2.add((java.lang.String) objArr6[2]);
                                                                            arrayList2.add((java.lang.String) objArr6[3]);
                                                                            arrayList2.add((java.lang.String) objArr6[4]);
                                                                            arrayList2.add((java.lang.String) objArr6[5]);
                                                                            arrayList2.add((java.lang.String) objArr6[6]);
                                                                            arrayList2.add((java.lang.String) objArr6[7]);
                                                                            arrayList2.add((java.lang.String) objArr6[8]);
                                                                            int i290 = (~i9) & i8;
                                                                            int i291 = (~i8) & i9;
                                                                            java.lang.Object[] objArr94 = {java.lang.Long.valueOf(((i291 ^ i290) | (i291 & i290)) ^ (-3899750766268645376L)), -907981482L};
                                                                            java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                            e(r2[49], (short) (-$$d[64]), r2[446], objArr95);
                                                                            java.lang.Class<?> cls39 = java.lang.Class.forName((java.lang.String) objArr95[0]);
                                                                            byte b33 = (byte) $$e;
                                                                            java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                            e(b33, (short) (b33 | 710), r2[121], objArr96);
                                                                            cls39.getMethod((java.lang.String) objArr96[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr94);
                                                                            java.lang.Object[] objArr97 = {objArr6, java.lang.Integer.valueOf(((int[]) objArr6[9])[0]), num5};
                                                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                                                            if (obj33 == null) {
                                                                                obj33 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 33, 4718 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj33);
                                                                            }
                                                                            ((java.lang.reflect.Method) obj33).invoke(null, objArr97);
                                                                        }
                                                                        java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 668, (char) (android.view.View.resolveSize(0, 0) + 40024));
                                                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr98);
                                                                        j6 = cls40.getField((java.lang.String) objArr98[0]).getLong(null);
                                                                        if (j6 != -1) {
                                                                            int i292 = getCiacDecline;
                                                                            int i293 = ((i292 & 51) - (~(i292 | 51))) - 1;
                                                                            getGpoResponse = i293 % 128;
                                                                            if (i293 % 2 == 0) {
                                                                                i12 = 0;
                                                                            } else if (j6 + 1862 >= ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[1])).longValue()) {
                                                                                i12 = 0;
                                                                                java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(i12, i12) + 40, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 667, (char) (40025 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                                                byte b34 = bArr[18];
                                                                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                                d(b34, b34, (short) 24, objArr99);
                                                                                java.lang.Object[] objArr100 = {cls41.getField((java.lang.String) objArr99[0]).get(null), 959894250, num5};
                                                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                                if (obj34 == null) {
                                                                                    obj34 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.View.getDefaultSize(0, 0), 4683 - android.text.TextUtils.indexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj34);
                                                                                }
                                                                                objArr7 = (java.lang.Object[]) ((java.lang.reflect.Method) obj34).invoke(null, objArr100);
                                                                                c8 = 1;
                                                                                i10 = ((int[]) objArr7[c8])[0];
                                                                                i11 = ((int[]) objArr7[0])[0];
                                                                                if (i11 == i10) {
                                                                                    java.lang.Object[] objArr101 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[4])[0]), num5};
                                                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                                    if (obj35 == null) {
                                                                                        obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.text.TextUtils.indexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 4684 - android.graphics.Color.alpha(0), (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj35);
                                                                                    }
                                                                                    ((java.lang.reflect.Method) obj35).invoke(null, objArr101);
                                                                                    int i294 = getGpoResponse;
                                                                                    int i295 = i294 & 31;
                                                                                    getCiacDecline = ((i295 - (~(-(-((i294 ^ 31) | i295))))) - 1) % 128;
                                                                                    return;
                                                                                }
                                                                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                                java.lang.Object[] objArr102 = {objArr7};
                                                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                                                                if (obj36 == null) {
                                                                                    obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str11, str11) + 33, android.view.View.MeasureSpec.getSize(0) + 4684, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("values", java.lang.Object[].class);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj36);
                                                                                }
                                                                                arrayList3.add(((java.lang.reflect.Method) obj36).invoke(null, objArr102));
                                                                                java.lang.Object[] objArr103 = {objArr7};
                                                                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                                                                if (obj37 == null) {
                                                                                    obj37 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33, android.text.TextUtils.indexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4685, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1))).getMethod("writeReplace", java.lang.Object[].class);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj37);
                                                                                }
                                                                                arrayList3.add(((java.lang.reflect.Method) obj37).invoke(null, objArr103));
                                                                                int i296 = (~i11) & i10;
                                                                                int i297 = (~i10) & i11;
                                                                                java.lang.Object[] objArr104 = {java.lang.Long.valueOf(((i297 ^ i296) | (i297 & i296)) ^ 5039359706208927744L), 1173317372L};
                                                                                byte[] bArr9 = $$d;
                                                                                byte b35 = bArr9[49];
                                                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                                e(b35, (short) (b35 | 456), bArr9[25], objArr105);
                                                                                java.lang.Class<?> cls42 = java.lang.Class.forName((java.lang.String) objArr105[0]);
                                                                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                                e((byte) (-bArr9[156]), (short) ($$e | 578), bArr9[843], objArr106);
                                                                                cls42.getMethod((java.lang.String) objArr106[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr104);
                                                                                java.lang.Object[] objArr107 = {objArr7, java.lang.Integer.valueOf(((int[]) objArr7[4])[0]), num5};
                                                                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                                                if (obj38 == null) {
                                                                                    obj38 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.View.resolveSizeAndState(0, 0, 0) + 4684, (char) android.view.View.MeasureSpec.getMode(0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj38);
                                                                                }
                                                                                ((java.lang.reflect.Method) obj38).invoke(null, objArr107);
                                                                                return;
                                                                            }
                                                                            cause = th2.getCause();
                                                                            if (cause != null) {
                                                                                throw th2;
                                                                            }
                                                                            throw cause;
                                                                        }
                                                                        baseContext2 = getBaseContext();
                                                                        if (baseContext2 == null) {
                                                                            getGpoResponse = (getCiacDecline + 115) % 128;
                                                                            int i298 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                            int i299 = i298 & 127;
                                                                            int i300 = (i298 | 127) & (~i299);
                                                                            int i301 = i299 << 1;
                                                                            java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                            b((i300 ^ i301) + ((i300 & i301) << 1), null, null, "\u0086\u0083\u0081\u008c\u0094\u0093\u0092\u0088\u0089\u0091\u0089\u0088\u0090\u008f\u008e\u0084\u0084\u0083\u008e\u0086\u0089\u008d\u008c\u0086\u008b\u0083", objArr108);
                                                                            java.lang.Class<?> cls43 = java.lang.Class.forName((java.lang.String) objArr108[0]);
                                                                            char absoluteGravity = (char) android.view.Gravity.getAbsoluteGravity(0, 0);
                                                                            int i302 = -(-(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                            a(absoluteGravity, (i302 & 17) + (i302 | 17), 22 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr109);
                                                                            baseContext2 = (android.content.Context) cls43.getMethod((java.lang.String) objArr109[0], new java.lang.Class[0]).invoke(null, null);
                                                                        }
                                                                        if (baseContext2 != null) {
                                                                            int i303 = getCiacDecline;
                                                                            int i304 = ((i303 ^ 63) | (i303 & 63)) << 1;
                                                                            int i305 = -((i303 & (-64)) | ((~i303) & 63));
                                                                            getGpoResponse = (((i304 | i305) << 1) - (i305 ^ i304)) % 128;
                                                                            baseContext2 = baseContext2.getApplicationContext();
                                                                            int i306 = getGpoResponse;
                                                                            int i307 = (i306 ^ 63) + ((i306 & 63) << 1);
                                                                            getCiacDecline = i307 % 128;
                                                                            if (i307 % 2 == 0) {
                                                                                int i308 = 5 / 2;
                                                                            }
                                                                        }
                                                                        java.lang.Object[] objArr110 = {baseContext2, java.lang.Integer.valueOf(i), num5, 959894250};
                                                                        byte b36 = $$d[49];
                                                                        int i309 = $$e;
                                                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                        e(b36, (short) i309, r1[19], objArr111);
                                                                        java.lang.Class<?> cls44 = java.lang.Class.forName((java.lang.String) objArr111[0]);
                                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                        e(r1[30], (short) (i309 | 400), r1[279], objArr112);
                                                                        java.lang.String str22 = (java.lang.String) objArr112[0];
                                                                        char red2 = (char) android.graphics.Color.red(0);
                                                                        int i310 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                                        int i311 = (-198277378) & i310;
                                                                        int i312 = (i310 | (-198277378)) & (~i311);
                                                                        int i313 = i311 << 1;
                                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                        c("︰⺆⫴ⷮ", red2, "ꒈ폾\uf4b8⥱똱Ș曜쟏揈磦\uf726ꐷ㽐둁脽㯣㻕嫄踻廥蠏本ጣ", "\u0000\u0000\u0000\u0000", (i312 ^ i313) + ((i312 & i313) << 1), objArr113);
                                                                        objArr7 = (java.lang.Object[]) cls44.getMethod(str22, java.lang.Class.forName((java.lang.String) objArr113[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr110);
                                                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 667 - (android.os.Process.myTid() >> 22), (char) (40024 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                                                                        byte b37 = bArr[18];
                                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                        d(b37, b37, (short) 24, objArr114);
                                                                        cls45.getField((java.lang.String) objArr114[0]).set(null, objArr7);
                                                                        long longValue3 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                                        java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.view.View.MeasureSpec.getMode(0) + 667, (char) (android.graphics.Color.green(0) + 40024));
                                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr115);
                                                                        cls46.getField((java.lang.String) objArr115[0]).set(null, java.lang.Long.valueOf(longValue3));
                                                                        int i314 = getGpoResponse;
                                                                        c8 = 1;
                                                                        int i315 = ((i314 ^ 85) | (i314 & 85)) << 1;
                                                                        int i316 = -((i314 & (-86)) | ((~i314) & 85));
                                                                        getCiacDecline = (((i315 | i316) << 1) - (i316 ^ i315)) % 128;
                                                                        i10 = ((int[]) objArr7[c8])[0];
                                                                        i11 = ((int[]) objArr7[0])[0];
                                                                        if (i11 == i10) {
                                                                        }
                                                                    } catch (java.lang.Exception unused2) {
                                                                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                                    }
                                                                } else {
                                                                    str11 = str18;
                                                                    str14 = str19;
                                                                    objArr5 = objArr4;
                                                                }
                                                            } else {
                                                                int i317 = getCiacDecline;
                                                                int i318 = i317 & 91;
                                                                int i319 = ((i317 ^ 91) | i318) << 1;
                                                                int i320 = -((i317 | 91) & (~i318));
                                                                int i321 = ((i319 | i320) << 1) - (i320 ^ i319);
                                                                getGpoResponse = i321 % 128;
                                                                if (i321 % 2 != 0) {
                                                                    java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.os.Process.getGidForName(str8), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 584, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 24291));
                                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                    d(bArr[18], bArr[5], bArr[10], objArr116);
                                                                    java.lang.Object[] objArr117 = {cls47.getField((java.lang.String) objArr116[0]).get(null), 957814656, num};
                                                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                                                    if (obj39 == null) {
                                                                        obj39 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 30, 4830 - android.text.TextUtils.getOffsetAfter(str8, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, obj39);
                                                                    }
                                                                    invoke2 = ((java.lang.reflect.Method) obj39).invoke(null, objArr117);
                                                                } else {
                                                                    java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.graphics.Color.green(0), 584 - android.text.TextUtils.getOffsetAfter(str8, 0), (char) (24290 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                    d(bArr[18], bArr[5], bArr[10], objArr118);
                                                                    java.lang.Object[] objArr119 = {cls48.getField((java.lang.String) objArr118[0]).get(null), 957814656, num5};
                                                                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                                                    if (obj40 == null) {
                                                                        obj40 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 4830, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod(str9, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, obj40);
                                                                    }
                                                                    invoke2 = ((java.lang.reflect.Method) obj40).invoke(null, objArr119);
                                                                }
                                                                objArr5 = (java.lang.Object[]) invoke2;
                                                                getCiacDecline = (getGpoResponse + 51) % 128;
                                                                str10 = str9;
                                                                num7 = num6;
                                                                str11 = str8;
                                                            }
                                                            long longValue32 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                            java.lang.Class cls462 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.view.View.MeasureSpec.getMode(0) + 667, (char) (android.graphics.Color.green(0) + 40024));
                                                            java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr1152);
                                                            cls462.getField((java.lang.String) objArr1152[0]).set(null, java.lang.Long.valueOf(longValue32));
                                                            int i3142 = getGpoResponse;
                                                            c8 = 1;
                                                            int i3152 = ((i3142 ^ 85) | (i3142 & 85)) << 1;
                                                            int i3162 = -((i3142 & (-86)) | ((~i3142) & 85));
                                                            getCiacDecline = (((i3152 | i3162) << 1) - (i3162 ^ i3152)) % 128;
                                                            i10 = ((int[]) objArr7[c8])[0];
                                                            i11 = ((int[]) objArr7[0])[0];
                                                            if (i11 == i10) {
                                                            }
                                                        } catch (java.lang.Exception unused3) {
                                                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                        }
                                                        long longValue22 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                                        c6 = 0;
                                                        java.lang.Class cls372 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 46, 707 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-16742932) - android.graphics.Color.rgb(0, 0, 0)));
                                                        byte b302 = bArr[18];
                                                        c7 = 1;
                                                        java.lang.Object[] objArr902 = new java.lang.Object[1];
                                                        d(b302, b302, (short) 24, objArr902);
                                                        cls372.getField((java.lang.String) objArr902[0]).set(null, java.lang.Long.valueOf(longValue22));
                                                        i8 = ((int[]) objArr6[c7])[c6];
                                                        i9 = ((int[]) objArr6[c6])[c6];
                                                        if (i9 != i8) {
                                                        }
                                                        java.lang.Class cls402 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 668, (char) (android.view.View.resolveSize(0, 0) + 40024));
                                                        java.lang.Object[] objArr982 = new java.lang.Object[1];
                                                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr982);
                                                        j6 = cls402.getField((java.lang.String) objArr982[0]).getLong(null);
                                                        if (j6 != -1) {
                                                        }
                                                        baseContext2 = getBaseContext();
                                                        if (baseContext2 == null) {
                                                        }
                                                        if (baseContext2 != null) {
                                                        }
                                                        java.lang.Object[] objArr1102 = {baseContext2, java.lang.Integer.valueOf(i), num5, 959894250};
                                                        byte b362 = $$d[49];
                                                        int i3092 = $$e;
                                                        java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                                        e(b362, (short) i3092, r1[19], objArr1112);
                                                        java.lang.Class<?> cls442 = java.lang.Class.forName((java.lang.String) objArr1112[0]);
                                                        java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                                        e(r1[30], (short) (i3092 | 400), r1[279], objArr1122);
                                                        java.lang.String str222 = (java.lang.String) objArr1122[0];
                                                        char red22 = (char) android.graphics.Color.red(0);
                                                        int i3102 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                        int i3112 = (-198277378) & i3102;
                                                        int i3122 = (i3102 | (-198277378)) & (~i3112);
                                                        int i3132 = i3112 << 1;
                                                        java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                                        c("︰⺆⫴ⷮ", red22, "ꒈ폾\uf4b8⥱똱Ș曜쟏揈磦\uf726ꐷ㽐둁脽㯣㻕嫄踻廥蠏本ጣ", "\u0000\u0000\u0000\u0000", (i3122 ^ i3132) + ((i3122 & i3132) << 1), objArr1132);
                                                        objArr7 = (java.lang.Object[]) cls442.getMethod(str222, java.lang.Class.forName((java.lang.String) objArr1132[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1102);
                                                        java.lang.Class cls452 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 667 - (android.os.Process.myTid() >> 22), (char) (40024 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                                                        byte b372 = bArr[18];
                                                        java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                                        d(b372, b372, (short) 24, objArr1142);
                                                        cls452.getField((java.lang.String) objArr1142[0]).set(null, objArr7);
                                                    } catch (java.lang.Exception unused4) {
                                                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                                                    }
                                                    objArr4 = objArr5;
                                                    i6 = ((int[]) objArr4[1])[0];
                                                    i7 = ((int[]) objArr4[0])[0];
                                                    if (i7 != i6) {
                                                    }
                                                    java.lang.Class cls342 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34284));
                                                    byte b262 = bArr[18];
                                                    java.lang.Object[] objArr862 = new java.lang.Object[1];
                                                    d(b262, b262, (short) 24, objArr862);
                                                    j5 = cls342.getField((java.lang.String) objArr862[0]).getLong(null);
                                                    if (j5 != -1) {
                                                    }
                                                    java.lang.Object[] objArr872 = {java.lang.Integer.valueOf(i), num5, 1149287479};
                                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                                    if (obj6 == null) {
                                                    }
                                                    objArr6 = (java.lang.Object[]) ((java.lang.reflect.Method) obj6).invoke(null, objArr872);
                                                    java.lang.Class cls362 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.MotionEvent.axisFromString(str11), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34283));
                                                    byte b282 = bArr[5];
                                                    byte b292 = bArr[60];
                                                    java.lang.Object[] objArr892 = new java.lang.Object[1];
                                                    d(b282, b292, (byte) (b292 | com.google.common.base.Ascii.CAN), objArr892);
                                                    cls362.getField((java.lang.String) objArr892[0]).set(null, objArr6);
                                                }
                                            }
                                            java.lang.Object[] objArr120 = {java.lang.Integer.valueOf(i), -795427739};
                                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                            if (obj == null) {
                                                java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 47, 754 - android.text.TextUtils.getCapsMode(str8, 0, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 45561));
                                                byte b38 = bArr[5];
                                                byte b39 = bArr[60];
                                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                d(b38, b39, (byte) (b39 | com.google.common.base.Ascii.CAN), objArr121);
                                                obj = cls49.getMethod((java.lang.String) objArr121[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj);
                                            }
                                            invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr120);
                                            java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str8, 0, 0) + 47, 754 - android.graphics.Color.red(0), (char) (45559 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                            byte b40 = bArr[5];
                                            byte b41 = bArr[60];
                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                            d(b40, b41, (byte) (b41 | com.google.common.base.Ascii.CAN), objArr122);
                                            cls50.getField((java.lang.String) objArr122[0]).set(null, invoke);
                                            long longValue4 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                            java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 48, android.view.KeyEvent.normalizeMetaState(0) + 754, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45512));
                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr123);
                                            cls51.getField((java.lang.String) objArr123[0]).set(null, java.lang.Long.valueOf(longValue4));
                                            int i322 = getCiacDecline;
                                            getGpoResponse = (((i322 | 115) << 1) - (i322 ^ 115)) % 128;
                                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                            if (obj2 == null) {
                                            }
                                            intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(invoke, null)).intValue();
                                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                            if (obj3 == null) {
                                            }
                                            intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(invoke, null)).intValue();
                                            if (intValue2 != intValue) {
                                            }
                                            if (sethandwritingdelegatorcallback != com.payair.hce.setHandwritingDelegatorCallback.writeReplace) {
                                            }
                                            java.lang.Class cls222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, 922 - android.graphics.Color.blue(0), (char) android.text.TextUtils.getTrimmedLength(str8));
                                            java.lang.Object[] objArr562 = new java.lang.Object[1];
                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr562);
                                            j3 = cls222.getField((java.lang.String) objArr562[0]).getLong(null);
                                            if (j3 != -1) {
                                            }
                                            java.lang.Object[] objArr572 = {-1269401958};
                                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                            if (obj4 == null) {
                                            }
                                            AlternateContactlessPaymentDataJson$5f5b6fcf = com.payair.hce.setOverScrollMode.AlternateContactlessPaymentDataJson$5f5b6fcf(i2, ((java.lang.reflect.Constructor) obj4).newInstance(objArr572), 535522761);
                                            java.lang.Class cls232 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str8, 0) + 44, android.text.TextUtils.getCapsMode(str8, 0, 0) + 922, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                            java.lang.Object[] objArr582 = new java.lang.Object[1];
                                            d(bArr[18], bArr[5], bArr[10], objArr582);
                                            cls232.getField((java.lang.String) objArr582[0]).set(null, AlternateContactlessPaymentDataJson$5f5b6fcf);
                                            long longValue5 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                            java.lang.Class cls242 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.Process.myTid() >> 22), 922 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                            c4 = 1;
                                            java.lang.Object[] objArr592 = new java.lang.Object[1];
                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr592);
                                            c5 = 0;
                                            cls242.getField((java.lang.String) objArr592[0]).set(null, java.lang.Long.valueOf(longValue5));
                                            i4 = ((int[]) AlternateContactlessPaymentDataJson$5f5b6fcf[c4])[c5];
                                            i5 = ((int[]) AlternateContactlessPaymentDataJson$5f5b6fcf[c5])[c5];
                                            if (i5 != i4) {
                                            }
                                            java.lang.Class cls282 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str8) + 51, android.graphics.Color.red(0) + 584, (char) (24291 - android.view.KeyEvent.keyCodeFromString(str8)));
                                            java.lang.Object[] objArr692 = new java.lang.Object[1];
                                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr692);
                                            j4 = cls282.getField((java.lang.String) objArr692[0]).getLong(null);
                                            if (j4 != -1) {
                                            }
                                            baseContext = getBaseContext();
                                            if (baseContext != null) {
                                            }
                                            if (baseContext != null) {
                                            }
                                            java.lang.Object[] objArr722 = {baseContext, java.lang.Integer.valueOf(i), 957814656};
                                            byte[] bArr72 = $$d;
                                            java.lang.Object[] objArr732 = new java.lang.Object[1];
                                            e(bArr72[49], (short) (-bArr72[514]), bArr72[180], objArr732);
                                            java.lang.Class<?> cls302 = java.lang.Class.forName((java.lang.String) objArr732[0]);
                                            byte b242 = bArr72[30];
                                            java.lang.Object[] objArr742 = new java.lang.Object[1];
                                            e(b242, (short) (b242 | 622), bArr72[17], objArr742);
                                            java.lang.String str172 = (java.lang.String) objArr742[0];
                                            char offsetAfter2 = (char) android.text.TextUtils.getOffsetAfter(str8, 0);
                                            int lastIndexOf22 = android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            int i1822 = lastIndexOf22 * (-813);
                                            int i1832 = 707208808 & i1822;
                                            int i1842 = i1832 + ((i1822 ^ 707208808) | i1832);
                                            int i1852 = 198277376 & lastIndexOf22;
                                            int i1862 = i1852 | ((~i1852) & (198277376 | lastIndexOf22));
                                            int i1872 = ~i1862;
                                            int i1882 = (i1862 | i1872) & i1872;
                                            int i1892 = (lastIndexOf22 ^ i2) | (lastIndexOf22 & i2);
                                            int i1902 = ~i1892;
                                            num7 = num6;
                                            java.lang.String str182 = str8;
                                            int i1912 = ((~i1902) & i1882) | ((~i1882) & i1902);
                                            int i1922 = i1882 & i1902;
                                            int i1932 = -(~(((i1922 & i1912) | (i1912 ^ i1922)) * (-814)));
                                            int i1942 = (-2) - (~((i1842 ^ i1932) + ((i1932 & i1842) << 1)));
                                            int i1952 = ~i2;
                                            int i1962 = (i1952 & 198277376) | (198277376 ^ i1952);
                                            int i1972 = ~lastIndexOf22;
                                            int i1982 = (198277376 & i1972) | ((~i1972) & (-198277377));
                                            int i1992 = (-198277377) & i1972;
                                            java.lang.String str192 = str14;
                                            int i2002 = ~i1962;
                                            int i2012 = ((i1962 | i2002) & i2002) | (~((i1982 & i1992) | (i1982 ^ i1992)));
                                            int i2022 = (i1902 | i1892) & i1902;
                                            int i2032 = ((~i2012) & i2022) | ((~i2022) & i2012);
                                            int i2042 = i2012 & i2022;
                                            int i2052 = -(-(((i2042 ^ i2032) | (i2042 & i2032)) * 407));
                                            int i2062 = ~(((-198277377) ^ i1972) | i1992);
                                            int i2072 = i1972 | i2;
                                            int i2082 = ~i2072;
                                            int i2092 = (i2072 | i2082) & i2082;
                                            int i2102 = i2062 & i2092;
                                            int i2112 = (i2092 | i2062) & (~i2102);
                                            int i2122 = (i2112 ^ i2102) | (i2112 & i2102);
                                            int i2132 = (-198277377) & i2;
                                            int i2142 = (~i2132) & ((-198277377) | i2);
                                            int i2152 = (i2132 ^ i2142) | (i2132 & i2142);
                                            int i2162 = ~i2152;
                                            int i2172 = (i2152 | i2162) & i2162;
                                            java.lang.Object[] objArr752 = new java.lang.Object[1];
                                            c("︰⺆⫴ⷮ", offsetAfter2, "ꒈ폾\uf4b8⥱똱Ș曜쟏揈磦\uf726ꐷ㽐둁脽㯣㻕嫄踻廥蠏本ጣ", "\u0000\u0000\u0000\u0000", (((((i1942 ^ i2052) | (i1942 & i2052)) << 1) - ((i1942 & (~i2052)) | ((~i1942) & i2052))) - (~(-(-(((i2122 ^ i2172) | (i2122 & i2172)) * 407))))) - 1, objArr752);
                                            objArr4 = (java.lang.Object[]) cls302.getMethod(str172, java.lang.Class.forName((java.lang.String) objArr752[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr722);
                                            if (baseContext == null) {
                                            }
                                        }
                                    }
                                    num6 = num4;
                                    str9 = str5;
                                    java.lang.Object[] objArr124 = {java.lang.Integer.valueOf(i), -23138150};
                                    byte[] bArr10 = $$d;
                                    byte b42 = bArr10[49];
                                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                                    e(b42, (short) (b42 | 137), bArr10[52], objArr125);
                                    java.lang.Class<?> cls52 = java.lang.Class.forName((java.lang.String) objArr125[0]);
                                    byte b43 = bArr10[30];
                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                    e(b43, (short) (b43 | 622), bArr10[17], objArr126);
                                    objArr3 = (java.lang.Object[]) cls52.getMethod((java.lang.String) objArr126[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr124);
                                    java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24290));
                                    byte b44 = (byte) (-bArr[17]);
                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                    d(b44, b44, (short) 75, objArr127);
                                    cls53.getField((java.lang.String) objArr127[0]).set(null, objArr3);
                                    long longValue6 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 50, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 584, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24290));
                                    c2 = 1;
                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr128);
                                    c3 = 0;
                                    cls54.getField((java.lang.String) objArr128[0]).set(null, java.lang.Long.valueOf(longValue6));
                                    i3 = ((int[]) objArr3[c2])[c3];
                                    if (((int[]) objArr3[c3])[c3] == i3) {
                                    }
                                    java.lang.Class cls182 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.os.Process.getGidForName(str8), 754 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (45559 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                    java.lang.Object[] objArr462 = new java.lang.Object[1];
                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr462);
                                    j2 = cls182.getField((java.lang.String) objArr462[0]).getLong(null);
                                    if (j2 != -1) {
                                    }
                                    java.lang.Object[] objArr1202 = {java.lang.Integer.valueOf(i), -795427739};
                                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                                    if (obj == null) {
                                    }
                                    invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr1202);
                                    java.lang.Class cls502 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str8, 0, 0) + 47, 754 - android.graphics.Color.red(0), (char) (45559 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                    byte b402 = bArr[5];
                                    byte b412 = bArr[60];
                                    java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                    d(b402, b412, (byte) (b412 | com.google.common.base.Ascii.CAN), objArr1222);
                                    cls502.getField((java.lang.String) objArr1222[0]).set(null, invoke);
                                    long longValue42 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Class cls512 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 48, android.view.KeyEvent.normalizeMetaState(0) + 754, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45512));
                                    java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr1232);
                                    cls512.getField((java.lang.String) objArr1232[0]).set(null, java.lang.Long.valueOf(longValue42));
                                    int i3222 = getCiacDecline;
                                    getGpoResponse = (((i3222 | 115) << 1) - (i3222 ^ 115)) % 128;
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                                    if (obj2 == null) {
                                    }
                                    intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(invoke, null)).intValue();
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                                    if (obj3 == null) {
                                    }
                                    intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(invoke, null)).intValue();
                                    if (intValue2 != intValue) {
                                    }
                                    if (sethandwritingdelegatorcallback != com.payair.hce.setHandwritingDelegatorCallback.writeReplace) {
                                    }
                                    java.lang.Class cls2222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, 922 - android.graphics.Color.blue(0), (char) android.text.TextUtils.getTrimmedLength(str8));
                                    java.lang.Object[] objArr5622 = new java.lang.Object[1];
                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr5622);
                                    j3 = cls2222.getField((java.lang.String) objArr5622[0]).getLong(null);
                                    if (j3 != -1) {
                                    }
                                    java.lang.Object[] objArr5722 = {-1269401958};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                                    if (obj4 == null) {
                                    }
                                    AlternateContactlessPaymentDataJson$5f5b6fcf = com.payair.hce.setOverScrollMode.AlternateContactlessPaymentDataJson$5f5b6fcf(i2, ((java.lang.reflect.Constructor) obj4).newInstance(objArr5722), 535522761);
                                    java.lang.Class cls2322 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str8, 0) + 44, android.text.TextUtils.getCapsMode(str8, 0, 0) + 922, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    java.lang.Object[] objArr5822 = new java.lang.Object[1];
                                    d(bArr[18], bArr[5], bArr[10], objArr5822);
                                    cls2322.getField((java.lang.String) objArr5822[0]).set(null, AlternateContactlessPaymentDataJson$5f5b6fcf);
                                    long longValue52 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Class cls2422 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.Process.myTid() >> 22), 922 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                    c4 = 1;
                                    java.lang.Object[] objArr5922 = new java.lang.Object[1];
                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr5922);
                                    c5 = 0;
                                    cls2422.getField((java.lang.String) objArr5922[0]).set(null, java.lang.Long.valueOf(longValue52));
                                    i4 = ((int[]) AlternateContactlessPaymentDataJson$5f5b6fcf[c4])[c5];
                                    i5 = ((int[]) AlternateContactlessPaymentDataJson$5f5b6fcf[c5])[c5];
                                    if (i5 != i4) {
                                    }
                                    java.lang.Class cls2822 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str8) + 51, android.graphics.Color.red(0) + 584, (char) (24291 - android.view.KeyEvent.keyCodeFromString(str8)));
                                    java.lang.Object[] objArr6922 = new java.lang.Object[1];
                                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr6922);
                                    j4 = cls2822.getField((java.lang.String) objArr6922[0]).getLong(null);
                                    if (j4 != -1) {
                                    }
                                    baseContext = getBaseContext();
                                    if (baseContext != null) {
                                    }
                                    if (baseContext != null) {
                                    }
                                    java.lang.Object[] objArr7222 = {baseContext, java.lang.Integer.valueOf(i), 957814656};
                                    byte[] bArr722 = $$d;
                                    java.lang.Object[] objArr7322 = new java.lang.Object[1];
                                    e(bArr722[49], (short) (-bArr722[514]), bArr722[180], objArr7322);
                                    java.lang.Class<?> cls3022 = java.lang.Class.forName((java.lang.String) objArr7322[0]);
                                    byte b2422 = bArr722[30];
                                    java.lang.Object[] objArr7422 = new java.lang.Object[1];
                                    e(b2422, (short) (b2422 | 622), bArr722[17], objArr7422);
                                    java.lang.String str1722 = (java.lang.String) objArr7422[0];
                                    char offsetAfter22 = (char) android.text.TextUtils.getOffsetAfter(str8, 0);
                                    int lastIndexOf222 = android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                    int i18222 = lastIndexOf222 * (-813);
                                    int i18322 = 707208808 & i18222;
                                    int i18422 = i18322 + ((i18222 ^ 707208808) | i18322);
                                    int i18522 = 198277376 & lastIndexOf222;
                                    int i18622 = i18522 | ((~i18522) & (198277376 | lastIndexOf222));
                                    int i18722 = ~i18622;
                                    int i18822 = (i18622 | i18722) & i18722;
                                    int i18922 = (lastIndexOf222 ^ i2) | (lastIndexOf222 & i2);
                                    int i19022 = ~i18922;
                                    num7 = num6;
                                    java.lang.String str1822 = str8;
                                    int i19122 = ((~i19022) & i18822) | ((~i18822) & i19022);
                                    int i19222 = i18822 & i19022;
                                    int i19322 = -(~(((i19222 & i19122) | (i19122 ^ i19222)) * (-814)));
                                    int i19422 = (-2) - (~((i18422 ^ i19322) + ((i19322 & i18422) << 1)));
                                    int i19522 = ~i2;
                                    int i19622 = (i19522 & 198277376) | (198277376 ^ i19522);
                                    int i19722 = ~lastIndexOf222;
                                    int i19822 = (198277376 & i19722) | ((~i19722) & (-198277377));
                                    int i19922 = (-198277377) & i19722;
                                    java.lang.String str1922 = str14;
                                    int i20022 = ~i19622;
                                    int i20122 = ((i19622 | i20022) & i20022) | (~((i19822 & i19922) | (i19822 ^ i19922)));
                                    int i20222 = (i19022 | i18922) & i19022;
                                    int i20322 = ((~i20122) & i20222) | ((~i20222) & i20122);
                                    int i20422 = i20122 & i20222;
                                    int i20522 = -(-(((i20422 ^ i20322) | (i20422 & i20322)) * 407));
                                    int i20622 = ~(((-198277377) ^ i19722) | i19922);
                                    int i20722 = i19722 | i2;
                                    int i20822 = ~i20722;
                                    int i20922 = (i20722 | i20822) & i20822;
                                    int i21022 = i20622 & i20922;
                                    int i21122 = (i20922 | i20622) & (~i21022);
                                    int i21222 = (i21122 ^ i21022) | (i21122 & i21022);
                                    int i21322 = (-198277377) & i2;
                                    int i21422 = (~i21322) & ((-198277377) | i2);
                                    int i21522 = (i21322 ^ i21422) | (i21322 & i21422);
                                    int i21622 = ~i21522;
                                    int i21722 = (i21522 | i21622) & i21622;
                                    java.lang.Object[] objArr7522 = new java.lang.Object[1];
                                    c("︰⺆⫴ⷮ", offsetAfter22, "ꒈ폾\uf4b8⥱똱Ș曜쟏揈磦\uf726ꐷ㽐둁脽㯣㻕嫄踻廥蠏本ጣ", "\u0000\u0000\u0000\u0000", (((((i19422 ^ i20522) | (i19422 & i20522)) << 1) - ((i19422 & (~i20522)) | ((~i19422) & i20522))) - (~(-(-(((i21222 ^ i21722) | (i21222 & i21722)) * 407))))) - 1, objArr7522);
                                    objArr4 = (java.lang.Object[]) cls3022.getMethod(str1722, java.lang.Class.forName((java.lang.String) objArr7522[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr7222);
                                    if (baseContext == null) {
                                    }
                                }
                            }
                            long longValue522 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls24222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.Process.myTid() >> 22), 922 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                            c4 = 1;
                            java.lang.Object[] objArr59222 = new java.lang.Object[1];
                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr59222);
                            c5 = 0;
                            cls24222.getField((java.lang.String) objArr59222[0]).set(null, java.lang.Long.valueOf(longValue522));
                            i4 = ((int[]) AlternateContactlessPaymentDataJson$5f5b6fcf[c4])[c5];
                            i5 = ((int[]) AlternateContactlessPaymentDataJson$5f5b6fcf[c5])[c5];
                            if (i5 != i4) {
                            }
                            java.lang.Class cls28222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str8) + 51, android.graphics.Color.red(0) + 584, (char) (24291 - android.view.KeyEvent.keyCodeFromString(str8)));
                            java.lang.Object[] objArr69222 = new java.lang.Object[1];
                            d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr69222);
                            j4 = cls28222.getField((java.lang.String) objArr69222[0]).getLong(null);
                            if (j4 != -1) {
                            }
                            baseContext = getBaseContext();
                            if (baseContext != null) {
                            }
                            if (baseContext != null) {
                            }
                            java.lang.Object[] objArr72222 = {baseContext, java.lang.Integer.valueOf(i), 957814656};
                            byte[] bArr7222 = $$d;
                            java.lang.Object[] objArr73222 = new java.lang.Object[1];
                            e(bArr7222[49], (short) (-bArr7222[514]), bArr7222[180], objArr73222);
                            java.lang.Class<?> cls30222 = java.lang.Class.forName((java.lang.String) objArr73222[0]);
                            byte b24222 = bArr7222[30];
                            java.lang.Object[] objArr74222 = new java.lang.Object[1];
                            e(b24222, (short) (b24222 | 622), bArr7222[17], objArr74222);
                            java.lang.String str17222 = (java.lang.String) objArr74222[0];
                            char offsetAfter222 = (char) android.text.TextUtils.getOffsetAfter(str8, 0);
                            int lastIndexOf2222 = android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            int i182222 = lastIndexOf2222 * (-813);
                            int i183222 = 707208808 & i182222;
                            int i184222 = i183222 + ((i182222 ^ 707208808) | i183222);
                            int i185222 = 198277376 & lastIndexOf2222;
                            int i186222 = i185222 | ((~i185222) & (198277376 | lastIndexOf2222));
                            int i187222 = ~i186222;
                            int i188222 = (i186222 | i187222) & i187222;
                            int i189222 = (lastIndexOf2222 ^ i2) | (lastIndexOf2222 & i2);
                            int i190222 = ~i189222;
                            num7 = num6;
                            java.lang.String str18222 = str8;
                            int i191222 = ((~i190222) & i188222) | ((~i188222) & i190222);
                            int i192222 = i188222 & i190222;
                            int i193222 = -(~(((i192222 & i191222) | (i191222 ^ i192222)) * (-814)));
                            int i194222 = (-2) - (~((i184222 ^ i193222) + ((i193222 & i184222) << 1)));
                            int i195222 = ~i2;
                            int i196222 = (i195222 & 198277376) | (198277376 ^ i195222);
                            int i197222 = ~lastIndexOf2222;
                            int i198222 = (198277376 & i197222) | ((~i197222) & (-198277377));
                            int i199222 = (-198277377) & i197222;
                            java.lang.String str19222 = str14;
                            int i200222 = ~i196222;
                            int i201222 = ((i196222 | i200222) & i200222) | (~((i198222 & i199222) | (i198222 ^ i199222)));
                            int i202222 = (i190222 | i189222) & i190222;
                            int i203222 = ((~i201222) & i202222) | ((~i202222) & i201222);
                            int i204222 = i201222 & i202222;
                            int i205222 = -(-(((i204222 ^ i203222) | (i204222 & i203222)) * 407));
                            int i206222 = ~(((-198277377) ^ i197222) | i199222);
                            int i207222 = i197222 | i2;
                            int i208222 = ~i207222;
                            int i209222 = (i207222 | i208222) & i208222;
                            int i210222 = i206222 & i209222;
                            int i211222 = (i209222 | i206222) & (~i210222);
                            int i212222 = (i211222 ^ i210222) | (i211222 & i210222);
                            int i213222 = (-198277377) & i2;
                            int i214222 = (~i213222) & ((-198277377) | i2);
                            int i215222 = (i213222 ^ i214222) | (i213222 & i214222);
                            int i216222 = ~i215222;
                            int i217222 = (i215222 | i216222) & i216222;
                            java.lang.Object[] objArr75222 = new java.lang.Object[1];
                            c("︰⺆⫴ⷮ", offsetAfter222, "ꒈ폾\uf4b8⥱똱Ș曜쟏揈磦\uf726ꐷ㽐둁脽㯣㻕嫄踻廥蠏本ጣ", "\u0000\u0000\u0000\u0000", (((((i194222 ^ i205222) | (i194222 & i205222)) << 1) - ((i194222 & (~i205222)) | ((~i194222) & i205222))) - (~(-(-(((i212222 ^ i217222) | (i212222 & i217222)) * 407))))) - 1, objArr75222);
                            objArr4 = (java.lang.Object[]) cls30222.getMethod(str17222, java.lang.Class.forName((java.lang.String) objArr75222[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr72222);
                            if (baseContext == null) {
                            }
                        } catch (java.lang.Exception unused5) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                        long longValue422 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls5122 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 48, android.view.KeyEvent.normalizeMetaState(0) + 754, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45512));
                        java.lang.Object[] objArr12322 = new java.lang.Object[1];
                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr12322);
                        cls5122.getField((java.lang.String) objArr12322[0]).set(null, java.lang.Long.valueOf(longValue422));
                        int i32222 = getCiacDecline;
                        getGpoResponse = (((i32222 | 115) << 1) - (i32222 ^ 115)) % 128;
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                        if (obj2 == null) {
                        }
                        intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(invoke, null)).intValue();
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                        if (obj3 == null) {
                        }
                        intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(invoke, null)).intValue();
                        if (intValue2 != intValue) {
                        }
                        if (sethandwritingdelegatorcallback != com.payair.hce.setHandwritingDelegatorCallback.writeReplace) {
                        }
                        java.lang.Class cls22222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, 922 - android.graphics.Color.blue(0), (char) android.text.TextUtils.getTrimmedLength(str8));
                        java.lang.Object[] objArr56222 = new java.lang.Object[1];
                        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr56222);
                        j3 = cls22222.getField((java.lang.String) objArr56222[0]).getLong(null);
                        if (j3 != -1) {
                        }
                        java.lang.Object[] objArr57222 = {-1269401958};
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                        if (obj4 == null) {
                        }
                        AlternateContactlessPaymentDataJson$5f5b6fcf = com.payair.hce.setOverScrollMode.AlternateContactlessPaymentDataJson$5f5b6fcf(i2, ((java.lang.reflect.Constructor) obj4).newInstance(objArr57222), 535522761);
                        java.lang.Class cls23222 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str8, 0) + 44, android.text.TextUtils.getCapsMode(str8, 0, 0) + 922, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr58222 = new java.lang.Object[1];
                        d(bArr[18], bArr[5], bArr[10], objArr58222);
                        cls23222.getField((java.lang.String) objArr58222[0]).set(null, AlternateContactlessPaymentDataJson$5f5b6fcf);
                    } catch (java.lang.Exception unused6) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    long longValue62 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls542 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 50, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 584, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24290));
                    c2 = 1;
                    java.lang.Object[] objArr1282 = new java.lang.Object[1];
                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr1282);
                    c3 = 0;
                    cls542.getField((java.lang.String) objArr1282[0]).set(null, java.lang.Long.valueOf(longValue62));
                    i3 = ((int[]) objArr3[c2])[c3];
                    if (((int[]) objArr3[c3])[c3] == i3) {
                    }
                    java.lang.Class cls1822 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.os.Process.getGidForName(str8), 754 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (45559 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                    java.lang.Object[] objArr4622 = new java.lang.Object[1];
                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr4622);
                    j2 = cls1822.getField((java.lang.String) objArr4622[0]).getLong(null);
                    if (j2 != -1) {
                    }
                    java.lang.Object[] objArr12022 = {java.lang.Integer.valueOf(i), -795427739};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                    if (obj == null) {
                    }
                    invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr12022);
                    java.lang.Class cls5022 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str8, 0, 0) + 47, 754 - android.graphics.Color.red(0), (char) (45559 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    byte b4022 = bArr[5];
                    byte b4122 = bArr[60];
                    java.lang.Object[] objArr12222 = new java.lang.Object[1];
                    d(b4022, b4122, (byte) (b4122 | com.google.common.base.Ascii.CAN), objArr12222);
                    cls5022.getField((java.lang.String) objArr12222[0]).set(null, invoke);
                } catch (java.lang.Exception unused7) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
                java.lang.String str23 = str3;
                android.content.Context baseContext4 = getBaseContext();
                if (baseContext4 == null) {
                    int i323 = getCiacDecline;
                    int i324 = i323 ^ 115;
                    int i325 = ((i323 & 115) | i324) << 1;
                    int i326 = -i324;
                    getGpoResponse = ((i325 ^ i326) + ((i325 & i326) << 1)) % 128;
                    int i327 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i328 = i327 & 127;
                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                    b(i328 + ((i327 ^ 127) | i328), null, null, "\u0086\u0083\u0081\u008c\u0094\u0093\u0092\u0088\u0089\u0091\u0089\u0088\u0090\u008f\u008e\u0084\u0084\u0083\u008e\u0086\u0089\u008d\u008c\u0086\u008b\u0083", objArr129);
                    java.lang.Class<?> cls55 = java.lang.Class.forName((java.lang.String) objArr129[0]);
                    char myPid = (char) (android.os.Process.myPid() >> 22);
                    int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                    int i329 = maximumFlingVelocity * (-183);
                    int i330 = (i329 | 3330) << 1;
                    int i331 = -((i329 & (-3331)) | ((~i329) & 3330));
                    int i332 = ~maximumFlingVelocity;
                    int i333 = (i332 | maximumFlingVelocity) & i332;
                    int i334 = -(-(((i333 & 18) | ((~i333) & 18) | (i333 & (-19))) * (-368)));
                    int i335 = i332 & (-19);
                    str5 = str2;
                    int i336 = i335 | (maximumFlingVelocity & 18) | (maximumFlingVelocity & (-19));
                    str4 = str23;
                    num4 = num3;
                    i2 = i;
                    int i337 = ~i2;
                    str6 = str14;
                    int i338 = (i337 | i2) & i337;
                    int i339 = (((-2) - (~((((i330 | i331) << 1) - (i331 ^ i330)) - (~i334)))) - (~(((((~i338) & i336) | ((~i336) & i338)) | (i336 & i338)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) - 1;
                    int i340 = ~((i332 ^ (-19)) | i335);
                    int i341 = i337 ^ maximumFlingVelocity;
                    int i342 = i337 & maximumFlingVelocity;
                    int i343 = (i342 ^ i341) | (i341 & i342);
                    int i344 = ~i343;
                    int i345 = (i343 | i344) & i344;
                    int i346 = (i345 ^ i340) | (i340 & i345);
                    int i347 = ~(maximumFlingVelocity | 18);
                    int i348 = ((~i347) & i346) | ((~i346) & i347);
                    int i349 = i347 & i346;
                    int i350 = -(-(((i349 ^ i348) | (i349 & i348)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                    int i351 = i339 & i350;
                    int i352 = i350 | i339;
                    java.lang.Object[] objArr130 = new java.lang.Object[1];
                    a(myPid, ((i351 | i352) << 1) - (i352 ^ i351), 21 - (~(-android.view.View.getDefaultSize(0, 0))), objArr130);
                    baseContext4 = (android.content.Context) cls55.getMethod((java.lang.String) objArr130[0], new java.lang.Class[0]).invoke(null, null);
                } else {
                    str4 = str23;
                    num4 = num3;
                    str5 = str2;
                    str6 = str14;
                    i2 = i;
                }
                if (baseContext4 != null) {
                    int i353 = 2123878259 ^ i2;
                    int i354 = 2123878259 & i2;
                    int i355 = ~((i353 ^ i354) | (i354 & i353));
                    int i356 = (-2045510326) & i355;
                    int i357 = (i355 | (-2045510326)) & (~i356);
                    int i358 = -(-(((i357 ^ i356) | (i357 & i356)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
                    int i359 = ((-1474528174) & i358) + (i358 | (-1474528174));
                    int i360 = (-9664656) & i359;
                    int i361 = i360 + ((i359 ^ (-9664656)) | i360);
                    int i362 = ~i2;
                    int i363 = (i362 | i2) & i362;
                    int i364 = ~((i363 ^ 2123878259) | (2123878259 & i363));
                    int i365 = (i364 ^ 101961026) | (101961026 & i364);
                    int i366 = (-2147471352) ^ i365;
                    int i367 = i365 & (-2147471352);
                    int i368 = ((i367 ^ i366) | (i367 & i366)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                    int i369 = ~(((-1316624748) & i2) | ((-1316624748) ^ i2));
                    int i370 = ((~i369) & 666478346) | ((-666478347) & i369);
                    int i371 = i369 & 666478346;
                    int i372 = -(-(((i371 ^ i370) | (i371 & i370)) * (-948)));
                    int i373 = (-563796136) & i372;
                    int i374 = i372 | (-563796136);
                    int i375 = (i373 & i374) + (i374 | i373);
                    int i376 = (-1212291170) & i362;
                    int i377 = (i362 | (-1212291170)) & (~i376);
                    int i378 = (i377 ^ i376) | (i377 & i376);
                    int i379 = ~i378;
                    int i380 = ((i378 | i379) & i379) * (-948);
                    int i381 = i375 & i380;
                    int i382 = (i381 - (~((i380 ^ i375) | i381))) - 1;
                    int i383 = (-123985084) & i382;
                    int i384 = (i382 | (-123985084)) & (~i383);
                    int i385 = -(-(i383 << 1));
                    if ((i361 ^ i368) + ((i361 & i368) << 1) > (i384 ^ i385) + ((i384 & i385) << 1)) {
                        baseContext4.getApplicationContext();
                        throw null;
                    }
                    baseContext4 = baseContext4.getApplicationContext();
                }
                java.lang.Object[] objArr131 = {baseContext4, java.lang.Integer.valueOf(i), 0, 868393350};
                byte b45 = $$d[49];
                int i386 = $$e;
                java.lang.Object[] objArr132 = new java.lang.Object[1];
                e(b45, (short) (i386 | 185), r4[446], objArr132);
                java.lang.Class<?> cls56 = java.lang.Class.forName((java.lang.String) objArr132[0]);
                byte b46 = (byte) i386;
                java.lang.Object[] objArr133 = new java.lang.Object[1];
                e(b46, (short) (b46 | 710), r4[121], objArr133);
                java.lang.String str24 = (java.lang.String) objArr133[0];
                char resolveOpacity = (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                int size = android.view.View.MeasureSpec.getSize(0);
                int i387 = (size * (-958)) + 971167100;
                int i388 = ~i2;
                int i389 = ~(198277377 | i388);
                int i390 = ~size;
                num5 = 0;
                int i391 = i390 & i2;
                str7 = str13;
                int i392 = (~i391) & (i390 | i2);
                int i393 = ~((i392 ^ i391) | (i392 & i391));
                int i394 = i389 & i393;
                bArr = bArr3;
                int i395 = (i393 | i389) & (~i394);
                int i396 = (i395 & i394) | (i395 ^ i394);
                int i397 = i388 & size;
                int i398 = ~(i397 | ((~i397) & (i388 | size)));
                int i399 = ((~i396) & i398) | ((~i398) & i396);
                int i400 = i396 & i398;
                int i401 = ((i400 ^ i399) | (i400 & i399)) * 959;
                int i402 = (((i387 ^ i401) | (i387 & i401)) << 1) - (((~i401) & i387) | ((~i387) & i401));
                int i403 = ((-198277378) & size) | ((-198277378) ^ size);
                int i404 = ~i403;
                int i405 = ((i403 | i404) & i404) * (-959);
                int i406 = i402 & i405;
                int i407 = -((i405 | i402) & (~i406));
                int i408 = (i390 | size) & i390;
                int i409 = i388 & (i388 | i2);
                int i410 = i408 & i409;
                android.content.Context context = baseContext4;
                int i411 = (~i410) & (i409 | i408);
                int i412 = ~((i411 ^ i410) | (i411 & i410));
                int i413 = 198277377 & i2;
                int i414 = (~i413) & (198277377 | i2);
                int i415 = ~((i413 & i414) | (i414 ^ i413));
                int i416 = i412 ^ i415;
                int i417 = i412 & i415;
                int i418 = (i417 ^ i416) | (i417 & i416);
                int i419 = size ^ i2;
                int i420 = size & i2;
                int i421 = ~((i420 ^ i419) | (i419 & i420));
                int i422 = ((~i421) & i418) | ((~i418) & i421);
                int i423 = i418 & i421;
                int i424 = (((((i405 ^ i402) | i406) << 1) - (~i407)) - 1) - (~(((i423 ^ i422) | (i423 & i422)) * 959));
                java.lang.Object[] objArr134 = new java.lang.Object[1];
                c("︰⺆⫴ⷮ", resolveOpacity, "ꒈ폾\uf4b8⥱똱Ș曜쟏揈磦\uf726ꐷ㽐둁脽㯣㻕嫄踻廥蠏本ጣ", "\u0000\u0000\u0000\u0000", (~i424) + (i424 << 1), objArr134);
                objArr2 = (java.lang.Object[]) cls56.getMethod(str24, java.lang.Class.forName((java.lang.String) objArr134[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr131);
                if (context != null) {
                    getCiacDecline = (getGpoResponse + 105) % 128;
                    java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 48, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1581, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr135);
                    cls57.getField((java.lang.String) objArr135[0]).set(null, objArr2);
                    try {
                        str14 = str6;
                        long longValue7 = ((java.lang.Long) java.lang.Class.forName(str7).getDeclaredMethod(str14, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        str8 = str4;
                        java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 48, 1581 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.text.TextUtils.getOffsetBefore(str8, 0));
                        byte b47 = bArr[18];
                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                        d(b47, b47, (short) 24, objArr136);
                        cls58.getField((java.lang.String) objArr136[0]).set(null, java.lang.Long.valueOf(longValue7));
                    } catch (java.lang.Exception unused8) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                } else {
                    str8 = str4;
                    str14 = str6;
                }
                c = 1;
                if (((int[]) objArr2[0])[0] != ((int[]) objArr2[c])[0]) {
                }
                sethandwritingdelegatorcallback = (com.payair.hce.setHandwritingDelegatorCallback) writeReplace(new java.lang.Object[]{this}, -1759117460, 1759117460, java.lang.System.identityHashCode(this));
                java.lang.Class cls152 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 583 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (24291 - android.text.TextUtils.getTrimmedLength(str8)));
                java.lang.Object[] objArr372 = new java.lang.Object[1];
                d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.google.common.base.Ascii.GS, (short) 41, objArr372);
                j = cls152.getField((java.lang.String) objArr372[0]).getLong(null);
                if (j != -1) {
                }
                num6 = num4;
                str9 = str5;
                java.lang.Object[] objArr1242 = {java.lang.Integer.valueOf(i), -23138150};
                byte[] bArr102 = $$d;
                byte b422 = bArr102[49];
                java.lang.Object[] objArr1252 = new java.lang.Object[1];
                e(b422, (short) (b422 | 137), bArr102[52], objArr1252);
                java.lang.Class<?> cls522 = java.lang.Class.forName((java.lang.String) objArr1252[0]);
                byte b432 = bArr102[30];
                java.lang.Object[] objArr1262 = new java.lang.Object[1];
                e(b432, (short) (b432 | 622), bArr102[17], objArr1262);
                objArr3 = (java.lang.Object[]) cls522.getMethod((java.lang.String) objArr1262[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr1242);
                java.lang.Class cls532 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24290));
                byte b442 = (byte) (-bArr[17]);
                java.lang.Object[] objArr1272 = new java.lang.Object[1];
                d(b442, b442, (short) 75, objArr1272);
                cls532.getField((java.lang.String) objArr1272[0]).set(null, objArr3);
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    public static void initialize(com.payair.hce.getText gettext) {
        int i = getGpoResponse;
        int i2 = i & 7;
        int i3 = -(-((i ^ 7) | i2));
        getCiacDecline = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        values = gettext;
        getCiacDecline = (((i & (-76)) | ((~i) & 75)) + ((i & 75) << 1)) % 128;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = getGpoResponse + 41;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (com.payair.hce.setDefaultFocusHighlightEnabled) com.payair.hce.setImportantForAccessibility.DigitizedCardProfile();
            throw null;
        }
        com.payair.hce.setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled2 = (com.payair.hce.setDefaultFocusHighlightEnabled) com.payair.hce.setImportantForAccessibility.DigitizedCardProfile();
        if (!((java.lang.Boolean) com.payair.hce.setDefaultFocusHighlightEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setdefaultfocushighlightenabled2}, 1575419740, -1575419731, java.lang.System.identityHashCode(setdefaultfocushighlightenabled2))).booleanValue() && ((java.lang.Boolean) com.payair.hce.setFocusable.values(new java.lang.Object[0], -1412771103, 1412771113, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            int i2 = getGpoResponse;
            int i3 = i2 & 7;
            int i4 = ((((i2 ^ 7) | i3) << 1) - (~(-((i2 | 7) & (~i3))))) - 1;
            getCiacDecline = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (!((java.lang.Boolean) com.payair.hce.setTranslationX.valueOf(new java.lang.Object[0], -626139571, 626139574, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                com.payair.hce.setFocusable.values(new java.lang.Object[]{java.lang.Boolean.TRUE}, -1344828092, 1344828095, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setTranslationX.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis())}, -325243520, 325243521, (int) java.lang.System.currentTimeMillis());
                int i5 = getCiacDecline;
                getGpoResponse = ((((i5 | 52) << 1) - (i5 ^ 52)) - 1) % 128;
            }
        }
        int i6 = getCiacDecline + 19;
        getGpoResponse = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05ab A[Catch: all -> 0x085c, TryCatch #3 {all -> 0x085c, blocks: (B:7:0x00ed, B:9:0x0105, B:10:0x013c, B:14:0x02c9, B:16:0x02de, B:17:0x0316, B:24:0x04c4, B:26:0x04e0, B:27:0x051f, B:31:0x06d7, B:33:0x06f0, B:34:0x072b, B:40:0x07d7, B:42:0x07f0, B:43:0x082a, B:52:0x0588, B:54:0x05ab, B:55:0x05fb, B:67:0x03a1, B:69:0x03b6, B:70:0x03eb, B:72:0x019e, B:74:0x01b8, B:75:0x01ed), top: B:2:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0325  */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(android.content.Context context) {
        java.lang.Object[] valueOf$4956fc2a;
        int i;
        int i2;
        long j;
        java.lang.Object obj;
        java.lang.Object[] objArr;
        int i3;
        getCiacDecline = (getGpoResponse + 103) % 128;
        super.attachBaseContext(context);
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.View.combineMeasuredStates(0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 923, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
        byte[] bArr = $$a;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr2);
        long j2 = cls.getField((java.lang.String) objArr2[0]).getLong(null);
        try {
            try {
                try {
                    try {
                        if (j2 != -1) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a((char) (6461 - android.os.Process.getGidForName("")), 22 - android.view.View.combineMeasuredStates(0, 0), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, objArr3);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            b(127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr4);
                            if (j2 + 4611686018427387910L >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 922, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                d(bArr[18], bArr[5], bArr[10], objArr5);
                                java.lang.Object[] objArr6 = {cls3.getField((java.lang.String) objArr5[0]).get(null), 607841342, 0};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 46, 4860 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj2);
                                }
                                valueOf$4956fc2a = (java.lang.Object[]) ((java.lang.reflect.Method) obj2).invoke(null, objArr6);
                                i = ((int[]) valueOf$4956fc2a[1])[0];
                                i2 = ((int[]) valueOf$4956fc2a[0])[0];
                                if (i2 != i) {
                                    java.lang.Object[] objArr7 = {valueOf$4956fc2a, java.lang.Integer.valueOf(((int[]) valueOf$4956fc2a[3])[0]), 0};
                                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                    if (obj3 == null) {
                                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45, android.graphics.ImageFormat.getBitsPerPixel(0) + 4861, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj3);
                                    }
                                    ((java.lang.reflect.Method) obj3).invoke(null, objArr7);
                                    getCiacDecline = (getGpoResponse + 85) % 128;
                                } else {
                                    new java.util.ArrayList().add((java.lang.String) valueOf$4956fc2a[2]);
                                    long j3 = i ^ i2;
                                    getCiacDecline = (getGpoResponse + 31) % 128;
                                    try {
                                        java.lang.Object[] objArr8 = {java.lang.Long.valueOf(2332495965639933952L ^ j3), 543076539L};
                                        byte[] bArr2 = $$d;
                                        byte b = bArr2[49];
                                        int i4 = $$e;
                                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                                        e(b, (short) (i4 | 105), bArr2[315], objArr9);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                        e((byte) (-bArr2[156]), (short) (i4 | 578), bArr2[843], objArr10);
                                        cls4.getMethod((java.lang.String) objArr10[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr8);
                                        java.lang.Object[] objArr11 = {valueOf$4956fc2a, java.lang.Integer.valueOf(((int[]) valueOf$4956fc2a[3])[0]), 0};
                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                                        if (obj4 == null) {
                                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.indexOf("", ""), android.view.Gravity.getAbsoluteGravity(0, 0) + 4860, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj4);
                                        }
                                        ((java.lang.reflect.Method) obj4).invoke(null, objArr11);
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 47, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)));
                                byte b2 = bArr[18];
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                d(b2, b2, (short) 24, objArr12);
                                j = cls5.getField((java.lang.String) objArr12[0]).getLong(null);
                                if (j != -1) {
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    a((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6463), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr13);
                                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr14);
                                    if (j + 1973 >= ((java.lang.Long) cls6.getDeclaredMethod((java.lang.String) objArr14[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                        byte b3 = bArr[5];
                                        byte b4 = bArr[60];
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        d(b3, b4, (byte) (b4 | com.google.common.base.Ascii.CAN), objArr15);
                                        java.lang.Object[] objArr16 = {cls7.getField((java.lang.String) objArr15[0]).get(null), -152132236, 0};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                        if (obj5 == null) {
                                            obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4716, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj5);
                                        }
                                        objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj5).invoke(null, objArr16);
                                        i3 = ((int[]) objArr[1])[0];
                                        if (((int[]) objArr[0])[0] == i3) {
                                            java.lang.Object[] objArr17 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[9])[0]), 0};
                                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                            if (obj6 == null) {
                                                obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 33, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4717, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj6);
                                            }
                                            ((java.lang.reflect.Method) obj6).invoke(null, objArr17);
                                            return;
                                        }
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add((java.lang.String) objArr[2]);
                                        arrayList.add((java.lang.String) objArr[3]);
                                        arrayList.add((java.lang.String) objArr[4]);
                                        arrayList.add((java.lang.String) objArr[5]);
                                        arrayList.add((java.lang.String) objArr[6]);
                                        arrayList.add((java.lang.String) objArr[7]);
                                        arrayList.add((java.lang.String) objArr[8]);
                                        java.lang.Object[] objArr18 = {java.lang.Long.valueOf((i3 ^ r7) ^ (-2438874200958566400L)), -567844649L};
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        e(r3[49], (short) (-$$d[64]), r3[446], objArr19);
                                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                        byte b5 = (byte) $$e;
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        e(b5, (short) (b5 | 710), r3[121], objArr20);
                                        cls8.getMethod((java.lang.String) objArr20[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr18);
                                        java.lang.Object[] objArr21 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[9])[0]), 0};
                                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                                        if (obj7 == null) {
                                            obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 33, 4717 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj7);
                                        }
                                        ((java.lang.reflect.Method) obj7).invoke(null, objArr21);
                                        return;
                                    }
                                }
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                a((char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 40 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr22);
                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr22[0]);
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                a((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 16 - android.widget.ExpandableListView.getPackedPositionType(0L), 56 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr23);
                                java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(((java.lang.Integer) cls9.getMethod((java.lang.String) objArr23[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, -152132236};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                                if (obj == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - (android.os.Process.myTid() >> 22)));
                                    byte b6 = bArr[18];
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    d(b6, b6, (short) 24, objArr25);
                                    obj = cls10.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj);
                                }
                                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr24);
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 47, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.view.MotionEvent.axisFromString("") + 34285));
                                byte b7 = bArr[5];
                                byte b8 = bArr[60];
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                d(b7, b8, (byte) (b8 | com.google.common.base.Ascii.CAN), objArr26);
                                cls11.getField((java.lang.String) objArr26[0]).set(null, objArr);
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                a((char) (6461 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 22 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr27);
                                java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                b(android.graphics.Color.red(0) + 127, null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr28);
                                long longValue = ((java.lang.Long) cls12.getDeclaredMethod((java.lang.String) objArr28[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 47, 707 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (34284 - android.graphics.Color.alpha(0)));
                                byte b9 = bArr[18];
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                d(b9, b9, (short) 24, objArr29);
                                cls13.getField((java.lang.String) objArr29[0]).set(null, java.lang.Long.valueOf(longValue));
                                getCiacDecline = (getGpoResponse + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                i3 = ((int[]) objArr[1])[0];
                                if (((int[]) objArr[0])[0] == i3) {
                                }
                            }
                        }
                        java.lang.Object[] objArr272 = new java.lang.Object[1];
                        a((char) (6461 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 22 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr272);
                        java.lang.Class<?> cls122 = java.lang.Class.forName((java.lang.String) objArr272[0]);
                        java.lang.Object[] objArr282 = new java.lang.Object[1];
                        b(android.graphics.Color.red(0) + 127, null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr282);
                        long longValue2 = ((java.lang.Long) cls122.getDeclaredMethod((java.lang.String) objArr282[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Class cls132 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 47, 707 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (34284 - android.graphics.Color.alpha(0)));
                        byte b92 = bArr[18];
                        java.lang.Object[] objArr292 = new java.lang.Object[1];
                        d(b92, b92, (short) 24, objArr292);
                        cls132.getField((java.lang.String) objArr292[0]).set(null, java.lang.Long.valueOf(longValue2));
                        getCiacDecline = (getGpoResponse + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        i3 = ((int[]) objArr[1])[0];
                        if (((int[]) objArr[0])[0] == i3) {
                        }
                    } catch (java.lang.Exception unused) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    a((char) (6462 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 23, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr30);
                    java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    b(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u0081\u008a\u0089\u0088\u0082\u0083\u0081\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr31);
                    long longValue3 = ((java.lang.Long) cls14.getDeclaredMethod((java.lang.String) objArr31[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 44, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 922, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    d(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, bArr[26], bArr[5], objArr32);
                    cls15.getField((java.lang.String) objArr32[0]).set(null, java.lang.Long.valueOf(longValue3));
                    i = ((int[]) valueOf$4956fc2a[1])[0];
                    i2 = ((int[]) valueOf$4956fc2a[0])[0];
                    if (i2 != i) {
                    }
                    java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 47, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34284 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)));
                    byte b22 = bArr[18];
                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                    d(b22, b22, (short) 24, objArr122);
                    j = cls52.getField((java.lang.String) objArr122[0]).getLong(null);
                    if (j != -1) {
                    }
                    java.lang.Object[] objArr222 = new java.lang.Object[1];
                    a((char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 40 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr222);
                    java.lang.Class<?> cls92 = java.lang.Class.forName((java.lang.String) objArr222[0]);
                    java.lang.Object[] objArr232 = new java.lang.Object[1];
                    a((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 16 - android.widget.ExpandableListView.getPackedPositionType(0L), 56 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr232);
                    java.lang.Object[] objArr242 = {java.lang.Integer.valueOf(((java.lang.Integer) cls92.getMethod((java.lang.String) objArr232[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, -152132236};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                    if (obj == null) {
                    }
                    objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr242);
                    java.lang.Class cls112 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 47, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (android.view.MotionEvent.axisFromString("") + 34285));
                    byte b72 = bArr[5];
                    byte b82 = bArr[60];
                    java.lang.Object[] objArr262 = new java.lang.Object[1];
                    d(b72, b82, (byte) (b82 | com.google.common.base.Ascii.CAN), objArr262);
                    cls112.getField((java.lang.String) objArr262[0]).set(null, objArr);
                } catch (java.lang.Exception unused2) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                a((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 16 - android.text.TextUtils.getOffsetAfter("", 0), 40 - android.text.TextUtils.getOffsetAfter("", 0), objArr33);
                java.lang.Class<?> cls16 = java.lang.Class.forName((java.lang.String) objArr33[0]);
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                a((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 16 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 57, objArr34);
                int intValue = ((java.lang.Integer) cls16.getMethod((java.lang.String) objArr34[0], java.lang.Object.class).invoke(null, this)).intValue();
                java.lang.Object[] objArr35 = {1105951794};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                if (obj8 == null) {
                    obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.resolveSizeAndState(0, 0, 0), 872 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (15955 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))).getDeclaredConstructor(java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj8);
                }
                valueOf$4956fc2a = com.payair.hce.provisionFromLocalStorage.valueOf$4956fc2a(intValue, ((java.lang.reflect.Constructor) obj8).newInstance(objArr35));
                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, 922 - android.text.TextUtils.indexOf("", "", 0, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                java.lang.Object[] objArr36 = new java.lang.Object[1];
                d(bArr[18], bArr[5], bArr[10], objArr36);
                cls17.getField((java.lang.String) objArr36[0]).set(null, valueOf$4956fc2a);
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void DigitizedCardProfile() {
        getProfileVersion = new char[]{18416, 1756, 50611, 33930, 17266, 599, 49447, 32842, 20198, 3545, 52449, 35651, 19020, 2341, 51215, 38649, 21964, 5249, 54155, 37479, 20814, 4133, 24268, 8185, 56475, 40372, 23110, 7022, 55305, 39195, 22471, 5348, 54685, 37447, 21352, 4105, 53553, 36811, 19696, 3474, 24261, 8173, 56479, 40359, 23053, 7020, 55324, 39220, 22480, 5306, 54690, 37463, 21368, 4124, 53536, 36815, 24262, 8168, 56460, 40360, 23127, 7017, 55305, 39203, 22527, 5365, 54658, 37446, 21320, 4103, 53537, 36807, 282, 16440, 33544, 49696, 1425, 17636, 34718, 50926, 2137, 19313, 35359, 52636, 3261, 20360, 36518, 53324, 4991, 21065, 38201, 54484, 6050, 22164, 38990, 56164, 6660, 23920, 40131, 57260, 7834, 25021, 41734, 57889, 9598, 25802, 42989, 59010, 10736, 27412, 43564, 60698, 11365, 28551, 44788, 61951, 13134, 29286, 46338, 62503, 14218, 30382, 47564, 63714, 14941, 32033, 48255, 65484, 16096, 33155, 49395, 525, 17784, 33870, 51040, 1744, 24267, 8174, 56460, 40355, 23067, 6960, 55327, 39276, 22407, 5283, 54722, 37404, 21307, 4110, 53543, 36762, 19629, 3528, 51898, 35584, 18550, 2374, 51147, 34027, 17797, 673, 49989, 32808, 16706, 15983, 64724, 48549, 31480, 15177, 63544, 47454, 30247, 13465, 62891, 45770, 29670, 12373, 61733, 44662, 27807, 11707, 60118, 44019, 26635, 10540, 58908, 42800, 25985, 8866, 58284, 41038, 24881, 56837, 40822, 23951, 6831, 56256, 39148, 22868, 59144, 42623, 25934, 9268, 58325, 41633, 25048, 8366, 60949, 44390, 27728, 11224, 60073, 43418, 26852, 13828, 62778, 46080, 29482, 12948, 61934, 45185, 32349, 15742, 64533, 47929, 31453, 14829, 63626, 34732, 17732, 1123, 49976, 33496, 16808, 196, 53173, 36098, 19564, 2831, 51749, 35221, 18658, 6121, 54539, 37929, 21268, 4671, 53698, 37097, 24537, 7845, 56390, 39776, 23097, 6621, 55536, 26513, 9905, 58446, 41831, 25100, 8486, 57540};
        IccPrivateKeyCrtComponentsJson = 7379351139194380172L;
        RecordsJson = new char[]{11058, 11019, 11070, 11023, 11008, 11059, 11041, 11011, 11062, 11018, 11021, 11009, 11020, 11085, 11102, 11056, 11013, 11014, 11043, 11063, 11057, 11075, 11074, 11072, 11076, 11079, 11073, 11077, 11061, 11087, 11078, 11086};
        SdkCoreBusinessLogicModuleImpl = -143185249;
        getPaymentFci = true;
        getCvrMaskAnd = true;
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getGpoResponse = 0;
        getCiacDecline = 1;
        DigitizedCardProfile();
        AlternateContactlessPaymentDataJson = 1263759066225628708L;
        SdkCoreAlternateContactlessPaymentDataImpl = -804334044;
        getAid = (char) 4680;
        int i = getCiacDecline + 5;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void AlternateContactlessPaymentDataJson() {
        writeReplace(new java.lang.Object[0], -1898845982, 1898845984, (int) java.lang.System.currentTimeMillis());
    }

    static void init$2() {
        $$g = new byte[]{39, 89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 10};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
    }

    static void init$1() {
        byte[] bArr = new byte[849];
        java.lang.System.arraycopy("9ÃÔ\u0088õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò1Ò\u0002\u0003$ê\u0012ïó\u0001\u000bû\u0002$çíÖù\u0010ô\u0005\u000eî\u0010#Õ\u0002û\u0014ÿð\t\bó\u0001$ðé\r\tøû1äî\u0014\u0018Ø\u0005\u0002õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Æ\u0006\u0000øû\f\u0004î\u0006\nö\u0010\u0014îö\u0005\fÿÿõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8È\u0003ò2Õ\f\u0000#ãÿü\u0004\"ÜøOñõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Ë\u0000ð\u000e\u0007ÿ%Í\u0002\r\u0004øû\f\u0007\u0003î\fû\u0002,Õ\u0003þ\u0005\bò\u0010\u0002Að\u0016öø\u0011óõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Ìò\u000e\u0005î\u0010#Õ\u0002\tþ\u0003ó\u0004\u0012î\fû\u0002,Õ\u0002û\u0010î\u0005Ü\u0003ÿö\fð\u0016\u0002\"ãð\u000f\u0015ß\u0004\nþþ\bõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò)äü\nóõ\u0003@Â\rï\u0000\u0010ô\u0010\u0003ð\u000f7Âþþ\u0010ú>Ì\u0003ð\u000f7¿ÿ\u0004\nþþ\b8¹F\u0004íÎ\u0003\u000bü\nó\u0001(Þ\tÿ\u0007\u0017ß\fð\n\b\u0010&èØ\u0005\u0002õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò\"ñò\u0004\u0004\u0001\bôõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Ìò\u000e\u0005î\u0010\"àð\u000e\u0007ÿ\u0016ß\u0004ü\u0010\u0003ð\u0010\u0002\u0012à\u0006þ\u0012û\u0003#Õ\u0002û\u0010î\u0005Qô\u0016öø\u0011\u0017êõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò4Öö\u0017é\u00070Ó\u0012ë\n\u0018ïö\r&ãÿü\u0004!Ø\u000e\u0000÷\b\u0002A®\u0006\nö\u0010\u0014îö\u0005\fÿÿõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò#îùÿü\u0010\u0016ðé\r\tøû1äî\u0014õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8½\u000eõý\u0011ó\u0000\"ïò\u001e÷ö\u0001\bò%èüõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8À\u0000\fø Þ0Ò\u000e\u0005î\u0010\"äî\u0014\u0000\u0002ï\u000fõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò%ß\u000eó\u0001\u000f\u0002õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8Æü\u001bã\u0012ôü\u0013ÿð\fû\u0002õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò,Ö\u0010ù+Ü\u0004\u0003ù\u0007\u0002õ\u0003@Â\rï\u0000\u0010ô\u0010\u0003ð\u000f7º\u0006\nö\u0012þ\u00008¿ÿ\u0004\nþþ\b8ìÕ\u0002û\u0014ÿð\t\bó\u0001$ðé\r\tøû1äî\u0014õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8ßðé\u0019ùø\u001eã\u000fô/äî\u0014\u001eäó\u0011\u0017Ýþ\u0005Iðõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò&â,Õ\u0002û\u0010î\u00052Ø\u0004\u0007ù ä÷\u0000\u0010ø\nôõ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8¼\u000fò2ßôÿ\f\u0004þ\u0007\u0003î\u0010õ\u0003@¿\u0010é\u0019ùøEÇ\u0006ÿ8æç\u0001\u0014ß\nô\u0016î\u0010\u001bçí7Òÿ2Õ\u0003þ\u0002\u0002\nøû\u0002*Ø\u0005\u0002Kò".getBytes("ISO-8859-1"), 0, bArr, 0, 849);
        $$d = bArr;
        $$e = 0;
    }

    private static void values(boolean z, byte[] bArr) {
        writeReplace(new java.lang.Object[]{java.lang.Boolean.valueOf(z), bArr}, -1626000362, 1626000363, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{115, 113, -43, -44, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized, 19, -13, -11, 14, com.google.common.base.Ascii.DC4, -25, 3, 7, -13, 13, 17, -21, -13, 2, 9, -4, -4, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -19, -9, 38, -46, -5, com.google.common.base.Ascii.VT, 34, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.SYN, -38, -5, 2};
        $$b = 86;
    }

    private com.payair.hce.setHandwritingDelegatorCallback valueOf() {
        return (com.payair.hce.setHandwritingDelegatorCallback) writeReplace(new java.lang.Object[]{this}, -1759117460, 1759117460, java.lang.System.identityHashCode(this));
    }
}
