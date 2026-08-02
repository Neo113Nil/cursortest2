package com.payair.hce;

/* loaded from: classes4.dex */
public final class getP extends com.payair.hce.getMagstripeCvmIssuerOptions<java.sql.Date> {
    public static final com.payair.hce.getCardholderValidators values = new com.payair.hce.getCardholderValidators() { // from class: com.payair.hce.getP.1
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static long AlternateContactlessPaymentDataJson;
        private static int valueOf;
        private static int values;
        private static int writeReplace;

        private static void a(short s, int i, byte b, java.lang.Object[] objArr) {
            int i2 = (s * 3) + 65;
            int i3 = i * 4;
            int i4 = b + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[35 - i3];
            int i5 = 34 - i3;
            int i6 = -1;
            if (bArr == null) {
                i2 = (i5 + i4) - 2;
                i4 = i4;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                int i8 = i4 + 1;
                bArr2[i7] = (byte) i2;
                if (i7 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                } else {
                    i2 = (i2 + bArr[i8]) - 2;
                    i4 = i8;
                    i6 = i7;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(short s, short s2, int i, java.lang.Object[] objArr) {
            int i2;
            int i3 = (s2 * 2) + 4;
            byte[] bArr = $$d;
            int i4 = (i * 2) + 115;
            int i5 = s * 3;
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                int i6 = i5;
                int i7 = 0;
                i4 = (-i4) + i6;
                i3++;
                i2 = i7;
                bArr2[i2] = (byte) i4;
                if (i2 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i8 = i2 + 1;
                i6 = i4;
                i4 = bArr[i3];
                i7 = i8;
                i4 = (-i4) + i6;
                i3++;
                i2 = i7;
                bArr2[i2] = (byte) i4;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i4;
                if (i2 == i5) {
                }
            }
        }

        private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                $10 = ($11 + 109) % 128;
                cArr = str.toCharArray();
                $11 = ($10 + 7) % 128;
            } else {
                cArr = str;
            }
            com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
            char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(AlternateContactlessPaymentDataJson ^ (-3824242241614154557L), cArr, i);
            getcardholdervalidator.valueOf = 4;
            while (getcardholdervalidator.valueOf < writeReplace2.length) {
                getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
                int i2 = getcardholdervalidator.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.MeasureSpec.getSize(0), 1921 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.os.Process.myTid() >> 22));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((short) 0, (short) 0, 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                    }
                    writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myPid() >> 22), 429 - (android.os.Process.myTid() >> 22), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31609));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 0, (short) 0, 2, objArr5);
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

        private static void c(java.lang.String str, boolean z, int i, int i2, int i3, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                $10 = ($11 + 13) % 128;
                cArr = str.toCharArray();
                $10 = ($11 + 69) % 128;
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
                cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
                int i4 = digitizedCardJson11.DigitizedCardProfile;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(values)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 43, 2073 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.os.Process.myPid() >> 22) + 60037));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((short) 0, (short) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                    }
                    cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777269, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3544, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                    $10 = ($11 + 111) % 128;
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
                char[] cArr4 = new char[i3];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
                java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            }
            if (z) {
                char[] cArr5 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
                while (digitizedCardJson11.DigitizedCardProfile < i3) {
                    int i5 = $11 + 19;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = digitizedCardJson11.DigitizedCardProfile;
                        int i7 = digitizedCardJson11.DigitizedCardProfile;
                        throw new java.lang.ArithmeticException();
                    }
                    cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 3543 - android.graphics.Color.red(0), (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                }
                cArr3 = cArr5;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        @Override // com.payair.hce.getCardholderValidators
        public final <T> com.payair.hce.getMagstripeCvmIssuerOptions<T> DigitizedCardProfile(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided<T> getpinalwaysrequiredifcurrencyprovided) {
            if (getpinalwaysrequiredifcurrencyprovided.values != java.sql.Date.class) {
                int i = valueOf + 55;
                writeReplace = i % 128;
                if (i % 2 == 0) {
                    return null;
                }
                throw null;
            }
            com.payair.hce.getP getp = new com.payair.hce.getP();
            int i2 = writeReplace + 39;
            valueOf = i2 % 128;
            if (i2 % 2 != 0) {
                return getp;
            }
            throw new java.lang.ArithmeticException();
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            writeReplace = 0;
            valueOf = 1;
            AlternateContactlessPaymentDataJson = 7612533827683908350L;
            values = 1889207268;
        }

        static void init$1() {
            $$d = new byte[]{com.google.common.base.Ascii.DC4, -107, -36, -117};
            $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r11v70, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r20v0 */
        /* JADX WARN: Type inference failed for: r20v13 */
        /* JADX WARN: Type inference failed for: r20v2 */
        /* JADX WARN: Type inference failed for: r20v4, types: [int] */
        /* JADX WARN: Type inference failed for: r20v6 */
        /* JADX WARN: Type inference failed for: r20v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v130, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v21 */
        /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v45 */
        /* JADX WARN: Type inference failed for: r5v56 */
        /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v71 */
        /* JADX WARN: Type inference failed for: r5v81, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v104 */
        /* JADX WARN: Type inference failed for: r7v108 */
        /* JADX WARN: Type inference failed for: r7v109 */
        /* JADX WARN: Type inference failed for: r7v110 */
        /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r7v55 */
        /* JADX WARN: Type inference failed for: r7v57 */
        /* JADX WARN: Type inference failed for: r7v58 */
        /* JADX WARN: Type inference failed for: r7v71 */
        /* JADX WARN: Type inference failed for: r7v89 */
        /* JADX WARN: Type inference failed for: r7v90 */
        /* JADX WARN: Type inference failed for: r7v92 */
        public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2) {
            ?? r7;
            ?? r20;
            java.lang.Object obj;
            java.lang.Integer num;
            java.lang.CharSequence charSequence;
            int i3;
            ?? r11;
            int i4;
            ?? r5 = 0;
            try {
                if (context == null) {
                    java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                    ?? r112 = {java.lang.Integer.valueOf(i2), r5, java.lang.Integer.valueOf(((((~((-113568877) | r2)) | (~((-891360109) | i))) * (-370)) - 833501688) + (((~(i | (-113568877))) | (~((~i) | (-891360109))) | (-937820013)) * (-370)) + 898946166)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                        byte b = $$a[14];
                        byte b2 = (byte) (b - 1);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(b2, b2, (byte) (-b), objArr2);
                        obj2 = cls.getMethod((java.lang.String) objArr2[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, r112)).intValue();
                    return objArr;
                }
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b("\uf347\uf32dථ\uf6b3풟ϲ\ueabf﹉쯋䪱ꎮ띑苌跾碣䡩姯듎㇋ŭტￗ\uf691\uda36\ueffb⚚쾽鏔ꛑ渃蒴哀緛鄗巧涕㒉\ud810ዀ⚸\uf3b2̓", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr3);
                    r11 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr3[0]), 2);
                    try {
                        int axisFromString = android.view.MotionEvent.axisFromString("");
                        int i5 = axisFromString * (-209);
                        int i6 = ~axisFromString;
                        int i7 = ((-45771) & i5) + (i5 | (-45771)) + ((~((i6 ^ (-220)) | (i6 & (-220)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                        i4 = ~i;
                        int i8 = ((~((i4 & (-220)) | (i4 ^ (-220)))) | (~((i6 ^ i) | (i6 & i)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                        int i9 = (i6 ^ i4) | (i6 & i4);
                        int i10 = ~((i9 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE) | (i9 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE));
                        int i11 = (axisFromString & (-220)) | (axisFromString ^ (-220));
                        int i12 = ~((i11 ^ i) | (i11 & i));
                        int i13 = -(-(((i12 ^ i10) | (i12 & i10)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        r20 = (minimumFlingVelocity & 1) + (minimumFlingVelocity | 1);
                        c("￮\ufffe\u0000￨￮ￗ\u000f\u0014\u001a\u001d\u000f\u0019￬￨\ufffaￗ\u0012 \r\u0010\uffefￋ\u000f\u0014\u001a\u001d\u000f\u0019￬￨\ufff9", true, ((((i7 | i8) << 1) - (i8 ^ i7)) - (~i13)) - 1, r20, 30 - (~android.view.KeyEvent.getDeadChar(0, 0)), objArr4);
                        r7 = (java.lang.String) objArr4[0];
                    } catch (java.lang.Throwable unused) {
                        num = -1347122530;
                        obj = r5;
                        charSequence = "";
                        i3 = 1;
                    }
                } catch (java.lang.Throwable unused2) {
                    r7 = -1347122530;
                    r20 = r5;
                    r5 = "";
                }
                try {
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b("\uf347\uf32dථ\uf6b3풟ϲ\ueabf﹉쯋䪱ꎮ띑苌跾碣䡩姯듎㇋ŭტￗ\uf691\uda36\ueffb⚚쾽鏔ꛑ渃蒴哀緛鄗巧涕㒉\ud810ዀ⚸\uf3b2̓", 0 - (~(android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr5);
                        r7 = java.lang.Class.forName((java.lang.String) objArr5[0]).getDeclaredConstructor(java.lang.String.class).newInstance(r7);
                        r11[0] = r7;
                        int defaultSize = android.view.View.getDefaultSize(0, 0);
                        int i14 = ~defaultSize;
                        int i15 = ~((i14 ^ i) | (i14 & i));
                        int i16 = ~((i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE) | (i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE));
                        int i17 = ((defaultSize * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION) - 196854) + (((i15 ^ i16) | (i15 & i16)) * (-1808));
                        int i18 = ~((i14 & (-219)) | (i14 ^ (-219)) | i);
                        int i19 = (defaultSize & i4) | (i4 ^ defaultSize);
                        int i20 = ~(i19 | com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE);
                        int i21 = ((i18 ^ i20) | (i18 & i20)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
                        int i22 = (~((i14 & com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE) | (i14 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE))) | (~((i & (-219)) | (i ^ (-219))));
                        int i23 = ~i19;
                        int i24 = -android.graphics.ImageFormat.getBitsPerPixel(0);
                        int i25 = -(-android.graphics.Color.green(0));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        r20 = (i24 & 25) + (i24 | 25);
                        c("\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮\ufff9￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012￮￨\u0000\ufffeￗ", false, (i17 ^ i21) + ((i21 & i17) << 1) + (((i23 ^ i22) | (i23 & i22)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN), r20, (i25 & 31) + (i25 | 31), objArr6);
                        r7 = (java.lang.String) objArr6[0];
                        try {
                            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b("\uf347\uf32dථ\uf6b3풟ϲ\ueabf﹉쯋䪱ꎮ띑苌跾碣䡩姯듎㇋ŭტￗ\uf691\uda36\ueffb⚚쾽鏔ꛑ渃蒴哀緛鄗巧涕㒉\ud810ዀ⚸\uf3b2̓", (doubleTapTimeout & 1) + (doubleTapTimeout | 1), objArr7);
                            r7 = java.lang.Class.forName((java.lang.String) objArr7[0]).getDeclaredConstructor(java.lang.String.class).newInstance(r7);
                            r11[1] = r7;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable unused3) {
                    }
                    try {
                        int myTid = android.os.Process.myTid() >> 22;
                        int i26 = myTid * (-167);
                        int i27 = ~((~myTid) | (-235));
                        int i28 = ~((i & (-235)) | (i ^ (-235)));
                        int i29 = ((((-39078) & i26) + (i26 | (-39078))) - (~(-(-(((i27 & i28) | (i27 ^ i28)) * 336))))) - 1;
                        int i30 = ~((myTid ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) | (myTid & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE));
                        int i31 = ~((myTid ^ i) | (myTid & i));
                        int i32 = ((i30 ^ i31) | (i30 & i31)) * (-168);
                        int i33 = (i29 & i32) + (i32 | i29);
                        int i34 = ~((myTid ^ i4) | (myTid & i4));
                        int i35 = ((i34 ^ (-235)) | (i34 & (-235))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                        int i36 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                        int i37 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i38 = i37 * (-1939);
                        int i39 = ((i38 | 23304) << 1) - (i38 ^ 23304);
                        int i40 = ~((i37 & (-25)) | (i37 ^ (-25)));
                        int i41 = ~((i4 ^ 24) | (i4 & 24));
                        int i42 = -(-(((i40 ^ i41) | (i40 & i41)) * (-970)));
                        int i43 = (i39 ^ i42) + ((i42 & i39) << 1);
                        int i44 = ~i37;
                        int i45 = (~(i44 | 24)) * 1940;
                        int i46 = (i43 & i45) + (i45 | i43);
                        int i47 = ~((i44 ^ (-25)) | (i44 & (-25)));
                        int i48 = -(-(((i47 ^ i41) | (i47 & i41)) * 970));
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        c("\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼\u000f\u0013\u0000\u000f\t\n", true, (i33 & i35) + (i35 | i33), 16 - (~i36), ((i46 | i48) << 1) - (i48 ^ i46), objArr8);
                        r7 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                        int i49 = -(android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                        int i50 = (i49 * (-1939)) + 226243;
                        int i51 = ~((i49 & (-234)) | (i49 ^ (-234)));
                        int i52 = ~((i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE) | (i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE));
                        int i53 = ((i51 ^ i52) | (i51 & i52)) * (-970);
                        int i54 = (i50 & i53) + (i50 | i53);
                        int i55 = ~i49;
                        int i56 = (~(i55 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE)) * 1940;
                        int i57 = ((i54 | i56) << 1) - (i56 ^ i54);
                        int i58 = ~((i55 ^ (-234)) | (i55 & (-234)));
                        int i59 = ((i58 ^ i52) | (i58 & i52)) * 970;
                        int i60 = -android.graphics.Color.blue(0);
                        int i61 = i60 * (-661);
                        int i62 = (i61 ^ (-11237)) + ((i61 & (-11237)) << 1);
                        int i63 = ~i60;
                        int i64 = ~((i63 & (-18)) | (i63 ^ (-18)));
                        int i65 = -(-(((i64 & i4) | (i64 ^ i4)) * 1324));
                        int i66 = ~((i60 ^ i) | (i60 & i));
                        int i67 = ~(i | 17);
                        int i68 = ~(i63 | 17);
                        int i69 = ~((i60 & (-18)) | (i60 ^ (-18)));
                        int i70 = -(-(((i69 & i68) | (i69 ^ i68)) * 662));
                        r20 = r5;
                        try {
                            int i71 = -android.view.View.resolveSizeAndState(0, 0, 0);
                            int i72 = i71 * (-716);
                            int i73 = ~i71;
                            java.lang.Object[] objArr9 = r11;
                            int i74 = (i72 & 24395) + (i72 | 24395) + (((i73 ^ 17) | (i73 & 17)) * (-1434));
                            int i75 = ~((i4 ^ 17) | (i4 & 17));
                            int i76 = ~((i71 ^ 17) | (i71 & 17));
                            int i77 = (i75 ^ i76) | (i75 & i76);
                            int i78 = i73 | (-18);
                            java.lang.String str = "";
                            int i79 = ~((i78 ^ i) | (i78 & i));
                            int i80 = ((i77 ^ i79) | (i79 & i77)) * 717;
                            int i81 = (~(i78 | i4)) | i76;
                            r5 = 1;
                            try {
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                c("\u0003\u0001\u0010￬�\uffff\u0007�\u0003\u0001￩�\n�\u0003\u0001\u000e", false, ((i57 | i59) << 1) - (i59 ^ i57), ((((i62 ^ i65) + ((i65 & i62) << 1)) + (((i66 & i67) | (i66 ^ i67)) * (-1324))) - (~i70)) - 1, (i74 ^ i80) + ((i80 & i74) << 1) + (((i81 & i67) | (i81 ^ i67)) * 717), objArr10);
                                java.lang.Object invoke = r7.getMethod((java.lang.String) objArr10[0], null).invoke(context, null);
                                try {
                                    int touchSlop = android.view.ViewConfiguration.getTouchSlop() >> 8;
                                    int i82 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    c("\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼\u000f\u0013\u0000\u000f\t\n", true, ((touchSlop | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE) << 1) - (touchSlop ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE), ((i82 | 17) << 1) - (i82 ^ 17), 22 - (~(-(-android.view.KeyEvent.normalizeMetaState(0)))), objArr11);
                                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                    int alpha = android.graphics.Color.alpha(0);
                                    int i83 = (alpha * (-501)) + 503;
                                    r7 = i & (-2);
                                    int i84 = ~((i ^ (-2)) | r7);
                                    int i85 = ~((alpha ^ 1) | (alpha & 1));
                                    int i86 = ((i84 & i85) | (i84 ^ i85)) * (-502);
                                    int i87 = (i83 ^ i86) + ((i83 & i86) << 1);
                                    int i88 = (~(i4 | (-2) | alpha)) * (-502);
                                    int i89 = ~((~alpha) | i);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    b("讌诫뱶ᴟ톣눮đפּ댙ﬤ䠚뉩糖㰶錳䵝ℽԊ", (i87 & i88) + (i88 | i87) + (((i89 & (-2)) | (i89 ^ (-2))) * 502), objArr12);
                                    r5 = (java.lang.String) objArr12[0];
                                    try {
                                        java.lang.Object[] objArr13 = {cls2.getMethod(r5, null).invoke(context, null), 64};
                                        int resolveSize = android.view.View.resolveSize(0, 0);
                                        int i90 = -android.view.View.MeasureSpec.getMode(0);
                                        float f = 0.0f;
                                        int i91 = -(-(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        c("\u0001\t\uffff\u0005\u0003￫\uffff\f\uffff\u0005\u0003\u0010\uffff\f\u0002\u0010\r\u0007\u0002ￌ\u0001\r\f\u0012\u0003\f\u0012ￌ\u000e\u000bￌ￮\uffff", false, 231 - resolveSize, (i90 & 12) + (i90 | 12), ((i91 | 32) << 1) - (i91 ^ 32), objArr14);
                                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                        int i92 = -(android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        b("衡蠆ᓷ幯韐\u1aaf䉡봷냴厥୪\uf41a燐钷큄ଡ⋛궁", (i92 ^ 1) + ((i92 & 1) << 1), objArr15);
                                        r5 = (java.lang.String) objArr15[0];
                                        java.lang.Object invoke2 = cls3.getMethod(r5, java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr13);
                                        try {
                                            int i93 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            int i94 = -(-android.view.KeyEvent.getDeadChar(0, 0));
                                            int i95 = -(-(android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                                            c("\fￍ\uffef\u0000\u0002\n\u0000\u0006\u0004￨\r\u0005\u000e\u0000\r\u0003\u0011\u000e\b\u0003ￍ\u0002\u000e\r\u0013\u0004\r\u0013ￍ\u000f", false, (i93 ^ 231) + ((i93 & 231) << 1), (i94 & 13) + (i94 | 13), (i95 & 30) + (i95 | 30), objArr16);
                                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                                            int i96 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                            int i97 = i96 * 714;
                                            int i98 = (i97 & (-712)) + (i97 | (-712));
                                            int i99 = ~i96;
                                            int i100 = ~((i99 ^ i4) | (i99 & i4));
                                            int i101 = ~((i99 & 1) | (i99 ^ 1));
                                            int i102 = (i101 & i100) | (i100 ^ i101);
                                            int i103 = i96 | (-2);
                                            int i104 = ~((i103 & i) | (i103 ^ i));
                                            int i105 = ((i102 & i104) | (i102 ^ i104)) * (-713);
                                            int i106 = ((i98 | i105) << 1) - (i105 ^ i98);
                                            int i107 = (~((i96 ^ (-2)) | (i96 & (-2)) | i)) * 1426;
                                            int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
                                            int i109 = (~((i4 ^ (-2)) | (i4 & (-2)))) * 713;
                                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                                            b("ﭐﬣ䜴ᆐ塇䥠ඍ犞쏅q䒋㮞諝읢", ((i108 | i109) << 1) - (i109 ^ i108), objArr17);
                                            java.lang.Object[] objArr18 = (java.lang.Object[]) cls4.getField((java.lang.String) objArr17[0]).get(invoke2);
                                            int length = objArr18.length;
                                            int i110 = 0;
                                            r7 = r7;
                                            while (i110 < length) {
                                                java.lang.Object obj3 = objArr18[i110];
                                                int i111 = -(android.os.Process.myTid() >> 22);
                                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                b("앝씅俭䫿\ue6c9䇾嚰챎\ufd90", (i111 ^ 1) + ((i111 & 1) << 1), objArr19);
                                                r5 = 0;
                                                try {
                                                    java.lang.Object[] objArr20 = {(java.lang.String) objArr19[0]};
                                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                    b("\uf190\uf1fa蔼雚퀇譠論𣏕쥊쉾쏑돏耍իᣑ䳬嬵㰋凯ױሲ睅难\udec3\ued31깏꾐霕ꑎ\ue6a0\ue48b倉罈ᦰ㶺椅㙓傕犯∢\uf17d", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr21);
                                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                                    int i112 = -(android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                    int i113 = -(-android.graphics.Color.green(0));
                                                    int i114 = (android.util.TypedValue.complexToFraction(0, f, f) > f ? 1 : (android.util.TypedValue.complexToFraction(0, f, f) == f ? 0 : -1));
                                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                    c("\f\r\ufffa\u0007￼\ufffe\u0000\ufffe\r￢\u0007", false, (i112 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE) + (i112 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE), ((i113 | 6) << 1) - (i113 ^ 6), ((i114 | 11) << 1) - (i114 ^ 11), objArr22);
                                                    r5 = cls5.getMethod((java.lang.String) objArr22[0], java.lang.String.class).invoke(null, objArr20);
                                                    try {
                                                        int threadPriority = (android.os.Process.getThreadPriority(0) + 20) >> 6;
                                                        int i115 = threadPriority * 530;
                                                        int i116 = ~(threadPriority | i);
                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                        b("\ue20c\ue26dᏢ숣뾟ᶱ\ude3d镚\uda97咺霩\udc1a鎇鎨䰯⍴䢵ꪕԁ樢Ƭ\ue182쉇녋ﺡ㢄ﭳ\uf885럀灢끣㾕", (i115 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) + (i115 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) + 530 + (((~((i4 ^ threadPriority) | (threadPriority & i4))) | (~((threadPriority ^ 1) | (threadPriority & 1)))) * 529) + (((i116 & (-2)) | (i116 ^ (-2))) * 529), objArr23);
                                                        java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                                        java.lang.String str2 = str;
                                                        try {
                                                            int indexOf = android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                                            int i117 = indexOf * (-244);
                                                            int i118 = ~((i4 ^ (-12)) | (i4 & (-12)));
                                                            java.lang.Object[] objArr24 = objArr18;
                                                            int i119 = ~((indexOf ^ (-12)) | (indexOf & (-12)));
                                                            int i120 = length;
                                                            int i121 = ~(i | (-12));
                                                            int i122 = i110;
                                                            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                                            int i123 = r7;
                                                            int i124 = maxKeyCode * com.knotapi.knot.utilities.Constants.ID_KROGER;
                                                            int i125 = (i124 ^ 4070) + ((i124 & 4070) << 1);
                                                            int i126 = (maxKeyCode ^ 11) | (maxKeyCode & 11);
                                                            int i127 = ((i126 ^ i4) | (i126 & i4)) * (-369);
                                                            int i128 = ~maxKeyCode;
                                                            int i129 = ~((maxKeyCode ^ (-12)) | (maxKeyCode & (-12)));
                                                            int i130 = ~((maxKeyCode ^ i) | (maxKeyCode & i));
                                                            try {
                                                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                                int i131 = 234 - (~(elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)));
                                                                int i132 = ((((i117 & 2706) + (i117 | 2706)) - (~(((i119 & i118) | (i118 ^ i119)) * (-245)))) - 1) + ((~((i ^ (-12)) | (i & (-12)))) * (-245)) + (((indexOf ^ i121) | (i121 & indexOf)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
                                                                int i133 = (i128 & i4) | (i128 ^ i4);
                                                                c("\ufffa\u000b\u000bￚ\ufffe\r\u0012ￛ\b\r\u0012", true, i131, i132, (i125 ^ i127) + ((i125 & i127) << 1) + (((~i133) | 11) * (-369)) + (((~(i133 | 11)) | (i130 & i129) | (i129 ^ i130)) * 369), objArr25);
                                                                try {
                                                                    try {
                                                                        java.lang.Object[] objArr26 = {new java.io.ByteArrayInputStream((byte[]) cls6.getMethod((java.lang.String) objArr25[0], null).invoke(obj3, null))};
                                                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                                        b("\uf190\uf1fa蔼雚퀇譠論𣏕쥊쉾쏑돏耍իᣑ䳬嬵㰋凯ױሲ睅难\udec3\ued31깏꾐霕ꑎ\ue6a0\ue48b倉罈ᦰ㶺椅㙓傕犯∢\uf17d", -android.os.Process.getGidForName(str2), objArr27);
                                                                        java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                                                        int i134 = (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                        int i135 = i134 * (-167);
                                                                        int i136 = ((-39245) ^ i135) + ((i135 & (-39245)) << 1);
                                                                        int i137 = ~i134;
                                                                        int i138 = ((~((i137 ^ (-236)) | (i137 & (-236)))) | (~((i & (-236)) | (i ^ (-236))))) * 336;
                                                                        int i139 = ((i136 | i138) << 1) - (i138 ^ i136);
                                                                        int i140 = ~((i134 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) | (i134 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
                                                                        int i141 = ~((i134 ^ i) | (i134 & i));
                                                                        int i142 = ((i140 ^ i141) | (i140 & i141)) * (-168);
                                                                        int i143 = ~((i134 ^ i4) | (i134 & i4));
                                                                        r5 = str2;
                                                                        try {
                                                                            int indexOf2 = android.text.TextUtils.indexOf((java.lang.CharSequence) r5, (java.lang.CharSequence) r5, 0, 0);
                                                                            int i144 = indexOf2 * (-375);
                                                                            int i145 = (i144 ^ (-4500)) + ((i144 & (-4500)) << 1);
                                                                            int i146 = ~indexOf2;
                                                                            int i147 = (~(i146 | (-13))) | i;
                                                                            int i148 = ~((indexOf2 ^ 12) | (indexOf2 & 12));
                                                                            int i149 = -(-(((i147 & i148) | (i147 ^ i148)) * 376));
                                                                            int i150 = (i145 & i149) + (i145 | i149);
                                                                            int i151 = ~((indexOf2 & i4) | (i4 ^ indexOf2));
                                                                            int i152 = -(-(((i151 ^ i148) | (i151 & i148)) * (-376)));
                                                                            int i153 = (i150 ^ i152) + ((i152 & i150) << 1);
                                                                            int i154 = ((~((i146 & i) | (i146 ^ i))) | 12) * 376;
                                                                            int i155 = -android.view.View.MeasureSpec.getMode(0);
                                                                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                                            c("\ufffeￜ\ufffe\u000b\r\u0002\uffff\u0002￼\ufffa\r\ufffe\u0000\ufffe\u0007\ufffe\u000b\ufffa\r", false, (i139 & i142) + (i142 | i139) + (((i143 ^ (-236)) | (i143 & (-236))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE), ((i153 | i154) << 1) - (i154 ^ i153), (i155 ^ 19) + ((i155 & 19) << 1), objArr28);
                                                                            java.lang.Object invoke3 = cls7.getMethod((java.lang.String) objArr28[0], java.io.InputStream.class).invoke(r5, objArr26);
                                                                            java.lang.Object[] objArr29 = objArr9;
                                                                            try {
                                                                                int length2 = objArr29.length;
                                                                                r7 = java.io.InputStream.class;
                                                                                for (int i156 = 0; i156 < 2; i156++) {
                                                                                    java.lang.Object obj4 = objArr29[i156];
                                                                                    try {
                                                                                        int i157 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                                        int i158 = -android.widget.ExpandableListView.getPackedPositionChild(0L);
                                                                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                                                        c("\u0007\n\u0004\u0002\u0015\u0006\u000b\u0002\u0017\u0002ￏ\u0014\u0006\u0004\u0016\u0013\n\u0015\u001aￏ\u0004\u0006\u0013\u0015ￏ\ufff9ￖ\uffd1ￚ￤\u0006\u0013\u0015\n", false, 227 - (~i157), (i158 & 5) + (i158 | 5), 32 - (~(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr30);
                                                                                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                                                                        int axisFromString2 = android.view.MotionEvent.axisFromString(r5);
                                                                                        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                                        int i159 = windowTouchSlop * 860;
                                                                                        int i160 = ~windowTouchSlop;
                                                                                        int i161 = (i160 & (-22)) | (i160 ^ (-22));
                                                                                        int i162 = ((((i159 ^ (-18018)) + ((i159 & (-18018)) << 1)) + ((windowTouchSlop | i) * (-859))) - (~(-(-(((~((i4 ^ windowTouchSlop) | (i4 & windowTouchSlop))) | (~((i161 & i) | (i161 ^ i)))) * 859))))) - 1;
                                                                                        int i163 = ~((i4 & (-22)) | (i4 ^ (-22)));
                                                                                        int i164 = ~((windowTouchSlop ^ (-22)) | (windowTouchSlop & (-22)));
                                                                                        int i165 = -(-(((i164 ^ i163) | (i164 & i163)) * 859));
                                                                                        int i166 = -android.text.TextUtils.indexOf((java.lang.CharSequence) r5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                                                                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                                        c("\u0011\n\u0004\u000f\n\u0013\ufff1\uffd1\uffd1ￖ\ufff9\u0015\u0004\u0006\u000b\u0003\u0016\ufff4\u0015\u0006\b\r\u0002", true, 227 - axisFromString2, (i162 & i165) + (i165 | i162), ((i166 | 22) << 1) - (i166 ^ 22), objArr31);
                                                                                        r7 = 0;
                                                                                        if (obj4.equals(cls8.getMethod((java.lang.String) objArr31[0], null).invoke(invoke3, null))) {
                                                                                            java.lang.Object[] objArr32 = {new int[]{i}, new int[]{(i4 & 1) | i123}, null, new int[1]};
                                                                                            try {
                                                                                                java.lang.Object[] objArr33 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-729883905) | i4)) | (~(1004273519 | i))) * (-302)) + 1323201220 + ((~((-729883905) | i)) * (-604)) + (((~(274389615 | i)) | 273734150) * 302))};
                                                                                                try {
                                                                                                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                                                    if (obj5 == null) {
                                                                                                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(r5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2713, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                                                                        byte b3 = $$a[14];
                                                                                                        byte b4 = (byte) (b3 - 1);
                                                                                                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                                                                        a(b4, b4, (byte) (-b3), objArr34);
                                                                                                        obj5 = cls9.getMethod((java.lang.String) objArr34[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                                                                                    }
                                                                                                    ((int[]) objArr32[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr33)).intValue();
                                                                                                    return objArr32;
                                                                                                } catch (java.lang.Throwable th2) {
                                                                                                    th = th2;
                                                                                                    java.lang.Throwable cause2 = th.getCause();
                                                                                                    if (cause2 != null) {
                                                                                                        throw cause2;
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th3) {
                                                                                                th = th3;
                                                                                            }
                                                                                        } else {
                                                                                            r7 = -1347122530;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th4) {
                                                                                        java.lang.Throwable cause3 = th4.getCause();
                                                                                        if (cause3 != null) {
                                                                                            throw cause3;
                                                                                        }
                                                                                        throw th4;
                                                                                    }
                                                                                }
                                                                                int i167 = (i122 & (-17)) + (i122 | (-17));
                                                                                i110 = (i167 ^ 18) + ((i167 & 18) << 1);
                                                                                objArr9 = objArr29;
                                                                                length = i120;
                                                                                r7 = i123;
                                                                                objArr18 = objArr24;
                                                                                f = 0.0f;
                                                                                str = r5;
                                                                            } catch (java.lang.Throwable unused4) {
                                                                                r7 = -1347122530;
                                                                            }
                                                                        } catch (java.lang.Throwable th5) {
                                                                            th = th5;
                                                                            java.lang.Throwable cause4 = th.getCause();
                                                                            if (cause4 != null) {
                                                                                throw cause4;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (java.lang.Throwable th6) {
                                                                        th = th6;
                                                                    }
                                                                } catch (java.lang.Throwable unused5) {
                                                                    r7 = -1347122530;
                                                                    r5 = str2;
                                                                }
                                                            } catch (java.lang.Throwable th7) {
                                                                th = th7;
                                                                java.lang.Throwable cause5 = th.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (java.lang.Throwable th8) {
                                                            th = th8;
                                                        }
                                                    } catch (java.lang.Throwable th9) {
                                                        th = th9;
                                                    }
                                                } catch (java.lang.Throwable th10) {
                                                    java.lang.Throwable cause6 = th10.getCause();
                                                    if (cause6 != null) {
                                                        throw cause6;
                                                    }
                                                    throw th10;
                                                }
                                            }
                                        } catch (java.lang.Throwable unused6) {
                                        }
                                        r7 = -1347122530;
                                        r5 = str;
                                        i3 = 1;
                                        charSequence = r5;
                                        num = r7;
                                        obj = r20;
                                        int[] iArr = new int[i3];
                                        int[] iArr2 = new int[i3];
                                        iArr[0] = i;
                                        iArr2[0] = i;
                                        java.lang.Object[] objArr35 = {iArr, iArr2, null, new int[i3]};
                                        int i168 = ~i;
                                        java.lang.Object[] objArr36 = {java.lang.Integer.valueOf(i2), obj, java.lang.Integer.valueOf(((((~((-396054882) | i168)) | (~(608874103 | i))) * 959) - 1059866367) + (((~(i | (-396054882))) | (~(i168 | 608874103))) * 959))};
                                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num);
                                        if (obj6 == null) {
                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(charSequence, charSequence) + 50, 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                            byte b5 = $$a[14];
                                            byte b6 = (byte) (b5 - 1);
                                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                                            a(b6, b6, (byte) (-b5), objArr37);
                                            obj6 = cls10.getMethod((java.lang.String) objArr37[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num, obj6);
                                        }
                                        ((int[]) objArr35[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr36)).intValue();
                                        return objArr35;
                                    } catch (java.lang.Throwable th11) {
                                        java.lang.Throwable cause7 = th11.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th11;
                                    }
                                } catch (java.lang.Throwable th12) {
                                    java.lang.Throwable cause8 = th12.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th12;
                                }
                            } catch (java.lang.Throwable th13) {
                                th = th13;
                                java.lang.Throwable cause9 = th.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th14) {
                            th = th14;
                        }
                    } catch (java.lang.Throwable th15) {
                        th = th15;
                    }
                } catch (java.lang.Throwable th16) {
                    java.lang.Throwable cause10 = th16.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th16;
                }
            } catch (java.lang.Throwable th17) {
                java.lang.Throwable cause11 = th17.getCause();
                if (cause11 != null) {
                    throw cause11;
                }
                throw th17;
            }
        }

        static void init$0() {
            $$a = new byte[]{74, 86, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -59, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
        }
    };
    private final java.text.DateFormat valueOf = new java.text.SimpleDateFormat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT);

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    /* renamed from: DigitizedCardProfile, reason: merged with bridge method [inline-methods] */
    public java.sql.Date AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws java.io.IOException {
        synchronized (this) {
            if (getackautomaticallyresetbyapplication.getProfileVersion() == com.payair.hce.getAckPreEntryAllowed.NULL) {
                getackautomaticallyresetbyapplication.RecordsJson();
                return null;
            }
            try {
                return new java.sql.Date(this.valueOf.parse(getackautomaticallyresetbyapplication.getAid()).getTime());
            } catch (java.text.ParseException e) {
                throw new com.payair.hce.getDualTapResetTimeout(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.payair.hce.getMagstripeCvmIssuerOptions
    /* renamed from: DigitizedCardProfile, reason: merged with bridge method [inline-methods] */
    public void writeReplace(com.payair.hce.getRemotePaymentData getremotepaymentdata, java.sql.Date date) throws java.io.IOException {
        synchronized (this) {
            getremotepaymentdata.DigitizedCardProfile(date == null ? null : this.valueOf.format((java.util.Date) date));
        }
    }
}
