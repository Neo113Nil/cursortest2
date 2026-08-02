package com.payair.hce;

/* loaded from: classes4.dex */
public final class setItemChecked {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static boolean AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static char IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char[] getAid;
    private static int getProfileVersion;
    private static char[] valueOf;
    private static boolean values;
    private static long writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 + 65;
        int i5 = i + 4;
        byte[] bArr = $$a;
        char[] cArr = new char[35 - s];
        int i6 = 34 - s;
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            int i10 = (i8 + (-i5)) - 2;
            i3 = i9;
            int i11 = i7;
            i4 = i10;
            i5 = i11;
            cArr[i3] = (char) i4;
            int i12 = i5 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i13 = i4;
            i7 = i12;
            i5 = bArr[i12];
            i9 = i3 + 1;
            i8 = i13;
            int i102 = (i8 + (-i5)) - 2;
            i3 = i9;
            int i112 = i7;
            i4 = i102;
            i5 = i112;
            cArr[i3] = (char) i4;
            int i122 = i5 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            cArr[i3] = (char) i4;
            int i1222 = i5 + 1;
            if (i3 == i6) {
            }
        }
    }

    private static void e(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2 = b * 3;
        int i3 = s + 65;
        int i4 = 3 - (i * 3);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + (-i5);
            i4 = i4;
        }
        while (true) {
            int i7 = i4 + 1;
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += -bArr[i7];
                i4 = i7;
            }
        }
    }

    public static final com.visa.cbp.external.common.ReplenishODAResponse valueOf(com.payair.hce.setMultiChoiceModeListener setmultichoicemodelistener) {
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 75) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setmultichoicemodelistener, "");
        com.payair.hce.setRendererPriorityPolicy setrendererprioritypolicy = (com.payair.hce.setRendererPriorityPolicy) com.payair.hce.setMultiChoiceModeListener.DigitizedCardProfile(new java.lang.Object[]{setmultichoicemodelistener}, 734786059, -734786059, java.lang.System.identityHashCode(setmultichoicemodelistener));
        if (setrendererprioritypolicy == null) {
            com.visa.cbp.external.common.ReplenishODAResponse replenishODAResponse = new com.visa.cbp.external.common.ReplenishODAResponse();
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 69;
            getProfileVersion = i % 128;
            if (i % 2 == 0) {
                return replenishODAResponse;
            }
            throw null;
        }
        com.visa.cbp.external.common.ReplenishODAResponse replenishODAResponse2 = new com.visa.cbp.external.common.ReplenishODAResponse();
        com.visa.cbp.external.common.ReplenishODAData replenishODAData = new com.visa.cbp.external.common.ReplenishODAData();
        com.visa.cbp.external.common.IccPubKeyCert iccPubKeyCert = new com.visa.cbp.external.common.IccPubKeyCert();
        iccPubKeyCert.setCertificate((java.lang.String) com.payair.hce.setRendererPriorityPolicy.writeReplace(new java.lang.Object[]{setrendererprioritypolicy}, 868347826, -868347822, java.lang.System.identityHashCode(setrendererprioritypolicy)));
        iccPubKeyCert.setExponent((java.lang.String) com.payair.hce.setRendererPriorityPolicy.writeReplace(new java.lang.Object[]{setrendererprioritypolicy}, -2103270542, 2103270543, java.lang.System.identityHashCode(setrendererprioritypolicy)));
        iccPubKeyCert.setRemainder((java.lang.String) com.payair.hce.setRendererPriorityPolicy.writeReplace(new java.lang.Object[]{setrendererprioritypolicy}, -673294086, 673294088, java.lang.System.identityHashCode(setrendererprioritypolicy)));
        com.visa.cbp.external.common.ExpirationDate expirationDate = new com.visa.cbp.external.common.ExpirationDate();
        com.payair.hce.setDownloadListener setdownloadlistener = (com.payair.hce.setDownloadListener) com.payair.hce.setRendererPriorityPolicy.writeReplace(new java.lang.Object[]{setrendererprioritypolicy}, -1504535460, 1504535460, java.lang.System.identityHashCode(setrendererprioritypolicy));
        expirationDate.setMonth((java.lang.String) com.payair.hce.setDownloadListener.valueOf(new java.lang.Object[]{setdownloadlistener}, 823132616, -823132614, java.lang.System.identityHashCode(setdownloadlistener)));
        com.payair.hce.setDownloadListener setdownloadlistener2 = (com.payair.hce.setDownloadListener) com.payair.hce.setRendererPriorityPolicy.writeReplace(new java.lang.Object[]{setrendererprioritypolicy}, -1504535460, 1504535460, java.lang.System.identityHashCode(setrendererprioritypolicy));
        expirationDate.setYear((java.lang.String) com.payair.hce.setDownloadListener.valueOf(new java.lang.Object[]{setdownloadlistener2}, 528822198, -528822198, java.lang.System.identityHashCode(setdownloadlistener2)));
        iccPubKeyCert.setExpirationDate(expirationDate);
        replenishODAData.setIccPubKeyCert(iccPubKeyCert);
        replenishODAResponse2.setODAData(replenishODAData);
        return replenishODAResponse2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        float f;
        java.lang.Throwable cause;
        $10 = ($11 + 55) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (true) {
            f = 0.0f;
            if (getdsrpdata.valueOf >= charArray.length) {
                break;
            }
            $11 = ($10 + 67) % 128;
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 32, 1891 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (3599 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    e(0, (byte) 0, (short) 48, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (writeReplace ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 65, 1443 - android.text.TextUtils.indexOf("", "", 0, 0), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 29682));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    e(0, (byte) 0, (short) 47, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        $10 = ($11 + 57) % 128;
        while (getdsrpdata.valueOf < charArray.length) {
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777152) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1444, (char) ((android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                e(0, (byte) 0, (short) 47, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            f = 0.0f;
        }
        java.lang.String str2 = new java.lang.String(cArr);
        int i3 = $11 + 87;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private static void d(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            int i2 = $10 + 17;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = valueOf;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i3 = 1;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[0] = java.lang.Integer.valueOf(cArr3[i4]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 46, 285 - android.text.TextUtils.indexOf("", c, 0, 0), (char) (46338 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    i3 = 1;
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 46, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46336))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (AlternateContactlessPaymentDataJson) {
            $10 = ($11 + 39) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1629, (char) android.graphics.Color.red(0));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    e(0, (byte) 0, (short) 53, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!values) {
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
        $11 = ($10 + 11) % 128;
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.indexOf("", ""), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1630, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                e(0, (byte) 0, (short) 53, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    private static void a(int i, byte b, java.lang.String str, java.lang.Object[] objArr) {
        int i2;
        char c;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = getAid;
        char c2 = '\b';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 49, 2508 - android.graphics.Color.blue(0), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e(0, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2508 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            e(0, (byte) 0, (short) 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            $10 = ($11 + 63) % 128;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    $11 = ($10 + 113) % 128;
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    int i4 = $11 + 91;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    c = c2;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[c2] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[6] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[2] = java.lang.Integer.valueOf(charValue);
                    objArr6[1] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3595 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48, android.text.TextUtils.indexOf("", "", 0, 0) + 2665, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 18889));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            e(0, (byte) 0, (short) 8, objArr8);
                            c = '\b';
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        } else {
                            c = '\b';
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i6 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i7 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i6 * charValue) + i7];
                    } else {
                        c = '\b';
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i8 = digitizedCardJson12.DigitizedCardProfile;
                            int i9 = digitizedCardJson12.RecordsJson;
                            int i10 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr3[digitizedCardJson12.values] = cArr[(i8 * charValue) + i9];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i10 * charValue) + i11];
                        } else {
                            int i12 = digitizedCardJson12.DigitizedCardProfile;
                            int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i14 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i15 = digitizedCardJson12.RecordsJson;
                            cArr3[digitizedCardJson12.values] = cArr[(i12 * charValue) + i13];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i14 * charValue) + i15];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                c2 = c;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void values() {
        writeReplace = 21511965842627640L;
        getAid = new char[]{1491, 12394, 1497, 12291, 12327, 12339, 12402, 1496, 1499, 12332, 1490, 12388, 12293, 12320, 12346, 12338, 1500, 12329, 12326, 12299, 1492, 12335, 12331, 12345, 12325, 12314, 1493, 1495, 12324, 12348, 1494, 12323, 12321, 12389, 12318, 12400, 12344, 1498, 12319, 1489, 12333, 12350, 12309, 12300, 12322, 12352, 12349, 12334, 12391};
        IccPrivateKeyCrtComponentsJson = (char) 1495;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        values();
        valueOf = new char[]{10921};
        DigitizedCardProfile = -143185185;
        values = true;
        AlternateContactlessPaymentDataJson = true;
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 79) % 128;
    }

    static void init$1() {
        $$d = new byte[]{14, 101, 71, 43};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SYN, -105, 0, 34, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r7v110 ?? I:long), method size: 9698
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public static java.lang.Object[] writeReplace(android.content.Context r42, int r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 9698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.payair.hce.setItemChecked.writeReplace(android.content.Context, int, int, int):java.lang.Object[]");
    }
}
