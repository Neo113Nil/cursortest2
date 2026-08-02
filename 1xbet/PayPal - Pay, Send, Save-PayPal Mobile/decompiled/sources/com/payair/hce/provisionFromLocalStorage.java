package com.payair.hce;

/* loaded from: classes4.dex */
public class provisionFromLocalStorage extends com.payair.hce.getReasonCode<java.lang.Long> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static char getProfileVersion;
    private static int valueOf;
    private static char values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 718 - i;
        int i5 = s + 4;
        byte[] bArr = $$a;
        int i6 = (b * 2) + 1;
        char[] cArr = new char[i6];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i4 = (i5 + (-i4)) - 2;
            i5 = i7;
            i2 = i3;
            i3 = i2 + 1;
            cArr[i2] = (char) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i8 = i5 + 1;
            byte b2 = bArr[i8];
            i5 = i4;
            i4 = b2;
            i7 = i8;
            i4 = (i5 + (-i4)) - 2;
            i5 = i7;
            i2 = i3;
            i3 = i2 + 1;
            cArr[i2] = (char) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            cArr[i2] = (char) i4;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = b2 * 4;
        int i3 = 4 - (s * 2);
        byte[] bArr = $$d;
        int i4 = 110 - b;
        byte[] bArr2 = new byte[1 - i2];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            int i7 = i3;
            int i8 = i3 + i5;
            int i9 = i7 + 1;
            i = i6;
            i4 = i8;
            i3 = i9;
            bArr2[i] = (byte) i4;
            if (i == 0 - i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i4;
            i7 = i3;
            i3 = bArr[i3];
            i6 = i + 1;
            i5 = i10;
            int i82 = i3 + i5;
            int i92 = i7 + 1;
            i = i6;
            i4 = i82;
            i3 = i92;
            bArr2[i] = (byte) i4;
            if (i == 0 - i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == 0 - i2) {
            }
        }
    }

    /* synthetic */ provisionFromLocalStorage(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = RecordsJson + 7;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "匧콣쓇嫒", "\uf6f9⡱\ud9bf䨑", android.text.TextUtils.indexOf("", kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, 1) - 1, (char) (20117 >>> android.view.Gravity.getAbsoluteGravity(1, 0)), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "匧콣쓇嫒", "\uf6f9⡱\ud9bf䨑", (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 4569), objArr2);
            obj = objArr2[0];
        }
        return com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
    }

    private provisionFromLocalStorage() {
        try {
            com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(6);
            super.valueOf(writeReplace);
            super.AlternateContactlessPaymentDataJson(java.lang.Long.valueOf(com.payair.hce.onSignUser.AlternateContactlessPaymentDataJson(writeReplace.valueOf())));
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    public static com.payair.hce.setMobilePin<java.lang.Long> values() {
        com.payair.hce.setMobilePin<java.lang.Long> setmobilepin = new com.payair.hce.setMobilePin<java.lang.Long>() { // from class: com.payair.hce.provisionFromLocalStorage.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static int AlternateContactlessPaymentDataJson;
            private static int DigitizedCardProfile;
            private static int values;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(short s, byte b, short s2, java.lang.Object[] objArr) {
                int i;
                int i2;
                int i3 = s2 + 65;
                int i4 = s + 4;
                int i5 = b + 1;
                byte[] bArr = $$a;
                char[] cArr = new char[i5];
                if (bArr == null) {
                    int i6 = i4;
                    int i7 = i5;
                    i2 = 0;
                    int i8 = (i4 + (-i7)) - 2;
                    i = i2;
                    int i9 = i6;
                    i3 = i8;
                    i4 = i9;
                    i2 = i + 1;
                    cArr[i] = (char) i3;
                    int i10 = i4 + 1;
                    if (i2 == i5) {
                        objArr[0] = new java.lang.String(cArr);
                        return;
                    }
                    i7 = bArr[i10];
                    int i11 = i3;
                    i6 = i10;
                    i4 = i11;
                    int i82 = (i4 + (-i7)) - 2;
                    i = i2;
                    int i92 = i6;
                    i3 = i82;
                    i4 = i92;
                    i2 = i + 1;
                    cArr[i] = (char) i3;
                    int i102 = i4 + 1;
                    if (i2 == i5) {
                    }
                } else {
                    i = 0;
                    i2 = i + 1;
                    cArr[i] = (char) i3;
                    int i1022 = i4 + 1;
                    if (i2 == i5) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(short s, int i, byte b, java.lang.Object[] objArr) {
                int i2;
                int i3;
                byte[] bArr = $$d;
                int i4 = 4 - (b * 3);
                int i5 = i * 3;
                byte[] bArr2 = new byte[i5 + 1];
                if (bArr == null) {
                    int i6 = i5;
                    i3 = i4;
                    i2 = 0;
                    i4 += -i6;
                    i3++;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i5) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i2++;
                    i6 = bArr[i3];
                    i4 += -i6;
                    i3++;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i5) {
                    }
                } else {
                    i2 = 0;
                    i4 = (s * 2) + 115;
                    i3 = i4;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i5) {
                    }
                }
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<java.lang.Long> valueOf() {
                com.payair.hce.provisionFromLocalStorage provisionfromlocalstorage = new com.payair.hce.provisionFromLocalStorage((byte) 0);
                int i = DigitizedCardProfile + 53;
                values = i % 128;
                if (i % 2 != 0) {
                    return provisionfromlocalstorage;
                }
                throw null;
            }

            private static void b(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
                char[] charArray = str != null ? str.toCharArray() : str;
                com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
                char[] cArr = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
                while (digitizedCardJson11.DigitizedCardProfile < i3) {
                    $10 = ($11 + 13) % 128;
                    digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
                    cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
                    int i4 = digitizedCardJson11.DigitizedCardProfile;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 43, 2073 - (android.os.Process.myTid() >> 22), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 60036));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            c((short) 0, 0, (byte) 0, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                        }
                        cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 52, android.graphics.Color.alpha(0) + 3543, (char) android.view.View.resolveSize(0, 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
                if (i2 > 0) {
                    digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
                    char[] cArr2 = new char[i3];
                    java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
                    java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
                    java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
                    int i5 = $10 + 113;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 / 5;
                    }
                }
                if (z) {
                    char[] cArr3 = new char[i3];
                    digitizedCardJson11.DigitizedCardProfile = 0;
                    while (digitizedCardJson11.DigitizedCardProfile < i3) {
                        cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                        java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 53, 3543 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                    }
                    $11 = ($10 + 63) % 128;
                    cArr = cArr3;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                DigitizedCardProfile = 0;
                values = 1;
                AlternateContactlessPaymentDataJson = 1889207233;
            }

            static void init$1() {
                $$d = new byte[]{107, 13, -60, -69};
                $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x03fc, code lost:
            
                if (r0.contains(r5.getField((java.lang.String) r15[0]).get(null)) != false) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x05ee, code lost:
            
                if (((r0 & ((((((~((-1476548174) | r32)) | (~((-39321763) | r10))) * (-318)) - 1948517494) + (((~(1487036237 | r32)) | (-1526358000)) * (-318))) + (((~((-1487036238) | r32)) | 49809826) * 318))) | (((int) r3) & ((((((~(1605630541 | r10)) | 1252110344) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 772634305) + (((~(r10 | 1335996428)) | 1521744457) * (-440))) + ((1605630541 | r32) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)))) == 1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x06be, code lost:
            
                r0 = new java.lang.Object[]{new int[]{r32}, new int[]{r32 ^ 10}, null, new int[1]};
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x06dc, code lost:
            
                r10 = new java.lang.Object[]{java.lang.Integer.valueOf(r33), 16, java.lang.Integer.valueOf(((((314671302 | r3) * (-814)) - 2016552365) + (((~(689209097 | r32)) | ((~((~r32) | (-315719888))) | 688160512)) * 407)) + (((~(r32 | 315719887)) | ((~((-689209098) | r32)) | 688160512)) * 407))};
                r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0722, code lost:
            
                if (r1 != null) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0724, code lost:
            
                r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 2713, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                r3 = r6[14];
                r4 = r3;
                r6 = new java.lang.Object[1];
                a(r4, (byte) (r4 & 34), (short) (r3 + 1), r6);
                r1 = r1.getMethod((java.lang.String) r6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x077c, code lost:
            
                ((int[]) r0[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r10)).intValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0784, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x06bc, code lost:
            
                if (r0.equals(((java.lang.String) r13[0]).intern()) != false) goto L74;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r17v1, types: [int] */
            /* JADX WARN: Type inference failed for: r17v10 */
            /* JADX WARN: Type inference failed for: r17v11 */
            /* JADX WARN: Type inference failed for: r17v2 */
            /* JADX WARN: Type inference failed for: r17v3 */
            /* JADX WARN: Type inference failed for: r17v4 */
            /* JADX WARN: Type inference failed for: r17v5 */
            /* JADX WARN: Type inference failed for: r17v7 */
            /* JADX WARN: Type inference failed for: r17v8 */
            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object[]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2) {
                ?? minimumFlingVelocity;
                java.lang.Object[] objArr;
                try {
                    if (context == null) {
                        java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~((-392220121) | i)) | 67108864) | r13) * (-470)) - 1813643304) + (((~(i | (-325111257))) | (~((~i) | 937820120))) * 470))};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2712, (char) android.view.KeyEvent.keyCodeFromString(""));
                            byte b = $$a[14];
                            byte b2 = b;
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            a(b2, (byte) (b2 & 34), (short) (b + 1), objArr4);
                            obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                        }
                        ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                        return objArr2;
                    }
                    DigitizedCardProfile = (values + 63) % 128;
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(false, "\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013", 261 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.os.Process.myPid() >> 22) + 23, objArr5);
                        java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b(true, "\u0005\t\tￚ\r\ufffe\u0000\b\uffff\u0007￢\u0007\b\u0002\r\ufffa￼\u0002", android.graphics.ImageFormat.getBitsPerPixel(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, 18 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr6);
                        java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(false, "\f\u000b\u0011\u0002\u000b\u0011ￋ\r\nￋ\uffde\r\r\t\u0006\u0000\ufffe\u0011\u0006\f\u000b￦\u000b\u0003\f\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\u0000", 258 - android.os.Process.getGidForName(""), 25 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 33 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr7);
                        java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                        int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                        minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b(false, "\ufff8\ufffe\n�\u0003", (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, (keyRepeatTimeout >> 16) + 3, 5 - (minimumFlingVelocity >> 16), objArr8);
                        if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                            DigitizedCardProfile = (values + 97) % 128;
                            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                            java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(396175940 | r13)) | (-937295829)) * (-160)) - 1897156552) + (((~((~i) | (-608753045))) | 396175940) * 160))};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj2 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetAfter("", 0), 2713 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.os.Process.getGidForName("") + 1));
                                byte b3 = $$a[14];
                                byte b4 = b3;
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                a(b4, (byte) (b4 & 34), (short) (b3 + 1), objArr10);
                                obj2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).intValue();
                            DigitizedCardProfile = (values + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        } else {
                            values = (DigitizedCardProfile + 99) % 128;
                            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                            int i3 = ~i;
                            java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-423387025) | i)) | (~(581541960 | i3))) * (-1808)) - 233212392) + (((~((-2621441) | i)) | (~(1002307544 | i3))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i3 | 423387024)) | (~((-581541961) | i)) | 420765584) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", "", 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                byte b5 = $$a[14];
                                byte b6 = b5;
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                a(b6, (byte) (b6 & 34), (short) (b5 + 1), objArr12);
                                obj3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                        }
                        if (((int[]) objArr[1])[0] != i) {
                            return objArr;
                        }
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                        if (obj4 == null) {
                            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, android.graphics.Color.rgb(0, 0, 0) + 16778954, (char) (5825 - android.view.MotionEvent.axisFromString("")));
                            byte b7 = $$a[14];
                            byte b8 = b7;
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            a(b8, (byte) (b8 & 34), (short) (b7 + 1), objArr13);
                            obj4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj4);
                        }
                        java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj4).invoke(null, null);
                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1738 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 5826));
                        byte[] bArr = $$a;
                        byte b9 = bArr[14];
                        byte b10 = b9;
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(b10, (byte) (b10 & 34), (short) (b9 + 1), objArr14);
                        if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777249, 1739 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (5827 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                            byte b11 = bArr[23];
                            byte b12 = bArr[20];
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            a(b11, b12, (short) (b12 | 48), objArr15);
                        }
                        if (android.os.Build.VERSION.SDK_INT == 30) {
                            DigitizedCardProfile = (values + 83) % 128;
                            java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            int i4 = ~i;
                            java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-74449122) | i)) | (~((-553924117) | i4))) * 920) - 111767656) + (((~((-376555748) | i4)) | 74449121) * 920) + (((~(i | (-302106627))) | (~(i4 | (-74449122))) | (~((-553924117) | i))) * 920))};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj5 == null) {
                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.alpha(0), android.view.MotionEvent.axisFromString("") + 2714, (char) (android.os.Process.myPid() >> 22));
                                byte b13 = bArr[14];
                                byte b14 = b13;
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                a(b14, (byte) (b14 & 34), (short) (b13 + 1), objArr18);
                                obj5 = cls9.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                            }
                            ((int[]) objArr16[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr17)).intValue();
                            return objArr16;
                        }
                        try {
                            try {
                                if (android.os.Build.VERSION.SDK_INT > 33) {
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    b(false, "\uffd1\u000e\u000e\r\u0006ￏ\u0006\u0007\u0004\u0017\t\t\u0003\u0004\u000e\u0007\uffd0\u0014\u0005\uffd1\u0007\u0016\u0005\uffd1\u000b\u0010\u000b\u0016", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 18 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 28 - android.view.KeyEvent.getDeadChar(0, 0), objArr19);
                                    try {
                                        java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                        minimumFlingVelocity = minimumFlingVelocity;
                                        if (obj6 == null) {
                                            int green = 36 - android.graphics.Color.green(0);
                                            int i5 = (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3160;
                                            long uptimeMillis = android.os.SystemClock.uptimeMillis();
                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(green, i5, (char) ((uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 33098));
                                            byte b15 = (byte) (bArr[14] + 1);
                                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                                            a((short) 38, b15, (short) (b15 | 653), objArr21);
                                            obj6 = cls10.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj6);
                                            minimumFlingVelocity = uptimeMillis;
                                        }
                                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr20)).longValue();
                                        long j = ~longValue;
                                        minimumFlingVelocity = 0;
                                        long j2 = ~i;
                                        long j3 = (((((185 * longValue) + 228604000587L) + ((longValue | 1249202188) * (-368))) + (((j | (-1249202189)) | j2) * 184)) + ((((~(j2 | (-1249202189))) | (~(j | 1249202188))) | (~(longValue | (-1249202189)))) * 184)) - 88465919;
                                        int i6 = (int) (j3 >> 32);
                                        int i7 = ~i;
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } else {
                                    minimumFlingVelocity = 0;
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    b(false, "\uffff\u0012\u0004\u0004\ufffe\uffff\t\u0002\u000f\fￋ\u0001\u0002", 258 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 8, android.view.View.resolveSize(0, 0) + 13, objArr22);
                                    try {
                                        java.lang.Object[] objArr23 = {((java.lang.String) objArr22[0]).intern()};
                                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj7 == null) {
                                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40, 1921 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                            byte b16 = (byte) (bArr[14] + 1);
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            a((short) 38, b16, (short) (b16 | 653), objArr24);
                                            obj7 = cls11.getMethod((java.lang.String) objArr24[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj7);
                                        }
                                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj7).invoke(null, objArr23);
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        b(true, "\u0000", 208 - android.graphics.ImageFormat.getBitsPerPixel(0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr25);
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        } catch (java.lang.Exception unused2) {
                            minimumFlingVelocity = 0;
                        }
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                    java.lang.Object[] objArr26 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    ?? r4 = {java.lang.Integer.valueOf(i2), minimumFlingVelocity, java.lang.Integer.valueOf((((~((-476446746) | i)) | (~((~i) | 528482239))) * (-318)) + 427658644 + (((~(510125243 | i)) | 18356996) * (-318)) + (((~(i | (-510125244))) | (-494803742)) * 318))};
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj8 == null) {
                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte b17 = $$a[14];
                        byte b18 = b17;
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        a(b18, (byte) (b18 & 34), (short) (b17 + 1), objArr27);
                        obj8 = cls12.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                    }
                    ((int[]) objArr26[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, r4)).intValue();
                    return objArr26;
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }

            static void init$0() {
                $$a = new byte[]{92, -25, 4, -11, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized};
                $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE;
            }
        };
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 43) % 128;
        return setmobilepin;
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                $11 = ($10 + 11) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                int i4 = i3;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (getProfileVersion ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getAid)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 62, 1336 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((short) 0, (byte) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (values ^ 2144259807102049818L))) ^ r12), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    int i5 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('n' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1335 - (android.os.Process.myPid() >> 22), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 0, (byte) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                    i3 = i4 + 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 3543, (char) (android.os.Process.getGidForName("") + 1))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i6 = $10 + 91;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 83) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(java.lang.Long.valueOf(com.payair.hce.onSignUser.AlternateContactlessPaymentDataJson(transactioncanberesumed.valueOf())));
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 37) % 128;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char c2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        java.lang.Object obj = null;
        if (str2 != null) {
            int i2 = $11 + 41;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr2 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = charArray2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(charArray2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777145) - android.graphics.Color.rgb(0, 0, 0), 1179 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((short) 0, (byte) 8, (byte) 0, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 30, android.text.TextUtils.getOffsetAfter("", 0) + 3443, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3830))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1864 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.MotionEvent.axisFromString("") + 41776));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d((short) 0, (byte) 5, (byte) 0, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 28, 3133 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getTrimmedLength(""));
                    byte length4 = (byte) $$d.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d((short) 0, length4, (byte) (length4 - 4), objArr8);
                    c2 = 2;
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((int) (valueOf ^ 1263759066225628708L)) ^ ((cArr3[intValue2] ^ cArr2[getwalletdata.writeReplace]) ^ (AlternateContactlessPaymentDataJson ^ 1263759066225628708L))) ^ ((char) (DigitizedCardProfile ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                $11 = ($10 + 49) % 128;
                cArr3 = cArr3;
                obj = null;
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

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        RecordsJson = 1;
        AlternateContactlessPaymentDataJson = 1263759066225628708L;
        valueOf = -804334044;
        DigitizedCardProfile = (char) 51737;
        values = (char) 17414;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 62860;
        getProfileVersion = (char) 20575;
        getAid = (char) 63860;
    }

    static void init$1() {
        $$d = new byte[]{104, -39, -34, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus};
        $$e = 72;
    }

    static void init$0() {
        $$a = new byte[]{75, -78, -116, -102, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = 39;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x123c, code lost:
    
        if (((((int) (r11 >> 32)) & (((((((~(r30 | (-47226897))) | (-1389999515)) | (~(47816722 | r66))) * (-68)) - 1823732414) + ((~(r30 | (-1342182793))) * (-68))) + (((~(r30 | (-47816723))) | (-1389409689)) * 68))) | (((int) r11) & ((((((~((-847592754) | r66)) | 847260960) * 104) + 2005432269) + ((~(r30 | 2010479925)) * (-104))) + ((2010148132 | r66) * 104)))) != 477111747) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x1349, code lost:
    
        r4 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x134d, code lost:
    
        if (r4 >= 28) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x134f, code lost:
    
        r7 = r5[r4];
        r15 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "彣䲫ౌퟚ\uf434ᑄ흌辺졩㉔檠䃞", "Ⴝ갹ᦴ㰱", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0), r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x1380, code lost:
    
        r7 = new java.lang.Object[]{((java.lang.String) r15[0]).intern().concat(java.lang.String.valueOf(r7))};
        r8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x1391, code lost:
    
        if (r8 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x1393, code lost:
    
        r8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3161, (char) (33099 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)));
        r13 = new java.lang.Object[1];
        b(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, r9[23], (byte) (-com.payair.hce.provisionFromLocalStorage.$$a[14]), r13);
        r8 = r8.getMethod((java.lang.String) r13[0], java.lang.String.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x13e6, code lost:
    
        r7 = ((java.lang.Long) ((java.lang.reflect.Method) r8).invoke(null, r7)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x13f3, code lost:
    
        r11 = ((((334 * r7) + 327085055069L) + (((~(r7 | r40)) | (~(r34 | 985195947))) * 333)) + (((~(r34 | r7)) | (~(r40 | 985195947))) * 333)) + 1980630851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x1476, code lost:
    
        if (((((int) (r11 >> 32)) & ((((((~(r30 | (-1666696135))) | 229469723) * (-933)) + 1033445972) + (((~(r30 | 229469723)) | (-1879044064)) * 933)) + 552122141)) | (((int) r11) & ((((((~((-2107426) | r66)) | r7) * 590) - 176903041) + ((((~(r30 | (-2048704989))) | 1241776516) | (~(r30 | 809035897))) * (-1180))) + (((~(r30 | (-809035898))) | (~(r30 | 2048704988))) * 590)))) != 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x1478, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x147b, code lost:
    
        r6 = r6 + r2;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x147a, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x1488, code lost:
    
        if (r6 < 25.2d) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x148a, code lost:
    
        r3 = new java.lang.Object[]{new int[]{r66}, new int[]{r66 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x14a4, code lost:
    
        r4 = new java.lang.Object[]{607841342, 16, java.lang.Integer.valueOf((((((~((-339679741) | r66)) | (~(r30 | 369645779))) * (-1808)) - 610169961) + (((~((-336074961) | r66)) | (~(r30 | 373250559))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(r66 | (-369645780))) | 3604780) | (~(r30 | 339679740))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x1501, code lost:
    
        if (r1 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x1503, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 50, 2713 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
        r5 = com.payair.hce.provisionFromLocalStorage.$$a;
        r7 = new java.lang.Object[1];
        b(653, r5[14], r5[16], r7);
        r1 = r1.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x1564, code lost:
    
        ((int[]) r3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r4)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x156c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x1347, code lost:
    
        if (((r4 & ((((((((~(r30 | (-1665474932))) | 1648697395) | (~(r30 | 228248520))) | (~((-211470985) | r66))) * (-84)) + 1905160562) + ((((~(228248520 | r66)) | 1665474931) | r6) * (-84))) + ((r6 | 211470984) * 84))) | (((int) r11) & ((((~(1440464895 | r66)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 1717863064) + (((~(r30 | 1440464895)) | 5397) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) == 477111747) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x28d2, code lost:
    
        if (r6 == null) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0814, code lost:
    
        if (((((int) (r11 >> 32)) & ((((((-885188282) | r66) * (-50)) - 29132338) + (((~(1976756155 | r66)) | (~(r30 | (-4203553)))) * 50)) + (((~(r30 | (-885188282))) | ((~(r30 | 1972552603)) | 4203552)) * 50))) | (((int) r11) & ((((((~((-285477030) | r66)) | r4) * 590) - 1671459825) + ((((~(r30 | 285675175)) | 1151353088) | (~(r30 | (-1151551235)))) * (-1180))) + (((~(r30 | 1151551234)) | (~(r30 | (-285675176)))) * 590)))) == 542074309) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x159b A[Catch: all -> 0x3edc, TryCatch #12 {all -> 0x3edc, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005c, B:11:0x0115, B:13:0x0152, B:14:0x019d, B:19:0x01da, B:21:0x01ee, B:22:0x0235, B:31:0x02ac, B:33:0x02bc, B:34:0x0306, B:36:0x0335, B:38:0x0345, B:39:0x038c, B:41:0x0395, B:43:0x03b2, B:44:0x0406, B:48:0x04b7, B:50:0x04d5, B:51:0x0528, B:55:0x05cd, B:57:0x05eb, B:58:0x063d, B:62:0x06fd, B:64:0x071b, B:65:0x0770, B:71:0x0849, B:73:0x085c, B:74:0x08a9, B:79:0x0a0b, B:81:0x0a47, B:82:0x0aa1, B:86:0x095a, B:88:0x096a, B:89:0x09b6, B:94:0x0e4d, B:96:0x0e5d, B:97:0x0ea6, B:100:0x0ee1, B:102:0x0ef4, B:103:0x0f43, B:107:0x103e, B:109:0x104e, B:110:0x1099, B:112:0x10cc, B:114:0x10dc, B:115:0x1123, B:117:0x112c, B:119:0x114a, B:120:0x119b, B:126:0x1380, B:128:0x1393, B:129:0x13e6, B:141:0x14a4, B:143:0x1503, B:144:0x1557, B:148:0x1240, B:150:0x125e, B:151:0x12b2, B:155:0x1588, B:157:0x159b, B:158:0x15e1, B:160:0x16a9, B:162:0x16bc, B:163:0x170a, B:171:0x17e1, B:173:0x184e, B:174:0x18aa, B:178:0x18da, B:180:0x18ed, B:181:0x1933, B:183:0x19e3, B:185:0x19f6, B:186:0x1a43, B:194:0x1aeb, B:196:0x1b32, B:197:0x1b87, B:204:0x1c78, B:206:0x1c8b, B:207:0x1cd9, B:215:0x1daa, B:217:0x1ded, B:218:0x1e40, B:242:0x2092, B:244:0x20dd, B:245:0x2136, B:249:0x2166, B:251:0x2176, B:252:0x21c0, B:265:0x23a5, B:267:0x23b8, B:268:0x2407, B:276:0x24b2, B:278:0x250a, B:279:0x255f, B:283:0x2598, B:285:0x25c1, B:286:0x261a, B:292:0x26d1, B:294:0x272a, B:295:0x2780, B:319:0x2804, B:321:0x2859, B:322:0x28aa, B:325:0x28d7, B:327:0x28e6, B:328:0x292b, B:332:0x29dc, B:334:0x2a22, B:335:0x2a76, B:339:0x2a8d, B:341:0x2aa6, B:342:0x2af3, B:346:0x2b96, B:348:0x2be3, B:349:0x2c3b, B:352:0x2c51, B:354:0x2c60, B:355:0x2ca7, B:359:0x2d69, B:361:0x2db8, B:362:0x2e0c, B:365:0x2e22, B:367:0x2e31, B:368:0x2e7a, B:372:0x2f32, B:374:0x2f87, B:375:0x2fdd, B:378:0x2ff3, B:380:0x3002, B:381:0x3047, B:385:0x30e6, B:387:0x3137, B:388:0x318d, B:392:0x31c6, B:394:0x31f0, B:395:0x3248, B:399:0x3300, B:401:0x3346, B:402:0x33a1, B:406:0x33ce, B:408:0x33e1, B:409:0x3433, B:413:0x34db, B:415:0x3522, B:416:0x3579, B:419:0x358f, B:421:0x359e, B:422:0x35e8, B:426:0x3684, B:428:0x36d2, B:429:0x3729, B:432:0x373f, B:434:0x374e, B:435:0x3794, B:439:0x3857, B:441:0x3898, B:442:0x38f2, B:445:0x3908, B:447:0x3917, B:448:0x3961, B:452:0x3a1e, B:454:0x3a6a, B:455:0x3ac7, B:458:0x3add, B:460:0x3aec, B:461:0x3b35, B:469:0x3c08, B:471:0x3c57, B:472:0x3cac, B:474:0x3cc1, B:476:0x3cd4, B:477:0x3d20, B:479:0x3d28, B:481:0x3d58, B:482:0x3dae, B:486:0x3e18, B:488:0x3e66, B:489:0x3ebc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x16bc A[Catch: all -> 0x3edc, TryCatch #12 {all -> 0x3edc, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005c, B:11:0x0115, B:13:0x0152, B:14:0x019d, B:19:0x01da, B:21:0x01ee, B:22:0x0235, B:31:0x02ac, B:33:0x02bc, B:34:0x0306, B:36:0x0335, B:38:0x0345, B:39:0x038c, B:41:0x0395, B:43:0x03b2, B:44:0x0406, B:48:0x04b7, B:50:0x04d5, B:51:0x0528, B:55:0x05cd, B:57:0x05eb, B:58:0x063d, B:62:0x06fd, B:64:0x071b, B:65:0x0770, B:71:0x0849, B:73:0x085c, B:74:0x08a9, B:79:0x0a0b, B:81:0x0a47, B:82:0x0aa1, B:86:0x095a, B:88:0x096a, B:89:0x09b6, B:94:0x0e4d, B:96:0x0e5d, B:97:0x0ea6, B:100:0x0ee1, B:102:0x0ef4, B:103:0x0f43, B:107:0x103e, B:109:0x104e, B:110:0x1099, B:112:0x10cc, B:114:0x10dc, B:115:0x1123, B:117:0x112c, B:119:0x114a, B:120:0x119b, B:126:0x1380, B:128:0x1393, B:129:0x13e6, B:141:0x14a4, B:143:0x1503, B:144:0x1557, B:148:0x1240, B:150:0x125e, B:151:0x12b2, B:155:0x1588, B:157:0x159b, B:158:0x15e1, B:160:0x16a9, B:162:0x16bc, B:163:0x170a, B:171:0x17e1, B:173:0x184e, B:174:0x18aa, B:178:0x18da, B:180:0x18ed, B:181:0x1933, B:183:0x19e3, B:185:0x19f6, B:186:0x1a43, B:194:0x1aeb, B:196:0x1b32, B:197:0x1b87, B:204:0x1c78, B:206:0x1c8b, B:207:0x1cd9, B:215:0x1daa, B:217:0x1ded, B:218:0x1e40, B:242:0x2092, B:244:0x20dd, B:245:0x2136, B:249:0x2166, B:251:0x2176, B:252:0x21c0, B:265:0x23a5, B:267:0x23b8, B:268:0x2407, B:276:0x24b2, B:278:0x250a, B:279:0x255f, B:283:0x2598, B:285:0x25c1, B:286:0x261a, B:292:0x26d1, B:294:0x272a, B:295:0x2780, B:319:0x2804, B:321:0x2859, B:322:0x28aa, B:325:0x28d7, B:327:0x28e6, B:328:0x292b, B:332:0x29dc, B:334:0x2a22, B:335:0x2a76, B:339:0x2a8d, B:341:0x2aa6, B:342:0x2af3, B:346:0x2b96, B:348:0x2be3, B:349:0x2c3b, B:352:0x2c51, B:354:0x2c60, B:355:0x2ca7, B:359:0x2d69, B:361:0x2db8, B:362:0x2e0c, B:365:0x2e22, B:367:0x2e31, B:368:0x2e7a, B:372:0x2f32, B:374:0x2f87, B:375:0x2fdd, B:378:0x2ff3, B:380:0x3002, B:381:0x3047, B:385:0x30e6, B:387:0x3137, B:388:0x318d, B:392:0x31c6, B:394:0x31f0, B:395:0x3248, B:399:0x3300, B:401:0x3346, B:402:0x33a1, B:406:0x33ce, B:408:0x33e1, B:409:0x3433, B:413:0x34db, B:415:0x3522, B:416:0x3579, B:419:0x358f, B:421:0x359e, B:422:0x35e8, B:426:0x3684, B:428:0x36d2, B:429:0x3729, B:432:0x373f, B:434:0x374e, B:435:0x3794, B:439:0x3857, B:441:0x3898, B:442:0x38f2, B:445:0x3908, B:447:0x3917, B:448:0x3961, B:452:0x3a1e, B:454:0x3a6a, B:455:0x3ac7, B:458:0x3add, B:460:0x3aec, B:461:0x3b35, B:469:0x3c08, B:471:0x3c57, B:472:0x3cac, B:474:0x3cc1, B:476:0x3cd4, B:477:0x3d20, B:479:0x3d28, B:481:0x3d58, B:482:0x3dae, B:486:0x3e18, B:488:0x3e66, B:489:0x3ebc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x17ae  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x18ed A[Catch: all -> 0x3edc, TryCatch #12 {all -> 0x3edc, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005c, B:11:0x0115, B:13:0x0152, B:14:0x019d, B:19:0x01da, B:21:0x01ee, B:22:0x0235, B:31:0x02ac, B:33:0x02bc, B:34:0x0306, B:36:0x0335, B:38:0x0345, B:39:0x038c, B:41:0x0395, B:43:0x03b2, B:44:0x0406, B:48:0x04b7, B:50:0x04d5, B:51:0x0528, B:55:0x05cd, B:57:0x05eb, B:58:0x063d, B:62:0x06fd, B:64:0x071b, B:65:0x0770, B:71:0x0849, B:73:0x085c, B:74:0x08a9, B:79:0x0a0b, B:81:0x0a47, B:82:0x0aa1, B:86:0x095a, B:88:0x096a, B:89:0x09b6, B:94:0x0e4d, B:96:0x0e5d, B:97:0x0ea6, B:100:0x0ee1, B:102:0x0ef4, B:103:0x0f43, B:107:0x103e, B:109:0x104e, B:110:0x1099, B:112:0x10cc, B:114:0x10dc, B:115:0x1123, B:117:0x112c, B:119:0x114a, B:120:0x119b, B:126:0x1380, B:128:0x1393, B:129:0x13e6, B:141:0x14a4, B:143:0x1503, B:144:0x1557, B:148:0x1240, B:150:0x125e, B:151:0x12b2, B:155:0x1588, B:157:0x159b, B:158:0x15e1, B:160:0x16a9, B:162:0x16bc, B:163:0x170a, B:171:0x17e1, B:173:0x184e, B:174:0x18aa, B:178:0x18da, B:180:0x18ed, B:181:0x1933, B:183:0x19e3, B:185:0x19f6, B:186:0x1a43, B:194:0x1aeb, B:196:0x1b32, B:197:0x1b87, B:204:0x1c78, B:206:0x1c8b, B:207:0x1cd9, B:215:0x1daa, B:217:0x1ded, B:218:0x1e40, B:242:0x2092, B:244:0x20dd, B:245:0x2136, B:249:0x2166, B:251:0x2176, B:252:0x21c0, B:265:0x23a5, B:267:0x23b8, B:268:0x2407, B:276:0x24b2, B:278:0x250a, B:279:0x255f, B:283:0x2598, B:285:0x25c1, B:286:0x261a, B:292:0x26d1, B:294:0x272a, B:295:0x2780, B:319:0x2804, B:321:0x2859, B:322:0x28aa, B:325:0x28d7, B:327:0x28e6, B:328:0x292b, B:332:0x29dc, B:334:0x2a22, B:335:0x2a76, B:339:0x2a8d, B:341:0x2aa6, B:342:0x2af3, B:346:0x2b96, B:348:0x2be3, B:349:0x2c3b, B:352:0x2c51, B:354:0x2c60, B:355:0x2ca7, B:359:0x2d69, B:361:0x2db8, B:362:0x2e0c, B:365:0x2e22, B:367:0x2e31, B:368:0x2e7a, B:372:0x2f32, B:374:0x2f87, B:375:0x2fdd, B:378:0x2ff3, B:380:0x3002, B:381:0x3047, B:385:0x30e6, B:387:0x3137, B:388:0x318d, B:392:0x31c6, B:394:0x31f0, B:395:0x3248, B:399:0x3300, B:401:0x3346, B:402:0x33a1, B:406:0x33ce, B:408:0x33e1, B:409:0x3433, B:413:0x34db, B:415:0x3522, B:416:0x3579, B:419:0x358f, B:421:0x359e, B:422:0x35e8, B:426:0x3684, B:428:0x36d2, B:429:0x3729, B:432:0x373f, B:434:0x374e, B:435:0x3794, B:439:0x3857, B:441:0x3898, B:442:0x38f2, B:445:0x3908, B:447:0x3917, B:448:0x3961, B:452:0x3a1e, B:454:0x3a6a, B:455:0x3ac7, B:458:0x3add, B:460:0x3aec, B:461:0x3b35, B:469:0x3c08, B:471:0x3c57, B:472:0x3cac, B:474:0x3cc1, B:476:0x3cd4, B:477:0x3d20, B:479:0x3d28, B:481:0x3d58, B:482:0x3dae, B:486:0x3e18, B:488:0x3e66, B:489:0x3ebc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x19f6 A[Catch: all -> 0x3edc, TryCatch #12 {all -> 0x3edc, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005c, B:11:0x0115, B:13:0x0152, B:14:0x019d, B:19:0x01da, B:21:0x01ee, B:22:0x0235, B:31:0x02ac, B:33:0x02bc, B:34:0x0306, B:36:0x0335, B:38:0x0345, B:39:0x038c, B:41:0x0395, B:43:0x03b2, B:44:0x0406, B:48:0x04b7, B:50:0x04d5, B:51:0x0528, B:55:0x05cd, B:57:0x05eb, B:58:0x063d, B:62:0x06fd, B:64:0x071b, B:65:0x0770, B:71:0x0849, B:73:0x085c, B:74:0x08a9, B:79:0x0a0b, B:81:0x0a47, B:82:0x0aa1, B:86:0x095a, B:88:0x096a, B:89:0x09b6, B:94:0x0e4d, B:96:0x0e5d, B:97:0x0ea6, B:100:0x0ee1, B:102:0x0ef4, B:103:0x0f43, B:107:0x103e, B:109:0x104e, B:110:0x1099, B:112:0x10cc, B:114:0x10dc, B:115:0x1123, B:117:0x112c, B:119:0x114a, B:120:0x119b, B:126:0x1380, B:128:0x1393, B:129:0x13e6, B:141:0x14a4, B:143:0x1503, B:144:0x1557, B:148:0x1240, B:150:0x125e, B:151:0x12b2, B:155:0x1588, B:157:0x159b, B:158:0x15e1, B:160:0x16a9, B:162:0x16bc, B:163:0x170a, B:171:0x17e1, B:173:0x184e, B:174:0x18aa, B:178:0x18da, B:180:0x18ed, B:181:0x1933, B:183:0x19e3, B:185:0x19f6, B:186:0x1a43, B:194:0x1aeb, B:196:0x1b32, B:197:0x1b87, B:204:0x1c78, B:206:0x1c8b, B:207:0x1cd9, B:215:0x1daa, B:217:0x1ded, B:218:0x1e40, B:242:0x2092, B:244:0x20dd, B:245:0x2136, B:249:0x2166, B:251:0x2176, B:252:0x21c0, B:265:0x23a5, B:267:0x23b8, B:268:0x2407, B:276:0x24b2, B:278:0x250a, B:279:0x255f, B:283:0x2598, B:285:0x25c1, B:286:0x261a, B:292:0x26d1, B:294:0x272a, B:295:0x2780, B:319:0x2804, B:321:0x2859, B:322:0x28aa, B:325:0x28d7, B:327:0x28e6, B:328:0x292b, B:332:0x29dc, B:334:0x2a22, B:335:0x2a76, B:339:0x2a8d, B:341:0x2aa6, B:342:0x2af3, B:346:0x2b96, B:348:0x2be3, B:349:0x2c3b, B:352:0x2c51, B:354:0x2c60, B:355:0x2ca7, B:359:0x2d69, B:361:0x2db8, B:362:0x2e0c, B:365:0x2e22, B:367:0x2e31, B:368:0x2e7a, B:372:0x2f32, B:374:0x2f87, B:375:0x2fdd, B:378:0x2ff3, B:380:0x3002, B:381:0x3047, B:385:0x30e6, B:387:0x3137, B:388:0x318d, B:392:0x31c6, B:394:0x31f0, B:395:0x3248, B:399:0x3300, B:401:0x3346, B:402:0x33a1, B:406:0x33ce, B:408:0x33e1, B:409:0x3433, B:413:0x34db, B:415:0x3522, B:416:0x3579, B:419:0x358f, B:421:0x359e, B:422:0x35e8, B:426:0x3684, B:428:0x36d2, B:429:0x3729, B:432:0x373f, B:434:0x374e, B:435:0x3794, B:439:0x3857, B:441:0x3898, B:442:0x38f2, B:445:0x3908, B:447:0x3917, B:448:0x3961, B:452:0x3a1e, B:454:0x3a6a, B:455:0x3ac7, B:458:0x3add, B:460:0x3aec, B:461:0x3b35, B:469:0x3c08, B:471:0x3c57, B:472:0x3cac, B:474:0x3cc1, B:476:0x3cd4, B:477:0x3d20, B:479:0x3d28, B:481:0x3d58, B:482:0x3dae, B:486:0x3e18, B:488:0x3e66, B:489:0x3ebc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x1ac6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x1c76  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x1d91  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x1e56  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x2071  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x214c  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x1d8e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:569:0x1708  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x156d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0a47 A[Catch: all -> 0x3edc, TryCatch #12 {all -> 0x3edc, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005c, B:11:0x0115, B:13:0x0152, B:14:0x019d, B:19:0x01da, B:21:0x01ee, B:22:0x0235, B:31:0x02ac, B:33:0x02bc, B:34:0x0306, B:36:0x0335, B:38:0x0345, B:39:0x038c, B:41:0x0395, B:43:0x03b2, B:44:0x0406, B:48:0x04b7, B:50:0x04d5, B:51:0x0528, B:55:0x05cd, B:57:0x05eb, B:58:0x063d, B:62:0x06fd, B:64:0x071b, B:65:0x0770, B:71:0x0849, B:73:0x085c, B:74:0x08a9, B:79:0x0a0b, B:81:0x0a47, B:82:0x0aa1, B:86:0x095a, B:88:0x096a, B:89:0x09b6, B:94:0x0e4d, B:96:0x0e5d, B:97:0x0ea6, B:100:0x0ee1, B:102:0x0ef4, B:103:0x0f43, B:107:0x103e, B:109:0x104e, B:110:0x1099, B:112:0x10cc, B:114:0x10dc, B:115:0x1123, B:117:0x112c, B:119:0x114a, B:120:0x119b, B:126:0x1380, B:128:0x1393, B:129:0x13e6, B:141:0x14a4, B:143:0x1503, B:144:0x1557, B:148:0x1240, B:150:0x125e, B:151:0x12b2, B:155:0x1588, B:157:0x159b, B:158:0x15e1, B:160:0x16a9, B:162:0x16bc, B:163:0x170a, B:171:0x17e1, B:173:0x184e, B:174:0x18aa, B:178:0x18da, B:180:0x18ed, B:181:0x1933, B:183:0x19e3, B:185:0x19f6, B:186:0x1a43, B:194:0x1aeb, B:196:0x1b32, B:197:0x1b87, B:204:0x1c78, B:206:0x1c8b, B:207:0x1cd9, B:215:0x1daa, B:217:0x1ded, B:218:0x1e40, B:242:0x2092, B:244:0x20dd, B:245:0x2136, B:249:0x2166, B:251:0x2176, B:252:0x21c0, B:265:0x23a5, B:267:0x23b8, B:268:0x2407, B:276:0x24b2, B:278:0x250a, B:279:0x255f, B:283:0x2598, B:285:0x25c1, B:286:0x261a, B:292:0x26d1, B:294:0x272a, B:295:0x2780, B:319:0x2804, B:321:0x2859, B:322:0x28aa, B:325:0x28d7, B:327:0x28e6, B:328:0x292b, B:332:0x29dc, B:334:0x2a22, B:335:0x2a76, B:339:0x2a8d, B:341:0x2aa6, B:342:0x2af3, B:346:0x2b96, B:348:0x2be3, B:349:0x2c3b, B:352:0x2c51, B:354:0x2c60, B:355:0x2ca7, B:359:0x2d69, B:361:0x2db8, B:362:0x2e0c, B:365:0x2e22, B:367:0x2e31, B:368:0x2e7a, B:372:0x2f32, B:374:0x2f87, B:375:0x2fdd, B:378:0x2ff3, B:380:0x3002, B:381:0x3047, B:385:0x30e6, B:387:0x3137, B:388:0x318d, B:392:0x31c6, B:394:0x31f0, B:395:0x3248, B:399:0x3300, B:401:0x3346, B:402:0x33a1, B:406:0x33ce, B:408:0x33e1, B:409:0x3433, B:413:0x34db, B:415:0x3522, B:416:0x3579, B:419:0x358f, B:421:0x359e, B:422:0x35e8, B:426:0x3684, B:428:0x36d2, B:429:0x3729, B:432:0x373f, B:434:0x374e, B:435:0x3794, B:439:0x3857, B:441:0x3898, B:442:0x38f2, B:445:0x3908, B:447:0x3917, B:448:0x3961, B:452:0x3a1e, B:454:0x3a6a, B:455:0x3ac7, B:458:0x3add, B:460:0x3aec, B:461:0x3b35, B:469:0x3c08, B:471:0x3c57, B:472:0x3cac, B:474:0x3cc1, B:476:0x3cd4, B:477:0x3d20, B:479:0x3d28, B:481:0x3d58, B:482:0x3dae, B:486:0x3e18, B:488:0x3e66, B:489:0x3ebc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0e5d A[Catch: all -> 0x3edc, TryCatch #12 {all -> 0x3edc, blocks: (B:3:0x0004, B:6:0x001e, B:7:0x005c, B:11:0x0115, B:13:0x0152, B:14:0x019d, B:19:0x01da, B:21:0x01ee, B:22:0x0235, B:31:0x02ac, B:33:0x02bc, B:34:0x0306, B:36:0x0335, B:38:0x0345, B:39:0x038c, B:41:0x0395, B:43:0x03b2, B:44:0x0406, B:48:0x04b7, B:50:0x04d5, B:51:0x0528, B:55:0x05cd, B:57:0x05eb, B:58:0x063d, B:62:0x06fd, B:64:0x071b, B:65:0x0770, B:71:0x0849, B:73:0x085c, B:74:0x08a9, B:79:0x0a0b, B:81:0x0a47, B:82:0x0aa1, B:86:0x095a, B:88:0x096a, B:89:0x09b6, B:94:0x0e4d, B:96:0x0e5d, B:97:0x0ea6, B:100:0x0ee1, B:102:0x0ef4, B:103:0x0f43, B:107:0x103e, B:109:0x104e, B:110:0x1099, B:112:0x10cc, B:114:0x10dc, B:115:0x1123, B:117:0x112c, B:119:0x114a, B:120:0x119b, B:126:0x1380, B:128:0x1393, B:129:0x13e6, B:141:0x14a4, B:143:0x1503, B:144:0x1557, B:148:0x1240, B:150:0x125e, B:151:0x12b2, B:155:0x1588, B:157:0x159b, B:158:0x15e1, B:160:0x16a9, B:162:0x16bc, B:163:0x170a, B:171:0x17e1, B:173:0x184e, B:174:0x18aa, B:178:0x18da, B:180:0x18ed, B:181:0x1933, B:183:0x19e3, B:185:0x19f6, B:186:0x1a43, B:194:0x1aeb, B:196:0x1b32, B:197:0x1b87, B:204:0x1c78, B:206:0x1c8b, B:207:0x1cd9, B:215:0x1daa, B:217:0x1ded, B:218:0x1e40, B:242:0x2092, B:244:0x20dd, B:245:0x2136, B:249:0x2166, B:251:0x2176, B:252:0x21c0, B:265:0x23a5, B:267:0x23b8, B:268:0x2407, B:276:0x24b2, B:278:0x250a, B:279:0x255f, B:283:0x2598, B:285:0x25c1, B:286:0x261a, B:292:0x26d1, B:294:0x272a, B:295:0x2780, B:319:0x2804, B:321:0x2859, B:322:0x28aa, B:325:0x28d7, B:327:0x28e6, B:328:0x292b, B:332:0x29dc, B:334:0x2a22, B:335:0x2a76, B:339:0x2a8d, B:341:0x2aa6, B:342:0x2af3, B:346:0x2b96, B:348:0x2be3, B:349:0x2c3b, B:352:0x2c51, B:354:0x2c60, B:355:0x2ca7, B:359:0x2d69, B:361:0x2db8, B:362:0x2e0c, B:365:0x2e22, B:367:0x2e31, B:368:0x2e7a, B:372:0x2f32, B:374:0x2f87, B:375:0x2fdd, B:378:0x2ff3, B:380:0x3002, B:381:0x3047, B:385:0x30e6, B:387:0x3137, B:388:0x318d, B:392:0x31c6, B:394:0x31f0, B:395:0x3248, B:399:0x3300, B:401:0x3346, B:402:0x33a1, B:406:0x33ce, B:408:0x33e1, B:409:0x3433, B:413:0x34db, B:415:0x3522, B:416:0x3579, B:419:0x358f, B:421:0x359e, B:422:0x35e8, B:426:0x3684, B:428:0x36d2, B:429:0x3729, B:432:0x373f, B:434:0x374e, B:435:0x3794, B:439:0x3857, B:441:0x3898, B:442:0x38f2, B:445:0x3908, B:447:0x3917, B:448:0x3961, B:452:0x3a1e, B:454:0x3a6a, B:455:0x3ac7, B:458:0x3add, B:460:0x3aec, B:461:0x3b35, B:469:0x3c08, B:471:0x3c57, B:472:0x3cac, B:474:0x3cc1, B:476:0x3cd4, B:477:0x3d20, B:479:0x3d28, B:481:0x3d58, B:482:0x3dae, B:486:0x3e18, B:488:0x3e66, B:489:0x3ebc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0eaf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] valueOf$4956fc2a(int i, java.lang.Object obj) {
        long j;
        int i2;
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.Object invoke;
        long j2;
        java.lang.Object obj3;
        long j3;
        java.lang.Object obj4;
        java.lang.String str2;
        java.lang.Object obj5;
        long j4;
        java.lang.Object obj6;
        int i3;
        int i4;
        int i5;
        int i6;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        int i7;
        long j5;
        java.lang.String str3;
        java.lang.Object[] objArr;
        int parseInt;
        java.lang.Object obj7;
        char c;
        int i8;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.String str4;
        try {
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            int i9 = 1;
            int i10 = 0;
            if (obj10 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1837 - android.view.MotionEvent.axisFromString(""), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                byte b = $$a[14];
                short s = (short) (b + 1);
                byte b2 = b;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(s, b2, (byte) (b2 + 1), objArr2);
                obj10 = cls.getMethod((java.lang.String) objArr2[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj10);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, null)).longValue();
            long j6 = i;
            long j7 = ~j6;
            long j8 = ((-215) * longValue) + 170230263637L + ((~(j6 | 784471261)) * 216) + ((784471261 | (~longValue) | j7) * (-216)) + (((~(784471261 | j7)) | longValue) * 216) + 55607684;
            int i11 = (int) (j8 >> 32);
            int i12 = ~(178295743 | i);
            int i13 = ~i;
            if (((((((i12 | (-1793784832)) * (-280)) - 589176142) + (((~(i | (-1615522155))) | i12) * 140) + (((~(1793784831 | i13)) | (~((-1615489089) | i)) | (~((-33067) | i13))) * 140)) & i11) | (((int) j8) & (((((~((-1434282689) | i)) | 2910912) * 305) - 1704616964) + (((~((-1434282689) | i13)) | 2943721) * 305)))) != 0) {
                java.lang.Object[] objArr3 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                java.lang.Object[] objArr4 = {607841342, 16, java.lang.Integer.valueOf(((((~(915357517 | i13)) | 138461232) * 529) - 2014595920) + (((~(i | 915357517)) | 206031997) * 529))};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj11 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    byte[] bArr = $$a;
                    byte b3 = bArr[14];
                    byte b4 = bArr[16];
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(653, b3, b4, objArr5);
                    obj11 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr4)).intValue();
                return objArr3;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "ᎊ抛啅ꭹ㏒엠졿\ueed4\udfad\u0e73麩", "窔蟃朰繡", android.view.View.MeasureSpec.getMode(0) + 814203770, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr6);
            java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj12 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 40, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1920, (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                byte b5 = $$a[14];
                short s2 = (short) (b5 + 1);
                byte b6 = b5;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(s2, b6, (byte) (b6 + 1), objArr8);
                obj12 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
            }
            java.lang.String str5 = (java.lang.String) ((java.lang.reflect.Method) obj12).invoke(null, objArr7);
            if (str5 != null) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                c("냳첝\uefee㒆矎\ue650", 6 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr9);
                java.lang.String intern = ((java.lang.String) objArr9[0]).intern();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                c("邈ﭲ\uaace‵웷䨚뛻퉇", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, objArr10);
                java.lang.String[] strArr = {intern, ((java.lang.String) objArr10[0]).intern()};
                int i14 = 0;
                int i15 = 2;
                while (i14 < i15) {
                    if (str5.contains(strArr[i14])) {
                        IccPrivateKeyCrtComponentsJson = (RecordsJson + 55) % 128;
                        java.lang.Object[] objArr11 = new java.lang.Object[i9];
                        a("\u0000\u0000\u0000\u0000", "猠\uecdf蛅ᔉ\ue0f8孰넩\uf3f1弡\ue8a9唜픪ɳ鵮饊툇ﭭ䭋䗚ሉ\u0c29봶\uf5aa", "嚯⪲U搩", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1428861527, (char) android.view.View.MeasureSpec.makeMeasureSpec(i10, i10), objArr11);
                        java.lang.Object[] objArr12 = {((java.lang.String) objArr11[i10]).intern()};
                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj13 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, 1922 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(i10)));
                            byte b7 = $$a[14];
                            short s3 = (short) (b7 + 1);
                            byte b8 = b7;
                            java.lang.Object[] objArr13 = new java.lang.Object[i9];
                            b(s3, b8, (byte) (b8 + 1), objArr13);
                            java.lang.String str6 = (java.lang.String) objArr13[i10];
                            java.lang.Class<?>[] clsArr = new java.lang.Class[i9];
                            clsArr[i10] = java.lang.String.class;
                            obj13 = cls4.getMethod(str6, clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj13).invoke(null, objArr12);
                        java.lang.Object[] objArr14 = new java.lang.Object[i9];
                        a("\u0000\u0000\u0000\u0000", "鋿⻩药뚣ᐇ泱ၴ꧹ᇢ㔥詍䉹䐏\uefde䂰ꓘ\u0ad2귏탥젞\uebbc\uea5d冄\ue910䣧\uf150ဲ奅㶫\udcfd", "䳥葙꼹鑎", (android.widget.ExpandableListView.getPackedPositionForGroup(i10) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i10) == 0L ? 0 : -1)), (char) (20143 - android.text.TextUtils.getOffsetBefore("", i10)), objArr14);
                        java.lang.Object[] objArr15 = {((java.lang.String) objArr14[i10]).intern()};
                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj14 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 40, android.graphics.Color.blue(i10) + 1921, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                            byte b9 = $$a[14];
                            short s4 = (short) (b9 + 1);
                            byte b10 = b9;
                            java.lang.Object[] objArr16 = new java.lang.Object[i9];
                            b(s4, b10, (byte) (b10 + 1), objArr16);
                            java.lang.String str7 = (java.lang.String) objArr16[0];
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[i9];
                            clsArr2[0] = java.lang.String.class;
                            obj14 = cls5.getMethod(str7, clsArr2);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                        }
                        java.lang.Object invoke3 = ((java.lang.reflect.Method) obj14).invoke(null, objArr15);
                        if (invoke2 != null) {
                            java.lang.Object[] objArr17 = new java.lang.Object[2];
                            objArr17[i9] = 42;
                            objArr17[0] = invoke2;
                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj15 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 20, 2593 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                byte b11 = $$a[14];
                                short s5 = (short) (b11 + 1);
                                byte b12 = b11;
                                obj7 = invoke2;
                                java.lang.Object[] objArr18 = new java.lang.Object[i9];
                                b(s5, b12, (byte) (b12 + 1), objArr18);
                                java.lang.String str8 = (java.lang.String) objArr18[0];
                                java.lang.Class<?>[] clsArr3 = new java.lang.Class[2];
                                clsArr3[0] = java.lang.String.class;
                                clsArr3[i9] = java.lang.Integer.TYPE;
                                obj15 = cls6.getMethod(str8, clsArr3);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj15);
                            } else {
                                obj7 = invoke2;
                            }
                            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr17)).longValue();
                            long j9 = (434 * longValue2) + 24106779360L + ((~(j7 | 55802729 | longValue2)) * 433) + (((~((~longValue2) | j6)) | 55802729) * (-433)) + (((~(longValue2 | (-55802730))) | (~(55802729 | j6))) * 433) + 1312903254;
                            if (((((int) (j9 >> 32)) & ((((279259136 | i13) * (-192)) - 1788177110) + (((~(1560111369 | i13)) | (-1576888652)) * (-384)) + (((~(1576888651 | i)) | (~((-16777283) | i13)) | (~((-1280852234) | i))) * 192))) | (((int) j9) & (((((~(839150283 | i13)) | 2018590602) * (-1042)) - 1129143540) + ((839150283 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-2018590603) | i)) | 805317258 | (~(2052423627 | i13))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) != 477111747) {
                            }
                            j = j7;
                            str = "";
                            i2 = i13;
                            if (android.os.Build.VERSION.SDK_INT > 33) {
                                RecordsJson = (IccPrivateKeyCrtComponentsJson + 45) % 128;
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "㍌똑粵屘艑䪌\uef9e\u0a0c䥨뚢씃龔ᖩ㢢䚖\ue1f7蝡顝ᥨ뗗\ue473厑\ue55d騠稪䧂뒬녬", "鱜퇊ᜍ瘰", android.os.Process.myPid() >> 22, (char) (12310 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr19);
                                java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                if (obj16 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 3161 - android.text.TextUtils.indexOf(str, str, 0, 0), (char) (33099 - android.graphics.Color.green(0)));
                                    byte b13 = $$a[14];
                                    short s6 = (short) (b13 + 1);
                                    byte b14 = b13;
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    b(s6, b14, (byte) (b14 + 1), objArr21);
                                    obj16 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj16);
                                }
                                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr20)).longValue();
                                long j10 = ~longValue3;
                                long j11 = ((((((-756) * longValue3) - 591736404346L) + ((j | (-780654887)) * (-757))) + ((~(((-780654887) | j10) | j6)) * 1514)) + (((~((longValue3 | (-780654887)) | j6)) | ((~(j10 | j)) | (~(780654886 | j10)))) * 757)) - 557013221;
                                if (((((int) (j11 >> 32)) & (((((~(i2 | (-138434988))) | (~(1298791423 | i))) * (-272)) - 1363786006) + (((~((-208174016) | i)) | 69739028) * (-272)) + (((~(208174015 | i)) | 1229052395) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j11) & (((((~((-2037601832) | i)) | 1479693826) * 305) - 1704616964) + (((~(i2 | (-2037601832))) | (-600375422)) * 305)))) == 1) {
                                    i8 = 1;
                                    c = 0;
                                    int[] iArr = new int[i8];
                                    int[] iArr2 = new int[i8];
                                    iArr[c] = i;
                                    iArr2[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                    java.lang.Object[] objArr22 = {iArr, iArr2, null, new int[i8]};
                                    int i16 = ~(i2 | 105203147);
                                    java.lang.Object[] objArr23 = {607841342, 16, java.lang.Integer.valueOf((((38093003 | i16) * (-970)) - 1667497475) + ((i16 | 67110144) * 970))};
                                    obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj8 == null) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                        byte[] bArr2 = $$a;
                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                        b(653, bArr2[14], bArr2[16], objArr24);
                                        obj8 = cls8.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                    }
                                    ((int[]) objArr22[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr23)).intValue();
                                    return objArr22;
                                }
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                c("廐ᆡ鹶ꨠ춍⛸ᒮ\ue39e", 7 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr25);
                                java.lang.String intern2 = ((java.lang.String) objArr25[0]).intern();
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "컑럣꺋ᖩ\uf202쯫", "쪖脅䂄㲒", android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 37440), objArr26);
                                java.lang.String intern3 = ((java.lang.String) objArr26[0]).intern();
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "⣢쪓䄴猢⧯᪈쎙", "꣓䍙祙륔", android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1497586089, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr27);
                                java.lang.String intern4 = ((java.lang.String) objArr27[0]).intern();
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "吅암帅讶\uf10a叢ᖀ⇏羔", "⒟ⳝ쭏\u0ba7", 1328340260 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.red(0), objArr28);
                                java.lang.String intern5 = ((java.lang.String) objArr28[0]).intern();
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                c("禓뚌う车춼⼋", 6 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr29);
                                java.lang.String intern6 = ((java.lang.String) objArr29[0]).intern();
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                c("鹰Ꜳ䂳싟댬ꅢ㒠ᚖ뙒ꤺ桤啛剼ﰜ", 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr30);
                                java.lang.String intern7 = ((java.lang.String) objArr30[0]).intern();
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                c("\uf3fb邈㾎앐룳ﺊ", 5 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr31);
                                java.lang.String intern8 = ((java.lang.String) objArr31[0]).intern();
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "鞻ž雤\ud854啬湩", "≯ꘚ\udd88監", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58333), objArr32);
                                java.lang.String intern9 = ((java.lang.String) objArr32[0]).intern();
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                c("㍥⠧", 2 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr33);
                                java.lang.String intern10 = ((java.lang.String) objArr33[0]).intern();
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                c("暢ෙ몔秔ᡩ\uf6bc雦㠋\ue7a9་\ue6d5\ue14f꤁秡촏ڒ", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 17, objArr34);
                                java.lang.String intern11 = ((java.lang.String) objArr34[0]).intern();
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                c("暢ෙ\uf196\uf486ꗭ\u17ec\ue664駨ﭡﶊ", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, objArr35);
                                java.lang.String intern12 = ((java.lang.String) objArr35[0]).intern();
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "솦䳑ᬱ댢웘鵹◰⌅", "쀊ㅃ\ue2c1깼", android.view.View.resolveSizeAndState(0, 0, 0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr36);
                                java.lang.String intern13 = ((java.lang.String) objArr36[0]).intern();
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "눤ꢥ႑ැ罺䌎榿욄落羼䌈形", "减阯뵕繮", android.text.TextUtils.indexOf(str, str, 0, 0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr37);
                                java.lang.String intern14 = ((java.lang.String) objArr37[0]).intern();
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                c("劏쬳\ue8be➍쯶뒤蘭\udbc3\u244e霄㡜\ua8cdڎ杈", 14 - (android.os.Process.myTid() >> 22), objArr38);
                                java.lang.String intern15 = ((java.lang.String) objArr38[0]).intern();
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                c("큨奬\uf38bͺ呚ꮡ좈笄", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 8, objArr39);
                                java.lang.String intern16 = ((java.lang.String) objArr39[0]).intern();
                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                c("뛻퉇쀮륕킉̏룳ﺊ", (android.os.Process.myPid() >> 22) + 7, objArr40);
                                java.lang.String intern17 = ((java.lang.String) objArr40[0]).intern();
                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                c("壭宑춼⼋ⵍ縥㇂ࢉ", (android.os.Process.myTid() >> 22) + 7, objArr41);
                                java.lang.String intern18 = ((java.lang.String) objArr41[0]).intern();
                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "ƥ\uebf4", "ᆭ駁굴敽", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32173), objArr42);
                                java.lang.String intern19 = ((java.lang.String) objArr42[0]).intern();
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                c("\ue7a9་\ude84⇁♕\uf2b2﹥\ue3a5햟狭쎉범\ueff3ﭷ伾틖姓⳪अ\udd2f", 19 - android.view.MotionEvent.axisFromString(str), objArr43);
                                java.lang.String intern20 = ((java.lang.String) objArr43[0]).intern();
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "쾭˾揥곗후ꘈ", "戀剒瘴ፌ", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 19574), objArr44);
                                java.lang.String intern21 = ((java.lang.String) objArr44[0]).intern();
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                c("﮴岅", 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr45);
                                java.lang.String intern22 = ((java.lang.String) objArr45[0]).intern();
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "倒樀嬕稝Ⅺ䉜\uefa2촜ᠽ榞ꑬ臾넲篈⟧콈", "竌呥䀡逡", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (8512 - android.text.TextUtils.indexOf(str, str)), objArr46);
                                java.lang.String intern23 = ((java.lang.String) objArr46[0]).intern();
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                c("\ue294\u17eeᰓ鿒쓇홯𨼾頬ⅿ", 9 - android.graphics.Color.red(0), objArr47);
                                java.lang.String intern24 = ((java.lang.String) objArr47[0]).intern();
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                c("\ue294\u17eeᰓ鿒쓇홯𨼾鯁\u218c", 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr48);
                                java.lang.String intern25 = ((java.lang.String) objArr48[0]).intern();
                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "碞\ue28b룒倿ⶖ粌☲검\uec13팙ᶋ", "혙顊\uea25\ue2ba", 630737622 - android.text.TextUtils.getCapsMode(str, 0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr49);
                                java.lang.String intern26 = ((java.lang.String) objArr49[0]).intern();
                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                c("呚ꮡ﹥\ue3a5蚞\ua63d滑\udb5b\ueec2\ue602\ue32c발", 10 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr50);
                                java.lang.String intern27 = ((java.lang.String) objArr50[0]).intern();
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                c("呚ꮡ﹥\ue3a5蚞\ua63d湜㺎蹊ꅷ滑\udb5b\ueec2\ue602\ue32c발", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, objArr51);
                                java.lang.String intern28 = ((java.lang.String) objArr51[0]).intern();
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                c("呚ꮡ﹥\ue3a5蚞\ua63d鰴╄ෘ嶭⨩⻈諱\udb3f", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 14, objArr52);
                                java.lang.String[] strArr2 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr52[0]).intern()};
                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "ᎊ抛啅ꭹ㏒엠졿\ueed4\udfad\u0e73麩", "窔蟃朰繡", 814203770 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString(str)), objArr53);
                                java.lang.Object[] objArr54 = {((java.lang.String) objArr53[0]).intern()};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 40, android.text.TextUtils.getTrimmedLength(str) + 1921, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                    byte b15 = $$a[14];
                                    short s7 = (short) (b15 + 1);
                                    byte b16 = b15;
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    b(s7, b16, (byte) (b16 + 1), objArr55);
                                    obj2 = cls9.getMethod((java.lang.String) objArr55[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                }
                                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr54);
                                if (invoke == null) {
                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                    c("냳첝\uefee㒆矎\ue650", 7 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr56);
                                    java.lang.String intern29 = ((java.lang.String) objArr56[0]).intern();
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    c("邈ﭲ\uaace‵웷䨚뛻퉇", android.view.MotionEvent.axisFromString(str) + 9, objArr57);
                                    java.lang.Object[] objArr58 = {invoke, new java.lang.String[]{intern29, ((java.lang.String) objArr57[0]).intern()}};
                                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                    if (obj17 == null) {
                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 43, 2880 - android.text.TextUtils.getOffsetBefore(str, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                        byte b17 = $$a[14];
                                        short s8 = (short) (b17 + 1);
                                        byte b18 = b17;
                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                        b(s8, b18, (byte) (b18 + 1), objArr59);
                                        obj17 = cls10.getMethod((java.lang.String) objArr59[0], java.lang.String.class, java.lang.String[].class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj17);
                                    }
                                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr58)).longValue();
                                    long j12 = ~longValue4;
                                    long j13 = 1290142394 | j12;
                                    long j14 = j | (-1290142395);
                                    j2 = j6;
                                    long j15 = (((((569 * longValue4) - 734091022755L) + ((((~j13) | (~(j | 1290142394))) | (~(j12 | j))) * (-1136))) + ((((~(j2 | 1290142394)) | (~(j12 | j2))) | (~(j14 | longValue4))) * (-568))) + ((((~(j | longValue4)) | (~j14)) | (~(j13 | j2))) * 568)) - 738569384;
                                    int i17 = ~(i2 | (-2086911421));
                                    if (((((int) j15) & ((((~(153939080 | i)) | (~(i2 | (-137127937)))) * (-406)) + 1811629307 + ((~(i2 | (-1146159394))) * (-406)) + (((~(1283287329 | i)) | (~(i2 | (-153939081)))) * 406))) | (((int) (j15 >> 32)) & ((((~(i2 | 770829464)) | (-2113142205) | (~(i2 | 2086911420)) | (~((-744598681) | i))) * (-84)) + 1905160562 + (((~(2086911420 | i)) | (-770829465) | i17) * (-84)) + ((i17 | 744598680) * 84)))) != 0) {
                                        RecordsJson = (IccPrivateKeyCrtComponentsJson + 97) % 128;
                                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                                        a("\u0000\u0000\u0000\u0000", "猠\uecdf蛅ᔉ\ue0f8孰넩\uf3f1弡\ue8a9唜픪ɳ鵮饊툇ﭭ䭋䗚ሉ\u0c29봶\uf5aa", "嚯⪲U搩", android.os.Process.getGidForName(str) + 1428861527, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr60);
                                        java.lang.Object[] objArr61 = {((java.lang.String) objArr60[0]).intern()};
                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj18 == null) {
                                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 40, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1921, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                            byte b19 = $$a[14];
                                            short s9 = (short) (b19 + 1);
                                            byte b20 = b19;
                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                            b(s9, b20, (byte) (b20 + 1), objArr62);
                                            obj18 = cls11.getMethod((java.lang.String) objArr62[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                                        }
                                        java.lang.Object invoke4 = ((java.lang.reflect.Method) obj18).invoke(null, objArr61);
                                        java.lang.Object[] objArr63 = new java.lang.Object[1];
                                        a("\u0000\u0000\u0000\u0000", "鋿⻩药뚣ᐇ泱ၴ꧹ᇢ㔥詍䉹䐏\uefde䂰ꓘ\u0ad2귏탥젞\uebbc\uea5d冄\ue910䣧\uf150ဲ奅㶫\udcfd", "䳥葙꼹鑎", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (20143 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr63);
                                        java.lang.Object[] objArr64 = {((java.lang.String) objArr63[0]).intern()};
                                        java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj19 == null) {
                                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetBefore(str, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1921, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                            byte b21 = $$a[14];
                                            short s10 = (short) (b21 + 1);
                                            byte b22 = b21;
                                            java.lang.Object[] objArr65 = new java.lang.Object[1];
                                            b(s10, b22, (byte) (b22 + 1), objArr65);
                                            obj19 = cls12.getMethod((java.lang.String) objArr65[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj19);
                                        }
                                        java.lang.Object invoke5 = ((java.lang.reflect.Method) obj19).invoke(null, objArr64);
                                        if (invoke4 != null) {
                                            java.lang.Object[] objArr66 = {invoke4, 42};
                                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj20 == null) {
                                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2594 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                byte b23 = $$a[14];
                                                short s11 = (short) (b23 + 1);
                                                byte b24 = b23;
                                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                b(s11, b24, (byte) (b24 + 1), objArr67);
                                                obj20 = cls13.getMethod((java.lang.String) objArr67[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj20);
                                            }
                                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr66)).longValue();
                                            long j16 = ~longValue5;
                                            long j17 = (319 * longValue5) + 252278996649L + (((~(j | (-795832797) | longValue5)) | (~(795832796 | j16 | j2))) * (-318)) + (((~((-795832797) | j16)) | (~(j2 | (-795832797)))) * (-318)) + (((~(j2 | 795832796)) | j16) * 318) + 2052933321;
                                        }
                                        if (invoke5 != null) {
                                            java.lang.Object[] objArr68 = {invoke5, 42};
                                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj21 == null) {
                                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28, 2594 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                                byte b25 = $$a[14];
                                                short s12 = (short) (b25 + 1);
                                                byte b26 = b25;
                                                java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                b(s12, b26, (byte) (b26 + 1), objArr69);
                                                obj21 = cls14.getMethod((java.lang.String) objArr69[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj21);
                                            }
                                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr68)).longValue();
                                            long j18 = ~((~longValue6) | 981213327);
                                            long j19 = ((522 * longValue6) - 510230930040L) + ((~((-981213328) | longValue6 | j2)) * 521) + ((-1042) * j18) + (((~(longValue6 | j | (-981213328))) | j18) * 521) + 275887197;
                                            int i18 = (int) (j19 >> 32);
                                            int i19 = ~(i2 | (-228248521));
                                        }
                                    }
                                } else {
                                    j2 = j6;
                                }
                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                c("쾵矏ᒮ\ue39e⟖\uf257Ẃ띿쫡뱷춼⼋⟦㬿\ueee4쉉\u0ecf艠幏\ue1c6ﭡﶊ⃦䐚", 23 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr70);
                                java.lang.Object[] objArr71 = {((java.lang.String) objArr70[0]).intern()};
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj3 == null) {
                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.Color.blue(0), 2807 - android.graphics.Color.alpha(0), (char) android.view.View.MeasureSpec.getMode(0));
                                    byte b27 = $$a[14];
                                    short s13 = (short) (b27 + 1);
                                    byte b28 = b27;
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    b(s13, b28, (byte) (b28 + 1), objArr72);
                                    obj3 = cls15.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr71)).longValue();
                                long j20 = ~longValue7;
                                java.lang.String str9 = str;
                                long j21 = (((-167) * longValue7) - 182220709658L) + (((~(j20 | j2)) | (~((-1091141975) | j20))) * 336) + (((~(longValue7 | 1091141974)) | (~(j2 | 1091141974))) * (-168)) + (((~(j | 1091141974)) | j20) * 168) + 199398093;
                                j3 = (((int) (j21 >> 32)) & ((((~(195111423 | i)) | 1074266624) * (-140)) + 1713031858 + ((~(1269378047 | i)) * 70) + (((~(1242114987 | i)) | 1101529684) * 70))) | (((int) j21) & (((((~(i2 | (-1927153926))) | 930586960) * (-90)) - 1687905466) + (((~((-1927153926) | i)) | (-2013243734)) * (-45)) + (((~((-930586961) | i)) | (-1927153926) | (~(i2 | 930586960))) * 45)));
                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "緪ㆪᯰ㛚\udeb2\u2d6b쇛低\u181dᒍᯰ薢桑枬嵠赼䦖", "䶣㠴䙛᠉", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1530410061, (char) (2374 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr73);
                                java.lang.Object[] objArr74 = {((java.lang.String) objArr73[0]).intern()};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj4 != null) {
                                    str2 = str9;
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 29, 2807 - android.text.TextUtils.getOffsetAfter(str2, 0), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                    byte b29 = $$a[14];
                                    short s14 = (short) (b29 + 1);
                                    byte b30 = b29;
                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                    b(s14, b30, (byte) (b30 + 1), objArr75);
                                    obj4 = cls16.getMethod((java.lang.String) objArr75[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                } else {
                                    str2 = str9;
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr74)).longValue();
                                long j22 = ~(longValue8 | j2);
                                long j23 = ((111 * longValue8) - 25720655771L) + (((-235969320) | j22) * (-220)) + ((j22 | (~(235969319 | longValue8))) * 220) + (((~((~longValue8) | 235969319)) | (~((-235969320) | longValue8))) * 110) + 1054570748;
                                long j24 = (((int) (j23 >> 32)) & (((((~(i2 | (-75845))) | (~(1437150566 | i))) * (-272)) - 1758616182) + (((~((-2174053) | i)) | 2098208) * (-272)) + (((~(2174052 | i)) | 1435052358) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j23) & ((((((~(i2 | (-521988606))) | 335817125) | (~(i2 | (-1959215016)))) * 464) - 1664471227) + (((-186171481) | i) * (-464)) + (((~((-1959215016) | i)) | 335817125) * 464)));
                                if (j3 > 0) {
                                    int i20 = RecordsJson;
                                    IccPrivateKeyCrtComponentsJson = (i20 + 99) % 128;
                                    if (j24 > 0 && j24 - 3 < j3) {
                                        IccPrivateKeyCrtComponentsJson = (i20 + 5) % 128;
                                        java.lang.Object[] objArr76 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                                        java.lang.Object[] objArr77 = {607841342, 16, java.lang.Integer.valueOf((((((~(i2 | (-507126859))) | 201851904) | (~(i2 | (-202198662)))) * (-1136)) - 120705513) + (((~((-507126859) | i)) | (~((-202198662) | i)) | (~(i2 | 507473615))) * (-568)) + (((~(i | (-201851905))) | (~(i2 | 507126858)) | (~(i2 | 202198661))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj22 == null) {
                                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 50, 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                            byte[] bArr3 = $$a;
                                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                                            b(653, bArr3[14], bArr3[16], objArr78);
                                            obj22 = cls17.getMethod((java.lang.String) objArr78[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                        }
                                        ((int[]) objArr76[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr77)).intValue();
                                        return objArr76;
                                    }
                                }
                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                c("쾵矏ᒮ\ue39e⟖\uf257Ẃ띿쫡뱷춼⼋⟦㬿\ueee4쉉\u0ecf艠幏\ue1c6ﭡﶊ⃦䐚", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, objArr79);
                                java.lang.Object[] objArr80 = {((java.lang.String) objArr79[0]).intern()};
                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj5 == null) {
                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.getOffsetAfter(str2, 0), 2807 - android.text.TextUtils.getCapsMode(str2, 0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                    byte b31 = $$a[14];
                                    short s15 = (short) (b31 + 1);
                                    byte b32 = b31;
                                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                                    b(s15, b32, (byte) (b32 + 1), objArr81);
                                    obj5 = cls18.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr80)).longValue();
                                long j25 = ~(j | 1144528381);
                                long j26 = ~((-1144528382) | longValue9);
                                long j27 = ((-1527) * longValue9) + 875564211465L + ((longValue9 | j25) * 764) + (((~(j | longValue9)) | j26) * (-1528)) + (((~((~longValue9) | 1144528381)) | j26 | j25) * 764) + 146011686;
                                j4 = (((int) (j27 >> 32)) & ((((~((-1711974450) | i)) | (~((-274748039) | i))) * 69) + 1647579458 + (((~(275796942 | i)) | (-1987771392) | (~(1713023353 | i))) * (-69)) + 72374376)) | (((int) j27) & ((((((~r6) | 1247920278) * (-828)) - 1754753727) + ((i2 | 1609820607) * (-828))) - 1491601664));
                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "腯\uf312\uf1c0槪", "\ue72e팧徘蜴", (-1) - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.graphics.Color.green(0) + 13407), objArr82);
                                java.lang.Object[] objArr83 = {((java.lang.String) objArr82[0]).intern()};
                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj6 == null) {
                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 2807 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                    byte b33 = $$a[14];
                                    short s16 = (short) (b33 + 1);
                                    byte b34 = b33;
                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                    b(s16, b34, (byte) (b34 + 1), objArr84);
                                    obj6 = cls19.getMethod((java.lang.String) objArr84[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr83)).longValue();
                                long j28 = ((-782) * longValue10) + 819361288256L + ((~longValue10) * (-783)) + ((~(j | (-1045103685) | longValue10)) * (-783)) + (((~(j | longValue10)) | (-1045103685)) * 783) + 245436383;
                                long j29 = (((int) (j28 >> 32)) & (((((~(i2 | (-687876161))) | (~(1065238265 | i))) * 988) - 1843234714) + (((~((-1059864306) | i)) | 371988145 | (~(i2 | 1065238265))) * 988))) | (((int) j28) & ((((~(2139515024 | i)) | 702288614) * (-366)) + 675280937 + (((~(2145286902 | i)) | 696516736) * 366)));
                                if (j4 <= 0 && j29 > 0 && j29 + 100 < j4) {
                                    java.lang.Object[] objArr85 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                    java.lang.Object[] objArr86 = {607841342, 16, java.lang.Integer.valueOf(((((~(i | 280960851)) | 428364668) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1674999561) + (((~(i2 | 280960851)) | 151011372) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj23 == null) {
                                        java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777166) - android.graphics.Color.rgb(0, 0, 0), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                        byte[] bArr4 = $$a;
                                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                                        b(653, bArr4[14], bArr4[16], objArr87);
                                        obj23 = cls20.getMethod((java.lang.String) objArr87[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                    }
                                    ((int[]) objArr85[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr86)).intValue();
                                    return objArr85;
                                }
                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                c("쾵矏ᒮ\ue39eⵍ縥찗⃭", 7 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr88);
                                java.lang.String intern30 = ((java.lang.String) objArr88[0]).intern();
                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                c("쾵矏ᒮ\ue39eⵍ縥ꏍɚ謟碌◾理", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 11, objArr89);
                                java.lang.String intern31 = ((java.lang.String) objArr89[0]).intern();
                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "螚\udeaa뫺⩬悽᎑\uf5fe㗫釫ፐ癧赵", "衾鉒境ᯃ", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr90);
                                java.lang.String intern32 = ((java.lang.String) objArr90[0]).intern();
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "\ue5dd?䳐鵘⥒\uf451Љ罥ﻂ珞ꐕꊲ", "\uaaca鷗樝䍠", (-1) - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.KeyEvent.normalizeMetaState(0), objArr91);
                                java.lang.String intern33 = ((java.lang.String) objArr91[0]).intern();
                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                c("룻柛\u0ecf艠ꙙ\udaee垐뀔謟碌◾理", 11 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr92);
                                java.lang.String intern34 = ((java.lang.String) objArr92[0]).intern();
                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                c("쾵矏謟碌◾理", 5 - android.text.TextUtils.getTrimmedLength(str2), objArr93);
                                java.lang.String intern35 = ((java.lang.String) objArr93[0]).intern();
                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "ฮ⦊흕꩙", "ﱺ祹慗旇", android.text.TextUtils.indexOf(str2, str2, 0), (char) (51041 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr94);
                                java.lang.String[] strArr3 = {intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr94[0]).intern()};
                                i3 = 0;
                                while (true) {
                                    if (i3 < 7) {
                                        i4 = 0;
                                        break;
                                    }
                                    java.lang.Object[] objArr95 = {strArr3[i3]};
                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                    if (obj24 == null) {
                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.green(0), 1671 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (47940 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                                        byte b35 = $$a[14];
                                        short s17 = (short) (b35 + 1);
                                        byte b36 = b35;
                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                        b(s17, b36, (byte) (b36 + 1), objArr96);
                                        obj24 = cls21.getMethod((java.lang.String) objArr96[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj24);
                                    }
                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr95)).longValue();
                                    long j30 = ~longValue11;
                                    long j31 = ((((((-97) * longValue11) - 11674605200L) + (((~(j30 | (-233492104))) | (~(j30 | j))) * 98)) + ((((~(j | 233492103)) | j30) | (~(j2 | (-233492104)))) * (-49))) + (((~(j30 | j2)) | (~(longValue11 | (-233492104)))) * 49)) - 1392038078;
                                    if (((((int) (j31 >> 32)) & ((((~(i2 | (-666946707))) | (~((-770279705) | i))) * 1900) + 1871737038 + (((~(i2 | 770279704)) | (~(666946706 | i))) * (-950)) + (((~(770279704 | i)) | (~(i2 | 666946706))) * 950))) | (((int) j31) & ((((~(i2 | 744655245)) | (-692571165)) * 226) + 2055568080 + (((~(692571164 | i)) | 69206401 | (~(i2 | (-17122321)))) * (-113)) + ((~(744655245 | i)) * 113)))) != 0) {
                                        i4 = i3 + 90;
                                        break;
                                    }
                                    i3++;
                                }
                                if (i4 == 0) {
                                    java.lang.Object[] objArr97 = {new int[]{i}, new int[]{i ^ i4}, null, new int[1]};
                                    java.lang.Object[] objArr98 = {607841342, 16, java.lang.Integer.valueOf((((i2 | (-36700231)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1026184953) + (((~(i2 | 336588681)) | (-37252304)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj25 == null) {
                                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) android.view.View.resolveSize(0, 0));
                                        byte[] bArr5 = $$a;
                                        java.lang.Object[] objArr99 = new java.lang.Object[1];
                                        b(653, bArr5[14], bArr5[16], objArr99);
                                        obj25 = cls22.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj25);
                                    }
                                    ((int[]) objArr97[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr98)).intValue();
                                    return objArr97;
                                }
                                try {
                                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                                    c("齊ក젌য়燺┎\uaace‵\ude8b\u1f5c輲巏좈笄", android.view.View.MeasureSpec.getSize(0) + 13, objArr100);
                                    try {
                                        java.lang.Object[] objArr101 = {((java.lang.String) objArr100[0]).intern()};
                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj26 == null) {
                                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.widget.ExpandableListView.getPackedPositionType(0L), android.widget.ExpandableListView.getPackedPositionType(0L) + 1921, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                            byte b37 = $$a[14];
                                            short s18 = (short) (b37 + 1);
                                            byte b38 = b37;
                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                            b(s18, b38, (byte) (b38 + 1), objArr102);
                                            obj26 = cls23.getMethod((java.lang.String) objArr102[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj26);
                                        }
                                        str3 = (java.lang.String) ((java.lang.reflect.Method) obj26).invoke(null, objArr101);
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause = th2.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th2;
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                try {
                                    if (str3 != null) {
                                        java.lang.Object[] objArr103 = new java.lang.Object[1];
                                        a("\u0000\u0000\u0000\u0000", "➱຺磓\ue1f7硗に\ue24b䝺潏赃\ue9c9", "䮴⣟⁙\uf4a5", 1495850827 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr103);
                                        java.lang.String[] strArr4 = {((java.lang.String) objArr103[0]).intern()};
                                        for (int i21 = 0; i21 <= 0; i21++) {
                                            if (!str3.contains(strArr4[i21])) {
                                            }
                                        }
                                        i5 = 0;
                                        if (i5 != 0) {
                                            RecordsJson = (IccPrivateKeyCrtComponentsJson + 91) % 128;
                                            java.lang.Object[] objArr104 = {new int[]{i}, new int[]{i5 ^ i}, null, new int[1]};
                                            java.lang.Object[] objArr105 = {607841342, 16, java.lang.Integer.valueOf((((~(i | (-437464340))) | 269485328) * 576) + 159719695 + (((~(i2 | (-167979012))) | 2375852) * 576) + 604726272)};
                                            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj27 == null) {
                                                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 2713 - android.text.TextUtils.getOffsetBefore(str2, 0), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                byte[] bArr6 = $$a;
                                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                b(653, bArr6[14], bArr6[16], objArr106);
                                                obj27 = cls24.getMethod((java.lang.String) objArr106[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj27);
                                            }
                                            ((int[]) objArr104[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr105)).intValue();
                                            return objArr104;
                                        }
                                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                                        c("齊ក젌য়燺┎\uaace‵\ude8b\u1f5c輲巏좈笄", 13 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr107);
                                        java.lang.Object[] objArr108 = {((java.lang.String) objArr107[0]).intern()};
                                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj28 == null) {
                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 40, android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1922, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                            byte b39 = $$a[14];
                                            short s19 = (short) (b39 + 1);
                                            byte b40 = b39;
                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                            b(s19, b40, (byte) (b40 + 1), objArr109);
                                            obj28 = cls25.getMethod((java.lang.String) objArr109[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj28);
                                        }
                                        java.lang.String str10 = (java.lang.String) ((java.lang.reflect.Method) obj28).invoke(null, objArr108);
                                        if (str10 != null) {
                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                            a("\u0000\u0000\u0000\u0000", "➱຺磓\ue1f7硗に\ue24b䝺潏赃\ue9c9", "䮴⣟⁙\uf4a5", 1495850826 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr110);
                                            java.lang.String[] strArr5 = {((java.lang.String) objArr110[0]).intern()};
                                            int i22 = 0;
                                            while (true) {
                                                if (i22 > 0) {
                                                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                    a("\u0000\u0000\u0000\u0000", "뒘\uf0dd큢흿ꩽ짭㚭눠頢\u1777돸歰", "왊쑙\ue403젎", android.text.TextUtils.getOffsetAfter(str2, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr111);
                                                    java.lang.String intern36 = ((java.lang.String) objArr111[0]).intern();
                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                    a("\u0000\u0000\u0000\u0000", "橨\ufafa䉽䪯\uf609鮠맊䌳\uf202\uf338为➧阮ᬔ瞪忶", "ꓧ罛ؑධ", android.view.View.MeasureSpec.getMode(0), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 45062), objArr112);
                                                    java.lang.String intern37 = ((java.lang.String) objArr112[0]).intern();
                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                    c("ᔢ掮𨼾ꢓ䴴暢ෙ駀⼪丑\udecf뿠\uf447鹰Ꜳ坵柺", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 17, objArr113);
                                                    java.lang.String intern38 = ((java.lang.String) objArr113[0]).intern();
                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                    a("\u0000\u0000\u0000\u0000", "ⸯ⡊ꆁ큙Ⅸ纑", "쁍\u05c8顒꒣", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, (char) (android.view.MotionEvent.axisFromString(str2) + 41881), objArr114);
                                                    java.lang.String intern39 = ((java.lang.String) objArr114[0]).intern();
                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                    a("\u0000\u0000\u0000\u0000", "彣䲫ౌퟚ\uf434ᑄ흌辺졩㉔檠䃞", "Ⴝ갹ᦴ㰱", 1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr115);
                                                    java.lang.String intern40 = ((java.lang.String) objArr115[0]).intern();
                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                    c("쾵矏ᒮ\ue39eⵍ縥ꏍɚ謟碌崄\ue3bf\ud823ꝃ\uec2f裦坵柺", android.text.TextUtils.indexOf(str2, str2, 0, 0) + 17, objArr116);
                                                    java.lang.String intern41 = ((java.lang.String) objArr116[0]).intern();
                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                    a("\u0000\u0000\u0000\u0000", "唷쒡\udd40\udfc3\uefed칀4忪\udd8b\ue013報辚왙㮘\ueb5e\ue6c7蕷둤菳䛪\uea34", "襜탘챚痤", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1523636360, (char) ((-1) - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr117);
                                                    java.lang.String intern42 = ((java.lang.String) objArr117[0]).intern();
                                                    java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                    c("쾵矏ᒮ\ue39eⵍ縥ꏍɚᬼƠ컘㕼謟碌崄\ue3bf", android.view.View.MeasureSpec.getMode(0) + 16, objArr118);
                                                    java.lang.String intern43 = ((java.lang.String) objArr118[0]).intern();
                                                    java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                    c("쾵矏ᒮ\ue39eⵍ縥ꏍɚ蟰䡎垐뀔籸\udf19凞䦁坐袈佪얆齊ក뛲ퟯ坵柺", 25 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr119);
                                                    java.lang.String intern44 = ((java.lang.String) objArr119[0]).intern();
                                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                    c("쾵矏ᒮ\ue39eⵍ縥ꏍɚ뿠\uf447鹰Ꜳ坵柺", android.text.TextUtils.indexOf(str2, str2) + 13, objArr120);
                                                    java.lang.String intern45 = ((java.lang.String) objArr120[0]).intern();
                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                    c("찦⌧긻⪡㞽妤鹰Ꜳ坵柺", 9 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr121);
                                                    java.lang.String intern46 = ((java.lang.String) objArr121[0]).intern();
                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                    a("\u0000\u0000\u0000\u0000", "ᅕ෨ᐳ↕莶ﺁ뽻蒜", "熂鷅ጓ⛇", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) android.graphics.Color.argb(0, 0, 0, 0), objArr122);
                                                    java.lang.String[] strArr6 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr122[0]).intern()};
                                                    for (int i23 = 0; i23 < 12; i23++) {
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                        sb.append(strArr6[i23]);
                                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                        c("﮴岅", android.view.KeyEvent.normalizeMetaState(0) + 2, objArr123);
                                                        sb.append(((java.lang.String) objArr123[0]).intern());
                                                        java.lang.Object[] objArr124 = {sb.toString()};
                                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                        if (obj29 == null) {
                                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3161, (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 33100));
                                                            byte b41 = $$a[14];
                                                            short s20 = (short) (b41 + 1);
                                                            byte b42 = b41;
                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                            b(s20, b42, (byte) (b42 + 1), objArr125);
                                                            obj29 = cls26.getMethod((java.lang.String) objArr125[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj29);
                                                        }
                                                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr124)).longValue();
                                                        long j32 = ~longValue12;
                                                        long j33 = ((((((-565) * longValue12) - 691448920911L) + (((~(longValue12 | 1219486632)) | (~(j2 | 1219486632))) * (-566))) + ((~((-1219486633) | j32)) * 566)) + ((~((1219486632 | j32) | j2)) * 566)) - 118181475;
                                                        int i24 = i2 | (-810953382);
                                                        if (((((int) (j33 >> 32)) & ((((~i24) | (-2046787504)) * (-828)) + 1754752898 + (i24 * (-828)) + 1454501292)) | (((int) j33) & (((~(i2 | 79547052)) * 979) + 1401697426 + (((-1357679358) | i) * (-979)) + (((~(79547052 | i)) | (~(i2 | (-1357679358)))) * 979)))) != 0) {
                                                            RecordsJson = (IccPrivateKeyCrtComponentsJson + 79) % 128;
                                                            i6 = i23 + 110;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    if (str10.contains(strArr5[i22])) {
                                                        break;
                                                    }
                                                    i22++;
                                                }
                                            }
                                        }
                                        i6 = 0;
                                        if (i6 != 0) {
                                            java.lang.Object[] objArr126 = {new int[]{i}, new int[]{i6 ^ i}, null, new int[1]};
                                            java.lang.Object[] objArr127 = {607841342, 16, java.lang.Integer.valueOf(((((~((-758352008) | i)) | 49026487) * (-318)) - 242350831) + (((~(49026487 | i)) | (~(i2 | (-46929201)))) * 318) + (((~(i | (-46929201))) | (~(i2 | 805281207))) * 318))};
                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj30 == null) {
                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, 2714 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                                byte[] bArr7 = $$a;
                                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                b(653, bArr7[14], bArr7[16], objArr128);
                                                obj30 = cls27.getMethod((java.lang.String) objArr128[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                            }
                                            ((int[]) objArr126[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr127)).intValue();
                                            return objArr126;
                                        }
                                        long[] jArr = {472001035};
                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                        c("竻準齊ក鑢䄾쫡뱷闂쑯⧼쓲쓛擸अ\udd2f荏蘺", 16 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr129);
                                        java.lang.Object[] objArr130 = {((java.lang.String) objArr129[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                        if (obj31 == null) {
                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - android.graphics.Color.red(0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3095, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                            byte b43 = $$a[14];
                                            short s21 = (short) (b43 + 1);
                                            byte b44 = b43;
                                            java.lang.Object[] objArr131 = new java.lang.Object[1];
                                            b(s21, b44, (byte) (b44 + 1), objArr131);
                                            obj31 = cls28.getMethod((java.lang.String) objArr131[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj31);
                                        }
                                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr130)).longValue();
                                        long j34 = ~((-235569710) | longValue13);
                                        long j35 = ~longValue13;
                                        long j36 = ~(235569709 | j35);
                                        long j37 = (((((399 * longValue13) + 93992313891L) + (((j34 | j36) | (~(j35 | j2))) * 398)) + ((235569709 | longValue13) * (-1194))) + ((((~(j35 | j)) | j34) | j36) * 398)) - 2146217619;
                                        int i25 = (int) (j37 >> 32);
                                        int i26 = ~(1228881936 | i);
                                        int i27 = ((i25 & ((((((~(i2 | 1228881936)) | 536881732) * (-245)) + 647346542) + (i26 * (-245))) + ((i26 | (-1628858949)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) | (((int) j37) & (((((i2 | (-682918065)) * (-369)) + 802172634) + (((~(i2 | 687195321)) | (-750031089)) * (-369))) + ((((~((-687195322) | i)) | 4277257) | (~(i2 | (-67113025)))) * 369)))) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE : 0;
                                        if (i27 != 0) {
                                            java.lang.Object[] objArr132 = {new int[]{i}, new int[]{i27 ^ i}, null, new int[1]};
                                            java.lang.Object[] objArr133 = {607841342, 16, java.lang.Integer.valueOf(((i | (-709457361)) * 614) + 1816147877 + (((~(i2 | (-726302301))) | 16910860 | (~(i2 | (-16976781)))) * (-1228)) + (((~(i2 | (-709391441))) | (~(i2 | (-65921)))) * 614))};
                                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj32 == null) {
                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                byte[] bArr8 = $$a;
                                                java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                b(653, bArr8[14], bArr8[16], objArr134);
                                                obj32 = cls29.getMethod((java.lang.String) objArr134[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                            }
                                            ((int[]) objArr132[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr133)).intValue();
                                            return objArr132;
                                        }
                                        long[] jArr2 = {472001035};
                                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                                        a("\u0000\u0000\u0000\u0000", "\ue348嬷弴댓댩椝ꝟꎲ똢럕ウ电꾕㼂椊侕綋㚱皢仠䊘ỻ", "燊Ỹɟ褝", android.text.TextUtils.indexOf(str2, str2), (char) android.text.TextUtils.getTrimmedLength(str2), objArr135);
                                        try {
                                            bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr135[0]).intern()));
                                            j5 = 0;
                                        } catch (java.io.IOException unused2) {
                                            bufferedInputStream2 = null;
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            bufferedInputStream = null;
                                        }
                                        while (true) {
                                            try {
                                                int read = bufferedInputStream2.read();
                                                if (read != -1) {
                                                    j5 = ((j5 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                    for (int i28 = 0; i28 <= 0; i28++) {
                                                        if (j5 == jArr2[i28]) {
                                                            int i29 = i28 + 1;
                                                            try {
                                                                bufferedInputStream2.close();
                                                            } catch (java.lang.Exception unused3) {
                                                            }
                                                            if (i29 != 0) {
                                                                java.lang.Object[] objArr136 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr137 = {607841342, 16, java.lang.Integer.valueOf((((~(i2 | (-4757521))) | (~(704567999 | i))) * (-272)) + 1508508191 + (((~((-703518907) | i)) | 698761386) * (-272)) + (((~(i | 703518906)) | 5806613) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                                                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj33 == null) {
                                                                    java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getMode(0), android.view.View.getDefaultSize(0, 0) + 2713, (char) android.text.TextUtils.getOffsetBefore(str2, 0));
                                                                    byte[] bArr9 = $$a;
                                                                    java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                                    b(653, bArr9[14], bArr9[16], objArr138);
                                                                    obj33 = cls30.getMethod((java.lang.String) objArr138[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                                }
                                                                ((int[]) objArr136[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr137)).intValue();
                                                                return objArr136;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (java.io.IOException unused4) {
                                            } catch (java.lang.Throwable th4) {
                                                th = th4;
                                                bufferedInputStream = bufferedInputStream2;
                                                if (bufferedInputStream == null) {
                                                    throw th;
                                                }
                                                try {
                                                    bufferedInputStream.close();
                                                    throw th;
                                                } catch (java.lang.Exception unused5) {
                                                    throw th;
                                                }
                                            }
                                            try {
                                                bufferedInputStream2.close();
                                                break;
                                            } catch (java.lang.Exception unused6) {
                                            }
                                        }
                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                        if (obj34 == null) {
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.graphics.Color.alpha(0), 1889 - android.os.Process.getGidForName(str2), (char) (3600 - (android.os.Process.myPid() >> 22)));
                                            byte b45 = $$a[14];
                                            short s22 = (short) (b45 + 1);
                                            byte b46 = b45;
                                            java.lang.Object[] objArr139 = new java.lang.Object[1];
                                            b(s22, b46, (byte) (b46 + 1), objArr139);
                                            obj34 = cls31.getMethod((java.lang.String) objArr139[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj34);
                                        }
                                        long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, null)).longValue();
                                        long j38 = ~longValue14;
                                        long j39 = (-1742209257) | j38;
                                        long j40 = ((((((-622) * longValue14) - 1087138576368L) + ((~(j39 | j2)) * 623)) + ((j | (~(longValue14 | 1742209256))) * (-623))) + ((((~j39) | (~(j38 | j2))) | (~(j2 | (-1742209257)))) * 623)) - 137039123;
                                        if (((((int) (j40 >> 32)) & (((i2 | (-1521222193)) * (-490)) + 915217574 + (((~((-1525547891) | i)) | 4325698) * 490) + 327851750)) | (((int) j40) & ((((~(i2 | (-1745145289))) | 307918878) * (-328)) + 257847889 + ((307918878 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(1745145288 | i)) | 307900438 | (~(i2 | (-1745126849)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)))) != 0) {
                                            java.lang.Object[] objArr140 = {new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i27}, null, new int[1]};
                                            int i30 = ~(i | 670528175);
                                            java.lang.Object[] objArr141 = {607841342, 16, java.lang.Integer.valueOf((((~(i2 | (-668221990))) | 38797344 | i30) * (-252)) + 1896321615 + ((i30 | (~(i2 | (-629424646)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj35 == null) {
                                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.combineMeasuredStates(0, 0), 2713 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                byte[] bArr10 = $$a;
                                                java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                b(653, bArr10[14], bArr10[16], objArr142);
                                                obj35 = cls32.getMethod((java.lang.String) objArr142[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                            }
                                            ((int[]) objArr140[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr141)).intValue();
                                            return objArr140;
                                        }
                                        java.lang.Object[] objArr143 = {2};
                                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                        if (obj36 == null) {
                                            java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 26, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2363, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                            byte b47 = $$a[14];
                                            short s23 = (short) (b47 + 1);
                                            byte b48 = b47;
                                            java.lang.Object[] objArr144 = new java.lang.Object[1];
                                            b(s23, b48, (byte) (b48 + 1), objArr144);
                                            obj36 = cls33.getMethod((java.lang.String) objArr144[0], java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj36);
                                        }
                                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj36).invoke(null, objArr143)).longValue();
                                        long j41 = ((-55) * longValue15) + 16606017230L + (((~(j2 | (-301927586))) | longValue15) * 56) + ((~((-301927586) | longValue15)) * (-56)) + (((~(j | longValue15)) | (-301927586)) * 56) + 1709837785;
                                        int i31 = (int) (j41 >> 32);
                                        int i32 = (int) j41;
                                        int i33 = ~(i2 | 1680171930);
                                        if (((i31 & (((~(i2 | (-1418046551))) * 52) + 804432586 + (((~(i2 | (-1422785887))) | (~(i2 | 1434954998)) | 4739336) * (-52)) + (((~(i2 | 1422785886)) | android.R.id.KEYCODE_CALCULATOR) * 52))) | (i32 & ((((537207040 | i33) * (-970)) - 611821359) + ((i33 | 1142964890) * 970)))) == 2) {
                                            java.lang.Object[] objArr145 = {new int[]{i}, new int[]{i ^ 270}, null, new int[1]};
                                            java.lang.Object[] objArr146 = {607841342, 16, java.lang.Integer.valueOf(((~(i2 | (-600551946))) * 979) + 294637462 + ((108773574 | i) * (-979)) + (((~(i | (-600551946))) | (~(i2 | 108773574))) * 979))};
                                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj37 == null) {
                                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2714 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                byte[] bArr11 = $$a;
                                                java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                b(653, bArr11[14], bArr11[16], objArr147);
                                                obj37 = cls34.getMethod((java.lang.String) objArr147[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                            }
                                            ((int[]) objArr145[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr146)).intValue();
                                            return objArr145;
                                        }
                                        java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                        if (obj38 == null) {
                                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.graphics.ImageFormat.getBitsPerPixel(0) + 3198, (char) android.graphics.Color.alpha(0));
                                            java.lang.Object[] objArr148 = new java.lang.Object[1];
                                            b(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, r5[23], (byte) (-$$a[14]), objArr148);
                                            obj38 = cls35.getMethod((java.lang.String) objArr148[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj38);
                                        }
                                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj38).invoke(null, null)).longValue();
                                        long j42 = ~longValue16;
                                        long j43 = (((-97) * longValue16) - 68467893100L) + (((~(j42 | j)) | (~((-1369357862) | j42))) * 98) + (((~(j | 1369357861)) | j42 | (~(j2 | (-1369357862)))) * (-49)) + (((~(longValue16 | (-1369357862))) | (~(j42 | j2))) * 49) + 1465603223;
                                        if (((((int) (j43 >> 32)) & ((((((~((-295976921) | i)) | 295709192) | (~(1141249490 | i))) * (-754)) - 243131562) + (((~((-295709193) | i)) | (~(i2 | 1436958682))) * (-754)) + ((i2 | (-295976921)) * 754))) | (((int) j43) & (((((~((-713031815) | i)) | (~(i2 | 2144709071))) * (-318)) - 1457907965) + (((~(713075078 | i)) | 1431633993) * (-318)) + (((~((-713075079) | i)) | (-2144665808)) * 318)))) != 0) {
                                            java.lang.Object[] objArr149 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr150 = {607841342, 16, java.lang.Integer.valueOf(((((~(i2 | 699883215)) | 9442304) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 769876021) + (((~(i2 | 162798795)) | 546526724) * (-440)) + ((i | 699883215) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
                                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj39 == null) {
                                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.graphics.Color.green(0));
                                                byte[] bArr12 = $$a;
                                                java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                b(653, bArr12[14], bArr12[16], objArr151);
                                                obj39 = cls36.getMethod((java.lang.String) objArr151[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                            }
                                            ((int[]) objArr149[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr150)).intValue();
                                            return objArr149;
                                        }
                                        java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                        if (obj40 == null) {
                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 3196 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                            byte b49 = $$a[14];
                                            short s24 = (short) (b49 + 1);
                                            byte b50 = b49;
                                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                                            b(s24, b50, (byte) (b50 + 1), objArr152);
                                            obj40 = cls37.getMethod((java.lang.String) objArr152[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj40);
                                        }
                                        long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, null)).longValue();
                                        long j44 = ~longValue17;
                                        long j45 = ~(542351995 | j44 | j2);
                                        long j46 = ((-712) * longValue17) + 387239324430L + (((~(longValue17 | (-542351996))) | (~(j | (-542351996))) | j45) * (-713)) + (j45 * 1426) + ((~(j44 | j)) * 713) + 410517895;
                                        if (((((int) (j46 >> 32)) & ((((~(i2 | (-288810846))) | 3302989) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 501358106 + ((~((-3302990) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i2 | (-1148415566))) | 1145112576 | (~((-285507857) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | (((int) j46) & ((((((~(i2 | 123449949)) | 1313776460) * (-933)) + 1035845984) + (((~(i2 | 1313776460)) | 17895441) * 933)) - 301891844))) != 0) {
                                            IccPrivateKeyCrtComponentsJson = (RecordsJson + 29) % 128;
                                            java.lang.Object[] objArr153 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr154 = {607841342, 16, java.lang.Integer.valueOf((((268444677 | i) * 988) - 59194417) + (((~(i2 | 981509893)) | (-985249590)) * (-1976)) + (((~(i | 272184373)) | 268444677 | (~(i2 | (-272184374)))) * 988))};
                                            java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj41 == null) {
                                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.text.TextUtils.indexOf(str2, str2, 0));
                                                byte[] bArr13 = $$a;
                                                java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                b(653, bArr13[14], bArr13[16], objArr155);
                                                obj41 = cls38.getMethod((java.lang.String) objArr155[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                                            }
                                            ((int[]) objArr153[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr154)).intValue();
                                            return objArr153;
                                        }
                                        java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                        if (obj42 == null) {
                                            java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.graphics.ImageFormat.getBitsPerPixel(0) + 2837, (char) android.graphics.Color.alpha(0));
                                            byte b51 = $$a[14];
                                            short s25 = (short) (b51 + 1);
                                            byte b52 = b51;
                                            java.lang.Object[] objArr156 = new java.lang.Object[1];
                                            b(s25, b52, (byte) (b52 + 1), objArr156);
                                            obj42 = cls39.getMethod((java.lang.String) objArr156[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj42);
                                        }
                                        long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, null)).longValue();
                                        long j47 = ~longValue18;
                                        long j48 = ~((-803811992) | j47 | j2);
                                        long j49 = ((((((-712) * longValue18) - 573921762288L) + ((((~(longValue18 | 803811991)) | (~(j | 803811991))) | j48) * (-713))) + (j48 * 1426)) + ((~(j47 | j)) * 713)) - 2482763;
                                        if (((((int) (j49 >> 32)) & (((((i2 | 583206923) * 1324) - 818884594) + (((~(854002843 | i)) | (~(583223567 | i))) * (-1324))) - 1110709064)) | (((int) j49) & (((~(i2 | (-67175830))) * (-783)) + 1903131583 + (((~(i2 | 1942919776)) | (-914821110)) * 783)))) != 0) {
                                            java.lang.Object[] objArr157 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                            int i34 = ~(977250825 | i);
                                            java.lang.Object[] objArr158 = {607841342, 16, java.lang.Integer.valueOf((((~(i | 267925305)) | (~((-977250826) | i)) | 805799936) * (-880)) + 2145524319 + (((~(i2 | (-977250826))) | (-267925306) | i34) * (-880)) + (i34 * 880))};
                                            java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj43 == null) {
                                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2713, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                byte[] bArr14 = $$a;
                                                java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                b(653, bArr14[14], bArr14[16], objArr159);
                                                obj43 = cls40.getMethod((java.lang.String) objArr159[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj43);
                                            }
                                            ((int[]) objArr157[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr158)).intValue();
                                            return objArr157;
                                        }
                                        long[] jArr3 = {624887784092251L};
                                        java.lang.Object[] objArr160 = new java.lang.Object[1];
                                        c("竻準齊ក鑢䄾쫡뱷闂쑯⧼쓲쓛擸अ\udd2f荏蘺", 17 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr160);
                                        java.lang.Object[] objArr161 = {((java.lang.String) objArr160[0]).intern(), 3, 2251799813685247L, jArr3};
                                        java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                        if (obj44 == null) {
                                            java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('U' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3096 - android.text.TextUtils.getTrimmedLength(str2), (char) android.graphics.Color.green(0));
                                            byte b53 = $$a[14];
                                            short s26 = (short) (b53 + 1);
                                            byte b54 = b53;
                                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                                            b(s26, b54, (byte) (b54 + 1), objArr162);
                                            obj44 = cls41.getMethod((java.lang.String) objArr162[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj44);
                                        }
                                        long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj44).invoke(null, objArr161)).longValue();
                                        long j50 = ~((~longValue19) | j2);
                                        long j51 = ((((((-574) * longValue19) + 482254373636L) + (((~(j | 840164413)) | j50) * 1150)) + (((~(j | longValue19)) | j50) * (-575))) + (((~(j | (-840164414))) | (~(j2 | 840164413))) * 575)) - 1070483496;
                                        if (((((int) (j51 >> 32)) & ((((((~(i2 | (-1446009558))) | (~(1475870719 | i))) | (~((-21078017) | i))) * 765) - 1455363545) + (((~(i2 | 29861162)) | 1446009557) * 1530) + (((~(29861162 | i)) | (~(i2 | (-21078017)))) * 765))) | (((int) j51) & ((((~(i2 | 1475739582)) * 130) - 1843362485) + (((~(1475739582 | i)) | 25182468) * 130)))) != 0) {
                                            java.lang.Object[] objArr163 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                            int i35 = ~(i | 401030591);
                                            java.lang.Object[] objArr164 = {607841342, 16, java.lang.Integer.valueOf((((~(i2 | (-317011251))) | 308294928 | i35) * (-252)) + 1090236047 + ((i35 | (~(i2 | (-8716323)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                                            java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj45 == null) {
                                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2713 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                                byte[] bArr15 = $$a;
                                                java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                b(653, bArr15[14], bArr15[16], objArr165);
                                                obj45 = cls42.getMethod((java.lang.String) objArr165[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj45);
                                            }
                                            ((int[]) objArr163[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr164)).intValue();
                                            return objArr163;
                                        }
                                        java.lang.Object[] objArr166 = new java.lang.Object[1];
                                        c("ᔢ掮첩检곘\ue7e0顸燝茀㩫\ue676릁", 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr166);
                                        java.lang.Object[] objArr167 = {((java.lang.String) objArr166[0]).intern()};
                                        java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        if (obj46 == null) {
                                            java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 3160 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33099));
                                            java.lang.Object[] objArr168 = new java.lang.Object[1];
                                            b(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, r6[23], (byte) (-$$a[14]), objArr168);
                                            obj46 = cls43.getMethod((java.lang.String) objArr168[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj46);
                                        }
                                        long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj46).invoke(null, objArr167)).longValue();
                                        long j52 = ~longValue20;
                                        long j53 = (503 * longValue20) + 73255015596L + (((~(longValue20 | (-146217596))) | (~(j52 | j2))) * (-502)) + ((~(j52 | j | (-146217596))) * (-502)) + (((~(j2 | 146217595)) | j52) * 502) + 1141652499;
                                        if (((((int) (j53 >> 32)) & ((((i2 | 1455057527) * 1444) - 1153123274) + (((~(1446207513 | i)) | 8915558 | (~((-8981103) | i))) * (-1444)) + 1715452304)) | (((int) j53) & ((((~((-486398808) | i)) | 1644175360) * (-502)) + 1509023963 + ((~(i2 | (-279449858))) * (-502)) + (((~(1923625217 | i)) | (-486398808)) * 502)))) != 0) {
                                            java.lang.Object[] objArr169 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr170 = {607841342, 16, java.lang.Integer.valueOf(((((~(i | 241215872)) | (-535226832)) * 305) - 1989722672) + (((~(i2 | 241215872)) | (-468109648)) * 305))};
                                            java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj47 == null) {
                                                java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2713, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                byte[] bArr16 = $$a;
                                                java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                b(653, bArr16[14], bArr16[16], objArr171);
                                                obj47 = cls44.getMethod((java.lang.String) objArr171[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj47);
                                            }
                                            ((int[]) objArr169[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj47).invoke(null, objArr170)).intValue();
                                            return objArr169;
                                        }
                                        java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                        if (obj48 == null) {
                                            java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.View.MeasureSpec.getSize(0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2137, (char) (59513 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                                            byte b55 = $$a[14];
                                            short s27 = (short) (b55 + 1);
                                            byte b56 = b55;
                                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                                            b(s27, b56, (byte) (b56 + 1), objArr172);
                                            obj48 = cls45.getMethod((java.lang.String) objArr172[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj48);
                                        }
                                        long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, null)).longValue();
                                        long j54 = ~((-1129145739) | longValue21);
                                        long j55 = ~longValue21;
                                        long j56 = (((((989 * longValue21) - 2230062832550L) + ((j2 | j54) * 988)) + (((~(j | 1129145738)) | (~(1129145738 | j55))) * (-1976))) + (((~(j | longValue21)) | ((~(j55 | j2)) | j54)) * 988)) - 2001236324;
                                        if (((((int) (j56 >> 32)) & (((r3 * 495) - 1163784580) + (((~(i2 | (-1101048905))) | (-1773469261)) * 495))) | (((int) j56) & (((((~(i2 | (-2015159989))) | (~(842580897 | i))) * 959) - 659142169) + (((~((-2015159989) | i)) | (~(i2 | 842580897))) * 959)))) != 0) {
                                            java.lang.Object[] objArr173 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr174 = {607841342, 16, java.lang.Integer.valueOf((((~(357709363 | i)) | 10815628) * (-140)) + 282801029 + ((~(368524991 | i)) * 70) + (((~(i | 351616156)) | 27724463) * 70))};
                                            java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj49 == null) {
                                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, android.view.View.getDefaultSize(0, 0) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                byte[] bArr17 = $$a;
                                                java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                b(653, bArr17[14], bArr17[16], objArr175);
                                                obj49 = cls46.getMethod((java.lang.String) objArr175[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj49);
                                            }
                                            ((int[]) objArr173[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr174)).intValue();
                                            return objArr173;
                                        }
                                        java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                        if (obj50 == null) {
                                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 36, android.text.TextUtils.getOffsetBefore(str2, 0) + 2972, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                            byte b57 = $$a[14];
                                            short s28 = (short) (b57 + 1);
                                            byte b58 = b57;
                                            java.lang.Object[] objArr176 = new java.lang.Object[1];
                                            b(s28, b58, (byte) (b58 + 1), objArr176);
                                            obj50 = cls47.getMethod((java.lang.String) objArr176[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj50);
                                        }
                                        long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj50).invoke(null, null)).longValue();
                                        long j57 = ~longValue22;
                                        long j58 = ~(j | longValue22);
                                        long j59 = (((((971 * longValue22) + 2503591221866L) + (((~((-1291176494) | j57)) | j58) * (-970))) + ((~(longValue22 | 1291176493)) * 1940)) + (((~(1291176493 | j57)) | j58) * 970)) - 561525270;
                                        if (((((int) (j59 >> 32)) & ((((~(i2 | (-1198788844))) | (~(1333155071 | i))) * (-831)) + 625219710 + ((~((-1094717505) | i)) * (-1662)) + (((~(i2 | (-238437568))) | (~(238437567 | i)) | (~(1198788843 | i))) * 831))) | (((int) j59) & (((((-2146434812) | r5) * (-280)) - 519804615) + (((~(1804417691 | i)) | (~((-367191282) | i))) * 140) + (((~((-342017121) | i)) | (~(i2 | 2146434811)) | (~(i2 | (-25174162)))) * 140)))) != 0) {
                                            java.lang.Object[] objArr177 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                            int i36 = ~(i | (-152043530));
                                            java.lang.Object[] objArr178 = {607841342, 16, java.lang.Integer.valueOf(((538968582 | i36) * (-476)) + 202057019 + (i36 * 952) + ((~(i2 | (-152043530))) * 476))};
                                            java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj51 == null) {
                                                java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.TextUtils.getTrimmedLength(str2) + 2713, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                byte[] bArr18 = $$a;
                                                java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                b(653, bArr18[14], bArr18[16], objArr179);
                                                obj51 = cls48.getMethod((java.lang.String) objArr179[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj51);
                                            }
                                            ((int[]) objArr177[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr178)).intValue();
                                            return objArr177;
                                        }
                                        java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                        if (obj52 == null) {
                                            java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2159 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (56400 - android.view.KeyEvent.normalizeMetaState(0)));
                                            byte b59 = $$a[14];
                                            short s29 = (short) (b59 + 1);
                                            byte b60 = b59;
                                            java.lang.Object[] objArr180 = new java.lang.Object[1];
                                            b(s29, b60, (byte) (b60 + 1), objArr180);
                                            obj52 = cls49.getMethod((java.lang.String) objArr180[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj52);
                                        }
                                        long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj52).invoke(null, null)).longValue();
                                        long j60 = ~longValue23;
                                        long j61 = ~(j2 | 1227917946);
                                        long j62 = ~((-1227917947) | longValue23);
                                        long j63 = (((((408 * longValue23) - 998297290098L) + (((~(j60 | 1227917946)) | j61) * (-814))) + ((((~(j60 | j)) | j62) | j61) * 407)) + (((~(longValue23 | j2)) | ((~(j2 | (-1227917947))) | j62)) * 407)) - 1793735966;
                                        if (((((int) (j63 >> 32)) & (((((-603082904) | r3) * 764) - 746877470) + (((~(i2 | (-603082904))) | 563085314) * (-1528)) + (((~(i2 | 2040309314)) | (-1517221590)) * 764))) | (((int) j63) & (((((-979815272) | i) * 140) - 1579907215) + (((~(i2 | (-979815272))) | 539246885) * (-280)) + (((~(i2 | (-457411139))) | android.R.attr.theme | (~((-539246886) | i))) * 140)))) != 0) {
                                            java.lang.Object[] objArr181 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr182 = {607841342, 16, java.lang.Integer.valueOf((((~(i2 | 22070905)) | (~(731396425 | i))) * 959) + 1729991179 + (((~(i | 22070905)) | (~(i2 | 731396425))) * 959))};
                                            java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj53 == null) {
                                                java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2714 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                                byte[] bArr19 = $$a;
                                                java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                b(653, bArr19[14], bArr19[16], objArr183);
                                                obj53 = cls50.getMethod((java.lang.String) objArr183[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj53);
                                            }
                                            ((int[]) objArr181[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj53).invoke(null, objArr182)).intValue();
                                            return objArr181;
                                        }
                                        java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                        if (obj54 == null) {
                                            java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.view.View.MeasureSpec.getSize(0), 838 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                            byte b61 = $$a[14];
                                            short s30 = (short) (b61 + 1);
                                            byte b62 = b61;
                                            java.lang.Object[] objArr184 = new java.lang.Object[1];
                                            b(s30, b62, (byte) (b62 + 1), objArr184);
                                            obj54 = cls51.getMethod((java.lang.String) objArr184[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj54);
                                        }
                                        long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj54).invoke(null, null)).longValue();
                                        long j64 = ~(j2 | (-630874361));
                                        long j65 = ~longValue24;
                                        long j66 = ((-139) * longValue24) + 88953284760L + (((~((-630874361) | longValue24)) | j64) * (-280)) + ((j64 | (~(j65 | j2))) * 140) + (((~(longValue24 | j | (-630874361))) | (~((-630874361) | j65 | j2)) | (~(j65 | j | 630874360))) * 140) + 1329878542;
                                        if (((((int) (j66 >> 32)) & (((((~(571169687 | i)) | (-866056724)) * (-668)) - 141570034) + (((~((-866056724) | i)) | 571169687) * 1336) + (((-294952961) | i) * 668))) | (((int) j66) & ((((~(349473479 | i)) | (~(i2 | (-13929155)))) * (-406)) + 1951487271 + ((~(i2 | (-1073823777))) * (-406)) + (((~(1087752930 | i)) | (~(i2 | (-349473480)))) * 406)))) != 0) {
                                            int i37 = IccPrivateKeyCrtComponentsJson + 105;
                                            RecordsJson = i37 % 128;
                                            i7 = i37 % 2 == 0 ? i ^ 27348 : i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE;
                                        } else {
                                            i7 = i;
                                        }
                                        if (i7 != i) {
                                            java.lang.Object[] objArr185 = {new int[]{i}, new int[]{i7}, null, new int[1]};
                                            java.lang.Object[] objArr186 = {607841342, 16, java.lang.Integer.valueOf((((~(i2 | (-17173634))) * 433) - 1986471316) + (((~((-649122623) | i)) | (-60202898)) * (-433)) + (((~(i | (-60202898))) | (-666296256)) * 433))};
                                            java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj55 == null) {
                                                java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, android.graphics.Color.alpha(0) + 2713, (char) android.graphics.Color.red(0));
                                                byte[] bArr20 = $$a;
                                                java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                b(653, bArr20[14], bArr20[16], objArr187);
                                                obj55 = cls52.getMethod((java.lang.String) objArr187[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj55);
                                            }
                                            ((int[]) objArr185[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj55).invoke(null, objArr186)).intValue();
                                            java.lang.Object[] objArr188 = {objArr185};
                                            java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                            if (obj56 == null) {
                                                java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 3238, (char) android.view.View.MeasureSpec.getSize(0));
                                                byte[] bArr21 = $$a;
                                                java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                b(653, bArr21[14], bArr21[16], objArr189);
                                                obj56 = cls53.getMethod((java.lang.String) objArr189[0], java.lang.Object[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj56);
                                            }
                                            ((java.lang.reflect.Method) obj56).invoke(obj, objArr188);
                                            return objArr185;
                                        }
                                        java.lang.Object[] objArr190 = {java.lang.Integer.valueOf(i), obj, 607841342, 0};
                                        java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                        if (obj57 == null) {
                                            obj57 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 30, 3289 - android.text.TextUtils.indexOf(str2, str2), (char) android.view.KeyEvent.keyCodeFromString(str2))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.getCapsMode(str2, 0, 0), 3237 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj57);
                                        }
                                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj57).newInstance(objArr190);
                                        try {
                                            java.lang.Object[] objArr191 = new java.lang.Object[1];
                                            a("\u0000\u0000\u0000\u0000", "憼ꡗﺖ䭆곛ﲤ鸖帧㞫㫊誽嶿ɿ\uf78c䣅梧", "퀇恬Ț뉆", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (android.view.KeyEvent.keyCodeFromString(str2) + 17922), objArr191);
                                            java.lang.Class<?> cls54 = java.lang.Class.forName(((java.lang.String) objArr191[0]).intern());
                                            java.lang.Object[] objArr192 = new java.lang.Object[1];
                                            c("\ue7a9་\ude84⇁좈笄", 5 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr192);
                                            cls54.getMethod(((java.lang.String) objArr192[0]).intern(), null).invoke(newInstance, null);
                                            java.lang.Object[] objArr193 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                            java.lang.Object[] objArr194 = {607841342, 0, java.lang.Integer.valueOf(((((-2188289) | i) * (-627)) - 1220172852) + (((~(2749584 | i)) | 712075104) * (-627)) + (((~(i | 712075104)) | (~(i2 | (-2749585)))) * 627))};
                                            java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj58 == null) {
                                                java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, android.view.KeyEvent.normalizeMetaState(0) + 2713, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                byte[] bArr22 = $$a;
                                                java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                b(653, bArr22[14], bArr22[16], objArr195);
                                                obj58 = cls55.getMethod((java.lang.String) objArr195[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj58);
                                            }
                                            ((int[]) objArr193[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr194)).intValue();
                                            return objArr193;
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause2 = th5.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th5;
                                        }
                                    }
                                    java.lang.Object[] objArr196 = {((java.lang.String) objArr[0]).intern()};
                                    java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj59 == null) {
                                        java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1921 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                        byte b63 = $$a[14];
                                        short s31 = (short) (b63 + 1);
                                        byte b64 = b63;
                                        java.lang.Object[] objArr197 = new java.lang.Object[1];
                                        b(s31, b64, (byte) (b64 + 1), objArr197);
                                        obj59 = cls56.getMethod((java.lang.String) objArr197[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj59);
                                    }
                                    java.lang.Object invoke6 = ((java.lang.reflect.Method) obj59).invoke(null, objArr196);
                                    if (invoke6 != null) {
                                        java.lang.Object[] objArr198 = new java.lang.Object[1];
                                        a("\u0000\u0000\u0000\u0000", "\ud8c7瀝偎惇\udfa0㘧̅", "쪇舘洜녶", 486174154 - android.text.TextUtils.getOffsetAfter(str2, 0), (char) ((-1) - android.os.Process.getGidForName(str2)), objArr198);
                                        if (invoke6.equals(((java.lang.String) objArr198[0]).intern())) {
                                            java.lang.Object[] objArr199 = new java.lang.Object[1];
                                            a("\u0000\u0000\u0000\u0000", "\udb67\ua87e\ue996\ue80f鈺䖇荦\uec4f臌\ue321꺔욥覉ꔋ⥴缭\u0a3a᾿㣁퓞\ued60樯ⅇ", "僤\uee6b젡鱇", 569273168 - android.text.TextUtils.getCapsMode(str2, 0, 0), (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr199);
                                            try {
                                                java.lang.Object[] objArr200 = {((java.lang.String) objArr199[0]).intern()};
                                                java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj60 == null) {
                                                    java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 1921 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                    byte b65 = $$a[14];
                                                    short s32 = (short) (b65 + 1);
                                                    byte b66 = b65;
                                                    java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                    b(s32, b66, (byte) (b66 + 1), objArr201);
                                                    obj60 = cls57.getMethod((java.lang.String) objArr201[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj60);
                                                }
                                                java.lang.String str11 = (java.lang.String) ((java.lang.reflect.Method) obj60).invoke(null, objArr200);
                                                if (str11 != null && (parseInt = java.lang.Integer.parseInt(str11)) != 0) {
                                                    i5 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                    if (i5 != 0) {
                                                    }
                                                }
                                            } catch (java.lang.Throwable th6) {
                                                java.lang.Throwable cause3 = th6.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th6;
                                            }
                                        }
                                    }
                                    i5 = 0;
                                    if (i5 != 0) {
                                    }
                                } catch (java.lang.Throwable th7) {
                                    java.lang.Throwable cause4 = th7.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th7;
                                }
                                objArr = new java.lang.Object[1];
                                c("鹰Ꜳ䂳싟\ue6d5\ue14f᠅꡴\ue6d5\ue14f玗콀꓅異\ue209郭齏ᑾ", android.os.Process.getGidForName(str2) + 19, objArr);
                            } else {
                                java.lang.Object[] objArr202 = new java.lang.Object[1];
                                c("齊ក퀊᠆㒠ᚖ뙒ꤺ輥漢补ɕ⃦䐚", android.view.Gravity.getAbsoluteGravity(0, 0) + 13, objArr202);
                                java.lang.Object[] objArr203 = {((java.lang.String) objArr202[0]).intern()};
                                java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj61 == null) {
                                    java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 40, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1921, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                    byte b67 = $$a[14];
                                    short s33 = (short) (b67 + 1);
                                    byte b68 = b67;
                                    java.lang.Object[] objArr204 = new java.lang.Object[1];
                                    b(s33, b68, (byte) (b68 + 1), objArr204);
                                    obj61 = cls58.getMethod((java.lang.String) objArr204[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj61);
                                }
                                java.lang.Object invoke7 = ((java.lang.reflect.Method) obj61).invoke(null, objArr203);
                                java.lang.Object[] objArr205 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "\udf43", "냗Ⴊ\ud95b歓", 1527818928 - android.text.TextUtils.indexOf(str, str), (char) (android.view.KeyEvent.keyCodeFromString(str) + 21465), objArr205);
                                c = 0;
                                if (invoke7.equals(((java.lang.String) objArr205[0]).intern())) {
                                    i8 = 1;
                                    int[] iArr3 = new int[i8];
                                    int[] iArr22 = new int[i8];
                                    iArr3[c] = i;
                                    iArr22[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                    java.lang.Object[] objArr222 = {iArr3, iArr22, null, new int[i8]};
                                    int i162 = ~(i2 | 105203147);
                                    java.lang.Object[] objArr232 = {607841342, 16, java.lang.Integer.valueOf((((38093003 | i162) * (-970)) - 1667497475) + ((i162 | 67110144) * 970))};
                                    obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj8 == null) {
                                    }
                                    ((int[]) objArr222[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr232)).intValue();
                                    return objArr222;
                                }
                                java.lang.Object[] objArr252 = new java.lang.Object[1];
                                c("廐ᆡ鹶ꨠ춍⛸ᒮ\ue39e", 7 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr252);
                                java.lang.String intern210 = ((java.lang.String) objArr252[0]).intern();
                                java.lang.Object[] objArr262 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "컑럣꺋ᖩ\uf202쯫", "쪖脅䂄㲒", android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 37440), objArr262);
                                java.lang.String intern310 = ((java.lang.String) objArr262[0]).intern();
                                java.lang.Object[] objArr272 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "⣢쪓䄴猢⧯᪈쎙", "꣓䍙祙륔", android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1497586089, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr272);
                                java.lang.String intern47 = ((java.lang.String) objArr272[0]).intern();
                                java.lang.Object[] objArr282 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "吅암帅讶\uf10a叢ᖀ⇏羔", "⒟ⳝ쭏\u0ba7", 1328340260 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.red(0), objArr282);
                                java.lang.String intern52 = ((java.lang.String) objArr282[0]).intern();
                                java.lang.Object[] objArr292 = new java.lang.Object[1];
                                c("禓뚌う车춼⼋", 6 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr292);
                                java.lang.String intern62 = ((java.lang.String) objArr292[0]).intern();
                                java.lang.Object[] objArr302 = new java.lang.Object[1];
                                c("鹰Ꜳ䂳싟댬ꅢ㒠ᚖ뙒ꤺ桤啛剼ﰜ", 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr302);
                                java.lang.String intern72 = ((java.lang.String) objArr302[0]).intern();
                                java.lang.Object[] objArr312 = new java.lang.Object[1];
                                c("\uf3fb邈㾎앐룳ﺊ", 5 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr312);
                                java.lang.String intern82 = ((java.lang.String) objArr312[0]).intern();
                                java.lang.Object[] objArr322 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "鞻ž雤\ud854啬湩", "≯ꘚ\udd88監", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58333), objArr322);
                                java.lang.String intern92 = ((java.lang.String) objArr322[0]).intern();
                                java.lang.Object[] objArr332 = new java.lang.Object[1];
                                c("㍥⠧", 2 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr332);
                                java.lang.String intern102 = ((java.lang.String) objArr332[0]).intern();
                                java.lang.Object[] objArr342 = new java.lang.Object[1];
                                c("暢ෙ몔秔ᡩ\uf6bc雦㠋\ue7a9་\ue6d5\ue14f꤁秡촏ڒ", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 17, objArr342);
                                java.lang.String intern112 = ((java.lang.String) objArr342[0]).intern();
                                java.lang.Object[] objArr352 = new java.lang.Object[1];
                                c("暢ෙ\uf196\uf486ꗭ\u17ec\ue664駨ﭡﶊ", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, objArr352);
                                java.lang.String intern122 = ((java.lang.String) objArr352[0]).intern();
                                java.lang.Object[] objArr362 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "솦䳑ᬱ댢웘鵹◰⌅", "쀊ㅃ\ue2c1깼", android.view.View.resolveSizeAndState(0, 0, 0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr362);
                                java.lang.String intern132 = ((java.lang.String) objArr362[0]).intern();
                                java.lang.Object[] objArr372 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "눤ꢥ႑ැ罺䌎榿욄落羼䌈形", "减阯뵕繮", android.text.TextUtils.indexOf(str, str, 0, 0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr372);
                                java.lang.String intern142 = ((java.lang.String) objArr372[0]).intern();
                                java.lang.Object[] objArr382 = new java.lang.Object[1];
                                c("劏쬳\ue8be➍쯶뒤蘭\udbc3\u244e霄㡜\ua8cdڎ杈", 14 - (android.os.Process.myTid() >> 22), objArr382);
                                java.lang.String intern152 = ((java.lang.String) objArr382[0]).intern();
                                java.lang.Object[] objArr392 = new java.lang.Object[1];
                                c("큨奬\uf38bͺ呚ꮡ좈笄", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 8, objArr392);
                                java.lang.String intern162 = ((java.lang.String) objArr392[0]).intern();
                                java.lang.Object[] objArr402 = new java.lang.Object[1];
                                c("뛻퉇쀮륕킉̏룳ﺊ", (android.os.Process.myPid() >> 22) + 7, objArr402);
                                java.lang.String intern172 = ((java.lang.String) objArr402[0]).intern();
                                java.lang.Object[] objArr412 = new java.lang.Object[1];
                                c("壭宑춼⼋ⵍ縥㇂ࢉ", (android.os.Process.myTid() >> 22) + 7, objArr412);
                                java.lang.String intern182 = ((java.lang.String) objArr412[0]).intern();
                                java.lang.Object[] objArr422 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "ƥ\uebf4", "ᆭ駁굴敽", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32173), objArr422);
                                java.lang.String intern192 = ((java.lang.String) objArr422[0]).intern();
                                java.lang.Object[] objArr432 = new java.lang.Object[1];
                                c("\ue7a9་\ude84⇁♕\uf2b2﹥\ue3a5햟狭쎉범\ueff3ﭷ伾틖姓⳪अ\udd2f", 19 - android.view.MotionEvent.axisFromString(str), objArr432);
                                java.lang.String intern202 = ((java.lang.String) objArr432[0]).intern();
                                java.lang.Object[] objArr442 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "쾭˾揥곗후ꘈ", "戀剒瘴ፌ", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 19574), objArr442);
                                java.lang.String intern212 = ((java.lang.String) objArr442[0]).intern();
                                java.lang.Object[] objArr452 = new java.lang.Object[1];
                                c("﮴岅", 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr452);
                                java.lang.String intern222 = ((java.lang.String) objArr452[0]).intern();
                                java.lang.Object[] objArr462 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "倒樀嬕稝Ⅺ䉜\uefa2촜ᠽ榞ꑬ臾넲篈⟧콈", "竌呥䀡逡", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (8512 - android.text.TextUtils.indexOf(str, str)), objArr462);
                                java.lang.String intern232 = ((java.lang.String) objArr462[0]).intern();
                                java.lang.Object[] objArr472 = new java.lang.Object[1];
                                c("\ue294\u17eeᰓ鿒쓇홯𨼾頬ⅿ", 9 - android.graphics.Color.red(0), objArr472);
                                java.lang.String intern242 = ((java.lang.String) objArr472[0]).intern();
                                java.lang.Object[] objArr482 = new java.lang.Object[1];
                                c("\ue294\u17eeᰓ鿒쓇홯𨼾鯁\u218c", 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr482);
                                java.lang.String intern252 = ((java.lang.String) objArr482[0]).intern();
                                java.lang.Object[] objArr492 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "碞\ue28b룒倿ⶖ粌☲검\uec13팙ᶋ", "혙顊\uea25\ue2ba", 630737622 - android.text.TextUtils.getCapsMode(str, 0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr492);
                                java.lang.String intern262 = ((java.lang.String) objArr492[0]).intern();
                                java.lang.Object[] objArr502 = new java.lang.Object[1];
                                c("呚ꮡ﹥\ue3a5蚞\ua63d滑\udb5b\ueec2\ue602\ue32c발", 10 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr502);
                                java.lang.String intern272 = ((java.lang.String) objArr502[0]).intern();
                                java.lang.Object[] objArr512 = new java.lang.Object[1];
                                c("呚ꮡ﹥\ue3a5蚞\ua63d湜㺎蹊ꅷ滑\udb5b\ueec2\ue602\ue32c발", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, objArr512);
                                java.lang.String intern282 = ((java.lang.String) objArr512[0]).intern();
                                java.lang.Object[] objArr522 = new java.lang.Object[1];
                                c("呚ꮡ﹥\ue3a5蚞\ua63d鰴╄ෘ嶭⨩⻈諱\udb3f", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 14, objArr522);
                                java.lang.String[] strArr22 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr522[0]).intern()};
                                java.lang.Object[] objArr532 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "ᎊ抛啅ꭹ㏒엠졿\ueed4\udfad\u0e73麩", "窔蟃朰繡", 814203770 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString(str)), objArr532);
                                java.lang.Object[] objArr542 = {((java.lang.String) objArr532[0]).intern()};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                }
                                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr542);
                                if (invoke == null) {
                                }
                                java.lang.Object[] objArr702 = new java.lang.Object[1];
                                c("쾵矏ᒮ\ue39e⟖\uf257Ẃ띿쫡뱷춼⼋⟦㬿\ueee4쉉\u0ecf艠幏\ue1c6ﭡﶊ⃦䐚", 23 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr702);
                                java.lang.Object[] objArr712 = {((java.lang.String) objArr702[0]).intern()};
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj3 == null) {
                                }
                                long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr712)).longValue();
                                long j202 = ~longValue72;
                                java.lang.String str92 = str;
                                long j212 = (((-167) * longValue72) - 182220709658L) + (((~(j202 | j2)) | (~((-1091141975) | j202))) * 336) + (((~(longValue72 | 1091141974)) | (~(j2 | 1091141974))) * (-168)) + (((~(j | 1091141974)) | j202) * 168) + 199398093;
                                j3 = (((int) (j212 >> 32)) & ((((~(195111423 | i)) | 1074266624) * (-140)) + 1713031858 + ((~(1269378047 | i)) * 70) + (((~(1242114987 | i)) | 1101529684) * 70))) | (((int) j212) & (((((~(i2 | (-1927153926))) | 930586960) * (-90)) - 1687905466) + (((~((-1927153926) | i)) | (-2013243734)) * (-45)) + (((~((-930586961) | i)) | (-1927153926) | (~(i2 | 930586960))) * 45)));
                                java.lang.Object[] objArr732 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "緪ㆪᯰ㛚\udeb2\u2d6b쇛低\u181dᒍᯰ薢桑枬嵠赼䦖", "䶣㠴䙛᠉", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1530410061, (char) (2374 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr732);
                                java.lang.Object[] objArr742 = {((java.lang.String) objArr732[0]).intern()};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj4 != null) {
                                }
                                long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr742)).longValue();
                                long j222 = ~(longValue82 | j2);
                                long j232 = ((111 * longValue82) - 25720655771L) + (((-235969320) | j222) * (-220)) + ((j222 | (~(235969319 | longValue82))) * 220) + (((~((~longValue82) | 235969319)) | (~((-235969320) | longValue82))) * 110) + 1054570748;
                                long j242 = (((int) (j232 >> 32)) & (((((~(i2 | (-75845))) | (~(1437150566 | i))) * (-272)) - 1758616182) + (((~((-2174053) | i)) | 2098208) * (-272)) + (((~(2174052 | i)) | 1435052358) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j232) & ((((((~(i2 | (-521988606))) | 335817125) | (~(i2 | (-1959215016)))) * 464) - 1664471227) + (((-186171481) | i) * (-464)) + (((~((-1959215016) | i)) | 335817125) * 464)));
                                if (j3 > 0) {
                                }
                                java.lang.Object[] objArr792 = new java.lang.Object[1];
                                c("쾵矏ᒮ\ue39e⟖\uf257Ẃ띿쫡뱷춼⼋⟦㬿\ueee4쉉\u0ecf艠幏\ue1c6ﭡﶊ⃦䐚", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, objArr792);
                                java.lang.Object[] objArr802 = {((java.lang.String) objArr792[0]).intern()};
                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj5 == null) {
                                }
                                long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr802)).longValue();
                                long j252 = ~(j | 1144528381);
                                long j262 = ~((-1144528382) | longValue92);
                                long j272 = ((-1527) * longValue92) + 875564211465L + ((longValue92 | j252) * 764) + (((~(j | longValue92)) | j262) * (-1528)) + (((~((~longValue92) | 1144528381)) | j262 | j252) * 764) + 146011686;
                                j4 = (((int) (j272 >> 32)) & ((((~((-1711974450) | i)) | (~((-274748039) | i))) * 69) + 1647579458 + (((~(275796942 | i)) | (-1987771392) | (~(1713023353 | i))) * (-69)) + 72374376)) | (((int) j272) & ((((((~r6) | 1247920278) * (-828)) - 1754753727) + ((i2 | 1609820607) * (-828))) - 1491601664));
                                java.lang.Object[] objArr822 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "腯\uf312\uf1c0槪", "\ue72e팧徘蜴", (-1) - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.graphics.Color.green(0) + 13407), objArr822);
                                java.lang.Object[] objArr832 = {((java.lang.String) objArr822[0]).intern()};
                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj6 == null) {
                                }
                                long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr832)).longValue();
                                long j282 = ((-782) * longValue102) + 819361288256L + ((~longValue102) * (-783)) + ((~(j | (-1045103685) | longValue102)) * (-783)) + (((~(j | longValue102)) | (-1045103685)) * 783) + 245436383;
                                long j292 = (((int) (j282 >> 32)) & (((((~(i2 | (-687876161))) | (~(1065238265 | i))) * 988) - 1843234714) + (((~((-1059864306) | i)) | 371988145 | (~(i2 | 1065238265))) * 988))) | (((int) j282) & ((((~(2139515024 | i)) | 702288614) * (-366)) + 675280937 + (((~(2145286902 | i)) | 696516736) * 366)));
                                if (j4 <= 0) {
                                }
                                java.lang.Object[] objArr882 = new java.lang.Object[1];
                                c("쾵矏ᒮ\ue39eⵍ縥찗⃭", 7 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr882);
                                java.lang.String intern302 = ((java.lang.String) objArr882[0]).intern();
                                java.lang.Object[] objArr892 = new java.lang.Object[1];
                                c("쾵矏ᒮ\ue39eⵍ縥ꏍɚ謟碌◾理", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 11, objArr892);
                                java.lang.String intern312 = ((java.lang.String) objArr892[0]).intern();
                                java.lang.Object[] objArr902 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "螚\udeaa뫺⩬悽᎑\uf5fe㗫釫ፐ癧赵", "衾鉒境ᯃ", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr902);
                                java.lang.String intern322 = ((java.lang.String) objArr902[0]).intern();
                                java.lang.Object[] objArr912 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "\ue5dd?䳐鵘⥒\uf451Љ罥ﻂ珞ꐕꊲ", "\uaaca鷗樝䍠", (-1) - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.KeyEvent.normalizeMetaState(0), objArr912);
                                java.lang.String intern332 = ((java.lang.String) objArr912[0]).intern();
                                java.lang.Object[] objArr922 = new java.lang.Object[1];
                                c("룻柛\u0ecf艠ꙙ\udaee垐뀔謟碌◾理", 11 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr922);
                                java.lang.String intern342 = ((java.lang.String) objArr922[0]).intern();
                                java.lang.Object[] objArr932 = new java.lang.Object[1];
                                c("쾵矏謟碌◾理", 5 - android.text.TextUtils.getTrimmedLength(str2), objArr932);
                                java.lang.String intern352 = ((java.lang.String) objArr932[0]).intern();
                                java.lang.Object[] objArr942 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "ฮ⦊흕꩙", "ﱺ祹慗旇", android.text.TextUtils.indexOf(str2, str2, 0), (char) (51041 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr942);
                                java.lang.String[] strArr32 = {intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr942[0]).intern()};
                                i3 = 0;
                                while (true) {
                                    if (i3 < 7) {
                                    }
                                    i3++;
                                }
                                if (i4 == 0) {
                                }
                            }
                        } else {
                            obj7 = invoke2;
                        }
                        if (invoke3 != null) {
                            java.lang.Object[] objArr206 = {invoke3, 42};
                            java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj62 == null) {
                                java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.getTrimmedLength(""), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2595, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                byte b69 = $$a[14];
                                short s34 = (short) (b69 + 1);
                                byte b70 = b69;
                                java.lang.Object[] objArr207 = new java.lang.Object[1];
                                b(s34, b70, (byte) (b70 + 1), objArr207);
                                obj62 = cls59.getMethod((java.lang.String) objArr207[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj62);
                            }
                            long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj62).invoke(null, objArr206)).longValue();
                            long j67 = ~longValue25;
                            obj9 = invoke3;
                            long j68 = ((-163) * longValue25) + 66565251225L + (((~(j7 | longValue25)) | 403425765) * (-328)) + ((403425765 | j6) * 164) + (((~(longValue25 | 403425765 | j7)) | (~((-403425766) | j67)) | (~(j67 | j6))) * 164) + 853674759;
                            if (((((int) (j68 >> 32)) & (((~((-4457729) | i13)) * 433) + 1775708926 + (((~((-892588192) | i)) | (-544638220)) * (-433)) + (((~((-544638220) | i)) | (-897045920)) * 433))) | (((int) j68) & (((625052033 | i13) * (-192)) + 1788176917 + (((~((-1116348543) | i13)) | 1116340310) * (-384)) + (((~((-1116340311) | i)) | (~(i13 | (-8233))) | (~(1741400575 | i))) * 192)))) != 477111747) {
                            }
                            j = j7;
                            str = "";
                            i2 = i13;
                            if (android.os.Build.VERSION.SDK_INT > 33) {
                            }
                        } else {
                            obj9 = invoke3;
                        }
                        if (obj7 != null) {
                            java.lang.Object[] objArr208 = {obj7, 42};
                            java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj63 == null) {
                                java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.GS, 2594 - android.view.View.MeasureSpec.getMode(0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                byte b71 = $$a[14];
                                short s35 = (short) (b71 + 1);
                                byte b72 = b71;
                                java.lang.Object[] objArr209 = new java.lang.Object[1];
                                b(s35, b72, (byte) (b72 + 1), objArr209);
                                obj63 = cls60.getMethod((java.lang.String) objArr209[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj63);
                            }
                            long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj63).invoke(null, objArr208)).longValue();
                            long j69 = ~longValue26;
                            long j70 = (-1019185540) | j69;
                            str4 = "";
                            i2 = i13;
                            long j71 = (((-919) * longValue26) - 936631510341L) + (((~(j70 | j6)) | (~(j69 | j7 | 1019185539))) * 920) + (((~j70) | (~((-1019185540) | j7))) * 920) + (((~(j70 | j7)) | (~(longValue26 | (-1019185540) | j6)) | (~(1019185539 | j69 | j6))) * 920) + 237914985;
                            int i38 = ~((-918421084) | i);
                            if (((((int) j71) & ((((~(i2 | 1056833375)) | (~((-518805327) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 204537021 + (((~(i2 | 518805326)) | i38) * (-1040)) + ((i38 | (~(i2 | 918421083)) | 538028049) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))) | (((int) (j71 >> 32)) & ((((~(i2 | 1049185264)) | (-1068059643)) * (-160)) + 1980457674 + (((~(i2 | (-388041147))) | 1049185264) * 160)))) == -1032769152) {
                                j = j7;
                                str = str4;
                                if (android.os.Build.VERSION.SDK_INT > 33) {
                                }
                            }
                        } else {
                            str4 = "";
                            i2 = i13;
                        }
                        if (obj9 != null) {
                            java.lang.Object[] objArr210 = {obj9, 42};
                            java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj64 == null) {
                                str = str4;
                                java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2546, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                byte b73 = $$a[14];
                                short s36 = (short) (b73 + 1);
                                byte b74 = b73;
                                java.lang.Object[] objArr211 = new java.lang.Object[1];
                                b(s36, b74, (byte) (b74 + 1), objArr211);
                                obj64 = cls61.getMethod((java.lang.String) objArr211[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj64);
                            } else {
                                str = str4;
                            }
                            long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj64).invoke(null, objArr210)).longValue();
                            long j72 = (-176906590) | j7;
                            j = j7;
                            long j73 = ((-494) * longValue27) + 87391855460L + ((~(longValue27 | (-176906590))) * (-495)) + (495 * j72) + (((~((~longValue27) | 176906589)) | (~j72)) * 495) + 1434007114;
                        } else {
                            j = j7;
                            str = str4;
                        }
                        java.lang.Object[] objArr2522 = new java.lang.Object[1];
                        c("廐ᆡ鹶ꨠ춍⛸ᒮ\ue39e", 7 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2522);
                        java.lang.String intern2102 = ((java.lang.String) objArr2522[0]).intern();
                        java.lang.Object[] objArr2622 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "컑럣꺋ᖩ\uf202쯫", "쪖脅䂄㲒", android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 37440), objArr2622);
                        java.lang.String intern3102 = ((java.lang.String) objArr2622[0]).intern();
                        java.lang.Object[] objArr2722 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "⣢쪓䄴猢⧯᪈쎙", "꣓䍙祙륔", android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1497586089, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2722);
                        java.lang.String intern472 = ((java.lang.String) objArr2722[0]).intern();
                        java.lang.Object[] objArr2822 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "吅암帅讶\uf10a叢ᖀ⇏羔", "⒟ⳝ쭏\u0ba7", 1328340260 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.red(0), objArr2822);
                        java.lang.String intern522 = ((java.lang.String) objArr2822[0]).intern();
                        java.lang.Object[] objArr2922 = new java.lang.Object[1];
                        c("禓뚌う车춼⼋", 6 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr2922);
                        java.lang.String intern622 = ((java.lang.String) objArr2922[0]).intern();
                        java.lang.Object[] objArr3022 = new java.lang.Object[1];
                        c("鹰Ꜳ䂳싟댬ꅢ㒠ᚖ뙒ꤺ桤啛剼ﰜ", 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr3022);
                        java.lang.String intern722 = ((java.lang.String) objArr3022[0]).intern();
                        java.lang.Object[] objArr3122 = new java.lang.Object[1];
                        c("\uf3fb邈㾎앐룳ﺊ", 5 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3122);
                        java.lang.String intern822 = ((java.lang.String) objArr3122[0]).intern();
                        java.lang.Object[] objArr3222 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "鞻ž雤\ud854啬湩", "≯ꘚ\udd88監", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58333), objArr3222);
                        java.lang.String intern922 = ((java.lang.String) objArr3222[0]).intern();
                        java.lang.Object[] objArr3322 = new java.lang.Object[1];
                        c("㍥⠧", 2 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3322);
                        java.lang.String intern1022 = ((java.lang.String) objArr3322[0]).intern();
                        java.lang.Object[] objArr3422 = new java.lang.Object[1];
                        c("暢ෙ몔秔ᡩ\uf6bc雦㠋\ue7a9་\ue6d5\ue14f꤁秡촏ڒ", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 17, objArr3422);
                        java.lang.String intern1122 = ((java.lang.String) objArr3422[0]).intern();
                        java.lang.Object[] objArr3522 = new java.lang.Object[1];
                        c("暢ෙ\uf196\uf486ꗭ\u17ec\ue664駨ﭡﶊ", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, objArr3522);
                        java.lang.String intern1222 = ((java.lang.String) objArr3522[0]).intern();
                        java.lang.Object[] objArr3622 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "솦䳑ᬱ댢웘鵹◰⌅", "쀊ㅃ\ue2c1깼", android.view.View.resolveSizeAndState(0, 0, 0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr3622);
                        java.lang.String intern1322 = ((java.lang.String) objArr3622[0]).intern();
                        java.lang.Object[] objArr3722 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "눤ꢥ႑ැ罺䌎榿욄落羼䌈形", "减阯뵕繮", android.text.TextUtils.indexOf(str, str, 0, 0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr3722);
                        java.lang.String intern1422 = ((java.lang.String) objArr3722[0]).intern();
                        java.lang.Object[] objArr3822 = new java.lang.Object[1];
                        c("劏쬳\ue8be➍쯶뒤蘭\udbc3\u244e霄㡜\ua8cdڎ杈", 14 - (android.os.Process.myTid() >> 22), objArr3822);
                        java.lang.String intern1522 = ((java.lang.String) objArr3822[0]).intern();
                        java.lang.Object[] objArr3922 = new java.lang.Object[1];
                        c("큨奬\uf38bͺ呚ꮡ좈笄", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 8, objArr3922);
                        java.lang.String intern1622 = ((java.lang.String) objArr3922[0]).intern();
                        java.lang.Object[] objArr4022 = new java.lang.Object[1];
                        c("뛻퉇쀮륕킉̏룳ﺊ", (android.os.Process.myPid() >> 22) + 7, objArr4022);
                        java.lang.String intern1722 = ((java.lang.String) objArr4022[0]).intern();
                        java.lang.Object[] objArr4122 = new java.lang.Object[1];
                        c("壭宑춼⼋ⵍ縥㇂ࢉ", (android.os.Process.myTid() >> 22) + 7, objArr4122);
                        java.lang.String intern1822 = ((java.lang.String) objArr4122[0]).intern();
                        java.lang.Object[] objArr4222 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "ƥ\uebf4", "ᆭ駁굴敽", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32173), objArr4222);
                        java.lang.String intern1922 = ((java.lang.String) objArr4222[0]).intern();
                        java.lang.Object[] objArr4322 = new java.lang.Object[1];
                        c("\ue7a9་\ude84⇁♕\uf2b2﹥\ue3a5햟狭쎉범\ueff3ﭷ伾틖姓⳪अ\udd2f", 19 - android.view.MotionEvent.axisFromString(str), objArr4322);
                        java.lang.String intern2022 = ((java.lang.String) objArr4322[0]).intern();
                        java.lang.Object[] objArr4422 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "쾭˾揥곗후ꘈ", "戀剒瘴ፌ", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 19574), objArr4422);
                        java.lang.String intern2122 = ((java.lang.String) objArr4422[0]).intern();
                        java.lang.Object[] objArr4522 = new java.lang.Object[1];
                        c("﮴岅", 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr4522);
                        java.lang.String intern2222 = ((java.lang.String) objArr4522[0]).intern();
                        java.lang.Object[] objArr4622 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "倒樀嬕稝Ⅺ䉜\uefa2촜ᠽ榞ꑬ臾넲篈⟧콈", "竌呥䀡逡", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (8512 - android.text.TextUtils.indexOf(str, str)), objArr4622);
                        java.lang.String intern2322 = ((java.lang.String) objArr4622[0]).intern();
                        java.lang.Object[] objArr4722 = new java.lang.Object[1];
                        c("\ue294\u17eeᰓ鿒쓇홯𨼾頬ⅿ", 9 - android.graphics.Color.red(0), objArr4722);
                        java.lang.String intern2422 = ((java.lang.String) objArr4722[0]).intern();
                        java.lang.Object[] objArr4822 = new java.lang.Object[1];
                        c("\ue294\u17eeᰓ鿒쓇홯𨼾鯁\u218c", 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4822);
                        java.lang.String intern2522 = ((java.lang.String) objArr4822[0]).intern();
                        java.lang.Object[] objArr4922 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "碞\ue28b룒倿ⶖ粌☲검\uec13팙ᶋ", "혙顊\uea25\ue2ba", 630737622 - android.text.TextUtils.getCapsMode(str, 0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr4922);
                        java.lang.String intern2622 = ((java.lang.String) objArr4922[0]).intern();
                        java.lang.Object[] objArr5022 = new java.lang.Object[1];
                        c("呚ꮡ﹥\ue3a5蚞\ua63d滑\udb5b\ueec2\ue602\ue32c발", 10 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr5022);
                        java.lang.String intern2722 = ((java.lang.String) objArr5022[0]).intern();
                        java.lang.Object[] objArr5122 = new java.lang.Object[1];
                        c("呚ꮡ﹥\ue3a5蚞\ua63d湜㺎蹊ꅷ滑\udb5b\ueec2\ue602\ue32c발", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, objArr5122);
                        java.lang.String intern2822 = ((java.lang.String) objArr5122[0]).intern();
                        java.lang.Object[] objArr5222 = new java.lang.Object[1];
                        c("呚ꮡ﹥\ue3a5蚞\ua63d鰴╄ෘ嶭⨩⻈諱\udb3f", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 14, objArr5222);
                        java.lang.String[] strArr222 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5222[0]).intern()};
                        java.lang.Object[] objArr5322 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "ᎊ抛啅ꭹ㏒엠졿\ueed4\udfad\u0e73麩", "窔蟃朰繡", 814203770 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString(str)), objArr5322);
                        java.lang.Object[] objArr5422 = {((java.lang.String) objArr5322[0]).intern()};
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj2 == null) {
                        }
                        invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr5422);
                        if (invoke == null) {
                        }
                        java.lang.Object[] objArr7022 = new java.lang.Object[1];
                        c("쾵矏ᒮ\ue39e⟖\uf257Ẃ띿쫡뱷춼⼋⟦㬿\ueee4쉉\u0ecf艠幏\ue1c6ﭡﶊ⃦䐚", 23 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr7022);
                        java.lang.Object[] objArr7122 = {((java.lang.String) objArr7022[0]).intern()};
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj3 == null) {
                        }
                        long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7122)).longValue();
                        long j2022 = ~longValue722;
                        java.lang.String str922 = str;
                        long j2122 = (((-167) * longValue722) - 182220709658L) + (((~(j2022 | j2)) | (~((-1091141975) | j2022))) * 336) + (((~(longValue722 | 1091141974)) | (~(j2 | 1091141974))) * (-168)) + (((~(j | 1091141974)) | j2022) * 168) + 199398093;
                        j3 = (((int) (j2122 >> 32)) & ((((~(195111423 | i)) | 1074266624) * (-140)) + 1713031858 + ((~(1269378047 | i)) * 70) + (((~(1242114987 | i)) | 1101529684) * 70))) | (((int) j2122) & (((((~(i2 | (-1927153926))) | 930586960) * (-90)) - 1687905466) + (((~((-1927153926) | i)) | (-2013243734)) * (-45)) + (((~((-930586961) | i)) | (-1927153926) | (~(i2 | 930586960))) * 45)));
                        java.lang.Object[] objArr7322 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "緪ㆪᯰ㛚\udeb2\u2d6b쇛低\u181dᒍᯰ薢桑枬嵠赼䦖", "䶣㠴䙛᠉", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1530410061, (char) (2374 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr7322);
                        java.lang.Object[] objArr7422 = {((java.lang.String) objArr7322[0]).intern()};
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj4 != null) {
                        }
                        long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7422)).longValue();
                        long j2222 = ~(longValue822 | j2);
                        long j2322 = ((111 * longValue822) - 25720655771L) + (((-235969320) | j2222) * (-220)) + ((j2222 | (~(235969319 | longValue822))) * 220) + (((~((~longValue822) | 235969319)) | (~((-235969320) | longValue822))) * 110) + 1054570748;
                        long j2422 = (((int) (j2322 >> 32)) & (((((~(i2 | (-75845))) | (~(1437150566 | i))) * (-272)) - 1758616182) + (((~((-2174053) | i)) | 2098208) * (-272)) + (((~(2174052 | i)) | 1435052358) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j2322) & ((((((~(i2 | (-521988606))) | 335817125) | (~(i2 | (-1959215016)))) * 464) - 1664471227) + (((-186171481) | i) * (-464)) + (((~((-1959215016) | i)) | 335817125) * 464)));
                        if (j3 > 0) {
                        }
                        java.lang.Object[] objArr7922 = new java.lang.Object[1];
                        c("쾵矏ᒮ\ue39e⟖\uf257Ẃ띿쫡뱷춼⼋⟦㬿\ueee4쉉\u0ecf艠幏\ue1c6ﭡﶊ⃦䐚", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, objArr7922);
                        java.lang.Object[] objArr8022 = {((java.lang.String) objArr7922[0]).intern()};
                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj5 == null) {
                        }
                        long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8022)).longValue();
                        long j2522 = ~(j | 1144528381);
                        long j2622 = ~((-1144528382) | longValue922);
                        long j2722 = ((-1527) * longValue922) + 875564211465L + ((longValue922 | j2522) * 764) + (((~(j | longValue922)) | j2622) * (-1528)) + (((~((~longValue922) | 1144528381)) | j2622 | j2522) * 764) + 146011686;
                        j4 = (((int) (j2722 >> 32)) & ((((~((-1711974450) | i)) | (~((-274748039) | i))) * 69) + 1647579458 + (((~(275796942 | i)) | (-1987771392) | (~(1713023353 | i))) * (-69)) + 72374376)) | (((int) j2722) & ((((((~r6) | 1247920278) * (-828)) - 1754753727) + ((i2 | 1609820607) * (-828))) - 1491601664));
                        java.lang.Object[] objArr8222 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "腯\uf312\uf1c0槪", "\ue72e팧徘蜴", (-1) - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.graphics.Color.green(0) + 13407), objArr8222);
                        java.lang.Object[] objArr8322 = {((java.lang.String) objArr8222[0]).intern()};
                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj6 == null) {
                        }
                        long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8322)).longValue();
                        long j2822 = ((-782) * longValue1022) + 819361288256L + ((~longValue1022) * (-783)) + ((~(j | (-1045103685) | longValue1022)) * (-783)) + (((~(j | longValue1022)) | (-1045103685)) * 783) + 245436383;
                        long j2922 = (((int) (j2822 >> 32)) & (((((~(i2 | (-687876161))) | (~(1065238265 | i))) * 988) - 1843234714) + (((~((-1059864306) | i)) | 371988145 | (~(i2 | 1065238265))) * 988))) | (((int) j2822) & ((((~(2139515024 | i)) | 702288614) * (-366)) + 675280937 + (((~(2145286902 | i)) | 696516736) * 366)));
                        if (j4 <= 0) {
                        }
                        java.lang.Object[] objArr8822 = new java.lang.Object[1];
                        c("쾵矏ᒮ\ue39eⵍ縥찗⃭", 7 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr8822);
                        java.lang.String intern3022 = ((java.lang.String) objArr8822[0]).intern();
                        java.lang.Object[] objArr8922 = new java.lang.Object[1];
                        c("쾵矏ᒮ\ue39eⵍ縥ꏍɚ謟碌◾理", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 11, objArr8922);
                        java.lang.String intern3122 = ((java.lang.String) objArr8922[0]).intern();
                        java.lang.Object[] objArr9022 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "螚\udeaa뫺⩬悽᎑\uf5fe㗫釫ፐ癧赵", "衾鉒境ᯃ", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr9022);
                        java.lang.String intern3222 = ((java.lang.String) objArr9022[0]).intern();
                        java.lang.Object[] objArr9122 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "\ue5dd?䳐鵘⥒\uf451Љ罥ﻂ珞ꐕꊲ", "\uaaca鷗樝䍠", (-1) - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.KeyEvent.normalizeMetaState(0), objArr9122);
                        java.lang.String intern3322 = ((java.lang.String) objArr9122[0]).intern();
                        java.lang.Object[] objArr9222 = new java.lang.Object[1];
                        c("룻柛\u0ecf艠ꙙ\udaee垐뀔謟碌◾理", 11 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr9222);
                        java.lang.String intern3422 = ((java.lang.String) objArr9222[0]).intern();
                        java.lang.Object[] objArr9322 = new java.lang.Object[1];
                        c("쾵矏謟碌◾理", 5 - android.text.TextUtils.getTrimmedLength(str2), objArr9322);
                        java.lang.String intern3522 = ((java.lang.String) objArr9322[0]).intern();
                        java.lang.Object[] objArr9422 = new java.lang.Object[1];
                        a("\u0000\u0000\u0000\u0000", "ฮ⦊흕꩙", "ﱺ祹慗旇", android.text.TextUtils.indexOf(str2, str2, 0), (char) (51041 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr9422);
                        java.lang.String[] strArr322 = {intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr9422[0]).intern()};
                        i3 = 0;
                        while (true) {
                            if (i3 < 7) {
                            }
                            i3++;
                        }
                        if (i4 == 0) {
                        }
                    } else {
                        i14++;
                        i15 = 2;
                        i9 = 1;
                        i10 = 0;
                    }
                }
            }
            j = j7;
            i2 = i13;
            str = "";
            java.lang.Object[] objArr25222 = new java.lang.Object[1];
            c("廐ᆡ鹶ꨠ춍⛸ᒮ\ue39e", 7 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr25222);
            java.lang.String intern21022 = ((java.lang.String) objArr25222[0]).intern();
            java.lang.Object[] objArr26222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "컑럣꺋ᖩ\uf202쯫", "쪖脅䂄㲒", android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 37440), objArr26222);
            java.lang.String intern31022 = ((java.lang.String) objArr26222[0]).intern();
            java.lang.Object[] objArr27222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "⣢쪓䄴猢⧯᪈쎙", "꣓䍙祙륔", android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1497586089, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr27222);
            java.lang.String intern4722 = ((java.lang.String) objArr27222[0]).intern();
            java.lang.Object[] objArr28222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "吅암帅讶\uf10a叢ᖀ⇏羔", "⒟ⳝ쭏\u0ba7", 1328340260 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.red(0), objArr28222);
            java.lang.String intern5222 = ((java.lang.String) objArr28222[0]).intern();
            java.lang.Object[] objArr29222 = new java.lang.Object[1];
            c("禓뚌う车춼⼋", 6 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr29222);
            java.lang.String intern6222 = ((java.lang.String) objArr29222[0]).intern();
            java.lang.Object[] objArr30222 = new java.lang.Object[1];
            c("鹰Ꜳ䂳싟댬ꅢ㒠ᚖ뙒ꤺ桤啛剼ﰜ", 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr30222);
            java.lang.String intern7222 = ((java.lang.String) objArr30222[0]).intern();
            java.lang.Object[] objArr31222 = new java.lang.Object[1];
            c("\uf3fb邈㾎앐룳ﺊ", 5 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr31222);
            java.lang.String intern8222 = ((java.lang.String) objArr31222[0]).intern();
            java.lang.Object[] objArr32222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "鞻ž雤\ud854啬湩", "≯ꘚ\udd88監", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58333), objArr32222);
            java.lang.String intern9222 = ((java.lang.String) objArr32222[0]).intern();
            java.lang.Object[] objArr33222 = new java.lang.Object[1];
            c("㍥⠧", 2 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr33222);
            java.lang.String intern10222 = ((java.lang.String) objArr33222[0]).intern();
            java.lang.Object[] objArr34222 = new java.lang.Object[1];
            c("暢ෙ몔秔ᡩ\uf6bc雦㠋\ue7a9་\ue6d5\ue14f꤁秡촏ڒ", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 17, objArr34222);
            java.lang.String intern11222 = ((java.lang.String) objArr34222[0]).intern();
            java.lang.Object[] objArr35222 = new java.lang.Object[1];
            c("暢ෙ\uf196\uf486ꗭ\u17ec\ue664駨ﭡﶊ", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, objArr35222);
            java.lang.String intern12222 = ((java.lang.String) objArr35222[0]).intern();
            java.lang.Object[] objArr36222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "솦䳑ᬱ댢웘鵹◰⌅", "쀊ㅃ\ue2c1깼", android.view.View.resolveSizeAndState(0, 0, 0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr36222);
            java.lang.String intern13222 = ((java.lang.String) objArr36222[0]).intern();
            java.lang.Object[] objArr37222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "눤ꢥ႑ැ罺䌎榿욄落羼䌈形", "减阯뵕繮", android.text.TextUtils.indexOf(str, str, 0, 0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr37222);
            java.lang.String intern14222 = ((java.lang.String) objArr37222[0]).intern();
            java.lang.Object[] objArr38222 = new java.lang.Object[1];
            c("劏쬳\ue8be➍쯶뒤蘭\udbc3\u244e霄㡜\ua8cdڎ杈", 14 - (android.os.Process.myTid() >> 22), objArr38222);
            java.lang.String intern15222 = ((java.lang.String) objArr38222[0]).intern();
            java.lang.Object[] objArr39222 = new java.lang.Object[1];
            c("큨奬\uf38bͺ呚ꮡ좈笄", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 8, objArr39222);
            java.lang.String intern16222 = ((java.lang.String) objArr39222[0]).intern();
            java.lang.Object[] objArr40222 = new java.lang.Object[1];
            c("뛻퉇쀮륕킉̏룳ﺊ", (android.os.Process.myPid() >> 22) + 7, objArr40222);
            java.lang.String intern17222 = ((java.lang.String) objArr40222[0]).intern();
            java.lang.Object[] objArr41222 = new java.lang.Object[1];
            c("壭宑춼⼋ⵍ縥㇂ࢉ", (android.os.Process.myTid() >> 22) + 7, objArr41222);
            java.lang.String intern18222 = ((java.lang.String) objArr41222[0]).intern();
            java.lang.Object[] objArr42222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "ƥ\uebf4", "ᆭ駁굴敽", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32173), objArr42222);
            java.lang.String intern19222 = ((java.lang.String) objArr42222[0]).intern();
            java.lang.Object[] objArr43222 = new java.lang.Object[1];
            c("\ue7a9་\ude84⇁♕\uf2b2﹥\ue3a5햟狭쎉범\ueff3ﭷ伾틖姓⳪अ\udd2f", 19 - android.view.MotionEvent.axisFromString(str), objArr43222);
            java.lang.String intern20222 = ((java.lang.String) objArr43222[0]).intern();
            java.lang.Object[] objArr44222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "쾭˾揥곗후ꘈ", "戀剒瘴ፌ", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 19574), objArr44222);
            java.lang.String intern21222 = ((java.lang.String) objArr44222[0]).intern();
            java.lang.Object[] objArr45222 = new java.lang.Object[1];
            c("﮴岅", 1 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr45222);
            java.lang.String intern22222 = ((java.lang.String) objArr45222[0]).intern();
            java.lang.Object[] objArr46222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "倒樀嬕稝Ⅺ䉜\uefa2촜ᠽ榞ꑬ臾넲篈⟧콈", "竌呥䀡逡", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (8512 - android.text.TextUtils.indexOf(str, str)), objArr46222);
            java.lang.String intern23222 = ((java.lang.String) objArr46222[0]).intern();
            java.lang.Object[] objArr47222 = new java.lang.Object[1];
            c("\ue294\u17eeᰓ鿒쓇홯𨼾頬ⅿ", 9 - android.graphics.Color.red(0), objArr47222);
            java.lang.String intern24222 = ((java.lang.String) objArr47222[0]).intern();
            java.lang.Object[] objArr48222 = new java.lang.Object[1];
            c("\ue294\u17eeᰓ鿒쓇홯𨼾鯁\u218c", 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr48222);
            java.lang.String intern25222 = ((java.lang.String) objArr48222[0]).intern();
            java.lang.Object[] objArr49222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "碞\ue28b룒倿ⶖ粌☲검\uec13팙ᶋ", "혙顊\uea25\ue2ba", 630737622 - android.text.TextUtils.getCapsMode(str, 0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr49222);
            java.lang.String intern26222 = ((java.lang.String) objArr49222[0]).intern();
            java.lang.Object[] objArr50222 = new java.lang.Object[1];
            c("呚ꮡ﹥\ue3a5蚞\ua63d滑\udb5b\ueec2\ue602\ue32c발", 10 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr50222);
            java.lang.String intern27222 = ((java.lang.String) objArr50222[0]).intern();
            java.lang.Object[] objArr51222 = new java.lang.Object[1];
            c("呚ꮡ﹥\ue3a5蚞\ua63d湜㺎蹊ꅷ滑\udb5b\ueec2\ue602\ue32c발", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, objArr51222);
            java.lang.String intern28222 = ((java.lang.String) objArr51222[0]).intern();
            java.lang.Object[] objArr52222 = new java.lang.Object[1];
            c("呚ꮡ﹥\ue3a5蚞\ua63d鰴╄ෘ嶭⨩⻈諱\udb3f", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 14, objArr52222);
            java.lang.String[] strArr2222 = {intern21022, intern31022, intern4722, intern5222, intern6222, intern7222, intern8222, intern9222, intern10222, intern11222, intern12222, intern13222, intern14222, intern15222, intern16222, intern17222, intern18222, intern19222, intern20222, intern21222, intern22222, intern23222, intern24222, intern25222, intern26222, intern27222, intern28222, ((java.lang.String) objArr52222[0]).intern()};
            java.lang.Object[] objArr53222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "ᎊ抛啅ꭹ㏒엠졿\ueed4\udfad\u0e73麩", "窔蟃朰繡", 814203770 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString(str)), objArr53222);
            java.lang.Object[] objArr54222 = {((java.lang.String) objArr53222[0]).intern()};
            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj2 == null) {
            }
            invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr54222);
            if (invoke == null) {
            }
            java.lang.Object[] objArr70222 = new java.lang.Object[1];
            c("쾵矏ᒮ\ue39e⟖\uf257Ẃ띿쫡뱷춼⼋⟦㬿\ueee4쉉\u0ecf艠幏\ue1c6ﭡﶊ⃦䐚", 23 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr70222);
            java.lang.Object[] objArr71222 = {((java.lang.String) objArr70222[0]).intern()};
            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj3 == null) {
            }
            long longValue7222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr71222)).longValue();
            long j20222 = ~longValue7222;
            java.lang.String str9222 = str;
            long j21222 = (((-167) * longValue7222) - 182220709658L) + (((~(j20222 | j2)) | (~((-1091141975) | j20222))) * 336) + (((~(longValue7222 | 1091141974)) | (~(j2 | 1091141974))) * (-168)) + (((~(j | 1091141974)) | j20222) * 168) + 199398093;
            j3 = (((int) (j21222 >> 32)) & ((((~(195111423 | i)) | 1074266624) * (-140)) + 1713031858 + ((~(1269378047 | i)) * 70) + (((~(1242114987 | i)) | 1101529684) * 70))) | (((int) j21222) & (((((~(i2 | (-1927153926))) | 930586960) * (-90)) - 1687905466) + (((~((-1927153926) | i)) | (-2013243734)) * (-45)) + (((~((-930586961) | i)) | (-1927153926) | (~(i2 | 930586960))) * 45)));
            java.lang.Object[] objArr73222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "緪ㆪᯰ㛚\udeb2\u2d6b쇛低\u181dᒍᯰ薢桑枬嵠赼䦖", "䶣㠴䙛᠉", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1530410061, (char) (2374 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr73222);
            java.lang.Object[] objArr74222 = {((java.lang.String) objArr73222[0]).intern()};
            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj4 != null) {
            }
            long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr74222)).longValue();
            long j22222 = ~(longValue8222 | j2);
            long j23222 = ((111 * longValue8222) - 25720655771L) + (((-235969320) | j22222) * (-220)) + ((j22222 | (~(235969319 | longValue8222))) * 220) + (((~((~longValue8222) | 235969319)) | (~((-235969320) | longValue8222))) * 110) + 1054570748;
            long j24222 = (((int) (j23222 >> 32)) & (((((~(i2 | (-75845))) | (~(1437150566 | i))) * (-272)) - 1758616182) + (((~((-2174053) | i)) | 2098208) * (-272)) + (((~(2174052 | i)) | 1435052358) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j23222) & ((((((~(i2 | (-521988606))) | 335817125) | (~(i2 | (-1959215016)))) * 464) - 1664471227) + (((-186171481) | i) * (-464)) + (((~((-1959215016) | i)) | 335817125) * 464)));
            if (j3 > 0) {
            }
            java.lang.Object[] objArr79222 = new java.lang.Object[1];
            c("쾵矏ᒮ\ue39e⟖\uf257Ẃ띿쫡뱷춼⼋⟦㬿\ueee4쉉\u0ecf艠幏\ue1c6ﭡﶊ⃦䐚", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, objArr79222);
            java.lang.Object[] objArr80222 = {((java.lang.String) objArr79222[0]).intern()};
            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj5 == null) {
            }
            long longValue9222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr80222)).longValue();
            long j25222 = ~(j | 1144528381);
            long j26222 = ~((-1144528382) | longValue9222);
            long j27222 = ((-1527) * longValue9222) + 875564211465L + ((longValue9222 | j25222) * 764) + (((~(j | longValue9222)) | j26222) * (-1528)) + (((~((~longValue9222) | 1144528381)) | j26222 | j25222) * 764) + 146011686;
            j4 = (((int) (j27222 >> 32)) & ((((~((-1711974450) | i)) | (~((-274748039) | i))) * 69) + 1647579458 + (((~(275796942 | i)) | (-1987771392) | (~(1713023353 | i))) * (-69)) + 72374376)) | (((int) j27222) & ((((((~r6) | 1247920278) * (-828)) - 1754753727) + ((i2 | 1609820607) * (-828))) - 1491601664));
            java.lang.Object[] objArr82222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "腯\uf312\uf1c0槪", "\ue72e팧徘蜴", (-1) - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.graphics.Color.green(0) + 13407), objArr82222);
            java.lang.Object[] objArr83222 = {((java.lang.String) objArr82222[0]).intern()};
            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj6 == null) {
            }
            long longValue10222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr83222)).longValue();
            long j28222 = ((-782) * longValue10222) + 819361288256L + ((~longValue10222) * (-783)) + ((~(j | (-1045103685) | longValue10222)) * (-783)) + (((~(j | longValue10222)) | (-1045103685)) * 783) + 245436383;
            long j29222 = (((int) (j28222 >> 32)) & (((((~(i2 | (-687876161))) | (~(1065238265 | i))) * 988) - 1843234714) + (((~((-1059864306) | i)) | 371988145 | (~(i2 | 1065238265))) * 988))) | (((int) j28222) & ((((~(2139515024 | i)) | 702288614) * (-366)) + 675280937 + (((~(2145286902 | i)) | 696516736) * 366)));
            if (j4 <= 0) {
            }
            java.lang.Object[] objArr88222 = new java.lang.Object[1];
            c("쾵矏ᒮ\ue39eⵍ縥찗⃭", 7 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr88222);
            java.lang.String intern30222 = ((java.lang.String) objArr88222[0]).intern();
            java.lang.Object[] objArr89222 = new java.lang.Object[1];
            c("쾵矏ᒮ\ue39eⵍ縥ꏍɚ謟碌◾理", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 11, objArr89222);
            java.lang.String intern31222 = ((java.lang.String) objArr89222[0]).intern();
            java.lang.Object[] objArr90222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "螚\udeaa뫺⩬悽᎑\uf5fe㗫釫ፐ癧赵", "衾鉒境ᯃ", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr90222);
            java.lang.String intern32222 = ((java.lang.String) objArr90222[0]).intern();
            java.lang.Object[] objArr91222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "\ue5dd?䳐鵘⥒\uf451Љ罥ﻂ珞ꐕꊲ", "\uaaca鷗樝䍠", (-1) - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.KeyEvent.normalizeMetaState(0), objArr91222);
            java.lang.String intern33222 = ((java.lang.String) objArr91222[0]).intern();
            java.lang.Object[] objArr92222 = new java.lang.Object[1];
            c("룻柛\u0ecf艠ꙙ\udaee垐뀔謟碌◾理", 11 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr92222);
            java.lang.String intern34222 = ((java.lang.String) objArr92222[0]).intern();
            java.lang.Object[] objArr93222 = new java.lang.Object[1];
            c("쾵矏謟碌◾理", 5 - android.text.TextUtils.getTrimmedLength(str2), objArr93222);
            java.lang.String intern35222 = ((java.lang.String) objArr93222[0]).intern();
            java.lang.Object[] objArr94222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "ฮ⦊흕꩙", "ﱺ祹慗旇", android.text.TextUtils.indexOf(str2, str2, 0), (char) (51041 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr94222);
            java.lang.String[] strArr3222 = {intern30222, intern31222, intern32222, intern33222, intern34222, intern35222, ((java.lang.String) objArr94222[0]).intern()};
            i3 = 0;
            while (true) {
                if (i3 < 7) {
                }
                i3++;
            }
            if (i4 == 0) {
            }
        } catch (java.lang.Throwable th8) {
            java.lang.Throwable cause5 = th8.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th8;
        }
    }
}
