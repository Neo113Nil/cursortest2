package com.payair.hce;

/* loaded from: classes4.dex */
public final class getDigitizedCardId {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char getAid;
    private static int getProfileVersion;
    private static long valueOf;
    private static int values;
    private static long writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = 35 - b;
        int i5 = 39 - (s2 * 2);
        byte[] bArr = $$a;
        char[] cArr = new char[i4];
        if (bArr == null) {
            int i6 = i4;
            i2 = i5;
            i3 = 0;
            i5 = (i5 + i6) - 2;
            i = i3;
            i3 = i + 1;
            cArr[i] = (char) i5;
            i2++;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = bArr[i2];
            i5 = (i5 + i6) - 2;
            i = i3;
            i3 = i + 1;
            cArr[i] = (char) i5;
            i2++;
            if (i3 == i4) {
            }
        } else {
            i = 0;
            i5 = 718 - s;
            i2 = i5;
            i3 = i + 1;
            cArr[i] = (char) i5;
            i2++;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 111 - s;
        int i5 = (s2 * 3) + 1;
        byte[] bArr = $$d;
        int i6 = 4 - (i * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i3 = 0;
            int i9 = i6 + i8;
            int i10 = i7 + 1;
            i2 = i3;
            i4 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4;
            i7 = i6;
            i6 = bArr[i6];
            i8 = i11;
            int i92 = i6 + i8;
            int i102 = i7 + 1;
            i2 = i3;
            i4 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public static boolean valueOf(java.lang.reflect.Type type) {
        int i = IccPrivateKeyCrtComponentsJson + 45;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (!(type instanceof java.lang.Class) || !((java.lang.Class) type).isPrimitive()) {
            return false;
        }
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 63) % 128;
        return true;
    }

    public static <T> java.lang.Class<T> values(java.lang.Class<T> cls) {
        if (cls == java.lang.Integer.TYPE) {
            return java.lang.Integer.class;
        }
        if (cls == java.lang.Float.TYPE) {
            return java.lang.Float.class;
        }
        if (cls == java.lang.Byte.TYPE) {
            return java.lang.Byte.class;
        }
        if (cls == java.lang.Double.TYPE) {
            return java.lang.Double.class;
        }
        if (cls == java.lang.Long.TYPE) {
            return java.lang.Long.class;
        }
        if (cls == java.lang.Character.TYPE) {
            return java.lang.Character.class;
        }
        if (cls == java.lang.Boolean.TYPE) {
            int i = IccPrivateKeyCrtComponentsJson + 103;
            getProfileVersion = i % 128;
            if (i % 2 != 0) {
                return java.lang.Boolean.class;
            }
            throw new java.lang.ArithmeticException();
        }
        if (cls != java.lang.Short.TYPE) {
            return cls == java.lang.Void.TYPE ? java.lang.Void.class : cls;
        }
        int i2 = getProfileVersion + 65;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            return java.lang.Short.class;
        }
        throw null;
    }

    private static void d(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 99;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(DigitizedCardProfile[i - getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.resolveSize(0, 0), 381 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 62387));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e(0, (short) 12, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(writeReplace), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3967, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.getOffsetBefore("", 0), 212 - android.text.TextUtils.indexOf("", "", 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(DigitizedCardProfile[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.Color.alpha(0), android.text.TextUtils.getOffsetAfter("", 0) + 381, (char) (android.view.View.MeasureSpec.getSize(0) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    e(0, (short) 12, (short) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(writeReplace), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.MotionEvent.axisFromString(""), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3967, (char) (40223 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16777428, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 45) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.indexOf("", ""), 212 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        java.lang.String str = new java.lang.String(cArr);
        int i6 = $11 + 105;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, char c, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str3 != null) {
            $11 = ($10 + 111) % 128;
            cArr = str3.toCharArray();
            int i2 = $11 + 119;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 / 4;
            }
        } else {
            cArr = str3;
        }
        char[] cArr2 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(cArr2, 0, cArr3, 0, length);
        java.lang.System.arraycopy(charArray2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 91) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - android.view.KeyEvent.normalizeMetaState(0), android.view.View.combineMeasuredStates(0, 0) + 1179, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    e(0, (short) 9, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 30, 3443 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (3831 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.KeyEvent.getDeadChar(0, 0), 1864 - android.text.TextUtils.indexOf("", "", 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41776));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    e(0, (short) 6, (short) 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 3134 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    e(0, (short) 5, (short) 0, objArr8);
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((cArr3[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (valueOf ^ 1263759066225628708L)) ^ ((int) (values ^ 1263759066225628708L))) ^ ((char) (getAid ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private static void b(java.lang.String str, boolean z, int[] iArr, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr2 = AlternateContactlessPaymentDataJson;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                $11 = ($10 + 73) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, android.graphics.Color.alpha(0) + 2807, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e(0, (short) 2, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i2];
        java.lang.System.arraycopy(cArr2, i, cArr4, 0, i2);
        if (bArr2 != null) {
            $10 = ($11 + 125) % 128;
            char[] cArr5 = new char[i2];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i2) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i6 = $11 + 91;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 44, 2836 - (android.os.Process.myTid() >> 22), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                            byte length2 = (byte) $$d.length;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            e(0, length2, (byte) (length2 - 4), objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                        }
                        cArr5[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i8 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2835, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                        byte length3 = (byte) $$d.length;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        e(0, length3, (byte) (length3 - 4), objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr5[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2880 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.view.View.getDefaultSize(0, 0));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        e(0, (short) 0, (short) 0, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr5[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.MeasureSpec.getSize(0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr4 = cArr5;
        }
        if (i4 > 0) {
            char[] cArr6 = new char[i2];
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i2);
            int i10 = i2 - i4;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i10, i4);
            java.lang.System.arraycopy(cArr6, i4, cArr4, 0, i10);
        }
        if (z) {
            int i11 = $11 + 95;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i2];
                getaccounttype.writeReplace = 1;
            } else {
                cArr = new char[i2];
                getaccounttype.writeReplace = 0;
            }
            while (getaccounttype.writeReplace < i2) {
                cArr[getaccounttype.writeReplace] = cArr4[(i2 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr4 = cArr;
        }
        if (i3 > 0) {
            $10 = ($11 + 59) % 128;
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i2) {
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static void valueOf() {
        AlternateContactlessPaymentDataJson = new char[]{16805, 16668, 16668, 16653, 16760, 16759, 16647, 16661, 16666, 16667, 16664, 16765, 16886, 16806, 16812, 16810, 16772, 16799, 16824, 16824, 16829, 16802, 16807, 16768, 16796, 16829, 16802, 16805, 16800, 16807, 16812, 16807, 16780, 16704, 16704, 16712, 16715, 16707, 16734, 16732, 16824, 16803, 16708, 16734, 16730, 16705, 16707, 16709, 16805, 16825, 16729, 16706, 16710, 16800, 16831, 16732, 16707, 16803, 16802, 16704, 16704, 16712, 16803, 16802, 16704, 16704, 16712, 16803, 16890, 16802, 16830, 16805, 16807, 16809, 16804, 16824, 16800, 16802, 16831, 16800, 16791, 16886, 16799, 16831, 16807, 16802, 16831, 16800, 16807, 16774, 16775, 16857, 16857, 16779, 16786, 16726, 16749, 16884, 16829, 16807, 16804, 16829, 16850, 16892, 16887, 16771, 16794, 16578, 16586, 16645, 16580, 16578, 16590, 16665, 16588, 16586, 16688, 16582, 16590, 16688, 16579, 16645, 16588, 16583, 16586, 16578, 16886, 16795, 16769, 16808, 16810, 16808, 16809, 16812, 16822, 16887, 16829, 16802, 16807, 16814, 16786, 16805, 16826, 16801, 16808, 16810, 16808, 16808, 16802, 16813, 16808, 16706, 16822, 16746, 16704, 16730, 16729, 16724, 16821, 16734, 16704, 16730, 16751, 16734, 16801, 16791, 16727, 16730, 16726, 16705, 16706, 16791, 16725, 16725, 16706, 16791, 16705, 16730, 16724, 16723, 16705, 16727, 16706, 16723, 16734, 16732, 16706, 16727, 16894, 16809, 16807, 16805, 16830, 16802, 16808, 16775, 16774, 16807, 16800, 16831, 16802, 16807, 16831, 16799, 16886, 16791, 16800, 16800, 16801, 16800, 16807, 16807, 16831, 16815, 16793, 16809, 16807};
        valueOf = 1263759066225628708L;
        values = -804334044;
        getAid = (char) 25722;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        valueOf();
        DigitizedCardProfile = new char[]{24229};
        writeReplace = 1437463526676966110L;
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 35) % 128;
    }

    static void init$1() {
        $$d = new byte[]{38, -91, 120, 99};
        $$e = 148;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:356|357)|358|359|360|(3:362|(2:364|(2:366|(2:368|(1:372))(1:383))(1:384))(1:385)|381)|386|387) */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x1559, code lost:
    
        r1 = new java.lang.Object[]{new int[1], new int[1], null, r2, new int[1]};
        r2 = (java.lang.String) java.lang.Class.forName(r45).getField(r35).get(r38);
        r15 = r48;
        ((int[]) r1[0])[0] = r15;
        ((int[]) r1[1])[0] = r15 ^ 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x1593, code lost:
    
        r2 = new java.lang.Object[]{java.lang.Integer.valueOf(r50), 16, java.lang.Integer.valueOf((((((-155357313) | r15) * (-381)) - 548043280) + (((~((~r15) | 873729032)) | (-1028036745)) * 381)) - 938406272)};
        r7 = r37;
        r3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x15c9, code lost:
    
        if (r3 != null) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x15cb, code lost:
    
        r3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
        r8 = new java.lang.Object[1];
        c(653, r4[2], (byte) (-com.payair.hce.getDigitizedCardId.$$a[52]), r8);
        r3 = r3.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, r3);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x161d, code lost:
    
        r2 = ((java.lang.Integer) ((java.lang.reflect.Method) r3).invoke(null, r2)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x162a, code lost:
    
        r3 = 0;
        ((int[]) r1[4])[0] = r2;
        r12 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x1859 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x185a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x1d36 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x172e A[Catch: Exception -> 0x173b, all -> 0x1769, IOException -> 0x1772, TryCatch #5 {IOException -> 0x1772, blocks: (B:395:0x173b, B:396:0x1768, B:421:0x16b4, B:422:0x16b7, B:494:0x16cd, B:496:0x16dc, B:497:0x16dd, B:501:0x16f7, B:503:0x16fe, B:504:0x16ff, B:516:0x1707, B:518:0x170d, B:519:0x170e, B:530:0x1728, B:532:0x172e, B:533:0x172f), top: B:302:0x10a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x172f A[Catch: Exception -> 0x173b, all -> 0x1769, IOException -> 0x1772, TRY_LEAVE, TryCatch #5 {IOException -> 0x1772, blocks: (B:395:0x173b, B:396:0x1768, B:421:0x16b4, B:422:0x16b7, B:494:0x16cd, B:496:0x16dc, B:497:0x16dd, B:501:0x16f7, B:503:0x16fe, B:504:0x16ff, B:516:0x1707, B:518:0x170d, B:519:0x170e, B:530:0x1728, B:532:0x172e, B:533:0x172f), top: B:302:0x10a1 }] */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v175 */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13, types: [int] */
    /* JADX WARN: Type inference failed for: r27v14 */
    /* JADX WARN: Type inference failed for: r27v15 */
    /* JADX WARN: Type inference failed for: r27v16 */
    /* JADX WARN: Type inference failed for: r27v20 */
    /* JADX WARN: Type inference failed for: r27v21 */
    /* JADX WARN: Type inference failed for: r27v22 */
    /* JADX WARN: Type inference failed for: r27v51 */
    /* JADX WARN: Type inference failed for: r27v52 */
    /* JADX WARN: Type inference failed for: r2v171 */
    /* JADX WARN: Type inference failed for: r2v229, types: [int] */
    /* JADX WARN: Type inference failed for: r2v230 */
    /* JADX WARN: Type inference failed for: r2v231 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v15 */
    /* JADX WARN: Type inference failed for: r32v16 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v20 */
    /* JADX WARN: Type inference failed for: r32v21 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r34v31, types: [long] */
    /* JADX WARN: Type inference failed for: r34v38, types: [long] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v280 */
    /* JADX WARN: Type inference failed for: r4v353 */
    /* JADX WARN: Type inference failed for: r4v364 */
    /* JADX WARN: Type inference failed for: r4v390 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.reflect.Field] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer num3;
        int i4;
        java.lang.Object[] objArr;
        char c;
        int i5;
        int i6;
        java.lang.Object[] objArr2;
        int i7;
        int i8;
        int i9;
        int i10;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        int i11;
        char c2;
        char c3;
        java.lang.Object[] objArr5;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Runtime runtime;
        java.lang.Object[] objArr6;
        java.lang.Process exec;
        java.lang.Throwable th;
        java.lang.Throwable cause;
        java.lang.Object[] objArr7;
        java.lang.Object obj;
        java.lang.Throwable th2;
        java.lang.InterruptedException interruptedException;
        java.lang.Throwable th3;
        java.lang.String str3;
        java.lang.Object[] objArr8;
        char c4;
        java.lang.String str4;
        java.lang.Object obj2;
        java.lang.Integer num4;
        java.lang.Object[] objArr9;
        int i12;
        int i13;
        int i14;
        java.lang.Integer num5;
        java.lang.Object[] objArr10;
        int i15;
        java.lang.Object[] objArr11;
        char c5;
        int i16;
        java.lang.Object obj3;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "ࢻ\u245e\u0ee2貊隸欂鿏羲ⵠᵥᅵ瑽췢辩쾥ꪅ䯍쪦礫\udf05覠\u18af醥厲ౘ\u0e3e讖猠⑱蜙㗓뵦⫖뢲", "ᷙ點瘅鴱", (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr12);
        java.lang.String str5 = (java.lang.String) objArr12[0];
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "탼럸跏䇄惖\ue44b\ue786", "\udd93᪺\ue1e9憫", (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (-384124195) - android.text.TextUtils.getTrimmedLength(""), objArr13);
        java.lang.String str6 = (java.lang.String) objArr13[0];
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "嘦蓀獮䰰雬ꂝ쥢ﹼ폅׃滛勵鋻骙Ｕ\uf898", "鮗⾀踢쳡", (char) (57742 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), android.view.ViewConfiguration.getTapTimeout() >> 16, objArr14);
        java.lang.String str7 = (java.lang.String) objArr14[0];
        java.lang.Integer num6 = -604620973;
        try {
            if (context == null) {
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                b("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000", true, new int[]{0, 12, 104, 0}, objArr15);
                java.lang.Object[] objArr16 = {(java.lang.String) objArr15[0]};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                java.lang.Object obj5 = obj4;
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 36, 3161 - android.graphics.Color.argb(0, 0, 0, 0), (char) (33099 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    c((short) 618, (byte) 34, (byte) (-$$a[52]), objArr17);
                    java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr17[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method);
                    obj5 = method;
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr16)).longValue();
                long j = ~longValue;
                long j2 = i;
                long j3 = ~j2;
                long j4 = ((503 * longValue) - 391455355515L) + (((~(longValue | 781348015)) | (~(j | j2))) * (-502)) + ((~(j | j3 | 781348015)) * (-502)) + (((~((-781348016) | j2)) | j) * 502) + 126122723;
                int i17 = (int) (j4 >> 32);
                int i18 = ~i;
                int i19 = ~((-587260436) | i);
                if (((i17 & ((((((~(587260435 | i)) | 1487607212) | (~((-2024486847) | i))) * (-880)) - 818885110) + (((~(587260435 | i18)) | 2024486846 | i19) * (-880)) + (i19 * 880))) | (((int) j4) & (((((~((-869271604) | i18)) | 22022161) * 98) - 2075750575) + (((~((-1988469283) | i18)) | (-869271604) | (~(1988469282 | i))) * (-49)) + (((~((-869271604) | i)) | (-2010491444)) * 49)))) != 0) {
                    java.lang.Object[] objArr18 = {new int[]{i}, new int[]{i ^ 50}, null, null, new int[1]};
                    java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-263807266) | i18)) | 766328679) * 226) + 588891264 + (((~((-766328680) | i)) | 537140806 | (~((-34619393) | i18))) * (-113)) + ((~((-263807266) | i)) * 113))};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj6 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 50, 2713 - android.view.View.resolveSize(0, 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        num4 = 269015277;
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        c((short) 653, r8[2], (byte) (-$$a[52]), objArr20);
                        java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                        obj3 = method2;
                    } else {
                        num4 = 269015277;
                        obj3 = obj6;
                    }
                    ((int[]) objArr18[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr19)).intValue();
                    i13 = 0;
                    i14 = 1;
                    objArr9 = objArr18;
                    i12 = 4;
                } else {
                    num4 = 269015277;
                    objArr9 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr21 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-393256943) | i18)) | (-636879003)) * (-933)) + 1364020652 + (((~((-636879003) | i18)) | 545652752) * 933) + 170582949)};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj8 = obj7;
                    if (obj7 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), 2713 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.graphics.Color.green(0));
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        c((short) 653, r10[2], (byte) (-$$a[52]), objArr22);
                        java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr22[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                        obj8 = method3;
                    }
                    i12 = 4;
                    i13 = 0;
                    ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr21)).intValue();
                    i14 = 1;
                }
                if (((int[]) objArr9[i14])[i13] != i) {
                    return objArr9;
                }
                int[] iArr = {12, 20, i13, i12};
                java.lang.Object[] objArr23 = new java.lang.Object[i14];
                b("\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000", i13, iArr, objArr23);
                java.lang.Object[] objArr24 = {(java.lang.String) objArr23[i13]};
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                java.lang.Object obj10 = obj9;
                if (obj9 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 36, 3161 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.view.View.resolveSize(0, 0) + 33099));
                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                    c((short) 618, (byte) 34, (byte) (-$$a[52]), objArr25);
                    java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr25[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, method4);
                    obj10 = method4;
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr24)).longValue();
                long j5 = ~longValue2;
                long j6 = (((-958) * longValue2) - 308091385992L) + (((~(j5 | j3)) | (~(j2 | (-321598525))) | (~(321598524 | j3))) * 959) + ((~(321598524 | longValue2)) * (-959)) + (((~((-321598525) | j3)) | (~(j5 | j2)) | (~(321598524 | j2))) * 959) + 585872214;
                int i20 = (int) (j6 >> 32);
                int i21 = ~((-2143491096) | i18);
                if (((((int) j6) & (((((~(706264685 | i18)) | (-2145107584)) * (-1188)) - 589473583) + (((~((-706264686) | i)) | (-2145107584) | i21) * 594) + ((i21 | (~((-706264686) | i18)) | 704648197) * 594))) | (((((~(1309238005 | i)) | 1548502879) * (-318)) + 214045014 + (((~(1548502879 | i)) | (~((-1275609686) | i18))) * 318) + (((~((-33628321) | i18)) | (~((-1275609686) | i))) * 318)) & i20)) != 0) {
                    objArr10 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 60}, null, null, new int[1]};
                    int i22 = ~(998758480 | i18);
                    java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-998758481) | i)) | (~(31377464 | i18)) | i22) * (-516)) + 1982533864 + (((~((-25610257) | i)) | (~((-5767209) | i18))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((i22 | 5767208) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                    num5 = -1347122530;
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj12 = obj11;
                    if (obj11 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, android.text.TextUtils.getOffsetAfter("", 0) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        c((short) 653, r8[2], (byte) (-$$a[52]), objArr27);
                        java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method5);
                        obj12 = method5;
                    }
                    ((int[]) objArr10[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr26)).intValue();
                    i15 = 0;
                } else {
                    num5 = -1347122530;
                    objArr10 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((916350520 | i) * (-859)) - 1056181248) + (((~(916350520 | i18)) | (~((-109584913) | i))) * 859) + (((~((-113785425) | i18)) | 4200512) * 859))};
                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj14 = obj13;
                    if (obj13 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        c((short) 653, r9[2], (byte) (-$$a[52]), objArr29);
                        java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method6);
                        obj14 = method6;
                    }
                    i15 = 0;
                    ((int[]) objArr10[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr28)).intValue();
                }
                if (((int[]) objArr10[1])[i15] != i) {
                    return objArr10;
                }
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                b("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true, new int[]{32, 36, 36, i15}, objArr30);
                java.lang.Object[] objArr31 = {(java.lang.String) objArr30[i15]};
                java.lang.Integer num7 = num4;
                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num7);
                java.lang.Object obj16 = obj15;
                if (obj15 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 36, android.view.KeyEvent.getDeadChar(0, 0) + 3161, (char) (33099 - android.view.KeyEvent.normalizeMetaState(0)));
                    byte[] bArr = $$a;
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    c((short) 612, bArr[49], bArr[14], objArr32);
                    java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr32[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num7, method7);
                    obj16 = method7;
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr31)).longValue();
                long j7 = ~((~longValue3) | j2);
                long j8 = ((-574) * longValue3) + 117197141670L + (((~(j3 | 204176204)) | j7) * 1150) + (((~(j3 | longValue3)) | j7) * (-575)) + (((~((-204176205) | j3)) | (~(204176204 | j2))) * 575) + 1199611108;
                if (((((int) j8) & ((((((~((-746721283) | i18)) | (~((-1342245393) | i))) | (~((-22052930) | i))) * 765) - 1802321270) + (((~((-2088966675) | i18)) | 746721282) * 1530) + (((~((-2088966675) | i)) | (~((-22052930) | i18))) * 765))) | (((((~((-1362849437) | i18)) | 74376974) * (-90)) + 1687905420 + (((~((-1362849437) | i)) | (-1434447775)) * (-45)) + (((~((-74376975) | i)) | (-1362849437) | (~(74376974 | i18))) * 45)) & ((int) (j8 >> 32)))) != 0) {
                    java.lang.Object[] objArr33 = {new int[]{i}, new int[]{i ^ 80}, null, null, new int[1]};
                    java.lang.Object[] objArr34 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-835461998) | i)) | 25698569) * 336) - 234010808) + (((~(194673947 | i)) | (-1004437376)) * (-168)) + (((~(194673947 | i18)) | (-835461998)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                    java.lang.Object obj18 = obj17;
                    if (obj17 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.alpha(0), 2713 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0));
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        c((short) 653, r8[2], (byte) (-$$a[52]), objArr35);
                        java.lang.reflect.Method method8 = cls8.getMethod((java.lang.String) objArr35[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, method8);
                        obj18 = method8;
                    }
                    ((int[]) objArr33[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr34)).intValue();
                    i16 = 1;
                    objArr11 = objArr33;
                    c5 = 0;
                } else {
                    objArr11 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr36 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((((~((-522853120) | i18)) | 16915062) | r1) * (-713)) - 753146322) + ((~((-1344769) | i)) * 1426) + ((~((-507282826) | i18)) * 713))};
                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                    java.lang.Object obj20 = obj19;
                    if (obj19 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        c((short) 653, r6[2], (byte) (-$$a[52]), objArr37);
                        java.lang.reflect.Method method9 = cls9.getMethod((java.lang.String) objArr37[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, method9);
                        obj20 = method9;
                    }
                    c5 = 0;
                    ((int[]) objArr11[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr36)).intValue();
                    i16 = 1;
                }
                if (((int[]) objArr11[i16])[c5] != i) {
                    return objArr11;
                }
                java.lang.Object[] objArr38 = new java.lang.Object[i16];
                a("\u0000\u0000\u0000\u0000", "䉎薀⸵퉈ᗀ秊쫶\ue3c8ㅓ䩪绡\ue272ᙺƐ월鎽姂瘉浘⤞귏\uf13c倀縮橾\ue154ᥙ⻝瞺\uf423\ue0f2ꓞ\uf240濉葔Ūᧄꖁ盓\ue879炈\uf0e9", "⸘꧀\udd58ᓿ", (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + org.apache.commons.imaging.formats.jpeg.JpegConstants.DRI_MARKER), android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr38);
                java.lang.Object[] objArr39 = {(java.lang.String) objArr38[0]};
                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num7);
                java.lang.Object obj22 = obj21;
                if (obj21 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36, 3161 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33100));
                    byte[] bArr2 = $$a;
                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                    c((short) 612, bArr2[49], bArr2[14], objArr40);
                    java.lang.reflect.Method method10 = cls10.getMethod((java.lang.String) objArr40[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num7, method10);
                    obj22 = method10;
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr39)).longValue();
                long j9 = ~longValue4;
                java.lang.Integer num8 = num5;
                long j10 = 1880215003 + (((-317) * longValue4) - 282244851900L) + (((~(j2 | 884780099)) | j9) * (-318)) + (((~(j9 | j2)) | (~(j3 | (-884780100) | longValue4))) * 318) + (((~(j9 | j3 | (-884780100))) | (~(j2 | longValue4 | (-884780100)))) * 318);
                if (((((int) j10) & ((((~((-626623382) | i18)) | 553746709 | (~((-2063849792) | i18))) * 464) + 18704453 + (((-72876673) | i) * (-464)) + (((~((-2063849792) | i)) | 553746709) * 464))) | (((int) (j10 >> 32)) & ((((~((-308374699) | i18)) | 308292778) * 529) + 1520786966 + (((~((-308374699) | i)) | (-1745601110)) * 529)))) == 0) {
                    java.lang.Object[] objArr41 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr42 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-537679250) | i)) | 540817) * 336) - 234010808) + (((~(492456695 | i)) | (-1029595128)) * (-168)) + (((~(492456695 | i18)) | (-537679250)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num8);
                    java.lang.Object obj24 = obj23;
                    if (obj23 == null) {
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2713, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                        c((short) 653, r5[2], (byte) (-$$a[52]), objArr43);
                        java.lang.reflect.Method method11 = cls11.getMethod((java.lang.String) objArr43[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num8, method11);
                        obj24 = method11;
                    }
                    ((int[]) objArr41[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr42)).intValue();
                    return objArr41;
                }
                java.lang.Object[] objArr44 = {new int[]{i}, new int[]{i ^ 90}, null, null, new int[1]};
                int i23 = ~((-389808684) | i);
                java.lang.Object[] objArr45 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((286523426 | i23) * (-280)) + 317273392 + ((i23 | (~((-640327262) | i))) * 140) + (((~((-103285258) | i)) | (~((-286523427) | i18)) | (~((-537042005) | i18))) * 140))};
                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num8);
                java.lang.Object obj26 = obj25;
                if (obj25 == null) {
                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                    c((short) 653, r5[2], (byte) (-$$a[52]), objArr46);
                    java.lang.reflect.Method method12 = cls12.getMethod((java.lang.String) objArr46[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num8, method12);
                    obj26 = method12;
                }
                ((int[]) objArr44[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr45)).intValue();
                return objArr44;
            }
            int i24 = i;
            java.lang.Integer num9 = -1347122530;
            java.lang.Integer num10 = 269015277;
            try {
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                b("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true, new int[]{68, 23, 0, 6}, objArr47);
                java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr47[0]);
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "굈欟䊯캱\ua82d뿱罔\udfabⅫ撡撿堯\u05f7\uf4b7", "汽≌\u2d77\uf61a", (char) (android.text.TextUtils.indexOf("", "", 0) + 6701), android.graphics.Color.alpha(0), objArr48);
                java.lang.String str8 = (java.lang.String) cls13.getMethod((java.lang.String) objArr48[0], null).invoke(context, null);
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                b("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true, new int[]{68, 23, 0, 6}, objArr49);
                java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr49[0]);
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                char rgb = (char) (android.graphics.Color.rgb(0, 0, 0) + 16828647);
                a("\u0000\u0000\u0000\u0000", "M阽ᤷ剧캸烴\u18ae豣烾\uf2d7\ue1d7鹤\u2004ᆏ뱅횢庪㘑", "쳀쑞\ue7e5㣈", rgb, android.graphics.Color.red(0), objArr50);
                ?? invoke = cls14.getMethod((java.lang.String) objArr50[0], null).invoke(context, null);
                int indexOf = ((java.lang.String) java.lang.Class.forName(str5).getField(str6).get(invoke)).indexOf(str8);
                if (indexOf > 0) {
                    java.lang.String str9 = (java.lang.String) java.lang.Class.forName(str5).getField(str6).get(invoke);
                    if (str9.length() >= 16) {
                        int i25 = 0;
                        invoke = invoke;
                        rgb = rgb;
                        while (i25 <= str9.length() - 16) {
                            java.lang.Object[] objArr51 = {str9.substring(i25, i25 + 16), 931995};
                            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj27 == null) {
                                str4 = str9;
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.argb(0, 0, 0, 0), android.view.KeyEvent.normalizeMetaState(0) + 2594, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                byte b = $$a[2];
                                short s = b;
                                num2 = num10;
                                num3 = num6;
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                c(s, (byte) (s | 34), b, objArr52);
                                java.lang.reflect.Method method13 = cls15.getMethod((java.lang.String) objArr52[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method13);
                                obj2 = method13;
                            } else {
                                num2 = num10;
                                str4 = str9;
                                num3 = num6;
                                obj2 = obj27;
                            }
                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr51)).longValue();
                            int i26 = i25;
                            long j11 = i24;
                            java.lang.String str10 = str7;
                            long j12 = ~j11;
                            int i27 = indexOf;
                            java.lang.Integer num11 = num9;
                            java.lang.Object obj28 = invoke;
                            ?? r34 = ((-520) * longValue5) + 607008886506L + (((~(j12 | longValue5)) | 1162852273) * (-1042)) + ((longValue5 | j11) * 521) + (((~((-1162852274) | (~longValue5))) | (~((-1162852274) | j11)) | (~(1162852273 | j12 | longValue5))) * 521);
                            long j13 = r34 + 94248251;
                            int i28 = ~i24;
                            if (((((int) j13) & ((((~((-277525603) | i24)) | (~((-1735740061) | i28)) | 1714752012) * 717) + 1338726739 + (((~((-277525603) | i28)) | 1714752012 | (~((-1735740061) | i24))) * 717))) | (((int) (j13 >> 32)) & (((((-270606593) | i24) * (-676)) - 1082025142) + (((~((-490415511) | i28)) | 270606592) * 676) + (((~((-1927641922) | i28)) | 1657035329 | (~((-219808919) | i24))) * 676)))) == -725904754) {
                                objArr8 = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                java.lang.String str11 = (java.lang.String) java.lang.Class.forName(str5).getField(str6).get(obj28);
                                ((int[]) objArr8[0])[0] = i24;
                                ((int[]) objArr8[1])[0] = i24 ^ 20;
                                java.lang.Object[] objArr53 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-475438952) | i28)) | (~((-554696994) | i28))) * (-867)) + 804801824 + (((~((-475438952) | i24)) | 1048865 | (~((-554696994) | i24))) * (-1734)) + (((~(i28 | (-1048866))) | (~((-474390087) | i24)) | (~((-553648129) | i24))) * 867))};
                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num11);
                                java.lang.Object obj30 = obj29;
                                if (obj29 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    c((short) 653, r5[2], (byte) (-$$a[52]), objArr54);
                                    java.lang.reflect.Method method14 = cls16.getMethod((java.lang.String) objArr54[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num11, method14);
                                    obj30 = method14;
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr53)).intValue();
                                c4 = 0;
                                ((int[]) objArr8[4])[0] = intValue;
                                num = num11;
                                i4 = i24;
                                i5 = 1;
                                char c6 = c4;
                                objArr = objArr8;
                                c = c6;
                                if (((int[]) objArr[i5])[c] != i4) {
                                    return objArr;
                                }
                                int[] iArr2 = new int[i5];
                                int[] iArr3 = new int[i5];
                                iArr2[c] = i4;
                                iArr3[c] = i4;
                                java.lang.Object[] objArr55 = {iArr2, iArr3, null, null, new int[i5]};
                                int i29 = ~i4;
                                java.lang.Object[] objArr56 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-620748873) | i4)) | 6733888) * 345) + 2115520832 + (((~((-620748873) | i29)) | 402653184) * 345) + ((~((-6733889) | i4)) * 345))};
                                java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                java.lang.Object obj32 = obj31;
                                if (obj31 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    c((short) 653, r6[2], (byte) (-$$a[52]), objArr57);
                                    java.lang.reflect.Method method15 = cls17.getMethod((java.lang.String) objArr57[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method15);
                                    obj32 = method15;
                                }
                                ((int[]) objArr55[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr56)).intValue();
                                if (((int[]) objArr55[1])[0] != i4) {
                                    return objArr55;
                                }
                                if ((i2 & 1) == 0) {
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    a("\u0000\u0000\u0000\u0000", "쁿吝꠨ߋ쳝耼䝿㚼鱇畸쒒첈ଞ", "䱅鴑凁喞", (char) (40529 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 1046671028, objArr58);
                                    try {
                                        java.lang.Object[] objArr59 = {(java.lang.String) objArr58[0]};
                                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                                        b("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true, new int[]{68, 23, 0, 6}, objArr60);
                                        java.lang.Class<?> cls18 = java.lang.Class.forName((java.lang.String) objArr60[0]);
                                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                                        b("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000", false, new int[]{135, 16, 0, 11}, objArr61);
                                        java.lang.Object invoke2 = cls18.getMethod((java.lang.String) objArr61[0], java.lang.String.class).invoke(context, objArr59);
                                        if (invoke2 != null) {
                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                            b(null, true, new int[]{151, 37, 43, 32}, objArr62);
                                            java.lang.Class<?> cls19 = java.lang.Class.forName((java.lang.String) objArr62[0]);
                                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                                            a("\u0000\u0000\u0000\u0000", "\u0ff1ҐΎ줠ⓜ\uf7e6둛᠈ಳ뽯辽駰৳䭈ꉕ", "쳆孄퉼뤎", (char) (3794 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 2086356171 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr63);
                                            java.util.List list = (java.util.List) cls19.getMethod((java.lang.String) objArr63[0], null).invoke(invoke2, null);
                                            if (list != null) {
                                                java.util.Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    java.lang.Object next = it.next();
                                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                    b("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000", false, new int[]{188, 29, 0, 0}, objArr64);
                                                    java.lang.Class<?> cls20 = java.lang.Class.forName((java.lang.String) objArr64[0]);
                                                    java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                    a("\u0000\u0000\u0000\u0000", "굈欟䊯캱\ua82d뿱罔\udfabⅫ撡撿堯\u05f7\uf4b7", "汽≌\u2d77\uf61a", (char) (6701 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr65);
                                                    java.lang.String str12 = (java.lang.String) cls20.getMethod((java.lang.String) objArr65[0], null).invoke(next, null);
                                                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                    b(null, true, new int[]{151, 37, 43, 32}, objArr66);
                                                    java.lang.Class<?> cls21 = java.lang.Class.forName((java.lang.String) objArr66[0]);
                                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                    a("\u0000\u0000\u0000\u0000", "璱倶\udfdf徐铙ᔥ쫭˝ᑏܼ⼼뻷緅셀폩ꒉۆ", "\uf72bꇖ뻢婚", (char) (android.graphics.Color.green(0) + 23230), android.view.View.getDefaultSize(0, 0) - 492710153, objArr67);
                                                    if (((java.lang.Boolean) cls21.getMethod((java.lang.String) objArr67[0], java.lang.String.class).invoke(invoke2, str12)).booleanValue()) {
                                                        if (str12.length() >= 20) {
                                                            int i30 = 0;
                                                            for (int i31 = 20; i30 <= str12.length() - i31; i31 = 20) {
                                                                java.lang.Object[] objArr68 = {str12.substring(i30, i30 + 20), 931995};
                                                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                java.lang.Object obj34 = obj33;
                                                                if (obj33 == null) {
                                                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 28, 2593 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.graphics.Color.blue(0));
                                                                    byte b2 = $$a[2];
                                                                    short s2 = b2;
                                                                    java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                                    c(s2, (byte) (s2 | 34), b2, objArr69);
                                                                    java.lang.reflect.Method method16 = cls22.getMethod((java.lang.String) objArr69[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method16);
                                                                    obj34 = method16;
                                                                }
                                                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr68)).longValue();
                                                                long j14 = (-897268142) | longValue6;
                                                                long j15 = i4;
                                                                java.lang.Object obj35 = invoke2;
                                                                long j16 = ~j15;
                                                                java.util.Iterator it2 = it;
                                                                java.lang.String str13 = str12;
                                                                i6 = i29;
                                                                long j17 = ((-753) * longValue6) + 677437446455L + (((~(j15 | (-897268142))) | (~j14) | (~(longValue6 | j15))) * (-754)) + (((~(j14 | j15)) | (~(j16 | 897268141 | longValue6))) * (-754)) + ((j16 | (-897268142)) * 754) + 359832383;
                                                                if (((((int) j17) & ((((~(i6 | (-232861689))) | 25232800 | (~(i6 | (-1670088099)))) * (-397)) + 987075220 + (((-1852484187) | i4) * 397))) | (((int) (j17 >> 32)) & ((((~(i6 | (-1377837125))) * 130) - 1656166654) + (((~((-1377837125) | i4)) | 524816) * 130)))) == 1245577864) {
                                                                    objArr5 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 70}, null, null, new int[1]};
                                                                    java.lang.Object[] objArr70 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~r1) | 8329) * (-828)) - 715794328) + ((i6 | 1030127615) * (-828)) + 1752825856)};
                                                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                                                    java.lang.Object obj37 = obj36;
                                                                    if (obj36 == null) {
                                                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                                        c((short) 653, r5[2], (byte) (-$$a[52]), objArr71);
                                                                        java.lang.reflect.Method method17 = cls23.getMethod((java.lang.String) objArr71[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method17);
                                                                        obj37 = method17;
                                                                    }
                                                                    ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr70)).intValue();
                                                                    c3 = 0;
                                                                    if (((int[]) objArr5[1])[c3] != i4) {
                                                                        return objArr5;
                                                                    }
                                                                } else {
                                                                    i30++;
                                                                    invoke2 = obj35;
                                                                    it = it2;
                                                                    str12 = str13;
                                                                    i29 = i6;
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                    invoke2 = invoke2;
                                                    it = it;
                                                    i29 = i29;
                                                }
                                            }
                                        }
                                        i6 = i29;
                                        java.lang.Object[] objArr72 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                        int i32 = ~(41727965 | i4);
                                        java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(i6 | 41727965)) | (-1073741824)) * (-245)) - 1216934028) + (i32 * (-245)) + ((i32 | 1071863910) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                                        java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                        java.lang.Object obj39 = obj38;
                                        if (obj38 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                            java.lang.Object[] objArr74 = new java.lang.Object[1];
                                            c((short) 653, r4[2], (byte) (-$$a[52]), objArr74);
                                            java.lang.reflect.Method method18 = cls24.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method18);
                                            obj39 = method18;
                                        }
                                        c3 = 0;
                                        ((int[]) objArr72[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr73)).intValue();
                                        objArr5 = objArr72;
                                        if (((int[]) objArr5[1])[c3] != i4) {
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        java.lang.Throwable cause2 = th4.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th4;
                                    }
                                } else {
                                    i6 = i29;
                                }
                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                b("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000", true, new int[]{0, 12, 104, 0}, objArr75);
                                java.lang.Object[] objArr76 = {(java.lang.String) objArr75[0]};
                                java.lang.Integer num12 = num3;
                                java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                java.lang.Object obj41 = obj40;
                                if (obj40 == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3160, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 33099));
                                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                                    c((short) 618, (byte) 34, (byte) (-$$a[52]), objArr77);
                                    java.lang.reflect.Method method19 = cls25.getMethod((java.lang.String) objArr77[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, method19);
                                    obj41 = method19;
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, objArr76)).longValue();
                                long j18 = ~longValue7;
                                long j19 = i4;
                                long j20 = ~j19;
                                long j21 = (((-317) * longValue7) - 66097739136L) + (((~(j19 | 207202943)) | j18) * (-318)) + (((~(j18 | j19)) | (~(j20 | (-207202944) | longValue7))) * 318) + (((~(j18 | j20 | (-207202944))) | (~(longValue7 | (-207202944) | j19))) * 318) + 1114673682;
                                if (((((int) (j21 >> 32)) & ((((i6 | 2007889885) * 1444) - 1153123274) + (((~((-424794426) | i4)) | 285331737 | (~(1862020836 | i4))) * (-1444)) + 2002448356)) | (((int) j21) & ((((~(2100881125 | i4)) | (~(i6 | (-1479567045)))) * (-406)) + 1442653695 + ((~(i6 | 2143221759)) * (-406)) + (((~((-663654716) | i4)) | (~(i6 | (-2100881126)))) * 406)))) != 0) {
                                    java.lang.Object[] objArr78 = {new int[]{i4}, new int[]{i4 ^ 50}, null, null, new int[1]};
                                    java.lang.Object[] objArr79 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((626625825 | i4) * 140) - 1969561404) + (((~(i6 | 626625825)) | 402920006) * (-280)) + (((~(i6 | 403510119)) | 626035712 | (~((-402920007) | i4))) * 140))};
                                    java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    java.lang.Object obj43 = obj42;
                                    if (obj42 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, 2713 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                                        c((short) 653, r5[2], (byte) (-$$a[52]), objArr80);
                                        java.lang.reflect.Method method20 = cls26.getMethod((java.lang.String) objArr80[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method20);
                                        obj43 = method20;
                                    }
                                    ((int[]) objArr78[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr79)).intValue();
                                    objArr2 = objArr78;
                                    i9 = 1;
                                    i8 = 0;
                                    i7 = 4;
                                } else {
                                    objArr2 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    java.lang.Object[] objArr81 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(i6 | (-8785953))) * 130) - 253122136) + (((~((-8785953) | i4)) | 1085264) * 130))};
                                    java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    java.lang.Object obj45 = obj44;
                                    if (obj44 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                        java.lang.Object[] objArr82 = new java.lang.Object[1];
                                        c((short) 653, r5[2], (byte) (-$$a[52]), objArr82);
                                        java.lang.reflect.Method method21 = cls27.getMethod((java.lang.String) objArr82[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method21);
                                        obj45 = method21;
                                    }
                                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr81)).intValue();
                                    i7 = 4;
                                    i8 = 0;
                                    ((int[]) objArr2[4])[0] = intValue2;
                                    i9 = 1;
                                }
                                if (((int[]) objArr2[i9])[i8] != i4) {
                                    return objArr2;
                                }
                                int[] iArr4 = {12, 20, i8, i7};
                                java.lang.Object[] objArr83 = new java.lang.Object[i9];
                                b("\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000", i8, iArr4, objArr83);
                                java.lang.Object[] objArr84 = {(java.lang.String) objArr83[i8]};
                                java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num12);
                                java.lang.Object obj47 = obj46;
                                if (obj46 == null) {
                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 37, android.view.View.MeasureSpec.getSize(0) + 3161, (char) (33098 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                                    c((short) 618, (byte) 34, (byte) (-$$a[52]), objArr85);
                                    java.lang.reflect.Method method22 = cls28.getMethod((java.lang.String) objArr85[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num12, method22);
                                    obj47 = method22;
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, objArr84)).longValue();
                                long j22 = ~longValue8;
                                long j23 = ~(488965042 | j22 | j19);
                                long j24 = ((-475) * longValue8) + 233236325034L + (((~(longValue8 | (-488965043))) | j23) * (-476)) + (j23 * 952) + ((~(j22 | j20 | 488965042)) * 476) + 418505696;
                                if (((((int) j24) & (((((~(i6 | 1845264395)) | 1012476490) * (-1042)) - 1528028020) + ((1845264395 | i4) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-1012476491) | i4)) | 743964682 | (~(i6 | 2113776203))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j24 >> 32)) & (((((~(i6 | (-400455515))) | 1036770896) * 226) - 2055567968) + (((~((-1036770897) | i4)) | 671188992 | (~(i6 | (-34873611)))) * (-113)) + ((~((-400455515) | i4)) * 113)))) != 0) {
                                    objArr3 = new java.lang.Object[]{new int[]{i4}, new int[]{i4 ^ 60}, null, null, new int[1]};
                                    java.lang.Object[] objArr86 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((i6 | 728232590) * (-757)) + 1638820396 + ((~((-278400369) | i4)) * 1514) + (((~(i6 | (-301903355))) | 23502986 | (~(1006632958 | i4))) * 757))};
                                    java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    java.lang.Object obj49 = obj48;
                                    if (obj48 == null) {
                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, android.widget.ExpandableListView.getPackedPositionType(0L) + 2713, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                                        c((short) 653, r5[2], (byte) (-$$a[52]), objArr87);
                                        java.lang.reflect.Method method23 = cls29.getMethod((java.lang.String) objArr87[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method23);
                                        obj49 = method23;
                                    }
                                    ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr86)).intValue();
                                    i10 = 0;
                                } else {
                                    java.lang.Object[] objArr88 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    int i33 = (~((-297868208) | i4)) | 25231497;
                                    java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((i33 * 992) + 1183815944 + ((i33 | (~(i6 | 1004904447))) * (-496)) + ((732267737 | i4) * 496))};
                                    java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    java.lang.Object obj51 = obj50;
                                    if (obj50 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getTrimmedLength(""), 2713 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                        c((short) 653, r4[2], (byte) (-$$a[52]), objArr90);
                                        java.lang.reflect.Method method24 = cls30.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method24);
                                        obj51 = method24;
                                    }
                                    i10 = 0;
                                    ((int[]) objArr88[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr89)).intValue();
                                    objArr3 = objArr88;
                                }
                                if (((int[]) objArr3[1])[i10] != i4) {
                                    return objArr3;
                                }
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                b("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true, new int[]{32, 36, 36, i10}, objArr91);
                                java.lang.Object[] objArr92 = {(java.lang.String) objArr91[i10]};
                                java.lang.Integer num13 = num2;
                                java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num13);
                                java.lang.Object obj53 = obj52;
                                if (obj52 == null) {
                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.argb(i10, i10, i10, i10), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3161, (char) (android.view.View.combineMeasuredStates(i10, i10) + 33099));
                                    byte[] bArr3 = $$a;
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    c((short) 612, bArr3[49], bArr3[14], objArr93);
                                    java.lang.reflect.Method method25 = cls31.getMethod((java.lang.String) objArr93[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num13, method25);
                                    obj53 = method25;
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, objArr92)).longValue();
                                long j25 = ~longValue9;
                                long j26 = (-962719801) | j19;
                                long j27 = (longValue9 * (-667)) + 1285230934335L + (((~j26) | j25) * (-668)) + (((~(j25 | j19)) | (-962719801)) * 1336) + ((j25 | j26) * 668) + 1958154704;
                                if (((((int) (j27 >> 32)) & (((((-1942807713) | r5) * 764) - 999231882) + (((~(i6 | (-1942807713))) | 1094983680) * (-1528)) + (((~(i6 | (-914933173))) | 1162092820) * 764))) | (((int) j27) & (((((~(i6 | 427944077)) | 606602512) * 98) - 363606492) + (((~(i6 | 1009282332)) | 427944077 | (~((-1009282333) | i4))) * (-49)) + (((~(427944077 | i4)) | 402679820) * 49)))) != 0) {
                                    java.lang.Object[] objArr94 = {new int[]{i4}, new int[]{i4 ^ 80}, null, null, new int[1]};
                                    java.lang.Object[] objArr95 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((-493242433) | i4) * (-676)) + 461683880 + (((~(i6 | 536884776)) | 493242432) * 676) + (((~(i6 | (-493251169))) | 8736 | (~(1030127208 | i4))) * 676))};
                                    java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    java.lang.Object obj55 = obj54;
                                    if (obj54 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 50, 2713 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.MotionEvent.axisFromString("") + 1));
                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                        c((short) 653, r6[2], (byte) (-$$a[52]), objArr96);
                                        java.lang.reflect.Method method26 = cls32.getMethod((java.lang.String) objArr96[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method26);
                                        obj55 = method26;
                                    }
                                    ((int[]) objArr94[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj55).invoke(null, objArr95)).intValue();
                                    c2 = 1;
                                    objArr4 = objArr94;
                                    i11 = 0;
                                } else {
                                    objArr4 = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                    int i34 = ~(718863161 | i4);
                                    java.lang.Object[] objArr97 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((676354608 | i34) * (-196)) + 709911140 + ((i34 | 42508553) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))};
                                    java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    java.lang.Object obj57 = obj56;
                                    if (obj56 == null) {
                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, 2713 - android.view.View.MeasureSpec.getSize(0), (char) android.graphics.Color.green(0));
                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                        c((short) 653, r5[2], (byte) (-$$a[52]), objArr98);
                                        java.lang.reflect.Method method27 = cls33.getMethod((java.lang.String) objArr98[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method27);
                                        obj57 = method27;
                                    }
                                    i11 = 0;
                                    ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj57).invoke(null, objArr97)).intValue();
                                    c2 = 1;
                                }
                                if (((int[]) objArr4[c2])[i11] != i4) {
                                    return objArr4;
                                }
                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "䉎薀⸵퉈ᗀ秊쫶\ue3c8ㅓ䩪绡\ue272ᙺƐ월鎽姂瘉浘⤞귏\uf13c倀縮橾\ue154ᥙ⻝瞺\uf423\ue0f2ꓞ\uf240濉葔Ūᧄꖁ盓\ue879炈\uf0e9", "⸘꧀\udd58ᓿ", (char) ((android.os.Process.myPid() >> 22) + org.apache.commons.imaging.formats.jpeg.JpegConstants.DRI_MARKER), (-16777216) - android.graphics.Color.rgb(i11, i11, i11), objArr99);
                                java.lang.Object[] objArr100 = {(java.lang.String) objArr99[0]};
                                java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num13);
                                java.lang.Object obj59 = obj58;
                                if (obj58 == null) {
                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.indexOf("", ""), android.view.MotionEvent.axisFromString("") + 3162, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 33099));
                                    byte[] bArr4 = $$a;
                                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                                    c((short) 612, bArr4[49], bArr4[14], objArr101);
                                    java.lang.reflect.Method method28 = cls34.getMethod((java.lang.String) objArr101[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num13, method28);
                                    obj59 = method28;
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj59).invoke(null, objArr100)).longValue();
                                long j28 = ((-55) * longValue10) + 31069593555L + (((~(j19 | (-564901701))) | longValue10) * 56) + ((~((-564901701) | longValue10)) * (-56)) + (((~(j20 | longValue10)) | (-564901701)) * 56) + 1560336604;
                                if (((((int) (j28 >> 32)) & ((((((~(i6 | (-384706146))) | 380380737) | r3) * (-502)) - 885171936) + (((~(1056845673 | i4)) | (~(i6 | (-4325409)))) * 502))) | (((int) j28) & ((((~(2142606773 | i4)) | 715134112) * (-756)) + 1725200465 + ((i6 | 2142606773) * 756)))) != 0) {
                                    java.lang.Object[] objArr102 = {new int[]{i4}, new int[]{i4 ^ 90}, null, null, new int[1]};
                                    java.lang.Object[] objArr103 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i6 | (-858682513))) | (~((-171453433) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1541298408) + (((~(i6 | (-135269225))) | (~((-822498305) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                    java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                    java.lang.Object obj61 = obj60;
                                    if (obj60 == null) {
                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 51, 2714 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                        java.lang.Object[] objArr104 = new java.lang.Object[1];
                                        c((short) 653, r5[2], (byte) (-$$a[52]), objArr104);
                                        java.lang.reflect.Method method29 = cls35.getMethod((java.lang.String) objArr104[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method29);
                                        obj61 = method29;
                                    }
                                    ((int[]) objArr102[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj61).invoke(null, objArr103)).intValue();
                                    return objArr102;
                                }
                                java.lang.Object[] objArr105 = {new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                                java.lang.Object[] objArr106 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(i6 | (-82067))) | (~(1030053878 | i4))) * (-272)) - 817958200) + (((~((-811686839) | i4)) | 811604772) * (-272)) + (((~(811686838 | i4)) | 218449106) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                                java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                java.lang.Object obj63 = obj62;
                                if (obj62 == null) {
                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.widget.ExpandableListView.getPackedPositionChild(0L), 2713 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                    c((short) 653, r5[2], (byte) (-$$a[52]), objArr107);
                                    java.lang.reflect.Method method30 = cls36.getMethod((java.lang.String) objArr107[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method30);
                                    obj63 = method30;
                                }
                                ((int[]) objArr105[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj63).invoke(null, objArr106)).intValue();
                                return objArr105;
                            }
                            i25 = i26 + 1;
                            num9 = num11;
                            invoke = obj28;
                            str7 = str10;
                            str9 = str4;
                            num10 = num2;
                            indexOf = i27;
                            num6 = num3;
                            rgb = r34;
                        }
                    }
                    int i35 = indexOf;
                    num2 = num10;
                    num3 = num6;
                    java.lang.String str14 = str7;
                    java.lang.String str15 = invoke;
                    java.lang.Integer num14 = num9;
                    java.lang.String str16 = (java.lang.String) java.lang.Class.forName(str5).getField(str6).get(str15);
                    int i36 = 6;
                    if (str16.length() >= 6) {
                        int i37 = 0;
                        rgb = rgb;
                        while (i37 <= str16.length() - i36) {
                            java.lang.Object[] objArr108 = {str16.substring(i37, i37 + 6), 931995};
                            java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            java.lang.Object obj65 = obj64;
                            if (obj64 == null) {
                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 2594 - android.text.TextUtils.indexOf("", ""), (char) (android.os.Process.myPid() >> 22));
                                byte b3 = $$a[2];
                                short s3 = b3;
                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                c(s3, (byte) (s3 | 34), b3, objArr109);
                                java.lang.reflect.Method method31 = cls37.getMethod((java.lang.String) objArr109[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, method31);
                                obj65 = method31;
                            }
                            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj65).invoke(null, objArr108)).longValue();
                            long j29 = (~i24) | 493792880;
                            java.lang.Integer num15 = num14;
                            ?? r342 = (((-494) * longValue11) - 243933682720L) + ((~(longValue11 | 493792880)) * (-495)) + (495 * j29) + (((~j29) | (~((~longValue11) | (-493792881)))) * 495);
                            long j30 = r342 + 763307644;
                            int i38 = ~i24;
                            if (((((int) j30) & (((((~((-1111662447) | i38)) | (-1746078440)) * (-865)) - 451246468) + ((~(1111662446 | i24)) * 865) + (((~(1111662446 | i38)) | (~((-1746078440) | i38))) * 865))) | (((int) (j30 >> 32)) & (((((~(2146101044 | i38)) | (~((-711639841) | i24))) * (-272)) - 1915713302) + (((~(2137703216 | i24)) | 8397828) * (-272)) + (((~((-2137703217) | i24)) | (-720037669)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE)))) == -2096167706) {
                                objArr8 = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                java.lang.String str17 = (java.lang.String) java.lang.Class.forName(str5).getField(str6).get(str15);
                                ((int[]) objArr8[0])[0] = i24;
                                ((int[]) objArr8[1])[0] = i24 ^ 20;
                                java.lang.Object[] objArr110 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~((-405018213) | i38)) * (-783)) + 873727369 + (((~(591514010 | i38)) | (-438621935)) * 783))};
                                java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num15);
                                java.lang.Object obj67 = obj66;
                                if (obj66 == null) {
                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                    c((short) 653, r4[2], (byte) (-$$a[52]), objArr111);
                                    java.lang.reflect.Method method32 = cls38.getMethod((java.lang.String) objArr111[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num15, method32);
                                    obj67 = method32;
                                }
                                int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj67).invoke(null, objArr110)).intValue();
                                c4 = 0;
                                ((int[]) objArr8[4])[0] = intValue3;
                                num = num15;
                                i4 = i24;
                                i5 = 1;
                                char c62 = c4;
                                objArr = objArr8;
                                c = c62;
                                if (((int[]) objArr[i5])[c] != i4) {
                                }
                            } else {
                                i37++;
                                num14 = num15;
                                i36 = 6;
                                rgb = r342;
                            }
                        }
                    }
                    java.lang.Integer num16 = num14;
                    int i39 = 0;
                    java.lang.String substring = ((java.lang.String) java.lang.Class.forName(str5).getField(str6).get(str15)).substring(0, i35);
                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                    b("\u0001", false, new int[]{91, 1, 0, 1}, objArr112);
                    java.lang.String[] split = substring.split((java.lang.String) objArr112[0]);
                    ?? length = split.length;
                    int i40 = 0;
                    ?? r27 = str4;
                    ?? r32 = i35;
                    char c7 = rgb;
                    while (i40 < length) {
                        java.lang.String str18 = split[i40];
                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                        ?? r15 = "\u0000\u0001\u0000";
                        b("\u0000\u0001\u0000", i39, new int[]{92, 3, i39, 2}, objArr113);
                        if (str18.split((java.lang.String) objArr113[i39]).length > 1) {
                            synchronized (((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 48, android.graphics.Color.red(i39) + 1581, (char) android.view.View.resolveSize(i39, i39)))) {
                                try {
                                    try {
                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                        a("\u0000\u0000\u0000\u0000", "楺㇆\ueec9╙꜇눦좹꜃筙攰\uea68窲䜖截霦\uf651", "匹©㉦䥤", (char) (android.graphics.Color.argb(i39, i39, i39, i39) + 25650), android.view.View.getDefaultSize(i39, i39), objArr114);
                                        str2 = (java.lang.String) objArr114[0];
                                        try {
                                            runtime = java.lang.Runtime.getRuntime();
                                            r32 = split;
                                        } catch (java.lang.Exception unused) {
                                        }
                                    } catch (java.io.IOException unused2) {
                                    }
                                } catch (java.io.IOException unused3) {
                                    r32 = split;
                                }
                                try {
                                    objArr6 = new java.lang.Object[1];
                                    c7 = length;
                                } catch (java.io.IOException unused4) {
                                    c7 = length;
                                    r27 = i40;
                                    str = str5;
                                    i39 = num16;
                                    str5 = str15;
                                    r15 = i24;
                                    i40 = r27 + 1;
                                    str15 = str5;
                                    num16 = i39;
                                    i24 = r15;
                                    split = r32;
                                    length = c7 == true ? 1 : 0;
                                    str5 = str;
                                    i39 = 0;
                                    r27 = r27;
                                    r32 = r32;
                                    c7 = c7;
                                } catch (java.lang.Exception unused5) {
                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                    a("\u0000\u0000\u0000\u0000", "ぺ◽ᄔ螦噌螎巤ᙩ\u0a57꿤斆緭⪎霂탧횭؛ιⷼ綆沇ぼ荀獝ނ\uef58槞", "緒힔祠蹋", (char) (19321 - android.graphics.Color.blue(0)), 1624740989 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr115);
                                    throw new java.io.IOException((java.lang.String) objArr115[0]);
                                }
                                try {
                                    try {
                                        b(null, true, new int[]{95, 2, 48, 2}, objArr6);
                                        exec = runtime.exec((java.lang.String) objArr6[0], (java.lang.String[]) null, (java.io.File) null);
                                        try {
                                            objArr7 = new java.lang.Object[]{exec.getInputStream()};
                                            java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                            if (obj68 == null) {
                                                try {
                                                    r27 = i40;
                                                    try {
                                                        java.lang.reflect.Constructor declaredConstructor = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, 1507 - (android.os.Process.myTid() >> 22), (char) android.view.View.combineMeasuredStates(0, 0))).getDeclaredConstructor(java.io.InputStream.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor);
                                                        obj = declaredConstructor;
                                                    } catch (java.lang.Throwable th5) {
                                                        th = th5;
                                                        th = th;
                                                        cause = th.getCause();
                                                        if (cause == null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                }
                                            } else {
                                                r27 = i40;
                                                obj = obj68;
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (java.lang.Exception unused6) {
                                    }
                                    try {
                                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(objArr7);
                                        try {
                                            try {
                                                java.lang.Object[] objArr116 = {exec.getErrorStream()};
                                                java.lang.Object obj69 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                java.lang.Object obj70 = obj69;
                                                if (obj69 == null) {
                                                    try {
                                                        java.lang.reflect.Constructor declaredConstructor2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 44, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1506, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getDeclaredConstructor(java.io.InputStream.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, declaredConstructor2);
                                                        obj70 = declaredConstructor2;
                                                    } catch (java.lang.Throwable th8) {
                                                        th2 = th8;
                                                        java.lang.Throwable cause3 = th2.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th2;
                                                    }
                                                }
                                                java.lang.Object newInstance2 = ((java.lang.reflect.Constructor) obj70).newInstance(objArr116);
                                                java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                try {
                                                    java.lang.Class<?> cls39 = java.lang.Class.forName(str14);
                                                    java.lang.Integer num17 = num16;
                                                    try {
                                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                        java.lang.String str19 = str15;
                                                        try {
                                                            b("\u0000\u0000\u0001\u0001\u0001", true, new int[]{97, 5, 0, 0}, objArr117);
                                                            cls39.getMethod((java.lang.String) objArr117[0], null).invoke(newInstance, null);
                                                            try {
                                                                java.lang.Class<?> cls40 = java.lang.Class.forName(str14);
                                                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                b("\u0000\u0000\u0001\u0001\u0001", true, new int[]{97, 5, 0, 0}, objArr118);
                                                                cls40.getMethod((java.lang.String) objArr118[0], null).invoke(newInstance2, null);
                                                                try {
                                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                    sb.append(str2);
                                                                    java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                    d((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 1 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr119);
                                                                    sb.append(((java.lang.String) objArr119[0]).intern());
                                                                    java.lang.String obj71 = sb.toString();
                                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                    b("\u0000\u0001\u0001\u0000\u0001", true, new int[]{102, 5, 0, 0}, objArr120);
                                                                    dataOutputStream.write(obj71.getBytes((java.lang.String) objArr120[0]));
                                                                    dataOutputStream.flush();
                                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                    a("\u0000\u0000\u0000\u0000", "\ufdcd韥\uf392ⷈ햢", "♢Ⱇ檏墟", (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 40811), android.text.TextUtils.getCapsMode("", 0, 0) - 1892935898, objArr121);
                                                                    java.lang.String str20 = (java.lang.String) objArr121[0];
                                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                    b("\u0000\u0001\u0001\u0000\u0001", true, new int[]{102, 5, 0, 0}, objArr122);
                                                                    dataOutputStream.write(str20.getBytes((java.lang.String) objArr122[0]));
                                                                    dataOutputStream.flush();
                                                                    try {
                                                                        long nanoTime = java.lang.System.nanoTime();
                                                                        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                        while (true) {
                                                                            try {
                                                                                exec.exitValue();
                                                                                str = str5;
                                                                                str3 = str6;
                                                                                break;
                                                                            } catch (java.lang.IllegalThreadStateException unused7) {
                                                                                if (nanos > 0) {
                                                                                    try {
                                                                                        java.lang.String str21 = str5;
                                                                                        str3 = str6;
                                                                                        try {
                                                                                            try {
                                                                                                java.lang.Object[] objArr123 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                java.lang.Class<?> cls41 = java.lang.Class.forName(str14);
                                                                                                str = str21;
                                                                                                try {
                                                                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                                    a("\u0000\u0000\u0000\u0000", "叫먯ꍫ⩕\uf54b", "ښ胹뉉\uf113", (char) (5042 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), android.view.MotionEvent.axisFromString("") + 1233189127, objArr124);
                                                                                                    cls41.getMethod((java.lang.String) objArr124[0], java.lang.Long.TYPE).invoke(null, objArr123);
                                                                                                } catch (java.lang.Throwable th9) {
                                                                                                    th = th9;
                                                                                                    java.lang.Throwable th10 = th;
                                                                                                    java.lang.Throwable cause4 = th10.getCause();
                                                                                                    if (cause4 != null) {
                                                                                                        throw cause4;
                                                                                                    }
                                                                                                    throw th10;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th11) {
                                                                                                th = th11;
                                                                                            }
                                                                                        } catch (java.lang.InterruptedException e) {
                                                                                            e = e;
                                                                                            interruptedException = e;
                                                                                            try {
                                                                                                throw interruptedException;
                                                                                            } catch (java.lang.Throwable th12) {
                                                                                                th = th12;
                                                                                                th3 = th;
                                                                                                try {
                                                                                                    exec.destroy();
                                                                                                    throw th3;
                                                                                                } catch (java.lang.Exception unused8) {
                                                                                                    throw th3;
                                                                                                }
                                                                                            }
                                                                                        } catch (java.lang.Throwable th13) {
                                                                                            th = th13;
                                                                                            th3 = th;
                                                                                            exec.destroy();
                                                                                            throw th3;
                                                                                        }
                                                                                    } catch (java.lang.InterruptedException e2) {
                                                                                        interruptedException = e2;
                                                                                        throw interruptedException;
                                                                                    } catch (java.lang.Throwable th14) {
                                                                                        th3 = th14;
                                                                                        exec.destroy();
                                                                                        throw th3;
                                                                                    }
                                                                                } else {
                                                                                    str = str5;
                                                                                    str3 = str6;
                                                                                }
                                                                                try {
                                                                                    nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                                    if (nanos > 0) {
                                                                                        str6 = str3;
                                                                                        str5 = str;
                                                                                    }
                                                                                } catch (java.lang.InterruptedException e3) {
                                                                                    e = e3;
                                                                                    interruptedException = e;
                                                                                    throw interruptedException;
                                                                                } catch (java.lang.Throwable th15) {
                                                                                    th = th15;
                                                                                    th3 = th;
                                                                                    exec.destroy();
                                                                                    throw th3;
                                                                                }
                                                                            } catch (java.lang.InterruptedException e4) {
                                                                                interruptedException = e4;
                                                                                throw interruptedException;
                                                                            } catch (java.lang.Throwable th16) {
                                                                                th3 = th16;
                                                                                exec.destroy();
                                                                                throw th3;
                                                                            }
                                                                        }
                                                                    } catch (java.lang.InterruptedException e5) {
                                                                        e = e5;
                                                                    } catch (java.lang.Throwable th17) {
                                                                        th = th17;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            dataOutputStream.close();
                                                                        } catch (java.io.IOException unused9) {
                                                                        }
                                                                        try {
                                                                            try {
                                                                                java.lang.Class<?> cls42 = java.lang.Class.forName(str14);
                                                                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                a("\u0000\u0000\u0000\u0000", "颭獃誝ᚈ", "ﰬ싸\udeb0\ue973", (char) (29661 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, objArr125);
                                                                                cls42.getMethod((java.lang.String) objArr125[0], java.lang.Long.TYPE).invoke(newInstance, 100L);
                                                                                try {
                                                                                    java.lang.Class<?> cls43 = java.lang.Class.forName(str14);
                                                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                    a("\u0000\u0000\u0000\u0000", "颭獃誝ᚈ", "ﰬ싸\udeb0\ue973", (char) (android.view.View.resolveSize(0, 0) + 29662), 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr126);
                                                                                    cls43.getMethod((java.lang.String) objArr126[0], java.lang.Long.TYPE).invoke(newInstance2, 10L);
                                                                                    try {
                                                                                        try {
                                                                                            exec.destroy();
                                                                                        } catch (java.io.IOException unused10) {
                                                                                            r15 = i;
                                                                                            str6 = str3;
                                                                                            i39 = num17;
                                                                                            str5 = str19;
                                                                                            i40 = r27 + 1;
                                                                                            str15 = str5;
                                                                                            num16 = i39;
                                                                                            i24 = r15;
                                                                                            split = r32;
                                                                                            length = c7 == true ? 1 : 0;
                                                                                            str5 = str;
                                                                                            i39 = 0;
                                                                                            r27 = r27;
                                                                                            r32 = r32;
                                                                                            c7 = c7;
                                                                                        } catch (java.lang.Exception unused11) {
                                                                                        }
                                                                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                        java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.getCapsMode("", 0, 0) + 1507, (char) android.text.TextUtils.getOffsetAfter("", 0));
                                                                                        byte[] bArr5 = $$a;
                                                                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                                        c((short) 650, bArr5[7], bArr5[2], objArr127);
                                                                                        sb2.append(cls44.getField((java.lang.String) objArr127[0]).get(newInstance).toString());
                                                                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 1507 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                                        c((short) 650, bArr5[7], bArr5[2], objArr128);
                                                                                        sb2.append(cls45.getField((java.lang.String) objArr128[0]).get(newInstance2).toString());
                                                                                        java.lang.String obj72 = sb2.toString();
                                                                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                                        d(android.os.Process.myPid() >> 22, (char) android.view.View.resolveSizeAndState(0, 0, 0), 1 - android.graphics.Color.blue(0), objArr129);
                                                                                        java.lang.String[] split2 = obj72.split(((java.lang.String) objArr129[0]).intern());
                                                                                        int length2 = split2.length;
                                                                                        int i41 = 0;
                                                                                        while (i41 < length2) {
                                                                                            java.lang.String str22 = split2[i41];
                                                                                            java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                                            b(null, true, new int[]{107, 19, 157, 14}, objArr130);
                                                                                            if (!str22.startsWith((java.lang.String) objArr130[0])) {
                                                                                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                                                a("\u0000\u0000\u0000\u0000", "愎亾\u197f\udd61ા︺䔇騏뛌㿢有뒤闹疦䛴ஏ\ud9f0\u0fe1䱁阢", "孩蒍ᝒ㯗", (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr131);
                                                                                                if (str22.startsWith((java.lang.String) objArr131[0])) {
                                                                                                    continue;
                                                                                                } else {
                                                                                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                                                                    b("\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000", true, new int[]{126, 8, 0, 1}, objArr132);
                                                                                                    if (str22.startsWith((java.lang.String) objArr132[0])) {
                                                                                                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                                                        b("\u0000", true, new int[]{134, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, 1}, objArr133);
                                                                                                        java.lang.String[] split3 = str22.split((java.lang.String) objArr133[0]);
                                                                                                        if (split3.length > 1 && split3[1].equalsIgnoreCase(str18)) {
                                                                                                        }
                                                                                                    } else {
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            i41++;
                                                                                            str19 = str19;
                                                                                            str3 = str3;
                                                                                            num17 = num17;
                                                                                        }
                                                                                        r15 = i;
                                                                                        str6 = str3;
                                                                                        str5 = str19;
                                                                                        i39 = num17;
                                                                                    } catch (java.lang.Exception unused12) {
                                                                                        java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                                                        a("\u0000\u0000\u0000\u0000", "ぺ◽ᄔ螦噌螎巤ᙩ\u0a57꿤斆緭⪎霂탧횭؛ιⷼ綆沇ぼ荀獝ނ\uef58槞", "緒힔祠蹋", (char) (19321 - android.graphics.Color.blue(0)), 1624740989 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1152);
                                                                                        throw new java.io.IOException((java.lang.String) objArr1152[0]);
                                                                                    }
                                                                                } catch (java.lang.Throwable th18) {
                                                                                    java.lang.Throwable cause5 = th18.getCause();
                                                                                    if (cause5 != null) {
                                                                                        throw cause5;
                                                                                    }
                                                                                    throw th18;
                                                                                }
                                                                            } catch (java.lang.Throwable th19) {
                                                                                java.lang.Throwable cause6 = th19.getCause();
                                                                                if (cause6 != null) {
                                                                                    throw cause6;
                                                                                }
                                                                                throw th19;
                                                                            }
                                                                        } catch (java.lang.InterruptedException e6) {
                                                                            interruptedException = e6;
                                                                            throw interruptedException;
                                                                        } catch (java.lang.Throwable th20) {
                                                                            th3 = th20;
                                                                            exec.destroy();
                                                                            throw th3;
                                                                        }
                                                                    } catch (java.lang.InterruptedException e7) {
                                                                        e = e7;
                                                                        interruptedException = e;
                                                                        throw interruptedException;
                                                                    } catch (java.lang.Throwable th21) {
                                                                        th = th21;
                                                                        th3 = th;
                                                                        exec.destroy();
                                                                        throw th3;
                                                                    }
                                                                } catch (java.io.IOException unused13) {
                                                                    r15 = i;
                                                                    str = str5;
                                                                } catch (java.lang.Exception unused14) {
                                                                }
                                                            } catch (java.lang.Throwable th22) {
                                                                java.lang.Throwable cause7 = th22.getCause();
                                                                if (cause7 != null) {
                                                                    throw cause7;
                                                                }
                                                                throw th22;
                                                            }
                                                        } catch (java.lang.Throwable th23) {
                                                            th = th23;
                                                            java.lang.Throwable th24 = th;
                                                            java.lang.Throwable cause8 = th24.getCause();
                                                            if (cause8 != null) {
                                                                throw cause8;
                                                            }
                                                            throw th24;
                                                        }
                                                    } catch (java.lang.Throwable th25) {
                                                        th = th25;
                                                    }
                                                } catch (java.lang.Throwable th26) {
                                                    th = th26;
                                                }
                                            } catch (java.lang.Throwable th27) {
                                                th2 = th27;
                                            }
                                        } catch (java.io.IOException unused15) {
                                            str = str5;
                                            i39 = num16;
                                            str5 = str15;
                                            r15 = i24;
                                            i40 = r27 + 1;
                                            str15 = str5;
                                            num16 = i39;
                                            i24 = r15;
                                            split = r32;
                                            length = c7 == true ? 1 : 0;
                                            str5 = str;
                                            i39 = 0;
                                            r27 = r27;
                                            r32 = r32;
                                            c7 = c7;
                                        } catch (java.lang.Exception unused16) {
                                            java.lang.Object[] objArr11522 = new java.lang.Object[1];
                                            a("\u0000\u0000\u0000\u0000", "ぺ◽ᄔ螦噌螎巤ᙩ\u0a57꿤斆緭⪎霂탧횭؛ιⷼ綆沇ぼ荀獝ނ\uef58槞", "緒힔祠蹋", (char) (19321 - android.graphics.Color.blue(0)), 1624740989 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr11522);
                                            throw new java.io.IOException((java.lang.String) objArr11522[0]);
                                        }
                                    } catch (java.lang.Throwable th28) {
                                        th = th28;
                                        th = th;
                                        cause = th.getCause();
                                        if (cause == null) {
                                        }
                                    }
                                } catch (java.io.IOException unused17) {
                                    r27 = i40;
                                    str = str5;
                                    i39 = num16;
                                    str5 = str15;
                                    r15 = i24;
                                    i40 = r27 + 1;
                                    str15 = str5;
                                    num16 = i39;
                                    i24 = r15;
                                    split = r32;
                                    length = c7 == true ? 1 : 0;
                                    str5 = str;
                                    i39 = 0;
                                    r27 = r27;
                                    r32 = r32;
                                    c7 = c7;
                                } catch (java.lang.Exception unused18) {
                                    java.lang.Object[] objArr115222 = new java.lang.Object[1];
                                    a("\u0000\u0000\u0000\u0000", "ぺ◽ᄔ螦噌螎巤ᙩ\u0a57꿤斆緭⪎霂탧횭؛ιⷼ綆沇ぼ荀獝ނ\uef58槞", "緒힔祠蹋", (char) (19321 - android.graphics.Color.blue(0)), 1624740989 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr115222);
                                    throw new java.io.IOException((java.lang.String) objArr115222[0]);
                                }
                            }
                        } else {
                            r32 = split;
                            c7 = length;
                            r27 = i40;
                            str = str5;
                            i39 = num16;
                            str5 = str15;
                            r15 = i24;
                        }
                        i40 = r27 + 1;
                        str15 = str5;
                        num16 = i39;
                        i24 = r15;
                        split = r32;
                        length = c7 == true ? 1 : 0;
                        str5 = str;
                        i39 = 0;
                        r27 = r27;
                        r32 = r32;
                        c7 = c7;
                    }
                    num = num16;
                } else {
                    num = -1347122530;
                    num2 = 269015277;
                    num3 = num6;
                }
                i4 = i24;
                objArr = new java.lang.Object[]{new int[]{i4}, new int[]{i4}, null, null, new int[1]};
                java.lang.Object[] objArr134 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((~((-4472913) | i4)) * 623) + 2012641140 + (((~i4) | 957423140) * (-623)) + (((~((-38592859) | i4)) | 4472912 | (~(991543086 | i4))) * 623))};
                java.lang.Object obj73 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                java.lang.Object obj74 = obj73;
                if (obj73 == null) {
                    java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, android.graphics.Color.blue(0) + 2713, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                    c((short) 653, r5[2], (byte) (-$$a[52]), objArr135);
                    java.lang.reflect.Method method33 = cls46.getMethod((java.lang.String) objArr135[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, method33);
                    obj74 = method33;
                }
                c = 0;
                ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj74).invoke(null, objArr134)).intValue();
                i5 = 1;
                if (((int[]) objArr[i5])[c] != i4) {
                }
            } catch (java.lang.Throwable th29) {
                java.lang.Throwable cause9 = th29.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th29;
            }
        } catch (java.lang.Throwable th30) {
            java.lang.Throwable cause10 = th30.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th30;
        }
    }

    static void init$0() {
        $$a = new byte[]{117, 33, 0, 124, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
        $$b = 51;
    }
}
