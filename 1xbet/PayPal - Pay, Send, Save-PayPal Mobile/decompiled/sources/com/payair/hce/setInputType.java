package com.payair.hce;

/* loaded from: classes4.dex */
public class setInputType extends com.payair.hce.setWidth {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$p = null;
    private static final int $$q = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int valueOf;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void j(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s2 * 653) + 65;
        int i5 = s + 4;
        byte[] bArr = $$d;
        int i6 = 35 - (i * 34);
        char[] cArr = new char[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = (i5 + i8) - 2;
            i2 = i3;
            int i10 = i7;
            i4 = i9;
            i5 = i10;
            int i11 = i5 + 1;
            i3 = i2 + 1;
            cArr[i2] = (char) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i8 = bArr[i11];
            int i12 = i4;
            i7 = i11;
            i5 = i12;
            int i92 = (i5 + i8) - 2;
            i2 = i3;
            int i102 = i7;
            i4 = i92;
            i5 = i102;
            int i112 = i5 + 1;
            i3 = i2 + 1;
            cArr[i2] = (char) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i1122 = i5 + 1;
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
    private static void k(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i2 * 2) + 4;
        int i5 = s * 3;
        int i6 = (i * 2) + 117;
        byte[] bArr = $$p;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            i6 = (-i6) + i9;
            i4 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = bArr[i4];
            int i11 = i4;
            i9 = i6;
            i6 = i10;
            i8 = i3 + 1;
            i7 = i11;
            i6 = (-i6) + i9;
            i4 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public setInputType() {
    }

    public setInputType(com.payair.hce.setHintTextColor sethinttextcolor) {
        super(sethinttextcolor, false);
    }

    private static void i(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 5;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(AlternateContactlessPaymentDataJson ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        $10 = ($11 + 27) % 128;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $10 = ($11 + 111) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1921, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    k((short) 0, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.getDeadChar(0, 0), 429 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (31609 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    k((short) 0, 1, 0, objArr5);
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

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        valueOf = (writeReplace + 77) % 128;
        java.util.Enumeration valueOf2 = valueOf();
        int i = 0;
        while (valueOf2.hasMoreElements()) {
            i += ((com.payair.hce.setShadowLayer) valueOf2.nextElement()).getAid().AlternateContactlessPaymentDataJson();
            valueOf = (writeReplace + 43) % 128;
        }
        return i + 4;
    }

    @Override // com.payair.hce.setWidth, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        valueOf = (writeReplace + 43) % 128;
        setmaxlines.DigitizedCardProfile(49);
        setmaxlines.DigitizedCardProfile(128);
        java.util.Enumeration valueOf2 = valueOf();
        while (valueOf2.hasMoreElements()) {
            writeReplace = (valueOf + 59) % 128;
            setmaxlines.DigitizedCardProfile((com.payair.hce.setShadowLayer) valueOf2.nextElement());
            valueOf = (writeReplace + 53) % 128;
        }
        setmaxlines.DigitizedCardProfile(0);
        setmaxlines.DigitizedCardProfile(0);
        writeReplace = (valueOf + 35) % 128;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        writeReplace = 1;
        AlternateContactlessPaymentDataJson = -8567153468286948667L;
    }

    static void init$1() {
        $$p = new byte[]{89, 16, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -117};
        $$q = 13;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:39|40|(1:42)(4:87|88|89|(10:91|44|45|(1:47)(5:55|56|57|58|(2:60|(1:62)(6:63|64|65|66|67|(2:69|(6:71|72|(1:74)|75|76|77)))))|48|49|(1:51)|52|53|54)(1:92))|43|44|45|(0)(0)|48|49|(0)|52|53|54) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ca A[Catch: all -> 0x07ee, TRY_ENTER, TryCatch #8 {all -> 0x07ee, blocks: (B:23:0x02ca, B:25:0x02d9, B:26:0x031a, B:30:0x03b7, B:32:0x03fb, B:33:0x044c, B:72:0x066f, B:74:0x06b8, B:75:0x0706, B:49:0x073d, B:51:0x0789, B:52:0x07db, B:99:0x0474, B:101:0x04c8, B:102:0x051d, B:125:0x021f, B:127:0x0261, B:128:0x02af, B:3:0x0019, B:6:0x004d, B:11:0x0080, B:18:0x012f, B:106:0x0138, B:108:0x013e, B:109:0x013f, B:8:0x0140, B:111:0x0147, B:117:0x01f2, B:120:0x01fb, B:122:0x0201, B:123:0x0202, B:14:0x00a0, B:16:0x00d9, B:17:0x0123, B:113:0x015f, B:115:0x019b, B:116:0x01e6), top: B:2:0x0019, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0789 A[Catch: all -> 0x07ee, TryCatch #8 {all -> 0x07ee, blocks: (B:23:0x02ca, B:25:0x02d9, B:26:0x031a, B:30:0x03b7, B:32:0x03fb, B:33:0x044c, B:72:0x066f, B:74:0x06b8, B:75:0x0706, B:49:0x073d, B:51:0x0789, B:52:0x07db, B:99:0x0474, B:101:0x04c8, B:102:0x051d, B:125:0x021f, B:127:0x0261, B:128:0x02af, B:3:0x0019, B:6:0x004d, B:11:0x0080, B:18:0x012f, B:106:0x0138, B:108:0x013e, B:109:0x013f, B:8:0x0140, B:111:0x0147, B:117:0x01f2, B:120:0x01fb, B:122:0x0201, B:123:0x0202, B:14:0x00a0, B:16:0x00d9, B:17:0x0123, B:113:0x015f, B:115:0x019b, B:116:0x01e6), top: B:2:0x0019, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05c0 A[Catch: Exception -> 0x0729, TRY_LEAVE, TryCatch #2 {Exception -> 0x0729, blocks: (B:45:0x05a0, B:55:0x05c0, B:58:0x05e9, B:60:0x05f1, B:63:0x061c, B:66:0x0641, B:80:0x071a, B:81:0x0720, B:84:0x0722, B:85:0x0728, B:57:0x05ca, B:65:0x0626), top: B:44:0x05a0, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i3;
        valueOf = (writeReplace + 59) % 128;
        long j = 0;
        try {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                i("\ue943\ue92a矧⦒䠿倌\uf477䩻鄹\ufff9籼쉁ᤖ柖\ue440娡腥\uefb2氎툵ॗទ퐷", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                i("觵覂ꏭﶊ쭃陪眦谌\uf184⯺\uff00І禪돎朻鱍\ue1df㮱\uef70ᑗ槰쎞", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr4);
                strArr = new java.lang.String[]{((java.lang.String) objArr3[0]).intern(), ((java.lang.String) objArr4[0]).intern()};
                i3 = 0;
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
                int i4 = ~i;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(i4 | (-377265548))) | r4) * 1150) - 1303619152) + (((~((-627663438) | i)) | (~(627663437 | i4))) * (-575)) + (((~(i4 | 377265547)) | (~(i | (-377265548)))) * 575))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.os.Process.getGidForName(""), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                    byte b = (byte) (-$$d[14]);
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    j(b, b2, b2, objArr6);
                    obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
            }
            try {
                while (i3 < 2) {
                    java.lang.String str2 = strArr[i3];
                    int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(j);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    i("⬅⭤艧\udc0f⫵认隝釄卲\u0a78ẵᦠ\udb5a鉊蛧膢䌨ᨣ໔ঙ", packedPositionType, objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        valueOf = (writeReplace + 49) % 128;
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                        int i5 = ~((~i) | 1004404606);
                        try {
                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-558669691) | i)) | 524378 | i5) * (-470)) + 1251386644 + ((i5 | (~((-558145313) | i))) * 470))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 50, 2713 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte b3 = (byte) (-$$d[14]);
                                byte b4 = (byte) (b3 + 1);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                j(b3, b4, b4, objArr9);
                                obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                            if (i == ((int[]) objArr[1])[0]) {
                                return objArr;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27, android.text.TextUtils.getOffsetAfter("", 0) + 2391, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29420));
                                byte[] bArr = $$d;
                                byte b5 = (byte) (-bArr[23]);
                                byte b6 = bArr[14];
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                j(b5, b6, b6, objArr10);
                                obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j2 = i;
                            long j3 = ((471 * longValue) - 220935711248L) + (((~((~j2) | 936168267)) | longValue) * (-235)) + (((~(j2 | 936168267)) | longValue) * (-470)) + (((~(longValue | 936168267 | j2)) | (~((~longValue) | (-936168268)))) * 235) + 1218252364;
                            int i6 = (int) (j3 >> 32);
                            int i7 = ~i;
                            if (((i6 & (((((~((-987436434) | i7)) | (~(449789977 | i))) * com.visa.cbp.getCertUsage.getODAData) - 1505383969) + (((~((-987436434) | i)) | (~(449789977 | i7))) * com.visa.cbp.getCertUsage.getODAData))) | (((int) j3) & ((((-547619861) | i7) * 494) + 1297189431 + (((~(1197011777 | i7)) | (-631522390)) * 494)))) == 1) {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-569831383) | i)) | 31850498) * 576) + 1986419160 + (((~((-537980885) | i7)) | 403247104) * 576) + 1166017664)};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 2713 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                    byte b7 = (byte) (-$$d[14]);
                                    byte b8 = (byte) (b7 + 1);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    j(b7, b8, b8, objArr12);
                                    obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-67502082) | i7)) | (~((-39336965) | i)) | (~((-830587859) | i))) * 765) + 905911407 + (((~((-106839046) | i7)) | 67502081) * 1530) + (((~((-106839046) | i)) | (~((-830587859) | i7))) * 765))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 50, 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                    byte b9 = (byte) (-$$d[14]);
                                    byte b10 = (byte) (b9 + 1);
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    j(b9, b10, b10, objArr14);
                                    obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                            }
                            if (i != ((int[]) objArr2[1])[0]) {
                                writeReplace = (valueOf + 13) % 128;
                                return objArr2;
                            }
                            try {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                i("謍謢檏㓺亘딶\uf2ed꽗\uf33a\ue28f站❮筓窩\ue2c8뽛\ue321\uf2d1檮㜙權ળ튀伶팔苧婵쟒寺ᩃ쉧忡쏗鈦䩉ퟢ䮹⩣㈠澖뎴ꉇ먙\ue7ae", android.view.View.MeasureSpec.getSize(0), objArr15);
                                file2 = new java.io.File(((java.lang.String) objArr15[0]).intern());
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file2.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file2);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    i("ኳዝቯ䰆䨮Ǳ\uf652", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, objArr16);
                                    if (!str.equals(((java.lang.String) objArr16[0]).intern())) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        i("㼵㼚\ueaf6뒀֒뼞맬ꕣ䝎抱㇅ⵍ콶滋꧅딹圏犠↣㴨\udf7a誀馊䔞本ʝᅳ췋\uefc0驸襯嗞矱ቋł", android.view.View.resolveSizeAndState(0, 0, 0), objArr17);
                                        file = new java.io.File(((java.lang.String) objArr17[0]).intern());
                                        if (!file.canRead()) {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                i("廐廡⼥壊\uec83", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr18);
                                                if (readLine.equals(((java.lang.String) objArr18[0]).intern())) {
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    i("詄詫観ퟆ\ue299㗅廬⾤\uf273Ƴ훘ꞝ稚馕仉㾨\ue268ᇭ욯럪橃\ue98f纁쿅퉝懛\uf674䜡媳勵湱\udf15슍焋\ue644圑䫣쥟鸺\uef79", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, objArr19);
                                                    java.io.File file3 = new java.io.File(((java.lang.String) objArr19[0]).intern());
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                            i("廐廡⼥壊\uec83", android.graphics.Color.alpha(0), objArr20);
                                                            boolean equals = readLine2.equals(((java.lang.String) objArr20[0]).intern());
                                                            int i8 = (writeReplace + 61) % 128;
                                                            valueOf = i8;
                                                            if (equals) {
                                                                writeReplace = (i8 + 125) % 128;
                                                                if (str != null) {
                                                                    java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i ^ 20}, str, new int[1]};
                                                                    java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((~((-33652169) | i)) * 623) + 376269584 + ((i7 | 970228240) * (-623)) + (((~(i | 970752528)) | (~((-34176457) | i)) | 33652168) * 623))};
                                                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj7 == null) {
                                                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, android.view.Gravity.getAbsoluteGravity(0, 0) + 2713, (char) (android.os.Process.myTid() >> 22));
                                                                        byte b11 = (byte) (-$$d[14]);
                                                                        byte b12 = (byte) (b11 + 1);
                                                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                        j(b11, b12, b12, objArr23);
                                                                        obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                    }
                                                                    ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                                    return objArr21;
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    } else {
                                                        writeReplace = (valueOf + 13) % 128;
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-1034359013) | i7)) | (-29430028)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 862170896) + (((~((-25235457) | i7)) | (~((-4194572) | i))) * (-519)) + (((~(i | (-29430028))) | 1034359012) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.graphics.Color.blue(0));
                                            byte b13 = (byte) (-$$d[14]);
                                            byte b14 = (byte) (b13 + 1);
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            j(b13, b14, b14, objArr26);
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
                            }
                            str = null;
                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                            i("㼵㼚\ueaf6뒀֒뼞맬ꕣ䝎抱㇅ⵍ콶滋꧅딹圏犠↣㴨\udf7a誀馊䔞本ʝᅳ췋\uefc0驸襯嗞矱ቋł", android.view.View.resolveSizeAndState(0, 0, 0), objArr172);
                            file = new java.io.File(((java.lang.String) objArr172[0]).intern());
                            if (!file.canRead()) {
                            }
                            java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-1034359013) | i7)) | (-29430028)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 862170896) + (((~((-25235457) | i7)) | (~((-4194572) | i))) * (-519)) + (((~(i | (-29430028))) | 1034359012) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
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
                    i3++;
                    j = 0;
                }
                java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(709850215 | i)) | 295078769) * 56) + 982903512 + (((~(295078769 | (~i))) | 709850215) * 56))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2713 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    byte b15 = (byte) (-$$d[14]);
                    byte b16 = (byte) (b15 + 1);
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    j(b15, b16, b16, objArr28);
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
        $$d = new byte[]{6, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
    }
}
