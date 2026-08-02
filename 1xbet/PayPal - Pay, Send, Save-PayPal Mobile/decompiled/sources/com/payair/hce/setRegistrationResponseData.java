package com.payair.hce;

/* loaded from: classes4.dex */
public final class setRegistrationResponseData extends com.payair.hce.postToastMessageOnUi {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static int getAid;
    private static int valueOf;
    private static char values;
    private static char writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (s3 * 34) + 1;
        byte[] bArr = $$a;
        int i4 = (s * 34) + 4;
        int i5 = (s2 * 653) + 65;
        char[] cArr = new char[i3];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i3;
            i2 = 0;
            int i8 = (i7 + (-i4)) - 2;
            int i9 = i6 + 1;
            i = i2;
            i5 = i8;
            i4 = i9;
            i2 = i + 1;
            cArr[i] = (char) i5;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i10 = i5;
            i6 = i4;
            i4 = bArr[i4];
            i7 = i10;
            int i82 = (i7 + (-i4)) - 2;
            int i92 = i6 + 1;
            i = i2;
            i5 = i82;
            i4 = i92;
            i2 = i + 1;
            cArr[i] = (char) i5;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            cArr[i] = (char) i5;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 110 - (i * 4);
        byte[] bArr = $$d;
        int i4 = b2 * 2;
        int i5 = b + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            int i10 = i5 + (-i8);
            i2 = i9;
            i5 = i7;
            i3 = i10;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5 + 1;
            i8 = bArr[i11];
            i5 = i3;
            i7 = i11;
            int i102 = i5 + (-i8);
            i2 = i9;
            i5 = i7;
            i3 = i102;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public setRegistrationResponseData(java.lang.String str) {
        super(str);
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 49) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                $10 = ($11 + 47) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 62, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1287, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(0, (byte) -1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(values)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - android.graphics.ImageFormat.getBitsPerPixel(0), 1336 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(0, (byte) -1, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 53, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3544, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $10 = ($11 + 29) % 128;
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        getAid = 1;
        writeReplace = (char) 36252;
        values = (char) 22219;
        DigitizedCardProfile = (char) 33956;
        AlternateContactlessPaymentDataJson = (char) 33397;
    }

    static void init$1() {
        $$d = new byte[]{120, 91, -87, 14};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{84, 108, com.google.common.base.Ascii.CAN, -19, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 98;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:47|48)|(1:50)(4:93|94|95|(11:97|98|52|53|(1:55)(5:63|64|65|66|(2:68|(1:70)(5:71|72|73|74|(6:77|78|(1:80)|81|82|83))))|56|57|(1:59)|60|61|62)(1:99))|51|52|53|(0)(0)|56|57|(0)|60|61|62) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02ff A[Catch: all -> 0x081d, TRY_ENTER, TryCatch #8 {all -> 0x081d, blocks: (B:28:0x02ff, B:30:0x0311, B:31:0x0351, B:35:0x0408, B:37:0x044c, B:38:0x049a, B:78:0x06c4, B:80:0x06f4, B:81:0x0743, B:57:0x0785, B:59:0x07b8, B:60:0x0807, B:106:0x04c8, B:108:0x0507, B:109:0x0550, B:135:0x025d, B:137:0x028d, B:138:0x02d5, B:4:0x002b, B:7:0x008b, B:11:0x00b9, B:19:0x016f, B:113:0x0178, B:115:0x017e, B:116:0x017f, B:9:0x0180, B:118:0x0188, B:126:0x0233, B:129:0x023c, B:131:0x0242, B:132:0x0243, B:133:0x005c, B:14:0x00d8, B:16:0x0118, B:17:0x0161, B:121:0x01a4, B:123:0x01dc, B:124:0x0225), top: B:2:0x0029, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x07b8 A[Catch: all -> 0x081d, TryCatch #8 {all -> 0x081d, blocks: (B:28:0x02ff, B:30:0x0311, B:31:0x0351, B:35:0x0408, B:37:0x044c, B:38:0x049a, B:78:0x06c4, B:80:0x06f4, B:81:0x0743, B:57:0x0785, B:59:0x07b8, B:60:0x0807, B:106:0x04c8, B:108:0x0507, B:109:0x0550, B:135:0x025d, B:137:0x028d, B:138:0x02d5, B:4:0x002b, B:7:0x008b, B:11:0x00b9, B:19:0x016f, B:113:0x0178, B:115:0x017e, B:116:0x017f, B:9:0x0180, B:118:0x0188, B:126:0x0233, B:129:0x023c, B:131:0x0242, B:132:0x0243, B:133:0x005c, B:14:0x00d8, B:16:0x0118, B:17:0x0161, B:121:0x01a4, B:123:0x01dc, B:124:0x0225), top: B:2:0x0029, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0620 A[Catch: Exception -> 0x0769, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0769, blocks: (B:53:0x05ea, B:63:0x0620, B:66:0x064a, B:68:0x0652, B:71:0x0677, B:74:0x06a2, B:86:0x075a, B:87:0x0760, B:90:0x0762, B:91:0x0768, B:65:0x062a, B:73:0x0681), top: B:52:0x05ea, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        char c;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i3;
        int i4 = valueOf + 93;
        getAid = i4 % 128;
        try {
            try {
                if (i4 % 2 == 0) {
                    strArr = new java.lang.String[2];
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a("錻㝱睭挧ણꈎ샩㷶⩳蟚හ존≜롍趼ꤹ叝\uf704눜ਸ", 51 % android.view.View.combineMeasuredStates(0, 0), objArr3);
                    strArr[0] = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a("㸱뫷\uf52c稞떧苆\ue2fe袪\uecbd픢睭挧ણꈎ샩㷶⩳蟚", 89 / android.widget.ExpandableListView.getPackedPositionGroup(1L), objArr4);
                    strArr[0] = ((java.lang.String) objArr4[0]).intern();
                    i3 = 1;
                } else {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a("錻㝱睭挧ણꈎ샩㷶⩳蟚හ존≜롍趼ꤹ叝\uf704눜ਸ", 19 - android.view.View.combineMeasuredStates(0, 0), objArr5);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a("㸱뫷\uf52c稞떧苆\ue2fe袪\uecbd픢睭挧ણꈎ샩㷶⩳蟚", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 18, objArr6);
                    strArr = new java.lang.String[]{((java.lang.String) objArr5[0]).intern(), ((java.lang.String) objArr6[0]).intern()};
                    i3 = 0;
                }
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-527054504) | r2)) | (-477874482)) * (-983)) - 1740020630) + (((~((~i) | (-477874482))) | 1165584) * 983))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", "", 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    byte b = $$a[14];
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(b2, b2, (byte) (-b), objArr8);
                    obj2 = cls.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr7)).intValue();
            }
            try {
                while (i3 < 2) {
                    java.lang.String str2 = strArr[i3];
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a("ꠧ㘩痹\uf286蒊瓋\udec6멡ѵ箭䌾嫇\uda12Ｍꇱ鬊", android.view.MotionEvent.axisFromString("") + 17, objArr9);
                    java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr9[0]).intern());
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                        int i5 = ~i;
                        try {
                            java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((14772880 | i) * 988) + 900078628 + (((~(14772913 | i5)) | 990156038) * (-1976)) + (((~(i5 | 990156071)) | (~((-990156072) | i)) | 14772880) * 988))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 50, 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                byte b3 = $$a[14];
                                byte b4 = (byte) (b3 + 1);
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                b(b4, b4, (byte) (-b3), objArr11);
                                obj3 = cls3.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr10)).intValue();
                            if (i == ((int[]) objArr[1])[0]) {
                                int i6 = getAid + 63;
                                valueOf = i6 % 128;
                                if (i6 % 2 == 0) {
                                    return objArr;
                                }
                                throw null;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2391, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 29420));
                                byte b5 = (byte) (-$$a[14]);
                                byte b6 = b5;
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                b(b5, b6, (byte) (b6 - 1), objArr12);
                                obj4 = cls4.getMethod((java.lang.String) objArr12[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j = ~longValue;
                            long j2 = i;
                            long j3 = (~j2) | j;
                            long j4 = ((-112) * longValue) + 72745183280L + (((~j3) | (-649510565)) * 226) + (((~(j3 | (-649510565))) | (~(649510564 | j2)) | (~(longValue | 649510564))) * (-113)) + (((j2 | j) ^ (-1)) * 113) + 931594661;
                            int i7 = (int) (j4 >> 32);
                            int i8 = ~i;
                            if (((i7 & ((((~((-1414727021) | i8)) * (-560)) - 1518504342) + ((~((-5308677) | i)) * (-560)) + (((~((-1443013865) | i8)) | 33595520) * 560))) | (((int) j4) & ((((~(141808187 | i8)) | 1295418222 | (~((-141808188) | i))) * (-564)) + 658771633 + ((~((-4280338) | i)) * 1128) + (((~(1295418222 | i8)) | 137527850) * 564)))) == 1) {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~((-284032302) | i)) | 268827908) | (~(720896683 | i))) * (-754)) - 1973300548) + (((~((-268827909) | i)) | (~(989724591 | i8))) * (-754)) + (((-284032302) | i8) * 754))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, 2714 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                    byte b7 = $$a[14];
                                    byte b8 = (byte) (b7 + 1);
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(b8, b8, (byte) (-b7), objArr14);
                                    obj5 = cls5.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr13)).intValue();
                                c = 0;
                                ((int[]) objArr2[3])[0] = intValue;
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr15 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-826357653) | i)) | 4) * 336) - 319415784) + (((~(178571332 | i)) | (-1004928981)) * (-168)) + (((~(178571332 | i8)) | (-826357653)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 50, android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                    byte b9 = $$a[14];
                                    byte b10 = (byte) (b9 + 1);
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    b(b10, b10, (byte) (-b9), objArr16);
                                    obj6 = cls6.getMethod((java.lang.String) objArr16[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr15)).intValue();
                                c = 0;
                                ((int[]) objArr2[3])[0] = intValue2;
                            }
                            if (i != ((int[]) objArr2[1])[c]) {
                                int i9 = getAid + 109;
                                valueOf = i9 % 128;
                                if (i9 % 2 == 0) {
                                    return objArr2;
                                }
                                throw null;
                            }
                            try {
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a("짝瑱캤漹能緐⩳蟚搇\uf271ꩬ谊\uf5eb불ણꈎ\u2d98焷\uef3d⨧\udf11暕떧苆\u2d98焷\uda10ỳ經酏釵诗秄ⱄ\uef3d⨧\udf11暕⩳蟚", 39 - android.view.MotionEvent.axisFromString(""), objArr17);
                                file2 = new java.io.File(((java.lang.String) objArr17[0]).intern());
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file2.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file2);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    a("뻶ꇗ\uaaf8\u0c65", 3 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr18);
                                    if (!str.equals(((java.lang.String) objArr18[0]).intern())) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        getAid = (valueOf + 33) % 128;
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        a("Ꭼ羔茴\ue236\ud8ff왥꼷帀湲鷩턅郖밢\ue3d3ꔅ쉛穕行\uef3d⨧\udf11暕㥍踴釵诗\uf1f6繢돨ቘ눜ਸ", 30 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr19);
                                        file = new java.io.File(((java.lang.String) objArr19[0]).intern());
                                        if (file.canRead()) {
                                            int i10 = getAid;
                                            valueOf = (i10 + 23) % 128;
                                            int i11 = i10 + 51;
                                            valueOf = i11 % 128;
                                            int i12 = i11 % 2;
                                        } else {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                a("쇶⢮", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr20);
                                                if (readLine.equals(((java.lang.String) objArr20[0]).intern())) {
                                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                    a("짝瑱캤漹能緐⩳蟚搇\uf271ꩬ谊\uf5eb불ણꈎ\u2d98焷\uef3d⨧\udf11暕떧苆\u2d98焷\uef3d⨧\udf11暕떧苆榐엟믳躠", android.graphics.Color.rgb(0, 0, 0) + 16777252, objArr21);
                                                    java.io.File file3 = new java.io.File(((java.lang.String) objArr21[0]).intern());
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                            a("쇶⢮", 1 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr22);
                                                            if (readLine2.equals(((java.lang.String) objArr22[0]).intern()) && str != null) {
                                                                java.lang.Object[] objArr23 = {new int[]{i}, new int[]{i ^ 20}, str, new int[1]};
                                                                java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~r1) | 468189185) * (-828)) - 137527688) + ((536739799 | i8) * (-828))) - 2038922912)};
                                                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj7 == null) {
                                                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.graphics.Color.red(0) + 2713, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                                                    byte b11 = $$a[14];
                                                                    byte b12 = (byte) (b11 + 1);
                                                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                                    b(b12, b12, (byte) (-b11), objArr25);
                                                                    obj7 = cls7.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                }
                                                                ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr24)).intValue();
                                                                return objArr23;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        java.lang.Object[] objArr26 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        int i13 = ~((-386555720) | i8);
                                        java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((550609040 | i13) | (~(386555719 | i))) * (-338)) - 1867776520) + (((~(i | 937164759)) | i13) * 338))};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                            byte b13 = $$a[14];
                                            byte b14 = (byte) (b13 + 1);
                                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                                            b(b14, b14, (byte) (-b13), objArr28);
                                            obj = cls8.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                        }
                                        ((int[]) objArr26[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr27)).intValue();
                                        return objArr26;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                } finally {
                                }
                            }
                            str = null;
                            java.lang.Object[] objArr192 = new java.lang.Object[1];
                            a("Ꭼ羔茴\ue236\ud8ff왥꼷帀湲鷩턅郖밢\ue3d3ꔅ쉛穕行\uef3d⨧\udf11暕㥍踴釵诗\uf1f6繢돨ቘ눜ਸ", 30 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr192);
                            file = new java.io.File(((java.lang.String) objArr192[0]).intern());
                            if (file.canRead()) {
                            }
                            java.lang.Object[] objArr262 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            int i132 = ~((-386555720) | i8);
                            java.lang.Object[] objArr272 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((550609040 | i132) | (~(386555719 | i))) * (-338)) - 1867776520) + (((~(i | 937164759)) | i132) * 338))};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                            }
                            ((int[]) objArr262[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr272)).intValue();
                            return objArr262;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    i3++;
                }
                java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-628279213) | i)) | 74580012) * 576) + 1986419160 + (((~((~i) | (-553699201))) | 302069760) * 576) + 8413952)};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2713, (char) android.graphics.Color.argb(0, 0, 0, 0));
                    byte b15 = $$a[14];
                    byte b16 = (byte) (b15 + 1);
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    b(b16, b16, (byte) (-b15), objArr30);
                    obj8 = cls9.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr29)).intValue();
                if (i == ((int[]) objArr[1])[0]) {
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }
}
