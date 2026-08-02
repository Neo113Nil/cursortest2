package com.payair.hce;

/* loaded from: classes4.dex */
public class accessinternalEndTransaction implements com.payair.hce.getMCallbacksannotations {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static boolean valueOf;
    private static char[] writeReplace;
    private boolean values;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, short s, java.lang.Object[] objArr) {
        byte b3;
        byte b4;
        byte[] bArr = $$a;
        ?? r7 = 718 - s;
        int i = b2 + 4;
        char[] cArr = new char[b + 1];
        if (bArr == null) {
            byte b5 = r7;
            byte b6 = 0;
            byte b7 = b;
            ?? r72 = (b7 + b5) - 2;
            i++;
            b3 = b6;
            b4 = r72;
            cArr[b3] = b4 == true ? (char) 1 : (char) 0;
            ?? r4 = b3 + 1;
            if (b3 == b) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            b5 = bArr[i];
            b6 = r4;
            b7 = b4;
            ?? r722 = (b7 + b5) - 2;
            i++;
            b3 = b6;
            b4 = r722;
            cArr[b3] = b4 == true ? (char) 1 : (char) 0;
            ?? r42 = b3 + 1;
            if (b3 == b) {
            }
        } else {
            b3 = 0;
            b4 = r7;
            cArr[b3] = b4 == true ? (char) 1 : (char) 0;
            ?? r422 = b3 + 1;
            if (b3 == b) {
            }
        }
    }

    private static void c(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2 = s * 3;
        int i3 = 4 - (i * 2);
        byte[] bArr = $$d;
        int i4 = (s2 * 3) + 118;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + (-i3);
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i3;
            i4 += -bArr[i3];
            i3 = i8 + 1;
            i6 = i7;
        }
    }

    public accessinternalEndTransaction(boolean z) {
        this.values = z;
    }

    private static void b(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        int i2;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = writeReplace;
        long j = 0;
        int i3 = 2;
        int i4 = 1;
        if (cArr != null) {
            $10 = ($11 + 109) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 75;
                $10 = i6 % 128;
                if (i6 % i3 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i4];
                        objArr2[0] = java.lang.Integer.valueOf(cArr[i5]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > j ? 1 : (android.os.SystemClock.uptimeMillis() == j ? 0 : -1)) + 45, android.text.TextUtils.getOffsetBefore("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 46338))).getMethod("y", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                        }
                        cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i5 >>= 1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47, android.graphics.Color.argb(0, 0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 46338))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj2);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                j = 0;
                i3 = 2;
                i4 = 1;
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj3 == null) {
            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.View.resolveSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46336))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj3);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
        if (DigitizedCardProfile) {
            $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr5 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 42, 1629 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c((short) 0, (short) 0, 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (valueOf) {
            getumdgeneration.values = charArray.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr7 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj5 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1629, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c((short) 0, (short) 0, 0, objArr8);
                    obj5 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = iArr.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            int i7 = $10 + 69;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values >>> 1) * getumdgeneration.valueOf] >> i] >> intValue);
                i2 = 1;
            } else {
                i2 = 1;
                cArr5[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            }
            getumdgeneration.valueOf += i2;
        }
        java.lang.String str4 = new java.lang.String(cArr5);
        int i8 = $11 + 29;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        RecordsJson = 1;
        writeReplace = new char[]{10919, 10930, 10936, 10934, 10933, 10943, 10994, 10937, 10888, 10939, 10969, 10892, 10941, 10951, 10932, 10928, 10975, 10938, 10931, 10889, 10997, 10929, 10995, 10918, 10891, 10999};
        AlternateContactlessPaymentDataJson = -143185404;
        valueOf = true;
        DigitizedCardProfile = true;
    }

    static void init$1() {
        $$d = new byte[]{63, 105, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.SUB};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{70, 56, kotlin.io.encoding.Base64.padSymbol, 63, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x039a, code lost:
    
        if (r0.contains(r6.getField((java.lang.String) r13[0]).get(null)) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x076a A[Catch: all -> 0x00c0, TryCatch #2 {all -> 0x00c0, blocks: (B:5:0x0032, B:7:0x006b, B:8:0x00ad, B:17:0x0159, B:19:0x019c, B:20:0x01e2, B:28:0x02b4, B:30:0x02c5, B:31:0x0309, B:57:0x0674, B:59:0x06a9, B:60:0x06f2, B:65:0x0728, B:67:0x076a, B:68:0x07b3, B:98:0x03fa, B:100:0x0437, B:101:0x047c, B:105:0x0213, B:107:0x0242, B:108:0x028d), top: B:2:0x001b }] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v57, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        ?? r15;
        java.lang.Object obj;
        boolean equals;
        try {
            if (context == null) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(811397002 | r13)) * (-560)) - 1402098536) + ((~(i | (-193007685))) * (-560)) + (((~(193531982 | (~i))) | 810872704) * 560))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                java.lang.Object obj3 = obj2;
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 50, android.graphics.Color.argb(0, 0, 0, 0) + 2713, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    byte b = (byte) ($$a[14] - 1);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a((byte) 34, b, (short) (b | 653), objArr4);
                    java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method);
                    obj3 = method;
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(127 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "\u0085\u0092\u0082\u0091\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0090\u008f\u008f\u008e\u0089\u008a\u008d", objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), null, null, "\u0085\u0092\u0082\u0091\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0090\u008f\u008f\u008e\u0087\u0093\u008f\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), null, null, "\u0094\u008d\u0081\u0090\u0092", objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    RecordsJson = (IccPrivateKeyCrtComponentsJson + 47) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((~i) | (-1160081))) * 433) - 469902324) + (((~(i | (-971918375))) | (-33010611)) * (-433)) + (((~((-33010611) | i)) | (-973078455)) * 433))};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj5 = obj4;
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, 2713 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b2 = (byte) ($$a[14] - 1);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a((byte) 34, b2, (short) (b2 | 653), objArr10);
                        java.lang.reflect.Method method2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                        obj5 = method2;
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    int i3 = (~((-410221908) | i)) | 7471105;
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((i3 * 992) + 776359256 + ((i3 | (~((~i) | 997457879))) * (-496)) + ((594707077 | i) * 496))};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj7 = obj6;
                    if (obj6 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, 2713 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getTrimmedLength(""));
                        byte b3 = (byte) ($$a[14] - 1);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a((byte) 34, b3, (short) (b3 | 653), objArr12);
                        java.lang.reflect.Method method3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                        obj7 = method3;
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    int i4 = RecordsJson + 53;
                    IccPrivateKeyCrtComponentsJson = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objArr;
                    }
                    throw null;
                }
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                java.lang.Object obj9 = obj8;
                if (obj8 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.Color.green(0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1737, (char) ((-16771390) - android.graphics.Color.rgb(0, 0, 0)));
                    byte b4 = (byte) ($$a[14] - 1);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a((byte) 34, b4, (short) (b4 | 653), objArr13);
                    java.lang.reflect.Method method4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, method4);
                    obj9 = method4;
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj9).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 33, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1738, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5826));
                byte[] bArr = $$a;
                byte b5 = (byte) (bArr[14] - 1);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a((byte) 34, b5, (short) (b5 | 653), objArr14);
                boolean contains = set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null));
                ?? r152 = objArr14;
                if (!contains) {
                    int i5 = IccPrivateKeyCrtComponentsJson + 67;
                    RecordsJson = i5 % 128;
                    if (i5 % 2 == 0) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 34, 1738 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.graphics.Color.rgb(0, 0, 0) + 16783042));
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a((byte) (-bArr[20]), (byte) 34, (short) 600, objArr15);
                        set.contains(cls8.getField((java.lang.String) objArr15[0]).get(null));
                        throw new java.lang.ArithmeticException();
                    }
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.getOffsetBefore("", 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1738, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 5825));
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    r152 = 34;
                    r15 = 34;
                    a((byte) (-bArr[20]), (byte) 34, (short) 600, objArr16);
                }
                r15 = r152;
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-838935077) | i)) * 623) - 1762176230) + (((~i) | 318466) * (-623)) + (((~(i | (-921772798))) | 838935076 | (~(83156187 | i))) * 623))};
                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj11 = obj10;
                    if (obj10 == null) {
                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) android.view.KeyEvent.normalizeMetaState(0));
                        byte b6 = (byte) (bArr[14] - 1);
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a((byte) 34, b6, (short) (b6 | 653), objArr19);
                        java.lang.reflect.Method method5 = cls10.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method5);
                        obj11 = method5;
                    }
                    ((int[]) objArr17[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr18)).intValue();
                    return objArr17;
                }
                try {
                } catch (java.lang.Exception unused) {
                    r15 = 0;
                }
                if (android.os.Build.VERSION.SDK_INT > 33) {
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    b(127 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), null, null, "\u0088\u0084\u0087\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0097\u0083\u0096\u0090\u0090\u0095\u0089\u0086\u0082\u0086\u0095\u0088\u0089\u008a\u0095", objArr20);
                    try {
                        java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        java.lang.Object obj13 = obj12;
                        if (obj12 == null) {
                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 37, 3160 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (33099 - android.view.KeyEvent.getDeadChar(0, 0)));
                            int i6 = bArr[14] - 1;
                            byte b7 = (byte) i6;
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            a(b7, (byte) (b7 | 39), (short) i6, objArr22);
                            java.lang.reflect.Method method6 = cls11.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, method6);
                            obj13 = method6;
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr21)).longValue();
                        long j = i;
                        r15 = 0;
                        long j2 = (((((434 * longValue) - 198619068816L) + ((~(((~j) | (-459766364)) | longValue)) * 433)) + (((~((~longValue) | j)) | (-459766364)) * (-433))) + (((~(j | (-459766364))) | ((longValue | 459766363) ^ (-1))) * 433)) - 1797434471;
                        int i7 = (int) (j2 >> 32);
                        int i8 = ~i;
                        if (((i7 & ((((~(141251100 | i8)) | (-1585444832) | (~(1578477511 | i8))) * 464) + 527385322 + (((-1444193732) | i) * (-464)) + (((~(1578477511 | i)) | (-1585444832)) * 464))) | (((int) j2) & ((((~((-1933601329) | i)) | (-924139558)) * (-964)) + 1021310973 + (((~(i8 | (-1933601329))) | 1077946896) * (-964))))) == 1) {
                            int i9 = RecordsJson + 95;
                            int i10 = i9 % 128;
                            IccPrivateKeyCrtComponentsJson = i10;
                            equals = i9 % 2 == 0;
                            RecordsJson = (i10 + 57) % 128;
                            r15 = 0;
                            if (equals) {
                                IccPrivateKeyCrtComponentsJson = (RecordsJson + 31) % 128;
                                java.lang.Object[] objArr23 = {new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                int i11 = ~i;
                                java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((-574730691) | i11) * 494) + 1787933352 + (((~(i11 | 228478485)) | (-601489367)) * 494))};
                                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                java.lang.Object obj15 = obj14;
                                if (obj14 == null) {
                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                    byte b8 = (byte) (bArr[14] - 1);
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    a((byte) 34, b8, (short) (b8 | 653), objArr25);
                                    java.lang.reflect.Method method7 = cls12.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method7);
                                    obj15 = method7;
                                }
                                ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr24)).intValue();
                                return objArr23;
                            }
                        }
                        java.lang.Object[] objArr26 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        int i12 = ~i;
                        ?? r5 = {java.lang.Integer.valueOf(i2), r15, java.lang.Integer.valueOf((((~(i | 160511254)) | (~((-1048579) | i12)) | (-1003880407)) * (-68)) + 265929096 + ((~((-843369153) | i12)) * (-68)) + (((~(i12 | (-160511255))) | (-844417731)) * 68))};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        java.lang.Object obj16 = obj;
                        if (obj == null) {
                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 50, android.text.TextUtils.indexOf("", "", 0, 0) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            byte b9 = (byte) ($$a[14] - 1);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            a((byte) 34, b9, (short) (b9 | 653), objArr27);
                            java.lang.reflect.Method method8 = cls13.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method8);
                            obj16 = method8;
                        }
                        ((int[]) objArr26[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, r5)).intValue();
                        return objArr26;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                r15 = 0;
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                b(127 - android.graphics.Color.blue(0), null, null, "\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0087\u0085\u0084", objArr28);
                try {
                    java.lang.Object[] objArr29 = {((java.lang.String) objArr28[0]).intern()};
                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    java.lang.Object obj18 = obj17;
                    if (obj17 == null) {
                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1921, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int i13 = bArr[14] - 1;
                        byte b10 = (byte) i13;
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        a(b10, (byte) (b10 | 39), (short) i13, objArr30);
                        java.lang.reflect.Method method9 = cls14.getMethod((java.lang.String) objArr30[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, method9);
                        obj18 = method9;
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj18).invoke(null, objArr29);
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    b((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, null, "\u009a", objArr31);
                    equals = invoke2.equals(((java.lang.String) objArr31[0]).intern());
                    r15 = 0;
                    if (equals) {
                    }
                    java.lang.Object[] objArr262 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    int i122 = ~i;
                    ?? r52 = {java.lang.Integer.valueOf(i2), r15, java.lang.Integer.valueOf((((~(i | 160511254)) | (~((-1048579) | i122)) | (-1003880407)) * (-68)) + 265929096 + ((~((-843369153) | i122)) * (-68)) + (((~(i122 | (-160511255))) | (-844417731)) * 68))};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj162 = obj;
                    if (obj == null) {
                    }
                    ((int[]) objArr262[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj162).invoke(null, r52)).intValue();
                    return objArr262;
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
    }
}
