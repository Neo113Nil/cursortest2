package com.payair.hce;

/* loaded from: classes4.dex */
public final class setIndicatorBounds {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;
    private static final com.payair.hce.setShowSoftInputOnFocus writeReplace = new com.payair.hce.setShowSoftInputOnFocus() { // from class: com.payair.hce.setIndicatorBounds.1
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int AlternateContactlessPaymentDataJson;
        private static boolean DigitizedCardProfile;
        private static char[] values;
        private static boolean writeReplace;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, int i, short s2, java.lang.Object[] objArr) {
            int i2;
            int i3;
            byte[] bArr = $$a;
            int i4 = 1 - (s * 3);
            int i5 = 118 - (i * 3);
            int i6 = s2 + 4;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i7 = i6;
                i3 = 0;
                i5 += i6;
                i6 = i7;
                i2 = i3;
                i3 = i2 + 1;
                int i8 = i6 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i4) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i7 = i8;
                i6 = bArr[i8];
                i5 += i6;
                i6 = i7;
                i2 = i3;
                i3 = i2 + 1;
                int i82 = i6 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i4) {
                }
            } else {
                i2 = 0;
                i3 = i2 + 1;
                int i822 = i6 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i4) {
                }
            }
        }

        {
            com.payair.hce.setTextSelectHandleRight settextselecthandleright = new com.payair.hce.setTextSelectHandleRight();
            com.payair.hce.setBreakStrategy setbreakstrategy = new com.payair.hce.setBreakStrategy();
            com.payair.hce.setTextAppearance settextappearance = new com.payair.hce.setTextAppearance();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(null, null, android.graphics.Color.red(0) + 127, "\u008e\u008d\u0081\u0082\u0090\u0088\u008b\u008a\u0089\u0082\u0088\u0087\u0086\u008f\u0084\u008e\u008d\u0081\u0082\u008c\u0084\u0088\u008b\u008a\u0089\u0082\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            } catch (java.lang.ClassNotFoundException unused) {
            }
            this.valueOf = true;
        }

        private static void a(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
            int length;
            char[] cArr;
            java.lang.String str3 = str2;
            byte[] bArr = str3;
            if (str3 != null) {
                int i2 = $10 + 77;
                $11 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                bArr = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] charArray = str != null ? str.toCharArray() : str;
            com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
            char[] cArr2 = values;
            long j = 0;
            int i3 = 1;
            if (cArr2 != null) {
                int i4 = $11 + 61;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                int i5 = 0;
                while (i5 < length) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i3];
                        objArr2[0] = java.lang.Integer.valueOf(cArr2[i5]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.graphics.ImageFormat.getBitsPerPixel(0), 285 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                        }
                        cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i5++;
                        j = 0;
                        i3 = 1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            }
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 287 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", "") + 46337))).getMethod("x", java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
            if (DigitizedCardProfile) {
                $11 = ($10 + 89) % 128;
                getumdgeneration.values = bArr2.length;
                char[] cArr3 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
                while (getumdgeneration.valueOf < getumdgeneration.values) {
                    cArr3[getumdgeneration.valueOf] = (char) (cArr2[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                    java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 1629, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((short) 0, 0, (short) -1, objArr5);
                        obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                    $10 = ($11 + 1) % 128;
                }
                objArr[0] = new java.lang.String(cArr3);
                return;
            }
            if (!writeReplace) {
                getumdgeneration.values = iArr.length;
                char[] cArr4 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
                while (getumdgeneration.valueOf < getumdgeneration.values) {
                    int i6 = $10 + 27;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr4[getumdgeneration.valueOf] = (char) (cArr2[iArr[getumdgeneration.values % getumdgeneration.valueOf] % i] % intValue);
                        int i7 = getumdgeneration.valueOf;
                        throw new java.lang.ArithmeticException();
                    }
                    cArr4[getumdgeneration.valueOf] = (char) (cArr2[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    getumdgeneration.valueOf++;
                }
                objArr[0] = new java.lang.String(cArr4);
                return;
            }
            getumdgeneration.values = charArray.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i8 = $11 + 41;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = getumdgeneration.valueOf;
                    int i10 = getumdgeneration.values;
                    throw new java.lang.ArithmeticException();
                }
                cArr5[getumdgeneration.valueOf] = (char) (cArr2[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42, 1629 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((short) 0, 0, (short) -1, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr5);
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            values = new char[]{10887, 10904, 10895, 10948, 10894, 10881, 10888, 10893, 10884, 10889, 10906, 10886, 10910, 10897, 10926, 10918};
            AlternateContactlessPaymentDataJson = -143185386;
            writeReplace = true;
            DigitizedCardProfile = true;
        }

        static void init$0() {
            $$a = new byte[]{120, 91, -87, 14};
            $$b = 35;
        }
    };

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    static {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 81;
        int i3 = (i | 81) & (~i2);
        int i4 = -(-(i2 << 1));
        DigitizedCardProfile = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = AlternateContactlessPaymentDataJson + 37;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            return writeReplace;
        }
        throw null;
    }

    public static com.payair.hce.setShowSoftInputOnFocus writeReplace() {
        return (com.payair.hce.setShowSoftInputOnFocus) valueOf(new java.lang.Object[0], 929288829, -929288829, (int) java.lang.System.currentTimeMillis());
    }
}
