package com.payair.hce;

/* loaded from: classes4.dex */
public class showErrorDialogFragment {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long DigitizedCardProfile;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 38 - (b * 34);
        int i6 = (b2 * 34) + 1;
        byte[] bArr = $$a;
        char[] cArr = new char[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i4 = 0;
            i5++;
            i2 = (i7 + i8) - 2;
            i3 = i4;
            int i9 = i2;
            int i10 = i5;
            i4 = i3 + 1;
            cArr[i3] = (char) i9;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i8 = bArr[i10];
            i7 = i9;
            i5 = i10;
            i5++;
            i2 = (i7 + i8) - 2;
            i3 = i4;
            int i92 = i2;
            int i102 = i5;
            i4 = i3 + 1;
            cArr[i3] = (char) i92;
            if (i4 == i6) {
            }
        } else {
            i2 = (i * 653) + 65;
            i3 = 0;
            int i922 = i2;
            int i1022 = i5;
            i4 = i3 + 1;
            cArr[i3] = (char) i922;
            if (i4 == i6) {
            }
        }
    }

    private static void c(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3 = i * 3;
        int i4 = s + 4;
        byte[] bArr = $$d;
        int i5 = 119 - (i2 * 2);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i5 += -i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i4++;
                i5 += -bArr[i4];
            }
        }
    }

    public static java.lang.Integer DigitizedCardProfile(int i) {
        int i2 = values + 89;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Integer.valueOf(i);
        }
        throw null;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10 + 7;
        int i3 = i2 % 128;
        $11 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            $10 = (i3 + 53) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(DigitizedCardProfile ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i4 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, 1921 - android.view.View.getDefaultSize(0, 0), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                    byte b = (byte) ($$d[2] + 1);
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(b, b2, (byte) (b2 + 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.view.KeyEvent.normalizeMetaState(0) + 429, (char) (android.view.View.MeasureSpec.getSize(0) + 31610));
                    byte b3 = (byte) ($$d[2] + 1);
                    byte b4 = (byte) (b3 + 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c(b3, b4, b4, objArr5);
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

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        values = 0;
        writeReplace = 1;
        DigitizedCardProfile = -6550636486946263235L;
    }

    static void init$1() {
        $$d = new byte[]{39, 108, -2, 93};
        $$e = 38;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:39|40|(1:42)(4:86|87|88|(2:90|(10:92|44|45|(1:47)(5:55|56|57|58|(2:60|(1:62)(6:63|64|65|66|67|(6:70|71|(1:73)|74|75|76))))|48|49|(1:51)|52|53|54)(3:93|94|95))(1:96))|43|44|45|(0)(0)|48|49|(0)|52|53|54) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02be A[Catch: all -> 0x083b, TRY_ENTER, TryCatch #5 {all -> 0x083b, blocks: (B:23:0x02be, B:25:0x02cd, B:26:0x030b, B:30:0x03c1, B:32:0x0412, B:33:0x0466, B:71:0x06a6, B:73:0x06f6, B:74:0x074c, B:49:0x0788, B:51:0x07d1, B:52:0x0826, B:103:0x0492, B:105:0x04d3, B:106:0x0525, B:129:0x021c, B:131:0x025c, B:132:0x02a3, B:4:0x0016, B:7:0x004b, B:11:0x0079, B:18:0x0137, B:110:0x0140, B:112:0x0146, B:113:0x0147, B:9:0x0148, B:115:0x014c, B:121:0x01f5, B:124:0x01fe, B:126:0x0204, B:127:0x0205, B:117:0x0164, B:119:0x019b, B:120:0x01e9, B:14:0x0094, B:16:0x00e1, B:17:0x012b), top: B:2:0x0016, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x07d1 A[Catch: all -> 0x083b, TryCatch #5 {all -> 0x083b, blocks: (B:23:0x02be, B:25:0x02cd, B:26:0x030b, B:30:0x03c1, B:32:0x0412, B:33:0x0466, B:71:0x06a6, B:73:0x06f6, B:74:0x074c, B:49:0x0788, B:51:0x07d1, B:52:0x0826, B:103:0x0492, B:105:0x04d3, B:106:0x0525, B:129:0x021c, B:131:0x025c, B:132:0x02a3, B:4:0x0016, B:7:0x004b, B:11:0x0079, B:18:0x0137, B:110:0x0140, B:112:0x0146, B:113:0x0147, B:9:0x0148, B:115:0x014c, B:121:0x01f5, B:124:0x01fe, B:126:0x0204, B:127:0x0205, B:117:0x0164, B:119:0x019b, B:120:0x01e9, B:14:0x0094, B:16:0x00e1, B:17:0x012b), top: B:2:0x0016, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05f5 A[Catch: Exception -> 0x0771, TRY_LEAVE, TryCatch #7 {Exception -> 0x0771, blocks: (B:45:0x05d1, B:55:0x05f5, B:58:0x061c, B:60:0x0624, B:63:0x0651, B:66:0x067b, B:79:0x0762, B:80:0x0768, B:83:0x076a, B:84:0x0770, B:65:0x065b, B:57:0x05ff), top: B:44:0x05d1, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        char c;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i3;
        writeReplace = (values + 115) % 128;
        try {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a("\uf18c\uf1e5⒬ޝ竫鸖뒢鞶\ueae1⸙뼡쒽➊〥ꥴ\u1af1븊咩랤諵丘\ue49a잝", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a("좈죿䗡ఋ᜕ꜙ헦鰍蜯\u1717\ude7eꗢⰶ㮞쒛眔蜂㗭밝\ue71e眍藒", (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr4);
                strArr = new java.lang.String[]{((java.lang.String) objArr3[0]).intern(), ((java.lang.String) objArr4[0]).intern()};
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-54674908) | i)) | 131545) * 576) + 1986419160 + (((~((~i) | (-54543363))) | 950122532) * 576) + 75769920)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), 2713 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                    byte b = $$a[14];
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b, b, (byte) (b - 1), objArr6);
                    obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
            }
            try {
                for (i3 = 0; i3 < 2; i3++) {
                    java.lang.String str2 = strArr[i3];
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a("歾欟稲碊䄱ө\uea3d\ue882텥듡\ue1a2騿壐伒銹℗⓳ਦ좃넼", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                        int i4 = ~i;
                        try {
                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-375377373) | i4)) | (~((-629551613) | i))) * 1900) - 194866104) + (((~(375377372 | i)) | (~(629551612 | i4))) * (-950)) + (((~(i4 | 375377372)) | (~(629551612 | i))) * 950))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - android.view.View.MeasureSpec.getMode(0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                byte b2 = $$a[14];
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(b2, b2, (byte) (b2 - 1), objArr9);
                                obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                            if (i == ((int[]) objArr[1])[0]) {
                                return objArr;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28, 2391 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (29420 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                                byte b3 = $$a[14];
                                byte b4 = (byte) (b3 - 1);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                b(b4, b4, b3, objArr10);
                                obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j = ~longValue;
                            long j2 = i;
                            long j3 = j | (-1694406005);
                            long j4 = (131 * longValue) + 218578374645L + ((~(j | (~j2) | (-1694406005))) * 130) + ((~j3) * (-260)) + (((~(longValue | 1694406004)) | (~(j3 | j2))) * 130) + 1976490101;
                            int i5 = (int) (j4 >> 32);
                            int i6 = ~i;
                            if (((i5 & (((((~(395781827 | i6)) | (~((-1833008239) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1799855026) + (((~((-83960899) | i6)) | (~(2144829167 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j4) & ((((~(1868228262 | i)) | (-431001853)) * (-318)) + 1847004635 + (((~((-431001853) | i)) | (~((-1716151811) | i6))) * 318) + (((~((-152076453) | i6)) | (~((-1716151811) | i))) * 318)))) == 1) {
                                values = (writeReplace + 13) % 128;
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-533398757) | i6)) | 471530228) * (-602)) - 1257446988) + (((~((-533398757) | i)) | 470417636 | (~(534511348 | i6))) * (-301)) + ((~(471530228 | i6)) * 301))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 2713 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                    byte b5 = $$a[14];
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    b(b5, b5, (byte) (b5 - 1), objArr12);
                                    obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                                c = 0;
                                ((int[]) objArr2[3])[0] = intValue;
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-377041146) | i6)) | 73924825) * (-241)) + 1279842427 + (((~((-303116321) | i6)) | 553963014) * 241))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", "", 0, 0), 2713 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                    byte b6 = $$a[14];
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(b6, b6, (byte) (b6 - 1), objArr14);
                                    obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                                c = 0;
                                ((int[]) objArr2[3])[0] = intValue2;
                            }
                            if (i != ((int[]) objArr2[1])[c]) {
                                values = (writeReplace + 33) % 128;
                                return objArr2;
                            }
                            try {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a("㗕㗺｢빤ੵ娂潲\u2e70驼\uea4b擯ὤ鹡觡\ud9fc樹穙转\u0e67恵詒㼞繉䩔ᩬ꽚\uee5c\uda40ꩢ弎幎ꩃ㩯콛칀㩐䩡缎㸩訴\uda0c\uef3a기ᨼ", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr15);
                                file2 = new java.io.File(((java.lang.String) objArr15[0]).intern());
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file2.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file2);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    a("⨜⩲干꼜엣颐ꊸ", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr16);
                                    if (!str.equals(((java.lang.String) objArr16[0]).intern())) {
                                        int i7 = values + 3;
                                        writeReplace = i7 % 128;
                                        if (i7 % 2 == 0) {
                                            throw new java.lang.ArithmeticException();
                                        }
                                        fileReader.close();
                                        bufferedReader.close();
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a("䝴䝛ﺭ\u16fb\uf1c0⣯滺蛲懞飷攣Ợ㛲ⅵ≕釚࣮身꛴Ǜ\uf8bb㺛훝뇽棍꺖䛄⇘\ud8c1広\uf6d8函䣐캀曕", android.view.ViewConfiguration.getScrollBarSize() >> 8, objArr17);
                                        file = new java.io.File(((java.lang.String) objArr17[0]).intern());
                                        if (!file.canRead()) {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a("쿍쿼䲆䇪썇", android.view.KeyEvent.keyCodeFromString(""), objArr18);
                                                if (readLine.equals(((java.lang.String) objArr18[0]).intern())) {
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    a("\uf01c\uf033䛡琘˧鿋훱\ue40c鋮⾂\udd6cꛧ吝䎝텮披뾐㛯쐛\uf2f9供蚝됵䋆\udfa5ᛙ␠틒澫\ue68d鐥ꋖﾵ盉а㋂辻욍\uf44e芺", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr19);
                                                    java.io.File file3 = new java.io.File(((java.lang.String) objArr19[0]).intern());
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                            a("쿍쿼䲆䇪썇", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr20);
                                                            boolean equals = readLine2.equals(((java.lang.String) objArr20[0]).intern());
                                                            values = (writeReplace + 91) % 128;
                                                            if (equals && str != null) {
                                                                java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i ^ 20}, str, new int[1]};
                                                                java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((989724596 | i6) * (-369)) - 1838430672) + (((~((-988653621) | i6)) | 16275364) * (-369)) + (((~(i | 988653620)) | 1070976 | (~(i6 | (-973449233)))) * 369))};
                                                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj7 == null) {
                                                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.view.MotionEvent.axisFromString("") + 1));
                                                                    byte b7 = $$a[14];
                                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                    b(b7, b7, (byte) (b7 - 1), objArr23);
                                                                    obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                }
                                                                ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                                return objArr21;
                                                            }
                                                        } finally {
                                                        }
                                                    } else {
                                                        values = (writeReplace + 5) % 128;
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-1110789) | i6)) | (~(989593535 | i))) * 988) + 401786092 + (((~(i | (-16446238))) | 15335449 | (~(989593535 | i6))) * 988))};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                            byte b8 = $$a[14];
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            b(b8, b8, (byte) (b8 - 1), objArr26);
                                            obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                        }
                                        ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr25)).intValue();
                                        return objArr24;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                } finally {
                                }
                            } else {
                                writeReplace = (values + 97) % 128;
                            }
                            str = null;
                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                            a("䝴䝛ﺭ\u16fb\uf1c0⣯滺蛲懞飷攣Ợ㛲ⅵ≕釚࣮身꛴Ǜ\uf8bb㺛훝뇽棍꺖䛄⇘\ud8c1広\uf6d8函䣐캀曕", android.view.ViewConfiguration.getScrollBarSize() >> 8, objArr172);
                            file = new java.io.File(((java.lang.String) objArr172[0]).intern());
                            if (!file.canRead()) {
                            }
                            java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-1110789) | i6)) | (~(989593535 | i))) * 988) + 401786092 + (((~(i | (-16446238))) | 15335449 | (~(989593535 | i6))) * 988))};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                            }
                            ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr252)).intValue();
                            return objArr242;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                }
                java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-557722076) | i)) | 555231234) * (-283)) - 778421746) + ((~((-2490842) | i)) * 283))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, 2713 - android.view.View.MeasureSpec.getSize(0), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    byte b9 = $$a[14];
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    b(b9, b9, (byte) (b9 - 1), objArr28);
                    obj8 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
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

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver, -50, -127, 91, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = 225;
    }
}
