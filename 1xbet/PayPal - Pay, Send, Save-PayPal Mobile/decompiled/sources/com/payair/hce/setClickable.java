package com.payair.hce;

/* loaded from: classes4.dex */
final class setClickable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static final byte[] AlternateContactlessPaymentDataJson = null;
    private static char[] DigitizedCardProfile;
    private static final int getAid = 0;
    private static int valueOf;
    private static long values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        int i6 = 119 - i3;
        int i7 = i + 4;
        byte[] bArr = $$a;
        int i8 = 42 - i2;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i9 = i8;
            i5 = 0;
            i6 = (i6 + (-i9)) - 2;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7++;
            i9 = bArr[i7];
            i6 = (i6 + (-i9)) - 2;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i8) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i8) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = 119 - b;
        int i5 = 537 - i;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[69 - i2];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i5;
            int i9 = i6 + (-i5) + 2;
            i3 = i7;
            int i10 = i8;
            i4 = i9;
            i5 = i10;
            int i11 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == 68 - i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i8 = i11;
            i5 = bArr[i11];
            i7 = i3 + 1;
            i6 = i12;
            int i92 = i6 + (-i5) + 2;
            i3 = i7;
            int i102 = i8;
            i4 = i92;
            i5 = i102;
            int i112 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == 68 - i2) {
            }
        } else {
            i3 = 0;
            int i1122 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == 68 - i2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$g;
        int i2 = s * 4;
        int i3 = (b * 4) + 4;
        int i4 = 119 - (s2 * 2);
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i4 += -i3;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i + 1;
            i5 = i3;
            i3 = bArr[i3];
            i6 = i7;
            i4 += -i3;
            i3 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        }
    }

    setClickable() {
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10 + 117;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 67) % 128;
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(values ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $11 = ($10 + 121) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetBefore("", 0), 1921 - android.text.TextUtils.getCapsMode("", 0, 0), (char) android.view.KeyEvent.normalizeMetaState(0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    f((short) 0, (short) 1, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.getDeadChar(0, 0), 429 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (31610 - android.view.KeyEvent.getDeadChar(0, 0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    f((short) 0, (short) 0, (byte) 0, objArr5);
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
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
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
        char[] cArr2 = DigitizedCardProfile;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (-16774409) - android.graphics.Color.rgb(0, 0, 0), (char) android.view.View.MeasureSpec.getSize(0));
                        byte b = $$g[0];
                        cArr = cArr2;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        f((short) 0, b, (byte) (b - 5), objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                    }
                    cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    cArr2 = cArr;
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
            char[] cArr5 = new char[i2];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i2) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i6 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2835 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        f((short) 0, (short) 6, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i7 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.MeasureSpec.getSize(0), 2881 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        byte length2 = (byte) $$g.length;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        f((short) 0, length2, (byte) (length2 - 4), objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.MotionEvent.axisFromString(""), 211 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.os.Process.myTid() >> 22))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i4 > 0) {
            char[] cArr6 = new char[i2];
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i2);
            int i8 = i2 - i4;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i8, i4);
            java.lang.System.arraycopy(cArr6, i4, cArr4, 0, i8);
        }
        if (z) {
            char[] cArr7 = new char[i2];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i2) {
                cArr7[getaccounttype.writeReplace] = cArr4[(i2 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr4 = cArr7;
        }
        if (i3 > 0) {
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i2) {
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = AlternateContactlessPaymentDataJson;
        int i4 = s + 4;
        int i5 = 118 - i;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i5 = (i5 + (-i4)) - 5;
            i4 = i6 + 1;
            i3 = i7;
            bArr2[i3] = (byte) i5;
            i7 = i3 + 1;
            if (i3 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i4;
            i4 = bArr[i4];
            i5 = (i5 + (-i4)) - 5;
            i4 = i6 + 1;
            i3 = i7;
            bArr2[i3] = (byte) i5;
            i7 = i3 + 1;
            if (i3 == i2) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i7 = i3 + 1;
            if (i3 == i2) {
            }
        }
    }

    static void valueOf() {
        byte[] bArr = new byte[7599];
        java.lang.System.arraycopy("IO\u008c\u008e÷\u0000úö\u0001õ\u0001úõ\u0002úô\u0003ñ\u0005úó\u0004ð\u0006úò\u0005î\böüÿöû\u0000úñ\u0006úð\u0007öú\u0001úï\böù\u0002öù\u0002ú÷üÿúñ\u0006úð\u0007ö÷\u0004ú÷û\u0000öù\u0002ú÷ú\u0001úñ\u0006úð\u0007öö\u0005ú÷ù\u0002ð\u0006ú÷ø\u0003öõ\u0006úñ\u0006úð\u0007öô\u0007ú÷÷\u0004öó\bõýÿú÷ö\u0005öüÿú÷õ\u0006ú÷ô\u0007ú÷ó\bõû\u0001úöýÿõú\u0002õù\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002õ÷\u0005öù\u0002úöù\u0003úöø\u0004úö÷\u0005úöö\u0006öüÿúöõ\u0007úöô\bú÷ó\búõþÿúõý\u0000öù\u0002úõü\u0001õõ\u0007úõû\u0002õô\búöü\u0000ôþÿöù\u0002úöû\u0001úõú\u0003õ÷\u0005õ÷\u0005úöø\u0004úõù\u0004ôý\u0000ôü\u0001úõø\u0005úõ÷\u0006úõö\u0007ôú\u0003úõõ\bôü\u0001úõö\u0007ôú\u0003öù\u0002öù\u0002úõý\u0000úôÿÿôý\u0000úôþ\u0000ôý\u0000úôý\u0001úôü\u0002úôû\u0003ôù\u0004ôø\u0005úôú\u0004ôø\u0005úôú\u0004ôö\u0007úöù\u0003ôõ\bóÿÿúôù\u0005óþ\u0000óý\u0001óü\u0002ôõ\bóÿÿúôù\u0005óû\u0003óú\u0004úôù\u0005õ\u0001óù\u0005óø\u0006óý\u0001óü\u0002úôø\u0006úöü\u0000úô÷\u0007ôö\u0007úöû\u0001ó÷\u0007óö\búöü\u0000ò\u0000ÿúôö\bòÿ\u0000òþ\u0001úôö\bòý\u0002úôö\bóü\u0002úõú\u0003ôù\u0004òü\u0003úöø\u0004úó\u0000ÿòû\u0004úóÿ\u0000õù\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002òú\u0005úöù\u0003úöø\u0004úö÷\u0005úöö\u0006úóþ\u0001úõû\u0002õ÷\u0005ôý\u0000úóý\u0002ôý\u0000úôþ\u0000ôý\u0000úóü\u0003úóû\u0004úóú\u0005ôù\u0004ôø\u0005úôú\u0004ôø\u0005úôú\u0004úóù\u0006õ÷\u0005úóø\u0007õ÷\u0005úó÷\búò\u0001ÿòø\u0007ò÷\bñ\u0001ÿúôú\u0004ñ\u0000\u0000ñÿ\u0001úò\u0000\u0000öù\u0002ñþ\u0002ñý\u0003úò\u0000\u0000ñü\u0004ñû\u0005úòÿ\u0001úòþ\u0002úòý\u0003ñù\u0007ñø\búò\u0000\u0000ñü\u0004öù\u0002úõü\u0001ôø\u0005úòü\u0004úòû\u0005ð\u0002ÿúòú\u0006úòù\u0007ð\u0001\u0000úòø\búòù\u0007ôø\u0005úñ\u0002ÿð\u0000\u0001ðÿ\u0002ðþ\u0003úñ\u0001\u0000úñ\u0000\u0001ôý\u0000úôþ\u0000ôý\u0000úñÿ\u0002úñþ\u0003úñý\u0004ôù\u0004ôø\u0005úôú\u0004ôø\u0005úôú\u0004òþ\u0001úöù\u0003ðý\u0004ôø\u0005úñü\u0005ðü\u0005ôù\u0004õ\u0001óù\u0005ðû\u0006úñü\u0005ðú\u0007ðù\bóü\u0002úñû\u0006úöü\u0000úñú\u0007òþ\u0001úöû\u0001ôý\u0000öù\u0002úñù\bóü\u0002ï\u0003ÿúñù\bóü\u0002úõú\u0003ôù\u0004òü\u0003úöø\u0004ôø\u0005ï\u0002\u0000ôö\u0007ñÿ\u0001úò\u0000\u0000öù\u0002ï\u0001\u0001öù\u0002úõü\u0001ôø\u0005úòü\u0004úð\u0003ÿï\u0000\u0002ú÷ö\u0005öüÿúð\u0002\u0000úð\u0001\u0001úð\u0000\u0002ïÿ\u0003úðÿ\u0003õú\u0002õù\u0003úöü\u0000ïþ\u0004úöû\u0001úöú\u0002òú\u0005úöù\u0003úöø\u0004úö÷\u0005úöö\u0006öüÿúðþ\u0004úðý\u0005úðü\u0006úðû\u0007úðú\böù\u0002úï\u0004ÿõõ\u0007úï\u0003\u0000õô\búöü\u0000ôþÿöù\u0002úöû\u0001úõú\u0003ïý\u0005úöø\u0004úõù\u0004ïü\u0006úï\u0002\u0001úï\u0001\u0002úï\u0000\u0003ïû\u0007úõõ\bïú\búïÿ\u0004ïû\u0007î\u0004ÿúðú\bôö\u0007úöù\u0003î\u0003\u0000úôù\u0005óþ\u0000î\u0002\u0001óÿÿúôù\u0005î\u0001\u0002î\u0003\u0000úôù\u0005î\u0000\u0003îÿ\u0004îþ\u0005óü\u0002úïþ\u0005úöü\u0000úïý\u0006ôö\u0007úöû\u0001ôý\u0000öù\u0002óö\búöü\u0000óü\u0002ï\u0003ÿúôö\bòÿ\u0000òþ\u0001úôö\bòý\u0002úôö\bóü\u0002úõú\u0003ôù\u0004õ÷\u0005ôù\u0004úöø\u0004úó\u0000ÿõõ\u0007ïû\u0007úïü\u0007úïû\búï\u0003\u0000ñù\u0007ú÷üûÿõù\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002òú\u0005úöù\u0003úöø\u0004úö÷\u0005úöö\u0006ú÷üú\u0000úï\u0003\u0000îý\u0006ú÷üù\u0001úóù\u0006õ÷\u0005úóø\u0007õ÷\u0005úó÷\búò\u0001ÿîü\u0007ôø\u0005îû\búôú\u0004ñù\u0007õ\u0001ñÿ\u0001úò\u0000\u0000öüûÿñù\u0007öù\u0002ñÿ\u0001úò\u0000\u0000öüú\u0000ú÷üø\u0002ú÷ü÷\u0003ú÷üö\u0004úòû\u0005ôý\u0000öüø\u0002öü÷\u0003ú÷üõ\u0005úòù\u0007ôø\u0005öüö\u0004öüõ\u0005ñÿ\u0001ú÷üõ\u0005úòù\u0007ôø\u0005ú÷üö\u0004ú÷üô\u0006öó\böüô\u0006ú÷ö\u0005öüÿú÷üó\u0007ú÷üò\bú÷ûüÿöüó\u0007ú÷ûû\u0000õú\u0002õù\u0003úöü\u0000ïþ\u0004úöû\u0001úöú\u0002òú\u0005úöù\u0003úöø\u0004úö÷\u0005úöö\u0006öüÿú÷ûú\u0001ú÷ûù\u0002ú÷ûø\u0003ú÷û÷\u0004ú÷ûö\u0005öù\u0002ú÷ûõ\u0006õõ\u0007ú÷ûô\u0007õô\búöü\u0000ôþÿöù\u0002úöû\u0001úõú\u0003õ÷\u0005õ÷\u0005úöø\u0004úõù\u0004ôý\u0000öüò\bú÷ûó\bú÷úýÿú÷úü\u0000öûüÿúõõ\böüò\bú÷úü\u0000öûüÿöù\u0002ú÷ûö\u0005óþ\u0000úöù\u0003ôõ\bóÿÿúôù\u0005î\u0001\u0002ôõ\bóÿÿúôù\u0005î\u0000\u0003îÿ\u0004öûû\u0000óý\u0001óü\u0002ú÷úû\u0001úöü\u0000ú÷úú\u0002óþ\u0000úöû\u0001ôý\u0000öù\u0002óö\búöü\u0000ò\u0000ÿúôö\bóü\u0002ôý\u0000òþ\u0001úôö\bóü\u0002úõú\u0003ôù\u0004õ÷\u0005ôù\u0004úöø\u0004úó\u0000ÿõõ\u0007öûüÿú÷úù\u0003ú÷úø\u0004ú÷ûô\u0007ñù\u0007ú÷ú÷\u0005õù\u0003úöü\u0000ïþ\u0004úöû\u0001úöú\u0002òú\u0005úöù\u0003úöø\u0004úö÷\u0005úöö\u0006ú÷úö\u0006ú÷ûô\u0007õ÷\u0005ôý\u0000ú÷úõ\u0007úóù\u0006õ÷\u0005úóø\u0007õ÷\u0005úó÷\búò\u0001ÿöûú\u0001ôø\u0005ôø\u0005ôø\u0005îû\búôú\u0004öûù\u0002úò\u0000\u0000öù\u0002ñþ\u0002ñý\u0003úò\u0000\u0000öù\u0002ï\u0001\u0001ñû\u0005ú÷úô\bú÷ùþÿú÷ùý\u0000ï\u0002\u0000óþ\u0000ñÿ\u0001úò\u0000\u0000ñü\u0004öù\u0002ú÷ûõ\u0006ôø\u0005ú÷ùü\u0001ú÷ùû\u0002öûø\u0003öû÷\u0004ú÷ùú\u0003òþ\u0001úöù\u0003ðý\u0004ôø\u0005úñü\u0005ôù\u0004öûö\u0005óý\u0001öûõ\u0006ôø\u0005úñü\u0005ðú\u0007öù\u0002óù\u0005ú÷ùù\u0004úöü\u0000ú÷ùø\u0005òþ\u0001úöû\u0001ôý\u0000öù\u0002úñù\bò\u0000ÿúñù\bóü\u0002úõú\u0003ôù\u0004òü\u0003úöø\u0004ôø\u0005ñù\u0007ôý\u0000öûô\u0007úò\u0000\u0000ñü\u0004öù\u0002ú÷ûõ\u0006ôø\u0005ú÷ù÷\u0006ú÷ùö\u0007öó\böûó\bú÷ö\u0005öüÿú÷ùõ\bú÷øÿÿú÷øþ\u0000öúýÿú÷øý\u0001õú\u0002õù\u0003úöü\u0000ïþ\u0004úöû\u0001úöú\u0002õ÷\u0005öù\u0002úöù\u0003úöø\u0004úö÷\u0005úöö\u0006öüÿú÷øü\u0002ú÷øû\u0003ú÷øþ\u0000ú÷øú\u0004ú÷øù\u0005öù\u0002ú÷ûõ\u0006õõ\u0007ú÷øø\u0006öù\u0002ú÷øù\u0005òþ\u0001úöù\u0003î\u0003\u0000úôù\u0005î\u0000\u0003ôõ\bóÿÿúôù\u0005ðù\bóü\u0002ú÷ø÷\u0007úöü\u0000ú÷øö\bòþ\u0001úöû\u0001ó÷\u0007úôö\bòÿ\u0000õ\u0001úôö\bóü\u0002úõú\u0003ôù\u0004õ÷\u0005ôù\u0004úöø\u0004úó\u0000ÿòû\u0004ú÷÷\u0000ÿõù\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002òú\u0005úöù\u0003úöø\u0004úö÷\u0005úöö\u0006ú÷÷ÿ\u0000ú÷÷þ\u0001îý\u0006ú÷÷ý\u0002úóù\u0006õ÷\u0005úóø\u0007õ÷\u0005úó÷\búò\u0001ÿöûú\u0001ôø\u0005öúü\u0000ñ\u0001ÿñ\u0001ÿúôú\u0004öûù\u0002úò\u0000\u0000ñü\u0004öúû\u0001ñù\u0007öúú\u0002úò\u0000\u0000öù\u0002öúù\u0003ð\u0000\u0001ú÷÷ü\u0003ú÷÷û\u0004ú÷÷ú\u0005ñù\u0007öúø\u0004úò\u0000\u0000ñü\u0004öù\u0002ú÷ûõ\u0006ôø\u0005ú÷÷ù\u0006úòû\u0005ñù\u0007òþ\u0001ñÿ\u0001ú÷üõ\u0005úòù\u0007ôø\u0005ú÷÷ø\u0007ð\u0000\u0001öú÷\u0005öû÷\u0004ú÷÷÷\bòþ\u0001úöù\u0003ðû\u0006úñü\u0005ôù\u0004öúö\u0006öúõ\u0007óü\u0002ðû\u0006úñü\u0005ðú\u0007öúô\bú÷ùù\u0004úöü\u0000ú÷ùø\u0005òþ\u0001úöû\u0001ôý\u0000öù\u0002úñù\bò\u0000ÿúñù\bóü\u0002úõú\u0003öùþÿúöø\u0004ôø\u0005öùý\u0000ñÿ\u0001úò\u0000\u0000öù\u0002ï\u0001\u0001öù\u0002ú÷ûõ\u0006ôø\u0005ú÷÷ù\u0006ú÷ö\u0001ÿöùü\u0001ú÷ö\u0005öüÿú÷ö\u0000\u0000ú÷öÿ\u0001ú÷öþ\u0002öùû\u0002ú÷öý\u0003öùú\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002òú\u0005úöù\u0003úöø\u0004úö÷\u0005úöö\u0006öüÿú÷öü\u0004ú÷öû\u0005ú÷öú\u0006ú÷öù\u0007ú÷öø\böù\u0002ú÷ûõ\u0006õõ\u0007ú÷õ\u0002ÿõô\búöü\u0000ôþÿöù\u0002úöû\u0001úõú\u0003õ÷\u0005õ÷\u0005úöø\u0004úõù\u0004ôý\u0000öùù\u0004ú÷õ\u0001\u0000ú÷õ\u0000\u0001ú÷õÿ\u0002öùø\u0005úõõ\böùù\u0004ú÷õþ\u0003öù÷\u0006ú÷öø\bóþ\u0000úöù\u0003ôõ\bóÿÿúôù\u0005òþ\u0001î\u0002\u0001óÿÿúôù\u0005î\u0000\u0003öúö\u0006öù\u0002óý\u0001óü\u0002ú÷õý\u0004úöü\u0000ú÷õü\u0005óþ\u0000úöû\u0001ôý\u0000öùö\u0007úöü\u0000ò\u0000ÿúôö\bóü\u0002ôý\u0000òþ\u0001úôö\bóü\u0002úõú\u0003ôù\u0004òü\u0003úöø\u0004úó\u0000ÿöùõ\bú÷õû\u0006ú÷õú\u0007ú÷õ\u0002ÿñù\u0007ú÷õù\bõù\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002òú\u0005úöù\u0003úöø\u0004úö÷\u0005úöö\u0006ú÷ô\u0003ÿú÷õ\u0002ÿîý\u0006ú÷ô\u0002\u0000úóù\u0006õ÷\u0005úóø\u0007õ÷\u0005úó÷\búò\u0001ÿöûú\u0001ôø\u0005ôø\u0005öøÿÿúôú\u0004ñù\u0007öøþ\u0000úò\u0000\u0000ñü\u0004öúû\u0001ñý\u0003úò\u0000\u0000öù\u0002ï\u0001\u0001öøý\u0001öøü\u0002ú÷ô\u0001\u0001ú÷ô\u0000\u0002ú÷ôÿ\u0003öùý\u0000ñÿ\u0001úò\u0000\u0000öù\u0002ï\u0001\u0001öù\u0002ú÷ûõ\u0006ôø\u0005ú÷ôþ\u0004ú÷ôý\u0005ð\u0000\u0001öøû\u0003öøú\u0004ðþ\u0003ú÷ôü\u0006òþ\u0001úöù\u0003ðý\u0004ôø\u0005úñü\u0005ôù\u0004îÿ\u0004ôù\u0004õ\u0001óù\u0005ðý\u0004ôø\u0005úñü\u0005ôù\u0004îÿ\u0004öûû\u0000óý\u0001óü\u0002úñû\u0006úöü\u0000ú÷ôû\u0007òþ\u0001úöû\u0001ôý\u0000öù\u0002úñù\bóü\u0002ôý\u0000õ\u0001úñù\bóü\u0002úõú\u0003ôù\u0004õ÷\u0005ôù\u0004úöø\u0004ôø\u0005ï\u0002\u0000óþ\u0000ñÿ\u0001úò\u0000\u0000öù\u0002öøù\u0005ú÷ûõ\u0006ôø\u0005ú÷ôþ\u0004ú÷ôú\böøø\u0006ú÷ö\u0005öüÿú÷ó\u0004ÿú÷ó\u0003\u0000ú÷ó\u0002\u0001öø÷\u0007ú÷ó\u0001\u0002õú\u0002õù\u0003úöü\u0000ïþ\u0004úöû\u0001úöú\u0002òú\u0005úöù\u0003úöø\u0004úö÷\u0005úöö\u0006öüÿú÷ó\u0000\u0003ú÷óÿ\u0004ú÷ó\u0002\u0001ú÷óþ\u0005ú÷óý\u0006öù\u0002ú÷óü\u0007õõ\u0007ú÷óû\bõô\búöü\u0000öøö\búöû\u0001úõú\u0003õ÷\u0005õ÷\u0005úöø\u0004úõù\u0004ö÷\u0000ÿúöýûÿúöýú\u0000úöýù\u0001ö÷ÿ\u0000úõõ\bö÷þ\u0001úöýù\u0001ôö\u0007úöýø\u0002ôý\u0000öù\u0002úöý÷\u0003úöýö\u0004öù\u0002úöýõ\u0005úñ\u0006úð\u0007ò\u0000ÿúöýô\u0006úöýó\u0007ö÷ý\u0002úñ\u0006úð\u0007óü\u0002ôý\u0000òþ\u0001úöýò\bõ\u0001úöüüÿö÷ü\u0003úñ\u0006úð\u0007óü\u0002ö÷û\u0004úöüû\u0000ð\u0006úöüú\u0001ö÷ù\u0006öû\u0000úñ\u0006úð\u0007ö÷ø\u0007öù\u0002öù\u0002ú÷óý\u0006ö÷÷\búöù\u0003ôõ\bóÿÿúôù\u0005ôö\u0007óý\u0001óü\u0002ôõ\bóÿÿúôù\u0005öö\u0001ÿî\u0003\u0000úôù\u0005òþ\u0001óý\u0001óü\u0002öûö\u0005óù\u0005îÿ\u0004ôù\u0004öúô\búöüù\u0002úöü\u0000úöüø\u0003ö÷÷\búöû\u0001öö\u0000\u0000úöü\u0000òÿ\u0000õ\u0001úöü÷\u0004óü\u0002ööÿ\u0001úôö\bòÿ\u0000óþ\u0000úôö\bòÿ\u0000ôö\u0007úôö\bóü\u0002úõú\u0003ööþ\u0002ôù\u0004úöø\u0004úó\u0000ÿôý\u0000ööý\u0003úò\u0000\u0000öù\u0002ï\u0001\u0001ööü\u0004öúú\u0002úò\u0000\u0000öù\u0002ï\u0001\u0001ôø\u0005ö÷ÿ\u0000úöüö\u0005úöüõ\u0006ú÷óû\bñù\u0007úöüô\u0007õù\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002õ÷\u0005öù\u0002úöù\u0003úöø\u0004úö÷\u0005úöö\u0006úöüó\bú÷óû\bõ÷\u0005ôý\u0000úöûýÿúóù\u0006õ÷\u0005úóø\u0007õ÷\u0005úó÷\búò\u0001ÿöûú\u0001ööû\u0005îû\búôú\u0004ñù\u0007öøþ\u0000úò\u0000\u0000öù\u0002ñþ\u0002ñý\u0003úò\u0000\u0000ñü\u0004ööú\u0006ð\u0000\u0001úöûü\u0000úöûû\u0001úöûú\u0002ñù\u0007ôý\u0000òþ\u0001ñÿ\u0001úò\u0000\u0000öù\u0002öøù\u0005ú÷óü\u0007ôø\u0005úöûù\u0003úöûø\u0004ð\u0000\u0001ðÿ\u0002ðþ\u0003úöû÷\u0005òþ\u0001úöù\u0003ðû\u0006úñü\u0005ðü\u0005ööù\u0007ööø\búñü\u0005ðú\u0007öù\u0002óù\u0005úöûö\u0006úöü\u0000úöûõ\u0007òþ\u0001úöû\u0001ôý\u0000öù\u0002úñù\bóü\u0002ôý\u0000õ\u0001úñù\bóü\u0002úõú\u0003ôù\u0004òü\u0003úöø\u0004ôø\u0005öõ\u0002ÿñÿ\u0001úò\u0000\u0000öù\u0002ï\u0001\u0001öù\u0002ú÷óü\u0007ôø\u0005úöûù\u0003úöûô\böõ\u0001\u0000ú÷ö\u0005öüÿúöúþÿúöúý\u0000úöúü\u0001öõ\u0000\u0001úöúû\u0002öùú\u0003úöü\u0000ïþ\u0004úöû\u0001úöú\u0002õ÷\u0005öù\u0002úöù\u0003úöø\u0004úö÷\u0005úöö\u0006öüÿúöúú\u0003úöúù\u0004úöúü\u0001úöúø\u0005úöú÷\u0006öù\u0002úöúö\u0007õõ\u0007úöúõ\bî\u0004ÿúöú÷\u0006úöùÿÿôý\u0000õõ\u0007úöùþ\u0000õù\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002òú\u0005úöù\u0003úöø\u0004úö÷\u0005úöö\u0006úöùý\u0001úöúõ\bõ÷\u0005ôý\u0000úöùü\u0002úóù\u0006õ÷\u0005úóø\u0007õ÷\u0005úó÷\búò\u0001ÿòø\u0007ôø\u0005ôø\u0005îû\búôú\u0004öûù\u0002úò\u0000\u0000öüûÿñý\u0003úò\u0000\u0000öù\u0002ï\u0001\u0001ööú\u0006ð\u0000\u0001úöùû\u0003úöùú\u0004úöùù\u0005öõÿ\u0002ñÿ\u0001úò\u0000\u0000öù\u0002öøù\u0005úöúö\u0007ôø\u0005úöùø\u0006úòû\u0005ôý\u0000öõþ\u0003ñù\u0007öü÷\u0003ú÷üõ\u0005úòù\u0007ôø\u0005öõý\u0004ñù\u0007öûô\u0007ú÷üõ\u0005úòù\u0007ôø\u0005öõý\u0004öõü\u0005ú÷üõ\u0005úòù\u0007ð\u0001\u0000öõû\u0006ú÷üõ\u0005úòù\u0007ð\u0001\u0000öõú\u0007ú÷üõ\u0005úòù\u0007ôø\u0005öõý\u0004ñù\u0007öõù\bñÿ\u0001ú÷üõ\u0005úòù\u0007ôø\u0005öô\u0003ÿñÿ\u0001ú÷üõ\u0005úòù\u0007ôø\u0005úöù÷\u0007öô\u0002\u0000öô\u0001\u0001öô\u0000\u0002ðþ\u0003úöùö\bòþ\u0001úöù\u0003ðý\u0004ôø\u0005úñü\u0005ôù\u0004îÿ\u0004ôù\u0004î\u0000\u0003ðý\u0004ôø\u0005úñü\u0005ðü\u0005îþ\u0005óü\u0002úöø\u0000ÿúöü\u0000úöøÿ\u0000òþ\u0001úöû\u0001ó÷\u0007úñù\bòÿ\u0000õ\u0001úñù\bóü\u0002úõú\u0003ôù\u0004òü\u0003úöø\u0004ôø\u0005öõÿ\u0002ñÿ\u0001úò\u0000\u0000ñü\u0004öù\u0002úöúö\u0007ôø\u0005úöùø\u0006úöøþ\u0001öó\böôÿ\u0003ú÷ö\u0005öüÿúöøý\u0002úöøü\u0003úöøû\u0004öôþ\u0004úöøú\u0005öùú\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002õ÷\u0005öù\u0002úöù\u0003úöø\u0004úö÷\u0005úöö\u0006öüÿúöøù\u0006úöøø\u0007úöø÷\búö÷\u0001ÿúö÷\u0000\u0000öù\u0002úö÷ÿ\u0001õõ\u0007úö÷þ\u0002öù\u0002úö÷\u0000\u0000úö÷ý\u0003òû\u0004úö÷ü\u0004õù\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002õ÷\u0005öù\u0002úöù\u0003úöø\u0004úö÷\u0005úöö\u0006úö÷û\u0005úö÷þ\u0002õ÷\u0005ôý\u0000úö÷ú\u0006úóù\u0006õ÷\u0005úóø\u0007õ÷\u0005úó÷\búò\u0001ÿîü\u0007öôý\u0005ñ\u0001ÿúôú\u0004ñù\u0007úö÷ù\u0007öúû\u0001ñù\u0007úö÷ø\bööú\u0006ð\u0000\u0001úöö\u0002ÿúöö\u0001\u0000úöö\u0000\u0001ï\u0002\u0000úööÿ\u0002öù\u0002úö÷ÿ\u0001ôø\u0005úööþ\u0003úööý\u0004ð\u0000\u0001öú÷\u0005öû÷\u0004úööü\u0005òþ\u0001úöù\u0003ðû\u0006úñü\u0005ôù\u0004öûö\u0005óý\u0001öûõ\u0006ôø\u0005úñü\u0005ôù\u0004öúö\u0006ðù\bóü\u0002úööû\u0006úöü\u0000úööú\u0007òþ\u0001úöû\u0001ó÷\u0007úñù\bò\u0000ÿúñù\bóü\u0002úõú\u0003ôù\u0004òü\u0003úöø\u0004ôø\u0005ñù\u0007ôý\u0000úööÿ\u0002öù\u0002úö÷ÿ\u0001ôø\u0005úööþ\u0003úööù\böó\böôü\u0006ú÷ö\u0005öüÿúöõ\u0003ÿúöõ\u0002\u0000úöõ\u0001\u0001öôû\u0007úöõ\u0000\u0002õú\u0002õù\u0003úöü\u0000ïþ\u0004úöû\u0001úöú\u0002õ÷\u0005öù\u0002úöù\u0003úöø\u0004úö÷\u0005úöö\u0006öüÿúöõÿ\u0003úöõþ\u0004úöõý\u0005úöõü\u0006úöõû\u0007öù\u0002úöõú\bõõ\u0007úöô\u0004ÿúöô\u0003\u0000úöô\u0002\u0001úöô\u0001\u0002ôý\u0000õõ\u0007úöô\u0000\u0003õù\u0003úöü\u0000õø\u0004öù\u0002úöû\u0001úöú\u0002õ÷\u0005öù\u0002úöù\u0003úöø\u0004úö÷\u0005úöö\u0006úöôÿ\u0004úöô\u0004ÿõ÷\u0005ôý\u0000úöôþ\u0005úóù\u0006õ÷\u0005úóø\u0007õ÷\u0005úó÷\búò\u0001ÿöûú\u0001öúü\u0000öøÿÿúôú\u0004öûù\u0002úò\u0000\u0000öù\u0002öôú\böúú\u0002úò\u0000\u0000öù\u0002ï\u0001\u0001öøý\u0001öó\u0004ÿð\u0000\u0001úöôý\u0006úöôü\u0007úöôû\böùý\u0000ñÿ\u0001úò\u0000\u0000ñü\u0004öù\u0002úöõú\bôø\u0005úõþûÿúòû\u0005ñù\u0007òþ\u0001ñÿ\u0001ú÷üõ\u0005úòù\u0007ôø\u0005úõþú\u0000öûø\u0003öû÷\u0004úõþù\u0001òþ\u0001úöù\u0003ðý\u0004ôø\u0005úñü\u0005ôù\u0004öûö\u0005óý\u0001ööø\búñü\u0005ðü\u0005îþ\u0005óü\u0002úõþø\u0002úöü\u0000úõþ÷\u0003òþ\u0001úöû\u0001ôý\u0000öù\u0002úñù\bóü\u0002ôý\u0000õ\u0001úñù\bóü\u0002úõú\u0003ööþ\u0002ôù\u0004úöø\u0004ôø\u0005ñù\u0007ôý\u0000óþ\u0000ñÿ\u0001úò\u0000\u0000öù\u0002öøù\u0005úöõú\bôø\u0005úõþûÿöù\u0002úõþö\u0004öó\u0002\u0001öó\u0001\u0002úõþõ\u0005öó\u0002\u0001öó\u0000\u0003ôø\u0005ú÷ùü\u0001òþ\u0001öóÿ\u0004ú÷øø\u0006öó\u0002\u0001öó\u0000\u0003ôø\u0005úï\u0000\u0003öó\u0002\u0001öó\u0001\u0002úõþô\u0006úõþó\u0007öóþ\u0005öû\u0000öøý\u0001öóý\u0006úõþò\böóü\u0007úõýüÿúõýû\u0000úõýú\u0001ú÷øú\u0004ú÷øù\u0005öù\u0002ú÷ûõ\u0006õõ\u0007ú÷øø\u0006úõýù\u0002öóû\bõýûÿúõýø\u0003öóü\u0007úõý÷\u0004úõýö\u0005úõýõ\u0006ñù\u0007ú÷õù\bõù\u0003úöü\u0000õø\u0004õ\u0001úöû\u0001úöú\u0002õ÷\u0005õ\u0001úöù\u0003úöø\u0004úö÷\u0005úöö\u0006ú÷ô\u0003ÿú÷õ\u0002ÿúõþó\u0007õýù\u0001öû\u0000õýø\u0002öó\u0000\u0003úõþò\böóü\u0007úõýô\u0007úõýó\búõüýÿñù\u0007õý÷\u0003úò\u0000\u0000õ\u0001õýö\u0004úöúö\u0007ôø\u0005úöùø\u0006úõþó\u0007õýõ\u0005öû\u0000õýø\u0002öó\u0000\u0003úõþò\böóü\u0007úõüü\u0000úõüû\u0001úõüú\u0002ñù\u0007ñø\búò\u0000\u0000õýô\u0006ú÷ûõ\u0006ôø\u0005ú÷÷ù\u0006úõýù\u0002õýó\u0007õýò\böó\u0000\u0003úõýø\u0003òþ\u0001öó\u0000\u0003úõüù\u0003úõüø\u0004úõü÷\u0005ï\u0002\u0000öûô\u0007úò\u0000\u0000ñü\u0004öù\u0002úöõú\bôø\u0005úõþûÿúõýù\u0002õüüÿöû\u0000õýø\u0002öó\u0000\u0003úõýø\u0003öóü\u0007úõüö\u0006úõüõ\u0007úõüô\búðû\u0007úðú\böù\u0002úï\u0004ÿõõ\u0007úï\u0003\u0000úõýù\u0002õüû\u0000õýø\u0002öó\u0000\u0003úõýø\u0003òþ\u0001öó\u0000\u0003úõûþÿúõûý\u0000úõûü\u0001úõûü\u0001úõýù\u0002õüú\u0001õüù\u0002öó\u0000\u0003úõýø\u0003öóü\u0007úõûû\u0002úõûú\u0003úõûù\u0004úõûù\u0004úõýù\u0002õüø\u0003öóý\u0006úõýø\u0003öóü\u0007úõûø\u0005úõû÷\u0006úõûö\u0007úôú\u0004ôú\u0003úõõ\bôü\u0001õ÷\u0005úõûõ\bôø\u0005úõö\u0007úõýù\u0002õü÷\u0004öøý\u0001öóý\u0006úõýø\u0003òþ\u0001öó\u0000\u0003úõúÿÿúõúþ\u0000úõúý\u0001ï\u0002\u0000ö÷÷\bñÿ\u0001úò\u0000\u0000öù\u0002õýö\u0004ú÷óü\u0007ôø\u0005úöûù\u0003úõúü\u0002õüõ\u0006úõúû\u0003õüô\u0007úõúû\u0003úõúú\u0004õ\u0001úõúù\u0005öù\u0002úõúù\u0005úõúø\u0006õüó\búõú÷\u0007õûýÿúõú÷\u0007úõúö\böù\u0002úõù\u0000ÿõ\u0001úõù\u0000ÿúõùÿ\u0000õ\u0001úõùþ\u0001öù\u0002úõùþ\u0001úõùý\u0002õ\u0001úõùü\u0003öù\u0002úõùü\u0003úõùû\u0004õûü\u0000úõùú\u0005õûû\u0001úõùú\u0005úõùù\u0006öù\u0002úõùø\u0007õ\u0001úõùø\u0007úõù÷\bõûú\u0002úõø\u0001ÿõûù\u0003úõø\u0001ÿúõø\u0000\u0000öù\u0002úõøÿ\u0001õ\u0001úõøÿ\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002þÿþð\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýî\u0010ðò\u000b\u0011äöõ\u0019ððò\u000bî\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíûýì*Ô\u0006ìø\tü\u001cÎö\u001cæ÷\u0003öõ\nîÿî\u0005íþ\u0001\u00001³\bÿéDÓèÿéýì+Úú\u0000ç\u0004ó\u001cåê\u0010î\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ýýì\u001cåê\u0010î\u0005íþ\u0001\u00001³\bÿéDÞáç/Ê\fòõýì\"Ù\u0006öþøÿî ãì\u000e\tÚ\u000eè\n\u0013çé\u0003\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê\u0004æ\u0010.½\u0006î\u00024·\búõ\u0002ýêAÜãì\u0007ô\u0006öó\u0002ÿ\u0001\nÝ\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê4\u0004æ\u0010.½\u0006î\u00024ÛÔ\u0003\u0006øîøü\u0002\fððò\u000bî\u0005íþ\u0001\u00001Æïüõ\nòõAæÏüõ\nèÿýì.Ìûÿþ\u0001ýè\u0006õü&Ïüõ\nèÿ\u0004æ\u0010.½\u0006î\u00024Õçñþó\u0011úñ\u0002ýì,Ýçý\tö\u0004\u0006\u0004æ\u0010.½\u0006î\u00024×Ø\u0002õ\u0006÷\u0003\u001bÈ\u0010ùð÷\u0006õü\u0004æ\u0010.½\u0006î\u00024·\búõ\u0002ýêAæÏüöúýø\rê\u0000ø\u0004é)Ööú\u000eî\u0006ù\u0004æ\u0010.´ü\u0006ø9èÊû\fã(Þñú\u0004æ\u0010.´ü\u0006ø9ÝÞñúøû\u0004æ\u0010.½\u0006î\u00024ÝØü\u0002î\u0005íþ\u0001\u00001µ\nèÿAÕêèÿ\u001aÜ\u0006øôýì äûî\tì.Öí\nî\u0004æ\u0010.½\u0006î\u00024æÖ\u0002ê\u001aéï÷\u000bò\u0006ùï$â\u0000î\u0005íþ\u0001\u00001º÷@ÖÕ\u0001ú\nó%Òø\u0007ó\u0000÷\u0006÷\u0003\u0013ßøûþñî\u0005íþ\u0001\u00001¼\u0003üö\u0003.èÇ\föõ\u0016Ý\fùóýì\"çä\u001dâþò\u0003\u0003\nÝ\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002'\u0004æ\u0010.½\u0006î\u00024äÈ\u0010ùð÷\u0006õü".getBytes("ISO-8859-1"), 0, bArr, 0, 7599);
        AlternateContactlessPaymentDataJson = bArr;
        getAid = 149;
    }

    static void init$2() {
        $$g = new byte[]{5, 98, 33, 67};
        $$h = 93;
    }

    static void values() {
        DigitizedCardProfile = new char[]{16887, 16805, 16807, 16809, 16804, 16824, 16800, 16802, 16831, 16800, 16791, 16886, 16799, 16831, 16807, 16802, 16831, 16800, 16807, 16774, 16775, 16808, 16802};
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        valueOf();
        writeReplace = 0;
        valueOf = 1;
        values();
        values = 2629748027220790537L;
    }

    static void init$1() {
        byte[] bArr = new byte[569];
        java.lang.System.arraycopy(".ÌSbö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009Ýñû*Öÿ\u000f\u001a\fÝ\u0001û/Ï\u000b&Ø\u0002\u0000\u0012õ%áþ\rü\u0003ý,Þÿ\u0006JâÝ\u0004\u0000÷\rñ\u0017\u0003#äñ\u0010\u0016à\u0005\u000bÿÿ\t×ú\u0011õ\u0006\u000fï\u0011$Ö\u0003ü\u0015\u0000ñ\n\tô\u0002%ñê\u000e\nùü2åï\u0015\u0019Ù\u0006\u0003ö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009Íó\u000f\u0006ï\u0011$Ö\u0003\nÿ\u0004ô\u0005\u0013ï\rü\u0003-Ö\u0003ü\u0011ï\u0006\u0017÷ù\u0012\u0018ëö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009½\u0010ó#òó\u0005\u0005\u0002+Ö\u0003ü\u0015úý\u000bõPå×ú\u0011õ\u0006\u000fï\u0011$Ö\u0003ü\u0015\u0000ñ\n\tô\u0002%ñê\u000e\nùü2åï\u0015\u0019Ù\u0006\u0003Ý\u0004\u0000÷\rñ\u0017\u0003#äñ\u0010\u0016à\u0005\u000bÿÿ\tö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009½\u0010ó5Ó\u0002\u0006\u0005\b\u0004ï\rü\u0003$å\u0005\u0003$Ì\u0018ù\t#åï\u0015ö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009Á\u0001\rù!ß1Ó\u000f\u0006ï\u0011#åï\u0015\u0001\u0003ð\u0010ö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009½\u0010ó3Ü\n\u0000!á\u0004ù\u0005ý\u000b\u0017÷ù\u0012ôö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009Îï\u000eÿ\n\u0014ï\u0004öÿ\u0010óQôö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009Á\u0001\rù*ßÿ\t\u0018Ü\u0003\u0006ý\u0003ö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009½\u0010ó5×÷\u0018ê\b1Ô\u0013ì\u000b\u0019ð÷\u000e'ä\u0000ý\u0005\"Ù\u000f\u0001ø\t\u0003B¯\u0007\u000b÷\u0011\u0015ï÷\u0006\r\u0000\u0000ö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009½\u0010ó3àõ\u0000\r\u0005ÿ\b\u0004ï\u0011\u0007\u000b÷\u0011\u0015ï÷\u0006\r\u0000\u0000ö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009É\u0004ó#à\u0004\u0005\rù\fýý\t\u0015ä\u0013õý\u0014\u0000ñ\rü\u0003'çö\u0004AÀ\u0011ê\u001aúùFÈ\u0007\u00009É\u0004ó3Ö\r\u0001$ä\u0000ý\u0005#ÝùPò".getBytes("ISO-8859-1"), 0, bArr, 0, 569);
        $$d = bArr;
        $$e = 227;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x288c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x2894  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x28b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x28c6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x28ce  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x28d6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x28f9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x2908  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x2910  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x2918  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x2943  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x2952  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x295a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x297d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x298c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x2994  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x29b7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x29c7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x29cf  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x29f2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x2a02  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x2a0f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x2a36  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x2a45  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x2a58 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x27cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x27f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x2802  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x280c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x2816  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x2839  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x2849  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x2851  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x2874  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x2884  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.payair.hce.setTranslationZ] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1139, types: [int] */
    /* JADX WARN: Type inference failed for: r2v514, types: [int] */
    /* JADX WARN: Type inference failed for: r2v852, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean AlternateContactlessPaymentDataJson() {
        int i;
        int i2;
        int i3;
        java.lang.Throwable th;
        char c;
        com.payair.hce.setTranslationZ settranslationz;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        java.lang.Object[] objArr5;
        java.lang.Object[] objArr6;
        java.lang.Object[] objArr7;
        java.lang.Object[] objArr8;
        java.lang.Object[] objArr9;
        java.lang.Object[] objArr10;
        int i4;
        int i5;
        int i6;
        com.payair.hce.setTranslationZ settranslationz2;
        com.payair.hce.setTranslationZ settranslationz3;
        java.lang.Throwable th2;
        int i7;
        java.lang.Object valueOf2;
        java.lang.reflect.Field field;
        java.lang.Object obj;
        java.lang.Class cls;
        java.lang.String str;
        java.lang.Object newInstance;
        long j;
        int intValue;
        java.lang.Class cls2;
        java.lang.String str2;
        java.lang.Throwable th3;
        java.lang.Object obj2;
        java.lang.Object invoke;
        long j2;
        java.lang.Class cls3;
        java.lang.String str3;
        int intValue2;
        java.lang.Object newInstance2;
        long j3;
        int intValue3;
        com.payair.hce.setTranslationZ settranslationz4 = new com.payair.hce.setTranslationZ();
        byte[] bArr = AlternateContactlessPaymentDataJson;
        char c2 = 5;
        int i8 = 1;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(bArr[0], 6979, bArr[5], objArr11);
        java.lang.String str4 = (java.lang.String) objArr11[0];
        byte b = (byte) (getAid >>> 1);
        short s = bArr[5];
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(b, s, (short) (s | 6979), objArr12);
        try {
            java.lang.Object[] objArr13 = {(java.lang.String) objArr12[0]};
            char c3 = 7149;
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            a(bArr[7149], (short) (-bArr[17]), (short) 6979, objArr14);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            a(bArr[16], bArr[21], (short) 6994, objArr15);
            java.lang.String str5 = (java.lang.String) objArr15[0];
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            a(bArr[7149], (short) (-bArr[17]), (short) 6979, objArr16);
            java.lang.Object[] objArr17 = (java.lang.Object[]) cls4.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr16[0])).invoke(str4, objArr13);
            int[] iArr = new int[objArr17.length];
            int i9 = 0;
            while (true) {
                i = 23;
                if (i9 >= objArr17.length) {
                    break;
                }
                java.lang.Object[] objArr18 = {objArr17[i9]};
                byte[] bArr2 = AlternateContactlessPaymentDataJson;
                byte b2 = bArr2[7149];
                short s2 = bArr2[6985];
                java.lang.Object[] objArr19 = new java.lang.Object[i8];
                a(b2, s2, (short) (s2 | 6982), objArr19);
                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                byte b3 = bArr2[c2];
                short s3 = bArr2[23];
                java.lang.Object[] objArr20 = new java.lang.Object[i8];
                a(b3, s3, (short) (s3 | 7008), objArr20);
                java.lang.String str6 = (java.lang.String) objArr20[0];
                java.lang.Class<?>[] clsArr = new java.lang.Class[i8];
                java.lang.Object[] objArr21 = new java.lang.Object[i8];
                a(bArr2[7149], (short) (-bArr2[17]), (short) 6979, objArr21);
                clsArr[0] = java.lang.Class.forName((java.lang.String) objArr21[0]);
                java.lang.Object invoke2 = cls5.getMethod(str6, clsArr).invoke(null, objArr18);
                byte b4 = bArr2[7149];
                short s4 = bArr2[6985];
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                a(b4, s4, (short) (s4 | 6982), objArr22);
                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr22[0]);
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                a(bArr2[7122], bArr2[40], (short) 7020, objArr23);
                iArr[i9] = ((java.lang.Integer) cls6.getMethod((java.lang.String) objArr23[0], null).invoke(invoke2, null)).intValue();
                i9++;
                c2 = 5;
                i8 = 1;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                int i12 = 27;
                try {
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    i2 = i;
                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                }
                switch (settranslationz4.AlternateContactlessPaymentDataJson(iArr[i10])) {
                    case -362:
                        i5 = 1852;
                        i10 = i5;
                        c3 = 7149;
                    case -361:
                        i2 = i;
                        i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                        try {
                            settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            th = th;
                            settranslationz = settranslationz4;
                            if (i11 >= 103) {
                            }
                            byte[] bArr3 = AlternateContactlessPaymentDataJson;
                            objArr = new java.lang.Object[1];
                            a(bArr3[7149], (short) (-bArr3[i12]), (short) 7577, objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            if (i11 >= 172) {
                            }
                            if (i11 >= 227) {
                            }
                            if (i11 >= 318) {
                            }
                            objArr2 = new java.lang.Object[1];
                            a(bArr3[7149], (short) (-bArr3[i12]), (short) 7577, objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i11 >= 379) {
                            }
                            if (i11 >= 469) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr3[7149], (short) (-bArr3[i12]), (short) 7577, objArr3);
                            if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            if (i11 >= 527) {
                            }
                            if (i11 >= 564) {
                            }
                            if (i11 >= 637) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr3[7149], (short) (-bArr3[i12]), (short) 7577, objArr4);
                            if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            if (i11 >= 681) {
                            }
                            if (i11 >= 726) {
                            }
                            if (i11 >= 813) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr3[7149], (short) (-bArr3[i12]), (short) 7577, objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            if (i11 >= 868) {
                            }
                            if (i11 >= 908) {
                            }
                            if (i11 >= 1039) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr3[7149], (short) (-bArr3[i12]), (short) 7577, objArr6);
                            if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i11 >= 1120) {
                            }
                            if (i11 >= 1158) {
                            }
                            objArr7 = new java.lang.Object[1];
                            a(bArr3[7149], (short) (-bArr3[i12]), (short) 7577, objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            if (i11 >= 1248) {
                            }
                            if (i11 >= 1324) {
                            }
                            objArr8 = new java.lang.Object[1];
                            a(bArr3[7149], (short) (-bArr3[i12]), (short) 7577, objArr8);
                            if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                            }
                            if (i11 >= 1417) {
                            }
                            if (i11 >= 1448) {
                            }
                            objArr9 = new java.lang.Object[1];
                            a(bArr3[7149], (short) (-bArr3[i12]), (short) 7577, objArr9);
                            if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                            }
                            if (i11 >= 1539) {
                            }
                            if (i11 >= 1582) {
                            }
                            c = 7149;
                            objArr10 = new java.lang.Object[1];
                            a(bArr3[7149], (short) (-bArr3[i12]), (short) 7577, objArr10);
                            if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                            }
                            if (i11 >= 1784) {
                            }
                        }
                        if (settranslationz4.DigitizedCardProfile != 0) {
                            i11 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                        i11 = com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                        break;
                    case -360:
                        i5 = 1847;
                        i10 = i5;
                        c3 = 7149;
                    case -359:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        int i13 = settranslationz4.DigitizedCardProfile;
                        if (i13 != 15 && i13 == 90) {
                            i11 = 1492;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                        i11 = 1516;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                        break;
                    case -358:
                        i5 = 1842;
                        i10 = i5;
                        c3 = 7149;
                    case -357:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        int i14 = settranslationz4.DigitizedCardProfile;
                        i11 = (i14 == 0 || i14 != 1) ? 1153 : 1788;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                        break;
                    case -356:
                        i5 = 1837;
                        i10 = i5;
                        c3 = 7149;
                    case -355:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        int i15 = settranslationz4.DigitizedCardProfile;
                        if (i15 != 19 && i15 == 34) {
                            i11 = 1371;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                        i11 = 1395;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                        break;
                    case -354:
                        i5 = 1832;
                        i10 = i5;
                        c3 = 7149;
                    case -353:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        int i16 = settranslationz4.DigitizedCardProfile;
                        i11 = (i16 == 0 || i16 != 1) ? 1781 : 83;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                        break;
                    case -352:
                        i5 = 1827;
                        i10 = i5;
                        c3 = 7149;
                    case -351:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        int i17 = settranslationz4.DigitizedCardProfile;
                        if (i17 != 0) {
                            if (i17 != 1) {
                            }
                            i11 = 792;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                        i11 = 786;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -350:
                        i5 = 1822;
                        i10 = i5;
                        c3 = 7149;
                    case -349:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        i11 = settranslationz4.DigitizedCardProfile != 0 ? 1666 : 851;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -348:
                        i5 = 1817;
                        i10 = i5;
                        c3 = 7149;
                    case -347:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        int i18 = settranslationz4.DigitizedCardProfile;
                        if (i18 != 47 && i18 == 72) {
                            i11 = 441;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                        i11 = 447;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                        break;
                    case -346:
                        i5 = 1812;
                        i10 = i5;
                        c3 = 7149;
                    case -345:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        int i19 = settranslationz4.DigitizedCardProfile;
                        if (i19 != 0) {
                            if (i19 != 1) {
                            }
                            i11 = 811;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                        i11 = com.visa.cbp.sdk.facade.data.Constants.HOOK_DETECTED;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -344:
                        i5 = 1807;
                        i10 = i5;
                        c3 = 7149;
                    case -343:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                        int i20 = settranslationz4.DigitizedCardProfile;
                        i11 = (i20 == 51 || i20 != 55) ? 1745 : com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                        break;
                    case -342:
                        i5 = 1143;
                        i10 = i5;
                        c3 = 7149;
                    case -341:
                        i5 = 1798;
                        i10 = i5;
                        c3 = 7149;
                    case -340:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(201);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i11 = 1797;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -339:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        settranslationz4.AlternateContactlessPaymentDataJson = settranslationz4.getProfileVersion.hashCode();
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -338:
                        i5 = 1833;
                        i10 = i5;
                        c3 = 7149;
                    case -337:
                        i5 = 1835;
                        i10 = i5;
                        c3 = 7149;
                    case -336:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(201);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i11 = 1779;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -335:
                        i5 = 103;
                        i10 = i5;
                        c3 = 7149;
                    case -334:
                        i5 = 1771;
                        i10 = i5;
                        c3 = 7149;
                    case -333:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(201);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i11 = 1770;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -332:
                        i5 = com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA;
                        i10 = i5;
                        c3 = 7149;
                    case -331:
                        i5 = 1761;
                        i10 = i5;
                        c3 = 7149;
                    case -330:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(201);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i11 = 1760;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -329:
                        i5 = 1808;
                        i10 = i5;
                        c3 = 7149;
                    case -328:
                        i5 = 1810;
                        i10 = i5;
                        c3 = 7149;
                    case -327:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(201);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i11 = 1744;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -326:
                        i5 = 1563;
                        i10 = i5;
                        c3 = 7149;
                    case -325:
                        i5 = 1727;
                        i10 = i5;
                        c3 = 7149;
                    case -324:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(201);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i11 = 1726;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -323:
                        i5 = androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED;
                        i10 = i5;
                        c3 = 7149;
                    case -322:
                        i5 = 1710;
                        i10 = i5;
                        c3 = 7149;
                    case -321:
                        i2 = i;
                        try {
                            settranslationz4.AlternateContactlessPaymentDataJson(21);
                            i12 = settranslationz4.DigitizedCardProfile;
                            if (i12 == 0) {
                                i11 = 1709;
                            }
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            settranslationz2 = settranslationz4;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                            settranslationz = settranslationz2;
                            if (i11 >= 103) {
                            }
                            byte[] bArr32 = AlternateContactlessPaymentDataJson;
                            objArr = new java.lang.Object[1];
                            a(bArr32[7149], (short) (-bArr32[i12]), (short) 7577, objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            if (i11 >= 172) {
                            }
                            if (i11 >= 227) {
                            }
                            if (i11 >= 318) {
                            }
                            objArr2 = new java.lang.Object[1];
                            a(bArr32[7149], (short) (-bArr32[i12]), (short) 7577, objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i11 >= 379) {
                            }
                            if (i11 >= 469) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr32[7149], (short) (-bArr32[i12]), (short) 7577, objArr3);
                            if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            if (i11 >= 527) {
                            }
                            if (i11 >= 564) {
                            }
                            if (i11 >= 637) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr32[7149], (short) (-bArr32[i12]), (short) 7577, objArr4);
                            if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            if (i11 >= 681) {
                            }
                            if (i11 >= 726) {
                            }
                            if (i11 >= 813) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr32[7149], (short) (-bArr32[i12]), (short) 7577, objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            if (i11 >= 868) {
                            }
                            if (i11 >= 908) {
                            }
                            if (i11 >= 1039) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr32[7149], (short) (-bArr32[i12]), (short) 7577, objArr6);
                            if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i11 >= 1120) {
                            }
                            if (i11 >= 1158) {
                            }
                            objArr7 = new java.lang.Object[1];
                            a(bArr32[7149], (short) (-bArr32[i12]), (short) 7577, objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            if (i11 >= 1248) {
                            }
                            if (i11 >= 1324) {
                            }
                            objArr8 = new java.lang.Object[1];
                            a(bArr32[7149], (short) (-bArr32[i12]), (short) 7577, objArr8);
                            if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                            }
                            if (i11 >= 1417) {
                            }
                            if (i11 >= 1448) {
                            }
                            objArr9 = new java.lang.Object[1];
                            a(bArr32[7149], (short) (-bArr32[i12]), (short) 7577, objArr9);
                            if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                            }
                            if (i11 >= 1539) {
                            }
                            if (i11 >= 1582) {
                            }
                            c = 7149;
                            objArr10 = new java.lang.Object[1];
                            a(bArr32[7149], (short) (-bArr32[i12]), (short) 7577, objArr10);
                            if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                            }
                            if (i11 >= 1784) {
                            }
                        }
                        break;
                    case -320:
                        i5 = 1271;
                        i10 = i5;
                        c3 = 7149;
                    case -319:
                        i5 = 1692;
                        i10 = i5;
                        c3 = 7149;
                    case -318:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i11 = 1691;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -317:
                        i5 = 1823;
                        i10 = i5;
                        c3 = 7149;
                    case -316:
                        i5 = 1825;
                        i10 = i5;
                        c3 = 7149;
                    case -315:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(201);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i11 = 1665;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -314:
                        i2 = i;
                        try {
                            settranslationz4.AlternateContactlessPaymentDataJson = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(3);
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                        }
                        try {
                            settranslationz4.AlternateContactlessPaymentDataJson(5);
                            valueOf = settranslationz4.DigitizedCardProfile;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            th = th;
                            settranslationz3 = settranslationz4;
                            settranslationz2 = settranslationz3;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                            settranslationz = settranslationz2;
                            if (i11 >= 103) {
                            }
                            byte[] bArr322 = AlternateContactlessPaymentDataJson;
                            objArr = new java.lang.Object[1];
                            a(bArr322[7149], (short) (-bArr322[i12]), (short) 7577, objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            if (i11 >= 172) {
                            }
                            if (i11 >= 227) {
                            }
                            if (i11 >= 318) {
                            }
                            objArr2 = new java.lang.Object[1];
                            a(bArr322[7149], (short) (-bArr322[i12]), (short) 7577, objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i11 >= 379) {
                            }
                            if (i11 >= 469) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr322[7149], (short) (-bArr322[i12]), (short) 7577, objArr3);
                            if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            if (i11 >= 527) {
                            }
                            if (i11 >= 564) {
                            }
                            if (i11 >= 637) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr322[7149], (short) (-bArr322[i12]), (short) 7577, objArr4);
                            if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            if (i11 >= 681) {
                            }
                            if (i11 >= 726) {
                            }
                            if (i11 >= 813) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr322[7149], (short) (-bArr322[i12]), (short) 7577, objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            if (i11 >= 868) {
                            }
                            if (i11 >= 908) {
                            }
                            if (i11 >= 1039) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr322[7149], (short) (-bArr322[i12]), (short) 7577, objArr6);
                            if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i11 >= 1120) {
                            }
                            if (i11 >= 1158) {
                            }
                            objArr7 = new java.lang.Object[1];
                            a(bArr322[7149], (short) (-bArr322[i12]), (short) 7577, objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            if (i11 >= 1248) {
                            }
                            if (i11 >= 1324) {
                            }
                            objArr8 = new java.lang.Object[1];
                            a(bArr322[7149], (short) (-bArr322[i12]), (short) 7577, objArr8);
                            if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                            }
                            if (i11 >= 1417) {
                            }
                            if (i11 >= 1448) {
                            }
                            objArr9 = new java.lang.Object[1];
                            a(bArr322[7149], (short) (-bArr322[i12]), (short) 7577, objArr9);
                            if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                            }
                            if (i11 >= 1539) {
                            }
                            if (i11 >= 1582) {
                            }
                            c = 7149;
                            objArr10 = new java.lang.Object[1];
                            a(bArr322[7149], (short) (-bArr322[i12]), (short) 7577, objArr10);
                            if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                            }
                            if (i11 >= 1784) {
                            }
                        }
                        break;
                    case -313:
                        i2 = i;
                        i6 = writeReplace;
                        settranslationz4.AlternateContactlessPaymentDataJson = i6;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -312:
                        i10 = 629;
                        c3 = 7149;
                    case -311:
                        i10 = 1652;
                        c3 = 7149;
                    case -310:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1651;
                            i = i2;
                            c3 = 7149;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -309:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        writeReplace = settranslationz4.DigitizedCardProfile;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -308:
                        i2 = i;
                        i6 = valueOf;
                        settranslationz4.AlternateContactlessPaymentDataJson = i6;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -307:
                        i2 = i;
                        i11 = 811;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -306:
                        i10 = 1;
                        c3 = 7149;
                    case -305:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
                        settranslationz4 = settranslationz4.DigitizedCardProfile;
                        return settranslationz4 != 0;
                    case -304:
                        i2 = i;
                        try {
                            byte[] bArr4 = $$d;
                            try {
                            } catch (java.lang.Throwable th9) {
                                th2 = th9;
                                th = th2;
                                settranslationz3 = settranslationz4;
                                settranslationz2 = settranslationz3;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                settranslationz = settranslationz2;
                                if (i11 >= 103 || i11 > 143) {
                                    byte[] bArr3222 = AlternateContactlessPaymentDataJson;
                                    objArr = new java.lang.Object[1];
                                    a(bArr3222[7149], (short) (-bArr3222[i12]), (short) 7577, objArr);
                                    if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th) || i11 < 145 || i11 > 156) {
                                        if (i11 >= 172 || i11 > 182) {
                                            if (i11 >= 227 || i11 > 258) {
                                                if (i11 >= 318 || i11 > 357) {
                                                    objArr2 = new java.lang.Object[1];
                                                    a(bArr3222[7149], (short) (-bArr3222[i12]), (short) 7577, objArr2);
                                                    if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th) && i11 >= 364 && i11 <= 375) {
                                                        i4 = 377;
                                                    } else if (i11 >= 379 || i11 > 389) {
                                                        if (i11 >= 469 || i11 > 505) {
                                                            objArr3 = new java.lang.Object[1];
                                                            a(bArr3222[7149], (short) (-bArr3222[i12]), (short) 7577, objArr3);
                                                            if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th) && i11 >= 512 && i11 <= 522) {
                                                                i4 = 524;
                                                            } else if (i11 >= 527 || i11 > 539) {
                                                                if (i11 >= 564 || i11 > 594) {
                                                                    if (i11 >= 637 || i11 > 664) {
                                                                        objArr4 = new java.lang.Object[1];
                                                                        a(bArr3222[7149], (short) (-bArr3222[i12]), (short) 7577, objArr4);
                                                                        if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th) && i11 >= 666 && i11 <= 677) {
                                                                            i4 = 679;
                                                                        } else if (i11 >= 681 || i11 > 693) {
                                                                            if (i11 >= 726 || i11 > 753) {
                                                                                if (i11 >= 813 || i11 > 847) {
                                                                                    objArr5 = new java.lang.Object[1];
                                                                                    a(bArr3222[7149], (short) (-bArr3222[i12]), (short) 7577, objArr5);
                                                                                    if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th) && i11 >= 853 && i11 <= 864) {
                                                                                        i4 = 866;
                                                                                    } else if (i11 >= 868 || i11 > 879) {
                                                                                        if (i11 >= 908 || i11 > 945) {
                                                                                            if (i11 >= 1039 || i11 > 1086) {
                                                                                                objArr6 = new java.lang.Object[1];
                                                                                                a(bArr3222[7149], (short) (-bArr3222[i12]), (short) 7577, objArr6);
                                                                                                if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th) && i11 >= 1103 && i11 <= 1115) {
                                                                                                    i4 = 1117;
                                                                                                } else if (i11 >= 1120 || i11 > 1130) {
                                                                                                    if (i11 >= 1158 || i11 > 1187) {
                                                                                                        objArr7 = new java.lang.Object[1];
                                                                                                        a(bArr3222[7149], (short) (-bArr3222[i12]), (short) 7577, objArr7);
                                                                                                        if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th) && i11 >= 1232 && i11 <= 1243) {
                                                                                                            i4 = 1245;
                                                                                                        } else if (i11 >= 1248 || i11 > 1259) {
                                                                                                            if (i11 >= 1324 || i11 > 1355) {
                                                                                                                objArr8 = new java.lang.Object[1];
                                                                                                                a(bArr3222[7149], (short) (-bArr3222[i12]), (short) 7577, objArr8);
                                                                                                                if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th) && i11 >= 1400 && i11 <= 1412) {
                                                                                                                    i4 = 1414;
                                                                                                                } else if (i11 >= 1417 || i11 > 1427) {
                                                                                                                    if (i11 >= 1448 || i11 > 1477) {
                                                                                                                        objArr9 = new java.lang.Object[1];
                                                                                                                        a(bArr3222[7149], (short) (-bArr3222[i12]), (short) 7577, objArr9);
                                                                                                                        if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th) && i11 >= 1522 && i11 <= 1534) {
                                                                                                                            i4 = 1536;
                                                                                                                        } else if (i11 >= 1539 || i11 > 1549) {
                                                                                                                            if (i11 >= 1582 || i11 > 1613) {
                                                                                                                                c = 7149;
                                                                                                                                objArr10 = new java.lang.Object[1];
                                                                                                                                a(bArr3222[7149], (short) (-bArr3222[i12]), (short) 7577, objArr10);
                                                                                                                                if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th) && i11 >= 1668 && i11 <= 1680) {
                                                                                                                                    i4 = 866;
                                                                                                                                } else {
                                                                                                                                    if (i11 >= 1784) {
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                    if (i11 > 1788) {
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                    i4 = 1780;
                                                                                                                                }
                                                                                                                                settranslationz.IccPrivateKeyCrtComponentsJson = th;
                                                                                                                                settranslationz.AlternateContactlessPaymentDataJson(225);
                                                                                                                                i11 = i4;
                                                                                                                                settranslationz4 = settranslationz;
                                                                                                                                c3 = c;
                                                                                                                                i10 = i11;
                                                                                                                                i = i2;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i4 = i3;
                                        }
                                        i4 = 161;
                                    } else {
                                        i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                                    }
                                    c = 7149;
                                    settranslationz.IccPrivateKeyCrtComponentsJson = th;
                                    settranslationz.AlternateContactlessPaymentDataJson(225);
                                    i11 = i4;
                                    settranslationz4 = settranslationz;
                                    c3 = c;
                                    i10 = i11;
                                    i = i2;
                                }
                                i4 = 92;
                                c = 7149;
                                settranslationz.IccPrivateKeyCrtComponentsJson = th;
                                settranslationz.AlternateContactlessPaymentDataJson(225);
                                i11 = i4;
                                settranslationz4 = settranslationz;
                                c3 = c;
                                i10 = i11;
                                i = i2;
                            }
                            try {
                                i7 = 1;
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                e(bArr4[330], bArr4[17], bArr4[16], objArr24);
                                settranslationz4.IccPrivateKeyCrtComponentsJson = (java.lang.String) objArr24[0];
                                settranslationz4.AlternateContactlessPaymentDataJson(i7);
                                i10 = i11;
                                i = i2;
                                c3 = 7149;
                            } catch (java.lang.Throwable th10) {
                                th2 = th10;
                                th = th2;
                                settranslationz3 = settranslationz4;
                                settranslationz2 = settranslationz3;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                settranslationz = settranslationz2;
                                if (i11 >= 103) {
                                }
                                byte[] bArr32222 = AlternateContactlessPaymentDataJson;
                                objArr = new java.lang.Object[1];
                                a(bArr32222[7149], (short) (-bArr32222[i12]), (short) 7577, objArr);
                                if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                                }
                                if (i11 >= 172) {
                                }
                                if (i11 >= 227) {
                                }
                                if (i11 >= 318) {
                                }
                                objArr2 = new java.lang.Object[1];
                                a(bArr32222[7149], (short) (-bArr32222[i12]), (short) 7577, objArr2);
                                if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                }
                                if (i11 >= 379) {
                                }
                                if (i11 >= 469) {
                                }
                                objArr3 = new java.lang.Object[1];
                                a(bArr32222[7149], (short) (-bArr32222[i12]), (short) 7577, objArr3);
                                if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                                }
                                if (i11 >= 527) {
                                }
                                if (i11 >= 564) {
                                }
                                if (i11 >= 637) {
                                }
                                objArr4 = new java.lang.Object[1];
                                a(bArr32222[7149], (short) (-bArr32222[i12]), (short) 7577, objArr4);
                                if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                                }
                                if (i11 >= 681) {
                                }
                                if (i11 >= 726) {
                                }
                                if (i11 >= 813) {
                                }
                                objArr5 = new java.lang.Object[1];
                                a(bArr32222[7149], (short) (-bArr32222[i12]), (short) 7577, objArr5);
                                if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                                }
                                if (i11 >= 868) {
                                }
                                if (i11 >= 908) {
                                }
                                if (i11 >= 1039) {
                                }
                                objArr6 = new java.lang.Object[1];
                                a(bArr32222[7149], (short) (-bArr32222[i12]), (short) 7577, objArr6);
                                if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                                }
                                if (i11 >= 1120) {
                                }
                                if (i11 >= 1158) {
                                }
                                objArr7 = new java.lang.Object[1];
                                a(bArr32222[7149], (short) (-bArr32222[i12]), (short) 7577, objArr7);
                                if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                                }
                                if (i11 >= 1248) {
                                }
                                if (i11 >= 1324) {
                                }
                                objArr8 = new java.lang.Object[1];
                                a(bArr32222[7149], (short) (-bArr32222[i12]), (short) 7577, objArr8);
                                if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                                }
                                if (i11 >= 1417) {
                                }
                                if (i11 >= 1448) {
                                }
                                objArr9 = new java.lang.Object[1];
                                a(bArr32222[7149], (short) (-bArr32222[i12]), (short) 7577, objArr9);
                                if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                                }
                                if (i11 >= 1539) {
                                }
                                if (i11 >= 1582) {
                                }
                                c = 7149;
                                objArr10 = new java.lang.Object[1];
                                a(bArr32222[7149], (short) (-bArr32222[i12]), (short) 7577, objArr10);
                                if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                                }
                                if (i11 >= 1784) {
                                }
                            }
                        } catch (java.lang.Throwable th11) {
                            th2 = th11;
                        }
                    case -303:
                        i2 = i;
                        byte[] bArr5 = $$d;
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        e(bArr5[16], bArr5[39], bArr5[365], objArr25);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = (java.lang.String) objArr25[0];
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -302:
                        i2 = i;
                        settranslationz4.valueOf = 318728235L;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -301:
                        i2 = i;
                        settranslationz4.valueOf = 1368927337046867968L;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -300:
                        i10 = 1623;
                        c3 = 7149;
                    case -299:
                        i10 = 1571;
                        c3 = 7149;
                    case -298:
                        i10 = 1717;
                        c3 = 7149;
                    case -297:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(67);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1562;
                            i = i2;
                            c3 = 7149;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -296:
                        i10 = 1539;
                        c3 = 7149;
                    case -295:
                        i2 = i;
                        try {
                            settranslationz4.AlternateContactlessPaymentDataJson = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(3);
                            settranslationz4.AlternateContactlessPaymentDataJson(57);
                            valueOf2 = java.lang.Long.valueOf(settranslationz4.writeReplace);
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 922 - android.view.View.getDefaultSize(0, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            d((byte) (-$$a[44]), r8[111], (byte) ($$b >>> 1), objArr26);
                            field = cls7.getField((java.lang.String) objArr26[0]);
                            obj2 = null;
                            try {
                                field.set(obj2, valueOf2);
                                i10 = i11;
                                i = i2;
                                c3 = 7149;
                            } catch (java.lang.Throwable th12) {
                                th = th12;
                                th = th;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                settranslationz = settranslationz4;
                                if (i11 >= 103) {
                                }
                                byte[] bArr322222 = AlternateContactlessPaymentDataJson;
                                objArr = new java.lang.Object[1];
                                a(bArr322222[7149], (short) (-bArr322222[i12]), (short) 7577, objArr);
                                if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                                }
                                if (i11 >= 172) {
                                }
                                if (i11 >= 227) {
                                }
                                if (i11 >= 318) {
                                }
                                objArr2 = new java.lang.Object[1];
                                a(bArr322222[7149], (short) (-bArr322222[i12]), (short) 7577, objArr2);
                                if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                }
                                if (i11 >= 379) {
                                }
                                if (i11 >= 469) {
                                }
                                objArr3 = new java.lang.Object[1];
                                a(bArr322222[7149], (short) (-bArr322222[i12]), (short) 7577, objArr3);
                                if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                                }
                                if (i11 >= 527) {
                                }
                                if (i11 >= 564) {
                                }
                                if (i11 >= 637) {
                                }
                                objArr4 = new java.lang.Object[1];
                                a(bArr322222[7149], (short) (-bArr322222[i12]), (short) 7577, objArr4);
                                if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                                }
                                if (i11 >= 681) {
                                }
                                if (i11 >= 726) {
                                }
                                if (i11 >= 813) {
                                }
                                objArr5 = new java.lang.Object[1];
                                a(bArr322222[7149], (short) (-bArr322222[i12]), (short) 7577, objArr5);
                                if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                                }
                                if (i11 >= 868) {
                                }
                                if (i11 >= 908) {
                                }
                                if (i11 >= 1039) {
                                }
                                objArr6 = new java.lang.Object[1];
                                a(bArr322222[7149], (short) (-bArr322222[i12]), (short) 7577, objArr6);
                                if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                                }
                                if (i11 >= 1120) {
                                }
                                if (i11 >= 1158) {
                                }
                                objArr7 = new java.lang.Object[1];
                                a(bArr322222[7149], (short) (-bArr322222[i12]), (short) 7577, objArr7);
                                if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                                }
                                if (i11 >= 1248) {
                                }
                                if (i11 >= 1324) {
                                }
                                objArr8 = new java.lang.Object[1];
                                a(bArr322222[7149], (short) (-bArr322222[i12]), (short) 7577, objArr8);
                                if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                                }
                                if (i11 >= 1417) {
                                }
                                if (i11 >= 1448) {
                                }
                                objArr9 = new java.lang.Object[1];
                                a(bArr322222[7149], (short) (-bArr322222[i12]), (short) 7577, objArr9);
                                if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                                }
                                if (i11 >= 1539) {
                                }
                                if (i11 >= 1582) {
                                }
                                c = 7149;
                                objArr10 = new java.lang.Object[1];
                                a(bArr322222[7149], (short) (-bArr322222[i12]), (short) 7577, objArr10);
                                if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                                }
                                if (i11 >= 1784) {
                                }
                            }
                        } catch (java.lang.Throwable th13) {
                            th = th13;
                            th = th;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                            settranslationz = settranslationz4;
                            if (i11 >= 103) {
                            }
                            byte[] bArr3222222 = AlternateContactlessPaymentDataJson;
                            objArr = new java.lang.Object[1];
                            a(bArr3222222[7149], (short) (-bArr3222222[i12]), (short) 7577, objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            if (i11 >= 172) {
                            }
                            if (i11 >= 227) {
                            }
                            if (i11 >= 318) {
                            }
                            objArr2 = new java.lang.Object[1];
                            a(bArr3222222[7149], (short) (-bArr3222222[i12]), (short) 7577, objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i11 >= 379) {
                            }
                            if (i11 >= 469) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr3222222[7149], (short) (-bArr3222222[i12]), (short) 7577, objArr3);
                            if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            if (i11 >= 527) {
                            }
                            if (i11 >= 564) {
                            }
                            if (i11 >= 637) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr3222222[7149], (short) (-bArr3222222[i12]), (short) 7577, objArr4);
                            if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            if (i11 >= 681) {
                            }
                            if (i11 >= 726) {
                            }
                            if (i11 >= 813) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr3222222[7149], (short) (-bArr3222222[i12]), (short) 7577, objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            if (i11 >= 868) {
                            }
                            if (i11 >= 908) {
                            }
                            if (i11 >= 1039) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr3222222[7149], (short) (-bArr3222222[i12]), (short) 7577, objArr6);
                            if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i11 >= 1120) {
                            }
                            if (i11 >= 1158) {
                            }
                            objArr7 = new java.lang.Object[1];
                            a(bArr3222222[7149], (short) (-bArr3222222[i12]), (short) 7577, objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            if (i11 >= 1248) {
                            }
                            if (i11 >= 1324) {
                            }
                            objArr8 = new java.lang.Object[1];
                            a(bArr3222222[7149], (short) (-bArr3222222[i12]), (short) 7577, objArr8);
                            if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                            }
                            if (i11 >= 1417) {
                            }
                            if (i11 >= 1448) {
                            }
                            objArr9 = new java.lang.Object[1];
                            a(bArr3222222[7149], (short) (-bArr3222222[i12]), (short) 7577, objArr9);
                            if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                            }
                            if (i11 >= 1539) {
                            }
                            if (i11 >= 1582) {
                            }
                            c = 7149;
                            objArr10 = new java.lang.Object[1];
                            a(bArr3222222[7149], (short) (-bArr3222222[i12]), (short) 7577, objArr10);
                            if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                            }
                            if (i11 >= 1784) {
                            }
                        }
                        break;
                    case -294:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        obj = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, 922 - android.view.View.resolveSize(0, 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        d(110, (byte) (-$$a[57]), r8[58], objArr27);
                        str = (java.lang.String) objArr27[0];
                        cls.getField(str).set(null, obj);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -293:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = com.payair.hce.getContentResolver.AlternateContactlessPaymentDataJson$466995e3(settranslationz4.getProfileVersion);
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -292:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1647138923);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 48, android.text.TextUtils.indexOf("", "", 0) + 873, (char) (15955 - (android.view.ViewConfiguration.getTouchSlop() >> 8)))).getDeclaredConstructor(java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1647138923, obj3);
                            }
                            newInstance = ((java.lang.reflect.Constructor) obj3).newInstance(objArr28);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th14) {
                            java.lang.Throwable cause = th14.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th14;
                        }
                    case -291:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1366224379;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -290:
                        i10 = 1549;
                        c3 = 7149;
                    case -289:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr29 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i21 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr30 = {objArr29, java.lang.Integer.valueOf(i21), java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1624038517);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(']' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4860, (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1624038517, obj4);
                            }
                            newInstance = ((java.lang.reflect.Method) obj4).invoke(null, objArr30);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th15) {
                            java.lang.Throwable cause2 = th15.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th15;
                        }
                    case -288:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = -1884061761;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -287:
                        i2 = i;
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44, 923 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        d(110, (byte) (-$$a[57]), r6[58], objArr31);
                        newInstance = cls8.getField((java.lang.String) objArr31[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -286:
                        i2 = i;
                        i11 = 1516;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -285:
                        i10 = 1510;
                        c3 = 7149;
                    case -284:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(27);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1509;
                            i = i2;
                            c3 = 7149;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -283:
                        i2 = i;
                        settranslationz4.valueOf = 2028L;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -282:
                        i10 = 1848;
                        c3 = 7149;
                    case -281:
                        i10 = 1850;
                        c3 = 7149;
                    case -280:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1491;
                            i = i2;
                            c3 = 7149;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -279:
                        i2 = i;
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 44, 922 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        d((byte) (-$$a[44]), r6[111], (byte) ($$b >>> 1), objArr32);
                        j = cls9.getField((java.lang.String) objArr32[0]).getLong(null);
                        settranslationz4.valueOf = j;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -278:
                        i2 = i;
                        byte b5 = $$d[439];
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        e(467, b5, (byte) (b5 | com.google.common.base.Ascii.DC4), objArr33);
                        newInstance = (java.lang.String) objArr33[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -277:
                        i2 = i;
                        byte[] bArr6 = $$d;
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        e((short) (-bArr6[34]), (byte) (-bArr6[61]), bArr6[365], objArr34);
                        newInstance = (java.lang.String) objArr34[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -276:
                        i2 = i;
                        settranslationz4.valueOf = -1942554359L;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -275:
                        i2 = i;
                        settranslationz4.valueOf = -8343216238700265472L;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -274:
                        i10 = 1484;
                        c3 = 7149;
                    case -273:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj5 = settranslationz4.getProfileVersion;
                        try {
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                            if (obj6 == null) {
                                obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 4750, (char) (33702 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getMethod("valueOf", null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj6);
                            }
                            intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(obj5, null)).intValue();
                            settranslationz4.AlternateContactlessPaymentDataJson = intValue;
                            settranslationz4.AlternateContactlessPaymentDataJson(14);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th16) {
                            java.lang.Throwable cause3 = th16.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th16;
                        }
                    case -272:
                        i10 = 1443;
                        c3 = 7149;
                    case -271:
                        i10 = 1437;
                        c3 = 7149;
                    case -270:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(67);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1436;
                            i = i2;
                            c3 = 7149;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -269:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj7 = settranslationz4.getProfileVersion;
                        try {
                            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                            if (obj8 == null) {
                                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 40, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4751, (char) (33701 - android.text.TextUtils.indexOf("", "")))).getMethod("DigitizedCardProfile", null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj8);
                            }
                            intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(obj7, null)).intValue();
                            settranslationz4.AlternateContactlessPaymentDataJson = intValue;
                            settranslationz4.AlternateContactlessPaymentDataJson(14);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th17) {
                            java.lang.Throwable cause4 = th17.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th17;
                        }
                    case -268:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj9 = settranslationz4.getProfileVersion;
                        try {
                            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                            if (obj10 == null) {
                                obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 40, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4750, (char) (33701 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)))).getMethod("values", null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj10);
                            }
                            intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(obj9, null)).intValue();
                            settranslationz4.AlternateContactlessPaymentDataJson = intValue;
                            settranslationz4.AlternateContactlessPaymentDataJson(14);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th18) {
                            java.lang.Throwable cause5 = th18.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                            throw th18;
                        }
                    case -267:
                        i10 = 1417;
                        c3 = 7149;
                    case -266:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(57);
                        valueOf2 = java.lang.Long.valueOf(settranslationz4.writeReplace);
                        cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 754 - android.text.TextUtils.getOffsetAfter("", 0), (char) (45561 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                        byte[] bArr7 = $$a;
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        d(bArr7[14], bArr7[0], 54, objArr35);
                        str2 = (java.lang.String) objArr35[0];
                        field = cls2.getField(str2);
                        obj2 = null;
                        field.set(obj2, valueOf2);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -265:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        obj = settranslationz4.getProfileVersion;
                        cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 753 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (45559 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        byte[] bArr8 = $$a;
                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                        d(58, bArr8[2], bArr8[45], objArr36);
                        str = (java.lang.String) objArr36[0];
                        cls.getField(str).set(null, obj);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -264:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 2;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i22 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i22), java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
                            if (obj11 == null) {
                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.getTrimmedLength("") + 754, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 45561));
                                byte[] bArr9 = $$a;
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                d(58, bArr9[2], bArr9[45], objArr38);
                                obj11 = cls10.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj11);
                            }
                            newInstance = ((java.lang.reflect.Method) obj11).invoke(null, objArr37);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th19) {
                            java.lang.Throwable cause6 = th19.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th19;
                        }
                    case -263:
                        i10 = 1427;
                        c3 = 7149;
                    case -262:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj12 = settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i23 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr39 = {obj12, java.lang.Integer.valueOf(i23), java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                            if (obj13 == null) {
                                obj13 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4789, (char) (31153 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.KeyEvent.getDeadChar(0, 0) + 4750, (char) (33701 - android.view.View.combineMeasuredStates(0, 0))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj13);
                            }
                            newInstance = ((java.lang.reflect.Method) obj13).invoke(null, objArr39);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th20) {
                            java.lang.Throwable cause7 = th20.getCause();
                            if (cause7 != null) {
                                throw cause7;
                            }
                            throw th20;
                        }
                    case -261:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson = -938178760;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -260:
                        i2 = i;
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 754 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (45560 - android.view.View.getDefaultSize(0, 0)));
                        byte[] bArr10 = $$a;
                        java.lang.Object[] objArr40 = new java.lang.Object[1];
                        d(58, bArr10[2], bArr10[45], objArr40);
                        newInstance = cls11.getField((java.lang.String) objArr40[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -259:
                        i2 = i;
                        i11 = 1395;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -258:
                        i10 = 1389;
                        c3 = 7149;
                    case -257:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(27);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1388;
                            i = i2;
                            c3 = 7149;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -256:
                        i2 = i;
                        settranslationz4.valueOf = 1929L;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -255:
                        i10 = 1838;
                        c3 = 7149;
                    case -254:
                        i10 = 1840;
                        c3 = 7149;
                    case -253:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1370;
                            i = i2;
                            c3 = 7149;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -252:
                        i2 = i;
                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47, 754 - android.text.TextUtils.indexOf("", ""), (char) (45560 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                        byte[] bArr11 = $$a;
                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                        d(bArr11[14], bArr11[0], 54, objArr41);
                        j = cls12.getField((java.lang.String) objArr41[0]).getLong(null);
                        settranslationz4.valueOf = j;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -251:
                        i2 = i;
                        byte[] bArr12 = $$d;
                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                        e(bArr12[330], bArr12[17], bArr12[16], objArr42);
                        newInstance = (java.lang.String) objArr42[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -250:
                        i2 = i;
                        byte[] bArr13 = $$d;
                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                        e((short) (bArr13[183] - 1), (byte) (-bArr13[34]), bArr13[365], objArr43);
                        newInstance = (java.lang.String) objArr43[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -249:
                        i2 = i;
                        settranslationz4.valueOf = 1436756314L;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -248:
                        i2 = i;
                        settranslationz4.valueOf = 6170821385246474240L;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -247:
                        i10 = 1363;
                        c3 = 7149;
                    case -246:
                        i10 = 1279;
                        c3 = 7149;
                    case -245:
                        i10 = 1682;
                        c3 = 7149;
                    case -244:
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(67);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1270;
                            i = i2;
                            c3 = 7149;
                        }
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -243:
                        i10 = 1248;
                        c3 = 7149;
                    case -242:
                        try {
                            settranslationz4.AlternateContactlessPaymentDataJson = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(3);
                            settranslationz4.AlternateContactlessPaymentDataJson(57);
                            valueOf2 = java.lang.Long.valueOf(settranslationz4.writeReplace);
                            cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.getCapsMode("", 0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) (34283 - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                            i2 = 23;
                            try {
                                byte b6 = $$a[23];
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                d(b6, (byte) (b6 + 2), r8[58], objArr44);
                                str2 = (java.lang.String) objArr44[0];
                                field = cls2.getField(str2);
                                obj2 = null;
                                field.set(obj2, valueOf2);
                                i10 = i11;
                                i = i2;
                                c3 = 7149;
                            } catch (java.lang.Throwable th21) {
                                th3 = th21;
                                th = th3;
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                                settranslationz = settranslationz4;
                                if (i11 >= 103) {
                                }
                                byte[] bArr32222222 = AlternateContactlessPaymentDataJson;
                                objArr = new java.lang.Object[1];
                                a(bArr32222222[7149], (short) (-bArr32222222[i12]), (short) 7577, objArr);
                                if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                                }
                                if (i11 >= 172) {
                                }
                                if (i11 >= 227) {
                                }
                                if (i11 >= 318) {
                                }
                                objArr2 = new java.lang.Object[1];
                                a(bArr32222222[7149], (short) (-bArr32222222[i12]), (short) 7577, objArr2);
                                if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                }
                                if (i11 >= 379) {
                                }
                                if (i11 >= 469) {
                                }
                                objArr3 = new java.lang.Object[1];
                                a(bArr32222222[7149], (short) (-bArr32222222[i12]), (short) 7577, objArr3);
                                if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                                }
                                if (i11 >= 527) {
                                }
                                if (i11 >= 564) {
                                }
                                if (i11 >= 637) {
                                }
                                objArr4 = new java.lang.Object[1];
                                a(bArr32222222[7149], (short) (-bArr32222222[i12]), (short) 7577, objArr4);
                                if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                                }
                                if (i11 >= 681) {
                                }
                                if (i11 >= 726) {
                                }
                                if (i11 >= 813) {
                                }
                                objArr5 = new java.lang.Object[1];
                                a(bArr32222222[7149], (short) (-bArr32222222[i12]), (short) 7577, objArr5);
                                if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                                }
                                if (i11 >= 868) {
                                }
                                if (i11 >= 908) {
                                }
                                if (i11 >= 1039) {
                                }
                                objArr6 = new java.lang.Object[1];
                                a(bArr32222222[7149], (short) (-bArr32222222[i12]), (short) 7577, objArr6);
                                if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                                }
                                if (i11 >= 1120) {
                                }
                                if (i11 >= 1158) {
                                }
                                objArr7 = new java.lang.Object[1];
                                a(bArr32222222[7149], (short) (-bArr32222222[i12]), (short) 7577, objArr7);
                                if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                                }
                                if (i11 >= 1248) {
                                }
                                if (i11 >= 1324) {
                                }
                                objArr8 = new java.lang.Object[1];
                                a(bArr32222222[7149], (short) (-bArr32222222[i12]), (short) 7577, objArr8);
                                if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                                }
                                if (i11 >= 1417) {
                                }
                                if (i11 >= 1448) {
                                }
                                objArr9 = new java.lang.Object[1];
                                a(bArr32222222[7149], (short) (-bArr32222222[i12]), (short) 7577, objArr9);
                                if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                                }
                                if (i11 >= 1539) {
                                }
                                if (i11 >= 1582) {
                                }
                                c = 7149;
                                objArr10 = new java.lang.Object[1];
                                a(bArr32222222[7149], (short) (-bArr32222222[i12]), (short) 7577, objArr10);
                                if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                                }
                                if (i11 >= 1784) {
                                }
                            }
                        } catch (java.lang.Throwable th22) {
                            th3 = th22;
                            i2 = 23;
                            th = th3;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                            settranslationz = settranslationz4;
                            if (i11 >= 103) {
                            }
                            byte[] bArr322222222 = AlternateContactlessPaymentDataJson;
                            objArr = new java.lang.Object[1];
                            a(bArr322222222[7149], (short) (-bArr322222222[i12]), (short) 7577, objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            if (i11 >= 172) {
                            }
                            if (i11 >= 227) {
                            }
                            if (i11 >= 318) {
                            }
                            objArr2 = new java.lang.Object[1];
                            a(bArr322222222[7149], (short) (-bArr322222222[i12]), (short) 7577, objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i11 >= 379) {
                            }
                            if (i11 >= 469) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr322222222[7149], (short) (-bArr322222222[i12]), (short) 7577, objArr3);
                            if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            if (i11 >= 527) {
                            }
                            if (i11 >= 564) {
                            }
                            if (i11 >= 637) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr322222222[7149], (short) (-bArr322222222[i12]), (short) 7577, objArr4);
                            if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            if (i11 >= 681) {
                            }
                            if (i11 >= 726) {
                            }
                            if (i11 >= 813) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr322222222[7149], (short) (-bArr322222222[i12]), (short) 7577, objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            if (i11 >= 868) {
                            }
                            if (i11 >= 908) {
                            }
                            if (i11 >= 1039) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr322222222[7149], (short) (-bArr322222222[i12]), (short) 7577, objArr6);
                            if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i11 >= 1120) {
                            }
                            if (i11 >= 1158) {
                            }
                            objArr7 = new java.lang.Object[1];
                            a(bArr322222222[7149], (short) (-bArr322222222[i12]), (short) 7577, objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            if (i11 >= 1248) {
                            }
                            if (i11 >= 1324) {
                            }
                            objArr8 = new java.lang.Object[1];
                            a(bArr322222222[7149], (short) (-bArr322222222[i12]), (short) 7577, objArr8);
                            if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                            }
                            if (i11 >= 1417) {
                            }
                            if (i11 >= 1448) {
                            }
                            objArr9 = new java.lang.Object[1];
                            a(bArr322222222[7149], (short) (-bArr322222222[i12]), (short) 7577, objArr9);
                            if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                            }
                            if (i11 >= 1539) {
                            }
                            if (i11 >= 1582) {
                            }
                            c = 7149;
                            objArr10 = new java.lang.Object[1];
                            a(bArr322222222[7149], (short) (-bArr322222222[i12]), (short) 7577, objArr10);
                            if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                            }
                            if (i11 >= 1784) {
                            }
                        }
                        break;
                    case -241:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr45 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 34284));
                        byte[] bArr14 = $$a;
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        d(58, bArr14[2], bArr14[45], objArr46);
                        cls13.getField((java.lang.String) objArr46[0]).set(null, objArr45);
                        i2 = 23;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -240:
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i24 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i25 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr47 = {java.lang.Integer.valueOf(i24), java.lang.Integer.valueOf(i25), java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1346294939);
                            if (obj14 == null) {
                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.View.getDefaultSize(0, 0), 707 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 34284));
                                byte b7 = $$a[23];
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                d(b7, (byte) (b7 + 2), r6[58], objArr48);
                                obj14 = cls14.getMethod((java.lang.String) objArr48[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1346294939, obj14);
                            }
                            invoke = ((java.lang.reflect.Method) obj14).invoke(null, objArr47);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th23) {
                            java.lang.Throwable cause8 = th23.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th23;
                        }
                    case -239:
                        i10 = 1259;
                        c3 = 7149;
                        i = 23;
                    case -238:
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr49 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i26 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr50 = {objArr49, java.lang.Integer.valueOf(i26), java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1767443161);
                            if (obj15 == null) {
                                obj15 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33, 4717 - android.text.TextUtils.getOffsetAfter("", 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1767443161, obj15);
                            }
                            invoke = ((java.lang.reflect.Method) obj15).invoke(null, objArr50);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th24) {
                            java.lang.Throwable cause9 = th24.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th24;
                        }
                    case -237:
                        settranslationz4.AlternateContactlessPaymentDataJson = 554599015;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -236:
                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.os.Process.myTid() >> 22), 707 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 34284));
                        byte[] bArr15 = $$a;
                        java.lang.Object[] objArr51 = new java.lang.Object[1];
                        d(58, bArr15[2], bArr15[45], objArr51);
                        invoke = cls15.getField((java.lang.String) objArr51[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -235:
                        i10 = 1220;
                        c3 = 7149;
                        i = 23;
                    case -234:
                        settranslationz4.AlternateContactlessPaymentDataJson(27);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1219;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -233:
                        settranslationz4.valueOf = 1946L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -232:
                        i10 = 1226;
                        c3 = 7149;
                        i = 23;
                    case -231:
                        i10 = 1203;
                        c3 = 7149;
                        i = 23;
                    case -230:
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1202;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -229:
                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777169) - android.graphics.Color.rgb(0, 0, 0), 707 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (34284 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                        byte b8 = $$a[23];
                        java.lang.Object[] objArr52 = new java.lang.Object[1];
                        d(b8, (byte) (b8 + 2), r6[58], objArr52);
                        j2 = cls16.getField((java.lang.String) objArr52[0]).getLong(null);
                        settranslationz4.valueOf = j2;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -228:
                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                        e(393, 62, $$d[28], objArr53);
                        invoke = (java.lang.String) objArr53[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -227:
                        byte[] bArr16 = $$d;
                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                        e(136, bArr16[32], bArr16[365], objArr54);
                        invoke = (java.lang.String) objArr54[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -226:
                        settranslationz4.valueOf = -84968179L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -225:
                        settranslationz4.valueOf = -364935275127767040L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -224:
                        i10 = 1196;
                        c3 = 7149;
                        i = 23;
                    case -223:
                        i10 = 1843;
                        c3 = 7149;
                        i = 23;
                    case -222:
                        i10 = 1845;
                        c3 = 7149;
                        i = 23;
                    case -221:
                        settranslationz4.AlternateContactlessPaymentDataJson(67);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1142;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -220:
                        i10 = 1120;
                        c3 = 7149;
                        i = 23;
                    case -219:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(57);
                        valueOf2 = java.lang.Long.valueOf(settranslationz4.writeReplace);
                        cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 428, (char) (31610 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                        d((byte) (-$$a[44]), r8[111], (byte) ($$b >>> 1), objArr55);
                        str3 = (java.lang.String) objArr55[0];
                        field = cls3.getField(str3);
                        obj2 = null;
                        i2 = 23;
                        field.set(obj2, valueOf2);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -218:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr56 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 429, (char) (31609 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                        d(110, (byte) (-$$a[57]), r8[58], objArr57);
                        cls17.getField((java.lang.String) objArr57[0]).set(null, objArr56);
                        i2 = 23;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -217:
                        i10 = 1101;
                        c3 = 7149;
                        i = 23;
                    case -216:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 1100;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -215:
                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                        a(r2[7345], (short) (-AlternateContactlessPaymentDataJson[27]), (short) 7559, objArr58);
                        invoke = java.lang.Class.forName((java.lang.String) objArr58[0]);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -214:
                        byte[] bArr17 = $$d;
                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                        e(319, bArr17[299], bArr17[330], objArr59);
                        invoke = (java.lang.String) objArr59[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -213:
                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                        e(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, (byte) (-$$d[34]), r2[365], objArr60);
                        invoke = (java.lang.String) objArr60[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -212:
                        try {
                            byte b9 = (byte) (getAid & 127);
                            byte[] bArr18 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                            a(b9, (short) (-bArr18[7079]), (short) 7525, objArr61);
                            java.lang.Class<?> cls18 = java.lang.Class.forName((java.lang.String) objArr61[0]);
                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                            a((byte) (-bArr18[17]), bArr18[7021], (short) 7548, objArr62);
                            settranslationz4.values = ((java.lang.Float) cls18.getMethod((java.lang.String) objArr62[0], null).invoke(null, null)).floatValue();
                            settranslationz4.AlternateContactlessPaymentDataJson(156);
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th25) {
                            java.lang.Throwable cause10 = th25.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th25;
                        }
                    case -211:
                        invoke = "茞荽븞䟣໊\udd06ﴽの搄庉퐗র䴨瘲콋暚㘀ᅪꞣ羲῟⡌黉咞ï쎹禢감\ue9d8\uda9d偶蕿턳\uf5cc䭓\ue245멭贤≻ﯾꍄꑊᴃ탱蒸뼡\uf5d9⦋淂囹\uecb3ĩ囇熅쟚ḏ㸧ࣸ빦睓✝⏕餺䲼ࡾ㬌瀑ꖂ";
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -210:
                        try {
                            byte b10 = (byte) (getAid & 127);
                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                            a(b10, b10, (short) 7493, objArr63);
                            java.lang.Class<?> cls19 = java.lang.Class.forName((java.lang.String) objArr63[0]);
                            byte[] bArr19 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                            a(bArr19[8], bArr19[7021], (short) 7514, objArr64);
                            j2 = ((java.lang.Long) cls19.getMethod((java.lang.String) objArr64[0], null).invoke(null, null)).longValue();
                            settranslationz4.valueOf = j2;
                            i2 = 23;
                            settranslationz4.AlternateContactlessPaymentDataJson(8);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th26) {
                            java.lang.Throwable cause11 = th26.getCause();
                            if (cause11 != null) {
                                throw cause11;
                            }
                            throw th26;
                        }
                    case -209:
                        invoke = "\uefd6\uefb2᎒\uea3a嶖퍈깧㹳ࣆ\uf350蝈߸↶\udbbf鱁棔媞벶\uf4f8熦獄藌췁媀汻渶⪬ꈏ蕄睍Ͷ謰뷷塇ᡛ\uec09횡\u20fd煳\uf5ee쿚ঙ乜\udebe\ue877ኩꚆ➞Śﬣ뿩\u0f6f㨂\udc08钇တ勬ꕲ\ued6b祊䯐踉쩥䋷撺隈⍃ꮘ";
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -208:
                        try {
                            byte b11 = (byte) (getAid & 127);
                            short s5 = AlternateContactlessPaymentDataJson[7022];
                            java.lang.Object[] objArr65 = new java.lang.Object[1];
                            a(b11, s5, (short) (s5 | 7010), objArr65);
                            java.lang.Class<?> cls20 = java.lang.Class.forName((java.lang.String) objArr65[0]);
                            java.lang.Object[] objArr66 = new java.lang.Object[1];
                            a(r6[7055], r6[21], (short) 7489, objArr66);
                            intValue2 = ((java.lang.Integer) cls20.getMethod((java.lang.String) objArr66[0], null).invoke(null, null)).intValue();
                            settranslationz4.AlternateContactlessPaymentDataJson = intValue2;
                            i2 = 23;
                            settranslationz4.AlternateContactlessPaymentDataJson(14);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th27) {
                            java.lang.Throwable cause12 = th27.getCause();
                            if (cause12 != null) {
                                throw cause12;
                            }
                            throw th27;
                        }
                    case -207:
                        invoke = "\uf6d6\uf6b4ꬖ勨뤽횱䪜㯜ᆚ䯗掶ɔ㢱挴磫洧䎛Ѣၗ瑐橎㵎⥨彷畻횴치\ua7f1鰗쾘\ue7dc躚ꓼ\ue0c4ﳳ\ue9ff쾢顺闝\uf016훟넗꫰\udb47\uf171꩹䉿≫ᡙ䏲嬕ઔ⍗撌灾ᖶ䯦᷶\u09c5糯劅㚍⺟䝚編⹒잵긾";
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -206:
                        settranslationz4.AlternateContactlessPaymentDataJson = 2;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj16 = settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr67 = {obj16, java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            int i27 = getAid & 127;
                            byte b12 = (byte) i27;
                            java.lang.Object[] objArr68 = new java.lang.Object[1];
                            a(b12, b12, (short) 7434, objArr68);
                            java.lang.Class<?> cls21 = java.lang.Class.forName((java.lang.String) objArr68[0]);
                            byte[] bArr20 = AlternateContactlessPaymentDataJson;
                            byte b13 = (byte) (-bArr20[17]);
                            short s6 = bArr20[7122];
                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                            a(b13, s6, (short) (s6 | 7442), objArr69);
                            java.lang.String str7 = (java.lang.String) objArr69[0];
                            java.lang.Object[] objArr70 = new java.lang.Object[1];
                            a(bArr20[7149], (short) i27, (short) 7468, objArr70);
                            intValue2 = ((java.lang.Integer) cls21.getMethod(str7, java.lang.Class.forName((java.lang.String) objArr70[0]), java.lang.Integer.TYPE).invoke(null, objArr67)).intValue();
                            settranslationz4.AlternateContactlessPaymentDataJson = intValue2;
                            i2 = 23;
                            settranslationz4.AlternateContactlessPaymentDataJson(14);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th28) {
                            java.lang.Throwable cause13 = th28.getCause();
                            if (cause13 != null) {
                                throw cause13;
                            }
                            throw th28;
                        }
                    case -205:
                        settranslationz4.IccPrivateKeyCrtComponentsJson = "";
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -204:
                        invoke = "쟼잞念\n哞碑ꝼᜤ₱ᥢ蹖⺮কㆋ锃䆀狥囖\ufde6墤孫澫쓝玀䑒萂⎶譔괸鵺੯ꉠ闒뉳ᄖ앙ﻚ쪘砹\udce6\ue7f0\ue3f2䝄\uf7ba쀉\uf89d꿈ໃ⥶ᄘ뚢♯ቾ㙬鷈㤖竍众\ue427倜揼摩썿殡䲐糠⩐苈";
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -203:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i28 = settranslationz4.DigitizedCardProfile;
                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                        a(r6[7149], (short) (-AlternateContactlessPaymentDataJson[17]), (short) 6979, objArr71);
                        invoke = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr71[0]), i28);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -202:
                        i10 = 1001;
                        c3 = 7149;
                        i = 23;
                    case -201:
                        i10 = 997;
                        c3 = 7149;
                        i = 23;
                    case -200:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 996;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -199:
                        i10 = 1130;
                        c3 = 7149;
                        i = 23;
                    case -198:
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr72 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i29 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr73 = {objArr72, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                            if (obj17 == null) {
                                obj17 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 4617 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj17);
                            }
                            invoke = ((java.lang.reflect.Method) obj17).invoke(null, objArr73);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th29) {
                            java.lang.Throwable cause14 = th29.getCause();
                            if (cause14 != null) {
                                throw cause14;
                            }
                            throw th29;
                        }
                    case -197:
                        settranslationz4.AlternateContactlessPaymentDataJson = -1751808050;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -196:
                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 28, 428 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 31610));
                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                        d(110, (byte) (-$$a[57]), r6[58], objArr74);
                        invoke = cls22.getField((java.lang.String) objArr74[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -195:
                        i10 = 978;
                        c3 = 7149;
                        i = 23;
                    case -194:
                        settranslationz4.AlternateContactlessPaymentDataJson(27);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 977;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -193:
                        settranslationz4.valueOf = 1925L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -192:
                        i10 = 984;
                        c3 = 7149;
                        i = 23;
                    case -191:
                        i10 = 961;
                        c3 = 7149;
                        i = 23;
                    case -190:
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 960;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -189:
                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 429 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31610));
                        java.lang.Object[] objArr75 = new java.lang.Object[1];
                        d((byte) (-$$a[44]), r6[111], (byte) ($$b >>> 1), objArr75);
                        j2 = cls23.getField((java.lang.String) objArr75[0]).getLong(null);
                        settranslationz4.valueOf = j2;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -188:
                        byte[] bArr21 = $$d;
                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                        e(319, bArr21[299], bArr21[330], objArr76);
                        invoke = (java.lang.String) objArr76[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -187:
                        settranslationz4.valueOf = 1325083568L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -186:
                        settranslationz4.valueOf = 5691188390003736576L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -185:
                        i10 = 954;
                        c3 = 7149;
                        i = 23;
                    case -184:
                        i10 = androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR;
                        c3 = 7149;
                        i = 23;
                    case -183:
                        i10 = 893;
                        c3 = 7149;
                        i = 23;
                    case -182:
                        settranslationz4.AlternateContactlessPaymentDataJson(67);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 892;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -181:
                        i10 = 868;
                        c3 = 7149;
                        i = 23;
                    case -180:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(57);
                        valueOf2 = java.lang.Long.valueOf(settranslationz4.writeReplace);
                        cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 584, (char) (24291 - android.view.View.MeasureSpec.getMode(0)));
                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                        d((byte) (-$$a[44]), r8[111], (byte) ($$b >>> 1), objArr77);
                        str3 = (java.lang.String) objArr77[0];
                        field = cls3.getField(str3);
                        obj2 = null;
                        i2 = 23;
                        field.set(obj2, valueOf2);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -179:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr78 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 583, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24290));
                        java.lang.Object[] objArr79 = new java.lang.Object[1];
                        d(110, (byte) (-$$a[57]), r8[58], objArr79);
                        cls24.getField((java.lang.String) objArr79[0]).set(null, objArr78);
                        i2 = 23;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -178:
                        i10 = 1658;
                        c3 = 7149;
                        i = 23;
                    case -177:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 850;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -176:
                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                        e(393, 62, $$d[28], objArr80);
                        invoke = (java.lang.String) objArr80[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -175:
                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                        e((short) ($$e & 976), (byte) (-$$d[34]), r6[365], objArr81);
                        invoke = (java.lang.String) objArr81[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -174:
                        i10 = 1639;
                        c3 = 7149;
                        i = 23;
                    case -173:
                        i10 = 1813;
                        c3 = 7149;
                        i = 23;
                    case -172:
                        i10 = 1815;
                        c3 = 7149;
                        i = 23;
                    case -171:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = com.visa.cbp.sdk.facade.data.Constants.SUPER_USER_PERMISSION_DETECTED;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -170:
                        i10 = 879;
                        c3 = 7149;
                        i = 23;
                    case -169:
                        settranslationz4.AlternateContactlessPaymentDataJson = 722650420;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -168:
                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 583, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24290));
                        java.lang.Object[] objArr82 = new java.lang.Object[1];
                        d(110, (byte) (-$$a[57]), r6[58], objArr82);
                        invoke = cls25.getField((java.lang.String) objArr82[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -167:
                        i10 = 1828;
                        c3 = 7149;
                        i = 23;
                    case -166:
                        i10 = 1830;
                        c3 = 7149;
                        i = 23;
                    case -165:
                        settranslationz4.AlternateContactlessPaymentDataJson(27);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 785;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -164:
                        settranslationz4.valueOf = 1878L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -163:
                        i2 = i;
                        i11 = 792;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -162:
                        i10 = my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_USER_ID;
                        c3 = 7149;
                        i = 23;
                    case -161:
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -160:
                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 51, 584 - (android.os.Process.myPid() >> 22), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 24291));
                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                        d((byte) (-$$a[44]), r6[111], (byte) ($$b >>> 1), objArr83);
                        j2 = cls26.getField((java.lang.String) objArr83[0]).getLong(null);
                        settranslationz4.valueOf = j2;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -159:
                        settranslationz4.valueOf = 1915242115L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -158:
                        settranslationz4.valueOf = 8225902316566347776L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -157:
                        i10 = org.chromium.net.telemetry.CronetStatsLog.CRONET_ENGINE_BUILDER_INITIALIZED;
                        c3 = 7149;
                        i = 23;
                    case -156:
                        i10 = 714;
                        c3 = 7149;
                        i = 23;
                    case -155:
                        i10 = 1700;
                        c3 = 7149;
                        i = 23;
                    case -154:
                        settranslationz4.AlternateContactlessPaymentDataJson(67);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_INTERPOLATOR;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -153:
                        i10 = 681;
                        c3 = 7149;
                        i = 23;
                    case -152:
                        i10 = 1632;
                        c3 = 7149;
                        i = 23;
                    case -151:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(57);
                        valueOf2 = java.lang.Long.valueOf(settranslationz4.writeReplace);
                        cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 51, android.view.View.resolveSizeAndState(0, 0, 0) + 584, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24290));
                        byte[] bArr22 = $$a;
                        java.lang.Object[] objArr84 = new java.lang.Object[1];
                        d(bArr22[14], bArr22[0], 54, objArr84);
                        str3 = (java.lang.String) objArr84[0];
                        field = cls3.getField(str3);
                        obj2 = null;
                        i2 = 23;
                        field.set(obj2, valueOf2);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -150:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr85 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 52, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 583, (char) (24291 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                        d((byte) ($$b & 477), r9[45], (byte) (-$$a[57]), objArr86);
                        cls27.getField((java.lang.String) objArr86[0]).set(null, objArr85);
                        i2 = 23;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -149:
                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                        e(197, (byte) (-$$d[293]), r2[28], objArr87);
                        invoke = (java.lang.String) objArr87[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -148:
                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                        e((short) ($$e - 2), (byte) (-$$d[34]), r6[365], objArr88);
                        invoke = (java.lang.String) objArr88[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -147:
                        i10 = 693;
                        c3 = 7149;
                        i = 23;
                    case -146:
                        settranslationz4.AlternateContactlessPaymentDataJson = 46653119;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -145:
                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 585 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (24290 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                        d((byte) ($$b & 477), r8[45], (byte) (-$$a[57]), objArr89);
                        invoke = cls28.getField((java.lang.String) objArr89[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -144:
                        i10 = 1642;
                        c3 = 7149;
                        i = 23;
                    case -143:
                        settranslationz4.AlternateContactlessPaymentDataJson(27);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 628;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -142:
                        settranslationz4.valueOf = 1999L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -141:
                        i10 = 635;
                        c3 = 7149;
                        i = 23;
                    case -140:
                        i10 = androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE;
                        c3 = 7149;
                        i = 23;
                    case -139:
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -138:
                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 583 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 24291));
                        byte[] bArr23 = $$a;
                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                        d(bArr23[14], bArr23[0], 54, objArr90);
                        j2 = cls29.getField((java.lang.String) objArr90[0]).getLong(null);
                        settranslationz4.valueOf = j2;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -137:
                        i10 = 1628;
                        c3 = 7149;
                        i = 23;
                    case -136:
                        byte b14 = $$d[439];
                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                        e(467, b14, (byte) (b14 | com.google.common.base.Ascii.DC4), objArr91);
                        invoke = (java.lang.String) objArr91[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -135:
                        byte[] bArr24 = $$d;
                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                        e(259, bArr24[439], bArr24[365], objArr92);
                        invoke = (java.lang.String) objArr92[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -134:
                        settranslationz4.valueOf = 1392335004L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -133:
                        settranslationz4.valueOf = 5980033290076160000L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -132:
                        i10 = 603;
                        c3 = 7149;
                        i = 23;
                    case -131:
                        i10 = 560;
                        c3 = 7149;
                        i = 23;
                    case -130:
                        i10 = 1751;
                        c3 = 7149;
                        i = 23;
                    case -129:
                        settranslationz4.AlternateContactlessPaymentDataJson(67);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 550;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT /* -128 */:
                        i10 = 527;
                        c3 = 7149;
                        i = 23;
                    case androidx.compose.runtime.ComposerKt.defaultsKey /* -127 */:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(57);
                        valueOf2 = java.lang.Long.valueOf(settranslationz4.writeReplace);
                        cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50, android.view.Gravity.getAbsoluteGravity(0, 0) + 584, (char) (24292 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        byte b15 = $$a[23];
                        java.lang.Object[] objArr93 = new java.lang.Object[1];
                        d(b15, (byte) (b15 + 2), r8[58], objArr93);
                        str3 = (java.lang.String) objArr93[0];
                        field = cls3.getField(str3);
                        obj2 = null;
                        i2 = 23;
                        field.set(obj2, valueOf2);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -126:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr94 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 51, 632 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 24291));
                        byte[] bArr25 = $$a;
                        java.lang.Object[] objArr95 = new java.lang.Object[1];
                        d(58, bArr25[2], bArr25[45], objArr95);
                        cls30.getField((java.lang.String) objArr95[0]).set(null, objArr94);
                        i2 = 23;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -125:
                        i10 = 510;
                        c3 = 7149;
                        i = 23;
                    case -124:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 509;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -123:
                        byte b16 = $$d[439];
                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                        e(467, b16, (byte) (b16 | com.google.common.base.Ascii.DC4), objArr96);
                        invoke = (java.lang.String) objArr96[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -122:
                        java.lang.Object[] objArr97 = new java.lang.Object[1];
                        e(300, (byte) (-$$d[98]), r2[365], objArr97);
                        invoke = (java.lang.String) objArr97[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -121:
                        i10 = 466;
                        c3 = 7149;
                        i = 23;
                    case -120:
                        i10 = 462;
                        c3 = 7149;
                        i = 23;
                    case -119:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 461;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -118:
                        i10 = 539;
                        c3 = 7149;
                        i = 23;
                    case -117:
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr98 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i30 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr99 = {objArr98, java.lang.Integer.valueOf(i30), java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(994792440);
                            if (obj18 == null) {
                                obj18 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.KeyEvent.keyCodeFromString(""), 4830 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("valueOf", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(994792440, obj18);
                            }
                            invoke = ((java.lang.reflect.Method) obj18).invoke(null, objArr99);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th30) {
                            java.lang.Throwable cause15 = th30.getCause();
                            if (cause15 != null) {
                                throw cause15;
                            }
                            throw th30;
                        }
                    case -116:
                        settranslationz4.AlternateContactlessPaymentDataJson = -1582246397;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -115:
                        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 51, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24291));
                        byte[] bArr26 = $$a;
                        java.lang.Object[] objArr100 = new java.lang.Object[1];
                        d(58, bArr26[2], bArr26[45], objArr100);
                        invoke = cls31.getField((java.lang.String) objArr100[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -114:
                        i10 = 1818;
                        c3 = 7149;
                        i = 23;
                    case -113:
                        i10 = 1820;
                        c3 = 7149;
                        i = 23;
                    case -112:
                        settranslationz4.AlternateContactlessPaymentDataJson(27);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 440;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -111:
                        settranslationz4.valueOf = 1918L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING /* -110 */:
                        i2 = i;
                        i11 = 447;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -109:
                        i10 = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET;
                        c3 = 7149;
                        i = 23;
                    case -108:
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -107:
                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 584 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24290));
                        byte b17 = $$a[23];
                        java.lang.Object[] objArr101 = new java.lang.Object[1];
                        d(b17, (byte) (b17 + 2), r6[58], objArr101);
                        j2 = cls32.getField((java.lang.String) objArr101[0]).getLong(null);
                        settranslationz4.valueOf = j2;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -106:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        invoke = settranslationz4.getProfileVersion;
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -105:
                        i10 = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE;
                        c3 = 7149;
                        i = 23;
                    case -104:
                        i10 = androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_VISIBILITY;
                        c3 = 7149;
                        i = 23;
                    case -103:
                        settranslationz4.AlternateContactlessPaymentDataJson(102);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 401;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -102:
                        i10 = 379;
                        c3 = 7149;
                        i = 23;
                    case -101:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(57);
                        valueOf2 = java.lang.Long.valueOf(settranslationz4.writeReplace);
                        cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1580, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b18 = $$a[23];
                        java.lang.Object[] objArr102 = new java.lang.Object[1];
                        d(b18, (byte) (b18 + 2), r8[58], objArr102);
                        str3 = (java.lang.String) objArr102[0];
                        field = cls3.getField(str3);
                        obj2 = null;
                        i2 = 23;
                        field.set(obj2, valueOf2);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -100:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr103 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 48, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1580, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                        java.lang.Object[] objArr104 = new java.lang.Object[1];
                        d((byte) (-$$a[44]), r8[111], (byte) ($$b >>> 1), objArr104);
                        cls33.getField((java.lang.String) objArr104[0]).set(null, objArr103);
                        i2 = 23;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -99:
                        i10 = 362;
                        c3 = 7149;
                        i = 23;
                    case -98:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 361;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -97:
                        byte[] bArr27 = $$d;
                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                        e(319, bArr27[299], bArr27[330], objArr105);
                        invoke = (java.lang.String) objArr105[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -96:
                        byte[] bArr28 = $$d;
                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                        e(387, bArr28[16], bArr28[365], objArr106);
                        invoke = (java.lang.String) objArr106[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -95:
                        i10 = 1635;
                        c3 = 7149;
                        i = 23;
                    case -94:
                        i10 = 315;
                        c3 = 7149;
                        i = 23;
                    case -93:
                        i10 = 311;
                        c3 = 7149;
                        i = 23;
                    case -92:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 310;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -91:
                        i10 = 389;
                        c3 = 7149;
                        i = 23;
                    case com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.NetworkConstants.PAST_90_DAYS /* -90 */:
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr107 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i31 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr108 = {objArr107, java.lang.Integer.valueOf(i31), java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-595545510);
                            if (obj19 == null) {
                                obj19 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 34, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4906, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("values", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-595545510, obj19);
                            }
                            invoke = ((java.lang.reflect.Method) obj19).invoke(null, objArr108);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th31) {
                            java.lang.Throwable cause16 = th31.getCause();
                            if (cause16 != null) {
                                throw cause16;
                            }
                            throw th31;
                        }
                    case -89:
                        settranslationz4.AlternateContactlessPaymentDataJson = -142649458;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -88:
                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 48, 1581 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                        d((byte) (-$$a[44]), r6[111], (byte) ($$b >>> 1), objArr109);
                        invoke = cls34.getField((java.lang.String) objArr109[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -87:
                        i2 = i;
                        i11 = com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -86:
                        i10 = 1735;
                        c3 = 7149;
                        i = 23;
                    case -85:
                        settranslationz4.AlternateContactlessPaymentDataJson(27);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -84:
                        settranslationz4.valueOf = 2045L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -83:
                        i10 = 1853;
                        c3 = 7149;
                        i = 23;
                    case -82:
                        i10 = 1855;
                        c3 = 7149;
                        i = 23;
                    case -81:
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -80:
                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 48, 1581 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                        byte b19 = $$a[23];
                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                        d(b19, (byte) (b19 + 2), r6[58], objArr110);
                        j2 = cls35.getField((java.lang.String) objArr110[0]).getLong(null);
                        settranslationz4.valueOf = j2;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -79:
                        byte[] bArr29 = AlternateContactlessPaymentDataJson;
                        byte b20 = bArr29[7149];
                        short s7 = bArr29[7122];
                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                        a(b20, s7, (short) (s7 | 7408), objArr111);
                        java.lang.Class<?> cls36 = java.lang.Class.forName((java.lang.String) objArr111[0]);
                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                        a(bArr29[7154], bArr29[16], (short) 7322, objArr112);
                        invoke = cls36.getField((java.lang.String) objArr112[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -78:
                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                        e(393, 62, $$d[28], objArr113);
                        invoke = (java.lang.String) objArr113[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -77:
                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                        e(433, (byte) (-$$d[61]), r2[365], objArr114);
                        invoke = (java.lang.String) objArr114[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -76:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(57);
                        try {
                            java.lang.Object[] objArr115 = {java.lang.Long.valueOf(settranslationz4.writeReplace)};
                            byte[] bArr30 = AlternateContactlessPaymentDataJson;
                            byte b21 = bArr30[7149];
                            short s8 = bArr30[7122];
                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                            a(b21, s8, (short) (s8 | 7408), objArr116);
                            java.lang.Class<?> cls37 = java.lang.Class.forName((java.lang.String) objArr116[0]);
                            byte b22 = bArr30[5];
                            short s9 = bArr30[23];
                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                            a(b22, s9, (short) (s9 | 7008), objArr117);
                            invoke = cls37.getMethod((java.lang.String) objArr117[0], java.lang.Long.TYPE).invoke(null, objArr115);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th32) {
                            java.lang.Throwable cause17 = th32.getCause();
                            if (cause17 != null) {
                                throw cause17;
                            }
                            throw th32;
                        }
                    case -75:
                        i10 = 225;
                        c3 = 7149;
                        i = 23;
                    case -74:
                        i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE;
                        c3 = 7149;
                        i = 23;
                    case -73:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -72:
                        i10 = 227;
                        c3 = 7149;
                        i = 23;
                    case -71:
                        settranslationz4.valueOf = -232410141L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -70:
                        settranslationz4.valueOf = -998193920494010368L;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -69:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        try {
                            java.lang.Object[] objArr118 = {(java.lang.Object[]) settranslationz4.getProfileVersion};
                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                            if (obj20 == null) {
                                obj20 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32, android.graphics.Color.rgb(0, 0, 0) + 16781900, (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("writeReplace", java.lang.Object[].class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj20);
                            }
                            invoke = ((java.lang.reflect.Method) obj20).invoke(null, objArr118);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th33) {
                            java.lang.Throwable cause18 = th33.getCause();
                            if (cause18 != null) {
                                throw cause18;
                            }
                            throw th33;
                        }
                    case -68:
                        settranslationz4.AlternateContactlessPaymentDataJson = 2;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj21 = settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        try {
                            java.lang.Object[] objArr119 = {settranslationz4.getProfileVersion};
                            byte[] bArr31 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                            a(bArr31[7149], bArr31[7122], (short) 7406, objArr120);
                            java.lang.Class<?> cls38 = java.lang.Class.forName((java.lang.String) objArr120[0]);
                            byte b23 = (byte) (getAid & 127);
                            short s10 = bArr31[13];
                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                            a(b23, s10, (short) (s10 | 7417), objArr121);
                            java.lang.String str8 = (java.lang.String) objArr121[0];
                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                            a(bArr31[7149], (short) (-bArr31[17]), (short) 7171, objArr122);
                            intValue2 = ((java.lang.Boolean) cls38.getMethod(str8, java.lang.Class.forName((java.lang.String) objArr122[0])).invoke(obj21, objArr119)).booleanValue();
                            settranslationz4.AlternateContactlessPaymentDataJson = intValue2;
                            i2 = 23;
                            settranslationz4.AlternateContactlessPaymentDataJson(14);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th34) {
                            java.lang.Throwable cause19 = th34.getCause();
                            if (cause19 != null) {
                                throw cause19;
                            }
                            throw th34;
                        }
                    case -67:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        try {
                            java.lang.Object[] objArr123 = {(java.lang.Object[]) settranslationz4.getProfileVersion};
                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                            if (obj22 == null) {
                                obj22 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 34, 4683 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("values", java.lang.Object[].class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj22);
                            }
                            invoke = ((java.lang.reflect.Method) obj22).invoke(null, objArr123);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th35) {
                            java.lang.Throwable cause20 = th35.getCause();
                            if (cause20 != null) {
                                throw cause20;
                            }
                            throw th35;
                        }
                    case -66:
                        try {
                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                            a(r2[7149], (short) (-AlternateContactlessPaymentDataJson[27]), (short) 7388, objArr124);
                            invoke = java.lang.Class.forName((java.lang.String) objArr124[0]).getDeclaredConstructor(null).newInstance(null);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th36) {
                            java.lang.Throwable cause21 = th36.getCause();
                            if (cause21 != null) {
                                throw cause21;
                            }
                            throw th36;
                        }
                    case -65:
                        i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE;
                        c3 = 7149;
                        i = 23;
                    case -64:
                        i10 = 202;
                        c3 = 7149;
                        i = 23;
                    case -63:
                        i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE;
                        c3 = 7149;
                        i = 23;
                    case -62:
                        settranslationz4.AlternateContactlessPaymentDataJson(67);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 193;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -61:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = (int[]) settranslationz4.getProfileVersion;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -60:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        invoke = settranslationz4.getProfileVersion;
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -59:
                        settranslationz4.AlternateContactlessPaymentDataJson = 2;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj23 = settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        try {
                            java.lang.Object[] objArr125 = {settranslationz4.getProfileVersion};
                            byte[] bArr33 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                            a(bArr33[7149], bArr33[7057], (short) 7350, objArr126);
                            java.lang.Class<?> cls39 = java.lang.Class.forName((java.lang.String) objArr126[0]);
                            java.lang.Object[] objArr127 = new java.lang.Object[1];
                            a(bArr33[28], bArr33[7014], (short) 7378, objArr127);
                            java.lang.String str9 = (java.lang.String) objArr127[0];
                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                            a(bArr33[7345], (short) (-bArr33[27]), (short) 7214, objArr128);
                            invoke = cls39.getMethod(str9, java.lang.Class.forName((java.lang.String) objArr128[0])).invoke(obj23, objArr125);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th37) {
                            java.lang.Throwable cause22 = th37.getCause();
                            if (cause22 != null) {
                                throw cause22;
                            }
                            throw th37;
                        }
                    case -58:
                        settranslationz4.AlternateContactlessPaymentDataJson = 2;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Class cls40 = (java.lang.Class) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        invoke = cls40.getDeclaredConstructor((java.lang.Class[]) settranslationz4.getProfileVersion);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -57:
                        byte[] bArr34 = AlternateContactlessPaymentDataJson;
                        byte b24 = bArr34[7149];
                        short s11 = bArr34[7026];
                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                        a(b24, s11, (short) (s11 | 7300), objArr129);
                        invoke = java.lang.Class.forName((java.lang.String) objArr129[0]);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -56:
                        i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                        c3 = 7149;
                        i = 23;
                    case -55:
                        i10 = 167;
                        c3 = 7149;
                        i = 23;
                    case -54:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 166;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -53:
                        i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
                        c3 = 7149;
                        i = 23;
                    case -52:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(57);
                        valueOf2 = java.lang.Long.valueOf(settranslationz4.writeReplace);
                        cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 40, android.view.View.MeasureSpec.getMode(0) + 667, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 40024));
                        byte[] bArr35 = $$a;
                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                        d(bArr35[14], bArr35[0], 54, objArr130);
                        str3 = (java.lang.String) objArr130[0];
                        field = cls3.getField(str3);
                        obj2 = null;
                        i2 = 23;
                        field.set(obj2, valueOf2);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -51:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        valueOf2 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 667 - android.text.TextUtils.getOffsetAfter("", 0), (char) (40025 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                        byte b25 = $$a[23];
                        java.lang.Object[] objArr131 = new java.lang.Object[1];
                        d(b25, (byte) (b25 + 2), r8[58], objArr131);
                        str3 = (java.lang.String) objArr131[0];
                        field = cls3.getField(str3);
                        obj2 = null;
                        i2 = 23;
                        field.set(obj2, valueOf2);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -50:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        invoke = settranslationz4.getProfileVersion;
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -49:
                        byte[] bArr36 = AlternateContactlessPaymentDataJson;
                        byte b26 = bArr36[7149];
                        short s12 = bArr36[6985];
                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                        a(b26, s12, (short) (s12 | 6982), objArr132);
                        java.lang.Class<?> cls41 = java.lang.Class.forName((java.lang.String) objArr132[0]);
                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                        a(bArr36[7154], bArr36[16], (short) 7322, objArr133);
                        invoke = cls41.getField((java.lang.String) objArr133[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -48:
                        byte b27 = $$d[439];
                        java.lang.Object[] objArr134 = new java.lang.Object[1];
                        e(467, b27, (byte) (b27 | com.google.common.base.Ascii.DC4), objArr134);
                        invoke = (java.lang.String) objArr134[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -47:
                        byte[] bArr37 = $$d;
                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                        e(534, bArr37[28], bArr37[365], objArr135);
                        invoke = (java.lang.String) objArr135[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -46:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr136 = {java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            byte[] bArr38 = AlternateContactlessPaymentDataJson;
                            byte b28 = bArr38[7149];
                            short s13 = bArr38[6985];
                            java.lang.Object[] objArr137 = new java.lang.Object[1];
                            a(b28, s13, (short) (s13 | 6982), objArr137);
                            java.lang.Class<?> cls42 = java.lang.Class.forName((java.lang.String) objArr137[0]);
                            byte b29 = bArr38[5];
                            short s14 = bArr38[23];
                            java.lang.Object[] objArr138 = new java.lang.Object[1];
                            a(b29, s14, (short) (s14 | 7008), objArr138);
                            invoke = cls42.getMethod((java.lang.String) objArr138[0], java.lang.Integer.TYPE).invoke(null, objArr136);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th38) {
                            java.lang.Throwable cause23 = th38.getCause();
                            if (cause23 != null) {
                                throw cause23;
                            }
                            throw th38;
                        }
                    case -45:
                        settranslationz4.AlternateContactlessPaymentDataJson(37);
                        throw ((java.lang.Throwable) settranslationz4.getProfileVersion);
                    case -44:
                        i10 = 101;
                        c3 = 7149;
                        i = 23;
                    case -43:
                        i10 = 98;
                        c3 = 7149;
                        i = 23;
                    case -42:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 97;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -41:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj24 = settranslationz4.getProfileVersion;
                        try {
                            byte[] bArr39 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr139 = new java.lang.Object[1];
                            a(bArr39[7149], (short) (-bArr39[27]), (short) 7297, objArr139);
                            java.lang.Class<?> cls43 = java.lang.Class.forName((java.lang.String) objArr139[0]);
                            java.lang.Object[] objArr140 = new java.lang.Object[1];
                            a((byte) (-bArr39[17]), bArr39[40], (short) 7315, objArr140);
                            invoke = cls43.getMethod((java.lang.String) objArr140[0], null).invoke(obj24, null);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th39) {
                            java.lang.Throwable cause24 = th39.getCause();
                            if (cause24 != null) {
                                throw cause24;
                            }
                            throw th39;
                        }
                    case -40:
                        i10 = 1762;
                        c3 = 7149;
                        i = 23;
                    case -39:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj25 = settranslationz4.getProfileVersion;
                        try {
                            byte b30 = (byte) (getAid & 127);
                            byte[] bArr40 = AlternateContactlessPaymentDataJson;
                            short s15 = bArr40[7547];
                            java.lang.Object[] objArr141 = new java.lang.Object[1];
                            a(b30, s15, (short) (s15 | 7233), objArr141);
                            java.lang.Class<?> cls44 = java.lang.Class.forName((java.lang.String) objArr141[0]);
                            java.lang.Object[] objArr142 = new java.lang.Object[1];
                            a((byte) (-bArr40[17]), (short) (-bArr40[7049]), (short) 7277, objArr142);
                            invoke = cls44.getMethod((java.lang.String) objArr142[0], null).invoke(obj25, null);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th40) {
                            java.lang.Throwable cause25 = th40.getCause();
                            if (cause25 != null) {
                                throw cause25;
                            }
                            throw th40;
                        }
                    case -38:
                        i10 = 87;
                        c3 = 7149;
                        i = 23;
                    case -37:
                        i10 = 1772;
                        c3 = 7149;
                        i = 23;
                    case -36:
                        settranslationz4.AlternateContactlessPaymentDataJson(33);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 82;
                            c3 = 7149;
                            i = 23;
                        } else {
                            i2 = 23;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -35:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        invoke = settranslationz4.getProfileVersion;
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -34:
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Class cls45 = (java.lang.Class) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.String str10 = (java.lang.String) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        invoke = cls45.getMethod(str10, (java.lang.Class[]) settranslationz4.getProfileVersion);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -33:
                        i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE;
                        c3 = 7149;
                        i = 23;
                    case -32:
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr143 = (java.lang.Object[]) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i32 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr144 = {objArr143, java.lang.Integer.valueOf(i32), java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                            if (obj26 == null) {
                                obj26 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 33, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 4684, (char) android.view.View.getDefaultSize(0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj26);
                            }
                            invoke = ((java.lang.reflect.Method) obj26).invoke(null, objArr144);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th41) {
                            java.lang.Throwable cause26 = th41.getCause();
                            if (cause26 != null) {
                                throw cause26;
                            }
                            throw th41;
                        }
                    case -31:
                        settranslationz4.AlternateContactlessPaymentDataJson = -1188181321;
                        i2 = 23;
                        settranslationz4.AlternateContactlessPaymentDataJson(14);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -30:
                        java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 40, android.graphics.Color.alpha(0) + 667, (char) ((-16737192) - android.graphics.Color.rgb(0, 0, 0)));
                        byte b31 = $$a[23];
                        java.lang.Object[] objArr145 = new java.lang.Object[1];
                        d(b31, (byte) (b31 + 2), r6[58], objArr145);
                        invoke = cls46.getField((java.lang.String) objArr145[0]).get(null);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                        i2 = 23;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -29:
                        i10 = 62;
                        c3 = 7149;
                        i = 23;
                    case -28:
                        settranslationz4.AlternateContactlessPaymentDataJson(27);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 61;
                            c3 = 7149;
                            i = 23;
                        } else {
                            c = 7149;
                            i2 = 23;
                            settranslationz4 = settranslationz4;
                            c3 = c;
                            i10 = i11;
                            i = i2;
                        }
                    case -27:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj27 = settranslationz4.getProfileVersion;
                        try {
                            byte[] bArr41 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr146 = new java.lang.Object[1];
                            a(bArr41[7149], (short) (-bArr41[17]), (short) 7232, objArr146);
                            java.lang.Class<?> cls47 = java.lang.Class.forName((java.lang.String) objArr146[0]);
                            byte b32 = bArr41[7014];
                            short s16 = bArr41[28];
                            java.lang.Object[] objArr147 = new java.lang.Object[1];
                            a(b32, s16, (short) (s16 | 7239), objArr147);
                            j2 = ((java.lang.Long) cls47.getMethod((java.lang.String) objArr147[0], null).invoke(obj27, null)).longValue();
                            settranslationz4.valueOf = j2;
                            i2 = 23;
                            settranslationz4.AlternateContactlessPaymentDataJson(8);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th42) {
                            java.lang.Throwable cause27 = th42.getCause();
                            if (cause27 != null) {
                                throw cause27;
                            }
                            throw th42;
                        }
                    case -26:
                        try {
                            settranslationz4.AlternateContactlessPaymentDataJson = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(3);
                            settranslationz4.AlternateContactlessPaymentDataJson(4);
                            invoke = settranslationz4.getProfileVersion;
                            settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                            i2 = 23;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th43) {
                            th = th43;
                            i2 = 23;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                            settranslationz = settranslationz4;
                            if (i11 >= 103) {
                            }
                            byte[] bArr3222222222 = AlternateContactlessPaymentDataJson;
                            objArr = new java.lang.Object[1];
                            a(bArr3222222222[7149], (short) (-bArr3222222222[i12]), (short) 7577, objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            if (i11 >= 172) {
                            }
                            if (i11 >= 227) {
                            }
                            if (i11 >= 318) {
                            }
                            objArr2 = new java.lang.Object[1];
                            a(bArr3222222222[7149], (short) (-bArr3222222222[i12]), (short) 7577, objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i11 >= 379) {
                            }
                            if (i11 >= 469) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr3222222222[7149], (short) (-bArr3222222222[i12]), (short) 7577, objArr3);
                            if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            if (i11 >= 527) {
                            }
                            if (i11 >= 564) {
                            }
                            if (i11 >= 637) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr3222222222[7149], (short) (-bArr3222222222[i12]), (short) 7577, objArr4);
                            if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            if (i11 >= 681) {
                            }
                            if (i11 >= 726) {
                            }
                            if (i11 >= 813) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr3222222222[7149], (short) (-bArr3222222222[i12]), (short) 7577, objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            if (i11 >= 868) {
                            }
                            if (i11 >= 908) {
                            }
                            if (i11 >= 1039) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr3222222222[7149], (short) (-bArr3222222222[i12]), (short) 7577, objArr6);
                            if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i11 >= 1120) {
                            }
                            if (i11 >= 1158) {
                            }
                            objArr7 = new java.lang.Object[1];
                            a(bArr3222222222[7149], (short) (-bArr3222222222[i12]), (short) 7577, objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            if (i11 >= 1248) {
                            }
                            if (i11 >= 1324) {
                            }
                            objArr8 = new java.lang.Object[1];
                            a(bArr3222222222[7149], (short) (-bArr3222222222[i12]), (short) 7577, objArr8);
                            if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                            }
                            if (i11 >= 1417) {
                            }
                            if (i11 >= 1448) {
                            }
                            objArr9 = new java.lang.Object[1];
                            a(bArr3222222222[7149], (short) (-bArr3222222222[i12]), (short) 7577, objArr9);
                            if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                            }
                            if (i11 >= 1539) {
                            }
                            if (i11 >= 1582) {
                            }
                            c = 7149;
                            objArr10 = new java.lang.Object[1];
                            a(bArr3222222222[7149], (short) (-bArr3222222222[i12]), (short) 7577, objArr10);
                            if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                            }
                            if (i11 >= 1784) {
                            }
                        }
                        break;
                    case -25:
                        try {
                            settranslationz4.AlternateContactlessPaymentDataJson = 3;
                            settranslationz4.AlternateContactlessPaymentDataJson(3);
                            settranslationz4.AlternateContactlessPaymentDataJson(4);
                            java.lang.Object obj28 = settranslationz4.getProfileVersion;
                            settranslationz4.AlternateContactlessPaymentDataJson(4);
                            java.lang.Object obj29 = settranslationz4.getProfileVersion;
                            settranslationz4.AlternateContactlessPaymentDataJson(4);
                            try {
                                java.lang.Object[] objArr148 = {obj29, settranslationz4.getProfileVersion};
                                byte[] bArr42 = AlternateContactlessPaymentDataJson;
                                java.lang.Object[] objArr149 = new java.lang.Object[1];
                                a(bArr42[c3], (short) (-bArr42[7079]), (short) 7186, objArr149);
                                java.lang.Class<?> cls48 = java.lang.Class.forName((java.lang.String) objArr149[0]);
                                java.lang.Object[] objArr150 = new java.lang.Object[1];
                                a(bArr42[7122], bArr42[18], (short) 7209, objArr150);
                                java.lang.String str11 = (java.lang.String) objArr150[0];
                                java.lang.Object[] objArr151 = new java.lang.Object[1];
                                a(bArr42[c3], (short) (-bArr42[17]), (short) 7171, objArr151);
                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                a(bArr42[7345], (short) (-bArr42[27]), (short) 7214, objArr152);
                                invoke = cls48.getMethod(str11, java.lang.Class.forName((java.lang.String) objArr151[0]), java.lang.Class.forName((java.lang.String) objArr152[0])).invoke(obj28, objArr148);
                                settranslationz4.IccPrivateKeyCrtComponentsJson = invoke;
                                i2 = 23;
                                i7 = 1;
                                settranslationz4.AlternateContactlessPaymentDataJson(i7);
                                i10 = i11;
                                i = i2;
                                c3 = 7149;
                            } catch (java.lang.Throwable th44) {
                                java.lang.Throwable cause28 = th44.getCause();
                                if (cause28 != null) {
                                    throw cause28;
                                }
                                throw th44;
                            }
                        } catch (java.lang.Throwable th45) {
                            th = th45;
                            i2 = 23;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                            settranslationz = settranslationz4;
                            if (i11 >= 103) {
                            }
                            byte[] bArr32222222222 = AlternateContactlessPaymentDataJson;
                            objArr = new java.lang.Object[1];
                            a(bArr32222222222[7149], (short) (-bArr32222222222[i12]), (short) 7577, objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            if (i11 >= 172) {
                            }
                            if (i11 >= 227) {
                            }
                            if (i11 >= 318) {
                            }
                            objArr2 = new java.lang.Object[1];
                            a(bArr32222222222[7149], (short) (-bArr32222222222[i12]), (short) 7577, objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i11 >= 379) {
                            }
                            if (i11 >= 469) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr32222222222[7149], (short) (-bArr32222222222[i12]), (short) 7577, objArr3);
                            if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            if (i11 >= 527) {
                            }
                            if (i11 >= 564) {
                            }
                            if (i11 >= 637) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr32222222222[7149], (short) (-bArr32222222222[i12]), (short) 7577, objArr4);
                            if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            if (i11 >= 681) {
                            }
                            if (i11 >= 726) {
                            }
                            if (i11 >= 813) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr32222222222[7149], (short) (-bArr32222222222[i12]), (short) 7577, objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            if (i11 >= 868) {
                            }
                            if (i11 >= 908) {
                            }
                            if (i11 >= 1039) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr32222222222[7149], (short) (-bArr32222222222[i12]), (short) 7577, objArr6);
                            if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i11 >= 1120) {
                            }
                            if (i11 >= 1158) {
                            }
                            objArr7 = new java.lang.Object[1];
                            a(bArr32222222222[7149], (short) (-bArr32222222222[i12]), (short) 7577, objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            if (i11 >= 1248) {
                            }
                            if (i11 >= 1324) {
                            }
                            objArr8 = new java.lang.Object[1];
                            a(bArr32222222222[7149], (short) (-bArr32222222222[i12]), (short) 7577, objArr8);
                            if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                            }
                            if (i11 >= 1417) {
                            }
                            if (i11 >= 1448) {
                            }
                            objArr9 = new java.lang.Object[1];
                            a(bArr32222222222[7149], (short) (-bArr32222222222[i12]), (short) 7577, objArr9);
                            if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                            }
                            if (i11 >= 1539) {
                            }
                            if (i11 >= 1582) {
                            }
                            c = 7149;
                            objArr10 = new java.lang.Object[1];
                            a(bArr32222222222[7149], (short) (-bArr32222222222[i12]), (short) 7577, objArr10);
                            if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                            }
                            if (i11 >= 1784) {
                            }
                        }
                        break;
                    case -24:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i33 = settranslationz4.DigitizedCardProfile;
                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                        a(r6[c3], (short) (-AlternateContactlessPaymentDataJson[17]), (short) 7171, objArr153);
                        newInstance2 = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr153[0]), i33);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -23:
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Class cls49 = (java.lang.Class) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.String str12 = (java.lang.String) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        newInstance2 = cls49.getDeclaredMethod(str12, (java.lang.Class[]) settranslationz4.getProfileVersion);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -22:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = new java.lang.Class[settranslationz4.DigitizedCardProfile];
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -21:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        newInstance2 = java.lang.Class.forName((java.lang.String) settranslationz4.getProfileVersion);
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -20:
                        settranslationz4.valueOf = 1940L;
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i10 = 68;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        i10 = 43;
                    case -17:
                        settranslationz4.AlternateContactlessPaymentDataJson(21);
                        if (settranslationz4.DigitizedCardProfile == 0) {
                            i10 = 42;
                        } else {
                            i2 = i;
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        }
                    case -16:
                        settranslationz4.valueOf = -1L;
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -15:
                        java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.graphics.Color.rgb(0, 0, 0) + 16777883, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 40023));
                        byte[] bArr43 = $$a;
                        java.lang.Object[] objArr154 = new java.lang.Object[1];
                        d(bArr43[14], bArr43[0], 54, objArr154);
                        j3 = cls50.getField((java.lang.String) objArr154[0]).getLong(null);
                        settranslationz4.valueOf = j3;
                        i2 = i;
                        settranslationz4.AlternateContactlessPaymentDataJson(8);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -14:
                        try {
                            byte b33 = (byte) (getAid & 127);
                            byte[] bArr44 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr155 = new java.lang.Object[1];
                            a(b33, (short) (-bArr44[7049]), (short) 7128, objArr155);
                            java.lang.Class<?> cls51 = java.lang.Class.forName((java.lang.String) objArr155[0]);
                            java.lang.Object[] objArr156 = new java.lang.Object[1];
                            a((byte) (-bArr44[17]), (short) (-bArr44[7079]), (short) 7148, objArr156);
                            intValue3 = ((java.lang.Integer) cls51.getMethod((java.lang.String) objArr156[0], null).invoke(null, null)).intValue();
                            settranslationz4.AlternateContactlessPaymentDataJson = intValue3;
                            i2 = i;
                            settranslationz4.AlternateContactlessPaymentDataJson(14);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th46) {
                            java.lang.Throwable cause29 = th46.getCause();
                            if (cause29 != null) {
                                throw cause29;
                            }
                            throw th46;
                        }
                    case -13:
                        newInstance2 = "胣肀멦䏙☐빽헶卑枮嫺ﳘ檺仃爌\ue798ֺ㗸ᕅ轨᳂ᰬⱢ";
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -12:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr157 = {java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            byte b34 = (byte) (getAid & 127);
                            byte[] bArr45 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr158 = new java.lang.Object[1];
                            a(b34, bArr45[7057], (short) 7094, objArr158);
                            java.lang.Class<?> cls52 = java.lang.Class.forName((java.lang.String) objArr158[0]);
                            java.lang.Object[] objArr159 = new java.lang.Object[1];
                            a((byte) (-bArr45[17]), bArr45[i], (short) 7122, objArr159);
                            intValue3 = ((java.lang.Integer) cls52.getMethod((java.lang.String) objArr159[0], java.lang.Integer.TYPE).invoke(null, objArr157)).intValue();
                            settranslationz4.AlternateContactlessPaymentDataJson = intValue3;
                            i2 = i;
                            settranslationz4.AlternateContactlessPaymentDataJson(14);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th47) {
                            java.lang.Throwable cause30 = th47.getCause();
                            if (cause30 != null) {
                                throw cause30;
                            }
                            throw th47;
                        }
                    case -11:
                        newInstance2 = "\ueda6\uedc7턀⢤뇅邝䈵綱ૡ㆛欝䐵⎗ᥪ灑⬝墟縡ᢽ㈢煰䜃ↅᤚ渺곺웫\ue1de蜷뗞";
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -10:
                        settranslationz4.AlternateContactlessPaymentDataJson = 2;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        int i34 = settranslationz4.DigitizedCardProfile;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        try {
                            java.lang.Object[] objArr160 = {java.lang.Integer.valueOf(i34), java.lang.Integer.valueOf(settranslationz4.DigitizedCardProfile)};
                            byte b35 = (byte) (getAid & 127);
                            byte[] bArr46 = AlternateContactlessPaymentDataJson;
                            short s17 = bArr46[6985];
                            java.lang.Object[] objArr161 = new java.lang.Object[1];
                            a(b35, s17, (short) (s17 | 7049), objArr161);
                            java.lang.Class<?> cls53 = java.lang.Class.forName((java.lang.String) objArr161[0]);
                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                            a((byte) (-bArr46[17]), bArr46[7122], (short) 7081, objArr162);
                            intValue3 = ((java.lang.Integer) cls53.getMethod((java.lang.String) objArr162[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr160)).intValue();
                            settranslationz4.AlternateContactlessPaymentDataJson = intValue3;
                            i2 = i;
                            settranslationz4.AlternateContactlessPaymentDataJson(14);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th48) {
                            java.lang.Throwable cause31 = th48.getCause();
                            if (cause31 != null) {
                                throw cause31;
                            }
                            throw th48;
                        }
                    case -9:
                        newInstance2 = "鐈鑭☕\udfb3᭸Ꮒ\ue88dﻬ獓욂솠윖娽\uee6e\udaf0ꠘℙ褺눑";
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -8:
                        settranslationz4.AlternateContactlessPaymentDataJson = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object obj30 = settranslationz4.getProfileVersion;
                        try {
                            java.lang.Object[] objArr163 = new java.lang.Object[1];
                            a(r6[c3], (short) (-AlternateContactlessPaymentDataJson[17]), (short) 6979, objArr163);
                            java.lang.Class<?> cls54 = java.lang.Class.forName((java.lang.String) objArr163[0]);
                            java.lang.Object[] objArr164 = new java.lang.Object[1];
                            a(r6[7122], r6[18], (short) 7060, objArr164);
                            newInstance2 = cls54.getMethod((java.lang.String) objArr164[0], null).invoke(obj30, null);
                            settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                            i2 = i;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th49) {
                            java.lang.Throwable cause32 = th49.getCause();
                            if (cause32 != null) {
                                throw cause32;
                            }
                            throw th49;
                        }
                    case -7:
                        settranslationz4.AlternateContactlessPaymentDataJson = 2;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.String str13 = (java.lang.String) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                        c(str13, settranslationz4.DigitizedCardProfile, objArr165);
                        newInstance2 = (java.lang.String) objArr165[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -6:
                        try {
                            byte b36 = (byte) (getAid & 127);
                            byte[] bArr47 = AlternateContactlessPaymentDataJson;
                            short s18 = bArr47[7022];
                            java.lang.Object[] objArr166 = new java.lang.Object[1];
                            a(b36, s18, (short) (s18 | 7010), objArr166);
                            java.lang.Class<?> cls55 = java.lang.Class.forName((java.lang.String) objArr166[0]);
                            java.lang.Object[] objArr167 = new java.lang.Object[1];
                            a((byte) (-bArr47[17]), bArr47[6985], (short) 7044, objArr167);
                            j3 = ((java.lang.Long) cls55.getMethod((java.lang.String) objArr167[0], null).invoke(null, null)).longValue();
                            settranslationz4.valueOf = j3;
                            i2 = i;
                            settranslationz4.AlternateContactlessPaymentDataJson(8);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th50) {
                            java.lang.Throwable cause33 = th50.getCause();
                            if (cause33 != null) {
                                throw cause33;
                            }
                            throw th50;
                        }
                    case -5:
                        newInstance2 = "ꥺꤛ\ue960Ⴤ⚡\u09ca핑\ue4e6丽৻ﱹ\udd62杅℉\ue76b눷ᱻ䙑这ꭹ㖷罉뛹聛⫑钙";
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -4:
                        settranslationz4.AlternateContactlessPaymentDataJson = 3;
                        settranslationz4.AlternateContactlessPaymentDataJson(3);
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.String str14 = (java.lang.String) settranslationz4.getProfileVersion;
                        settranslationz4.AlternateContactlessPaymentDataJson(5);
                        boolean z = settranslationz4.DigitizedCardProfile != 0;
                        settranslationz4.AlternateContactlessPaymentDataJson(4);
                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                        b(str14, z, (int[]) settranslationz4.getProfileVersion, objArr168);
                        newInstance2 = (java.lang.String) objArr168[0];
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -3:
                        try {
                            newInstance2 = new int[]{0, i, 0, 4};
                            settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                            i2 = i;
                            i7 = 1;
                            settranslationz4.AlternateContactlessPaymentDataJson(i7);
                            i10 = i11;
                            i = i2;
                            c3 = 7149;
                        } catch (java.lang.Throwable th51) {
                            th = th51;
                            i2 = i;
                            i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE;
                            settranslationz = settranslationz4;
                            if (i11 >= 103) {
                            }
                            byte[] bArr322222222222 = AlternateContactlessPaymentDataJson;
                            objArr = new java.lang.Object[1];
                            a(bArr322222222222[7149], (short) (-bArr322222222222[i12]), (short) 7577, objArr);
                            if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(th)) {
                            }
                            if (i11 >= 172) {
                            }
                            if (i11 >= 227) {
                            }
                            if (i11 >= 318) {
                            }
                            objArr2 = new java.lang.Object[1];
                            a(bArr322222222222[7149], (short) (-bArr322222222222[i12]), (short) 7577, objArr2);
                            if (!java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            if (i11 >= 379) {
                            }
                            if (i11 >= 469) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr322222222222[7149], (short) (-bArr322222222222[i12]), (short) 7577, objArr3);
                            if (!java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            if (i11 >= 527) {
                            }
                            if (i11 >= 564) {
                            }
                            if (i11 >= 637) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr322222222222[7149], (short) (-bArr322222222222[i12]), (short) 7577, objArr4);
                            if (!java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            if (i11 >= 681) {
                            }
                            if (i11 >= 726) {
                            }
                            if (i11 >= 813) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr322222222222[7149], (short) (-bArr322222222222[i12]), (short) 7577, objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            if (i11 >= 868) {
                            }
                            if (i11 >= 908) {
                            }
                            if (i11 >= 1039) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr322222222222[7149], (short) (-bArr322222222222[i12]), (short) 7577, objArr6);
                            if (!java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i11 >= 1120) {
                            }
                            if (i11 >= 1158) {
                            }
                            objArr7 = new java.lang.Object[1];
                            a(bArr322222222222[7149], (short) (-bArr322222222222[i12]), (short) 7577, objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            if (i11 >= 1248) {
                            }
                            if (i11 >= 1324) {
                            }
                            objArr8 = new java.lang.Object[1];
                            a(bArr322222222222[7149], (short) (-bArr322222222222[i12]), (short) 7577, objArr8);
                            if (!java.lang.Class.forName((java.lang.String) objArr8[0]).isInstance(th)) {
                            }
                            if (i11 >= 1417) {
                            }
                            if (i11 >= 1448) {
                            }
                            objArr9 = new java.lang.Object[1];
                            a(bArr322222222222[7149], (short) (-bArr322222222222[i12]), (short) 7577, objArr9);
                            if (!java.lang.Class.forName((java.lang.String) objArr9[0]).isInstance(th)) {
                            }
                            if (i11 >= 1539) {
                            }
                            if (i11 >= 1582) {
                            }
                            c = 7149;
                            objArr10 = new java.lang.Object[1];
                            a(bArr322222222222[7149], (short) (-bArr322222222222[i12]), (short) 7577, objArr10);
                            if (!java.lang.Class.forName((java.lang.String) objArr10[0]).isInstance(th)) {
                            }
                            if (i11 >= 1784) {
                            }
                        }
                        break;
                    case -2:
                        newInstance2 = "\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000";
                        settranslationz4.IccPrivateKeyCrtComponentsJson = newInstance2;
                        i2 = i;
                        i7 = 1;
                        settranslationz4.AlternateContactlessPaymentDataJson(i7);
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                    case -1:
                        i10 = 1625;
                    default:
                        i2 = i;
                        i10 = i11;
                        i = i2;
                        c3 = 7149;
                }
            }
        } catch (java.lang.Throwable th52) {
            java.lang.Throwable cause34 = th52.getCause();
            if (cause34 != null) {
                throw cause34;
            }
            throw th52;
        }
    }

    static void init$0() {
        $$a = new byte[]{7, -84, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FF, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, 19, -13, -11, 14, com.google.common.base.Ascii.DC4, -25, -39, 0, -4, -13, 9, -19, 19, -1, com.google.common.base.Ascii.US, -32, -19, com.google.common.base.Ascii.FF, 18, -36, 1, 7, -5, -5, 5, 3, 7, -13, 13, 17, -21, -13, 2, 9, -4, -4, -19, -9, 38, -46, -5, com.google.common.base.Ascii.VT, 34, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.SYN, -38, -5, 2, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = 103;
    }
}
