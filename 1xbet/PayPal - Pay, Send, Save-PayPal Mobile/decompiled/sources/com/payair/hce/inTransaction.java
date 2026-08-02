package com.payair.hce;

/* loaded from: classes4.dex */
public class inTransaction implements com.payair.hce.getMCallbacksannotations {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static boolean DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean getAid;
    private static int getProfileVersion;
    private static int values;
    private static char[] writeReplace;
    private byte[] AlternateContactlessPaymentDataJson;
    private com.payair.hce.getMCallbacksannotations valueOf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        short s4;
        ?? r6 = s2 + 65;
        int i2 = s3 + 4;
        byte[] bArr = $$a;
        char[] cArr = new char[s + 1];
        if (bArr == null) {
            byte b = r6;
            i = 0;
            short s5 = s;
            s4 = (s5 + (-b)) - 2;
            cArr[i] = s4 == true ? (char) 1 : (char) 0;
            if (i == s) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i2++;
            b = bArr[i2];
            i++;
            s5 = s4;
            s4 = (s5 + (-b)) - 2;
            cArr[i] = s4 == true ? (char) 1 : (char) 0;
            if (i == s) {
            }
        } else {
            i = 0;
            s4 = r6;
            cArr[i] = s4 == true ? (char) 1 : (char) 0;
            if (i == s) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 4 - (b3 * 3);
        byte[] bArr = $$d;
        int i4 = (b * 4) + 1;
        int i5 = 118 - (b2 * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i5 += i3;
            i3 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i3;
            i3 = bArr[i3];
            i5 += i3;
            i3 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public inTransaction(com.payair.hce.getMCallbacksannotations getmcallbacksannotations, byte[] bArr) {
        this(getmcallbacksannotations, bArr, bArr.length);
    }

    public inTransaction(com.payair.hce.getMCallbacksannotations getmcallbacksannotations, byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.AlternateContactlessPaymentDataJson = bArr2;
        this.valueOf = getmcallbacksannotations;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public final byte[] writeReplace() {
        int i = (SdkCoreAlternateContactlessPaymentDataImpl + 73) % 128;
        getProfileVersion = i;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        int i2 = i + 7;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public final com.payair.hce.getMCallbacksannotations valueOf() {
        int i = (getProfileVersion + 91) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i;
        com.payair.hce.getMCallbacksannotations getmcallbacksannotations = this.valueOf;
        int i2 = i + 25;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return getmcallbacksannotations;
        }
        throw null;
    }

    private static void b(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        int i2 = $11;
        $10 = (i2 + 23) % 128;
        int i3 = 2;
        byte[] bArr = str3;
        if (str3 != null) {
            int i4 = i2 + 51;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = writeReplace;
        float f = 0.0f;
        int i5 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 43;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[i5] = java.lang.Integer.valueOf(cArr[i6]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 46, 285 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (46338 - (android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1))));
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[i5] = java.lang.Integer.TYPE;
                            obj = cls.getMethod("y", clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                        }
                        cArr2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i6 >>>= 1;
                        i3 = 2;
                        f = 0.0f;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    objArr3[i5] = java.lang.Integer.valueOf(cArr[i6]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 46, 286 - android.view.KeyEvent.keyCodeFromString(""), (char) (46337 - (android.util.TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1))))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj2);
                    }
                    cArr2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
                    i6++;
                    i3 = 2;
                    f = 0.0f;
                    i5 = 0;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(values)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj3 == null) {
            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj3);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
        if (getAid) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr5 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1629 - (android.os.Process.myPid() >> 22), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c((byte) 0, (byte) 0, (byte) 0, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (DigitizedCardProfile) {
            int i8 = $11 + 109;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            getumdgeneration.values = charArray.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr7 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1628 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c((byte) 0, (byte) 0, (byte) 0, objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        int i10 = 0;
        getumdgeneration.values = iArr.length;
        char[] cArr5 = new char[getumdgeneration.values];
        while (true) {
            getumdgeneration.valueOf = i10;
            if (getumdgeneration.valueOf >= getumdgeneration.values) {
                objArr[0] = new java.lang.String(cArr5);
                return;
            } else {
                cArr5[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                i10 = getumdgeneration.valueOf + 1;
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getProfileVersion = 1;
        writeReplace = new char[]{10981, 10992, 10982, 10996, 10995, 11005, 10800, 10983, 10998, 11001, 10759, 10954, 11003, 10757, 10994, 11006, 10781, 11000, 10993, 10999, 10803, 11007, 10801, 10980, 10953, 10805};
        values = -143185342;
        DigitizedCardProfile = true;
        getAid = true;
    }

    static void init$1() {
        $$d = new byte[]{108, -72, 46, 57};
        $$e = 146;
    }

    static void init$0() {
        $$a = new byte[]{39, 89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 10, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, 19, -13, -11, 14, com.visa.cbp.getEncExpo.onUnminimized};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x03d1, code lost:
    
        if (r0.contains(r3.getField((java.lang.String) r14[0]).get(null)) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x058a, code lost:
    
        if (((((int) r3) & (((((1432990446 | r28) * (-859)) + 1345972306) + (((~(1432990446 | r7)) | (~((-1416213095) | r28))) * 859)) + (((~(r7 | (-1424750440))) | 8537345) * 859))) | (((int) (r3 >> 32)) & (((r8 * 495) + 431607786) + (((~r8) | 1746048577) * 495)))) == 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0630, code lost:
    
        r2 = new java.lang.Object[]{new int[]{r28}, new int[]{r28 ^ 10}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x064a, code lost:
    
        r7 = new java.lang.Object[]{java.lang.Integer.valueOf(r29), r0, java.lang.Integer.valueOf((((((~((-964417471) | r4)) | 40511514) * 226) - 882896512) + (((~((~r28) | (-957470629))) | ((~((-40511515) | r28)) | 33564672)) * (-113))) + ((~(r28 | (-964417471))) * 113))};
        r0 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x068a, code lost:
    
        if (r0 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x068c, code lost:
    
        r0 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 2713 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
        r1 = (byte) (r10[23] + 1);
        r4 = r10[14];
        r8 = new java.lang.Object[1];
        a(r1, (short) (r4 + 1), r4, r8);
        r0 = r0.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x06e8, code lost:
    
        ((int[]) r2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r0).invoke(null, r7)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x06f0, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x062e, code lost:
    
        if (r4.equals(((java.lang.String) r8[0]).intern()) != false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [byte, short] */
    /* JADX WARN: Type inference failed for: r11v36, types: [short] */
    /* JADX WARN: Type inference failed for: r3v77, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v52, types: [java.lang.Class[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] valueOf(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object obj;
        java.lang.Integer num;
        try {
            if (context == null) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(r2 | (-246978710))) | 757950275) * 226) - 882896512) + (((~((~i) | (-43030677))) | (~((-757950276) | i)) | 554002242) * (-113)) + ((~(i | (-246978710))) * 113))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 50, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                    byte[] bArr = $$a;
                    byte b = (byte) (bArr[23] + 1);
                    byte b2 = bArr[14];
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(b, (short) (b2 + 1), b2, objArr4);
                    obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 115) % 128;
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, null, "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(127 - android.text.TextUtils.getCapsMode("", 0, 0), null, null, "\u0085\u0092\u0082\u0091\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0090\u008f\u008f\u008e\u0089\u008a\u008d", objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(android.view.View.combineMeasuredStates(0, 0) + 127, null, null, "\u0085\u0092\u0082\u0091\u0082\u0085\u0086\u0089\u0081\u0088\u0086\u0090\u008f\u008f\u008e\u0087\u0093\u008f\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(126 - android.os.Process.getGidForName(""), null, null, "\u0094\u008d\u0081\u0090\u0092", objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 69) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    int i3 = ~i;
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~(i3 | (-148163203))) | (~((-855717141) | i3))) * (-184)) + 781589656 + (((~(i3 | (-856241462))) | (~((-148687524) | i3)) | 524321) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 126864264)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getCapsMode("", 0, 0), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                        byte[] bArr2 = $$a;
                        byte b3 = (byte) (bArr2[23] + 1);
                        byte b4 = bArr2[14];
                        short s = (short) (b4 + 1);
                        byte b5 = b4;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a(b3, s, b5, objArr10);
                        obj3 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    int i4 = ~i;
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~(i4 | (-221397481))) | 16793608) | (~(783531504 | i4))) * 464) - 157888936) + (((-204603873) | i) * (-464)) + (((~(783531504 | i)) | 16793608) * 464))};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj4 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) android.view.View.combineMeasuredStates(0, 0));
                        byte[] bArr3 = $$a;
                        byte b6 = (byte) (bArr3[23] + 1);
                        byte b7 = bArr3[14];
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(b6, (short) (b7 + 1), b7, objArr12);
                        obj4 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    return objArr;
                }
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj5 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 33, 1737 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 5826));
                    byte[] bArr4 = $$a;
                    byte b8 = (byte) (bArr4[23] + 1);
                    byte b9 = bArr4[14];
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(b8, (short) (b9 + 1), b9, objArr13);
                    obj5 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj5);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj5).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33, 1739 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (5827 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                byte[] bArr5 = $$a;
                ?? r11 = (byte) (bArr5[23] + 1);
                byte b10 = bArr5[14];
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(r11, (short) (b10 + 1), b10, objArr14);
                java.lang.Object obj6 = r11;
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 119) % 128;
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1738 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 5826));
                    byte b11 = bArr5[20];
                    ?? r112 = (short) (b11 | 48);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    a(b11, r112, bArr5[23], objArr15);
                    obj = r112;
                    obj6 = r112;
                }
                obj = obj6;
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 93) % 128;
                    java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((~i) | (-944823831))) * 130) - 684575316) + (((~(i | (-944823831))) | 59318656) * 130))};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj7 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, 2713 - (android.os.Process.myTid() >> 22), (char) android.text.TextUtils.getOffsetAfter("", 0));
                        byte b12 = (byte) (bArr5[23] + 1);
                        byte b13 = bArr5[14];
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(b12, (short) (b13 + 1), b13, objArr18);
                        obj7 = cls9.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                    }
                    ((int[]) objArr16[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr17)).intValue();
                    return objArr16;
                }
                try {
                    try {
                        if (android.os.Build.VERSION.SDK_INT > 33) {
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            b(android.view.View.resolveSize(0, 0) + 127, null, null, "\u0088\u0084\u0087\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0097\u0083\u0096\u0090\u0090\u0095\u0089\u0086\u0082\u0086\u0095\u0088\u0089\u008a\u0095", objArr19);
                            try {
                                java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                obj = obj;
                                if (obj8 == null) {
                                    ?? r3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.blue(0), 3161 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (33099 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                    byte b14 = (byte) (bArr5[14] + 1);
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    a(b14, (short) (b14 | 653), (byte) (bArr5[0] - 1), objArr21);
                                    obj8 = r3.getMethod((java.lang.String) objArr21[0], new java.lang.Class[]{java.lang.String.class});
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj8);
                                    obj = java.lang.String.class;
                                }
                                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, objArr20)).longValue();
                                long j = ~i;
                                obj = 0;
                                long j2 = ~(j | 386860923);
                                num = 16;
                                long j3 = ~(longValue | (-386860924));
                                long j4 = ((((((-1527) * longValue) + 295948606095L) + ((longValue | j2) * 764)) + (((~(j | longValue)) | j3) * (-1528))) + (((j3 | (~((~longValue) | 386860923))) | j2) * 764)) - 1724529031;
                                int i5 = ~i;
                                int i6 = (-392781975) | i5;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } else {
                            num = 16;
                            obj = 0;
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            b(127 - android.text.TextUtils.indexOf("", ""), null, null, "\u008a\u0090\u0098\u0081\u008d\u008d\u0099\u0098\u008a\u0083\u0087\u0085\u0084", objArr22);
                            try {
                                java.lang.Object[] objArr23 = {((java.lang.String) objArr22[0]).intern()};
                                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj9 == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 40, 1921 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                    byte b15 = (byte) (bArr5[14] + 1);
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    a(b15, (short) (b15 | 653), (byte) (bArr5[0] - 1), objArr24);
                                    obj9 = cls10.getMethod((java.lang.String) objArr24[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj9);
                                }
                                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj9).invoke(null, objArr23);
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                b(android.view.View.combineMeasuredStates(0, 0) + 127, null, null, "\u009a", objArr25);
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
                    obj = 0;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
            java.lang.Object[] objArr26 = {new int[]{i}, new int[]{i}, null, new int[1]};
            int i7 = ~i;
            int i8 = ~(i | 1073378745);
            java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), obj, java.lang.Integer.valueOf((((~((-1039168914) | i7)) | 30096 | i8) * (-713)) + 1841254642 + (i8 * 1426) + ((~(34239928 | i7)) * 713))};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj10 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2713 - android.text.TextUtils.indexOf("", ""), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                byte[] bArr6 = $$a;
                byte b16 = (byte) (bArr6[23] + 1);
                byte b17 = bArr6[14];
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                a(b16, (short) (b17 + 1), b17, objArr28);
                obj10 = cls11.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
            }
            ((int[]) objArr26[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr27)).intValue();
            return objArr26;
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }
}
