package com.payair.hce;

/* loaded from: classes4.dex */
public class setTag {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static int values;
    private static char[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 35 - (s * 2);
        int i5 = i + 65;
        byte[] bArr = $$a;
        int i6 = (b * 34) + 4;
        char[] cArr = new char[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i5 = i4;
            i6++;
            i5 = (i5 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            cArr[i2] = (char) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i5 = (i5 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            cArr[i2] = (char) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            cArr[i2] = (char) i5;
            if (i3 == i4) {
            }
        }
    }

    private static void c(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i = b * 3;
        int i2 = (s2 * 2) + 99;
        byte[] bArr = $$d;
        int i3 = s + 4;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i2 = i3 + (-i4);
            i3 = i3;
        }
        while (true) {
            i5++;
            int i6 = i3 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2 += -bArr[i6];
                i3 = i6;
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.Object newInstance;
        int i;
        int i2 = values;
        int i3 = i2 & 107;
        int i4 = (i2 ^ 107) | i3;
        valueOf = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        int i5 = (-2) - (~(i2 + 22));
        valueOf = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                d(new int[]{0, 26, 130, 8}, true, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr2);
                newInstance = java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(null).newInstance(null);
                i = 24;
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                d(new int[]{0, 26, 130, 8}, true, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr3);
                newInstance = java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(null).newInstance(null);
                i = 32;
            }
            byte[] bArr = new byte[i];
            int i6 = valueOf;
            int i7 = ((i6 & 53) + (i6 | 53)) % 128;
            values = i7;
            int i8 = i7 & 91;
            int i9 = (i7 | 91) & (~i8);
            int i10 = i8 << 1;
            valueOf = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            d(new int[]{26, 9, 193, 0}, false, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", objArr4);
            java.util.Random.class.getMethod((java.lang.String) objArr4[0], byte[].class).invoke(newInstance, bArr);
            int i11 = valueOf;
            int i12 = i11 & 59;
            int i13 = i12 + ((i11 ^ 59) | i12);
            values = i13 % 128;
            if (i13 % 2 != 0) {
                return bArr;
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

    private static void a(char c, int i, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            int i3 = $10 + 67;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(writeReplace[i2 + getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 48, 381 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (62388 - android.view.View.resolveSizeAndState(0, 0, 0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((short) -1, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.graphics.Color.green(0) + 3966, (char) (40223 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 212 - android.view.View.getDefaultSize(0, 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(writeReplace[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 48, 381 - android.graphics.Color.red(0), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c((short) -1, (short) 0, (byte) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 36, 3967 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (40223 - android.graphics.Color.red(0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 35, (android.view.ViewConfiguration.getTouchSlop() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            int i6 = $11 + 93;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.resolveSize(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                throw null;
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr11 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj8 == null) {
                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj8);
            }
            ((java.lang.reflect.Method) obj8).invoke(null, objArr11);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void d(int[] iArr, boolean z, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            int i2 = $10 + 25;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = AlternateContactlessPaymentDataJson;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr2[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, 2806 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i3)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        cArr = cArr2;
                        c((short) -1, (short) 5, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                    }
                    cArr3[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    cArr2 = cArr;
                    i3 = 0;
                    i5 = 1;
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
        char[] cArr4 = new char[i6];
        java.lang.System.arraycopy(cArr2, i4, cArr4, 0, i6);
        if (bArr2 != null) {
            char[] cArr5 = new char[i6];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.KeyEvent.normalizeMetaState(0), 2835 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte length2 = (byte) $$d.length;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c((short) -1, length2, (byte) (length2 - 4), objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    $11 = ($10 + 21) % 128;
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42, 2880 - android.graphics.Color.blue(0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        c((short) -1, (short) 6, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 34, android.view.View.MeasureSpec.getMode(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i8 > 0) {
            $11 = ($10 + 3) % 128;
            char[] cArr6 = new char[i6];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i6);
            int i12 = i6 - i8;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i12, i8);
            java.lang.System.arraycopy(cArr6, i8, cArr4, 0, i12);
        } else {
            i = 0;
        }
        if (z) {
            $10 = ($11 + 107) % 128;
            char[] cArr7 = new char[i6];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr4[(i6 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr7;
        }
        if (i7 > 0) {
            int i13 = $11 + 35;
            $10 = i13 % 128;
            int i14 = i13 % 2 != 0 ? 1 : 0;
            while (true) {
                getaccounttype.writeReplace = i14;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                int i15 = $11 + 77;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] >> iArr[5]);
                    i14 = getaccounttype.writeReplace;
                } else {
                    cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                    i14 = getaccounttype.writeReplace + 1;
                }
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static void valueOf() {
        char[] cArr = new char[1707];
        java.nio.ByteBuffer.wrap("^\u0080\u0080¼â$Å¼'\\\u0006\u009bh\nK\u0082\u00ads\u008cæî`ÑÁ3S\u0012ûtLV2¹»\u009b:ú\u0094Ü\t?\u0090a3@æ¢n\u0085æçSÆÜL\u0013\u0092/ð·×/5Ï\u0014\bz\u0099Y\u0011¿à\u009euüóÃR!À\u0000hfÎD¬«<\u0089¾è=Î\u008d-\u0000s\u008dRe°ù\u0097p^\u0080\u0080¼â$Å¼'\\\u0006\u009bh\nK\u0082\u00ads\u008cæî`ÑÁ3S\u0012ût^V/¹±\u009b+^\u0080\u0080«â8Å¹'\\\u0006\u0091h\nK\u008a\u00adb\u008cìîlÑ\u009d3\\\u0012ËtAV2¹¹\u009b!ú\u0082Ü\u0012?¼a\u000e@ô¢j\u0085óçUÆË([¢Û|æ\u001en9òÛ\u0007úÃ\u0094Y·\u009bQ<p©\u0012=-\u0099\u0005ÔÛé¹a\u009eý|\b]Û3X\u0010×öm×¤µ/\u008a\u0089h\u001f^\u0080\u0080«â%Å©'\u0012\u0006\u008eh\u0001KÁ\u00adE\u008cÆîDÑÝ3M\u0012ÁtiV7¹«\u009b)^\u0080\u0080«â8Å¹'\u0007\u0006\u0099h\bKÁ\u00ad{\u008céîkÑ\u009d3W\u0012ÍtOV8¹½\u009bfú\u0082Ü\u0015^Í\u0080±â&Å¤'\u001c\u0006\u0084^\u0080\u0080«â8Å¹'\u0007\u0006\u0099h\bKÁ\u00adu\u008céîgÑ\u009d3U\u0012Át@V#¹\u0089\u009b\u0005úÜÜ\u0014?\u0086a\u0001@à¢3\u0085äç_Æ×(V\u000bÙm»O1^\u0080\u0080«â8Å¹'\u0007\u0006\u0099h\bKÁ\u00adu\u008céîgÑ\u009d3U\u0012Át@V#¹\u0089\u009b\u0005úÜÜ\n?\u0091a\u0003@å\u0015\u0095Ë¾©-\u008e¬l\u0012M\u008c#\u001d\u0000ÔænÇü¥~\u009a\u0088xBYØ?Z\u001d-ò¯Ð0±\u0091\u00979t»*\t\u000bòédÎâ¬\u000b\u008dßcX\u008fÛQç3\u007f\u0014çö\u0007×É¹[\u009aØ|9]¼?'\u0000\u008câ\u0013Ã\u008b^Ý\u0080·âoÅ¨'\u0006\u0006\u0095h\tK\u008a\u00ad9\u008cèîfÑÁ3OY\u0014\u0087håõÂl Ã\u0001\u0007oÞL^ª¶Ä<\u001a\u0014x\u008f_\u0019½¬\u009coò¿Ñ;7Ç\u0016YtÆKw©ô\u0088lîôÌ\u0087#\u0010\"uü\t\u009e\u0098¹\u000b[´z.^ó\u0080\u0099^Ý\u0080·âoÅº'\u0001\u0006\u0093h\u0001K\u009b\u00adt\u008côî'Ñß3Z\u0012ÊtXV0¹¾\u009b+ú\u0085Ü\u000f?\u0091a\t@ç^È\u0080½â/Å³^Ù\u0080ºâ.Å²'\u0000\u0006\u009a°ânÊ\fQ+ÇÉrè±\u0086j¥ãC\u0011b\u0097\u0000\u0007?µÝ*\u001e\u009cÀÿ¢k\u0085÷gQFÌ(E\u000bØí&\u0091¾Oë-y\nåèHÉÅ§G\u0084Ñb.C¸þ5 YBÅeK\u0087ó¦dÈä^Ì\u0080°â3Å¥'\u001e\u0006\u0095h\u0010K\u0083^Ý\u0080·âoÅº'\u0001\u0006\u0093h\u0001K\u009b\u00adt\u008côî'ÑÖ3^\u0012ÒtDV5¹º^Ù\u0080ºâ.Å²'K\u0006Êh\u0015<èâ\u009d\u0080\u000f§\u008fE!dµ\n&\\½\u0082ÈàZÇÚ%t\u0004àjsIÄ¯\u001a\u008eÍìJ^È\u0080½â/Å¯'\u0001\u0006\u0095h\u0006K±\u00ado\u008c¸î?Ñí3\r\u0012\u0090&\u009cøö\u009a.½û_@~Ò\u0010@3ÚÕ5ôµ\u0096f©\u009eK\u0015j\u0081\f\t.{^Ü\u0080¼â*É\u0087\u0017øuyRë°_\u0091ÅÿGÜÑ^î\u0080¨â1Åê'!\u0006\u0089h\u000bK\u009a\u00ad~\u008cíîlÑ\u00923]\u0012Ët_Vv¹\u009c\u009b ú\u0083Ü\u0015?\u008ea\tÀ&\u001e~|í[p¹Ô\u0098]öÉÕ\u00063\u008c\u0012\fp\u008aOZ\u00ad\u0091\u008c\u0019ê\u008cÈò'c\u0005 d_BÝ¡Yÿ\u0084Þ%<î\u001by^î\u0080¶â%Å¸'\u001c\u0006\u0095h\u0001KÎ\u00adD\u008cÄîBÑ\u00923Y\u0012ÑtDV:¹«\u009bhú\u0097Ü\u0015?\u0091aL@í¢&\u0085±çoÆ\u008f(\u00162\u008fìå\u008e=©ðK@jÜ\u0004S'ËÁ$à \u0082>^È\u0080·â-Å®'\u0015\u0006\u0095h\u0016K\u0086^Ù\u0080ºâ.Å²'K\u0006Êã»=ß_IxÏ\u009a}»ï^Ý\u0080·âoÅº'\u0001\u0006\u0093h\u0001K\u009b\u00adt\u008côî'ÑÐ3I\u0012ÅtCV2Jc\u0094\töÑÑ\u001f3¨\u00120|µ_5¹Å\u0098\u0010úÆÅi'è\u0006o^\u009e^Ý\u0080·âoÅ¹'\u0016\u0006\u009fh\u0010K\u009c\u00adr\u001cå^Ý\u0080·âoÅ¨'\u0006\u0006\u0095h\tK\u008a\u00ad9\u008cðî{ÑÝ3_\u0012ÑtNV\"^É\u0080\u00adâ-Å¦',\u0006\u0084h]KØ\u0003ÀÝª¿r\u0098µz\u001b[\u00885\u0014\u0016\u0097ð$Ñû³}\u008cÁnAOÜ)B\u000b;ä°Æ<§\u0082\u0081\u0013Lp\u0092\u0005ð\u0097×\u00175¹\u0014-z¾Yy¿Ü\u009e\\üÚÃ%!ä\u0000yfûD\u008b«\u0015\u0089\u0099è*íp3\u0005Q\u0097v\u0017\u0094¹µ-Û¾ø\t\u001e×?\u0000]\u0087b%\u0080ð¡xÇþå±\n\u001f(ÈI\u007foí\u008c<Ò±óC\u0011Ã6MTáub\u009bÅ¸kÞTüÓ\u00adús\u008f\u0011\u001d6\u009dÔ3õ§\u009b4¸ó^B\u007fÝ\u001dT\"çÀeáó\u0087@¥\u0017J\u0089h\u0011\tì//Ì´\u00920³ÂQ^vÜ\u0014a^È\u0080½â/Å¯'\u0001\u0006\u0095h\u0006KÁ\u00ada\u008câîfÑÊ3\u0003\u0012\u0092t]Vy¹©\u009b*ú\u009eÜ\u0002?ÛaZ@å\u0005[Û$¹½\u009e>|\u008c]\n3Ù\u0010\u000eöà×xµÅ\u008aFhØI_/Ñ\r«â)À\u0084¡\u001a\u0087ÑdF:Ð\u001baùèÞz¼Æ\u009dXsØP[6\u0018\u0014¶õmËêÊ÷\u0014\u009dvEQ\u0082³6\u0092¹ü;ß¨9R\u0018ËzGEý§c^Ý\u0080·âoÅ¨'\u001c\u0006\u0093h\u0011K\u0087\u00adz\u008cáînÑ×3\u0015\u0012ÆtXV?¹³\u009b,úßÜ\u001c?\u008aa\u0002@ò¢{\u0085õç@ÆË(K\u000bÅm ^î\u0080¶â%Å¸'\u001c\u0006\u0095h\u0001KÃ\u00ado\u008c¸î?Zý\u0084\u0097æOÁ\u0088#&\u0002µl)Oª©\u0019\u0088Äê@Õá7k\u0016èplR\u000f½Ñ\u009f\u0001þµ\u00878Y^;Ñ\u001c]þ½í\u00053uQëv}\u0094\u009eµLÛÐøN\u001eú?2]¯b\u001c\u0080\u008d¡JÇ\u009eåç\ns(ûIA\u009dÇC¤!5\u0006¦äDÅ\u008d«\u000b\u0088ÙncOø-y\u0012ÅðIÑØ·M\u0095<^Þ\u0080½â,Å¿']\u0006\u008fh\u0003KÀ\u00adq\u008cáîbÑ×3d\u0012ÇtLV;¹º\u009b:ú\u0090^Þ\u0080½â,Å¿']\u0006\u008fh\u0003KÀ\u00ad{\u008cãîmÑí3_\u0012ÁtCV%¹¶\u009b<ú\u0088^Ý\u0080·âoÅ¡'\u0016\u0006\u008eh\u000bK\u008b\u00ad{\u008c®îhÑÜ3_\u0012ÖtBV?¹»\u009bfú\u0080Ü\u001f?\u008ea\u0019@ñÌ\u0094\u0012þp&WáµU\u0094ÚúXÙ\u0089?/\u001e¬|-C\u008e¡\\\u0080\u008cæ\u0012Ä{+É\tohÙN^\u00adÏ^Ý\u0080·âoÅ¥'\u0017\u0006\u0091hKK\u008c\u00adb\u008céîeÑÖ3\u0015\u0012ÂtDV8¹¸\u009b-ú\u0083Ü\n?\u0091a\u0005@û¢j^Ý\u0080·âoÅº'\u0001\u0006\u0093h\u0001K\u009b\u00adt\u008côî'ÑÐ3N\u0012ÍtAV2¹ñ\u009b.ú\u0098Ü\u0014?\u0084a\t@ç¢n\u0085õçYÆ×(V^Ý\u0080·âoÅ¹'\n\u0006\u008fh\u0011K\u008b\u00adz\u008c®îkÑÇ3R\u0012ÈtIVx¹¹\u009b!ú\u009fÜ\u001d?\u0086a\u001e@å¢l\u0085îç^ÆÍ^Ý\u0080·âoÅ¹'\n\u0006\u008fh\u0011K\u008b\u00adz\u008cßîlÑÊ3O\u0012\u008atOV#¹¶\u009b$ú\u0095ÜT?\u0085a\u0005@û¢y\u0085âçBÆÉ(P\u000bÂmºO)^Ý\u0080·âoÅ¼'\u0016\u0006\u0092h\u0001K\u0081\u00ade\u008c®îkÑÇ3R\u0012ÈtIVx¹¹\u009b!ú\u009fÜ\u001d?\u0086a\u001e@å¢l\u0085îç^ÆÍ^Ý\u0080·âoÅ¼'\u0016\u0006\u0092h\u0001K\u0081\u00ade\u008cßîmÑÞ3P\u0012Ét\u0003V4¹ª\u009b!ú\u009dÜ\u001e?Ía\n@ü¢p\u0085àçUÆË(R\u000bÙm½O3®²^\u0095^\u0080\u0080¼â$Å¼'\\\u0006\u008dh\u0000K\u0083\u00adb\u008cßîyÑÛ3K\u0012Ááo?S]ËzS\u0098³¹`×åôb\u0012\u00933\nQ\u0092nr\u008c¶\u00ad*Ë±éÜ\u0006R$ÆEpcñ\u0080SÞäÿ\u001f\u001d\u009f:\u0011X»Jò\u0094ÎöVÑÎ3.\u0012ý|x_ÿ¹\u000e\u0098\u0097ú\u000fÅï'.\u0006³`1B]\u00adÉ^\u0080\u0080¼â$Å¼'\\\u0006\u008fh\nK\u008d\u00ad|\u008cåî}Ñ\u009d3J\u0012Át@V#¹»^\u0080\u0080«â8Å¹'\\\u0006\u008dh\u0000K\u0083\u00adb\u008cßî}ÑÀ3Z\u0012ÇtH^\u0080\u0080«â8Å¹'\u0007\u0006\u0099h\bKÁ\u00ad{\u008céîkÑ\u009d3W\u0012ÍtOV5¹\u0080\u009b%ú\u0090Ü\u0016?\u008fa\u0003@ö¢A\u0085ãçUÆÛ(W\u000bÌm\u008bO,®£\u0090\"ó\u008dÕO4\u0099\u0016|^\u0080\u0080¼â$Å¼'\\\u0006\u009eh\u0016K\u009a\u00adH\u008cçîyÑÁM'\u0093\u001bñ\u0083Ö\u001b4û\u00159{±X=¾ï\u009fSýÇÂx ù^\u0080\u0080¼â$Å¼'\\\u0006\u008fh\nK\u008d\u00ad|\u008cåî}Ñ\u009d3Y\u0012×tYV0¹°\u009b$ú\u0095Ü\u001f?\u0091a\b^\u0080\u0080«â8Å¹'\u0007\u0006\u0099h\bKÁ\u00ad{\u008céîkÑ\u009d3W\u0012ÍtOV4¹¬\u009b<ú\u0097Ü\u0015?\u008fa\b@ð¢l\u0085ØçZÆ×(K\u000b\u0085m§O2Ið\u0097ÌõTÒÌ0,\u0011î\u007ff\\êº\u0006\u009b\u0093ù\u001aÆ§\u0002QÜm¾õ\u0099m{\u008dZO4Ç\u0017Kñ¡Ð(²ª\u008d\f^\u0080\u0080¼â$Å¼'\\\u0006\u009eh\u0016K\u009a\u00adz\u008cåînÑÜ^\u0080\u0080¼â$Å¼'\\\u0006\u009eh\u0016K\u009a\u00adx\u008còî`Ñ×^\u0080\u0080¼â$Å¼'\\\u0006\u009eh\u0016K\u009a\u00ada\u008cíîzÑÕ¶\u0083h¿\n'-¿Ï_î\u009d\u0080\u0015£\u0099Eddä\u0006k9ØÛHúÄ^\u0080\u0080¼â$Å¼'\\\u0006\u009eh\u0016K\u009a\u00adH\u008céîdÑ×^\u0080\u0080¼â Å¾'\u0012\u0006Óh\u0001K\u0081\u00ad`\u008cîîeÑÝ3Z\u0012Àt^Vy¹ñ\u009b0ú\u0093ÜU?\u0081a\u001f@á¢uí\u001c3)Q³v\"\u0094Àµ\u0017Û\u0090ø\u001c\u001eï?s]âb]\u0080\u0088¡zÇÂå¾\n\u0010(¼I\fo\u0094\u008c\u001aÒ\u0094óO\u0011í6wTÈu@\u009bÌ^\u0080\u0080¨â3Å¥'\u0010\u0006Óh\fK\u0081\u00adg\u008cïî{ÑÆ3H^\u009f\u0080¾â'Åê'IüÂ\"ê@qgç\u0085R¤\u0091ÊTéÉ\u000f9.¤Lds\u009d\u0091\u0018°\u0096Ö\u001c^È\u0080ªâ Å¦'\u001f\u0006\u0093h\u0006KÀ\u00adp\u008cïîeÑÖ3]\u0012Ít^V>¹ñ\u009b;ú\u009e\u0083É]»?)\u0018\u0087ú5Û³µ<\u0096»p\u007fQù3w\f\u0096îBÏÁIÂ\u0097ÿõwÒë0\u001e\u0011Ó\u007fB\\Èº<\u009b£ù\u0014Æ\u0093$\u0016\u0005\u0082c\nAw®î\u008c$íËËU(Í^Í\u0080´â4Å¯'\u0000\u0006\u0088h\u0004K\u008d\u00ad|\u008cóAÐ\u009fíýeÚù8\f\u0019ÁwZTË²)\u0093¤ñ*^\u0080\u0080¼â Å¾'\u0012\u0006Óh\u0001K\u0081\u00ad`\u008cîîeÑÝ3Z\u0012Àt^Vy¹ñ\u009b,ú\u0081ÜU?\u0082a\u001c@å¢m\u0085©çHÆÔ(N^\u0080\u0080¨â3Å¥'\u0010\u0006Óh\u0006K\u009e\u00adb\u008céîgÑÔ3T\u009f.Aq#ë\u0004hæÓÇS©Ð\u008a@×O\tskïLq®Ý\u008f\u001cáÇÂH$«\u0005,géX\rº\u0086\u009b\u0004ý\u0084ßð0|\u0012âsMU\u009a¶OèÖÉ(+þ\fxnÐO\u0015¡\u0082\u0082\tä5Æÿ'`\u0019ãzE\\Á½S\u009fµð!Ò¾3o\u0015\u0095v\n¨\u008b\u008aèë}Íæ.g".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
        writeReplace = cArr;
        DigitizedCardProfile = -4213271330095922984L;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        values = 1;
        valueOf();
        AlternateContactlessPaymentDataJson = new char[]{16828, 16680, 16672, 16668, 16647, 16675, 16675, 16681, 16675, 16702, 16677, 16677, 16679, 16661, 16659, 16675, 16699, 16672, 16680, 16656, 16652, 16667, 16694, 16702, 16673, 16699, 16729, 16612, 16609, 16633, 16594, 16592, 16633, 16611, 16611};
        valueOf = (values + 47) % 128;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r10v399 ?? I:??[int, boolean]), method size: 16895
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 16895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.payair.hce.setTag.AlternateContactlessPaymentDataJson(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void init$1() {
        $$d = new byte[]{13, com.visa.cbp.getEncExpo.kernelVersion, 116, -36};
        $$e = 132;
    }

    public static byte[] DigitizedCardProfile() {
        return (byte[]) values(new java.lang.Object[0], 1324974229, -1324974229, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{8, -42, 1, 71, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = 255;
    }
}
